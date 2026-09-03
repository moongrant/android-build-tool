package p125o00O0o0O;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import java.util.Arrays;
import java.util.List;
import p118o00O0Oo.OooOO0;
import p118o00O0Oo.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f31019OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<o000OOo> f31020OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f31021OooO0OO;

    public o0000Ooo(String str, List<o000OOo> list, boolean z) {
        this.f31019OooO00o = str;
        this.f31020OooO0O0 = list;
        this.f31021OooO0OO = z;
    }

    @Override // p125o00O0o0O.o000OOo
    public final OooOO0 OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new OooOO0O(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ShapeGroup{name='");
        sbOooO0o0.append(this.f31019OooO00o);
        sbOooO0o0.append("' Shapes: ");
        sbOooO0o0.append(Arrays.toString(this.f31020OooO0O0.toArray()));
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
