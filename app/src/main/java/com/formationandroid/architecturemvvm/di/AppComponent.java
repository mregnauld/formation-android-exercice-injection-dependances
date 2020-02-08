package com.formationandroid.architecturemvvm.di;

import android.app.Application;

import com.formationandroid.architecturemvvm.DIApplication;
import com.formationandroid.architecturemvvm.repositories.MainRepository;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class})
public interface AppComponent extends AndroidInjector<DIApplication>
{
	
	@Component.Builder
	interface Builder
	{
		
		@BindsInstance
		Builder application(Application application);
		
		AppComponent build();
	}
	
	void inject(MainRepository mainRepository);
	
}