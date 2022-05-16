package com.app.core;

public class Student  implements Comparable<Student>{

    private String prn;
    private String name;
    private String email;
    private double marks;
    private String course;
    

    public Student(String prn)
    {
        this.prn=prn;
    }

    public Student(String prn,String name,String email,double marks,String course){
        this.prn=prn;
        this.name=name;
        this.email=email;
        this.marks=marks;
        this.course=course;
    }


    /**
     * @return String return the prn
     */
    public String getPrn() {
        return prn;
    }

    /**
     * @param prn the prn to set
     */
    public void setPrn(String prn) {
        this.prn = prn;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return double return the marks
     */
    public double getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(double marks) {
        this.marks = marks;
    }

    /**
     * @return String return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }
    
    @Override
    public String toString(){
        return "Student[ prn : "+prn+"name: "+name+"email: "+email+"marks: "+marks+"course: "+course+"]";
    }


    @Override
    public boolean equals(Object e)
    {
        if(e instanceof Student)
        {
            return this.prn.equals(((Student)e).prn);
        }
        return false;
    }


    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return ((Double)this.marks).compareTo(o.getMarks());
    }
}
