import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0 {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter a number");
        // try {
        //     int num=System.in.read();
        //     System.out.println(num);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // BufferedReader
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader bf=new BufferedReader(in);
        // int num= Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close(); //close the resources

        // Scanner
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // System.out.println(num);
            int i=0,j=0;
            // BufferedReader br=null;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            // j=15/0;
            // InputStreamReader in=new InputStreamReader(System.in);
            // br=new BufferedReader(in);
            int num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }catch(Exception e){
            System.out.println("Something went wrong.");
        }
        finally{
            // it is used when closing the resource
            System.out.println("All done,Bye");
            // br.close();
        }
        
    }
}
