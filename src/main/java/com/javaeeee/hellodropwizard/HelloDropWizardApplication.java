package com.javaeeee.hellodropwizard;

import java.util.Map;
import io.dropwizard.forms.MultiPartBundle;
import com.javaeeee.restcontroller.GameApplicationREST;
import com.javaeeee.restcontroller.PlayerResouce;

import io.dropwizard.Application;
//import io.dropwizard.ConfiguredBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class HelloDropWizardApplication extends Application<HelloDropWizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloDropWizardApplication().run(args);
    }

   

    @Override
    public void initialize(final Bootstrap<HelloDropWizardConfiguration> bootstrap) {
        // TODO: application initialization
    	 bootstrap.addBundle(new ViewBundle<HelloDropWizardConfiguration>()) ;
    	 bootstrap.addBundle(new MultiPartBundle());					
    }

    @Override
    public void run(final HelloDropWizardConfiguration configuration,
                    final Environment e) {
        // TODO: implement application
    	
    	e.jersey().register(new GameApplicationREST());
    	e.jersey().register(new PlayerResouce());
    	
    	 final HelloDropWizardResource resource = new HelloDropWizardResource(
    		        configuration.getTemplate(),
    		        configuration.getDefaultName()
    		    );
    		  e.jersey().register(resource);
    }

}
