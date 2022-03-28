package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ArchiveBorrow;

/**
 * 借阅信息Service接口
 * 
 * @author ruoyi
 * @date 2022-03-28
 */
public interface IArchiveBorrowService 
{
    /**
     * 查询借阅信息
     * 
     * @param borrowId 借阅信息主键
     * @return 借阅信息
     */
    public ArchiveBorrow selectArchiveBorrowByBorrowId(Long borrowId);

    /**
     * 查询借阅信息列表
     * 
     * @param archiveBorrow 借阅信息
     * @return 借阅信息集合
     */
    public List<ArchiveBorrow> selectArchiveBorrowList(ArchiveBorrow archiveBorrow);

    /**
     * 新增借阅信息
     * 
     * @param archiveBorrow 借阅信息
     * @return 结果
     */
    public int insertArchiveBorrow(ArchiveBorrow archiveBorrow);

    /**
     * 修改借阅信息
     * 
     * @param archiveBorrow 借阅信息
     * @return 结果
     */
    public int updateArchiveBorrow(ArchiveBorrow archiveBorrow);

    /**
     * 批量删除借阅信息
     * 
     * @param borrowIds 需要删除的借阅信息主键集合
     * @return 结果
     */
    public int deleteArchiveBorrowByBorrowIds(String borrowIds);

    /**
     * 删除借阅信息信息
     * 
     * @param borrowId 借阅信息主键
     * @return 结果
     */
    public int deleteArchiveBorrowByBorrowId(Long borrowId);
}
