package com.fund.sys.download.service;

import com.fund.sys.entity.DownLoad;

public interface DownLoadService {
	
	/**
	 * 常用下载
	 */
	public DownLoad querydownLoadAssistFile(String fileID) throws Exception;

}