package o0000O0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements o000OO.OooO00o<OooOo00.OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f33555OooO00o;

    public OooOOOO(String str) {
        this.f33555OooO00o = str;
    }

    @Override // o000OO.OooO00o
    public final void accept(OooOo00.OooO00o oooO00o) {
        OooOo00.OooO00o oooO00o2 = oooO00o;
        synchronized (OooOo00.f33560OooO0OO) {
            p190o00o0O.OooOo<String, ArrayList<o000OO.OooO00o<OooOo00.OooO00o>>> oooOo = OooOo00.f33561OooO0Oo;
            ArrayList<o000OO.OooO00o<OooOo00.OooO00o>> orDefault = oooOo.getOrDefault(this.f33555OooO00o, null);
            if (orDefault == null) {
                return;
            }
            oooOo.remove(this.f33555OooO00o);
            for (int i = 0; i < orDefault.size(); i++) {
                orDefault.get(i).accept(oooO00o2);
            }
        }
    }
}
