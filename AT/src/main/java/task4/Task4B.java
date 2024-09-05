package task4;
import java.lang.reflect.Method;

public class Task4B {
    public static void main(String[] args) {
        try {
            MyCustomClass obj = new MyCustomClass();

            Method[] methods = MyCustomClass.class.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println("Method: " + method.getName() + " Return type: " + method.getReturnType());
            }

            Method specificMethod = MyCustomClass.class.getDeclaredMethod("sayHello");
            String result = (String) specificMethod.invoke(obj);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
