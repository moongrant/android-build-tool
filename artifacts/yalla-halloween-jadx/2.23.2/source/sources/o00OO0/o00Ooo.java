package o00OO0;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements OooO0OO, o00OO0O0.OooO00o.InterfaceC0423OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f37047OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f37048OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ShapeTrimPath.Type f37049OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OO0O0.OooO0o f37050OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00OO0O0.OooO0o f37051OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OO0O0.OooO0o f37052OooO0o0;

    public o00Ooo(com.airbnb.lottie.model.layer.OooO00o oooO00o, ShapeTrimPath shapeTrimPath) {
        shapeTrimPath.getClass();
        this.f37047OooO00o = shapeTrimPath.f11907OooO0o0;
        this.f37049OooO0OO = shapeTrimPath.f11903OooO00o;
        o00OO0O0.OooO00o<Float, Float> OooO00o2 = shapeTrimPath.f11904OooO0O0.OooO00o();
        this.f37050OooO0Oo = (o00OO0O0.OooO0o) OooO00o2;
        o00OO0O0.OooO00o<Float, Float> OooO00o3 = shapeTrimPath.f11905OooO0OO.OooO00o();
        this.f37052OooO0o0 = (o00OO0O0.OooO0o) OooO00o3;
        o00OO0O0.OooO00o<Float, Float> OooO00o4 = shapeTrimPath.f11906OooO0Oo.OooO00o();
        this.f37051OooO0o = (o00OO0O0.OooO0o) OooO00o4;
        oooO00o.OooO0oO(OooO00o2);
        oooO00o.OooO0oO(OooO00o3);
        oooO00o.OooO0oO(OooO00o4);
        OooO00o2.OooO00o(this);
        OooO00o3.OooO00o(this);
        OooO00o4.OooO00o(this);
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f37048OooO0O0;
            if (i >= arrayList.size()) {
                return;
            }
            ((o00OO0O0.OooO00o.InterfaceC0423OooO00o) arrayList.get(i)).OooO0O0();
            i++;
        }
    }

    @Override // o00OO0.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
    }

    public final void OooO0Oo(o00OO0O0.OooO00o.InterfaceC0423OooO00o interfaceC0423OooO00o) {
        this.f37048OooO0O0.add(interfaceC0423OooO00o);
    }
}
