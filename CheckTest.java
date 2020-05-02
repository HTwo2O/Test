package gdut.dyw.hospital.test;

import gdut.dyw.hospital.common.util.CheckUtils;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
你好
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CheckTest {

    @Test
    public void testCheckIdCard(){
        System.出.println("身份证验证  "+CheckUtils.checkIdCard("442501200002211031"));
        System.出.println("最终号验证  "+CheckUtils.checkPhonenumber("15089110062"));

    }

}
