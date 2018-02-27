package com.srct.ril.poas.ai;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;

import com.srct.ril.poas.ai.category.Category;
import com.srct.ril.poas.ai.category.Category.Sentiment;
import com.srct.ril.poas.service.ai.NLPAnalysisService;
import com.srct.ril.poas.utils.log.Log;

public class NLPItem {
	
	private Integer id;
	private String modelName;
	private String origin;
	private String timestamp;
	private String title;
	private String comment;
	private NLPAnalysis titleAnalysis;
	private NLPAnalysis commentAnalysis;
	private String url;
	
	private Sentiment sentiment;
	private String category;
		
	public NLPItem(String modelName, String origin, Object obj, Class<?> clazz) {
		//Log.i("NLPItem:  origin {} modelName {}", origin,modelName);
		this.origin = origin;
		this.modelName = modelName;
		Method method;
		try {
			method = clazz.getMethod("getId");
			id = (Integer)method.invoke(obj);
		} catch (NoSuchMethodException | 
				SecurityException | 
				IllegalAccessException | 
				IllegalArgumentException | 
				InvocationTargetException e) {
		}
		try {
			method = clazz.getMethod("getDate");
			timestamp = (String)method.invoke(obj);
		} catch (NoSuchMethodException | 
				SecurityException | 
				IllegalAccessException | 
				IllegalArgumentException | 
				InvocationTargetException e) {
		}
		try {
			method = clazz.getMethod("getLink");
			url = (String)method.invoke(obj);
		} catch (NoSuchMethodException | 
				SecurityException | 
				IllegalAccessException | 
				IllegalArgumentException | 
				InvocationTargetException e) {
		}
		try {
			method = clazz.getMethod("getFirstcomment");
			comment = (String)method.invoke(obj);
		} catch (NoSuchMethodException | 
				SecurityException | 
				IllegalAccessException | 
				IllegalArgumentException | 
				InvocationTargetException e) {
		}
		try {
			method = clazz.getMethod("getTitle"); 
			title = (String)method.invoke(obj);
		} catch (NoSuchMethodException | 
				SecurityException | 
				IllegalAccessException | 
				IllegalArgumentException | 
				InvocationTargetException e) {
		}
	}
	
	public void setAnalysis(NLPAnalysis titleAnalysis, NLPAnalysis commentAnalysis) {
		this.titleAnalysis = titleAnalysis;
		this.commentAnalysis = commentAnalysis;
		if(titleAnalysis!=null) {
			if(titleAnalysis.getCategory()!=null) {
				setCategory(titleAnalysis.getCategory());
			}
		}
	}
	
	public boolean needAnalysis() {
		Log.d("sentiment: {} category: {}", sentiment, category);
		return !(
				(sentiment!=Sentiment.UNKNOWN)
				&& 
				(category!=null)
			   );
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public NLPAnalysis getTitleAnalysis() {
		return titleAnalysis;
	}

	public void setTitleAnalysis(NLPAnalysis titleAnalysis) {
		this.titleAnalysis = titleAnalysis;
	}

	public NLPAnalysis getCommentAnalysis() {
		return commentAnalysis;
	}

	public void setCommentAnalysis(NLPAnalysis commentAnalysis) {
		this.commentAnalysis = commentAnalysis;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Sentiment getSentiment() {
		return sentiment;
	}

	public void setSetiment(Sentiment setiment) {
		this.sentiment = sentiment;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}