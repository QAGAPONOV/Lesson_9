import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Stud {
    private static void Stream() {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );
        List<Student> militaryService = students.stream().filter((s)-> s.getAge() >= 18 && s.getAge() < 27
                && s.getGender() == Gender.MAN).collect(Collectors.toList());
        System.out.println("militaryService = " + militaryService);

        double manAverageAge = students.stream().filter((s) -> s.getGender() == Gender.MAN).
                mapToInt(Student::getAge).average().getAsDouble();
        System.out.println("manAverageAge = " + manAverageAge);

    }

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + gender +
                    '}';
        }
    }

    public static void main(String[] args)  throws Exception {
        Stream();
    }
}
