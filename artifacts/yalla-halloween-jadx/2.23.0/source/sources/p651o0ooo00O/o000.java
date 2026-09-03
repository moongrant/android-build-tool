package p651o0ooo00O;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f59853OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final int[] f59854OooO0O0 = new int[10];

    public final int OooO00o() {
        if ((this.f59853OooO00o & 128) != 0) {
            return this.f59854OooO0O0[7];
        }
        return 65535;
    }

    public final void OooO0O0(@NotNull o000 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = 0;
        while (i < 10) {
            int i2 = i + 1;
            if (((1 << i) & other.f59853OooO00o) != 0) {
                OooO0OO(i, other.f59854OooO0O0[i]);
            }
            i = i2;
        }
    }

    @NotNull
    public final void OooO0OO(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f59854OooO0O0;
            if (i >= iArr.length) {
                return;
            }
            this.f59853OooO00o = (1 << i) | this.f59853OooO00o;
            iArr[i] = i2;
        }
    }
}
