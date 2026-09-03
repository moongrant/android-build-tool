package p136o00OO0oO;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import o00OO0.OooO0OO;
import o00OO0.o000oOoO;
import p134o00OO0o.o00000;
import p134o00OO0o.o0Oo0oo;
import p134o00OO0o.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f37362OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000<PointF, PointF> f37363OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000<PointF, PointF> f37364OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo000o f37365OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f37366OooO0o0;

    public OooOOO0(String str, o00000 o00000Var, o0Oo0oo o0oo0oo2, oo000o oo000oVar, boolean z) {
        this.f37362OooO00o = str;
        this.f37363OooO0O0 = o00000Var;
        this.f37364OooO0OO = o0oo0oo2;
        this.f37365OooO0Oo = oo000oVar;
        this.f37366OooO0o0 = z;
    }

    @Override // p136o00OO0oO.OooO
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new o000oOoO(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f37363OooO0O0 + ", size=" + this.f37364OooO0OO + '}';
    }
}
