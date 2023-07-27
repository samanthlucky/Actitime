package Demohandlingproperty;
import java.util.ArrayList;
import java.util.HashMap;
public class Handlings {
public static void main(String[] args) {
	 ArrayList<String> al = new ArrayList<>();
	 al.add("https://demo.actitime.com/login.do");
	 al.add("admin");
	 al.add("admin@atitime.com");
	 al.add("manager");
	 System.out.println(al.get(2));
	 HashMap<String,String> hm = new HashMap<>();
	 hm.put("url", "https://demo.actitime.com/login.do");
	 hm.put("username", "admin");
	 hm.put("email", "admin@atitime.com");
	 hm.put("password", "manger");
	 System.out.println(hm.get("password"));
}

}
