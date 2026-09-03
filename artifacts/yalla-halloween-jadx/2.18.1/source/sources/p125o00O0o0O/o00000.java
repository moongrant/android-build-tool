package p125o00O0o0O;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import p118o00O0Oo.OooOO0;
import p123o00O0o0.OooOO0O;
import p123o00O0o0.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f30990OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo0<PointF, PointF> f30991OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo0<PointF, PointF> f30992OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O f30993OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f30994OooO0o0;

    public o00000(String str, o00Oo0<PointF, PointF> o00oo1, o00Oo0<PointF, PointF> o00oo2, OooOO0O oooOO0O, boolean z) {
        this.f30990OooO00o = str;
        this.f30991OooO0O0 = o00oo1;
        this.f30992OooO0OO = o00oo2;
        this.f30993OooO0Oo = oooOO0O;
        this.f30994OooO0o0 = z;
    }

    @Override // p125o00O0o0O.o000OOo
    public final OooOO0 OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new p118o00O0Oo.o00Oo0(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RectangleShape{position=");
        sbOooO0o0.append(this.f30991OooO0O0);
        sbOooO0o0.append(", size=");
        sbOooO0o0.append(this.f30992OooO0OO);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
