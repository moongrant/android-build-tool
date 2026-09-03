package p052o00000oO;

import android.graphics.Insets;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public static final OooOO0O f33988OooO0o0 = new OooOO0O(0, 0, 0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f33989OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f33990OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f33991OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f33992OooO0Oo;

    @RequiresApi(29)
    public static class OooO00o {
        @DoNotInline
        public static Insets OooO00o(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public OooOO0O(int i, int i2, int i3, int i4) {
        this.f33989OooO00o = i;
        this.f33990OooO0O0 = i2;
        this.f33991OooO0OO = i3;
        this.f33992OooO0Oo = i4;
    }

    @NonNull
    public static OooOO0O OooO00o(@NonNull OooOO0O oooOO0O, @NonNull OooOO0O oooOO0O2) {
        return OooO0O0(Math.max(oooOO0O.f33989OooO00o, oooOO0O2.f33989OooO00o), Math.max(oooOO0O.f33990OooO0O0, oooOO0O2.f33990OooO0O0), Math.max(oooOO0O.f33991OooO0OO, oooOO0O2.f33991OooO0OO), Math.max(oooOO0O.f33992OooO0Oo, oooOO0O2.f33992OooO0Oo));
    }

    @NonNull
    public static OooOO0O OooO0O0(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f33988OooO0o0 : new OooOO0O(i, i2, i3, i4);
    }

    @NonNull
    @RequiresApi(api = 29)
    public static OooOO0O OooO0OO(@NonNull Insets insets) {
        return OooO0O0(insets.left, insets.top, insets.right, insets.bottom);
    }

    @NonNull
    @RequiresApi(29)
    public final Insets OooO0Oo() {
        return OooO00o.OooO00o(this.f33989OooO00o, this.f33990OooO0O0, this.f33991OooO0OO, this.f33992OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooOO0O.class != obj.getClass()) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return this.f33992OooO0Oo == oooOO0O.f33992OooO0Oo && this.f33989OooO00o == oooOO0O.f33989OooO00o && this.f33991OooO0OO == oooOO0O.f33991OooO0OO && this.f33990OooO0O0 == oooOO0O.f33990OooO0O0;
    }

    public final int hashCode() {
        return (((((this.f33989OooO00o * 31) + this.f33990OooO0O0) * 31) + this.f33991OooO0OO) * 31) + this.f33992OooO0Oo;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f33989OooO00o);
        sb.append(", top=");
        sb.append(this.f33990OooO0O0);
        sb.append(", right=");
        sb.append(this.f33991OooO0OO);
        sb.append(", bottom=");
        return OooO0O0.OooO00o(sb, this.f33992OooO0Oo, '}');
    }
}
