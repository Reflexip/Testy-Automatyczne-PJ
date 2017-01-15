/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tau.lab04;

import static java.util.Arrays.asList;
import java.util.List;
import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.SilentStepMonitor;
import org.jbehave.web.selenium.ContextView;
import org.jbehave.web.selenium.LocalFrameContextView;
import org.jbehave.web.selenium.PerStoryWebDriverSteps;
import org.jbehave.web.selenium.SeleniumConfiguration;
import org.jbehave.web.selenium.SeleniumContext;
import org.jbehave.web.selenium.SeleniumStepMonitor;
import org.jbehave.web.selenium.TypeWebDriverProvider;
import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.web.selenium.WebDriverScreenshotOnFailure;
import org.jbehave.web.selenium.WebDriverSteps;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.tau.lab04.steps.RebelBasketSteps;
import pl.tau.lab04.steps.RebelGameSteps;
import pl.tau.lab04.steps.RebelHomeSteps;
import pl.tau.lab04.steps.RebelRegistrationSteps;

/**
 *
 * @author Dawid
 */
public class RebelWebTest extends JUnitStories{
    private WebDriverProvider driverProvider = new TypeWebDriverProvider(ChromeDriver.class);
    private WebDriverSteps steps = new PerStoryWebDriverSteps(driverProvider);
    private Pages pages = new Pages(driverProvider);
    private SeleniumContext context = new SeleniumContext();
    private ContextView contextView = new LocalFrameContextView().sized(500, 100);

    public RebelWebTest(){
        System.setProperty("webdriver.chrome.driver","C:/Users/Dawid/Programowanie/Bilbioteki/chromedriver.exe");
    }
    
    
    
    @Override
	public Configuration configuration() {
		Class<? extends Embeddable> embeddableClass = this.getClass();
		return new SeleniumConfiguration()
                .useSeleniumContext(context)
                .useWebDriverProvider(driverProvider)
				.useStepMonitor(new SeleniumStepMonitor(contextView, context, new SilentStepMonitor()))
				.useStoryLoader(new LoadFromClasspath(embeddableClass))
                .useStoryReporterBuilder(new StoryReporterBuilder()
                    .withCodeLocation(codeLocationFromClass(embeddableClass))
                    .withDefaultFormats()
                    .withFormats(Format.CONSOLE, Format.TXT));
	}
        @Override
	public InjectableStepsFactory stepsFactory() {
		Configuration configuration = configuration();
		return new InstanceStepsFactory(configuration,
                    new RebelHomeSteps(pages),
                    new RebelRegistrationSteps(pages),
                    new RebelGameSteps(pages),
                    new RebelBasketSteps(pages),
                    steps,
                    new WebDriverScreenshotOnFailure(driverProvider, configuration.storyReporterBuilder()));
        }
        
        @Override
        protected List<String> storyPaths() {
           return new StoryFinder().findPaths(
				codeLocationFromClass(this.getClass()).getFile(),
				asList("**/rebel_web_test.story"), null);
        }
}
