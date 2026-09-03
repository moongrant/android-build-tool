package p125o00O0o0O;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import p118o00O0Oo.OooOO0;
import p118o00O0Oo.OooOOO;
import p123o00O0o0.OooOo00;
import p123o00O0o0.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f31022OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo0<PointF, PointF> f31023OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo00 f31024OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f31025OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f31026OooO0o0;

    public o0O0O00(String str, o00Oo0<PointF, PointF> o00oo1, OooOo00 oooOo00, boolean z, boolean z2) {
        this.f31022OooO00o = str;
        this.f31023OooO0O0 = o00oo1;
        this.f31024OooO0OO = oooOo00;
        this.f31025OooO0Oo = z;
        this.f31026OooO0o0 = z2;
    }

    @Override // p125o00O0o0O.o000OOo
    public final OooOO0 OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new OooOOO(lottieDrawable, oooO00o, this);
    }
}
