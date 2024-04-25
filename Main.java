class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
    }

    public static void printHello(){
        String cadena = "Hello";

        for (int i = 0; i < 5; i++){
            System.out.print(cadena.charAt(i));            
        }
        System.out.println();
    }
}