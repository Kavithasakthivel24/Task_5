package Qno1;

class Student {

    int rollNo;
    String name;
    int age;
    String course;

    Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        if(age < 15 || age > 21)
            throw new AgeNotWithinRangeException("Age not between 15 and 21");

        if(!name.matches("[a-zA-Z ]+"))
            throw new NameNotValidException("Name contains invalid characters");

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println(rollNo+" "+name+" "+age+" "+course);
    }
}
