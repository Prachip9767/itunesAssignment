// Generated by Dagger (https://dagger.dev).
package com.app.appliitunes.di;

import com.app.appliitunes.remote.ApiClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ItunesModule_ApiServiceFactory implements Factory<ApiClient> {
  @Override
  public ApiClient get() {
    return apiService();
  }

  public static ItunesModule_ApiServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiClient apiService() {
    return Preconditions.checkNotNullFromProvides(ItunesModule.INSTANCE.apiService());
  }

  private static final class InstanceHolder {
    private static final ItunesModule_ApiServiceFactory INSTANCE = new ItunesModule_ApiServiceFactory();
  }
}
