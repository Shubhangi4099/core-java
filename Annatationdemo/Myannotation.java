package com.test.Annatationdemo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Myannotation {
   public abstract String devloperName();
   public abstract String expirydate();
}
