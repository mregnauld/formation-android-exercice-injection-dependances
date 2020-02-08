package com.formationandroid.architecturemvvm;

import com.formationandroid.architecturemvvm.di.AppComponent;
import com.formationandroid.architecturemvvm.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class DIApplication extends DaggerApplication
{
	
	private static DIApplication instance = null;
	private AppComponent appComponent = null;
	
	@Override
	public void onCreate()
	{
		super.onCreate();
		instance = this;
	}
	
	public static AppComponent getAppComponent()
	{
		return instance.appComponent;
	}
	
	@Override
	protected AndroidInjector<? extends DaggerApplication> applicationInjector()
	{
		appComponent = DaggerAppComponent.builder().application(this).build();
		return appComponent;
	}
	
}
