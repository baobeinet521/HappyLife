package com.ilife.common.log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.util.Log;

import static com.ilife.common.log.Utils.checkNotNull;

/**
 * LogCat implementation for {@link LogStrategy}
 *
 * This simply prints out all logs to Logcat by using standard {@link Log} class.
 */
public class LogcatLogStrategy implements LogStrategy {

  static final String DEFAULT_TAG = "ILifeLog";

  @Override public void log(int priority, @Nullable String tag, @NonNull String message) {
    checkNotNull(message);

    if (tag == null) {
      tag = DEFAULT_TAG;
    }

    Log.println(priority, tag, message);
  }
}
