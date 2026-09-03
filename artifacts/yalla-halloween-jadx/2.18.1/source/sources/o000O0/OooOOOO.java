package o000O0;

import java.util.ArrayList;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements o000OO0O.OooO00o<OooOo00.OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f28063OooO00o;

    public OooOOOO(String str) {
        this.f28063OooO00o = str;
    }

    @Override // o000OO0O.OooO00o
    public final void accept(OooOo00.OooO00o oooO00o) {
        OooOo00.OooO00o oooO00o2 = oooO00o;
        synchronized (OooOo00.f28068OooO0OO) {
            o00oO0o<String, ArrayList<o000OO0O.OooO00o<OooOo00.OooO00o>>> o00oo0o2 = OooOo00.f28069OooO0Oo;
            ArrayList<o000OO0O.OooO00o<OooOo00.OooO00o>> orDefault = o00oo0o2.getOrDefault(this.f28063OooO00o, null);
            if (orDefault == null) {
                return;
            }
            o00oo0o2.remove(this.f28063OooO00o);
            for (int i = 0; i < orDefault.size(); i++) {
                orDefault.get(i).accept(oooO00o2);
            }
        }
    }
}
