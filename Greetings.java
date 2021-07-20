class Greetings {
    public static void main(String[] args){
        Out.print("What is your name?");
        String name = In.readWord();

        Out.println("Hello " + name + "! I am your first Program :)");
    }
}
