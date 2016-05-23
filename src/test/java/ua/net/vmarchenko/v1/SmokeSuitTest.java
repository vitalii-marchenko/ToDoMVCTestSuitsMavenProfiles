package ua.net.vmarchenko.v1;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ua.net.vmarchenko.v1.categories.Buggy;
import ua.net.vmarchenko.v1.categories.Smoke;
import ua.net.vmarchenko.v1.features.ToDoMVCTest;

@RunWith(Categories.class)
@Suite.SuiteClasses(ToDoMVCTest.class)
@Categories.IncludeCategory(Smoke.class)
@Categories.ExcludeCategory(Buggy.class)
public class SmokeSuitTest {

}
