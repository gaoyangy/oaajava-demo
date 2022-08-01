package com.oaajava.demo.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 后台角色表
 * </p>
 *
 * @author gaoyangy
 * @since 2022-08-01
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_role")
@ApiModel(value = "SysRoleEntity对象", description = "后台角色表")
public class SysRoleEntity extends Model<SysRoleEntity> {

    @ApiModelProperty("角色名")
    @TableField("role_name")
    private String roleName;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty("是否有效  1有效  2无效")
    @TableField("delete_status")
    private String deleteStatus;


    @Override
    public Serializable pkVal() {
        return null;
    }

}
