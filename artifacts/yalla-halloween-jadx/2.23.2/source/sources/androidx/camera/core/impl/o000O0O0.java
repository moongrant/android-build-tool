package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface o000O0O0 {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OooO00o {
        void OooO00o(@NonNull o000O0O0 o000o0o1);
    }

    @Nullable
    androidx.camera.core.OooOOO0 OooO0O0();

    int OooO0OO();

    void OooO0Oo();

    void OooO0o(@NonNull OooO00o oooO00o, @NonNull Executor executor);

    int OooO0o0();

    @Nullable
    androidx.camera.core.OooOOO0 OooO0oO();

    void close();

    int getHeight();

    @Nullable
    Surface getSurface();

    int getWidth();
}
