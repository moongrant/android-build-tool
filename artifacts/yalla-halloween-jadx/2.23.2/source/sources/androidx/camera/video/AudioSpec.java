package androidx.camera.video;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class AudioSpec {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f3874OooO00o = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f3875OooO0O0 = new Range<>(0, Integer.MAX_VALUE);

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ChannelCount {
    }

    @AutoValue.Builder
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class OooO00o {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Source {
    }

    static {
        androidx.camera.video.OooO00o.C0016OooO00o c0016OooO00oOooO00o = OooO00o();
        c0016OooO00oOooO00o.f3894OooO0o0 = 0;
        c0016OooO00oOooO00o.OooO00o();
    }

    @NonNull
    public static androidx.camera.video.OooO00o.C0016OooO00o OooO00o() {
        androidx.camera.video.OooO00o.C0016OooO00o c0016OooO00o = new androidx.camera.video.OooO00o.C0016OooO00o();
        c0016OooO00o.f3891OooO0O0 = -1;
        c0016OooO00o.f3892OooO0OO = -1;
        c0016OooO00o.f3894OooO0o0 = -1;
        Range<Integer> range = f3874OooO00o;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        c0016OooO00o.f3890OooO00o = range;
        Range<Integer> range2 = f3875OooO0O0;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        c0016OooO00o.f3893OooO0Oo = range2;
        return c0016OooO00o;
    }

    @NonNull
    public abstract Range<Integer> OooO0O0();

    public abstract int OooO0OO();

    @NonNull
    public abstract Range<Integer> OooO0Oo();

    public abstract int OooO0o();

    public abstract int OooO0o0();
}
