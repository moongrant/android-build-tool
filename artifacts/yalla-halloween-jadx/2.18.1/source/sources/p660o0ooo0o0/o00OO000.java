package p660o0ooo0o0;

import Oooo000.o00O0O;
import com.facebook.share.internal.ShareConstants;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.UByte;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p659o0ooo0o.o00OO0OO;
import p659o0ooo0o.o00OOO00;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final String f51381OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f51382OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f51383OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f51384OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f51385OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f51386OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f51387OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final List<String> f51388OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<String> f51389OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f51390OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO0O0 f51380OooOO0o = new OooO0O0();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final char[] f51379OooOO0O = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f51391OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public String f51394OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final List<String> f51395OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public List<String> f51397OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public String f51398OooO0oo;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public String f51392OooO0O0 = "";

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public String f51393OooO0OO = "";

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f51396OooO0o0 = -1;

        public OooO00o() {
            ArrayList arrayList = new ArrayList();
            this.f51395OooO0o = arrayList;
            arrayList.add("");
        }

        @NotNull
        public final OooO00o OooO00o(@NotNull String encodedName, @Nullable String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f51397OooO0oO == null) {
                this.f51397OooO0oO = new ArrayList();
            }
            List<String> list = this.f51397OooO0oO;
            Intrinsics.checkNotNull(list);
            list.add(OooO0O0.OooO00o(encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
            List<String> list2 = this.f51397OooO0oO;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? OooO0O0.OooO00o(str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211) : null);
            return this;
        }

        @NotNull
        public final OooO00o OooO0O0(@NotNull String name, @Nullable String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f51397OooO0oO == null) {
                this.f51397OooO0oO = new ArrayList();
            }
            List<String> list = this.f51397OooO0oO;
            Intrinsics.checkNotNull(list);
            list.add(OooO0O0.OooO00o(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
            List<String> list2 = this.f51397OooO0oO;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? OooO0O0.OooO00o(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219) : null);
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.util.ArrayList, java.util.List<java.lang.String>] */
        @NotNull
        public final o00OO000 OooO0OO() {
            ArrayList arrayList;
            String str = this.f51391OooO00o;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strOooO0Oo = OooO0O0.OooO0Oo(this.f51392OooO0O0, 0, 0, false, 7);
            String strOooO0Oo2 = OooO0O0.OooO0Oo(this.f51393OooO0OO, 0, 0, false, 7);
            String str2 = this.f51394OooO0Oo;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iOooO0Oo = OooO0Oo();
            ?? r0 = this.f51395OooO0o;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10));
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                arrayList2.add(OooO0O0.OooO0Oo((String) it.next(), 0, 0, false, 7));
            }
            List<String> list = this.f51397OooO0oO;
            if (list != null) {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (String str3 : list) {
                    arrayList.add(str3 != null ? OooO0O0.OooO0Oo(str3, 0, 0, true, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f51398OooO0oo;
            return new o00OO000(str, strOooO0Oo, strOooO0Oo2, str2, iOooO0Oo, arrayList2, arrayList, str4 != null ? OooO0O0.OooO0Oo(str4, 0, 0, false, 7) : null, toString());
        }

        public final int OooO0Oo() {
            int i = this.f51396OooO0o0;
            if (i != -1) {
                return i;
            }
            String scheme = this.f51391OooO00o;
            Intrinsics.checkNotNull(scheme);
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        @NotNull
        public final OooO00o OooO0o(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strOooO0O0 = o00OO0OO.OooO0O0(OooO0O0.OooO0Oo(host, 0, 0, false, 7));
            if (strOooO0O0 == null) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo("unexpected host: ", host));
            }
            this.f51394OooO0Oo = strOooO0O0;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001b  */
        @NotNull
        public final OooO00o OooO0o0(@Nullable String str) {
            List<String> listOooO0o0;
            if (str != null) {
                OooO0O0 oooO0O0 = o00OO000.f51380OooOO0o;
                String strOooO00o = OooO0O0.OooO00o(str, 0, 0, " \"'<>#", true, false, true, false, null, 211);
                if (strOooO00o != null) {
                    listOooO0o0 = oooO0O0.OooO0o0(strOooO00o);
                } else {
                    listOooO0o0 = null;
                }
            } else {
                listOooO0o0 = null;
            }
            this.f51397OooO0oO = (ArrayList) listOooO0o0;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:147:0x02c6  */
        /* JADX WARN: Code duplicated, block: B:42:0x0082  */
        /* JADX WARN: Type inference failed for: r2v30, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v31, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v37, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v38, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v41, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v37, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v38, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v68, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v69, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 4 */
        @NotNull
        public final OooO00o OooO0oO(@Nullable o00OO000 o00oo001, @NotNull String input) {
            int i;
            char c;
            char c2;
            int iOooO0oO;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            String str;
            int i9;
            int i10;
            int i11;
            int i12;
            OooO00o oooO00o;
            OooO00o oooO00o2;
            String str2;
            int i13;
            String str3;
            String str4;
            OooO00o oooO00o3;
            int i14;
            char cCharAt;
            Intrinsics.checkNotNullParameter(input, "input");
            byte[] bArr = o00OOO00.f51183OooO00o;
            int iOooOOOO = o00OOO00.OooOOOO(input, 0, input.length());
            int iOooOOOo = o00OOO00.OooOOOo(input, iOooOOOO, input.length());
            char c3 = 65535;
            if (iOooOOOo - iOooOOOO >= 2) {
                char cCharAt2 = input.charAt(iOooOOOO);
                char c4 = 'a';
                char c5 = 'z';
                if ((Intrinsics.compare((int) cCharAt2, 97) >= 0 && Intrinsics.compare((int) cCharAt2, 122) <= 0) || (Intrinsics.compare((int) cCharAt2, 65) >= 0 && Intrinsics.compare((int) cCharAt2, 90) <= 0)) {
                    i = iOooOOOO;
                    while (true) {
                        i++;
                        if (i < iOooOOOo) {
                            char cCharAt3 = input.charAt(i);
                            if ((c4 > cCharAt3 || c5 < cCharAt3) && (('A' > cCharAt3 || 'Z' < cCharAt3) && (('0' > cCharAt3 || '9' < cCharAt3) && cCharAt3 != '+' && cCharAt3 != '-' && cCharAt3 != '.'))) {
                                if (cCharAt3 == ':') {
                                    break;
                                }
                                break;
                            }
                            c4 = 'a';
                            c5 = 'z';
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
            if (i != -1) {
                if (StringsKt__StringsJVMKt.startsWith(input, "https:", iOooOOOO, true)) {
                    this.f51391OooO00o = "https";
                    iOooOOOO += 6;
                } else {
                    if (!StringsKt__StringsJVMKt.startsWith(input, "http:", iOooOOOO, true)) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sbOooO0o0.append(strSubstring);
                        sbOooO0o0.append("'");
                        throw new IllegalArgumentException(sbOooO0o0.toString());
                    }
                    this.f51391OooO00o = "http";
                    iOooOOOO += 5;
                }
            } else {
                if (o00oo001 == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f51391OooO00o = o00oo001.f51383OooO0O0;
            }
            int i15 = 0;
            int i16 = iOooOOOO;
            while (true) {
                c = '\\';
                c2 = '/';
                if (i16 >= iOooOOOo || !((cCharAt = input.charAt(i16)) == '\\' || cCharAt == '/')) {
                    break;
                }
                i15++;
                i16++;
            }
            char c6 = '#';
            if (i15 >= 2 || o00oo001 == null || (!Intrinsics.areEqual(o00oo001.f51383OooO0O0, this.f51391OooO00o))) {
                int i17 = iOooOOOO + i15;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iOooO0oO = o00OOO00.OooO0oO(input, "@/\\?#", i17, iOooOOOo);
                    char cCharAt4 = iOooO0oO != iOooOOOo ? input.charAt(iOooO0oO) : (char) 65535;
                    if (cCharAt4 == c3 || cCharAt4 == c6 || cCharAt4 == c2 || cCharAt4 == c || cCharAt4 == '?') {
                        break;
                    }
                    if (cCharAt4 != '@') {
                        iOooOOOo = iOooOOOo;
                    } else {
                        if (z) {
                            i8 = iOooO0oO;
                            this.f51393OooO0OO += "%40" + OooO0O0.OooO00o(input, i17, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                        } else {
                            int iOooO0o = o00OOO00.OooO0o(input, ':', i17, iOooO0oO);
                            String strOooO00o = OooO0O0.OooO00o(input, i17, iOooO0o, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                            if (z2) {
                                strOooO00o = o00O0O.OooO0O0(new StringBuilder(), this.f51392OooO0O0, "%40", strOooO00o);
                            }
                            this.f51392OooO0O0 = strOooO00o;
                            i8 = iOooO0oO;
                            if (iOooO0o != i8) {
                                this.f51393OooO0OO = OooO0O0.OooO00o(input, iOooO0o + 1, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                                z = true;
                            }
                            z2 = true;
                        }
                        i17 = i8 + 1;
                    }
                    c6 = '#';
                    c = '\\';
                    c2 = '/';
                    c3 = 65535;
                    iOooOOOo = iOooOOOo;
                }
                i2 = iOooOOOo;
                int i18 = i17;
                while (true) {
                    if (i18 < iOooO0oO) {
                        char cCharAt5 = input.charAt(i18);
                        if (cCharAt5 == ':') {
                            i3 = i18;
                            break;
                        }
                        if (cCharAt5 == '[') {
                            do {
                                i18++;
                                if (i18 >= iOooO0oO) {
                                    break;
                                }
                            } while (input.charAt(i18) != ']');
                        }
                        i18++;
                    } else {
                        i3 = iOooO0oO;
                        break;
                    }
                }
                int i19 = i3 + 1;
                if (i19 < iOooO0oO) {
                    this.f51394OooO0Oo = o00OO0OO.OooO0O0(OooO0O0.OooO0Oo(input, i17, i3, false, 4));
                    int i20 = i3;
                    int i21 = i17;
                    try {
                        i7 = Integer.parseInt(OooO0O0.OooO00o(input, i19, iOooO0oO, "", false, false, false, false, null, 248));
                        if (1 > i7 || 65535 < i7) {
                            i7 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.f51396OooO0o0 = i7;
                    if (!(i7 != -1)) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i19, iOooO0oO);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sbOooO0o1.append(strSubstring2);
                        sbOooO0o1.append(Typography.quote);
                        throw new IllegalArgumentException(sbOooO0o1.toString().toString());
                    }
                    i4 = i20;
                    i17 = i21;
                } else {
                    i4 = i3;
                    this.f51394OooO0Oo = o00OO0OO.OooO0O0(OooO0O0.OooO0Oo(input, i17, i4, false, 4));
                    String scheme = this.f51391OooO00o;
                    Intrinsics.checkNotNull(scheme);
                    Intrinsics.checkNotNullParameter(scheme, "scheme");
                    int iHashCode = scheme.hashCode();
                    if (iHashCode != 3213448) {
                        if (iHashCode == 99617003 && scheme.equals("https")) {
                            i5 = 443;
                        } else {
                            i5 = -1;
                        }
                    } else if (scheme.equals("http")) {
                        i5 = 80;
                    } else {
                        i5 = -1;
                    }
                    this.f51396OooO0o0 = i5;
                }
                if (!(this.f51394OooO0Oo != null)) {
                    StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i17, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sbOooO0o2.append(strSubstring3);
                    sbOooO0o2.append(Typography.quote);
                    throw new IllegalArgumentException(sbOooO0o2.toString().toString());
                }
                iOooOOOO = iOooO0oO;
                i6 = 1;
            } else {
                this.f51392OooO0O0 = o00oo001.OooO0o0();
                this.f51393OooO0OO = o00oo001.OooO00o();
                this.f51394OooO0Oo = o00oo001.f51387OooO0o0;
                this.f51396OooO0o0 = o00oo001.f51386OooO0o;
                this.f51395OooO0o.clear();
                this.f51395OooO0o.addAll(o00oo001.OooO0OO());
                if (iOooOOOO == iOooOOOo || input.charAt(iOooOOOO) == '#') {
                    OooO0o0(o00oo001.OooO0Oo());
                }
                i6 = 1;
                i2 = iOooOOOo;
            }
            int i22 = i2;
            int iOooO0oO2 = o00OOO00.OooO0oO(input, "?#", iOooOOOO, i22);
            if (iOooOOOO == iOooO0oO2) {
                oooO00o3 = this;
                i14 = i22;
                str = input;
                str3 = str;
            } else {
                char cCharAt6 = input.charAt(iOooOOOO);
                if (cCharAt6 == '/' || cCharAt6 == '\\') {
                    this.f51395OooO0o.clear();
                    this.f51395OooO0o.add("");
                    int i23 = i6;
                    str = input;
                    i9 = i23;
                    i10 = iOooOOOO + i23;
                    i11 = iOooO0oO2;
                    i12 = iOooO0oO2;
                    oooO00o = this;
                    oooO00o2 = this;
                    str2 = input;
                    i13 = i22;
                    str3 = input;
                    str4 = "";
                } else {
                    ?? r5 = this.f51395OooO0o;
                    r5.set(r5.size() - i6, "");
                    oooO00o2 = this;
                    oooO00o = oooO00o2;
                    i9 = i6;
                    i11 = iOooO0oO2;
                    i12 = i11;
                    i13 = i22;
                    str = input;
                    str2 = str;
                    str3 = str2;
                    i10 = iOooOOOO;
                    str4 = "";
                }
                while (i10 < i12) {
                    int iOooO0oO3 = o00OOO00.OooO0oO(str2, "/\\", i10, i12);
                    boolean z3 = iOooO0oO3 < i12;
                    String str5 = str2;
                    OooO00o oooO00o4 = oooO00o2;
                    String str6 = str4;
                    String strOooO00o2 = OooO0O0.OooO00o(str2, i10, iOooO0oO3, " \"<>^`{}|/\\?#", true, false, false, false, null, 240);
                    if (Intrinsics.areEqual(strOooO00o2, ".") || StringsKt.OooO(strOooO00o2, "%2e")) {
                        oooO00o2 = oooO00o4;
                    } else {
                        if (Intrinsics.areEqual(strOooO00o2, "..") || StringsKt.OooO(strOooO00o2, "%2e.") || StringsKt.OooO(strOooO00o2, ".%2e") || StringsKt.OooO(strOooO00o2, "%2e%2e")) {
                            oooO00o2 = oooO00o4;
                            ?? r2 = oooO00o2.f51395OooO0o;
                            if (!(((String) r2.remove(r2.size() - i9)).length() == 0) || ((oooO00o2.f51395OooO0o.isEmpty() ? 1 : 0) ^ i9) == 0) {
                                oooO00o2.f51395OooO0o.add(str6);
                            } else {
                                ?? r3 = oooO00o2.f51395OooO0o;
                                r3.set(r3.size() - i9, str6);
                            }
                        } else {
                            oooO00o2 = oooO00o4;
                            ?? r4 = oooO00o2.f51395OooO0o;
                            if (((CharSequence) r4.get(r4.size() + (-1))).length() == 0) {
                                ?? r6 = oooO00o2.f51395OooO0o;
                                r6.set(r6.size() - i9, strOooO00o2);
                            } else {
                                oooO00o2.f51395OooO0o.add(strOooO00o2);
                            }
                            if (z3) {
                                oooO00o2.f51395OooO0o.add(str6);
                            }
                        }
                    }
                    if (z3) {
                        int i24 = i9;
                        i9 = i24;
                        i10 = iOooO0oO3 + i24;
                        i11 = i11;
                        i12 = i12;
                        oooO00o = oooO00o;
                        str2 = str5;
                        i13 = i13;
                        str3 = str3;
                        str4 = str6;
                    } else {
                        str4 = str6;
                        str2 = str5;
                        i10 = iOooO0oO3;
                    }
                }
                iOooO0oO2 = i11;
                oooO00o3 = oooO00o;
                i14 = i13;
            }
            if (iOooO0oO2 < i14 && str.charAt(iOooO0oO2) == '?') {
                int iOooO0o2 = o00OOO00.OooO0o(str, '#', iOooO0oO2, i14);
                oooO00o3.f51397OooO0oO = (ArrayList) o00OO000.f51380OooOO0o.OooO0o0(OooO0O0.OooO00o(str3, iOooO0oO2 + 1, iOooO0o2, " \"'<>#", true, false, true, false, null, 208));
                iOooO0oO2 = iOooO0o2;
            }
            if (iOooO0oO2 < i14 && str.charAt(iOooO0oO2) == '#') {
                oooO00o3.f51398OooO0oo = OooO0O0.OooO00o(str3, iOooO0oO2 + 1, i14, "", true, false, false, true, null, 176);
            }
            return oooO00o3;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0076 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0078 A[LOOP:0: B:10:0x0044->B:16:0x0078, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:20:0x007a A[EDGE_INSN: B:20:0x007a->B:17:0x007a BREAK  A[LOOP:0: B:10:0x0044->B:16:0x0078], SYNTHETIC] */
        @NotNull
        public final OooO00o OooO0oo(@NotNull String name, @Nullable String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f51397OooO0oO != null) {
                String strOooO00o = OooO0O0.OooO00o(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219);
                List<String> list = this.f51397OooO0oO;
                Intrinsics.checkNotNull(list);
                IntProgression intProgressionStep = RangesKt.step(RangesKt.downTo(list.size() - 2, 0), 2);
                int first = intProgressionStep.getFirst();
                int last = intProgressionStep.getLast();
                int step = intProgressionStep.getStep();
                if (step < 0 ? first >= last : first <= last) {
                    while (true) {
                        List<String> list2 = this.f51397OooO0oO;
                        Intrinsics.checkNotNull(list2);
                        if (!Intrinsics.areEqual(strOooO00o, list2.get(first))) {
                            if (first != last) {
                                break;
                                break;
                            }
                            first += step;
                        } else {
                            List<String> list3 = this.f51397OooO0oO;
                            Intrinsics.checkNotNull(list3);
                            list3.remove(first + 1);
                            List<String> list4 = this.f51397OooO0oO;
                            Intrinsics.checkNotNull(list4);
                            list4.remove(first);
                            List<String> list5 = this.f51397OooO0oO;
                            Intrinsics.checkNotNull(list5);
                            if (!list5.isEmpty()) {
                                if (first != last) {
                                    break;
                                }
                                first += step;
                            } else {
                                this.f51397OooO0oO = null;
                                break;
                            }
                        }
                    }
                }
            }
            OooO0O0(name, str);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0035  */
        /* JADX WARN: Code duplicated, block: B:20:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x0046  */
        /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.ArrayList, java.util.List, java.util.List<java.lang.String>] */
        @NotNull
        public final String toString() {
            StringBuilder out = new StringBuilder();
            String str = this.f51391OooO00o;
            if (str != null) {
                out.append(str);
                out.append("://");
            } else {
                out.append("//");
            }
            if (this.f51392OooO0O0.length() > 0) {
                out.append(this.f51392OooO0O0);
                if (this.f51393OooO0OO.length() > 0) {
                    out.append(':');
                    out.append(this.f51393OooO0OO);
                }
                out.append('@');
            } else if (this.f51393OooO0OO.length() > 0) {
                out.append(this.f51392OooO0O0);
                if (this.f51393OooO0OO.length() > 0) {
                    out.append(':');
                    out.append(this.f51393OooO0OO);
                }
                out.append('@');
            }
            String str2 = this.f51394OooO0Oo;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, ':', false, 2, (Object) null)) {
                    out.append('[');
                    out.append(this.f51394OooO0Oo);
                    out.append(']');
                } else {
                    out.append(this.f51394OooO0Oo);
                }
            }
            int i = -1;
            if (this.f51396OooO0o0 != -1 || this.f51391OooO00o != null) {
                int iOooO0Oo = OooO0Oo();
                String scheme = this.f51391OooO00o;
                if (scheme != null) {
                    Intrinsics.checkNotNull(scheme);
                    Intrinsics.checkNotNullParameter(scheme, "scheme");
                    int iHashCode = scheme.hashCode();
                    if (iHashCode != 3213448) {
                        if (iHashCode == 99617003 && scheme.equals("https")) {
                            i = 443;
                        }
                    } else if (scheme.equals("http")) {
                        i = 80;
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
            ?? toPathString = this.f51395OooO0o;
            Intrinsics.checkNotNullParameter(toPathString, "$this$toPathString");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = toPathString.size();
            for (int i2 = 0; i2 < size; i2++) {
                out.append('/');
                out.append((String) toPathString.get(i2));
            }
            if (this.f51397OooO0oO != null) {
                out.append('?');
                OooO0O0 oooO0O0 = o00OO000.f51380OooOO0o;
                List<String> list = this.f51397OooO0oO;
                Intrinsics.checkNotNull(list);
                oooO0O0.OooO0o(list, out);
            }
            if (this.f51398OooO0oo != null) {
                out.append('#');
                out.append(this.f51398OooO0oo);
            }
            String string = out.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public static final class OooO0O0 {
        public static String OooO00o(String canonicalize, int i, int i2, String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            OooO0O0 oooO0O0 = o00OO000.f51380OooOO0o;
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? canonicalize.length() : i2;
            boolean z5 = (i3 & 8) != 0 ? false : z;
            boolean z6 = (i3 & 16) != 0 ? false : z2;
            boolean z7 = (i3 & 32) != 0 ? false : z3;
            boolean z8 = (i3 & 64) == 0 ? z4 : false;
            int i5 = 128;
            Charset charset2 = (i3 & 128) != 0 ? null : charset;
            Intrinsics.checkNotNullParameter(canonicalize, "$this$canonicalize");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i4;
            while (iCharCount < length) {
                int iCodePointAt = canonicalize.codePointAt(iCharCount);
                int i6 = 32;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= i5 && !z8) || StringsKt__StringsKt.contains$default(encodeSet, (char) iCodePointAt, false, 2, (Object) null) || ((iCodePointAt == 37 && (!z5 || (z6 && !oooO0O0.OooO0OO(canonicalize, iCharCount, length)))) || (iCodePointAt == 43 && z7)))) {
                    o0oOO o0ooo2 = new o0oOO();
                    o0ooo2.o00oO0O(canonicalize, i4, iCharCount);
                    o0oOO o0ooo3 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = canonicalize.codePointAt(iCharCount);
                        if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == 43 && z7) {
                                o0ooo2.o00oO0o(z5 ? "+" : "%2B");
                            } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && !z8) || StringsKt__StringsKt.contains$default(encodeSet, (char) iCodePointAt2, false, 2, (Object) null) || (iCodePointAt2 == 37 && (!z5 || (z6 && !oooO0O0.OooO0OO(canonicalize, iCharCount, length)))))) {
                                if (o0ooo3 == null) {
                                    o0ooo3 = new o0oOO();
                                }
                                if (charset2 == null || Intrinsics.areEqual(charset2, StandardCharsets.UTF_8)) {
                                    o0ooo3.oo0o0Oo(iCodePointAt2);
                                } else {
                                    o0ooo3.oo000o(canonicalize, iCharCount, Character.charCount(iCodePointAt2) + iCharCount, charset2);
                                }
                                while (!o0ooo3.OooOooo()) {
                                    int i7 = o0ooo3.readByte() & UByte.MAX_VALUE;
                                    o0ooo2.Ooooo0o(37);
                                    char[] cArr = o00OO000.f51379OooOO0O;
                                    o0ooo2.Ooooo0o(cArr[(i7 >> 4) & 15]);
                                    o0ooo2.Ooooo0o(cArr[i7 & 15]);
                                }
                            } else {
                                o0ooo2.oo0o0Oo(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i6 = 32;
                    }
                    return o0ooo2.Oooo0o();
                }
                iCharCount += Character.charCount(iCodePointAt);
                i5 = 128;
            }
            String strSubstring = canonicalize.substring(i4, length);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static String OooO0Oo(String percentDecode, int i, int i2, boolean z, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = percentDecode.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(percentDecode, "$this$percentDecode");
            int iCharCount = i;
            while (iCharCount < i2) {
                char cCharAt = percentDecode.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    o0oOO o0ooo2 = new o0oOO();
                    o0ooo2.o00oO0O(percentDecode, i, iCharCount);
                    while (iCharCount < i2) {
                        int iCodePointAt = percentDecode.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                            int iOooOOoo = o00OOO00.OooOOoo(percentDecode.charAt(iCharCount + 1));
                            int iOooOOoo2 = o00OOO00.OooOOoo(percentDecode.charAt(i4));
                            if (iOooOOoo == -1 || iOooOOoo2 == -1) {
                                o0ooo2.oo0o0Oo(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                o0ooo2.Ooooo0o((iOooOOoo << 4) + iOooOOoo2);
                                iCharCount = Character.charCount(iCodePointAt) + i4;
                            }
                        } else if (iCodePointAt == 43 && z) {
                            o0ooo2.Ooooo0o(32);
                            iCharCount++;
                        } else {
                            o0ooo2.oo0o0Oo(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return o0ooo2.Oooo0o();
                }
                iCharCount++;
            }
            String strSubstring = percentDecode.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @JvmStatic
        public final int OooO0O0(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final boolean OooO0OO(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && o00OOO00.OooOOoo(str.charAt(i + 1)) != -1 && o00OOO00.OooOOoo(str.charAt(i3)) != -1;
        }

        public final void OooO0o(@NotNull List<String> toQueryString, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(toQueryString, "$this$toQueryString");
            Intrinsics.checkNotNullParameter(out, "out");
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, toQueryString.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                String str = toQueryString.get(first);
                String str2 = toQueryString.get(first + 1);
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
                    first += step;
                }
            }
        }

        @NotNull
        public final List<String> OooO0o0(@NotNull String toQueryNamesAndValues) {
            Intrinsics.checkNotNullParameter(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= toQueryNamesAndValues.length()) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default(toQueryNamesAndValues, Typography.amp, i, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = toQueryNamesAndValues.length();
                }
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) toQueryNamesAndValues, '=', i, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > iIndexOf$default) {
                    String strSubstring = toQueryNamesAndValues.substring(i, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = toQueryNamesAndValues.substring(i, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = toQueryNamesAndValues.substring(iIndexOf$default2 + 1, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = iIndexOf$default + 1;
            }
            return arrayList;
        }
    }

    public o00OO000(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i, @NotNull List<String> pathSegments, @Nullable List<String> list, @Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f51383OooO0O0 = scheme;
        this.f51384OooO0OO = username;
        this.f51385OooO0Oo = password;
        this.f51387OooO0o0 = host;
        this.f51386OooO0o = i;
        this.f51388OooO0oO = pathSegments;
        this.f51389OooO0oo = list;
        this.f51381OooO = str;
        this.f51390OooOO0 = url;
        this.f51382OooO00o = Intrinsics.areEqual(scheme, "https");
    }

    @NotNull
    public final String OooO(int i) {
        List<String> list = this.f51389OooO0oo;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i * 2);
        Intrinsics.checkNotNull(str);
        return str;
    }

    @JvmName(name = "encodedPassword")
    @NotNull
    public final String OooO00o() {
        if (this.f51385OooO0Oo.length() == 0) {
            return "";
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f51390OooOO0, ':', this.f51383OooO0O0.length() + 3, false, 4, (Object) null) + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) this.f51390OooOO0, '@', 0, false, 6, (Object) null);
        String str = this.f51390OooOO0;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(iIndexOf$default, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedPath")
    @NotNull
    public final String OooO0O0() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f51390OooOO0, '/', this.f51383OooO0O0.length() + 3, false, 4, (Object) null);
        String str = this.f51390OooOO0;
        int iOooO0oO = o00OOO00.OooO0oO(str, "?#", iIndexOf$default, str.length());
        String str2 = this.f51390OooOO0;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str2.substring(iIndexOf$default, iOooO0oO);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedPathSegments")
    @NotNull
    public final List<String> OooO0OO() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f51390OooOO0, '/', this.f51383OooO0O0.length() + 3, false, 4, (Object) null);
        String str = this.f51390OooOO0;
        int iOooO0oO = o00OOO00.OooO0oO(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iOooO0oO) {
            int i = iIndexOf$default + 1;
            int iOooO0o = o00OOO00.OooO0o(this.f51390OooOO0, '/', i, iOooO0oO);
            String str2 = this.f51390OooOO0;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str2.substring(i, iOooO0o);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iOooO0o;
        }
        return arrayList;
    }

    @JvmName(name = "encodedQuery")
    @Nullable
    public final String OooO0Oo() {
        if (this.f51389OooO0oo == null) {
            return null;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f51390OooOO0, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f51390OooOO0;
        int iOooO0o = o00OOO00.OooO0o(str, '#', iIndexOf$default, str.length());
        String str2 = this.f51390OooOO0;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str2.substring(iIndexOf$default, iOooO0o);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    public final OooO00o OooO0o() {
        String strSubstring;
        OooO00o oooO00o = new OooO00o();
        oooO00o.f51391OooO00o = this.f51383OooO0O0;
        String strOooO0o0 = OooO0o0();
        Intrinsics.checkNotNullParameter(strOooO0o0, "<set-?>");
        oooO00o.f51392OooO0O0 = strOooO0o0;
        String strOooO00o = OooO00o();
        Intrinsics.checkNotNullParameter(strOooO00o, "<set-?>");
        oooO00o.f51393OooO0OO = strOooO00o;
        oooO00o.f51394OooO0Oo = this.f51387OooO0o0;
        oooO00o.f51396OooO0o0 = this.f51386OooO0o != f51380OooOO0o.OooO0O0(this.f51383OooO0O0) ? this.f51386OooO0o : -1;
        oooO00o.f51395OooO0o.clear();
        oooO00o.f51395OooO0o.addAll(OooO0OO());
        oooO00o.OooO0o0(OooO0Oo());
        if (this.f51381OooO == null) {
            strSubstring = null;
        } else {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f51390OooOO0, '#', 0, false, 6, (Object) null) + 1;
            String str = this.f51390OooOO0;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            strSubstring = str.substring(iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        }
        oooO00o.f51398OooO0oo = strSubstring;
        return oooO00o;
    }

    @JvmName(name = "encodedUsername")
    @NotNull
    public final String OooO0o0() {
        if (this.f51384OooO0OO.length() == 0) {
            return "";
        }
        int length = this.f51383OooO0O0.length() + 3;
        String str = this.f51390OooOO0;
        int iOooO0oO = o00OOO00.OooO0oO(str, ":@", length, str.length());
        String str2 = this.f51390OooOO0;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str2.substring(length, iOooO0oO);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Nullable
    public final OooO00o OooO0oO(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            OooO00o oooO00o = new OooO00o();
            oooO00o.OooO0oO(this, link);
            return oooO00o;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public final String OooO0oo(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> list = this.f51389OooO0oo;
        if (list == null) {
            return null;
        }
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (!Intrinsics.areEqual(name, this.f51389OooO0oo.get(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return this.f51389OooO0oo.get(first + 1);
        }
        return null;
    }

    @Nullable
    public final String OooOO0(int i) {
        List<String> list = this.f51389OooO0oo;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final String OooOO0O() {
        OooO00o oooO00oOooO0oO = OooO0oO("/...");
        Intrinsics.checkNotNull(oooO00oOooO0oO);
        Objects.requireNonNull(oooO00oOooO0oO);
        Intrinsics.checkNotNullParameter("", "username");
        oooO00oOooO0oO.f51392OooO0O0 = OooO0O0.OooO00o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        Intrinsics.checkNotNullParameter("", "password");
        oooO00oOooO0oO.f51393OooO0OO = OooO0O0.OooO00o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return oooO00oOooO0oO.OooO0OO().f51390OooOO0;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    @JvmName(name = ShareConstants.MEDIA_URI)
    @NotNull
    public final URI OooOO0o() {
        OooO00o oooO00oOooO0o = OooO0o();
        String str = oooO00oOooO0o.f51394OooO0Oo;
        oooO00oOooO0o.f51394OooO0Oo = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        int size = oooO00oOooO0o.f51395OooO0o.size();
        for (int i = 0; i < size; i++) {
            ?? r6 = oooO00oOooO0o.f51395OooO0o;
            r6.set(i, OooO0O0.OooO00o((String) r6.get(i), 0, 0, "[]", true, true, false, false, null, 227));
        }
        List<String> list = oooO00oOooO0o.f51397OooO0oO;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = list.get(i2);
                list.set(i2, str2 != null ? OooO0O0.OooO00o(str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195) : null);
            }
        }
        String str3 = oooO00oOooO0o.f51398OooO0oo;
        oooO00oOooO0o.f51398OooO0oo = str3 != null ? OooO0O0.OooO00o(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String string = oooO00oOooO0o.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof o00OO000) && Intrinsics.areEqual(((o00OO000) obj).f51390OooOO0, this.f51390OooOO0);
    }

    public final int hashCode() {
        return this.f51390OooOO0.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f51390OooOO0;
    }
}
