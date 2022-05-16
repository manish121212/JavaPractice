package Utils;

import com.app.core.Course;

import cust_excs.StudentHandlingException;

public class ValidationUtils {
    
    public static String ValidateName(String name) throws StudentHandlingException {
 
        if(name.length() >4 && name.length()<10)
        {
            return name;

        }
        else
          
        throw new StudentHandlingException("Invalid name");

    }
    public static String ValidateEmail(String email) throws StudentHandlingException
{
    if(email.contains("@")&& email.length() >4 && email.length()<10)
    return email;
    else
    throw new StudentHandlingException("Invalid Email Id");
}
// public static String ValidateCourse(String course) throws StudentHandlingException
// {
//     if(course.equals("dac")||course.equals("dmc")||course.equals("dbdac"))
//     {
//         return course;
//     }
//     else
//     throw new StudentHandlingException(" Invalid Course");
// }

public static double ValidateMarks(double marks) throws StudentHandlingException
{
    if(marks>0 && marks <100)
    {
        return marks;
    }
    else
    throw new StudentHandlingException("Marks is invalid");
}
public static Course ValidateCourse(String course) throws StudentHandlingException, IllegalArgumentException
{
    return Course.valueOf(course);
}
}           

