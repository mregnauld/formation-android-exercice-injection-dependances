package com.formationandroid.architecturemvvm.di;

import com.formationandroid.architecturemvvm.activites.MainActivity;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {MainModule.class})
public interface MainComponent
{
	@Subcomponent.Factory
	interface Factory
	{
		MainComponent create();
	}
	
	void inject(MainActivity mainActivity);
}