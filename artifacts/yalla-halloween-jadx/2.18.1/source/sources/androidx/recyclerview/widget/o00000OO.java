package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final p021OooOooo.o00oO0o<RecyclerView.oo0o0Oo, OooO00o> f9153OooO00o = new p021OooOooo.o00oO0o<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @VisibleForTesting
    public final p021OooOooo.o00Ooo<RecyclerView.oo0o0Oo> f9154OooO0O0 = new p021OooOooo.o00Ooo<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static o000OO0O.OooO<OooO00o> f9155OooO0Oo = new o000OO0O.OooOO0(20);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f9156OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public RecyclerView.ItemAnimator.OooO0OO f9157OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public RecyclerView.ItemAnimator.OooO0OO f9158OooO0OO;

        public static OooO00o OooO00o() {
            OooO00o oooO00oOooO0O0 = f9155OooO0Oo.OooO0O0();
            return oooO00oOooO0O0 == null ? new OooO00o() : oooO00oOooO0O0;
        }

        public static void OooO0O0(OooO00o oooO00o) {
            oooO00o.f9156OooO00o = 0;
            oooO00o.f9157OooO0O0 = null;
            oooO00o.f9158OooO0OO = null;
            f9155OooO0Oo.OooO00o(oooO00o);
        }
    }

    public interface OooO0O0 {
    }

    public final void OooO00o(RecyclerView.oo0o0Oo oo0o0oo) {
        OooO00o orDefault = this.f9153OooO00o.getOrDefault(oo0o0oo, null);
        if (orDefault == null) {
            orDefault = OooO00o.OooO00o();
            this.f9153OooO00o.put(oo0o0oo, orDefault);
        }
        orDefault.f9156OooO00o |= 1;
    }

    public final void OooO0O0(RecyclerView.oo0o0Oo oo0o0oo, RecyclerView.ItemAnimator.OooO0OO oooO0OO) {
        OooO00o orDefault = this.f9153OooO00o.getOrDefault(oo0o0oo, null);
        if (orDefault == null) {
            orDefault = OooO00o.OooO00o();
            this.f9153OooO00o.put(oo0o0oo, orDefault);
        }
        orDefault.f9158OooO0OO = oooO0OO;
        orDefault.f9156OooO00o |= 8;
    }

    public final void OooO0OO(RecyclerView.oo0o0Oo oo0o0oo, RecyclerView.ItemAnimator.OooO0OO oooO0OO) {
        OooO00o orDefault = this.f9153OooO00o.getOrDefault(oo0o0oo, null);
        if (orDefault == null) {
            orDefault = OooO00o.OooO00o();
            this.f9153OooO00o.put(oo0o0oo, orDefault);
        }
        orDefault.f9157OooO0O0 = oooO0OO;
        orDefault.f9156OooO00o |= 4;
    }

    public final RecyclerView.ItemAnimator.OooO0OO OooO0Oo(RecyclerView.oo0o0Oo oo0o0oo, int i) {
        OooO00o oooO00oOooOOO0;
        RecyclerView.ItemAnimator.OooO0OO oooO0OO;
        int iOooO0o0 = this.f9153OooO00o.OooO0o0(oo0o0oo);
        if (iOooO0o0 >= 0 && (oooO00oOooOOO0 = this.f9153OooO00o.OooOOO0(iOooO0o0)) != null) {
            int i2 = oooO00oOooOOO0.f9156OooO00o;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                oooO00oOooOOO0.f9156OooO00o = i3;
                if (i == 4) {
                    oooO0OO = oooO00oOooOOO0.f9157OooO0O0;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    oooO0OO = oooO00oOooOOO0.f9158OooO0OO;
                }
                if ((i3 & 12) == 0) {
                    this.f9153OooO00o.OooOO0O(iOooO0o0);
                    OooO00o.OooO0O0(oooO00oOooOOO0);
                }
                return oooO0OO;
            }
        }
        return null;
    }

    public final void OooO0o(RecyclerView.oo0o0Oo oo0o0oo) {
        for (int iOooOOO = this.f9154OooO0O0.OooOOO() - 1; iOooOOO >= 0; iOooOOO--) {
            if (oo0o0oo == this.f9154OooO0O0.OooOOOO(iOooOOO)) {
                p021OooOooo.o00Ooo<RecyclerView.oo0o0Oo> o00ooo2 = this.f9154OooO0O0;
                Object[] objArr = o00ooo2.f414Oooo0oo;
                Object obj = objArr[iOooOOO];
                Object obj2 = p021OooOooo.o00Ooo.f410OoooO00;
                if (obj == obj2) {
                    break;
                }
                objArr[iOooOOO] = obj2;
                o00ooo2.f412Oooo0o = true;
                break;
            }
        }
        OooO00o oooO00oRemove = this.f9153OooO00o.remove(oo0o0oo);
        if (oooO00oRemove != null) {
            OooO00o.OooO0O0(oooO00oRemove);
        }
    }

    public final void OooO0o0(RecyclerView.oo0o0Oo oo0o0oo) {
        OooO00o orDefault = this.f9153OooO00o.getOrDefault(oo0o0oo, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f9156OooO00o &= -2;
    }
}
