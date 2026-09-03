package p662o0oooO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f51657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f51658OooO0O0 = new int[10];

    public final int OooO00o() {
        if ((this.f51657OooO00o & 128) != 0) {
            return this.f51658OooO0O0[7];
        }
        return 65535;
    }

    public final void OooO0O0(@NotNull o00O0OOO other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.f51657OooO00o) != 0) {
                OooO0OO(i, other.f51658OooO0O0[i]);
            }
        }
    }

    @NotNull
    public final o00O0OOO OooO0OO(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f51658OooO0O0;
            if (i < iArr.length) {
                this.f51657OooO00o = (1 << i) | this.f51657OooO00o;
                iArr[i] = i2;
            }
        }
        return this;
    }
}
