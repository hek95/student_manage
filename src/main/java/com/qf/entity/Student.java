package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor //有构造方法
@NoArgsConstructor //无构造方法
@Accessors(chain=true) //开启链式编程
@TableName("student1") //表名与实体类名不一时
public class Student implements Serializable {
    @TableId(type= IdType.AUTO) //设置为id自增长
    private Integer id;
    private  String name;
    private Integer age;

}
