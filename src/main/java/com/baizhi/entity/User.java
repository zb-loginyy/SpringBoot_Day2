package com.baizhi.entity;


import lombok.*;

@Data //给实体类提供Set和Get方法
@NoArgsConstructor  //提供无参构造
@AllArgsConstructor //提供有参构造
@ToString  //提供ToString方法
@EqualsAndHashCode  //提供Equals和HashCode方法
public class User {
    private  String  id;
    private  String  username;
    private  String  password;
    private  Integer age;




}
