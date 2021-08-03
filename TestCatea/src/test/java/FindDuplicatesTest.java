import junit.framework.TestCase;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


class FindDuplicatesTest extends TestCase {
    private static final List<Object> objects = new ArrayList<>();
    @Test
    void test(){
        List<String> testDup = Arrays.asList("TEST","TEST","TEST");
        List<?> distinct = FindDuplicates.findDuplicates(testDup);
        System.out.println(distinct);
    }

    @DisplayName("Find Duplicates")
    @RepeatedTest(5)
    void findDuplicates(){
        List<?> distinct = FindDuplicates.findDuplicates(objects);
        System.out.println(objects.toString());
        System.out.println(distinct);
    }

    @BeforeEach
    public void random(){
        List<Object> distinctSampleObjects = Arrays.asList("TEST",1,2,3,"Europe","Africa","America");
        for (int i = 0; i < 6; i+=2) {
            int randomIndex = Math.max(0,new Random().nextInt(6));
            objects.add(distinctSampleObjects.get(randomIndex));
        }
    }
}