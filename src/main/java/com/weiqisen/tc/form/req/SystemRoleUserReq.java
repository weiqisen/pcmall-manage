package com.weiqisen.tc.form.req;

import lombok.Data;

/**
 * @author weiqisen
 * @date 24/12/2020 5:04 下午
 */
@Data
public class SystemRoleUserReq {
    private Long roleId;
    private String userIds;
}
