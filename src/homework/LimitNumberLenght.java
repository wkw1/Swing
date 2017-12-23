package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import org.omg.CORBA.StringHolder;
/**
 * ��������Ŀؼ�
 * �����ı������ֻ����������
 * 
 * @author ��ΰ
 */

public class LimitNumberLenght extends PlainDocument {

	private static final long serialVersionUID = 1L;
	
	/**
	 * @param limit �����������ֵĳ���
	 */
	public LimitNumberLenght(String pat){
		super();
		this.pattern=Pattern.compile(pat);
	}
	
	
	private Pattern pattern;
	private Matcher m;

	@Override
	public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
		if (str == null) {
			return;
		}
		String tmp = getText(0, offset).concat(str);
		m = pattern.matcher(tmp);
		if (m.matches())
			super.insertString(offset, str, attr);
	}
	
	
	
	

}
