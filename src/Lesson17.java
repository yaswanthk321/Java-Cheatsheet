/**
 * InnerLesson17
 */
class InnerLesson17 {

    public void playMusic() {
        System.out.println("playing music");
    }

    public String getMePen(int cost) {
        if (cost >= 10) {
            return "pen";
        }

        return "Nothing";

    }

}

public class Lesson17 {
    public static void main(String[] args) {
        InnerLesson17 obj = new InnerLesson17();
        obj.playMusic(); // playing music
        System.out.println(obj.getMePen(10)); // pen
    }
}
