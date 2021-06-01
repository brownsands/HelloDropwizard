package com.javaeeee.hellodropwizard;

import com.javaeeee.restcontroller.GameApplicationREST;



import io.dropwizard.Application;

import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloDropWizardApplication extends Application<HelloDropWizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloDropWizardApplication().run(args);
    }

   

    @Override
    public void initialize(final Bootstrap<HelloDropWizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloDropWizardConfiguration configuration,
                    final Environment e) {
        // TODO: implement application
    	e.jersey().register(new GameApplicationREST());
    	
    }

}
