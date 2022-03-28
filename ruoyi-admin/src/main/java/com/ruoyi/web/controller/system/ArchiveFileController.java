package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.ArchiveFile;
import com.ruoyi.system.service.IArchiveFileService;
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


/**
 * 文档信息表Controller
 * 
 * @author ruoyi
 * @date 2022-03-28
 */
@Controller
@RequestMapping("/system/file")
public class ArchiveFileController extends BaseController
{
    private String prefix = "system/file";

    @Autowired
    private IArchiveFileService archiveFileService;

    @RequiresPermissions("system:file:view")
    @GetMapping()
    public String file()
    {
        return prefix + "/file";
    }

    /**
     * 查询文档信息表列表
     */
    @RequiresPermissions("system:file:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ArchiveFile archiveFile)
    {
        startPage();
        List<ArchiveFile> list = archiveFileService.selectArchiveFileList(archiveFile);
        return getDataTable(list);
    }

    /**
     * 导出文档信息表列表
     */
    @RequiresPermissions("system:file:export")
    @Log(title = "文档信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ArchiveFile archiveFile)
    {
        List<ArchiveFile> list = archiveFileService.selectArchiveFileList(archiveFile);
        ExcelUtil<ArchiveFile> util = new ExcelUtil<ArchiveFile>(ArchiveFile.class);
        return util.exportExcel(list, "文档信息表数据");
    }

    /**
     * 新增文档信息表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存文档信息表
     */
    @RequiresPermissions("system:file:add")
    @Log(title = "文档信息表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ArchiveFile archiveFile)
    {
        return toAjax(archiveFileService.insertArchiveFile(archiveFile));
    }

    /**
     * 修改文档信息表
     */
    @RequiresPermissions("system:file:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ArchiveFile archiveFile = archiveFileService.selectArchiveFileById(id);
        mmap.put("archiveFile", archiveFile);
        return prefix + "/edit";
    }

    /**
     * 修改保存文档信息表
     */
    @RequiresPermissions("system:file:edit")
    @Log(title = "文档信息表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ArchiveFile archiveFile)
    {
        return toAjax(archiveFileService.updateArchiveFile(archiveFile));
    }

    /**
     * 删除文档信息表
     */
    @RequiresPermissions("system:file:remove")
    @Log(title = "文档信息表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(archiveFileService.deleteArchiveFileByIds(ids));
    }
}
