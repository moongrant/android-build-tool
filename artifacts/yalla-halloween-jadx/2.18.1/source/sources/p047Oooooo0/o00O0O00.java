package p047Oooooo0;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f4090OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public int[] f4091OooO0O0 = new int[16];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public int[] f4092OooO0OO = new int[16];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public int[] f4093OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f4094OooO0o0;

    public o00O0O00() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.f4093OooO0Oo = iArr;
    }

    public final int OooO00o(int i) {
        int i2 = this.f4090OooO00o + 1;
        int[] iArr = this.f4091OooO0O0;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, 0, 14, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto$default(this.f4092OooO0OO, iArr3, 0, 0, 0, 14, (Object) null);
            this.f4091OooO0O0 = iArr2;
            this.f4092OooO0OO = iArr3;
        }
        int i4 = this.f4090OooO00o;
        this.f4090OooO00o = i4 + 1;
        int length2 = this.f4093OooO0Oo.length;
        if (this.f4094OooO0o0 >= length2) {
            int i5 = length2 * 2;
            int[] iArr4 = new int[i5];
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i6 + 1;
                iArr4[i6] = i7;
                i6 = i7;
            }
            ArraysKt___ArraysJvmKt.copyInto$default(this.f4093OooO0Oo, iArr4, 0, 0, 0, 14, (Object) null);
            this.f4093OooO0Oo = iArr4;
        }
        int i8 = this.f4094OooO0o0;
        int[] iArr5 = this.f4093OooO0Oo;
        this.f4094OooO0o0 = iArr5[i8];
        this.f4091OooO0O0[i4] = i;
        this.f4092OooO0OO[i4] = i8;
        iArr5[i8] = i4;
        OooO0O0(i4);
        return i8;
    }

    public final void OooO0O0(int i) {
        int[] iArr = this.f4091OooO0O0;
        int i2 = iArr[i];
        while (i > 0) {
            int i3 = ((i + 1) >> 1) - 1;
            if (iArr[i3] <= i2) {
                return;
            }
            OooO0OO(i3, i);
            i = i3;
        }
    }

    public final void OooO0OO(int i, int i2) {
        int[] iArr = this.f4091OooO0O0;
        int[] iArr2 = this.f4092OooO0OO;
        int[] iArr3 = this.f4093OooO0Oo;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
