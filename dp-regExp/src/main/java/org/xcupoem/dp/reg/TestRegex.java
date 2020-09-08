package org.xcupoem.dp.reg;

import static java.lang.System.out;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class TestRegex {

	@Test
	public void matchTelephone() {
		String str = "abc/def";
		Pattern pattern = Pattern.compile("/");

		String[] split = pattern.split(str);
		System.out.println(Arrays.toString(split));
	}

	@Test
	public void matchMobilephone() {
		String str = "abc/def";
		Pattern pattern = Pattern.compile("/");

		String[] split = pattern.split(str);
		System.out.println(Arrays.toString(split));
	}

	/**
	 * <pre>
	 * <b>字符</b>
	 * x	匹配字符x
	 * \\	匹配反斜杠
	 * \0n	带有八进制值 0 的字符 n (0 <= n <= 7)
	 * \0nn	带有八进制值 0 的字符 nn (0 <= n <= 7)
	 * \0mnn带有八进制值 0 的字符 mnn（0 <= m <= 3、0 <= n <= 7）
	 * \xhh	带有十六进制值 0x 的字符 hh
	 * \\uhhhh 带有十六进制值 0x 的字符 hhhh (去掉第一个反斜杠)
	 * \t	制表符 ('\u0009')
	 * \n	新行（换行）符 ('\u000A')
	 * \r	回车符 ('\u000D')
	 * \f	换页符 ('\u000C')
	 * \a	报警 (bell) 符 ('\u0007')
	 * \e	转义符 ('\u001B')
	 * \cx	对应于 x 的控制符
	 * </pre>
	 */
	@Test
	public void test() {
		String str = "abc def	gh";
		Pattern pattern = Pattern.compile("\\s");
		String[] split = pattern.split(str);
		System.out.println(Arrays.toString(split));
	}

	/**
	 * <pre>
	 * <b>字符类</b>
	 * 
	 * </pre>
	 */
	@Test
	public void characterClass() {
		/*
		 * 805971596@qq.com Ljw805971596@csii.com.cn
		 */
		String str = "12345678h";
		String email = "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[\\w-]{2,4}$"; // 邮箱
		String mobile = "^1\\d{10}$"; // 手机
		String password = "^[0-9]{6}$"; // 6位数字密码
		String password2 = "^(?!\\d+$)(?![a-zA-Z]+$)[\\w&&[^_]]{8,}$"; // 8位以上密码，必须是字母数字的混合

		Pattern p = Pattern.compile(password2);
		Matcher m = p.matcher(str);
		out.println(m.matches());

		out.println((char) 0X2B);
	}

	Map map;

	@Test
	public void getTime() {
		long timeMillis = System.currentTimeMillis();
		int compareTo = "13:59:59".compareTo("14:00:00");
		System.out.println(new SimpleDateFormat("HH:MM:ss").format(timeMillis) + "_" + compareTo);

		System.out.println(1 > 2);

		if (map instanceof Map) {
			map.get("");
		}
	}

	@Test
	public void getBin() {
		File file = new File("C:\\Users\\MrLi\\Desktop\\Webstorm常用快捷键 - Quincylk的专栏 - CSDN博客.pdf");
		byte[] by = new byte[(int) file.length()];
		try {
			InputStream is = new FileInputStream(file);
			ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
			byte[] bb = new byte[2048];
			int ch;
			ch = is.read(bb);
			while (ch != -1) {
				bytestream.write(bb, 0, ch);
				ch = is.read(bb);
			}
			by = bytestream.toByteArray();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

}
