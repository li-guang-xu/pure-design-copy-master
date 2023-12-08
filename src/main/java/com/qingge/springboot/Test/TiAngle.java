package com.qingge.springboot.Test;

import lombok.Data;

/**
 * ClassName: TiAngle
 * Package: com.qingge.springboot.Test
 * Description:
 *
 * @Author 李广旭
 * @Create 2023/12/6 19:49
 * @Version 1.0
 */
@Data
public class TiAngle {
    int base;
    int height;




public double Ara(){

    return this.base*this.height/2;
}

}
