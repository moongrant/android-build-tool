package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface o0Oo0oo extends CameraInfo {
    void OooO(@NonNull p033OoooO0O.o0ooOOo o0ooooo, @NonNull p440o0OoOo0.o00Oo0 o00oo1);

    @NonNull
    Set<DynamicRange> OooO00o();

    @NonNull
    String OooO0Oo();

    @NonNull
    List<Size> OooO0o(int i);

    @NonNull
    oo0o0O0 OooO0oO();

    @NonNull
    List<Size> OooO0oo(int i);

    void OooOO0(@NonNull o000oOoO o000oooo2);

    @NonNull
    o0Oo0oo OooOO0O();

    @NonNull
    Timebase OooOO0o();

    @NonNull
    o0000O OooOOOO();
}
