package com.central.file.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.central.common.model.PageResult;
import org.springframework.web.multipart.MultipartFile;

import com.central.file.model.FileInfo;

/**
 * 文件service
 *
 * @Author iris
*/
public interface IFileService extends IService<FileInfo> {
	FileInfo upload(MultipartFile file ) throws Exception;
	
	PageResult<FileInfo> findList(Map<String, Object> params);

	void delete(String id);
}
