import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class TestClass {
    @Test
    public void test1IsCorrect() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method=Main.class.getDeclaredMethod("isCorrect",String.class);
        method.setAccessible(true);
        Str Str=new Str("123");
        String line="123";
        Boolean test=(boolean)method.invoke(Str,line);
        Assert.assertEquals(true,test);
    }
    @Test
    public void test2IsCorrect() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method=Main.class.getDeclaredMethod("isCorrect",String.class);
        method.setAccessible(true);
        Str Str=new Str("123");
        String line="25ff";
        Boolean test=(boolean)method.invoke(Str,line);
        Assert.assertEquals(false,test);
    }
    @Test
    public void test1NextLineInSeq()throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Str.class.getDeclaredMethod("nextLineInSeq", String.class);
        method.setAccessible(true);
        Str Str = new Str("1");
        String line = "1";
        String test = (String) method.invoke(Str, line);
        Assert.assertEquals("11", test);
    }
    @Test
    public void test2NextLineInSeq()throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Str.class.getDeclaredMethod("nextLineInSeq", String.class);
        method.setAccessible(true);
        Str Str = new Str("1");
        String line = "145223";
        String test = (String) method.invoke(Str, line);
        Assert.assertEquals("1114152213", test);
    }
}
