package net.rvanasa.schoology.obj.assignments;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import net.rvanasa.schoology.obj.SchoologyPage;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/discussion-thread
 * Represents a page of discussions
 */
@Getter
public class SchoologyGradingCategoriesPage extends SchoologyPage<SchoologyGradingCategoriesPage>
{
	
	@SerializedName(value="grading_category")
	SchoologyGradingCategory[] categories;
	
}
