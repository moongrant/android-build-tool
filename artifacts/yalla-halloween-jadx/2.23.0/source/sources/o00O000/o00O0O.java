package o00O000;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import p113o00O00Oo.o0OO00O;
import p113o00O00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O implements Oooo000, o00O000o.OooO00o.InterfaceC0420OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f36237OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f36238OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O000o.Oooo000 f36239OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f36241OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f36236OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f36240OooO0o = new OooO0O0();

    public o00O0O(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, o0OO00O o0oo00o2) {
        o0oo00o2.getClass();
        this.f36237OooO0O0 = o0oo00o2.f36374OooO0Oo;
        this.f36238OooO0OO = lottieDrawable;
        o00O000o.OooO00o<o0ooOOo, Path> OooO00o2 = o0oo00o2.f36373OooO0OO.OooO00o();
        this.f36239OooO0Oo = (o00O000o.Oooo000) OooO00o2;
        oooO00o.OooO0oO(OooO00o2);
        OooO00o2.OooO00o(this);
    }

    @Override // o00O000.Oooo000
    public final Path OooO00o() {
        boolean z = this.f36241OooO0o0;
        Path path = this.f36236OooO00o;
        if (z) {
            return path;
        }
        path.reset();
        if (this.f36237OooO0O0) {
            this.f36241OooO0o0 = true;
            return path;
        }
        path.set(this.f36239OooO0Oo.OooO0o());
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f36240OooO0o.OooO00o(path);
        this.f36241OooO0o0 = true;
        return path;
    }

    @Override // o00O000o.OooO00o.InterfaceC0420OooO00o
    public final void OooO0O0() {
        this.f36241OooO0o0 = false;
        this.f36238OooO0OO.invalidateSelf();
    }

    @Override // o00O000.OooO0OO
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
                if (o00ooo2.f36249OooO0OO == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f36240OooO0o.f36140OooO00o.add(o00ooo2);
                    o00ooo2.OooO0Oo(this);
                }
            }
            i++;
        }
    }
}
