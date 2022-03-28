package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ArchiveFileMapper;
import com.ruoyi.system.domain.ArchiveFile;
import com.ruoyi.system.service.IArchiveFileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 文档信息表Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-03-28
 */
@Service
public class ArchiveFileServiceImpl implements IArchiveFileService 
{
    @Autowired
    private ArchiveFileMapper archiveFileMapper;

    /**
     * 查询文档信息表
     * 
     * @param id 文档信息表主键
     * @return 文档信息表
     */
    @Override
    public ArchiveFile selectArchiveFileById(Long id)
    {
        return archiveFileMapper.selectArchiveFileById(id);
    }

    /**
     * 查询文档信息表列表
     * 
     * @param archiveFile 文档信息表
     * @return 文档信息表
     */
    @Override
    public List<ArchiveFile> selectArchiveFileList(ArchiveFile archiveFile)
    {
        return archiveFileMapper.selectArchiveFileList(archiveFile);
    }

    /**
     * 新增文档信息表
     * 
     * @param archiveFile 文档信息表
     * @return 结果
     */
    @Override
    public int insertArchiveFile(ArchiveFile archiveFile)
    {
        archiveFile.setCreateTime(DateUtils.getNowDate());
        return archiveFileMapper.insertArchiveFile(archiveFile);
    }

    /**
     * 修改文档信息表
     * 
     * @param archiveFile 文档信息表
     * @return 结果
     */
    @Override
    public int updateArchiveFile(ArchiveFile archiveFile)
    {
        archiveFile.setUpdateTime(DateUtils.getNowDate());
        return archiveFileMapper.updateArchiveFile(archiveFile);
    }

    /**
     * 批量删除文档信息表
     * 
     * @param ids 需要删除的文档信息表主键
     * @return 结果
     */
    @Override
    public int deleteArchiveFileByIds(String ids)
    {
        return archiveFileMapper.deleteArchiveFileByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除文档信息表信息
     * 
     * @param id 文档信息表主键
     * @return 结果
     */
    @Override
    public int deleteArchiveFileById(Long id)
    {
        return archiveFileMapper.deleteArchiveFileById(id);
    }
}
