package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ArchiveFile;

/**
 * 文档信息表Mapper接口
 * 
 * @author ruoyi
 * @date 2022-03-28
 */
public interface ArchiveFileMapper 
{
    /**
     * 查询文档信息表
     * 
     * @param id 文档信息表主键
     * @return 文档信息表
     */
    public ArchiveFile selectArchiveFileById(Long id);

    /**
     * 查询文档信息表列表
     * 
     * @param archiveFile 文档信息表
     * @return 文档信息表集合
     */
    public List<ArchiveFile> selectArchiveFileList(ArchiveFile archiveFile);

    /**
     * 新增文档信息表
     * 
     * @param archiveFile 文档信息表
     * @return 结果
     */
    public int insertArchiveFile(ArchiveFile archiveFile);

    /**
     * 修改文档信息表
     * 
     * @param archiveFile 文档信息表
     * @return 结果
     */
    public int updateArchiveFile(ArchiveFile archiveFile);

    /**
     * 删除文档信息表
     * 
     * @param id 文档信息表主键
     * @return 结果
     */
    public int deleteArchiveFileById(Long id);

    /**
     * 批量删除文档信息表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteArchiveFileByIds(String[] ids);
}
