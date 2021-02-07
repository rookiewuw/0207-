import java.util.ArrayList;

public class java extends Course{
    java(String name, String teacher, String place, ArrayList<Student> student){
        super(name, teacher, place, student);
    }

    @Override
    public String toString() {
        return "这是一个java类";
    }

}
