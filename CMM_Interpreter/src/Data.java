import java.util.ArrayList;
public class Data {
	
	 //指示数据的类型,0为int,1为double,2为bool,3为int数组,4为double数组,5为错误数据
	public int type_tag;
	public int level;
	private int int_value;
	private double double_value;
	private boolean boolean_value;
	private ArrayList<Integer> int_array;
	private ArrayList<Double> double_array;
	public String errorstring;
	
	public Data(int value1){
		int_value = value1;
		type_tag = 0;
	}
	public Data(double value2){
		double_value = value2;
		type_tag = 1;
	}
	public Data(boolean value3){
		boolean_value = value3;
		type_tag = 2;
	}
	public Data(int lengthOfArr,boolean isint){
		if(isint){
			type_tag = 3;
			int_array = new ArrayList();
			for(int i = 0; i<lengthOfArr; i++)
			{
				int_array.add(0);
			}
		}else{
			type_tag = 4;
			double_array = new ArrayList();
			for(int i = 0; i<lengthOfArr; i++)
			{
				double_array.add(0.0);
			}
		}
	}
	public Data(String error){
		errorstring = error;
		type_tag = 5;
	}
	public int getIntValue(){
		return int_value;
	}
	public double getDoubleValue(){
		return double_value;
	}
	public boolean getbooleanValue(){
		return boolean_value;
	}
	
	public boolean is_intValue(){
		if(type_tag == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean is_doubleValue(){
		if(type_tag == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean is_booleanValue(){
		if(type_tag == 2){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String write(){
		if(type_tag == 0){
			return String.valueOf(int_value);
		}else if(type_tag == 1){
			return String.valueOf(double_value);
		}
		else if(type_tag == 2){
			if(boolean_value){
				return "TRUE";
			}else{
				return "FALSE";
			}
		}else{
			return "";
		}
	}
	
	public void setIntArrVal(int index,int value){
		int_array.set(index,value);
	}
	public void setDoubleArrVal(int index,double value){
		double_array.set(index,value);
	}
	public boolean outOfIntArr(int index){
		if(index >= int_array.size()||index < 0){
			return true;
		}else{
			return false;
		}
	}
	public boolean outOfDoubleArr(int index){
		if(index >= double_array.size()||index < 0){
			return true;
		}else{
			return false;
		}
	}
	public int getIntArrVal(int index){
		return int_array.get(index);
	}
	public double getDoubleArrVal(int index){
		return double_array.get(index);
	}
	public void intToDouble(){
		double_value = int_value;
		int_value = 0;
		type_tag = 1;
	}
}
