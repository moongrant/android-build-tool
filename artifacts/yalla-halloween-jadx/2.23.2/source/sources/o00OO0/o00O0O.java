package o00OO0;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O implements Oooo000, o00OO0O0.OooO00o.InterfaceC0423OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f37037OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f37038OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OO0O0.Oooo000 f37039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f37041OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f37036OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f37040OooO0o = new OooO0O0();

    public o00O0O(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, p136o00OO0oO.Oooo000 oooo000) {
        oooo000.getClass();
        this.f37037OooO0O0 = oooo000.f37382OooO0Oo;
        this.f37038OooO0OO = lottieDrawable;
        o00OO0O0.OooO00o<p136o00OO0oO.OooOOOO, Path> OooO00o2 = oooo000.f37381OooO0OO.OooO00o();
        this.f37039OooO0Oo = (o00OO0O0.Oooo000) OooO00o2;
        oooO00o.OooO0oO(OooO00o2);
        OooO00o2.OooO00o(this);
    }

    @Override // o00OO0.Oooo000
    public final Path OooO00o() {
        boolean z = this.f37041OooO0o0;
        Path path = this.f37036OooO00o;
        if (z) {
            return path;
        }
        path.reset();
        if (this.f37037OooO0O0) {
            this.f37041OooO0o0 = true;
            return path;
        }
        path.set(this.f37039OooO0Oo.OooO0o());
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f37040OooO0o.OooO0O0(path);
        this.f37041OooO0o0 = true;
        return path;
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f37041OooO0o0 = false;
        this.f37038OooO0OO.invalidateSelf();
    }

    @Override // o00OO0.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            OooO0OO oooO0OO = (OooO0OO) arrayList.get(i);
            if (oooO0OO instanceof o00Ooo) {
                o00Ooo o00ooo2 = (o00Ooo) oooO0OO;
                if (o00ooo2.f37049OooO0OO == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    ((List) this.f37040OooO0o.f36940OooO00o).add(o00ooo2);
                    o00ooo2.OooO0Oo(this);
                }
            }
            i++;
        }
    }
}
