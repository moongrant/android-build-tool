package p610o0oo0Ooo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p607o0oo0OOo.k1;

/* JADX INFO: loaded from: classes5.dex */
public interface q1 {
    void onFailed(int i, @Nullable String str);

    void onVideoComplete();

    boolean onVideoConfigReady(@NotNull k1 k1Var);

    void onVideoDestroy();

    void onVideoRender(int i, @Nullable k1 k1Var);

    void onVideoRestart();

    void onVideoStart();
}
