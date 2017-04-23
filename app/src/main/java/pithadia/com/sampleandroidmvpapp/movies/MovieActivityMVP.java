package pithadia.com.sampleandroidmvpapp.movies;

import rx.Observable;

public interface MovieActivityMVP {

    interface View {

        void updateData(ViewModel viewModel);

        void showSnackbar(String s);

    }

    interface Presenter {

        void loadData();

        void rxUnsubscribe();

        void setView(MovieActivityMVP.View view);
    }

    interface Model {

        Observable<ViewModel> result();
    }
}
