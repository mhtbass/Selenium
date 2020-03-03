package com.saha.test.Education.util;

import java.io.InputStream;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class DbutilTests {
	
	
	@Test
	public void test1() throws ClassNotFoundException, SQLException{
		
		//değerlei null vererek nullaya biliyormussun
		DBUtil dbUtil = new DBUtil();
		ResultSet x  = dbUtil.executeQuery("select * from user");
		while(x.next()){
			System.out.println(x.getString(2));
			System.out.println(x.getString(3));
		}
	}
	
	@Test
	public void test2() throws ClassNotFoundException, SQLException{
		DBUtil dbUtil = new DBUtil();
		int x  = dbUtil.executeUpdate("insert into tbl1 values('ziya',null)");
		System.out.println(x);
	}
	
	@Test
	public void test3() throws ClassNotFoundException, SQLException{
		DBUtil dbUtil = new DBUtil();
		int x  = dbUtil.executeUpdate("update tbl1  set one='suat',two=77 where one='ziya'");
		System.out.println(x);
	}
	
	@Test
	public void test4() throws ClassNotFoundException, SQLException{
		DBUtil dbUtil = new DBUtil();
		ResultSet x  = dbUtil.executeQuery("select last_insert_rowid();");
	}
	
	public static String getSMSToken(String number, int size) {
		String password = null;
		String smsContent= null;
		try {
		InputStream in = new URL("http://dev.testinium.com:10256/code?phone="+number).openStream();
		try {
		 smsContent = IOUtils.toString(in);
		Pattern r = Pattern.compile("([0-9]){"+size+"}");
		    Matcher m = r.matcher(smsContent);
		    if (m.find( )) {
		        password = m.group(0).trim();
		System.out.println("sms pass : " + password );
		    }
		} finally {
		IOUtils.closeQuietly(in);
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		return password;
		}
	

	
//	public static void main(String[] args) {
//		System.out.println(getSMSToken("5303871532", 6));
//	}
	
	
	
	
	
	
	
	
}
