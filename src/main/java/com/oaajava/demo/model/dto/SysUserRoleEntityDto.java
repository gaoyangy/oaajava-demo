package com.oaajava.demo.model.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户-角色关联表
 * </p>
 *
 * @author gaoyangy
 * @since 2022-08-01
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_user_role")
@ApiModel(value = "SysUserRoleEntity对象", description = "用户-角色关联表")
public class SysUserRoleEntityDto extends Model<SysUserRoleEntityDto> {

@ApiModelProperty("用户id")
@TableField("user_id")
private Integer userId;

@ApiModelProperty("角色id")
@TableField("role_id")
private Integer roleId;


@Override
public Serializable pkVal() {
return null;
        }

        }
