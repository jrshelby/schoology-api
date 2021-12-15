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
public class SchoologyGrade extends SchoologyReference<SchoologyGrade>
{
	
	String enrollment_id;
    String assignment_id;
    String grade;
    int exception;
    int max_points;
    String comment;
    String comment_status;
    String type;
    
	// Incomplete list of fields
	
	
}
