import java.util.Objects;

public class EqualsTest1 {
    int no;
    String school;
    public EqualsTest1(){

    }
    public EqualsTest1( int no, String  school){
        this.no = no;
        this.school =school;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsTest1 that = (EqualsTest1) o;
        return no == that.no &&
                Objects.equals(school, that.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, school);
    }


    public static void main(String[] args) {
        EqualsTest1 student1 = new EqualsTest1(8,"郑州");
        EqualsTest1 student2 = new EqualsTest1(10,"郑州");
        System.out.println(student2.equals(student1));


    }
}
