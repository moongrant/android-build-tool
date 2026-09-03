package p660o0ooo0o0;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import p659o0ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0000 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0000 f51262OooOOOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f51264OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f51265OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f51266OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f51267OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f51268OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f51269OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f51270OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f51271OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f51272OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f51273OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f51274OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f51275OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f51276OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooO00o f51263OooOOOo = new OooO00o();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0000 f51261OooOOO = new o00O0000(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    public static final class OooO00o {
        public final int OooO00o(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (StringsKt__StringsKt.contains$default(str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004b  */
        /* JADX WARN: Code duplicated, block: B:17:0x006d  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:45:0x0103  */
        /* JADX WARN: Code duplicated, block: B:47:0x010b  */
        /* JADX WARN: Code duplicated, block: B:48:0x0112  */
        /* JADX WARN: Code duplicated, block: B:50:0x011b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0120  */
        /* JADX WARN: Code duplicated, block: B:53:0x0128  */
        /* JADX WARN: Code duplicated, block: B:54:0x012b  */
        /* JADX WARN: Code duplicated, block: B:56:0x0133  */
        /* JADX WARN: Code duplicated, block: B:57:0x0137  */
        /* JADX WARN: Code duplicated, block: B:59:0x013f  */
        /* JADX WARN: Code duplicated, block: B:60:0x0143  */
        /* JADX WARN: Code duplicated, block: B:62:0x014b  */
        /* JADX WARN: Code duplicated, block: B:63:0x0154  */
        /* JADX WARN: Code duplicated, block: B:65:0x015c  */
        /* JADX WARN: Code duplicated, block: B:66:0x0162  */
        /* JADX WARN: Code duplicated, block: B:68:0x016b  */
        /* JADX WARN: Code duplicated, block: B:69:0x016e  */
        /* JADX WARN: Code duplicated, block: B:71:0x0176  */
        /* JADX WARN: Code duplicated, block: B:72:0x0179  */
        /* JADX WARN: Code duplicated, block: B:74:0x0181  */
        /* JADX WARN: Code duplicated, block: B:97:0x0183 A[SYNTHETIC] */
        @JvmStatic
        @NotNull
        public final o00O0000 OooO0O0(@NotNull o00O o00o2) {
            int i;
            int iOooO00o;
            String string;
            int i2;
            int iOooO00o2;
            String string2;
            o00O headers = o00o2;
            Intrinsics.checkNotNullParameter(headers, "headers");
            int length = headers.f51230Oooo0o.length / 2;
            int i3 = 0;
            boolean z = true;
            String str = null;
            boolean z2 = false;
            boolean z3 = false;
            int iOooOoOO = -1;
            int iOooOoOO2 = -1;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            int iOooOoOO3 = -1;
            int iOooOoOO4 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            while (i3 < length) {
                String strOooO0O0 = headers.OooO0O0(i3);
                String indexOfNonWhitespace = headers.OooO0o0(i3);
                if (StringsKt.OooO(strOooO0O0, "Cache-Control")) {
                    if (str == null) {
                        str = indexOfNonWhitespace;
                    }
                    i = 0;
                    while (i < indexOfNonWhitespace.length()) {
                        iOooO00o = OooO00o(indexOfNonWhitespace, "=,;", i);
                        String strSubstring = indexOfNonWhitespace.substring(i, iOooO00o);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type kotlin.CharSequence");
                        string = StringsKt.trim((CharSequence) strSubstring).toString();
                        if (iOooO00o != indexOfNonWhitespace.length()) {
                            i2 = length;
                            if (indexOfNonWhitespace.charAt(iOooO00o) == ',' && indexOfNonWhitespace.charAt(iOooO00o) != ';') {
                                int length2 = iOooO00o + 1;
                                byte[] bArr = o00OOO00.f51183OooO00o;
                                Intrinsics.checkNotNullParameter(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
                                int length3 = indexOfNonWhitespace.length();
                                while (true) {
                                    if (length2 >= length3) {
                                        length2 = indexOfNonWhitespace.length();
                                        break;
                                    }
                                    char cCharAt = indexOfNonWhitespace.charAt(length2);
                                    int i4 = length3;
                                    if (cCharAt != ' ' && cCharAt != '\t') {
                                        break;
                                    }
                                    length2++;
                                    length3 = i4;
                                }
                                if (length2 >= indexOfNonWhitespace.length() || indexOfNonWhitespace.charAt(length2) != '\"') {
                                    iOooO00o2 = OooO00o(indexOfNonWhitespace, ",;", length2);
                                    String strSubstring2 = indexOfNonWhitespace.substring(length2, iOooO00o2);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    Objects.requireNonNull(strSubstring2, "null cannot be cast to non-null type kotlin.CharSequence");
                                    string2 = StringsKt.trim((CharSequence) strSubstring2).toString();
                                } else {
                                    int i5 = length2 + 1;
                                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default(indexOfNonWhitespace, Typography.quote, i5, false, 4, (Object) null);
                                    string2 = indexOfNonWhitespace.substring(i5, iIndexOf$default);
                                    Intrinsics.checkNotNullExpressionValue(string2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    iOooO00o2 = iIndexOf$default + 1;
                                }
                            }
                            if (StringsKt.OooO("no-cache", string)) {
                                z2 = true;
                            } else if (StringsKt.OooO("no-store", string)) {
                                z3 = true;
                            } else if (StringsKt.OooO("max-age", string)) {
                                iOooOoOO = o00OOO00.OooOoOO(string2, -1);
                            } else if (StringsKt.OooO("s-maxage", string)) {
                                iOooOoOO2 = o00OOO00.OooOoOO(string2, -1);
                            } else if (StringsKt.OooO("private", string)) {
                                z4 = true;
                            } else if (StringsKt.OooO("public", string)) {
                                z5 = true;
                            } else if (StringsKt.OooO("must-revalidate", string)) {
                                z6 = true;
                            } else if (StringsKt.OooO("max-stale", string)) {
                                iOooOoOO3 = o00OOO00.OooOoOO(string2, Integer.MAX_VALUE);
                            } else if (StringsKt.OooO("min-fresh", string)) {
                                iOooOoOO4 = o00OOO00.OooOoOO(string2, -1);
                            } else if (StringsKt.OooO("only-if-cached", string)) {
                                z7 = true;
                            } else if (StringsKt.OooO("no-transform", string)) {
                                z8 = true;
                            } else if (StringsKt.OooO("immutable", string)) {
                                z9 = true;
                            }
                            i = iOooO00o2;
                            length = i2;
                        } else {
                            i2 = length;
                        }
                        iOooO00o2 = iOooO00o + 1;
                        string2 = null;
                        if (StringsKt.OooO("no-cache", string)) {
                            z2 = true;
                        } else if (StringsKt.OooO("no-store", string)) {
                            z3 = true;
                        } else if (StringsKt.OooO("max-age", string)) {
                            iOooOoOO = o00OOO00.OooOoOO(string2, -1);
                        } else if (StringsKt.OooO("s-maxage", string)) {
                            iOooOoOO2 = o00OOO00.OooOoOO(string2, -1);
                        } else if (StringsKt.OooO("private", string)) {
                            z4 = true;
                        } else if (StringsKt.OooO("public", string)) {
                            z5 = true;
                        } else if (StringsKt.OooO("must-revalidate", string)) {
                            z6 = true;
                        } else if (StringsKt.OooO("max-stale", string)) {
                            iOooOoOO3 = o00OOO00.OooOoOO(string2, Integer.MAX_VALUE);
                        } else if (StringsKt.OooO("min-fresh", string)) {
                            iOooOoOO4 = o00OOO00.OooOoOO(string2, -1);
                        } else if (StringsKt.OooO("only-if-cached", string)) {
                            z7 = true;
                        } else if (StringsKt.OooO("no-transform", string)) {
                            z8 = true;
                        } else if (StringsKt.OooO("immutable", string)) {
                            z9 = true;
                        }
                        i = iOooO00o2;
                        length = i2;
                    }
                    i3++;
                    headers = o00o2;
                    length = length;
                } else {
                    if (StringsKt.OooO(strOooO0O0, "Pragma")) {
                    }
                    i3++;
                    headers = o00o2;
                    length = length;
                }
                z = false;
                i = 0;
                while (i < indexOfNonWhitespace.length()) {
                    iOooO00o = OooO00o(indexOfNonWhitespace, "=,;", i);
                    String strSubstring3 = indexOfNonWhitespace.substring(i, iOooO00o);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Objects.requireNonNull(strSubstring3, "null cannot be cast to non-null type kotlin.CharSequence");
                    string = StringsKt.trim((CharSequence) strSubstring3).toString();
                    if (iOooO00o != indexOfNonWhitespace.length()) {
                        i2 = length;
                        if (indexOfNonWhitespace.charAt(iOooO00o) == ',') {
                        }
                        if (StringsKt.OooO("no-cache", string)) {
                            z2 = true;
                        } else if (StringsKt.OooO("no-store", string)) {
                            z3 = true;
                        } else if (StringsKt.OooO("max-age", string)) {
                            iOooOoOO = o00OOO00.OooOoOO(string2, -1);
                        } else if (StringsKt.OooO("s-maxage", string)) {
                            iOooOoOO2 = o00OOO00.OooOoOO(string2, -1);
                        } else if (StringsKt.OooO("private", string)) {
                            z4 = true;
                        } else if (StringsKt.OooO("public", string)) {
                            z5 = true;
                        } else if (StringsKt.OooO("must-revalidate", string)) {
                            z6 = true;
                        } else if (StringsKt.OooO("max-stale", string)) {
                            iOooOoOO3 = o00OOO00.OooOoOO(string2, Integer.MAX_VALUE);
                        } else if (StringsKt.OooO("min-fresh", string)) {
                            iOooOoOO4 = o00OOO00.OooOoOO(string2, -1);
                        } else if (StringsKt.OooO("only-if-cached", string)) {
                            z7 = true;
                        } else if (StringsKt.OooO("no-transform", string)) {
                            z8 = true;
                        } else if (StringsKt.OooO("immutable", string)) {
                            z9 = true;
                        }
                        i = iOooO00o2;
                        length = i2;
                    } else {
                        i2 = length;
                    }
                    iOooO00o2 = iOooO00o + 1;
                    string2 = null;
                    if (StringsKt.OooO("no-cache", string)) {
                        z2 = true;
                    } else if (StringsKt.OooO("no-store", string)) {
                        z3 = true;
                    } else if (StringsKt.OooO("max-age", string)) {
                        iOooOoOO = o00OOO00.OooOoOO(string2, -1);
                    } else if (StringsKt.OooO("s-maxage", string)) {
                        iOooOoOO2 = o00OOO00.OooOoOO(string2, -1);
                    } else if (StringsKt.OooO("private", string)) {
                        z4 = true;
                    } else if (StringsKt.OooO("public", string)) {
                        z5 = true;
                    } else if (StringsKt.OooO("must-revalidate", string)) {
                        z6 = true;
                    } else if (StringsKt.OooO("max-stale", string)) {
                        iOooOoOO3 = o00OOO00.OooOoOO(string2, Integer.MAX_VALUE);
                    } else if (StringsKt.OooO("min-fresh", string)) {
                        iOooOoOO4 = o00OOO00.OooOoOO(string2, -1);
                    } else if (StringsKt.OooO("only-if-cached", string)) {
                        z7 = true;
                    } else if (StringsKt.OooO("no-transform", string)) {
                        z8 = true;
                    } else if (StringsKt.OooO("immutable", string)) {
                        z9 = true;
                    }
                    i = iOooO00o2;
                    length = i2;
                }
                i3++;
                headers = o00o2;
                length = length;
            }
            return new o00O0000(z2, z3, iOooOoOO, iOooOoOO2, z4, z5, z6, iOooOoOO3, iOooOoOO4, z7, z8, z9, !z ? null : str);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long j = Integer.MAX_VALUE;
        long seconds = timeUnit.toSeconds(j);
        f51262OooOOOO = new o00O0000(false, false, -1, -1, false, false, false, seconds > j ? Integer.MAX_VALUE : (int) seconds, -1, true, false, false, null);
    }

    public o00O0000(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f51265OooO00o = z;
        this.f51266OooO0O0 = z2;
        this.f51267OooO0OO = i;
        this.f51268OooO0Oo = i2;
        this.f51270OooO0o0 = z3;
        this.f51269OooO0o = z4;
        this.f51271OooO0oO = z5;
        this.f51272OooO0oo = i3;
        this.f51264OooO = i4;
        this.f51273OooOO0 = z6;
        this.f51274OooOO0O = z7;
        this.f51275OooOO0o = z8;
        this.f51276OooOOO0 = str;
    }

    @NotNull
    public final String toString() {
        String str = this.f51276OooOOO0;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f51265OooO00o) {
            sb.append("no-cache, ");
        }
        if (this.f51266OooO0O0) {
            sb.append("no-store, ");
        }
        if (this.f51267OooO0OO != -1) {
            sb.append("max-age=");
            sb.append(this.f51267OooO0OO);
            sb.append(", ");
        }
        if (this.f51268OooO0Oo != -1) {
            sb.append("s-maxage=");
            sb.append(this.f51268OooO0Oo);
            sb.append(", ");
        }
        if (this.f51270OooO0o0) {
            sb.append("private, ");
        }
        if (this.f51269OooO0o) {
            sb.append("public, ");
        }
        if (this.f51271OooO0oO) {
            sb.append("must-revalidate, ");
        }
        if (this.f51272OooO0oo != -1) {
            sb.append("max-stale=");
            sb.append(this.f51272OooO0oo);
            sb.append(", ");
        }
        if (this.f51264OooO != -1) {
            sb.append("min-fresh=");
            sb.append(this.f51264OooO);
            sb.append(", ");
        }
        if (this.f51273OooOO0) {
            sb.append("only-if-cached, ");
        }
        if (this.f51274OooOO0O) {
            sb.append("no-transform, ");
        }
        if (this.f51275OooOO0o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.f51276OooOOO0 = string;
        return string;
    }
}
