package com.formationandroid.architecturemvvm;

import android.app.Application;

import com.formationandroid.architecturemvvm.di.AppComponent;
import com.formationandroid.architecturemvvm.di.DaggerAppComponent;

public class DIApplication extends Application
{
	
	private static DIApplication instance = null;
	private AppComponent appComponent = null;
	
	@Override
	public void onCreate()
	{
		// initialisation :
		super.onCreate();
		instance = this;
		
		// dagger :
		appComponent = DaggerAppComponent.builder().application(this).build();
	}
	
	public static AppComponent getAppComponent()
	{
		return instance.appComponent;
	}
	
}
