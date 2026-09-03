package p557o0oOOooO;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ArrayList<oOo00ooO> f56176OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oOo00ooO f56177OooO0O0;

    public final void OooO00o() {
        if (this.f56176OooO00o == null) {
            this.f56176OooO00o = new ArrayList<>();
        }
        Collections.sort(this.f56176OooO00o, new oOo000Oo());
    }

    public final ArrayList<? extends oOo00ooO> OooO0O0(String str) {
        ArrayList<? extends oOo00ooO> arrayList = new ArrayList<>();
        OooO00o();
        for (oOo00ooO ooo00ooo : this.f56176OooO00o) {
            if (ooo00ooo.f56179OooO.equals(str)) {
                arrayList.add(ooo00ooo);
            }
        }
        return arrayList;
    }

    public final int OooO0OO(String str) {
        return OooO0O0(str).size();
    }

    public final oOo00ooO OooO0Oo(int i, int i2) {
        ArrayList<oOo00ooO> arrayList = this.f56176OooO00o;
        if (arrayList == null) {
            return null;
        }
        for (oOo00ooO ooo00ooo : arrayList) {
            if (ooo00ooo.f56183OooO0oO <= i && ooo00ooo.f56184OooO0oo >= i2) {
                return ooo00ooo;
            }
        }
        return null;
    }

    public final oOo00ooO OooO0o0(int i, int i2) {
        ArrayList<oOo00ooO> arrayList = this.f56176OooO00o;
        if (arrayList == null) {
            return null;
        }
        for (oOo00ooO ooo00ooo : arrayList) {
            int i3 = ooo00ooo.f56183OooO0oO;
            if ((i > i3 && i < ooo00ooo.f56184OooO0oo) || (i2 > i3 && i2 < ooo00ooo.f56184OooO0oo)) {
                return ooo00ooo;
            }
        }
        return null;
    }

    public final String toString() {
        return "EditTextSpanManager{mListSpan=" + this.f56176OooO00o + ", mLastSelectedSpan=" + this.f56177OooO0O0 + '}';
    }
}
