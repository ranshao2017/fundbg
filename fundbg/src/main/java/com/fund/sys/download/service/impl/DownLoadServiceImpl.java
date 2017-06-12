package com.fund.sys.download.service.impl;

import org.springframework.stereotype.Service;

import com.fund.frame.base.BaseService;
import com.fund.sys.download.service.DownLoadService;
import com.fund.sys.entity.DownLoad;

@Service
public class DownLoadServiceImpl extends BaseService implements DownLoadService{
	
	/**
	 * 常用下载
	 */
	@Override
	public DownLoad querydownLoadAssistFile(String fileID) throws Exception {
		return commonDao.findEntityByID(DownLoad.class, fileID);
	}
	
}