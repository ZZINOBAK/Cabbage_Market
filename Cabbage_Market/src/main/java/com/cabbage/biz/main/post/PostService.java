package com.cabbage.biz.main.post;

import java.util.List;

public interface PostService {
	//CRUD 기능 구현 메소드 정의
	void insertPost(PostVO vo);
	void updatePost(PostVO vo);
	
	//메인페이지용 메소드 정의
	List<PostVO> getPostListForNew();
	List<PostVO> getPostListForRcByVc();
	List<PostVO> getPostListForRcById(String id);
	
	List<PostVO> getPostListForNewAll(int begin, int end);
	List<PostVO> getPostListForRcByVcAll(int begin, int end);
	List<PostVO> getPostListForRcByIdAll(String id, int begin, int end);

	int countVcAll();
	int countNewAll();
	int countIdAll(String id);
	
	List<PostVO> getTop100Post();
}
