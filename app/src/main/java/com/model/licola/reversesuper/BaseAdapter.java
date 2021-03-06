package com.model.licola.reversesuper;

import android.support.annotation.IntRange;
import java.lang.Integer;
import java.lang.String;

/**
 * Created by @ReverseExtend on 2019/04/04 11:09:16 
 * 该抽象类由{@link Adapter}类自动生成
 * 注：同名包下，存在BaseAdapter就不会再次生成代码
 */
public abstract class BaseAdapter {
  public abstract String reverseMethod(String input);

  public abstract String reversMethod(@IntRange(from = 0, to = 10) Integer integer,
      @Adapter.Type int type);

  protected abstract void reversMethod();
}
