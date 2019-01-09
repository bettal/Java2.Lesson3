package Lesson3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(arr));
//        int[] arr2 = new int[20];
//        System.arraycopy(arr,0, arr2, 0,arr.length);
//        System.out.println(Arrays.toString(arr2));
//        ArrayList<String> ai = new ArrayList<>();
//        ai.add("Корнет");
//        ai.add("Подпоручик");
//        ai.add("Подпоручик");
//        ai.add("Поручик");
//        ai.add("Есаул");
//        System.out.println(ai);
//        while (ai.contains("Подпоручик")) {
//            ai.remove("Подпоручик");
//        }
//        ai.remove(2);
//        System.out.println(ai.toString());
//        for (String s : ai) {
//            System.out.println(s);
//        }
//        Iterator<String> iter = ai.iterator();
//        while (iter.hasNext()){
////            System.out.println(iter.next());
//            if (iter.next().equalsIgnoreCase("Подпоручик")) {
//                iter.remove();
//            }
//        }
//        ai.set(2,"Сотник");
//        ai.ensureCapacity(100);
//        ai.trimToSize();
//        System.out.println(ai.size());
//        System.out.println(ai);
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.addLast("Y");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.addFirst("Z");
        System.out.println(ll);

    }
}
