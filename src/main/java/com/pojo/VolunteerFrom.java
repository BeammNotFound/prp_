package com.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author BeamStark
 * @Version 0.1 2020/12
 */
@Data
@ApiModel("志愿者表单实体类")
public class VolunteerFrom {



    @NotNull(message = "user_id不能为空")
    private Integer user_id;
    @NotNull(message = "base_id不能为空")
    private Integer base_id;

    @NotBlank(message = "vf_age不能为空")
    private String vf_age;
    @NotBlank(message = "vf_phone不能为空")
    private String vf_phone;
    @NotBlank(message = "vf_join_time不能为空")
    private String vf_join_time;
    @NotBlank(message = "vf_family_agree不能为空")
    private String vf_family_agree;
    @NotBlank(message = "vf_health不能为空")
    private String vf_health;
    @NotBlank(message = "vf_hobby不能为空")
    private String vf_hobby;
    @NotBlank(message = "vf_join_work不能为空")
    private String vf_join_work;
    @NotBlank(message = "vf_had_car不能为空")
    private String vf_had_car;
    @NotBlank(message = "vf_receive_train不能为空")
    private String vf_receive_train;
    @NotBlank(message = "vf_had_joined不能为空")
    private String vf_had_joined;
    @NotBlank(message = "vf_profession不能为空")
    private String vf_profession;
    @NotBlank(message = "vf_real_name不能为空")
    private String vf_real_name;

    @JsonIgnore
    private Date vf_create_time;
}
