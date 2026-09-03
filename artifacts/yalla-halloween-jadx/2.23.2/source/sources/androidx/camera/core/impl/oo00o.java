package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface oo00o<T> {

    public interface OooO00o<T> {
        void OooO00o(@Nullable T t);

        void onError(@NonNull Throwable th);
    }

    void OooO00o(@NonNull OooO00o oooO00o, @NonNull Executor executor);

    @NonNull
    com.google.common.util.concurrent.OooOO0O<T> OooO0O0();

    void OooO0OO(@NonNull OooO00o<? super T> oooO00o);
}
