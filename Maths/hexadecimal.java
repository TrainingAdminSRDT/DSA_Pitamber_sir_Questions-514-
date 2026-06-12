//question405
public class hexadecimal {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] hexChars = {'0', '1', '2', '3','4', '5', '6', '7','8', '9', 'a', 'b','c', 'd', 'e', 'f'};
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            result.append(hexChars[num & 15]); // num % 16
            num >>>= 4; 
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        hexadecimal obj = new hexadecimal();
        int num = 26;
        String result = obj.toHex(num);
        System.out.println("Hexadecimal: " + result);
    }
}