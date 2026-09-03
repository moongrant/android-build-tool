package p634o0ooO0oO;

import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import com.facebook.share.internal.ShareConstants;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.UByte;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p635o0ooO0oo.o0O000O;
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final char[] f57201OooOO0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final String f57202OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f57203OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f57204OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f57205OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f57206OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final List<String> f57207OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f57208OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final List<String> f57209OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final String f57210OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f57211OooOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f57212OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public String f57215OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final ArrayList f57216OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public List<String> f57218OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public String f57219OooO0oo;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public String f57213OooO0O0 = "";

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public String f57214OooO0OO = "";

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f57217OooO0o0 = -1;

        public OooO00o() {
            ArrayList arrayList = new ArrayList();
            this.f57216OooO0o = arrayList;
            arrayList.add("");
        }

        @NotNull
        public final void OooO(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f57218OooO0oO == null) {
                return;
            }
            String strOooO00o = OooO0O0.OooO00o(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219);
            List<String> list = this.f57218OooO0oO;
            Intrinsics.checkNotNull(list);
            int size = list.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                int i = size - 2;
                List<String> list2 = this.f57218OooO0oO;
                Intrinsics.checkNotNull(list2);
                if (Intrinsics.areEqual(strOooO00o, list2.get(size))) {
                    List<String> list3 = this.f57218OooO0oO;
                    Intrinsics.checkNotNull(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.f57218OooO0oO;
                    Intrinsics.checkNotNull(list4);
                    list4.remove(size);
                    List<String> list5 = this.f57218OooO0oO;
                    Intrinsics.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.f57218OooO0oO = null;
                        return;
                    }
                }
                if (size == progressionLastElement) {
                    return;
                } else {
                    size = i;
                }
            }
        }

        @NotNull
        public final void OooO00o(@NotNull String encodedName, @Nullable String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f57218OooO0oO == null) {
                this.f57218OooO0oO = new ArrayList();
            }
            List<String> list = this.f57218OooO0oO;
            Intrinsics.checkNotNull(list);
            list.add(OooO0O0.OooO00o(encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
            List<String> list2 = this.f57218OooO0oO;
            Intrinsics.checkNotNull(list2);
            list2.add(str == null ? null : OooO0O0.OooO00o(str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
        }

        @NotNull
        public final void OooO0O0(@NotNull String name, @Nullable String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f57218OooO0oO == null) {
                this.f57218OooO0oO = new ArrayList();
            }
            List<String> list = this.f57218OooO0oO;
            Intrinsics.checkNotNull(list);
            list.add(OooO0O0.OooO00o(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
            List<String> list2 = this.f57218OooO0oO;
            Intrinsics.checkNotNull(list2);
            list2.add(str == null ? null : OooO0O0.OooO00o(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
        }

        @NotNull
        public final o00OO OooO0OO() {
            ArrayList arrayList;
            String str = this.f57212OooO00o;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strOooO0Oo = OooO0O0.OooO0Oo(this.f57213OooO0O0, 0, 0, false, 7);
            String strOooO0Oo2 = OooO0O0.OooO0Oo(this.f57214OooO0OO, 0, 0, false, 7);
            String str2 = this.f57215OooO0Oo;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iOooO0Oo = OooO0Oo();
            ArrayList arrayList2 = this.f57216OooO0o;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(OooO0O0.OooO0Oo((String) it.next(), 0, 0, false, 7));
            }
            List<String> list = this.f57218OooO0oO;
            if (list == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (String str3 : list) {
                    arrayList.add(str3 == null ? null : OooO0O0.OooO0Oo(str3, 0, 0, true, 3));
                }
            }
            String str4 = this.f57219OooO0oo;
            return new o00OO(str, strOooO0Oo, strOooO0Oo2, str2, iOooO0Oo, arrayList3, arrayList, str4 != null ? OooO0O0.OooO0Oo(str4, 0, 0, false, 7) : null, toString());
        }

        public final int OooO0Oo() {
            int i = this.f57217OooO0o0;
            if (i != -1) {
                return i;
            }
            String scheme = this.f57212OooO00o;
            Intrinsics.checkNotNull(scheme);
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        @NotNull
        public final void OooO0o(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strOooO0O0 = o0O000O.OooO0O0(OooO0O0.OooO0Oo(host, 0, 0, false, 7));
            if (strOooO0O0 == null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected host: ", host));
            }
            this.f57215OooO0Oo = strOooO0O0;
        }

        @NotNull
        public final void OooO0o0(@Nullable String str) {
            String strOooO00o;
            this.f57218OooO0oO = (str == null || (strOooO00o = OooO0O0.OooO00o(str, 0, 0, " \"'<>#", true, false, true, false, null, 211)) == null) ? null : OooO0O0.OooO0o0(strOooO00o);
        }

        /* JADX WARN: Code duplicated, block: B:115:0x0216  */
        /* JADX WARN: Code duplicated, block: B:117:0x021e  */
        /* JADX WARN: Code duplicated, block: B:120:0x0222  */
        /* JADX WARN: Code duplicated, block: B:123:0x022b  */
        /* JADX WARN: Code duplicated, block: B:126:0x0232  */
        /* JADX WARN: Code duplicated, block: B:131:0x023e  */
        /* JADX WARN: Code duplicated, block: B:140:0x026e  */
        /* JADX WARN: Code duplicated, block: B:143:0x0272  */
        /* JADX WARN: Code duplicated, block: B:149:0x0283  */
        /* JADX WARN: Code duplicated, block: B:150:0x0285  */
        /* JADX WARN: Code duplicated, block: B:152:0x0288  */
        /* JADX WARN: Code duplicated, block: B:153:0x0291  */
        /* JADX WARN: Code duplicated, block: B:155:0x02b9  */
        /* JADX WARN: Code duplicated, block: B:158:0x02d9  */
        /* JADX WARN: Code duplicated, block: B:159:0x02db  */
        /* JADX WARN: Code duplicated, block: B:161:0x02de  */
        /* JADX WARN: Code duplicated, block: B:193:0x037e  */
        /* JADX WARN: Code duplicated, block: B:222:0x0235 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:223:0x0230 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:225:0x0233 A[EDGE_INSN: B:225:0x0233->B:127:0x0233 BREAK  A[LOOP:6: B:118:0x021f->B:227:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:89:0x0146  */
        /* JADX WARN: Code duplicated, block: B:92:0x0151  */
        /* JADX WARN: Code duplicated, block: B:93:0x0156  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @NotNull
        public final void OooO0oO(@Nullable o00OO o00oo2, @NotNull String str) {
            int i;
            byte b;
            byte b2;
            int i2;
            int iOooO0o0;
            byte bCharAt;
            String str2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            char c;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            boolean z;
            char cCharAt;
            int i14;
            int i15;
            int iOooO0o1;
            int i16;
            String str3;
            char c2;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            byte[] bArr = o0O000o0.f57386OooO00o;
            int i17 = 0;
            int iOooOOO = o0O000o0.OooOOO(0, str.length(), input);
            int iOooOOOO = o0O000o0.OooOOOO(iOooOOO, str.length(), input);
            char c3 = ':';
            byte b3 = -1;
            if (iOooOOOO - iOooOOO >= 2) {
                char cCharAt2 = input.charAt(iOooOOO);
                char c4 = 'a';
                if ((Intrinsics.compare((int) cCharAt2, 97) >= 0 && Intrinsics.compare((int) cCharAt2, 122) <= 0) || (Intrinsics.compare((int) cCharAt2, 65) >= 0 && Intrinsics.compare((int) cCharAt2, 90) <= 0)) {
                    i = iOooOOO + 1;
                    while (true) {
                        if (i < iOooOOOO) {
                            int i18 = i + 1;
                            char cCharAt3 = input.charAt(i);
                            if (!((((((c4 <= cCharAt3 && cCharAt3 < '{') || ('A' <= cCharAt3 && cCharAt3 < '[')) || ('0' <= cCharAt3 && cCharAt3 < ':')) || cCharAt3 == '+') || cCharAt3 == '-') || cCharAt3 == '.')) {
                                if (cCharAt3 == ':') {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                c4 = 'a';
                                i = i18;
                            }
                        }
                        i = -1;
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
            String str4 = "this as java.lang.String…ing(startIndex, endIndex)";
            if (i != -1) {
                if (StringsKt__StringsJVMKt.startsWith(input, "https:", iOooOOO, true)) {
                    this.f57212OooO00o = "https";
                    iOooOOO += 6;
                } else {
                    if (!StringsKt__StringsJVMKt.startsWith(input, "http:", iOooOOO, true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f57212OooO00o = "http";
                    iOooOOO += 5;
                }
            } else {
                if (o00oo2 == null) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Expected URL scheme 'http' or 'https' but no scheme was found for ", str.length() > 6 ? Intrinsics.stringPlus(StringsKt.take(input, 6), "...") : input));
                }
                this.f57212OooO00o = o00oo2.f57203OooO00o;
            }
            int i19 = iOooOOO;
            while (true) {
                b = 92;
                b2 = 47;
                if (i19 >= iOooOOOO) {
                    break;
                }
                int i20 = i19 + 1;
                char cCharAt4 = input.charAt(i19);
                if (cCharAt4 != '\\' && cCharAt4 != '/') {
                    break;
                }
                i17++;
                i19 = i20;
            }
            ArrayList arrayList = this.f57216OooO0o;
            byte b4 = 63;
            byte b5 = 35;
            if (i17 >= 2 || o00oo2 == null) {
                i2 = iOooOOO + i17;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    iOooO0o0 = o0O000o0.OooO0o0(i2, iOooOOOO, input, "@/\\?#");
                    if (iOooO0o0 != iOooOOOO) {
                        bCharAt = input.charAt(iOooO0o0);
                    } else {
                        bCharAt = b3;
                    }
                    if (bCharAt == b3 || bCharAt == b5 || bCharAt == b2 || bCharAt == b || bCharAt == b4) {
                        break;
                    }
                    byte b6 = b;
                    if (bCharAt != 64) {
                        b = b6;
                    } else {
                        if (z2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f57214OooO0OO);
                            sb2.append("%40");
                            i15 = iOooO0o0;
                            sb2.append(OooO0O0.OooO00o(str, i2, iOooO0o0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240));
                            this.f57214OooO0OO = sb2.toString();
                        } else {
                            int iOooO0o = o0O000o0.OooO0o(input, c3, i2, iOooO0o0);
                            String strOooO00o = OooO0O0.OooO00o(str, i2, iOooO0o, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                            if (z3) {
                                strOooO00o = OooO0OO.OooO0OO(new StringBuilder(), this.f57213OooO0O0, "%40", strOooO00o);
                            }
                            this.f57213OooO0O0 = strOooO00o;
                            if (iOooO0o != iOooO0o0) {
                                this.f57214OooO0OO = OooO0O0.OooO00o(str, iOooO0o + 1, iOooO0o0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                                z2 = true;
                            }
                            i15 = iOooO0o0;
                            z3 = true;
                        }
                        i2 = i15 + 1;
                        b4 = 63;
                        b2 = 47;
                        b = 92;
                        b3 = -1;
                        c3 = ':';
                        b5 = 35;
                        str4 = str4;
                    }
                }
                str2 = str4;
                i3 = i2;
                while (true) {
                    if (i3 >= iOooO0o0) {
                        i4 = 1;
                        i5 = iOooO0o0;
                        break;
                    }
                    cCharAt = input.charAt(i3);
                    if (cCharAt == '[') {
                        i14 = 1;
                        do {
                            i3++;
                            if (i3 < iOooO0o0) {
                                break;
                            }
                        } while (input.charAt(i3) != ']');
                    } else {
                        i4 = 1;
                        if (cCharAt == ':') {
                            i5 = i3;
                            break;
                        }
                        i14 = 1;
                    }
                    i3 += i14;
                }
                i6 = i5 + 1;
                if (i6 < iOooO0o0) {
                    this.f57215OooO0Oo = o0O000O.OooO0O0(OooO0O0.OooO0Oo(input, i2, i5, false, 4));
                    try {
                        i12 = Integer.parseInt(OooO0O0.OooO00o(str, i6, iOooO0o0, "", false, false, false, false, null, 248));
                        i8 = 1;
                        if (1 <= i12 || i12 >= 65536) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            i11 = 1;
                            i8 = i11;
                            i12 = -1;
                        }
                    } catch (NumberFormatException unused) {
                        i11 = 1;
                    }
                    this.f57217OooO0o0 = i12;
                    if (i12 != -1) {
                        i13 = i8;
                    } else {
                        i13 = 0;
                    }
                    if (i13 != 0) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i6, iOooO0o0);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str2);
                        sb3.append(strSubstring2);
                        sb3.append(Typography.quote);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    i9 = 0;
                    c = '\"';
                    i7 = iOooO0o0;
                } else {
                    i7 = iOooO0o0;
                    this.f57215OooO0Oo = o0O000O.OooO0O0(OooO0O0.OooO0Oo(input, i2, i5, false, 4));
                    String str5 = this.f57212OooO00o;
                    Intrinsics.checkNotNull(str5);
                    this.f57217OooO0o0 = OooO0O0.OooO0O0(str5);
                    c = '\"';
                    i8 = i4;
                    i9 = 0;
                }
                if (this.f57215OooO0Oo != null) {
                    i10 = i8;
                } else {
                    i10 = i9;
                }
                if (i10 != 0) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i2, i5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, str2);
                    sb4.append(strSubstring3);
                    sb4.append(c);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iOooOOO = i7;
            } else {
                if (Intrinsics.areEqual(o00oo2.f57203OooO00o, this.f57212OooO00o)) {
                    this.f57213OooO0O0 = o00oo2.OooO0o0();
                    this.f57214OooO0OO = o00oo2.OooO00o();
                    this.f57215OooO0Oo = o00oo2.f57206OooO0Oo;
                    this.f57217OooO0o0 = o00oo2.f57208OooO0o0;
                    arrayList.clear();
                    arrayList.addAll(o00oo2.OooO0OO());
                    if (iOooOOO == iOooOOOO || input.charAt(iOooOOO) == '#') {
                        OooO0o0(o00oo2.OooO0Oo());
                    }
                    i9 = 0;
                    i8 = 1;
                } else {
                    i2 = iOooOOO + i17;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (true) {
                        iOooO0o0 = o0O000o0.OooO0o0(i2, iOooOOOO, input, "@/\\?#");
                        if (iOooO0o0 != iOooOOOO) {
                            bCharAt = input.charAt(iOooO0o0);
                        } else {
                            bCharAt = b3;
                        }
                        if (bCharAt == b3) {
                            break;
                        } else {
                            break;
                        }
                    }
                    str2 = str4;
                    i3 = i2;
                    while (true) {
                        if (i3 >= iOooO0o0) {
                            i4 = 1;
                            i5 = iOooO0o0;
                            break;
                        }
                        cCharAt = input.charAt(i3);
                        if (cCharAt == '[') {
                            i14 = 1;
                            do {
                                i3++;
                                if (i3 < iOooO0o0) {
                                    break;
                                    break;
                                }
                            } while (input.charAt(i3) != ']');
                        } else {
                            i4 = 1;
                            if (cCharAt == ':') {
                                i5 = i3;
                                break;
                            }
                            i14 = 1;
                        }
                        i3 += i14;
                    }
                    i6 = i5 + 1;
                    if (i6 < iOooO0o0) {
                        this.f57215OooO0Oo = o0O000O.OooO0O0(OooO0O0.OooO0Oo(input, i2, i5, false, 4));
                        i12 = Integer.parseInt(OooO0O0.OooO00o(str, i6, iOooO0o0, "", false, false, false, false, null, 248));
                        i8 = 1;
                        if (1 <= i12) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            i11 = 1;
                            i8 = i11;
                            i12 = -1;
                        }
                        this.f57217OooO0o0 = i12;
                        if (i12 != -1) {
                            i13 = i8;
                        } else {
                            i13 = 0;
                        }
                        if (i13 != 0) {
                            StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                            String strSubstring4 = input.substring(i6, iOooO0o0);
                            Intrinsics.checkNotNullExpressionValue(strSubstring4, str2);
                            sb5.append(strSubstring4);
                            sb5.append(Typography.quote);
                            throw new IllegalArgumentException(sb5.toString().toString());
                        }
                        i9 = 0;
                        c = '\"';
                        i7 = iOooO0o0;
                    } else {
                        i7 = iOooO0o0;
                        this.f57215OooO0Oo = o0O000O.OooO0O0(OooO0O0.OooO0Oo(input, i2, i5, false, 4));
                        String str6 = this.f57212OooO00o;
                        Intrinsics.checkNotNull(str6);
                        this.f57217OooO0o0 = OooO0O0.OooO0O0(str6);
                        c = '\"';
                        i8 = i4;
                        i9 = 0;
                    }
                    if (this.f57215OooO0Oo != null) {
                        i10 = i8;
                    } else {
                        i10 = i9;
                    }
                    if (i10 != 0) {
                        StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                        String strSubstring5 = input.substring(i2, i5);
                        Intrinsics.checkNotNullExpressionValue(strSubstring5, str2);
                        sb6.append(strSubstring5);
                        sb6.append(c);
                        throw new IllegalArgumentException(sb6.toString().toString());
                    }
                    iOooOOO = i7;
                }
            }
            int iOooO0o2 = o0O000o0.OooO0o0(iOooOOO, iOooOOOO, input, "?#");
            if (iOooOOO != iOooO0o2) {
                char cCharAt5 = input.charAt(iOooOOO);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    arrayList.clear();
                    arrayList.add("");
                    iOooOOO++;
                } else {
                    arrayList.set(arrayList.size() - i8, "");
                }
                loop2: while (true) {
                    int i21 = iOooOOO;
                    while (true) {
                        if (i21 >= iOooO0o2) {
                            break loop2;
                        }
                        iOooO0o1 = o0O000o0.OooO0o0(i21, iOooO0o2, input, "/\\");
                        int i22 = iOooO0o1 < iOooO0o2 ? i8 : i9;
                        i16 = iOooOOOO;
                        str3 = input;
                        OooO0oo(str, i21, iOooO0o1, i22, true);
                        if (i22 != 0) {
                            i21 = iOooO0o1 + 1;
                            input = str3;
                            iOooOOOO = i16;
                        }
                    }
                    iOooOOO = iOooO0o1;
                    input = str3;
                    iOooOOOO = i16;
                }
            }
            int i23 = iOooOOOO;
            String str7 = input;
            if (iOooO0o2 >= i23 || str7.charAt(iOooO0o2) != '?') {
                c2 = '#';
            } else {
                c2 = '#';
                int i24 = iOooO0o2 + 1;
                iOooO0o2 = o0O000o0.OooO0o(str7, '#', iOooO0o2, i23);
                this.f57218OooO0oO = OooO0O0.OooO0o0(OooO0O0.OooO00o(str, i24, iOooO0o2, " \"'<>#", true, false, true, false, null, 208));
            }
            if (iOooO0o2 >= i23 || str7.charAt(iOooO0o2) != c2) {
                return;
            }
            this.f57219OooO0oo = OooO0O0.OooO00o(str, iOooO0o2 + 1, i23, "", true, false, false, true, null, 176);
        }

        public final void OooO0oo(String str, int i, int i2, boolean z, boolean z2) {
            String strOooO00o = OooO0O0.OooO00o(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240);
            if (Intrinsics.areEqual(strOooO00o, ".") || StringsKt.OooOO0o(strOooO00o, "%2e")) {
                return;
            }
            boolean z3 = Intrinsics.areEqual(strOooO00o, "..") || StringsKt.OooOO0o(strOooO00o, "%2e.") || StringsKt.OooOO0o(strOooO00o, ".%2e") || StringsKt.OooOO0o(strOooO00o, "%2e%2e");
            ArrayList arrayList = this.f57216OooO0o;
            if (z3) {
                if ((((String) arrayList.remove(arrayList.size() - 1)).length() == 0) && (!arrayList.isEmpty())) {
                    arrayList.set(arrayList.size() - 1, "");
                    return;
                } else {
                    arrayList.add("");
                    return;
                }
            }
            if (((CharSequence) OooOOO.OooO0O0(arrayList, 1)).length() == 0) {
                arrayList.set(arrayList.size() - 1, strOooO00o);
            } else {
                arrayList.add(strOooO00o);
            }
            if (z) {
                arrayList.add("");
            }
        }

        @NotNull
        public final void OooOO0(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.OooOO0o(scheme, "http")) {
                this.f57212OooO00o = "http";
            } else {
                if (!StringsKt.OooOO0o(scheme, "https")) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected scheme: ", scheme));
                }
                this.f57212OooO00o = "https";
            }
        }

        @NotNull
        public final void OooOO0O(@NotNull String name, @Nullable String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            OooO(name);
            OooO0O0(name, str);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0035  */
        /* JADX WARN: Code duplicated, block: B:20:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x0046  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
        @NotNull
        public final String toString() {
            StringBuilder out = new StringBuilder();
            String str = this.f57212OooO00o;
            if (str != null) {
                out.append(str);
                out.append("://");
            } else {
                out.append("//");
            }
            if (this.f57213OooO0O0.length() > 0) {
                out.append(this.f57213OooO0O0);
                if (this.f57214OooO0OO.length() > 0) {
                    out.append(':');
                    out.append(this.f57214OooO0OO);
                }
                out.append('@');
            } else if (this.f57214OooO0OO.length() > 0) {
                out.append(this.f57213OooO0O0);
                if (this.f57214OooO0OO.length() > 0) {
                    out.append(':');
                    out.append(this.f57214OooO0OO);
                }
                out.append('@');
            }
            String str2 = this.f57215OooO0Oo;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, ':', false, 2, (Object) null)) {
                    out.append('[');
                    out.append(this.f57215OooO0Oo);
                    out.append(']');
                } else {
                    out.append(this.f57215OooO0Oo);
                }
            }
            int i = -1;
            if (this.f57217OooO0o0 != -1 || this.f57212OooO00o != null) {
                int iOooO0Oo = OooO0Oo();
                String scheme = this.f57212OooO00o;
                if (scheme != null) {
                    Intrinsics.checkNotNull(scheme);
                    Intrinsics.checkNotNullParameter(scheme, "scheme");
                    if (Intrinsics.areEqual(scheme, "http")) {
                        i = 80;
                    } else if (Intrinsics.areEqual(scheme, "https")) {
                        i = 443;
                    }
                    if (iOooO0Oo != i) {
                        out.append(':');
                        out.append(iOooO0Oo);
                    }
                } else {
                    out.append(':');
                    out.append(iOooO0Oo);
                }
            }
            ArrayList arrayList = this.f57216OooO0o;
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                out.append('/');
                out.append((String) arrayList.get(i2));
            }
            if (this.f57218OooO0oO != null) {
                out.append('?');
                List<String> list = this.f57218OooO0oO;
                Intrinsics.checkNotNull(list);
                OooO0O0.OooO0o(out, list);
            }
            if (this.f57219OooO0oo != null) {
                out.append('#');
                out.append(this.f57219OooO0oo);
            }
            String string = out.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public static final class OooO0O0 {
        public static String OooO00o(String str, int i, int i2, String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z5 = (i3 & 8) != 0 ? false : z;
            boolean z6 = (i3 & 16) != 0 ? false : z2;
            boolean z7 = (i3 & 32) != 0 ? false : z3;
            boolean z8 = (i3 & 64) == 0 ? z4 : false;
            int i5 = 128;
            Charset charset2 = (i3 & 128) != 0 ? null : charset;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i4;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i6 = 43;
                int i7 = 32;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= i5 && !z8) || StringsKt__StringsKt.contains$default(encodeSet, (char) iCodePointAt, false, 2, (Object) null) || ((iCodePointAt == 37 && (!z5 || (z6 && !OooO0OO(iCharCount, length, str)))) || (iCodePointAt == 43 && z7)))) {
                    o00000O o00000o = new o00000O();
                    o00000o.o000OOo(i4, iCharCount, str);
                    o00000O o00000o2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == i6 && z7) {
                                o00000o.o00000O(z5 ? "+" : "%2B");
                            } else {
                                if (iCodePointAt2 >= i7 && iCodePointAt2 != 127) {
                                    if ((iCodePointAt2 < 128 || z8) && !StringsKt__StringsKt.contains$default(encodeSet, (char) iCodePointAt2, false, 2, (Object) null) && (iCodePointAt2 != 37 || (z5 && (!z6 || OooO0OO(iCharCount, length, str))))) {
                                        o00000o.o00000o0(iCodePointAt2);
                                    }
                                }
                                if (o00000o2 == null) {
                                    o00000o2 = new o00000O();
                                }
                                if (charset2 == null || Intrinsics.areEqual(charset2, StandardCharsets.UTF_8)) {
                                    o00000o2.o00000o0(iCodePointAt2);
                                } else {
                                    o00000o2.o0O0O00(str, iCharCount, Character.charCount(iCodePointAt2) + iCharCount, charset2);
                                }
                                while (!o00000o2.oo000o()) {
                                    int i8 = o00000o2.readByte() & UByte.MAX_VALUE;
                                    o00000o.o00O0O(37);
                                    char[] cArr = o00OO.f57201OooOO0O;
                                    o00000o.o00O0O(cArr[(i8 >> 4) & 15]);
                                    o00000o.o00O0O(cArr[i8 & 15]);
                                }
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i7 = 32;
                        i6 = 43;
                    }
                    return o00000o.OoooOO0();
                }
                iCharCount += Character.charCount(iCodePointAt);
                i5 = 128;
            }
            String strSubstring = str.substring(i4, length);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @JvmStatic
        public static int OooO0O0(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        public static boolean OooO0OO(int i, int i2, String str) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && o0O000o0.OooOOo(str.charAt(i + 1)) != -1 && o0O000o0.OooOOo(str.charAt(i3)) != -1;
        }

        public static String OooO0Oo(String str, int i, int i2, boolean z, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(str, "<this>");
            int iCharCount = i;
            while (iCharCount < i2) {
                int i5 = iCharCount + 1;
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    o00000O o00000o = new o00000O();
                    o00000o.o000OOo(i, iCharCount, str);
                    while (iCharCount < i2) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                            int iOooOOo = o0O000o0.OooOOo(str.charAt(iCharCount + 1));
                            int iOooOOo2 = o0O000o0.OooOOo(str.charAt(i4));
                            if (iOooOOo == -1 || iOooOOo2 == -1) {
                                o00000o.o00000o0(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                o00000o.o00O0O((iOooOOo << 4) + iOooOOo2);
                                iCharCount = Character.charCount(iCodePointAt) + i4;
                            }
                        } else if (iCodePointAt == 43 && z) {
                            o00000o.o00O0O(32);
                            iCharCount++;
                        } else {
                            o00000o.o00000o0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return o00000o.OoooOO0();
                }
                iCharCount = i5;
            }
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static void OooO0o(@NotNull StringBuilder out, @NotNull List list) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt.until(0, list.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                int i = first + step;
                String str = (String) list.get(first);
                String str2 = (String) list.get(first + 1);
                if (first > 0) {
                    out.append(Typography.amp);
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first = i;
                }
            }
        }

        @NotNull
        public static ArrayList OooO0o0(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default(str, Typography.amp, i, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str.length();
                }
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', i, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > iIndexOf$default) {
                    String strSubstring = str.substring(i, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iIndexOf$default2 + 1, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = iIndexOf$default + 1;
            }
            return arrayList;
        }
    }

    static {
        new OooO0O0();
        f57201OooOO0O = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public o00OO(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i, @NotNull ArrayList pathSegments, @Nullable ArrayList arrayList, @Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f57203OooO00o = scheme;
        this.f57204OooO0O0 = username;
        this.f57205OooO0OO = password;
        this.f57206OooO0Oo = host;
        this.f57208OooO0o0 = i;
        this.f57207OooO0o = pathSegments;
        this.f57209OooO0oO = arrayList;
        this.f57210OooO0oo = str;
        this.f57202OooO = url;
        this.f57211OooOO0 = Intrinsics.areEqual(scheme, "https");
    }

    @NotNull
    public final String OooO() {
        OooO00o oooO00o;
        Intrinsics.checkNotNullParameter("/...", "link");
        try {
            oooO00o = new OooO00o();
            oooO00o.OooO0oO(this, "/...");
        } catch (IllegalArgumentException unused) {
            oooO00o = null;
        }
        Intrinsics.checkNotNull(oooO00o);
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter("", "username");
        String strOooO00o = OooO0O0.OooO00o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        Intrinsics.checkNotNullParameter(strOooO00o, "<set-?>");
        oooO00o.f57213OooO0O0 = strOooO00o;
        Intrinsics.checkNotNullParameter("", "password");
        String strOooO00o2 = OooO0O0.OooO00o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        Intrinsics.checkNotNullParameter(strOooO00o2, "<set-?>");
        oooO00o.f57214OooO0OO = strOooO00o2;
        return oooO00o.OooO0OO().f57202OooO;
    }

    @JvmName(name = "encodedPassword")
    @NotNull
    public final String OooO00o() {
        if (this.f57205OooO0OO.length() == 0) {
            return "";
        }
        int length = this.f57203OooO00o.length() + 3;
        String str = this.f57202OooO;
        String strSubstring = str.substring(StringsKt__StringsKt.indexOf$default((CharSequence) str, ':', length, false, 4, (Object) null) + 1, StringsKt__StringsKt.indexOf$default((CharSequence) str, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedPath")
    @NotNull
    public final String OooO0O0() {
        int length = this.f57203OooO00o.length() + 3;
        String str = this.f57202OooO;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', length, false, 4, (Object) null);
        String strSubstring = str.substring(iIndexOf$default, o0O000o0.OooO0o0(iIndexOf$default, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedPathSegments")
    @NotNull
    public final ArrayList OooO0OO() {
        int length = this.f57203OooO00o.length() + 3;
        String str = this.f57202OooO;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', length, false, 4, (Object) null);
        int iOooO0o0 = o0O000o0.OooO0o0(iIndexOf$default, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iOooO0o0) {
            int i = iIndexOf$default + 1;
            int iOooO0o = o0O000o0.OooO0o(str, '/', i, iOooO0o0);
            String strSubstring = str.substring(i, iOooO0o);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iOooO0o;
        }
        return arrayList;
    }

    @JvmName(name = "encodedQuery")
    @Nullable
    public final String OooO0Oo() {
        if (this.f57209OooO0oO == null) {
            return null;
        }
        String str = this.f57202OooO;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6, (Object) null) + 1;
        String strSubstring = str.substring(iIndexOf$default, o0O000o0.OooO0o(str, '#', iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @NotNull
    public final OooO00o OooO0o() {
        String strSubstring;
        OooO00o oooO00o = new OooO00o();
        String str = this.f57203OooO00o;
        oooO00o.f57212OooO00o = str;
        String strOooO0o0 = OooO0o0();
        Intrinsics.checkNotNullParameter(strOooO0o0, "<set-?>");
        oooO00o.f57213OooO0O0 = strOooO0o0;
        String strOooO00o = OooO00o();
        Intrinsics.checkNotNullParameter(strOooO00o, "<set-?>");
        oooO00o.f57214OooO0OO = strOooO00o;
        oooO00o.f57215OooO0Oo = this.f57206OooO0Oo;
        int iOooO0O0 = OooO0O0.OooO0O0(str);
        int i = this.f57208OooO0o0;
        if (i == iOooO0O0) {
            i = -1;
        }
        oooO00o.f57217OooO0o0 = i;
        ArrayList arrayList = oooO00o.f57216OooO0o;
        arrayList.clear();
        arrayList.addAll(OooO0OO());
        oooO00o.OooO0o0(OooO0Oo());
        if (this.f57210OooO0oo == null) {
            strSubstring = null;
        } else {
            String str2 = this.f57202OooO;
            strSubstring = str2.substring(StringsKt__StringsKt.indexOf$default((CharSequence) str2, '#', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        oooO00o.f57219OooO0oo = strSubstring;
        return oooO00o;
    }

    @JvmName(name = "encodedUsername")
    @NotNull
    public final String OooO0o0() {
        if (this.f57204OooO0O0.length() == 0) {
            return "";
        }
        int length = this.f57203OooO00o.length() + 3;
        String str = this.f57202OooO;
        String strSubstring = str.substring(length, o0O000o0.OooO0o0(length, str.length(), str, ":@"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Nullable
    public final String OooO0oO(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> list = this.f57209OooO0oO;
        if (list == null) {
            return null;
        }
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int i = first + step;
                if (Intrinsics.areEqual(name, list.get(first))) {
                    return list.get(first + 1);
                }
                if (first != last) {
                    first = i;
                }
            }
        }
        return null;
    }

    @JvmName(name = "queryParameterNames")
    @NotNull
    public final Set<String> OooO0oo() {
        List<String> list = this.f57209OooO0oO;
        if (list == null) {
            return SetsKt.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int i = first + step;
                String str = list.get(first);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @Nullable
    public final o00OO OooOO0(@NotNull String link) {
        OooO00o oooO00o;
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            oooO00o = new OooO00o();
            oooO00o.OooO0oO(this, link);
        } catch (IllegalArgumentException unused) {
            oooO00o = null;
        }
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.OooO0OO();
    }

    @JvmName(name = ShareConstants.MEDIA_URI)
    @NotNull
    public final URI OooOO0O() {
        OooO00o oooO00oOooO0o = OooO0o();
        String str = oooO00oOooO0o.f57215OooO0Oo;
        oooO00oOooO0o.f57215OooO0Oo = str == null ? null : new Regex("[\"<>^`{|}]").replace(str, "");
        ArrayList arrayList = oooO00oOooO0o.f57216OooO0o;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, OooO0O0.OooO00o((String) arrayList.get(i2), 0, 0, "[]", true, true, false, false, null, 227));
        }
        List<String> list = oooO00oOooO0o.f57218OooO0oO;
        if (list != null) {
            int size2 = list.size();
            while (i < size2) {
                int i3 = i + 1;
                String str2 = list.get(i);
                list.set(i, str2 == null ? null : OooO0O0.OooO00o(str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195));
                i = i3;
            }
        }
        String str3 = oooO00oOooO0o.f57219OooO0oo;
        oooO00oOooO0o.f57219OooO0oo = str3 != null ? OooO0O0.OooO00o(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String string = oooO00oOooO0o.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof o00OO) && Intrinsics.areEqual(((o00OO) obj).f57202OooO, this.f57202OooO);
    }

    public final int hashCode() {
        return this.f57202OooO.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f57202OooO;
    }
}
