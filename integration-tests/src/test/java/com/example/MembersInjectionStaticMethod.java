package com.example;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import javax.inject.Inject;

@Component(modules = MembersInjectionStaticMethod.Module1.class)
public interface MembersInjectionStaticMethod {
  void inject(Target instance);

  class Target {
    @Inject static void staticMethod(String one) {}
  }

  @Module
  abstract class Module1 {
    @Provides static String one() {
      return "one";
    }
  }
}
