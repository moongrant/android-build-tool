package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class ViewBoundsCheck {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f9133OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f9134OooO0O0 = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f9135OooO00o = 0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9136OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f9137OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f9138OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f9139OooO0o0;

        public final void OooO00o(int i) {
            this.f9135OooO00o = i | this.f9135OooO00o;
        }

        public final boolean OooO0O0() {
            int i = this.f9135OooO00o;
            if ((i & 7) != 0 && (i & (OooO0OO(this.f9138OooO0Oo, this.f9136OooO0O0) << 0)) == 0) {
                return false;
            }
            int i2 = this.f9135OooO00o;
            if ((i2 & 112) != 0 && (i2 & (OooO0OO(this.f9138OooO0Oo, this.f9137OooO0OO) << 4)) == 0) {
                return false;
            }
            int i3 = this.f9135OooO00o;
            if ((i3 & 1792) != 0 && (i3 & (OooO0OO(this.f9139OooO0o0, this.f9136OooO0O0) << 8)) == 0) {
                return false;
            }
            int i4 = this.f9135OooO00o;
            return (i4 & 28672) == 0 || (i4 & (OooO0OO(this.f9139OooO0o0, this.f9137OooO0OO) << 12)) != 0;
        }

        public final int OooO0OO(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }
    }

    public interface OooO0O0 {
        int OooO00o(View view);

        int OooO0O0();

        int OooO0OO();

        View OooO0Oo(int i);

        int OooO0o0(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public ViewBoundsCheck(OooO0O0 oooO0O0) {
        this.f9133OooO00o = oooO0O0;
    }

    public final View OooO00o(int i, int i2, int i3, int i4) {
        int iOooO0O0 = this.f9133OooO00o.OooO0O0();
        int iOooO0OO = this.f9133OooO00o.OooO0OO();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewOooO0Oo = this.f9133OooO00o.OooO0Oo(i);
            int iOooO00o = this.f9133OooO00o.OooO00o(viewOooO0Oo);
            int iOooO0o0 = this.f9133OooO00o.OooO0o0(viewOooO0Oo);
            OooO00o oooO00o = this.f9134OooO0O0;
            oooO00o.f9136OooO0O0 = iOooO0O0;
            oooO00o.f9137OooO0OO = iOooO0OO;
            oooO00o.f9138OooO0Oo = iOooO00o;
            oooO00o.f9139OooO0o0 = iOooO0o0;
            if (i3 != 0) {
                oooO00o.f9135OooO00o = 0;
                oooO00o.OooO00o(i3);
                if (this.f9134OooO0O0.OooO0O0()) {
                    return viewOooO0Oo;
                }
            }
            if (i4 != 0) {
                OooO00o oooO00o2 = this.f9134OooO0O0;
                oooO00o2.f9135OooO00o = 0;
                oooO00o2.OooO00o(i4);
                if (this.f9134OooO0O0.OooO0O0()) {
                    view = viewOooO0Oo;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean OooO0O0(View view) {
        OooO00o oooO00o = this.f9134OooO0O0;
        int iOooO0O0 = this.f9133OooO00o.OooO0O0();
        int iOooO0OO = this.f9133OooO00o.OooO0OO();
        int iOooO00o = this.f9133OooO00o.OooO00o(view);
        int iOooO0o0 = this.f9133OooO00o.OooO0o0(view);
        oooO00o.f9136OooO0O0 = iOooO0O0;
        oooO00o.f9137OooO0OO = iOooO0OO;
        oooO00o.f9138OooO0Oo = iOooO00o;
        oooO00o.f9139OooO0o0 = iOooO0o0;
        OooO00o oooO00o2 = this.f9134OooO0O0;
        oooO00o2.f9135OooO00o = 0;
        oooO00o2.OooO00o(24579);
        return this.f9134OooO0O0.OooO0O0();
    }
}
