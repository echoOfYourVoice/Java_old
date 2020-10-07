package Variables;

public class Main {

    public static void main(String[] args) {
	//Целые
        byte b = 12; //(-128, 127)
        short s = 2000; //(-32768, 32767)
        int i = 2999999; //(-2147483648, 2147483647)
        long n = -939393939; //(-9223372036854775808L, 9223372036854775807L)

        //Дробные
        float f = 5.7f; //(1.4e-45f, 3.4e+38f)
        double d = 35.59; //(4.9e-324, 1.7e+308)

        // Логический
        boolean bool = true; //false

        //Строковые
        char c = 'D';
        String str = "My string";
        ////////////////////////////////
        String result = "";
        result += "Byte b = " + b + "\n";
        result += "Short s = " + s + "\n";
        result += "Integer i = " + i + "\n";
        result += "Long n = " + n + "\n";
        result += "Short s = " + s + "\n";
        result += "Float f = " + f + "\n";
        result += "Double d = " + d + "\n";
        result += "Boolean bool = " + bool + "\n";
        result += "Char c = " + c + "\n";
        result += "String str = " + str + "\n";
        System.out.print(result);
        String str_n = "53";
        int summa = Integer.parseInt(str_n) + 20;
        System.out.println(summa);
    }
}
