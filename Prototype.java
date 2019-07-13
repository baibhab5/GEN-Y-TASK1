import java.util.*;
public class Prototype
{
    public static void main()
    {
        String s,s1,s2,s3,s4,s5,s6;
        Scanner in = new Scanner(System.in);
       System.out.println("----------------------------------------CHOOSE YOUR OPTION----------------------------------------------------");
        System.out.println("                                         Press 1 to Create Account");
        System.out.println("                                         Press 2 to Sign in");
        int ch=in.nextInt();
        
        switch(ch)
        {
            
            case 1:
            
            System.out.print("                                         Enter Name  : ");
            s4=in.next();
            System.out.print("                                        Enter Password  :");
            s5=in.next();
            System.out.print("                                        Confirm Password  :");
            s6=in.next();
            if(s5.equals(s6))
            System.out.print("                                        Account Created");
            else
            System.out.print("                                     Error! Please try again later...");
        break;
            case 2:
            
        System.out.print("                                                        Username:   ");
        s= in.next();
        System.out.print("                                                        password:   ");
        s1=in.next();
        if(s.equals("username") && s1.equals("password"))
        {
        System.out.println("                                                  Login Successful");
        System.out.println("--------------------------------------------------WELCOME USER!!------------------------------------------------------------------------");
    }
        else
                System.out.println("                                      Wrong password or username");
            break;
       
            default:
            System.out.println("                                              Something's wrong");
        }
  
    }
}
