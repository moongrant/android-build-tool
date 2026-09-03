package p118o00O0Oo;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.OooO00o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo implements OooOO0, OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f30737OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooOO0O.OooO00o> f30738OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ShapeTrimPath.Type f30739OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O<?, Float> f30740OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0O<?, Float> f30741OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O<?, Float> f30742OooO0o0;

    public o0ooOOo(OooO00o oooO00o, ShapeTrimPath shapeTrimPath) {
        Objects.requireNonNull(shapeTrimPath);
        this.f30737OooO00o = shapeTrimPath.f10137OooO0o;
        this.f30739OooO0OO = shapeTrimPath.f10134OooO0O0;
        OooOO0O<Float, Float> oooOO0OOooO00o = shapeTrimPath.f10135OooO0OO.OooO00o();
        this.f30740OooO0Oo = (OooOOOO) oooOO0OOooO00o;
        OooOO0O<Float, Float> oooOO0OOooO00o2 = shapeTrimPath.f10136OooO0Oo.OooO00o();
        this.f30742OooO0o0 = (OooOOOO) oooOO0OOooO00o2;
        OooOO0O<Float, Float> oooOO0OOooO00o3 = shapeTrimPath.f10138OooO0o0.OooO00o();
        this.f30741OooO0o = (OooOOOO) oooOO0OOooO00o3;
        oooO00o.OooO0oO(oooOO0OOooO00o);
        oooO00o.OooO0oO(oooOO0OOooO00o2);
        oooO00o.OooO0oO(oooOO0OOooO00o3);
        oooOO0OOooO00o.OooO00o(this);
        oooOO0OOooO00o2.OooO00o(this);
        oooOO0OOooO00o3.OooO00o(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O$OooO00o>] */
    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        for (int i = 0; i < this.f30738OooO0O0.size(); i++) {
            ((OooOO0O.OooO00o) this.f30738OooO0O0.get(i)).OooO0O0();
        }
    }

    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O$OooO00o>] */
    public final void OooO0Oo(OooOO0O.OooO00o oooO00o) {
        this.f30738OooO0O0.add(oooO00o);
    }
}
