package p136o00OO0oO;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import o00OO0.OooO0OO;
import o00OO0.OooOO0;
import p134o00OO0o.o00000;
import p134o00OO0o.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f37342OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000<PointF, PointF> f37343OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0Oo0oo f37344OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f37345OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f37346OooO0o0;

    public OooO0o(String str, o00000<PointF, PointF> o00000Var, o0Oo0oo o0oo0oo2, boolean z, boolean z2) {
        this.f37342OooO00o = str;
        this.f37343OooO0O0 = o00000Var;
        this.f37344OooO0OO = o0oo0oo2;
        this.f37345OooO0Oo = z;
        this.f37346OooO0o0 = z2;
    }

    @Override // p136o00OO0oO.OooO
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new OooOO0(lottieDrawable, oooO00o, this);
    }
}
