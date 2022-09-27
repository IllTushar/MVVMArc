package com.example.mvvmarc;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ViewModel extends AndroidViewModel {
    ModelClass modelClass;
    public ViewModel(@NonNull Application application) {
        super(application);
         modelClass = new ModelClass("Tushar is Great");

    }
    public ModelClass getModelClass()
    {
      return this.modelClass;
    }
}
