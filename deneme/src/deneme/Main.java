package deneme;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	int day,month;
	
	Scanner index = new Scanner(System.in);
	
	System.out.println("lutfen dogdugunuz ayi giriniz : ");
	month = index.nextInt();	
	
	System.out.println("lutfen dogdunuz gunu giriniz : ");
	day = index.nextInt();
	
	switch (month) {
		case 1: 
			if(day<21) {
			System.out.println("oglak burcu");
			}else {
				System.out.print("kova burcu");
			}
			break;
			
		case 2:
			if(day<22) {
			System.out.println("kova burcusunuz ");
			}else {
				System.out.println("balik burcusunuz ");
			}
			break;
		case 3: 
			if(day<21) {
				System.out.print("balik burcusunuz ");
			}else {
				System.out.print("koc burcusunuz ");
			}
			break;
		case 4:
			if(day<22) {
				System.out.println("koc burcusunuz ");
			}else {
				System.out.println("boga burcusunuz");
			}
			break;
		case 5:
			if(day<21) {
				System.out.println("boga burcusunuz ");
			}else {
				System.out.println("ikizler burcusunuz");
			}
			break;
		case 6:
			if(day < 21) {
				System.out.println("ikizler burcusunuz");
			}else {
				System.out.println("yengec burcusunuz ");
			}
		case 7: 
			if(day<21) {
				System.out.println("yengec burcusunuz");
			}else {
				System.out.println("aslan burcusunuz ");
			}
		case 8:
			if(day<23) {
				System.out.println("aslan burcusunuz ");
			}else {
				System.out.println("basak burcusunuz ");
			}
			break;
		case 9:
			if(day<20) {
				System.out.println("basak burcusunuz ");
			}else {
				System.out.println("terazi burcusunuz ");
			}
			break;
		case 10:
			if(day<21) {
				System.out.println("terazi burcusunuz ");
			}else {
				System.out.println("akrep burcusunuz ");
			} 
			break;
		case 11: 
			if(day<20) {
				System.out.println("akrep burcusunuz ");
			}else {
				System.out.println("yay burcusunuz ");
			}
			break;
		case 12:
			if(day< 20){
				System.out.println("yay burcusunuz ");
			}else {
				System.out.println("oglak burcusunuz ");
			}
			break;
			
		default:
			System.out.print("gecersiz ifade");
				
	}
}
}
			
			
	
	

	
	
	


