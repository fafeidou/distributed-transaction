package com.batman.commonmodel.orders;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@Entity
@Table(name = "orders")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Orders {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    @Column(name = "sku_id")
    private String skuId;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "create_time")
    private Date createTime;
}
