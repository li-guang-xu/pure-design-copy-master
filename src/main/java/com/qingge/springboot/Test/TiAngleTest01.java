package com.qingge.springboot.Test;

/**
 * ClassName: TiAngleTest01
 * Package: com.qingge.springboot.Test
 * Description:
 *
 * @Author 李广旭
 * @Create 2023/12/6 19:49
 * @Version 1.0
 */

public class TiAngleTest01 {

    public static void main(String[] args) {
            TiAngle tiAngle= new TiAngle();
            tiAngle.setBase(1);
            tiAngle.setHeight(2);


        System.out.println(tiAngle.Ara());
    }
}
