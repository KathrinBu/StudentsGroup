import java.util.ArrayList;

public class Human {
    public static void main(String[] args) {

        Teacher.says("Who is headman?");
        Headman.says("I am");
        Teacher.says("How many people are in the group?");

        ArrayList<Group> groupArrayList = new ArrayList<>();
        groupArrayList.add(new UsualStudent("Vasya", 1));
        groupArrayList.add(new UsualStudent("Masha", 2));
        groupArrayList.add(new Headman("Petya", 3));
        int group = groupArrayList.size();
        System.out.println("person in the group - " + group);
    }
}