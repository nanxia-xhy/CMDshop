import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入用户名：");
        Scanner sc=new Scanner(System.in);
        String username=sc.next();

        System.out.println("请输入密码：");
        String password=sc.next();
        File file=new File("C:\\Users\\lenovo\\IdeaProjects\\CMDshop\\src\\users.xlsx");
        ReadExcel readExcel=new ReadExcel();
        User users[]=readExcel.readExcel(file);
        System.out.println(users.length);
        for(User user:users){
            if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
                System.out.println("登录成功");
            }

        }


    }
}
