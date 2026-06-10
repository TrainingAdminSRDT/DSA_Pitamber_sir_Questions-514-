class Solutiontohex {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        char[] hex = {
            '0','1','2','3','4','5','6','7',
            '8','9','a','b','c','d','e','f'
        };

        StringBuilder result = new StringBuilder();

        while (num != 0) {
            result.append(hex[num & 15]); // num % 16
            num >>>= 4;                   // unsigned right shift
        }

        return result.reverse().toString();
    }
}
