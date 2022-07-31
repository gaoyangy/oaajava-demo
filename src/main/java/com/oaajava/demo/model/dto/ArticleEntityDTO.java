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
 * 文章表
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-31
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("article")
@ApiModel(value = "ArticleEntity对象", description = "文章表")
public class ArticleEntityDTO extends Model<ArticleEntityDTO> {

        @ApiModelProperty("文章内容")
        @TableField("content")
        private String content;

        @ApiModelProperty("创建时间")
        @TableField(value = "create_time", fill = FieldFill.INSERT)
        private LocalDateTime createTime;

        @ApiModelProperty("更新时间")
        @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
        private LocalDateTime updateTime;

        @ApiModelProperty("是否有效  1.有效  2无效")
        @TableField("delete_status")
        private String deleteStatus;


        @Override
        public Serializable pkVal() {
                return null;
        }

}
