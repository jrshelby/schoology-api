package net.rvanasa.schoology.obj.assignments;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import net.rvanasa.schoology.obj.SchoologyPage;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/discussion-thread
 * Represents a page of discussions
 */
@Getter
public class SchoologyGradesPage extends SchoologyPage<SchoologyGradesPage>
{
	
	@SerializedName(value="grade")
	SchoologyGrade[] grades;
	
}
