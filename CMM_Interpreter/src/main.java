import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		InputStream is = args.length > 0 ? new FileInputStream(args[0]) : System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        CMMLexer lexer = new CMMLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CMMParser parser = new CMMParser(tokens);
        ParseTree tree = parser.prog();
        
        // ��ʼ�����﷨������
        
        System.out.println(tree.toStringTree(parser));
        Visitor test = new Visitor();
        test.visit(tree);
	}

}
