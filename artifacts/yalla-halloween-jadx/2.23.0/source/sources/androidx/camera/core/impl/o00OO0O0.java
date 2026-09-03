package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class o00OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Range<Integer> f3743OooO00o = new Range<>(0, 0);

    @AutoValue.Builder
    public static abstract class OooO00o {
    }

    @NonNull
    public abstract DynamicRange OooO00o();

    @NonNull
    public abstract Range<Integer> OooO0O0();

    @Nullable
    public abstract Config OooO0OO();

    @NonNull
    public abstract Size OooO0Oo();

    @NonNull
    public abstract OooOo.OooO00o OooO0o0();
}
