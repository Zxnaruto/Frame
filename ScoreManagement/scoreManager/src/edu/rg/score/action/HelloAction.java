package edu.rg.score.action;

import java.util.List;

import edu.rg.score.entity.Score;
import edu.rg.score.service.ScoreService;

public class HelloAction {
	//public String word;
	public List<Score> list;
	public Score score;
	
    public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}



	//ScoreService service = new ScoreService();
	private ScoreService scoreService;//ʹ������ע��
	private String message;
	

	public String execute(){
		list = scoreService.getScoreList();
		return "success";
	}
	
	public ScoreService getScoreService() {
		return scoreService;
	}



	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
    //����ѧԱ��Ϣ
	public String add(){
		boolean flag=scoreService.addScore(score);
		if(flag){
			message="<script>alert('�����ɹ�')</script>";
			return execute();//�����ӳɹ�����ˢ���б�
		}else{
			message="<script>alert('����ʧ��')</script>";
			return "false";
		}
	}
	//ɾ��ѧԱ��Ϣ
	public String del(){
		boolean flag=scoreService.delScore(score);
		if(flag){
			message="<script>alert('ɾ���ɹ�')</script>";
			return execute();//�����ӳɹ�����ˢ���б�
		}else{
			message="<script>alert('ɾ��ʧ��')</script>";
			return "false";
		}
	}

	//����ID�鵽���ѧ���ɼ����󣬰Ѹö���ת����editҳ������޸�
	public String toUpdate(){
		score = scoreService.getScore(score.getStuNo());
		if(score!=null){
			return "edit";
		}else{
			return execute();
		}
	}
	//�޸�ѧ���ɼ�
	public String doUpdate(){
		boolean flag=scoreService.updateScore(score);
		if(flag){
			message="<script>alert('�޸ĳɹ�')</script>";
			return execute();//�����ӳɹ�����ˢ���б�
		}else{
			message="<script>alert('�޸�ʧ��')</script>";
			return "edit";
		}
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
