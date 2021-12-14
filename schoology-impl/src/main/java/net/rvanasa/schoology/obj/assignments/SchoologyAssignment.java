package net.rvanasa.schoology.obj.assignments;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/discussion-thread
 */
@Getter
public class SchoologyAssignment extends SchoologyReference<SchoologyAssignment>
{
	String title;
	String description;
	
	Date due;
	@SerializedName(value="max_points")
	float maxPoints;
	float factor;
	
	@SerializedName(value="grade_item_id")
	String gradeItemID;
	@SerializedName(value="grading_scale")
	int gradingScale;
	@SerializedName(value="grading_period")
	int gradingPeriod;
	@SerializedName(value="grading_category")
	int gradingCateogry;
	
	String type;
	
	@SerializedName(value="is_final")
	boolean isFinal;
	boolean published;
	
	@SerializedName(value="id")
	String ID;

	
	SchoologyLinks links;
	
}
