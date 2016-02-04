/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import java.util.*;

class student
{ public static void main(String args[])
 { Scanner s=new Scanner(System.in);
   int i,num;
   student1 a[]=new student1[5];
 
   System.out.println("Enter the no.of students(<5):");
   num=s.nextInt();
 
   for(i=0;i<num;i++)
   { System.out.println("Enter details of student"+(i+1)+":");
    a[i]=new student1();
     a[i].setRoll();
     a[i].setName();
     a[i].setAddr();
     
   }
  
 }
}






class student1

{ 
 Scanner s=new Scanner(System.in);
 int rollno;
String name,addr;

void setRoll()
{ System.out.println("Enter roll no.:");
  rollno=s.nextInt();
}

void setName()
{ System.out.println("Enter name:");
  name=s.nextLine();
}

void setAddr()
{ System.out.println("Enter address:");
  addr=s.nextLine();
}

int getRoll()
{ return rollno;
}

String getName()
{ return name;
}

String getAddr()
{ return addr;
}

}