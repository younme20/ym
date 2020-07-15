package kr.ko.ym.study.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ko.ym.common.dao.CommonDao;

@Service("studyService")
public class StudyServiceImpl implements StudyService {
	
	@Autowired
	private CommonDao commonDao;	

	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> selectList(Map<String, Object> param) throws Exception {
		return commonDao.selectList("study.selectList", param);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> selectDetail(Map<String, Object> param) throws Exception {
		return commonDao.selectOne("study.selectDetail", param);
	}

}
