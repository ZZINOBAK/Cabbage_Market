package com.cabbage.biz.main.post.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cabbage.biz.main.post.PostVO;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Repository
public class MainDAO {
	
	private final SqlSessionTemplate mybatis;
	
	//글입력
    @Transactional
	public void insertPost(PostVO vo) {
		mybatis.insert("mainPostDAO.insertPost", vo);
		
	}

	//글수정
	public void updatePost(PostVO vo) {
		mybatis.update("mainPostDAO.updatePost", vo);
	}
	
	//최신포스트 출력하기 20개
	public List<PostVO> getPostListForNew() {
		return mybatis.selectList("mainPostDAO.getPostListForNew");
	}
	
	//추천포스트 뷰카운트로 출력하기 20개
	public List<PostVO> getPostListForRcByVc() {
		return mybatis.selectList("mainPostDAO.getPostListForRcByVc");
	}
		
		
	//추천포스트 아이디로 출력하기 20개
	public List<PostVO> getPostListForRcById(String id) {
		return mybatis.selectList("mainPostDAO.getPostListForRcById", id);
	}
	
	//최신포스트 출력하기 전체
	public List<PostVO> getPostListForNewAll(int begin, int end) {
		Map<String, Integer> map = new HashMap<>();
		map.put("begin", begin);
		map.put("end", end);
		return mybatis.selectList("mainPostDAO.getPostListForNewAll", map);
	}
	
	public int countNewAll() {
		return mybatis.selectOne("mainPostDAO.countNewAll");
	}
	
	//추천포스트 뷰카운트로 출력하기 전체
	public List<PostVO> getPostListForRcByVcAll(int begin, int end) {
		Map<String, Integer> map = new HashMap<>();
		map.put("begin", begin);
		map.put("end", end);
		
		return mybatis.selectList("mainPostDAO.getPostListForRcByVcAll", map); 
	}
		
	public int countVcAll() {
		return mybatis.selectOne("mainPostDAO.countVcAll");
	}
		
	//추천포스트 아이디로 출력하기 전체
	public List<PostVO> getPostListForRcByIdAll(String id, int begin, int end) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", id);
		map.put("begin", begin);
		map.put("end", end);
		return mybatis.selectList("mainPostDAO.getPostListForRcByIdAll", map);
	}
	
	public int countIdAll(String id) {
		return mybatis.selectOne("mainPostDAO.countIdAll", id);
	}
	
	public List<PostVO> getTop100Post() {
		return mybatis.selectList("mainPostDAO.getTop100Post");
	}
		
}
