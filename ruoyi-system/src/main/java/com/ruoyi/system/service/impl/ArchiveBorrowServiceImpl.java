package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ArchiveBorrowMapper;
import com.ruoyi.system.domain.ArchiveBorrow;
import com.ruoyi.system.service.IArchiveBorrowService;
import com.ruoyi.common.core.text.Convert;

/**
 * 借阅信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-03-28
 */
@Service
public class ArchiveBorrowServiceImpl implements IArchiveBorrowService 
{
    @Autowired
    private ArchiveBorrowMapper archiveBorrowMapper;

    /**
     * 查询借阅信息
     * 
     * @param borrowId 借阅信息主键
     * @return 借阅信息
     */
    @Override
    public ArchiveBorrow selectArchiveBorrowByBorrowId(Long borrowId)
    {
        return archiveBorrowMapper.selectArchiveBorrowByBorrowId(borrowId);
    }

    /**
     * 查询借阅信息列表
     * 
     * @param archiveBorrow 借阅信息
     * @return 借阅信息
     */
    @Override
    public List<ArchiveBorrow> selectArchiveBorrowList(ArchiveBorrow archiveBorrow)
    {
        return archiveBorrowMapper.selectArchiveBorrowList(archiveBorrow);
    }

    /**
     * 新增借阅信息
     * 
     * @param archiveBorrow 借阅信息
     * @return 结果
     */
    @Override
    public int insertArchiveBorrow(ArchiveBorrow archiveBorrow)
    {
        return archiveBorrowMapper.insertArchiveBorrow(archiveBorrow);
    }

    /**
     * 修改借阅信息
     * 
     * @param archiveBorrow 借阅信息
     * @return 结果
     */
    @Override
    public int updateArchiveBorrow(ArchiveBorrow archiveBorrow)
    {
        return archiveBorrowMapper.updateArchiveBorrow(archiveBorrow);
    }

    /**
     * 批量删除借阅信息
     * 
     * @param borrowIds 需要删除的借阅信息主键
     * @return 结果
     */
    @Override
    public int deleteArchiveBorrowByBorrowIds(String borrowIds)
    {
        return archiveBorrowMapper.deleteArchiveBorrowByBorrowIds(Convert.toStrArray(borrowIds));
    }

    /**
     * 删除借阅信息信息
     * 
     * @param borrowId 借阅信息主键
     * @return 结果
     */
    @Override
    public int deleteArchiveBorrowByBorrowId(Long borrowId)
    {
        return archiveBorrowMapper.deleteArchiveBorrowByBorrowId(borrowId);
    }
}
