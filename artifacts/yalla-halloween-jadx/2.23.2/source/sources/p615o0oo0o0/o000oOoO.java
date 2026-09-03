package p615o0oo0o0;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612o0oo0OoO.o5;

/* JADX INFO: loaded from: classes4.dex */
public interface o000oOoO {
    void onFailed(int i, @Nullable String str);

    void onVideoComplete();

    boolean onVideoConfigReady(@NotNull o5 o5Var);

    void onVideoDestroy();

    void onVideoRender(int i, @Nullable o5 o5Var);

    void onVideoRestart();

    void onVideoStart();
}
