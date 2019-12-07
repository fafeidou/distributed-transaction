package com.batman.commonmodel.stock;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@Entity
@Table(name = "stock")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Stock {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    @Column(name = "sku_id")
    private String skuId;
    @Column(name = "user_id")
    private long num;
    @Column(name = "create_time")
    private Date createTime;
}
