package p118o00O0Oo;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.OooO00o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.o00Ooo;
import p125o00O0o0O.o0000;
import p125o00O0o0O.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o implements o0OoOo0, OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f30744OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f30745OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O<?, Path> f30746OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f30748OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f30743OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO f30747OooO0o = new OooO();

    public oo000o(LottieDrawable lottieDrawable, OooO00o oooO00o, o0000 o0000Var) {
        Objects.requireNonNull(o0000Var);
        this.f30744OooO0O0 = o0000Var.f30989OooO0Oo;
        this.f30745OooO0OO = lottieDrawable;
        OooOO0O<o00000O, Path> oooOO0OOooO00o = o0000Var.f30988OooO0OO.OooO00o();
        this.f30746OooO0Oo = (o00Ooo) oooOO0OOooO00o;
        oooO00o.OooO0oO(oooOO0OOooO00o);
        oooOO0OOooO00o.OooO00o(this);
    }

    @Override // p118o00O0Oo.o0OoOo0
    public final Path OooO00o() {
        if (this.f30748OooO0o0) {
            return this.f30743OooO00o;
        }
        this.f30743OooO00o.reset();
        if (this.f30744OooO0O0) {
            this.f30748OooO0o0 = true;
            return this.f30743OooO00o;
        }
        this.f30743OooO00o.set(this.f30746OooO0Oo.OooO0o());
        this.f30743OooO00o.setFillType(Path.FillType.EVEN_ODD);
        this.f30747OooO0o.OooO0O0(this.f30743OooO00o);
        this.f30748OooO0o0 = true;
        return this.f30743OooO00o;
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f30748OooO0o0 = false;
        this.f30745OooO0OO.invalidateSelf();
    }

    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            OooOO0 oooOO1 = (OooOO0) arrayList.get(i);
            if (oooOO1 instanceof o0ooOOo) {
                o0ooOOo o0ooooo2 = (o0ooOOo) oooOO1;
                if (o0ooooo2.f30739OooO0OO == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f30747OooO0o.OooO00o(o0ooooo2);
                    o0ooooo2.OooO0Oo(this);
                }
            }
            i++;
        }
    }
}
