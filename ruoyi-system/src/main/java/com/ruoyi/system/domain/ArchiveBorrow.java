package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 借阅信息对象 archive_borrow
 * 
 * @author ruoyi
 * @date 2022-03-28
 */
public class ArchiveBorrow extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 借阅ID */
    private Long borrowId;

    /** 文档ID */
    @Excel(name = "文档ID")
    private Long archiveId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 文档名称 */
    @Excel(name = "文档名称")
    private String archiveName;

    /** 文档位置 */
    @Excel(name = "文档位置")
    private String archivePosition;

    /** 账号 */
    @Excel(name = "账号")
    private String loginName;

    /** 昵称 */
    @Excel(name = "昵称")
    private String userName;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phonenumber;

    /** 借阅或归还 */
    @Excel(name = "借阅或归还")
    private String borrowType;

    public void setBorrowId(Long borrowId) 
    {
        this.borrowId = borrowId;
    }

    public Long getBorrowId() 
    {
        return borrowId;
    }
    public void setArchiveId(Long archiveId) 
    {
        this.archiveId = archiveId;
    }

    public Long getArchiveId() 
    {
        return archiveId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setArchiveName(String archiveName) 
    {
        this.archiveName = archiveName;
    }

    public String getArchiveName() 
    {
        return archiveName;
    }
    public void setArchivePosition(String archivePosition) 
    {
        this.archivePosition = archivePosition;
    }

    public String getArchivePosition() 
    {
        return archivePosition;
    }
    public void setLoginName(String loginName) 
    {
        this.loginName = loginName;
    }

    public String getLoginName() 
    {
        return loginName;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setPhonenumber(String phonenumber) 
    {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() 
    {
        return phonenumber;
    }
    public void setBorrowType(String borrowType) 
    {
        this.borrowType = borrowType;
    }

    public String getBorrowType() 
    {
        return borrowType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("borrowId", getBorrowId())
            .append("archiveId", getArchiveId())
            .append("userId", getUserId())
            .append("archiveName", getArchiveName())
            .append("archivePosition", getArchivePosition())
            .append("loginName", getLoginName())
            .append("userName", getUserName())
            .append("email", getEmail())
            .append("phonenumber", getPhonenumber())
            .append("borrowType", getBorrowType())
            .toString();
    }
}
