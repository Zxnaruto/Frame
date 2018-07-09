package edu.rg.score.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.rg.score.entity.Score;

public class ScoreDao extends HibernateDaoSupport{
	
	@SuppressWarnings("unchecked")
	//��ѯѧԱ�б�
	public List<Score> getScoreList(){
		return this.getHibernateTemplate().find("from Score");
	}
	//���ѧ����Ϣ
	public void addScore(Score score){
		this.getHibernateTemplate().save(score);
	}
	//ɾ��ѧ����Ϣ
	public void delScore(Score score){
		this.getHibernateTemplate().delete(score);
	}
	//ͨ��ID��ѯѧ����Ϣ
	public Score getScore(String id){
		return this.getHibernateTemplate().get(Score.class, id);
	}
	//ͨ��ID�޸�ѧ����Ϣ
	public void updateScore(Score score){
		this.getHibernateTemplate().bulkUpdate("update Score set stuName = ?,dailyScore = ?,"+"examScore = ?,clsNo=? where stuNo=?",
				score.getStuName(),score.getDailyScore(),score.getExamScore(),score.getClsNo(),score.getStuNo());
	}
}
