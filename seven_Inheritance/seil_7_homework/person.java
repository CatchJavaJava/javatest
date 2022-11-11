package soomatter;

public class person {
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void show() {
        System.out.println("사람[이름 : " + name + "나이 : " + age + "]");
    }
}
    class student extends person{
        int studentnumber;

        public student(String name, int age, int studentnumber) {
            super(name,age);
            this.studentnumber = studentnumber;
        }
        public void show() {
            System.out.println("학생[이름 : " + name + "나이 : " + age + "학번 : " + studentnumber + "]");
        }
    }

    class foreignstudent extends student {
        String nation;

        public foreignstudent(String name, int age,int studentnumber, String nation) {
            super(name,age, studentnumber);
            this.nation = nation;

        }

        public void show() {
            System.out.println("학생[이름 : "+name+"나이:"+age+"학번 : "+ studentnumber + "국적" + nation + "]");
        }

    }

