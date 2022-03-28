package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文档信息表对象 archive_file
 * 
 * @author ruoyi
 * @date 2022-03-28
 */
public class ArchiveFile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    @Excel(name = "文档名称")
    private String archiveName;

    /**  */
    @Excel(name = "文档部门")
    private String archiveApartment;

    /**  */
    @Excel(name = "文档标签")
    private String archiveNature;

    /**  */
    @Excel(name = "保密等级")
    private String archiveLevel;

    /**  */
    @Excel(name = "文档位置")
    private String archivePosition;

    /**  */
    @Excel(name = "文档描述")
    private String archiveDescription;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setArchiveName(String archiveName) 
    {
        this.archiveName = archiveName;
    }

    public String getArchiveName() 
    {
        return archiveName;
    }
    public void setArchiveApartment(String archiveApartment) 
    {
        this.archiveApartment = archiveApartment;
    }

    public String getArchiveApartment() 
    {
        return archiveApartment;
    }
    public void setArchiveNature(String archiveNature) 
    {
        this.archiveNature = archiveNature;
    }

    public String getArchiveNature() 
    {
        return archiveNature;
    }
    public void setArchiveLevel(String archiveLevel) 
    {
        this.archiveLevel = archiveLevel;
    }

    public String getArchiveLevel() 
    {
        return archiveLevel;
    }
    public void setArchivePosition(String archivePosition) 
    {
        this.archivePosition = archivePosition;
    }

    public String getArchivePosition() 
    {
        return archivePosition;
    }
    public void setArchiveDescription(String archiveDescription) 
    {
        this.archiveDescription = archiveDescription;
    }

    public String getArchiveDescription() 
    {
        return archiveDescription;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("archiveName", getArchiveName())
            .append("archiveApartment", getArchiveApartment())
            .append("archiveNature", getArchiveNature())
            .append("archiveLevel", getArchiveLevel())
            .append("archivePosition", getArchivePosition())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("archiveDescription", getArchiveDescription())
            .toString();
    }
}
