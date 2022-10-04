import java.util.Scanner;
 
class Phone{
	String name,tel;
	public Phone(String name,String tel) {
		this.name=name;
		this.tel=tel;
	}
}
 
class PhoneBook{
	private Phone array[];
	int num;
	Scanner sc;
	public PhoneBook(int n) {
		array=new Phone[n];
		num=0;
		sc=new Scanner(System.in);
	}
	public void input(String name,String tel) {
		array[num++]=new Phone(name,tel);
	}
	public void find(String name) {
		for(int i=0;i<num;i++) {
			if(array[i].name.equals(name)) {
				System.out.println(name+"의 번호는 "+array[i].tel+" 입니다");
				return;
			}
		}
		System.out.println(name+" 이 없습니다.");
	}
	public void run() {
		String st;
		System.out.print("검색할 이름>>");
		st=sc.next();
		while(!st.equals("그만")) {
			find(st);
			System.out.print("검색할 이름>>");
			st=sc.next();
		}
	}
}
 
public class Practice8 {	
	public static void main(String[] args) {
		PhoneBook pb;
		Scanner s=new Scanner(System.in);
		System.out.print("인원수>>");
		int n=s.nextInt();
		pb=new PhoneBook(n);
		for(int i=0;i<n;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name=s.next();
			String tel=s.next();
			pb.input(name, tel);
		}
		System.out.println("저장되었습니다.....");
		pb.run();
		
	}
}