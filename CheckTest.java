abcde

import gdut.dyw.hospital.common.util.CheckUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author Leant
 * @Date 2020/01/19
 * @Description
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CheckTest {

    @Test
    public void testCheckIdCard(){
        System.out.println("身份证验证  "+abc("442501200002211031"));
        System.out.println("最终号验证  "+abc("15089110062"));

    }

}
