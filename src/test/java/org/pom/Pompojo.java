package org.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Pompojo {

	public static void main(String[] args) throws IOException {
		String url ="http://automationpractice.com/index.php?controller=authentication&back=my-account";
		LibGenericPOM l =new LibGenericPOM();
		WebDriver d =l.browserlaunch();
		l.launchurl(url);
		
		LoginPOJOPom login =new LoginPOJOPom();
		l.type(login.getTxtUserName(),l.excelRead(1, 0));
		l.type(login.getTxtpassword(),l.excelRead(1, 1));
		l.btnclick(login.getBtnLogin());
		
		l.type(login.getTxtUserName(), "ridhu@gmailcom");
		
		String u=l.getURL();
		System.out.println(u);
		
	}

}
