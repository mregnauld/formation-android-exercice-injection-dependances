package com.formationandroid.architecturemvvm.di;

import android.app.Application;
import android.content.Context;

import com.formationandroid.architecturemvvm.ExempleDAO;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = MainComponent.class)
class AppModule
{
	
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
