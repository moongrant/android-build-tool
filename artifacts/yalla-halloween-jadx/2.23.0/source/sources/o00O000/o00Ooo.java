package o00O000;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements OooO0OO, o00O000o.OooO00o.InterfaceC0420OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f36247OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f36248OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ShapeTrimPath.Type f36249OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O000o.OooO0o f36250OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O000o.OooO0o f36251OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O000o.OooO0o f36252OooO0o0;

    public o00Ooo(com.airbnb.lottie.model.layer.OooO00o oooO00o, ShapeTrimPath shapeTrimPath) {
        shapeTrimPath.getClass();
        this.f36247OooO00o = shapeTrimPath.f8817OooO0o0;
        this.f36249OooO0OO = shapeTrimPath.f8813OooO00o;
        o00O000o.OooO00o<Float, Float> OooO00o2 = shapeTrimPath.f8814OooO0O0.OooO00o();
        this.f36250OooO0Oo = (o00O000o.OooO0o) OooO00o2;
        o00O000o.OooO00o<Float, Float> OooO00o3 = shapeTrimPath.f8815OooO0OO.OooO00o();
        this.f36252OooO0o0 = (o00O000o.OooO0o) OooO00o3;
        o00O000o.OooO00o<Float, Float> OooO00o4 = shapeTrimPath.f8816OooO0Oo.OooO00o();
        this.f36251OooO0o = (o00O000o.OooO0o) OooO00o4;
        oooO00o.OooO0oO(OooO00o2);
        oooO00o.OooO0oO(OooO00o3);
        oooO00o.OooO0oO(OooO00o4);
        OooO00o2.OooO00o(this);
        OooO00o3.OooO00o(this);
        OooO00o4.OooO00o(this);
    }

    @Override // o00O000o.OooO00o.InterfaceC0420OooO00o
    public final void OooO0O0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f36248OooO0O0;
            if (i >= arrayList.size()) {
                return;
            }
            ((o00O000o.OooO00o.InterfaceC0420OooO00o) arrayList.get(i)).OooO0O0();
            i++;
        }
    }

    @Override // o00O000.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
    }

    public final void OooO0Oo(o00O000o.OooO00o.InterfaceC0420OooO00o interfaceC0420OooO00o) {
        this.f36248OooO0O0.add(interfaceC0420OooO00o);
    }
}
