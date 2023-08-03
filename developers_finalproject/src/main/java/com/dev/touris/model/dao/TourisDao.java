package com.dev.touris.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.dev.touris.model.vo.Touris;
import com.dev.touris.model.vo.TourisArea;

public interface TourisDao {
	//메인페이지에서 전국지역선택하는 페이지
	List<TourisArea> tourisMainSelectMapPage(SqlSessionTemplate session);
	//메인페이지 지역별 소개 모달창 띄어주기
	List<TourisArea> selectTourisArea(SqlSessionTemplate session, String areaName);
	
	//여행경로 대표지역에 대한것들 뿌려주는
	TourisArea selecttourisarea(SqlSessionTemplate session, String areaId);
	//여행경로 관광지 보여주는 페이지
	List<Touris> selecttourislist(SqlSessionTemplate session, String areaId);
}
