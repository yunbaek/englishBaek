package com.engbaek.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.engbaek.domain.Criteria;
import com.engbaek.domain.FaqVO;
import com.engbaek.domain.NoticeVO;

public interface FaqMapper {


	//FAQ 총 게시물 수  
	public int getTotalCount(Criteria cri);
	
	//FAQ 게시판 페이징 
	public List<FaqVO> getListWithPaging(Criteria cri);
	
	public List<FaqVO> getList();
	
	//FAQ 수정 
	public int update(FaqVO faq);
		
	//FAQ 삭제 
	public int delete(Long faqNo);
	
	//FAQ 읽기 
	public FaqVO read(Long faqNo);
	
	//게시물 번호 사용자에게 보이게 하기 
	public Integer insertSelectKey(FaqVO faq);

}
