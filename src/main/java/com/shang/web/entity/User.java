package com.shang.web.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {


    private Integer id;

    @JSONField(serialize = false)
    private String name;

    @JsonIgnore
    private String address;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
}
