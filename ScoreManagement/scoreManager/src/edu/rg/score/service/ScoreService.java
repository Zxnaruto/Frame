package edu.rg.score.service;

import java.util.List;

import edu.rg.score.dao.ScoreDao;
import edu.rg.score.entity.Score;

public class ScoreService {
	
	//ScoreDao dao = new ScoreDao();
	public ScoreDao scoreDao;//ʹ������ע��
	

	public List<Score> getScoreList(){
		return scoreDao.getScoreList();
	}
	//�б�
	public ScoreDao getScoreDao() {
		return scoreDao;
	}


   
	public void setScoreDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	//����
	public boolean addScore(Score score){
		try {
			scoreDao.addScore(score);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	//ɾ��
	public boolean delScore(Score score){
		try {
			scoreDao.delScore(score);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

    //����ID�����
	public Score getScore(String id){
		Score score=null;
		try {
			score = scoreDao.getScore(id);
			return score;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return score;
	}
	//�޸�ѧ�����Գɼ�
	public boolean updateScore(Score score){
		try {
			scoreDao.updateScore(score);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
}
