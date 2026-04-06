// Class Student
class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

// Class Test inheriting Student
class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

// Interface Sports
interface Sports {
    int sMarks = 20;  // fixed sports marks
    void set();
}

// Class Result inheriting Test and implementing Sports
class Result extends Test implements Sports {

    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }

    void displayResult() {
        System.out.println("Roll No: " + getRollNo());
        getMarks();
        set();

        int total = sub1 + sub2 + sMarks;
        System.out.println("Total Marks: " + total);
    }
}

// Test Class
public class ResultDemo {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(80, 85);

        r.displayResult();
    }
}