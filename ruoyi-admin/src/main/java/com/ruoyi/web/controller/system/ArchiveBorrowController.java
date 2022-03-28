package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ArchiveBorrow;
import com.ruoyi.system.service.IArchiveBorrowService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 借阅信息Controller
 * 
 * @author ruoyi
 * @date 2022-03-28
 */
@Controller
@RequestMapping("/system/borrow")
public class ArchiveBorrowController extends BaseController
{
    private String prefix = "system/borrow";

    @Autowired
    private IArchiveBorrowService archiveBorrowService;

    @RequiresPermissions("system:borrow:view")
    @GetMapping()
    public String borrow()
    {
        return prefix + "/borrow";
    }

    /**
     * 查询借阅信息列表
     */
    @RequiresPermissions("system:borrow:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ArchiveBorrow archiveBorrow)
    {
        startPage();
        List<ArchiveBorrow> list = archiveBorrowService.selectArchiveBorrowList(archiveBorrow);
        return getDataTable(list);
    }

    /**
     * 导出借阅信息列表
     */
    @RequiresPermissions("system:borrow:export")
    @Log(title = "借阅信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ArchiveBorrow archiveBorrow)
    {
        List<ArchiveBorrow> list = archiveBorrowService.selectArchiveBorrowList(archiveBorrow);
        ExcelUtil<ArchiveBorrow> util = new ExcelUtil<ArchiveBorrow>(ArchiveBorrow.class);
        return util.exportExcel(list, "借阅信息数据");
    }

    /**
     * 新增借阅信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存借阅信息
     */
    @RequiresPermissions("system:borrow:add")
    @Log(title = "借阅信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ArchiveBorrow archiveBorrow)
    {
        return toAjax(archiveBorrowService.insertArchiveBorrow(archiveBorrow));
    }

    /**
     * 修改借阅信息
     */
    @RequiresPermissions("system:borrow:edit")
    @GetMapping("/edit/{borrowId}")
    public String edit(@PathVariable("borrowId") Long borrowId, ModelMap mmap)
    {
        ArchiveBorrow archiveBorrow = archiveBorrowService.selectArchiveBorrowByBorrowId(borrowId);
        mmap.put("archiveBorrow", archiveBorrow);
        return prefix + "/edit";
    }

    /**
     * 修改保存借阅信息
     */
    @RequiresPermissions("system:borrow:edit")
    @Log(title = "借阅信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ArchiveBorrow archiveBorrow)
    {
        return toAjax(archiveBorrowService.updateArchiveBorrow(archiveBorrow));
    }

    /**
     * 删除借阅信息
     */
    @RequiresPermissions("system:borrow:remove")
    @Log(title = "借阅信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(archiveBorrowService.deleteArchiveBorrowByBorrowIds(ids));
    }
}
