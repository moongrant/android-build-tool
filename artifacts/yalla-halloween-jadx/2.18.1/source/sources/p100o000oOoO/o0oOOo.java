package p100o000oOoO;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0oOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public int[] f29674OooO00o = new int[10];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f29675OooO0O0;

    public final int OooO00o(int i) {
        int i2 = this.f29675OooO0O0;
        return i2 > 0 ? this.f29674OooO00o[i2 - 1] : i;
    }

    public final int OooO0O0() {
        int[] iArr = this.f29674OooO00o;
        int i = this.f29675OooO0O0 - 1;
        this.f29675OooO0O0 = i;
        return iArr[i];
    }

    public final void OooO0OO(int i) {
        int i2 = this.f29675OooO0O0;
        int[] iArr = this.f29674OooO00o;
        if (i2 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f29674OooO00o = iArrCopyOf;
        }
        int[] iArr2 = this.f29674OooO00o;
        int i3 = this.f29675OooO0O0;
        this.f29675OooO0O0 = i3 + 1;
        iArr2[i3] = i;
    }
}
