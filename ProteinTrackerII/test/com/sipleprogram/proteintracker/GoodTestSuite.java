package com.sipleprogram.proteintracker;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@IncludeCategory(GoodTestCategory.class)
@ExcludeCategory(BadTestCategory.class) 
@Suite.SuiteClasses({ 
	HelloJUnitTest.class, 
	TrackingServiceTest.class })
public class GoodTestSuite {

}
