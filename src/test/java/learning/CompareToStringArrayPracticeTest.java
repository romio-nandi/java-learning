package learning;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CompareToStringArrayPracticeTest {

    @Test
    public void test1() {
        CompareToStringArrayPractice s=new CompareToStringArrayPractice();
        String []a={"Hi","hellow","pellow","k"};
        String []b={"hi","hellow","pellow","long"};
        List<String> list =s.test(a,b);
        String k[]=list.toArray(new String[0]);



    }
}