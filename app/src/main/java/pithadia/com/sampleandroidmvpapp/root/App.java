package pithadia.com.sampleandroidmvpapp.root;

import android.app.Application;

import pithadia.com.sampleandroidmvpapp.http.ApiModuleForInfo;
import pithadia.com.sampleandroidmvpapp.http.ApiModuleForName;
import pithadia.com.sampleandroidmvpapp.movies.MovieModule;

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModuleForName(new ApiModuleForName())
                .movieModule(new MovieModule())
                .apiModuleForInfo(new ApiModuleForInfo())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
