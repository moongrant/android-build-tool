package p054o00000oo;

import androidx.compose.ui.text.InternalTextApi;
import kotlin.KotlinVersion;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InternalTextApi
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public String f27179OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00oOoo f27180OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27181OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f27182OooO0Oo;

    public o00O0O0(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f27179OooO00o = text;
        this.f27181OooO0OO = -1;
        this.f27182OooO0Oo = -1;
    }

    public final int OooO00o() {
        o00oOoo o00oooo2 = this.f27180OooO0O0;
        if (o00oooo2 == null) {
            return this.f27179OooO00o.length();
        }
        return o00oooo2.OooO00o() + (this.f27179OooO00o.length() - (this.f27182OooO0Oo - this.f27181OooO0OO));
    }

    public final void OooO0O0(int i, int i2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        o00oOoo o00oooo2 = this.f27180OooO0O0;
        if (o00oooo2 == null) {
            int iMax = Math.max(KotlinVersion.MAX_COMPONENT_VALUE, text.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.f27179OooO00o.length() - i2, 64);
            String str = this.f27179OooO00o;
            int i3 = i - iMin;
            for (int i4 = i3; i4 < i; i4++) {
                cArr[(0 + i4) - i3] = str.charAt(i4);
            }
            String str2 = this.f27179OooO00o;
            int i5 = iMax - iMin2;
            int i6 = iMin2 + i2;
            for (int i7 = i2; i7 < i6; i7++) {
                cArr[(i5 + i7) - i2] = str2.charAt(i7);
            }
            o00O000.OooO0OO(text, cArr, iMin);
            this.f27180OooO0O0 = new o00oOoo(cArr, text.length() + iMin, i5);
            this.f27181OooO0OO = i3;
            this.f27182OooO0Oo = i6;
            return;
        }
        int i8 = this.f27181OooO0OO;
        int i9 = i - i8;
        int i10 = i2 - i8;
        if (i9 < 0 || i10 > o00oooo2.OooO00o()) {
            this.f27179OooO00o = toString();
            this.f27180OooO0O0 = null;
            this.f27181OooO0OO = -1;
            this.f27182OooO0Oo = -1;
            OooO0O0(i, i2, text);
            return;
        }
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length() - (i10 - i9);
        int i11 = o00oooo2.f27228OooO0Oo - o00oooo2.f27227OooO0OO;
        if (length > i11) {
            int i12 = length - i11;
            int i13 = o00oooo2.f27225OooO00o;
            do {
                i13 *= 2;
            } while (i13 - o00oooo2.f27225OooO00o < i12);
            char[] cArr2 = new char[i13];
            ArraysKt.copyInto(o00oooo2.f27226OooO0O0, cArr2, 0, 0, o00oooo2.f27227OooO0OO);
            int i14 = o00oooo2.f27225OooO00o;
            int i15 = o00oooo2.f27228OooO0Oo;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            ArraysKt.copyInto(o00oooo2.f27226OooO0O0, cArr2, i17, i15, i16 + i15);
            o00oooo2.f27226OooO0O0 = cArr2;
            o00oooo2.f27225OooO00o = i13;
            o00oooo2.f27228OooO0Oo = i17;
        }
        int i18 = o00oooo2.f27227OooO0OO;
        if (i9 < i18 && i10 <= i18) {
            int i19 = i18 - i10;
            char[] cArr3 = o00oooo2.f27226OooO0O0;
            ArraysKt.copyInto(cArr3, cArr3, o00oooo2.f27228OooO0Oo - i19, i10, i18);
            o00oooo2.f27227OooO0OO = i9;
            o00oooo2.f27228OooO0Oo -= i19;
        } else if (i9 >= i18 || i10 < i18) {
            int i20 = o00oooo2.f27228OooO0Oo;
            int i21 = i20 - i18;
            int i22 = i9 + i21;
            int i23 = i21 + i10;
            char[] cArr4 = o00oooo2.f27226OooO0O0;
            ArraysKt.copyInto(cArr4, cArr4, i18, i20, i22);
            o00oooo2.f27227OooO0OO += i22 - i20;
            o00oooo2.f27228OooO0Oo = i23;
        } else {
            o00oooo2.f27228OooO0Oo = (o00oooo2.f27228OooO0Oo - i18) + i10;
            o00oooo2.f27227OooO0OO = i9;
        }
        o00O000.OooO0OO(text, o00oooo2.f27226OooO0O0, o00oooo2.f27227OooO0OO);
        o00oooo2.f27227OooO0OO = text.length() + o00oooo2.f27227OooO0OO;
    }

    @NotNull
    public final String toString() {
        o00oOoo o00oooo2 = this.f27180OooO0O0;
        if (o00oooo2 == null) {
            return this.f27179OooO00o;
        }
        StringBuilder builder = new StringBuilder();
        builder.append((CharSequence) this.f27179OooO00o, 0, this.f27181OooO0OO);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(o00oooo2.f27226OooO0O0, 0, o00oooo2.f27227OooO0OO);
        char[] cArr = o00oooo2.f27226OooO0O0;
        int i = o00oooo2.f27228OooO0Oo;
        builder.append(cArr, i, o00oooo2.f27225OooO00o - i);
        String str = this.f27179OooO00o;
        builder.append((CharSequence) str, this.f27182OooO0Oo, str.length());
        String string = builder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
