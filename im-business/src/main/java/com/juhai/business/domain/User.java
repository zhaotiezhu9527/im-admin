package com.juhai.business.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.juhai.common.annotation.Excel;
import com.juhai.common.core.domain.BaseEntity;

/**
 * 用户列表对象 t_user
 * 
 * @author zhaotiezhu
 * @date 2023-09-01
 */
public class User extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 昵称 */
    private String nickName;

    /** 登录密码 */
    private String loginPwd;

    /** 用户状态(1:正常 0:冻结) */
    @Excel(name = "用户状态(1:正常 0:冻结)")
    private Long status;

    /** 注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "注册时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date registerTime;

    /** 注册Ip */
    @Excel(name = "注册Ip")
    private String registerIp;

    /** 上次登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "上次登录时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date lastTime;

    /** 上次登录IP */
    @Excel(name = "上次登录IP")
    private String lastIp;

    /** 最后修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "最后修改时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;

    /** IMtoken */
    private String imToken;

    private String imUserName;

    public String getImUserName() {
        return imUserName;
    }

    public void setImUserName(String imUserName) {
        this.imUserName = imUserName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setNickName(String nickName) 
    {
        this.nickName = nickName;
    }

    public String getNickName() 
    {
        return nickName;
    }
    public void setLoginPwd(String loginPwd) 
    {
        this.loginPwd = loginPwd;
    }

    public String getLoginPwd() 
    {
        return loginPwd;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setRegisterTime(Date registerTime) 
    {
        this.registerTime = registerTime;
    }

    public Date getRegisterTime() 
    {
        return registerTime;
    }
    public void setRegisterIp(String registerIp) 
    {
        this.registerIp = registerIp;
    }

    public String getRegisterIp() 
    {
        return registerIp;
    }
    public void setLastTime(Date lastTime) 
    {
        this.lastTime = lastTime;
    }

    public Date getLastTime() 
    {
        return lastTime;
    }
    public void setLastIp(String lastIp) 
    {
        this.lastIp = lastIp;
    }

    public String getLastIp() 
    {
        return lastIp;
    }
    public void setModifyTime(Date modifyTime) 
    {
        this.modifyTime = modifyTime;
    }

    public Date getModifyTime() 
    {
        return modifyTime;
    }
    public void setImToken(String imToken) 
    {
        this.imToken = imToken;
    }

    public String getImToken() 
    {
        return imToken;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userName", getUserName())
            .append("nickName", getNickName())
            .append("loginPwd", getLoginPwd())
            .append("status", getStatus())
            .append("registerTime", getRegisterTime())
            .append("registerIp", getRegisterIp())
            .append("lastTime", getLastTime())
            .append("lastIp", getLastIp())
            .append("modifyTime", getModifyTime())
            .append("imToken", getImToken())
            .toString();
    }
}
