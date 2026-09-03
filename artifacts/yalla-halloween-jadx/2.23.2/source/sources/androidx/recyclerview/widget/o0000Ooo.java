package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final p190o00o0O.OooOo<RecyclerView.o0O0O00, OooO00o> f10837OooO00o = new p190o00o0O.OooOo<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @VisibleForTesting
    public final p190o00o0O.OooOOOO<RecyclerView.o0O0O00> f10838OooO0O0 = new p190o00o0O.OooOOOO<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000OO.OooOO0 f10839OooO0Oo = new o000OO.OooOO0(20);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f10840OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public RecyclerView.ItemAnimator.OooO0OO f10841OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public RecyclerView.ItemAnimator.OooO0OO f10842OooO0OO;

        public static OooO00o OooO00o() {
            OooO00o oooO00o = (OooO00o) f10839OooO0Oo.OooO0O0();
            return oooO00o == null ? new OooO00o() : oooO00o;
        }
    }

    public interface OooO0O0 {
    }

    public final void OooO00o(RecyclerView.o0O0O00 o0o0o00, RecyclerView.ItemAnimator.OooO0OO oooO0OO) {
        p190o00o0O.OooOo<RecyclerView.o0O0O00, OooO00o> oooOo = this.f10837OooO00o;
        OooO00o orDefault = oooOo.getOrDefault(o0o0o00, null);
        if (orDefault == null) {
            orDefault = OooO00o.OooO00o();
            oooOo.put(o0o0o00, orDefault);
        }
        orDefault.f10842OooO0OO = oooO0OO;
        orDefault.f10840OooO00o |= 8;
    }

    public final RecyclerView.ItemAnimator.OooO0OO OooO0O0(RecyclerView.o0O0O00 o0o0o00, int i) {
        OooO00o oooO00oOooOO0o;
        RecyclerView.ItemAnimator.OooO0OO oooO0OO;
        p190o00o0O.OooOo<RecyclerView.o0O0O00, OooO00o> oooOo = this.f10837OooO00o;
        int iOooO0o0 = oooOo.OooO0o0(o0o0o00);
        if (iOooO0o0 >= 0 && (oooO00oOooOO0o = oooOo.OooOO0o(iOooO0o0)) != null) {
            int i2 = oooO00oOooOO0o.f10840OooO00o;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                oooO00oOooOO0o.f10840OooO00o = i3;
                if (i == 4) {
                    oooO0OO = oooO00oOooOO0o.f10841OooO0O0;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    oooO0OO = oooO00oOooOO0o.f10842OooO0OO;
                }
                if ((i3 & 12) == 0) {
                    oooOo.OooOO0(iOooO0o0);
                    oooO00oOooOO0o.f10840OooO00o = 0;
                    oooO00oOooOO0o.f10841OooO0O0 = null;
                    oooO00oOooOO0o.f10842OooO0OO = null;
                    OooO00o.f10839OooO0Oo.OooO00o(oooO00oOooOO0o);
                }
                return oooO0OO;
            }
        }
        return null;
    }

    public final void OooO0OO(RecyclerView.o0O0O00 o0o0o00) {
        OooO00o orDefault = this.f10837OooO00o.getOrDefault(o0o0o00, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f10840OooO00o &= -2;
    }

    public final void OooO0Oo(RecyclerView.o0O0O00 o0o0o00) {
        p190o00o0O.OooOOOO<RecyclerView.o0O0O00> oooOOOO = this.f10838OooO0O0;
        for (int iOooOO0O = oooOOOO.OooOO0O() - 1; iOooOO0O >= 0; iOooOO0O--) {
            if (o0o0o00 == oooOOOO.OooOO0o(iOooOO0O)) {
                Object[] objArr = oooOOOO.f38560OooO0o;
                Object obj = objArr[iOooOO0O];
                Object obj2 = p190o00o0O.OooOOOO.f38558OooO0oo;
                if (obj == obj2) {
                    break;
                }
                objArr[iOooOO0O] = obj2;
                oooOOOO.f38559OooO0Oo = true;
                break;
            }
        }
        OooO00o oooO00oRemove = this.f10837OooO00o.remove(o0o0o00);
        if (oooO00oRemove != null) {
            oooO00oRemove.f10840OooO00o = 0;
            oooO00oRemove.f10841OooO0O0 = null;
            oooO00oRemove.f10842OooO0OO = null;
            OooO00o.f10839OooO0Oo.OooO00o(oooO00oRemove);
        }
    }
}
