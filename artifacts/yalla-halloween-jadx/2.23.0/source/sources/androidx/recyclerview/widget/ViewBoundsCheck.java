package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class ViewBoundsCheck {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f7751OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f7752OooO0O0 = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7753OooO00o = 0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7754OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7755OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7756OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7757OooO0o0;

        public final boolean OooO00o() {
            int i;
            int i2;
            int i3;
            int i4 = this.f7753OooO00o;
            int i5 = 2;
            if ((i4 & 7) != 0) {
                int i6 = this.f7756OooO0Oo;
                int i7 = this.f7754OooO0O0;
                if (i6 > i7) {
                    i3 = 1;
                } else {
                    i3 = i6 == i7 ? 2 : 4;
                }
                if (((i3 << 0) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 112) != 0) {
                int i8 = this.f7756OooO0Oo;
                int i9 = this.f7755OooO0OO;
                if (i8 > i9) {
                    i2 = 1;
                } else {
                    i2 = i8 == i9 ? 2 : 4;
                }
                if (((i2 << 4) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 1792) != 0) {
                int i10 = this.f7757OooO0o0;
                int i11 = this.f7754OooO0O0;
                if (i10 > i11) {
                    i = 1;
                } else {
                    i = i10 == i11 ? 2 : 4;
                }
                if (((i << 8) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 28672) != 0) {
                int i12 = this.f7757OooO0o0;
                int i13 = this.f7755OooO0OO;
                if (i12 > i13) {
                    i5 = 1;
                } else if (i12 != i13) {
                    i5 = 4;
                }
                if ((i4 & (i5 << 12)) == 0) {
                    return false;
                }
            }
            return true;
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
        this.f7751OooO00o = oooO0O0;
    }

    public final View OooO00o(int i, int i2, int i3, int i4) {
        OooO0O0 oooO0O0 = this.f7751OooO00o;
        int iOooO0O0 = oooO0O0.OooO0O0();
        int iOooO0OO = oooO0O0.OooO0OO();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewOooO0Oo = oooO0O0.OooO0Oo(i);
            int iOooO00o = oooO0O0.OooO00o(viewOooO0Oo);
            int iOooO0o0 = oooO0O0.OooO0o0(viewOooO0Oo);
            OooO00o oooO00o = this.f7752OooO0O0;
            oooO00o.f7754OooO0O0 = iOooO0O0;
            oooO00o.f7755OooO0OO = iOooO0OO;
            oooO00o.f7756OooO0Oo = iOooO00o;
            oooO00o.f7757OooO0o0 = iOooO0o0;
            if (i3 != 0) {
                oooO00o.f7753OooO00o = i3 | 0;
                if (oooO00o.OooO00o()) {
                    return viewOooO0Oo;
                }
            }
            if (i4 != 0) {
                oooO00o.f7753OooO00o = i4 | 0;
                if (oooO00o.OooO00o()) {
                    view = viewOooO0Oo;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean OooO0O0(View view) {
        OooO0O0 oooO0O0 = this.f7751OooO00o;
        int iOooO0O0 = oooO0O0.OooO0O0();
        int iOooO0OO = oooO0O0.OooO0OO();
        int iOooO00o = oooO0O0.OooO00o(view);
        int iOooO0o0 = oooO0O0.OooO0o0(view);
        OooO00o oooO00o = this.f7752OooO0O0;
        oooO00o.f7754OooO0O0 = iOooO0O0;
        oooO00o.f7755OooO0OO = iOooO0OO;
        oooO00o.f7756OooO0Oo = iOooO00o;
        oooO00o.f7757OooO0o0 = iOooO0o0;
        oooO00o.f7753OooO00o = 24579 | 0;
        return oooO00o.OooO00o();
    }
}
