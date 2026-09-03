package p071o000O0o;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public static final OooO f28161OooO0o0 = new OooO(0, 0, 0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f28162OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f28163OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f28164OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f28165OooO0Oo;

    @RequiresApi(29)
    public static class OooO00o {
        @DoNotInline
        public static Insets OooO00o(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public OooO(int i, int i2, int i3, int i4) {
        this.f28162OooO00o = i;
        this.f28163OooO0O0 = i2;
        this.f28164OooO0OO = i3;
        this.f28165OooO0Oo = i4;
    }

    @NonNull
    public static OooO OooO00o(@NonNull OooO oooO, @NonNull OooO oooO2) {
        return OooO0O0(Math.max(oooO.f28162OooO00o, oooO2.f28162OooO00o), Math.max(oooO.f28163OooO0O0, oooO2.f28163OooO0O0), Math.max(oooO.f28164OooO0OO, oooO2.f28164OooO0OO), Math.max(oooO.f28165OooO0Oo, oooO2.f28165OooO0Oo));
    }

    @NonNull
    public static OooO OooO0O0(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f28161OooO0o0 : new OooO(i, i2, i3, i4);
    }

    @NonNull
    public static OooO OooO0OO(@NonNull Rect rect) {
        return OooO0O0(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NonNull
    @RequiresApi(api = 29)
    public static OooO OooO0Oo(@NonNull Insets insets) {
        return OooO0O0(insets.left, insets.top, insets.right, insets.bottom);
    }

    @NonNull
    @RequiresApi(29)
    public final Insets OooO0o0() {
        return OooO00o.OooO00o(this.f28162OooO00o, this.f28163OooO0O0, this.f28164OooO0OO, this.f28165OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO.class != obj.getClass()) {
            return false;
        }
        OooO oooO = (OooO) obj;
        return this.f28165OooO0Oo == oooO.f28165OooO0Oo && this.f28162OooO00o == oooO.f28162OooO00o && this.f28164OooO0OO == oooO.f28164OooO0OO && this.f28163OooO0O0 == oooO.f28163OooO0O0;
    }

    public final int hashCode() {
        return (((((this.f28162OooO00o * 31) + this.f28163OooO0O0) * 31) + this.f28164OooO0OO) * 31) + this.f28165OooO0Oo;
    }

    @NonNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Insets{left=");
        sbOooO0o0.append(this.f28162OooO00o);
        sbOooO0o0.append(", top=");
        sbOooO0o0.append(this.f28163OooO0O0);
        sbOooO0o0.append(", right=");
        sbOooO0o0.append(this.f28164OooO0OO);
        sbOooO0o0.append(", bottom=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f28165OooO0Oo, '}');
    }
}
