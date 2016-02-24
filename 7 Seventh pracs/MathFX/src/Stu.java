import java.util.*;
class Stu
{
	 int prn;
	String name;
	int marks1,marks2,marks3;
 	Scanner s=new Scanner(System.in);

        void input()		
            {
                System.out.println("Enter the Prn :");
                prn= s.nextInt();
                System.out.println("Enter the Name :");
                name= s.nextLine();
                System.out.println("Enter the Marks1:");
                marks1 =s.nextInt();
                System.out.println("Enter the Marks2:");
                 marks2=s.nextInt();
                System.out.println("Enter the Marks3 :");
                marks3=s.nextInt();
            }
        void display()
            {
                System.out.println("PRN	Name 	marks1	marks2	marks3");
                System.out.print("+prn\t+name\t+marks1\t+marks2\t+marks3" );	
	}
        void search()
        {       
            
        }
 };
 class demo
 {
        public static void main(String args[])
            {
            	int i,ch,arr,choice = 0;
                Scanner s2= new Scanner(System.in);
		
                System.out.println("Enter the size of array:");
                arr= s2.nextInt();
                Stu s[]=new Stu[arr];
	

	while(choice<4)
	{
                System.out.println("=====Menu=====");
                System.out.println("1.Insert Student Details" );
                System.out.println("2.Display The list");
                System.out.println("3.Search Student");
                System.out.println("4.Exit");
                ch=s2.nextInt();
	
	switch(ch)
	{
		case 1:	for(i=0;i<arr;i++)
			{
                            s[i]=new Stu();
                            break;
			}
		case 2:  for(i=0;i<arr;i++)	
			{
                            s[i].display();
                            break;   
                        }
                case 3:System.out.println("Enter the Prn to be searched:");
                int  I = s2.nextInt();
                    for(i=0;i<arr;i++)
                        {
                            if (s[i].prn ==I)
                            {
                                s[i].search();
                                s[i].display();
                            }
                        }
		case 4:   
		break;
	}	

           }       
       }
 }

 