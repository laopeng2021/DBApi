package com.jq.dbapi.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @program: dbApi
 * @description:
 * @author: jiangqiang
 * @create: 2021-01-20 09:50
 **/
@Data
@TableName(value = "api_config")
public class ApiConfig {

    @TableId(value = "id",type = IdType.AUTO)
    Integer id;

    @TableField
    String name;

    @TableField
    String note;

    @TableField
    String path;

    @TableField(value = "datasource_id")
    Integer datasourceId;

    @TableField
    String sql;

    @TableField
    String params;

    @TableField
    Integer status;
}