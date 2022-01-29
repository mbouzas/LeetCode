import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CodeWars {


    public static void main(String[] args) {

        Boolean test = checkVin("5YJ3E1EA7HF000337");
    }
    public static boolean checkVin(String vin) {
        // Code here
        if (vin.length()!=17){

            return false;
        }
        Integer [] integerConvert = new Integer[17];
        Map<Character, Integer> mapa =  new HashMap<>();
        mapa.put ('A',1);
        mapa.put('B',2);
        mapa.put('C',3);
        mapa.put('D',4);
        mapa.put('E',5);
        mapa.put('F',6);
        mapa.put('G',7);
        mapa.put('H',8);
        mapa.put('I',0);
        mapa.put('J',1);
        mapa.put('K',2);
        mapa.put('L',3);
        mapa.put('M',4);
        mapa.put('N',5);
        mapa.put('O',0);
        mapa.put('P',7);
        mapa.put('Q',0);
        mapa.put('R',9);
        mapa.put('S',2);
        mapa.put('T',3);
        mapa.put('U',4);
        mapa.put('V',5);
        mapa.put('W',6);
        mapa.put('X',7);
        mapa.put('Y',8);
        mapa.put('Z',9);

        Integer [] weights = new Integer[] {8,7,6,5,4,3,2,10,0,9,8,7,6,5,4,3,2};
        Integer [] product = new Integer[17];
        for (int i =0; i<17; i++){
            Character currentChar = vin.charAt(i);
            if (Character.isDigit(currentChar)){
                integerConvert[i]= Character.getNumericValue(currentChar);
            }
            if (mapa.containsKey(currentChar) &&  !Character.isDigit(currentChar)){
                Integer valueMap = mapa.get(currentChar);
                integerConvert[i]= valueMap;
            }
            product[i] = integerConvert[i] * weights[i];

        }

        Integer sum = Arrays.stream(product).mapToInt(Integer::valueOf).sum();
        Integer result = sum % 11;
        if (vin.charAt(8)=='X' && result==10 ){
            return true;
        }
        if (Character.getNumericValue(vin.charAt(8))==result){
            return true;
        }

        return false;
    }
}