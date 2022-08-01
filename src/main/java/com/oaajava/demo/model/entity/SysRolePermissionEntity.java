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
 * 角色-权限关联表
 * </p>
 *
 * @author gaoyangy
 * @since 2022-08-01
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_role_permission")
@ApiModel(value = "SysRolePermissionEntity对象", description = "角色-权限关联表")
public class SysRolePermissionEntity extends Model<SysRolePermissionEntity> {

    @ApiModelProperty("角色id")
    @TableField("role_id")
    private Integer roleId;

    @ApiModelProperty("权限id")
    @TableField("permission_id")
    private Integer permissionId;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty("是否有效 1有效     2无效")
    @TableField("delete_status")
    private String deleteStatus;


    @Override
    public Serializable pkVal() {
        return null;
    }

}
