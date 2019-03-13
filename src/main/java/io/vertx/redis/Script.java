package io.vertx.redis;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.redis.impl.ScriptImpl;

/**
 * Container for a script and its sha1 hash.
 * @deprecated
 * @see io.vertx.redis.client.Redis for the new API.
 */
@VertxGen
@Deprecated
public interface Script {
  static Script create(String script) {
    return new ScriptImpl(script);
  }
  static Script create(String script, String sha1) {
    return new ScriptImpl(script, sha1);
  }

  String getScript();
  String getSha1();
}
