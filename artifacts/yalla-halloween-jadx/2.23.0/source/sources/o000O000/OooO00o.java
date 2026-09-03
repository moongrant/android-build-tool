package o000O000;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO00o {
    @Pure
    public static void OooO00o(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void OooO0O0(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static void OooO0OO(@Nullable View view) {
        if (view == null) {
            throw new IllegalStateException();
        }
    }
}
