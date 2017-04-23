package pithadia.com.sampleandroidmvpapp.movies;

import pithadia.com.sampleandroidmvpapp.http.MoreInfoApiService;
import pithadia.com.sampleandroidmvpapp.http.MovieApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MovieModule {

    @Provides
    public MovieActivityMVP.Presenter provideTopMoviesActivityPresenter(MovieActivityMVP.Model topMoviesModel) {
        return new MoviePresenter(topMoviesModel);
    }

    @Provides
    public MovieActivityMVP.Model provideTopMoviesActivityModel(Repository repository) {
        return new MovieModel(repository);
    }

    @Singleton
    @Provides
    public Repository provideRepo(MovieApiService movieApiService, MoreInfoApiService moreInfoApiService) {
        return new MovieRepository(movieApiService, moreInfoApiService);
    }


}
