package gdut.dyw.hospital.test;

import gdut.dyw.hospital.common.util.CheckUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
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
        System.out.println("身份证验证  "+CheckUtils.checkIdCard("442501200002211031"));
        System.out.println("手机号验证  "+CheckUtils.checkPhonenumber("15089110062"));
    }

}