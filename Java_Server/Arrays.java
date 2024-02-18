class Student {
    int rollno;
    String name;
    int marks;

}

public class Arrays {
    public static void main(String[] args) {
        // ONE-DIMENSIONAL ARRAY

        // int nums[]={3,7,2,4};
        int nums[] = new int[2];
        nums[1] = 6;
        // System.out.println(nums[0]);

        // 2-D ARRAY
        int num[][] = new int[3][4];

        // JAGGED ARRAY
        int num1[][] = new int[3][];

        num1[0] = new int[3];
        num1[1] = new int[4];
        num1[2] = new int[7];

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                num1[i][j] = (int) (Math.random() * 100);
                // System.out.print(num1[i][j] + " ");
            }
            // System.out.println();
        }

        // Object Array
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Sujal";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Shreeti";
        s2.marks = 98;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Akshat";
        s3.marks = 90;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].rollno+" "+students[i].name+" "+students[i].marks);
        // }

        for(Student s:students){
            System.out.println(s.name);
        }

        // Enhanced for loop
        for(int n:nums){
            System.out.println(n);
        }

    }
}
