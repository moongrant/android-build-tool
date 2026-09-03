package o0000O0;

import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalTextApi
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f27253OooO0OO = new OooO0O0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f27254OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27255OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27256OooO0O0 = 17;

    @ExperimentalTextApi
    @JvmInline
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final C0288OooO00o f27257OooO00o = new C0288OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final int f27258OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final int f27259OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final int f27260OooO0Oo;

        /* JADX INFO: renamed from: o0000O0.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0288OooO00o {
        }

        static {
            OooO00o(0);
            OooO00o(50);
            f27258OooO0O0 = 50;
            OooO00o(-1);
            f27259OooO0OO = -1;
            OooO00o(100);
            f27260OooO0Oo = 100;
        }

        public static int OooO00o(int i) {
            boolean z = true;
            if (!(i >= 0 && i < 101) && i != -1) {
                z = false;
            }
            if (z) {
                return i;
            }
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }
    }

    public static final class OooO0O0 {
    }

    static {
        OooO00o.C0288OooO00o c0288OooO00o = OooO00o.f27257OooO00o;
        f27254OooO0Oo = new OooO0OO(OooO00o.f27259OooO0OO);
    }

    public OooO0OO(int i) {
        this.f27255OooO00o = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        int i = this.f27255OooO00o;
        OooO0OO oooO0OO = (OooO0OO) obj;
        int i2 = oooO0OO.f27255OooO00o;
        OooO00o.C0288OooO00o c0288OooO00o = OooO00o.f27257OooO00o;
        if (i == i2) {
            return this.f27256OooO0O0 == oooO0OO.f27256OooO0O0;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f27255OooO00o;
        OooO00o.C0288OooO00o c0288OooO00o = OooO00o.f27257OooO00o;
        return (i * 31) + this.f27256OooO0O0;
    }

    @NotNull
    public final String toString() {
        String strOooO00o;
        String str;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LineHeightStyle(alignment=");
        int i = this.f27255OooO00o;
        OooO00o.C0288OooO00o c0288OooO00o = OooO00o.f27257OooO00o;
        if (i == 0) {
            strOooO00o = "LineHeightStyle.Alignment.Top";
        } else if (i == OooO00o.f27258OooO0O0) {
            strOooO00o = "LineHeightStyle.Alignment.Center";
        } else if (i == OooO00o.f27259OooO0OO) {
            strOooO00o = "LineHeightStyle.Alignment.Proportional";
        } else {
            strOooO00o = i == OooO00o.f27260OooO0Oo ? "LineHeightStyle.Alignment.Bottom" : p027Oooo0o.OooOOO0.OooO00o("LineHeightStyle.Alignment(topPercentage = ", i, ')');
        }
        sbOooO0o0.append((Object) strOooO00o);
        sbOooO0o0.append(", trim=");
        int i2 = this.f27256OooO0O0;
        if (i2 == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i2 == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i2 == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i2 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sbOooO0o0.append((Object) str);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
