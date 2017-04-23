package pithadia.com.sampleandroidmvpapp.root;

import javax.inject.Singleton;

import dagger.Component;
import pithadia.com.sampleandroidmvpapp.http.ApiModuleForInfo;
import pithadia.com.sampleandroidmvpapp.http.ApiModuleForName;
import pithadia.com.sampleandroidmvpapp.movies.MovieActivity;
import pithadia.com.sampleandroidmvpapp.movies.MovieModule;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForName.class, ApiModuleForInfo.class, MovieModule.class})
public interface ApplicationComponent {

    void inject(MovieActivity target);

}
