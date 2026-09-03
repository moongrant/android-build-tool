package androidx.camera.video;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import p039OoooOoo.o000O;
import p039OoooOoo.o000O0;
import p039OoooOoo.o00O000o;
import p039OoooOoo.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f4022OooO00o = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f4023OooO0O0 = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public static final oOO00O f4024OooO0OO;

    @AutoValue.Builder
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class OooO00o {
    }

    static {
        o000O o000o = o00O000o.f1674OooO0OO;
        f4024OooO0OO = oOO00O.OooO0O0(Arrays.asList(o000o, o00O000o.f1673OooO0O0, o00O000o.f1672OooO00o), new o000O0(o000o, 1));
    }

    @NonNull
    public static OooO.OooO00o OooO00o() {
        OooO.OooO00o oooO00o = new OooO.OooO00o();
        oooO00o.OooO0OO(f4024OooO0OO);
        Range<Integer> range = f4022OooO00o;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        oooO00o.f3882OooO0O0 = range;
        Range<Integer> range2 = f4023OooO0O0;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        oooO00o.f3883OooO0OO = range2;
        oooO00o.OooO0O0(-1);
        return oooO00o;
    }

    public abstract int OooO0O0();

    @NonNull
    public abstract Range<Integer> OooO0OO();

    @NonNull
    public abstract Range<Integer> OooO0Oo();

    @NonNull
    public abstract OooO.OooO00o OooO0o();

    @NonNull
    public abstract oOO00O OooO0o0();
}
