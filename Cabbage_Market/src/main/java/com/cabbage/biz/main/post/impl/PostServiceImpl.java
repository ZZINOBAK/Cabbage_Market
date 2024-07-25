package com.cabbage.biz.main.post.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbage.biz.main.post.PostService;
import com.cabbage.biz.main.post.PostVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service("mainPostService")
public class PostServiceImpl implements PostService {
	@Autowired //타입이 일치하는 객체(인스턴스) 주입
	private final MainDAO postDAO;
	
	@Override
	public List<PostVO> getPostListForNew() {
		return postDAO.getPostListForNew();	
	}


	@Override
	public List<PostVO> getPostListForRcByVc() {
		return postDAO.getPostListForRcByVc();	
	}


	@Override
	public List<PostVO> getPostListForRcById(String id) {
		return postDAO.getPostListForRcById(id);	
	}

	@Override
	public List<PostVO> getPostListForNewAll(int begin, int end) {
		return postDAO.getPostListForNewAll(begin, end);	
	}

	@Override
	public List<PostVO> getPostListForRcByVcAll(int begin, int end) {
		return postDAO.getPostListForRcByVcAll(begin, end);	
	}
	
	@Override
	public int countNewAll() {
		return postDAO.countNewAll();	
	}

	@Override
	public int countVcAll() {
		return postDAO.countVcAll();	
	}
	
	@Override
	public int countIdAll(String id) {
		return postDAO.countIdAll(id);	
	}
	@Override
	public List<PostVO> getPostListForRcByIdAll(String id, int begin, int end) {
		return postDAO.getPostListForRcByIdAll(id, begin, end);	
	}

	@Override
	public void insertPost(PostVO vo) {
		postDAO.insertPost(vo);		
	}

	@Override
	public void updatePost(PostVO vo) {
		postDAO.updatePost(vo);
		
	}


	@Override
	public List<PostVO> getTop100Post() {
		return postDAO.getTop100Post();
	}
	
}
