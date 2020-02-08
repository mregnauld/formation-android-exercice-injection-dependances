package com.formationandroid.architecturemvvm.di;

import com.formationandroid.architecturemvvm.repositories.MainRepository;

import dagger.Module;
import dagger.Provides;

@Module
abstract class MainModule
{
	
	@Provides
	static MainRepository provideMainRepository()
	{
		return new MainRepository();
	}
	
}
