import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Visitor extends CMMBaseVisitor<Data>{
	 
	/** "memory" for our interpreter; variable/value pairs go here */
	public Stack <Map> mem = new Stack();
	public Map<String, Data> SymbolTable = new HashMap<String, Data>();
	
	public Visitor(){
		mem.push(SymbolTable);
	}
	
	 /**visit "vardecl = type varlist';'"  */
    
    public Data visitVar_decl(CMMParser.Var_declContext ctx){
    	String vartype = ctx.type().getText();
    	String varlist = ctx.varlist().getText();
    	String[] varid = varlist.split(",");
    	//int tag;    //指示声明的变量的类型，0为int，1为real，3为int数组，4为real数组
    	//取出符号表
    	Map<String,Data> symboltable = mem.pop();
    	
    	//放入变量到符号表前判断是否有重名变量
    	boolean hassame = false;
    	for(int i = 0;i < varid.length;i++){
			//对取出的符号表遍历
			Iterator iter = symboltable.entrySet().iterator();
			while (iter.hasNext()){ 
			    Map.Entry entry = (Map.Entry) iter.next(); 
			    String key = entry.getKey().toString(); 
			    if(key.equals(varid[i])){ //有相同变量名
	    			hassame = true;
			    	break;
			    }
			}
			if(hassame){
				int linenum = ctx.start.getLine();
    			try {
					throw new Exception("第"+linenum+"行：变量名声明重复");
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
    	   
    	//确定无重复命名的变量
    	//将变量存储到内存中
    	if(vartype.equals("int")){
    		for(int i = 0;i < varid.length;i++){
    			Data init = new Data(0);
    			symboltable.put(varid[i], init);
    		}
    	}else if(vartype.equals("real")){
    		for(int i = 0;i < varid.length;i++){
    			Data init = new Data(0.0);
    			symboltable.put(varid[i], init);
    		}
    	}else if(vartype.matches("int\\[[0-9]+\\]")){
    		String arr_length = vartype.substring(vartype.indexOf("[")+1, vartype.indexOf("]"));
    		int lengthOfArr = Integer.parseInt(arr_length);
    		for(int i = 0;i < varid.length;i++){
    			Data init = new Data(lengthOfArr,true);
    			symboltable.put(varid[i], init);
    		}
    	}
    	else if(vartype.matches("real\\[[0-9]+\\]")){
    		String arr_length = vartype.substring(vartype.indexOf("[")+1, vartype.indexOf("]"));
    		int lengthOfArr = Integer.parseInt(arr_length);
    		for(int i = 0;i < varid.length;i++){
    			Data init = new Data(lengthOfArr,false);
    			symboltable.put(varid[i], init);
    		}
    	}
    	mem.push(symboltable);
    	return null;
    }
    
    public Data visitStmt_block(CMMParser.Stmt_blockContext ctx){
    	if(ctx.getStart().getText().equals("{")){
    		Map<String, Data> cachTable = new HashMap<String, Data>();
    		mem.push(cachTable);
    	}
    	for(int i = 0; i < ctx.stmt().size(); i++){
    		visit(ctx.stmt(i));
    	}
    	if(ctx.getStop().getText().equals("}")){
    		mem.pop();
    	}
    	return null;
    }
    
    public Data visitIf_stmt(CMMParser.If_stmtContext ctx){
    	Data ifvalue = visit(ctx.expr());
    	if(ifvalue.is_booleanValue()){
    		if(ifvalue.getbooleanValue()){
    			visit(ctx.stmtblock(0));
    		}else{
    			visit(ctx.stmtblock(1));
    		}
    	}else{
    		System.out.println("if条件判断返回类型出现问题");
    	}
    	return null;
    }
    
    public Data visitWhile_stmt(CMMParser.While_stmtContext ctx){
    	Data whilevalue = visit(ctx.expr());
    	if(whilevalue.is_booleanValue()){
    		for(int i = 0; whilevalue.getbooleanValue() ;i++){
    			visit(ctx.stmtblock());
    			whilevalue = visit(ctx.expr());
    		}
    	}else{
    		System.out.println("while条件判断返回类型出现问题");
    	}
    	return null;
    }
   
    /*public Data visitBreak_stmt(CMMParser.Break_stmtContext ctx){
    	
    	return;
    }*/
    
    public Data visitRead_stmt(CMMParser.Read_stmtContext ctx){
    	int linenum = ctx.start.getLine();
    	Scanner input = new Scanner(System.in);
    	boolean isArr;
    	int indexOfArr = 0;//数组大小为0表示不是数组类型
    	String var = ctx.var().getText();
    	String varid; //变量id
    	if(var.contains("[")){
    		isArr = true;
    		varid = var.substring(0, var.indexOf("["));
    		String arr_length = var.substring(var.indexOf("[")+1, var.indexOf("]"));
    		if(arr_length.equals("")){
    			indexOfArr = 0;
    		}else{
    			indexOfArr = Integer.parseInt(arr_length);
    		}
    	}else{
    		isArr = false;
    		varid = var;
    	}
    	//先到符号表里查找有无该符号
    	//缓存栈，存储弹出的元素
    	Stack <Map> cach = new Stack();
    	boolean hassame = false;
    	for(int j = 0;j < mem.size();j++){
    		Map<String,Data> symboltable = mem.pop();
    		if(symboltable.containsKey(varid)){
    			hassame = true;
    			Data res = symboltable.get(varid);
    			if(res.is_intValue()){     //int型数据
    				int Ivalue = input.nextInt();
    				res = new Data(Ivalue);
    				symboltable.put(varid, res);
    			}else if(res.is_doubleValue()){    //double型数据
    				double Dvalue = input.nextDouble();
    				res = new Data(Dvalue);
    				symboltable.put(varid, res);
    			}else if(res.type_tag == 3){      //int数组
    				int Ivalue = input.nextInt();
    				if(res.outOfIntArr(indexOfArr)){
    					System.out.println("第"+linenum+"行:数组下标越界");
    				}else{
    					res.setIntArrVal(indexOfArr, Ivalue);
    				}
    			}else if(res.type_tag == 4){      //double型数组
    				double Dvalue = input.nextDouble();
    				if(res.outOfDoubleArr(indexOfArr)){
    					System.out.println("第"+linenum+"行:数组下标越界");
    				}else{
    					res.setDoubleArrVal(indexOfArr, Dvalue);
    				}
    			}else{
    				System.out.println("第"+linenum+"行：无法赋值的数据类型");
    			}
    		}
    		cach.push(symboltable);
    	}
    	for(int i = 0;i<cach.size();i++){
    		Map<String,Data> symbol_table = cach.pop();
    		mem.push(symbol_table);
    	}
    	if(!hassame){
    		//没取到值的返回先用null代替
    		System.out.println("Line"+linenum+":a variable has not found");
    		return null;
    	}
    	
    	return null;
    }
    
    public Data visitWrite_stmt(CMMParser.Write_stmtContext ctx){
    	Data ex = visit(ctx.expr());
    	System.out.println(ex.write());
    	return null;
    }
    
    public Data visitAssign_stmt(CMMParser.Assign_stmtContext ctx){
    	int linenum = ctx.start.getLine();
    	boolean isArr;
    	Data ex = visit(ctx.expr());
    	int indexOfArr = 0;//数组大小为0表示不是数组类型
    	String var = ctx.var().getText();
    	String varid; 
    	if(var.contains("[")){
    		isArr = true;
    		varid = var.substring(0, var.indexOf("["));
    		String arr_length = var.substring(var.indexOf("[")+1, var.indexOf("]"));
    		indexOfArr = Integer.parseInt(arr_length);
    	}else{
    		isArr = false;
    		varid = var;
    	}
    	//先到符号表里查找有无该符号
    	//缓存栈，存储弹出的元素
    	Stack <Map> cach = new Stack();
    	boolean hassame = false;
    	for(int j = 0;j < mem.size();j++){
    		Map<String,Data> symboltable = mem.pop();
    		if(symboltable.containsKey(varid)){
    			hassame = true;
    			Data dt = symboltable.get(varid);
    			if((dt.is_intValue()&&ex.is_intValue())||(dt.is_doubleValue()&&ex.is_doubleValue())){
    				symboltable.put(varid,ex);
    			}else if(dt.is_intValue()&&ex.is_doubleValue()){
    				System.out.println("第"+linenum+"行：real型变量不能强制转换为int");
    			}else if(dt.is_doubleValue()&&ex.is_intValue()){
    				ex.intToDouble();
    				symboltable.put(varid,ex);
    			}else if(dt.type_tag == 3){
    				if(dt.outOfIntArr(indexOfArr)){
    					System.out.println("第"+linenum+"行：int数组越界");
    				}else{
    					dt.setIntArrVal(indexOfArr, ex.getIntValue());
    					symboltable.put(varid,dt);
    				}
    			}else if(dt.type_tag == 4){
    				if(dt.outOfDoubleArr(indexOfArr)){
    					System.out.println("第"+linenum+"行：double数组越界");
    				}else{
    					dt.setDoubleArrVal(indexOfArr, ex.getDoubleValue());
    					symboltable.put(varid,dt);
    				}
    			}
    		}
    		cach.push(symboltable);
    	}
    	//将cach中的符号表放回
    	for(int i = 0;i<cach.size();i++){
    		Map<String,Data> symbol_table = cach.pop();
    		mem.push(symbol_table);
    	}
    	return null;
    }
    

    
    /** 加法*/
    public Data visitAddsub(CMMParser.AddsubContext ctx){
    	Data ex1 = visit(ctx.expr(0));
    	Data ex2 = visit(ctx.expr(1));
    	boolean isadd;
    	Data result;
    	if ( ctx.op.getType() == CMMParser.ADD ){
    		isadd = true;
    	}else{
    		isadd = false;
    	}
    	if(ex1.is_intValue() && ex2.is_intValue()){
    		int res;
    		if(isadd){
    			res = ex1.getIntValue() + ex2.getIntValue();
    		}else{
    			res = ex1.getIntValue() - ex2.getIntValue();
    		}
    		result = new Data(res);
    	}
    	else if(ex1.is_intValue() && ex2.is_doubleValue()){
    		double res;
    		if(isadd){
    			res = ex1.getIntValue() + ex2.getDoubleValue();
    		}else{
    			res = ex1.getIntValue() - ex2.getDoubleValue();
    		}
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_intValue()){
    		double res;
    		if(isadd){
    			res = ex1.getDoubleValue() + ex2.getIntValue();
    		}else{
    			res = ex1.getDoubleValue() - ex2.getIntValue();
    		}
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_doubleValue()){
    		double res;
    		if(isadd){
    			res = ex1.getDoubleValue() + ex2.getDoubleValue();
    		}else{
    			res = ex1.getDoubleValue() - ex2.getDoubleValue();
    		}
    		result = new Data(res);
    	}
    	else{
    		int lineNum = ctx.getTokens(0).get(0).getSymbol().getLine();
    		try {
				throw new Exception("第" + lineNum + "行：包含无法运算的数据类型");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		result = new Data("包含无法运算的数据类型");
    	}
    	return result;
    	
    }
      
    public Data visitConst(CMMParser.ConstContext ctx){
    	String constant = ctx.constant().getText();
    	Data res;
    	if(constant.contains(".")){
    		double a = Double.parseDouble(constant);
    		res = new Data(a);
    		res.type_tag = 1;
    	}else{
    		int a = Integer.parseInt(constant);
    		res = new Data(a);
    		res.type_tag = 0;
    	}
    	return res;
    }
    
    public Data visitLess_or_greater(CMMParser.Less_or_greaterContext ctx){
    	Data ex1 = visit(ctx.expr(0));
    	Data ex2 = visit(ctx.expr(1));
    	Data result;
    	if(ex1.is_intValue() && ex2.is_intValue()){
    		boolean res = ex1.getIntValue() !=  ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_intValue() && ex2.is_doubleValue()){
    		boolean res = ex1.getIntValue() != ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_intValue()){
    		boolean res = ex1.getDoubleValue() != ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_doubleValue()){
    		boolean res = ex1.getDoubleValue() != ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else{
    		int linenum = ctx.start.getLine();
    		try {
				throw new Exception("第"+linenum+"行包含无法运算的数据类型");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		result = new Data("包含无法运算的数据类型");
    	}
    	return result;
    }
    
    public Data visitLess(CMMParser.LessContext ctx){
    	Data ex1 = visit(ctx.expr(0));
    	Data ex2 = visit(ctx.expr(1));
    	Data result;
    	if(ex1.is_intValue() && ex2.is_intValue()){
    		boolean res = ex1.getIntValue() <  ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_intValue() && ex2.is_doubleValue()){
    		boolean res = ex1.getIntValue() < ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_intValue()){
    		boolean res = ex1.getDoubleValue() < ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_doubleValue()){
    		boolean res = ex1.getDoubleValue() < ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else{
    		int linenum = ctx.start.getLine();
    		try {
				throw new Exception("第"+linenum+"行包含无法运算的数据类型");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		result = new Data("包含无法运算的数据类型");
    	}
    	return result;
    }
    
    public Data visitGreater(CMMParser.GreaterContext ctx){
    	Data ex1 = visit(ctx.expr(0));
    	Data ex2 = visit(ctx.expr(1));
    	Data result;
    	if(ex1.is_intValue() && ex2.is_intValue()){
    		boolean res = ex1.getIntValue() >  ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_intValue() && ex2.is_doubleValue()){
    		boolean res = ex1.getIntValue() > ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_intValue()){
    		boolean res = ex1.getDoubleValue() > ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_doubleValue()){
    		boolean res = ex1.getDoubleValue() > ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else{
    		int linenum = ctx.start.getLine();
    		try {
				throw new Exception("第"+linenum+"行包含无法运算的数据类型");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		result = new Data("包含无法运算的数据类型");
    	}
    	return result;
    }
    
    public Data visitDivmulmod(CMMParser.DivmulmodContext ctx){
    	Data ex1 = visit(ctx.expr(0));
    	Data ex2 = visit(ctx.expr(1));
    	Data result;
    	int op;
    	if ( ctx.op.getType() == CMMParser.DIV ){
    		op = 1;
    	}else if(ctx.op.getType() == CMMParser.MUL){
    		op = 2;
    	}else{
    		op = 3;
    	}
    	if(ex1.is_intValue() && ex2.is_intValue()){
    		int res;
    		if(op == 1){
    			res = ex1.getIntValue() / ex2.getIntValue();
    		}else if(op == 2){
    			res = ex1.getIntValue() * ex2.getIntValue();
    		}else{
    			res = ex1.getIntValue() % ex2.getIntValue();
    		}
    		result = new Data(res);
    	}
    	else if(ex1.is_intValue() && ex2.is_doubleValue()){
    		double res;
    		if(op == 1){
    			res = ex1.getIntValue() / ex2.getDoubleValue();
    		}else if(op == 2){
    			res = ex1.getIntValue() * ex2.getDoubleValue();
    		}else{
    			res = ex1.getIntValue() % ex2.getDoubleValue();
    		}
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_intValue()){
    		double res;
    		if(op == 1){
    			res = ex1.getDoubleValue() / ex2.getIntValue();
    		}else if(op == 2){
    			res = ex1.getDoubleValue() * ex2.getIntValue();
    		}else{
    			res = ex1.getDoubleValue() % ex2.getIntValue();
    		}
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_doubleValue()){
    		double res;
    		if(op == 1){
    			res = ex1.getDoubleValue() / ex2.getDoubleValue();
    		}else if(op == 2){
    			res = ex1.getDoubleValue() / ex2.getDoubleValue();
    		}else{
    			res = ex1.getDoubleValue() / ex2.getDoubleValue();
    		}
    		result = new Data(res);
    	}
    	else{
    		try {
				throw new Exception("包含无法运算的数据类型");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		result = new Data("包含无法运算的数据类型");
    	}
    	return result;
    }
    
    public Data visitEqual(CMMParser.EqualContext ctx){
    	Data ex1 = visit(ctx.expr(0));
    	Data ex2 = visit(ctx.expr(1));
    	Data result;
    	if(ex1.is_intValue() && ex2.is_intValue()){
    		boolean res = ex1.getIntValue() ==  ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_intValue() && ex2.is_doubleValue()){
    		boolean res = ex1.getIntValue() == ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue() && ex2.is_intValue()){
    		boolean res = ex1.getDoubleValue() == ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue() && ex2.is_doubleValue()){
    		boolean res = ex1.getDoubleValue() == ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_booleanValue() && ex2.is_booleanValue()){
    		boolean res = ex1.getbooleanValue() == ex2.getbooleanValue();
    		result = new Data(res);
    	}
    	else{
    		try {
				throw new Exception("包含无法运算的数据类型");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		result = new Data("包含无法运算的数据类型");
    	}
    	return result;
    }
    
    public Data visitGreater_or_equal(CMMParser.Greater_or_equalContext ctx){
    	Data ex1 = visit(ctx.expr(0));
    	Data ex2 = visit(ctx.expr(1));
    	Data result;
    	if(ex1.is_intValue() && ex2.is_intValue()){
    		boolean res = ex1.getIntValue() >=  ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_intValue() && ex2.is_doubleValue()){
    		boolean res = ex1.getIntValue() >= ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_intValue()){
    		boolean res = ex1.getDoubleValue() >= ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_doubleValue()){
    		boolean res = ex1.getDoubleValue() >= ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else{
    		try {
				throw new Exception("包含无法运算的数据类型");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		result = new Data("包含无法运算的数据类型");
    	}
    	return result;
    }
       
    public Data visitNot_equal(CMMParser.Not_equalContext ctx){
    	Data ex1 = visit(ctx.expr(0));
    	Data ex2 = visit(ctx.expr(1));
    	Data result;
    	if(ex1.is_intValue() && ex2.is_intValue()){
    		boolean res = ex1.getIntValue() !=  ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_intValue() && ex2.is_doubleValue()){
    		boolean res = ex1.getIntValue() != ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue() && ex2.is_intValue()){
    		boolean res = ex1.getDoubleValue() != ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue() && ex2.is_doubleValue()){
    		boolean res = ex1.getDoubleValue() != ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_booleanValue() && ex2.is_booleanValue()){
    		boolean res = ex1.getbooleanValue() != ex2.getbooleanValue();
    		result = new Data(res);
    	}
    	else{
    		try {
				throw new Exception("包含无法运算的数据类型");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		result = new Data("包含无法运算的数据类型");
    	}
    	return result;
    }

    public Data visitVariable(CMMParser.VariableContext ctx){
    	int linenum = ctx.start.getLine();
    	boolean isArr;
    	Data res = new Data("");
    	int indexOfArr = 0;//数组大小为0表示不是数组类型
    	String var = ctx.var().getText();
    	String varid; 
    	if(var.contains("[")){
    		isArr = true;
    		varid = var.substring(0, var.indexOf("["));
    		String arr_length = var.substring(var.indexOf("[")+1, var.indexOf("]"));
    		indexOfArr = Integer.parseInt(arr_length);
    	}else{
    		isArr = false;
    		varid = var;
    	}
    	//先到符号表里查找有无该符号
    	//缓存栈，存储弹出的元素
    	Stack <Map> cach = new Stack();
    	boolean hassame = false;
    	for(int j = 0;j < mem.size();j++){
    		Map<String,Data> symboltable = mem.pop();
    		if(symboltable.containsKey(varid)){
    			res = symboltable.get(varid);
    			hassame = true;
    			cach.push(symboltable);
    			break;
    		}
    		cach.push(symboltable);
    	}
    	for(int i = 0;i<cach.size();i++){
    		Map<String,Data> symbol_table = cach.pop();
    		mem.push(symbol_table);
    	}
    	if(hassame){
    		if(res.is_intValue()||res.is_doubleValue()){
    			return res;
    		}else if(res.type_tag == 3){
    			if(res.outOfIntArr(indexOfArr)){
    				System.out.println("第"+linenum+"行：int数组越界");
    				return null;
    			}else{
    				Data dt = new Data(res.getIntArrVal(indexOfArr));
    				return dt;
    			}
    		}else if(res.type_tag == 4){
    			if(res.outOfDoubleArr(indexOfArr)){
    				System.out.println("第"+linenum+"行：double数组越界");
    				return null;
    			}else{
    				double doublevar = res.getDoubleArrVal(indexOfArr);
    				Data dt = new Data(doublevar);
    				return dt;
    			}
    		}else{
    			return res;
    		}
    	}else{
    		//没取到值的返回先用null代替
    		System.out.println("Line"+linenum+":a variable has not found");
    		return null;
    	}
    }
    
    public Data visitLess_or_equal(CMMParser.Less_or_equalContext ctx){
    	Data ex1 = visit(ctx.expr(0));
    	Data ex2 = visit(ctx.expr(1));
    	Data result;
    	if(ex1.is_intValue() && ex2.is_intValue()){
    		boolean res = ex1.getIntValue() <=  ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_intValue() && ex2.is_doubleValue()){
    		boolean res = ex1.getIntValue() <= ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_intValue()){
    		boolean res = ex1.getDoubleValue() <= ex2.getIntValue();
    		result = new Data(res);
    	}
    	else if(ex1.is_doubleValue()&& ex2.is_doubleValue()){
    		boolean res = ex1.getDoubleValue() <= ex2.getDoubleValue();
    		result = new Data(res);
    	}
    	else{
    		try {
				throw new Exception("包含无法运算的数据类型");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		
    		result = new Data("包含无法运算的数据类型");
    	}
    	return result;
    }
       
    public Data visitFlip(CMMParser.FlipContext ctx){
    	Data ex = visit(ctx.expr());
    	Data result;
    	if(ex.is_intValue()){
    		result = new Data(-ex.getIntValue());
    	}
    	else if(ex.is_doubleValue()){
    		result = new Data(-ex.getDoubleValue());
    	}
    	else{
    		try {
				throw new Exception("包含无法运算的数据类型");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		result = new Data("包含无法运算的数据类型");
    	}
    	return result;
    }

	public Data visitBrackets(CMMParser.BracketsContext ctx){
    	return visit(ctx.expr());
    }
}
