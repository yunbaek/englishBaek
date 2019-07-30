package com.engbaek.service;

import java.util.List;

import com.engbaek.domain.Criteria;
import com.engbaek.domain.NoticeVO;

public interface NoticeService {
	
	public int getTotal(Criteria cri);
	public List<NoticeVO> getList(Criteria cri);
	public void register(NoticeVO notice);
	public NoticeVO get(Long bno);
	public boolean modify(NoticeVO notice);
	public boolean remove(Long notice_bno);
	
}