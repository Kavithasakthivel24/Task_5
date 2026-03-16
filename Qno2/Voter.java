package Qno2;

class Voter {

    int voterId;
    String name;
    int age;

    Voter(int voterId, String name, int age) throws Exception {

        if(age < 18)
            throw new Exception("invalid age for voter");

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(voterId+" "+name+" "+age);
    }
}