package com.oaajava.demo.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 后台权限表
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-31
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_permission")
@ApiModel(value = "SysPermissionEntity对象", description = "后台权限表")
public class SysPermissionEntityDTO extends Model<SysPermissionEntityDTO> {

        @ApiModelProperty("归属菜单,前端判断并展示菜单使用,")
        @TableField("menu_code")
        private String menuCode;

        @ApiModelProperty("菜单的中文释义")
        @TableField("menu_name")
        private String menuName;

        @ApiModelProperty("权限的代码/通配符,对应代码中@RequiresPermissions 的value")
        @TableField("permission_code")
        private String permissionCode;

        @ApiModelProperty("本权限的中文释义")
        @TableField("permission_name")
        private String permissionName;

        @ApiModelProperty("是否本菜单必选权限, 1.必选 2非必选 通常是\"列表\"权限是必选")
        @TableField("required_permission")
        private Boolean requiredPermission;


        @Override
        public Serializable pkVal() {
                return null;
        }

}
