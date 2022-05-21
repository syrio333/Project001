package syrio.forel;

/*
    @author syrio
    @date 2022/5/21
    @time 19:02
*/

import java.util.HashMap;

public class DebugTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
        
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("name","tom");
        System.out.println(hashMap);

        hashMap.put("gender","female");
        String gender = hashMap.get("gender");
        System.out.println("gender = " + gender);

        hashMap.put("age","13");
        System.out.println(hashMap);

        hashMap.remove("age");
        System.out.println(hashMap);
    }

}
