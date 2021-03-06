package pithadia.com.sampleandroidmvpapp.movies;

import pithadia.com.sampleandroidmvpapp.http.apimodel.Result;

import rx.Observable;
import rx.functions.Func2;

public class MovieModel implements MovieActivityMVP.Model {

    private Repository repository;

    public MovieModel(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Observable<ViewModel> result() {

        return Observable.zip(repository.getResultData(), repository.getCountryData(), new Func2<Result, String, ViewModel>() {
            @Override
            public ViewModel call(Result result, String s) {
                return new ViewModel(result.title,s);
            }
        });
    }

}
