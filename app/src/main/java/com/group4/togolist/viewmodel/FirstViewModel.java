package com.group4.togolist.viewmodel;

import android.app.Activity;
import android.content.Intent;

import com.group4.togolist.repository.FirebaseHandler;
import com.group4.togolist.view.activities.SignInActivity;
import com.group4.togolist.view.activities.SignUpActivity;

import androidx.lifecycle.ViewModel;

/**
 * Class do : Handle First Activity Buttons
 * Created by Group 4 ITI (Eng/Bassem - Eng Fatma - Eng Ali)
 */

public class FirstViewModel extends ViewModel {

    Activity firstActivity;
    FirebaseHandler firebaseHandler;

    /**
     * FirstViewModel Constructor take activity as input parameter
     */
    public FirstViewModel(Activity firstActivity){
        this.firstActivity = firstActivity;
        firebaseHandler = new FirebaseHandler(firstActivity);
    }


    /**
     * this method called when Sign in Button in the starting activity, it takes you to Sign In Activity
     */
    public void signIn(){
        Intent signInIntent = new Intent(firstActivity, SignInActivity.class);
        firstActivity.startActivity(signInIntent);
    }

    /**
     * this method called when create an Account Button in the starting activity, it takes you to Register Activity
     */
    public void createAccount(){
        Intent signUpIntent = new Intent (firstActivity, SignUpActivity.class);
        firstActivity.startActivity(signUpIntent);
    }


    public void checkFirebaseUser(){
        firebaseHandler.checkFirebaseUser();
    }

}
