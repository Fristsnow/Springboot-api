package kf.lucky.main.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import sun.security.provider.MD5;

@Data
@TableName("book")
public class Staff {
    //    `id`,
//            `firstname`,
//            `lastname`,
//            `phone_number`,
//            `route_id`,
//            `password`,
    private Long id;
    private String book;
    private String name;
    private String plane;
//    private String firstname;
//    private String lastname;
//    private String phoneNumber;
//    private Integer routeId;
}
