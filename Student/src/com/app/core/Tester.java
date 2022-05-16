package com.app.core;

import java.util.*;
import Utils.*;
import cust_excs.StudentHandlingException;
import custom_comp.CompareMarks;


public class Tester {

    public static void main(String[] s) throws StudentHandlingException
    {

          ArrayList<Student> student= CollectionUtils.populateStudent();

              // int i=  student.indexOf(new Student("13"));
             //  System.out.println(i);
          for(Student ss:student)
          {
              System.out.println(ss);
          }

          Scanner sc =new Scanner(System.in);


          System.out.println("Option 1 : Add Student\n"+"Option 2: Enter Course to Search Student");
          System.out.println("please Enter the option");

          switch(sc.nextInt())
          {
            case 1:
            {
                System.out.println("Please enter Student details");
                try {
                    student.add(new Student(sc.next(),ValidationUtils.ValidateName(sc.next()),ValidationUtils.ValidateEmail(sc.next()),sc.nextDouble(),ValidationUtils.ValidateCourse(sc.next()).name()));
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (StudentHandlingException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }  break;
            case 2:
            {
                System.out.println("please enter Course name");
                String course=sc.next();
                
                HashMap<String , ArrayList<Student>> hmap=new HashMap<>();
                for(int i=0;i<student.size();i++)
                {
                   if( !hmap.containsKey(student.get(i).getCourse()))
                   {
                    ArrayList<Student> stud=new ArrayList<>();
                    stud.add(student.get(i));
                    hmap.put(student.get(i).getCourse(),stud);
                   }
                   else{
                       hmap.get(student.get(i).getCourse()).add(student.get(i));
                   }

                }
                System.out.println(hmap.get(course));

            }
            break;

            case 3:
            {
                System.out.println("Please Enter Prn and New Marks");
                String prn=sc.next();
                double newMarks=sc.nextDouble();
                int i=student.indexOf(new Student(prn));

                if(i>=0)
                {try {
                    student.get(i).setMarks(ValidationUtils.ValidateMarks(newMarks));
                } catch (StudentHandlingException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(student.get(i));}

            }
            break;
            case 4:
            {
                System.out.println("please enter student's prn for admission ") ;
                String prn=sc.next();
                student.remove(ValidateStudent(student,prn));
                System.out.println("Student remove successfully");
                System.out.println(student);
            }
            break;
             case 5:
             {
                 Collections.sort(student);
                 System.out.println(student);
             }
               break;
               case 6:
               Collections.sort(student,new CompareMarks());
               System.out.println(student);
               break;
               case 7:
               System.out.println(Collections.max(student));
          }
          

                    

        // Student student[]=new Student[4];
        // student[0]=new Student("123","Manish","man@gmail.com",80.0,"DaC");
        // student[1]=new Student("1233","Sachin","sac@gmail.com",70.0,"DaC"); 
        // student[2]=new Student("13","Kannu","kannu@gmail.com",10.0,"IOT");
   
        // try(Scanner sc=new Scanner(System.in))
        // {
        //     for(int i=3;i<student.length;i++)
        //     {
        //         System.out.println("please Enter prn, name,email,marks,course");
        //         Student ss=new Student(sc.next(),ValidationUtils.ValidateName(sc.next()),ValidationUtils.ValidateEmail(sc.next()),sc.nextDouble(),ValidationUtils.ValidateCourse(sc.next()));
            
        //      for(int j=0;j<i;)
        //      {
        //         if(student[j].equals(ss))
        //         {
        //           throw new StudentHandlingException("Invalid Prn");
                  
        //         }
        //         else
        //         {
        //         student[i]=ss;
        //         System.out.println(" Student added");
        //         j++;
        //         break;
        //     }
            
        //      }
             
        //     }
        //     for(Student u:student)
        //     {
        //         System.out.println(u);
        //     }

        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     System.out.println(e.getMessage());
        // }
    }

public static int ValidateStudent(ArrayList<Student> student,String prn ) throws StudentHandlingException
{

    if(student.indexOf(new Student(prn)) != -1)
    {
            return student.indexOf(new Student(prn));
    }
    else
    throw new StudentHandlingException("Student not found");
}    
}
