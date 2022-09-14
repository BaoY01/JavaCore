package javacore.demo.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ResourceBundleExample {
	public static void main(String[] args) {
//		Locale localeEn = new Locale("en");
//		ResourceBundle labels = ResourceBundle.getBundle("messagas_en", localeEn);
//		System.out.println("Xin chao trong tieng anh: " + labels.getString("hello"));
//		
//		Locale localeVi = new Locale("vi");
//		labels = ResourceBundle.getBundle("messagas_vi", localeVi);
//		System.out.println("Xin chao trong tieng Viet: " + labels.getString("hello"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter language code: ");
		String languageCode = sc.next();
		
		System.out.println("Enter country code: ");
		String countryCode = sc.next();
		
		sc.close();
		
		if(countryCode.equals("us") && languageCode.equals("en")) {
			ResourceBundle bundle = ResourceBundle.getBundle("javacore.demo.resourcebundle.messagas", Locale.US);
			System.out.println("Message in " + Locale.US + " = " + bundle.getString("hello"));
		}else if(countryCode.equals("vn") && languageCode.equals("vi")) {
			ResourceBundle bundle = ResourceBundle.getBundle("javacore.demo.resourcebundle.messagas", Locale.US);
			Locale.setDefault(new Locale("vi", "vn"));
			
			bundle = ResourceBundle.getBundle("javacore.demo.resourcebundle.messagas");
			System.out.println("Message in " + Locale.getDefault() + " = " + bundle.getString("hello"));
		}else {
			System.out.println("Phease enter country and language!");
		}
	}
}
