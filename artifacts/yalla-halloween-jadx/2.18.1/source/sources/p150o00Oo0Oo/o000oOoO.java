package p150o00Oo0Oo;

import OooO00o.OooO00o;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ArrayList<OooOo> f32178OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOo f32179OooO0O0;

    public final void OooO00o() {
        OooO0O0();
        this.f32178OooO00o.clear();
    }

    public final void OooO0O0() {
        if (this.f32178OooO00o == null) {
            this.f32178OooO00o = new ArrayList<>();
        }
        Collections.sort(this.f32178OooO00o, new Oooo0());
    }

    public final ArrayList<? extends OooOo> OooO0OO(String str) {
        ArrayList<? extends OooOo> arrayList = new ArrayList<>();
        OooO0O0();
        for (OooOo oooOo : this.f32178OooO00o) {
            if (oooOo.f32175OoooO0.equals(str)) {
                arrayList.add(oooOo);
            }
        }
        return arrayList;
    }

    public final int OooO0Oo(String str) {
        return OooO0OO(str).size();
    }

    public final OooOo OooO0o(int i, int i2) {
        ArrayList<OooOo> arrayList = this.f32178OooO00o;
        if (arrayList == null) {
            return null;
        }
        for (OooOo oooOo : arrayList) {
            int i3 = oooOo.f32171Oooo;
            if ((i > i3 && i < oooOo.f32176OoooO00) || (i2 > i3 && i2 < oooOo.f32176OoooO00)) {
                return oooOo;
            }
        }
        return null;
    }

    public final OooOo OooO0o0(int i, int i2) {
        ArrayList<OooOo> arrayList = this.f32178OooO00o;
        if (arrayList == null) {
            return null;
        }
        for (OooOo oooOo : arrayList) {
            if (oooOo.f32171Oooo <= i && oooOo.f32176OoooO00 >= i2) {
                return oooOo;
            }
        }
        return null;
    }

    public final boolean OooO0oO(int i, int i2) {
        OooOo oooOo = this.f32179OooO0O0;
        if (oooOo != null) {
            int i3 = oooOo.f32171Oooo;
            if ((i3 == i && oooOo.f32176OoooO00 == i2) || (i3 == i2 && oooOo.f32176OoooO00 == i)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("EditTextSpanManager{mListSpan=");
        sbOooO0o0.append(this.f32178OooO00o);
        sbOooO0o0.append(", mLastSelectedSpan=");
        sbOooO0o0.append(this.f32179OooO0O0);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
