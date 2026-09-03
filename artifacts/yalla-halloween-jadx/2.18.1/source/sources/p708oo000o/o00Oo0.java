package p708oo000o;

import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final List<OooOOOO> f53217OooO00o = CollectionsKt.emptyList();

    static {
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        long j = o00000O0.f32069OooO0oo;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<oo000o.OooOOOO>] */
    @NotNull
    public static final List<OooOOOO> OooO00o(@Nullable String pathData) {
        char c;
        float[] fArr;
        if (pathData == null) {
            return f53217OooO00o;
        }
        OooOo00 oooOo00 = new OooOo00();
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        oooOo00.f53187OooO00o.clear();
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 < pathData.length()) {
            while (i2 < pathData.length()) {
                char cCharAt = pathData.charAt(i2);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        break;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i2++;
            }
            String strSubstring = pathData.substring(i3, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = strSubstring.length() - i;
            int i4 = 0;
            boolean z = false;
            while (true) {
                c = ' ';
                if (i4 > length) {
                    break;
                }
                boolean z2 = Intrinsics.compare((int) strSubstring.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            String string = strSubstring.subSequence(i4, length + 1).toString();
            if (string.length() > 0) {
                if (string.charAt(0) == 'z' || string.charAt(0) == 'Z') {
                    fArr = new float[0];
                } else {
                    int length2 = string.length();
                    float[] fArr2 = new float[length2];
                    int length3 = string.length();
                    int i5 = 1;
                    int i6 = 0;
                    while (i5 < length3) {
                        int i7 = i5;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = false;
                        boolean z6 = false;
                        while (i7 < string.length()) {
                            char cCharAt2 = string.charAt(i7);
                            if (cCharAt2 == c || cCharAt2 == ',') {
                                z4 = false;
                                z6 = true;
                            } else if (cCharAt2 != '-') {
                                if (cCharAt2 == '.') {
                                    if (!z3) {
                                        z3 = true;
                                    }
                                    z5 = true;
                                    z4 = false;
                                    z6 = true;
                                } else {
                                    if (cCharAt2 == 'e' || cCharAt2 == 'E') {
                                        z4 = true;
                                    }
                                }
                                z4 = false;
                            } else if (i7 == i5 || z4) {
                                z4 = false;
                            } else {
                                z5 = true;
                                z4 = false;
                                z6 = true;
                            }
                            if (z6) {
                                break;
                            }
                            i7++;
                            c = ' ';
                        }
                        if (i5 < i7) {
                            String strSubstring2 = string.substring(i5, i7);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            fArr2[i6] = Float.parseFloat(strSubstring2);
                            i6++;
                        }
                        if (!z5) {
                            i7++;
                        }
                        i5 = i7;
                        c = ' ';
                    }
                    if (i6 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (length2 < 0) {
                        throw new IndexOutOfBoundsException();
                    }
                    int i8 = i6 + 0;
                    fArr = new float[i8];
                    ArraysKt___ArraysJvmKt.copyInto(fArr2, fArr, 0, 0, Math.min(i8, length2 + 0) + 0);
                }
                oooOo00.OooO00o(string.charAt(0), fArr);
            }
            i3 = i2;
            i2++;
            i = 1;
        }
        if (i2 - i3 == 1 && i3 < pathData.length()) {
            oooOo00.OooO00o(pathData.charAt(i3), new float[0]);
        }
        return oooOo00.f53187OooO00o;
    }
}
