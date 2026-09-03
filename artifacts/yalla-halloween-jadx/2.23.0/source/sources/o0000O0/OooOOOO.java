package o0000O0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements o000OO.OooO00o<OooOo00.OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f34068OooO00o;

    public OooOOOO(String str) {
        this.f34068OooO00o = str;
    }

    @Override // o000OO.OooO00o
    public final void accept(OooOo00.OooO00o oooO00o) {
        OooOo00.OooO00o oooO00o2 = oooO00o;
        synchronized (OooOo00.f34073OooO0OO) {
            p188o00o0O.Oooo000<String, ArrayList<o000OO.OooO00o<OooOo00.OooO00o>>> oooo000 = OooOo00.f34074OooO0Oo;
            ArrayList<o000OO.OooO00o<OooOo00.OooO00o>> orDefault = oooo000.getOrDefault(this.f34068OooO00o, null);
            if (orDefault == null) {
                return;
            }
            oooo000.remove(this.f34068OooO00o);
            for (int i = 0; i < orDefault.size(); i++) {
                orDefault.get(i).accept(oooO00o2);
            }
        }
    }
}
