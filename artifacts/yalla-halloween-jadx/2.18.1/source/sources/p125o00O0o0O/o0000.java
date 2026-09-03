package p125o00O0o0O;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import p028Oooo0o0.o0O0ooO;
import p118o00O0Oo.OooOO0;
import p118o00O0Oo.oo000o;
import p123o00O0o0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f30986OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f30987OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo000 f30988OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f30989OooO0Oo;

    public o0000(String str, int i, Oooo000 oooo000, boolean z) {
        this.f30986OooO00o = str;
        this.f30987OooO0O0 = i;
        this.f30988OooO0OO = oooo000;
        this.f30989OooO0Oo = z;
    }

    @Override // p125o00O0o0O.o000OOo
    public final OooOO0 OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new oo000o(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ShapePath{name=");
        sbOooO0o0.append(this.f30986OooO00o);
        sbOooO0o0.append(", index=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f30987OooO0O0, '}');
    }
}
