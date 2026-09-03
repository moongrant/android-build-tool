package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final p188o00o0O.Oooo000<RecyclerView.o0O0O00, OooO00o> f7771OooO00o = new p188o00o0O.Oooo000<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @VisibleForTesting
    public final p188o00o0O.OooOo00<RecyclerView.o0O0O00> f7772OooO0O0 = new p188o00o0O.OooOo00<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000OO.OooOO0 f7773OooO0Oo = new o000OO.OooOO0(20);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7774OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public RecyclerView.ItemAnimator.OooO0OO f7775OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public RecyclerView.ItemAnimator.OooO0OO f7776OooO0OO;

        public static OooO00o OooO00o() {
            OooO00o oooO00o = (OooO00o) f7773OooO0Oo.OooO0O0();
            return oooO00o == null ? new OooO00o() : oooO00o;
        }
    }

    public interface OooO0O0 {
    }

    public final void OooO00o(RecyclerView.o0O0O00 o0o0o00, RecyclerView.ItemAnimator.OooO0OO oooO0OO) {
        p188o00o0O.Oooo000<RecyclerView.o0O0O00, OooO00o> oooo000 = this.f7771OooO00o;
        OooO00o orDefault = oooo000.getOrDefault(o0o0o00, null);
        if (orDefault == null) {
            orDefault = OooO00o.OooO00o();
            oooo000.put(o0o0o00, orDefault);
        }
        orDefault.f7776OooO0OO = oooO0OO;
        orDefault.f7774OooO00o |= 8;
    }

    public final RecyclerView.ItemAnimator.OooO0OO OooO0O0(RecyclerView.o0O0O00 o0o0o00, int i) {
        OooO00o oooO00oOooOO0o;
        RecyclerView.ItemAnimator.OooO0OO oooO0OO;
        p188o00o0O.Oooo000<RecyclerView.o0O0O00, OooO00o> oooo000 = this.f7771OooO00o;
        int iOooO0o0 = oooo000.OooO0o0(o0o0o00);
        if (iOooO0o0 >= 0 && (oooO00oOooOO0o = oooo000.OooOO0o(iOooO0o0)) != null) {
            int i2 = oooO00oOooOO0o.f7774OooO00o;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                oooO00oOooOO0o.f7774OooO00o = i3;
                if (i == 4) {
                    oooO0OO = oooO00oOooOO0o.f7775OooO0O0;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    oooO0OO = oooO00oOooOO0o.f7776OooO0OO;
                }
                if ((i3 & 12) == 0) {
                    oooo000.OooOO0(iOooO0o0);
                    oooO00oOooOO0o.f7774OooO00o = 0;
                    oooO00oOooOO0o.f7775OooO0O0 = null;
                    oooO00oOooOO0o.f7776OooO0OO = null;
                    OooO00o.f7773OooO0Oo.OooO00o(oooO00oOooOO0o);
                }
                return oooO0OO;
            }
        }
        return null;
    }

    public final void OooO0OO(RecyclerView.o0O0O00 o0o0o00) {
        OooO00o orDefault = this.f7771OooO00o.getOrDefault(o0o0o00, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f7774OooO00o &= -2;
    }

    public final void OooO0Oo(RecyclerView.o0O0O00 o0o0o00) {
        p188o00o0O.OooOo00<RecyclerView.o0O0O00> oooOo00 = this.f7772OooO0O0;
        for (int iOooOO0O = oooOo00.OooOO0O() - 1; iOooOO0O >= 0; iOooOO0O--) {
            if (o0o0o00 == oooOo00.OooOO0o(iOooOO0O)) {
                Object[] objArr = oooOo00.f38803OooO0o;
                Object obj = objArr[iOooOO0O];
                Object obj2 = p188o00o0O.OooOo00.f38801OooO0oo;
                if (obj == obj2) {
                    break;
                }
                objArr[iOooOO0O] = obj2;
                oooOo00.f38802OooO0Oo = true;
                break;
            }
        }
        OooO00o oooO00oRemove = this.f7771OooO00o.remove(o0o0o00);
        if (oooO00oRemove != null) {
            oooO00oRemove.f7774OooO00o = 0;
            oooO00oRemove.f7775OooO0O0 = null;
            oooO00oRemove.f7776OooO0OO = null;
            OooO00o.f7773OooO0Oo.OooO00o(oooO00oRemove);
        }
    }
}
