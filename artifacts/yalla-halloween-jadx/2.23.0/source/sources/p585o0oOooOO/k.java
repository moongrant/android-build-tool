package p585o0oOooOO;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ArrayList<h> f56774OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public h f56775OooO0O0;

    public final void OooO00o() {
        if (this.f56774OooO00o == null) {
            this.f56774OooO00o = new ArrayList<>();
        }
        Collections.sort(this.f56774OooO00o, new j());
    }

    public final ArrayList<? extends h> OooO0O0(String str) {
        ArrayList<? extends h> arrayList = new ArrayList<>();
        OooO00o();
        for (h hVar : this.f56774OooO00o) {
            if (hVar.f56768OooO.equals(str)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public final int OooO0OO(String str) {
        return OooO0O0(str).size();
    }

    public final h OooO0Oo(int i, int i2) {
        ArrayList<h> arrayList = this.f56774OooO00o;
        if (arrayList == null) {
            return null;
        }
        for (h hVar : arrayList) {
            if (hVar.f56772OooO0oO <= i && hVar.f56773OooO0oo >= i2) {
                return hVar;
            }
        }
        return null;
    }

    public final h OooO0o0(int i, int i2) {
        ArrayList<h> arrayList = this.f56774OooO00o;
        if (arrayList == null) {
            return null;
        }
        for (h hVar : arrayList) {
            int i3 = hVar.f56772OooO0oO;
            if ((i > i3 && i < hVar.f56773OooO0oo) || (i2 > i3 && i2 < hVar.f56773OooO0oo)) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "EditTextSpanManager{mListSpan=" + this.f56774OooO00o + ", mLastSelectedSpan=" + this.f56775OooO0O0 + '}';
    }
}
