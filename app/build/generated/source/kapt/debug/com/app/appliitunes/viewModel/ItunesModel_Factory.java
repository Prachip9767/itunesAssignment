// Generated by Dagger (https://dagger.dev).
package com.app.appliitunes.viewModel;

import com.app.appliitunes.repository.ItunesRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ItunesModel_Factory implements Factory<ItunesModel> {
  private final Provider<ItunesRepo> itunesRepoProvider;

  public ItunesModel_Factory(Provider<ItunesRepo> itunesRepoProvider) {
    this.itunesRepoProvider = itunesRepoProvider;
  }

  @Override
  public ItunesModel get() {
    return newInstance(itunesRepoProvider.get());
  }

  public static ItunesModel_Factory create(Provider<ItunesRepo> itunesRepoProvider) {
    return new ItunesModel_Factory(itunesRepoProvider);
  }

  public static ItunesModel newInstance(ItunesRepo itunesRepo) {
    return new ItunesModel(itunesRepo);
  }
}
