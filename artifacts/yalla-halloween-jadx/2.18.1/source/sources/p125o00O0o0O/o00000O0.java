package p125o00O0o0O;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import p118o00O0Oo.OooOO0;
import p118o00O0Oo.o00Ooo;
import p123o00O0o0.OooOO0O;
import p123o00O0o0.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f31008OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f31009OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O f31010OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0O f31011OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f31012OooO0o0;

    public o00000O0(String str, OooOO0O oooOO0O, OooOO0O oooOO0O2, o00O0O o00o0o2, boolean z) {
        this.f31008OooO00o = str;
        this.f31009OooO0O0 = oooOO0O;
        this.f31010OooO0OO = oooOO0O2;
        this.f31011OooO0Oo = o00o0o2;
        this.f31012OooO0o0 = z;
    }

    @Override // p125o00O0o0O.o000OOo
    @Nullable
    public final OooOO0 OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new o00Ooo(lottieDrawable, oooO00o, this);
    }
}
