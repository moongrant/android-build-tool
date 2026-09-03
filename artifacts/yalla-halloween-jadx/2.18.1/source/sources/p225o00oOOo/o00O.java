package p225o00oOOo;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.OooOO0O;
import p021OooOooo.oo000o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00O f33854OooO0O0 = new o00O();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo000o<String, OooOO0O> f33855OooO00o = new oo000o<>(20);

    @VisibleForTesting
    public o00O() {
    }

    public final void OooO00o(@Nullable String str, OooOO0O oooOO0O) {
        if (str == null) {
            return;
        }
        this.f33855OooO00o.put(str, oooOO0O);
    }
}
