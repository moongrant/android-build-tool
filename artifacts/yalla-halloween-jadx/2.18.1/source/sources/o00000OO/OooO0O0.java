package o00000OO;

import android.text.Layout;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Layout f27012OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Integer> f27013OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<Bidi> f27014OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final boolean[] f27015OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public char[] f27016OooO0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f27017OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f27018OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f27019OooO0OO;

        public OooO00o(int i, int i2, boolean z) {
            this.f27017OooO00o = i;
            this.f27018OooO0O0 = i2;
            this.f27019OooO0OO = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f27017OooO00o == oooO00o.f27017OooO00o && this.f27018OooO0O0 == oooO00o.f27018OooO0O0 && this.f27019OooO0OO == oooO00o.f27019OooO0OO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int i = ((this.f27017OooO00o * 31) + this.f27018OooO0O0) * 31;
            boolean z = this.f27019OooO0OO;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return i + r1;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("BidiRun(start=");
            sbOooO0o0.append(this.f27017OooO00o);
            sbOooO0o0.append(", end=");
            sbOooO0o0.append(this.f27018OooO0O0);
            sbOooO0o0.append(", isRtl=");
            return Oooo000.Oooo0.OooO0O0(sbOooO0o0, this.f27019OooO0OO, ')');
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    public OooO0O0(@NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f27012OooO00o = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            CharSequence text = this.f27012OooO00o.getText();
            Intrinsics.checkNotNullExpressionValue(text, "layout.text");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default(text, '\n', length, false, 4, (Object) null);
            length = iIndexOf$default < 0 ? this.f27012OooO00o.getText().length() : iIndexOf$default + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f27012OooO00o.getText().length());
        this.f27013OooO0O0 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.f27014OooO0OO = arrayList2;
        this.f27015OooO0Oo = new boolean[this.f27013OooO0O0.size()];
        this.f27013OooO0O0.size();
    }

    public final float OooO00o(int i, boolean z) {
        return z ? this.f27012OooO00o.getPrimaryHorizontal(i) : this.f27012OooO00o.getSecondaryHorizontal(i);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:81:0x013c  */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.ArrayList, java.util.List<java.text.Bidi>] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList, java.util.List<java.text.Bidi>] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    public final float OooO0O0(int i, boolean z, boolean z2) {
        int lineCount;
        Bidi bidi;
        Bidi bidi2;
        int i2;
        int i3;
        boolean z3;
        if (!z2) {
            return OooO00o(i, z);
        }
        Layout layout = this.f27012OooO00o;
        Intrinsics.checkNotNullParameter(layout, "<this>");
        boolean z4 = false;
        if (i <= 0) {
            lineCount = 0;
        } else if (i >= layout.getText().length()) {
            lineCount = layout.getLineCount() - 1;
        } else {
            int lineForOffset = layout.getLineForOffset(i);
            int lineStart = layout.getLineStart(lineForOffset);
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (lineStart == i || lineEnd == i) {
                if (lineStart == i) {
                    if (z2) {
                        lineForOffset--;
                    }
                } else if (!z2) {
                    lineForOffset++;
                }
            }
            lineCount = lineForOffset;
        }
        int lineStart2 = this.f27012OooO00o.getLineStart(lineCount);
        int lineEnd2 = this.f27012OooO00o.getLineEnd(lineCount);
        if (i != lineStart2 && i != lineEnd2) {
            return OooO00o(i, z);
        }
        if (i == 0 || i == this.f27012OooO00o.getText().length()) {
            return OooO00o(i, z);
        }
        int iBinarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(this.f27013OooO0O0, Integer.valueOf(i), 0, 0, 6, (Object) null);
        int i4 = iBinarySearch$default < 0 ? -(iBinarySearch$default + 1) : iBinarySearch$default + 1;
        if (z2 && i4 > 0) {
            int i5 = i4 - 1;
            if (i == ((Number) this.f27013OooO0O0.get(i5)).intValue()) {
                i4 = i5;
            }
        }
        boolean zOooO0Oo = OooO0Oo(i4);
        while (lineEnd2 > 0) {
            int i6 = lineEnd2 - 1;
            char cCharAt = this.f27012OooO00o.getText().charAt(i6);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == 5760) {
                z3 = true;
            } else if (((8192 <= cCharAt && cCharAt < 8203) && cCharAt != 8199) || cCharAt == 8287 || cCharAt == 12288) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                break;
            }
            lineEnd2 = i6;
        }
        int iOooO0OO = OooO0OO(i4);
        int i7 = lineStart2 - iOooO0OO;
        int i8 = lineEnd2 - iOooO0OO;
        if (this.f27015OooO0Oo[i4]) {
            bidi2 = (Bidi) this.f27014OooO0OO.get(i4);
        } else {
            int iIntValue = i4 == 0 ? 0 : ((Number) this.f27013OooO0O0.get(i4 - 1)).intValue();
            int iIntValue2 = ((Number) this.f27013OooO0O0.get(i4)).intValue();
            int i9 = iIntValue2 - iIntValue;
            char[] cArr = this.f27016OooO0o0;
            if (cArr == null || cArr.length < i9) {
                cArr = new char[i9];
            }
            char[] cArr2 = cArr;
            TextUtils.getChars(this.f27012OooO00o.getText(), iIntValue, iIntValue2, cArr2, 0);
            if (Bidi.requiresBidi(cArr2, 0, i9)) {
                bidi = new Bidi(cArr2, 0, null, 0, i9, OooO0Oo(i4) ? 1 : 0);
                if (bidi.getRunCount() == 1) {
                    bidi = null;
                }
            } else {
                bidi = null;
            }
            this.f27014OooO0OO.set(i4, bidi);
            this.f27015OooO0Oo[i4] = true;
            if (bidi != null) {
                char[] cArr3 = this.f27016OooO0o0;
                cArr2 = cArr2 == cArr3 ? null : cArr3;
            }
            this.f27016OooO0o0 = cArr2;
            bidi2 = bidi;
        }
        Bidi bidiCreateLineBidi = bidi2 != null ? bidi2.createLineBidi(i7, i8) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.f27012OooO00o.isRtlCharAt(lineStart2);
            if (z || zOooO0Oo == zIsRtlCharAt) {
                zOooO0Oo = !zOooO0Oo;
            }
            if (i == lineStart2) {
                z4 = zOooO0Oo;
            } else if (!zOooO0Oo) {
                z4 = true;
            }
            Layout layout2 = this.f27012OooO00o;
            return z4 ? layout2.getLineLeft(lineCount) : layout2.getLineRight(lineCount);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        OooO00o[] oooO00oArr = new OooO00o[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            oooO00oArr[i10] = new OooO00o(bidiCreateLineBidi.getRunStart(i10) + lineStart2, bidiCreateLineBidi.getRunLimit(i10) + lineStart2, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i11 = 0; i11 < runCount2; i11++) {
            bArr[i11] = (byte) bidiCreateLineBidi.getRunLevel(i11);
        }
        Bidi.reorderVisually(bArr, 0, oooO00oArr, 0, runCount);
        if (i == lineStart2) {
            int i12 = 0;
            while (true) {
                if (i12 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (oooO00oArr[i12].f27017OooO00o == i) {
                    i3 = i12;
                    break;
                }
                i12++;
            }
            OooO00o oooO00o = oooO00oArr[i3];
            if (!z && zOooO0Oo != oooO00o.f27019OooO0OO) {
                z4 = zOooO0Oo;
            } else if (!zOooO0Oo) {
                z4 = true;
            }
            if (i3 == 0 && z4) {
                return this.f27012OooO00o.getLineLeft(lineCount);
            }
            if (i3 != ArraysKt.getLastIndex(oooO00oArr) || z4) {
                return z4 ? this.f27012OooO00o.getPrimaryHorizontal(oooO00oArr[i3 - 1].f27017OooO00o) : this.f27012OooO00o.getPrimaryHorizontal(oooO00oArr[i3 + 1].f27017OooO00o);
            }
            return this.f27012OooO00o.getLineRight(lineCount);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= runCount) {
                i2 = -1;
                break;
            }
            if (oooO00oArr[i13].f27018OooO0O0 == i) {
                i2 = i13;
                break;
            }
            i13++;
        }
        OooO00o oooO00o2 = oooO00oArr[i2];
        if (z || zOooO0Oo == oooO00o2.f27019OooO0OO) {
            z4 = zOooO0Oo;
        } else if (!zOooO0Oo) {
            z4 = true;
        }
        if (i2 == 0 && z4) {
            return this.f27012OooO00o.getLineLeft(lineCount);
        }
        if (i2 != ArraysKt.getLastIndex(oooO00oArr) || z4) {
            return z4 ? this.f27012OooO00o.getPrimaryHorizontal(oooO00oArr[i2 - 1].f27018OooO0O0) : this.f27012OooO00o.getPrimaryHorizontal(oooO00oArr[i2 + 1].f27018OooO0O0);
        }
        return this.f27012OooO00o.getLineRight(lineCount);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    public final int OooO0OO(@IntRange(from = ULong.MIN_VALUE) int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.f27013OooO0O0.get(i - 1)).intValue();
    }

    public final boolean OooO0Oo(@IntRange(from = ULong.MIN_VALUE) int i) {
        return this.f27012OooO00o.getParagraphDirection(this.f27012OooO00o.getLineForOffset(OooO0OO(i))) == -1;
    }
}
