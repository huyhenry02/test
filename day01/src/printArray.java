import java.util.HashMap;

public class printArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 8, 8, 9, 10};
        
        System.out.println("check array: ");
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for (int key : frequencyMap.keySet()) {
            int count = frequencyMap.get(key);
            if (count > 1) {
                System.out.println("Số " + key + " lặp lại " + count + " lần");
            }
        }
    }
}
