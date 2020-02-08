package com.formationandroid.architecturemvvm.di;

import android.app.Application;
import android.content.Context;

import com.formationandroid.architecturemvvm.ExempleDAO;
import com.formationandroid.architecturemvvm.activites.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class AppModule
{
	
	@ContributesAndroidInjector(modules = {MainModule.class})
	abstract MainActivity contributeMainActivity();
	
	@Provides
	static Context provideContext(Application application)
	{
		return application;
	}
	
	@Singleton
	@Provides
	static ExempleDAO provideExempleDAO()
	{
		return new ExempleDAO();
	}
	
}
