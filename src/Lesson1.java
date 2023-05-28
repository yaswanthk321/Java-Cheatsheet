/*  jvm should be installed in target machine,
    Java application is platform independent,
    but jvm is platform dependent,
    jvm should run byte code only ,
    so javac (java compiler) will compile .java file to bytecode(.class file)
    in the bytecode java only search for only one file that contains main
    method
    eg : public static void main(String[] args)
    jdk(java development kit) contains jre(java runtime environment ),
    jre contains jvm(java virtual machine)  and libraries
*/

public class Lesson1 {

    public static void main(String[] args) {
        System.out.print("Hello World");
    }
}