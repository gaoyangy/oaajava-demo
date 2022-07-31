package com.oaajava.demo.model.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 后台角色表
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-31
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_role")
@ApiModel(value = "SysRoleEntity对象", description = "后台角色表")
public class SysRoleEntityDTO extends Model<SysRoleEntityDTO> {

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
