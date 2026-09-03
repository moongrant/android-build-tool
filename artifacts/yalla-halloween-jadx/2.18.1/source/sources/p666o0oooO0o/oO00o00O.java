package p666o0oooO0o;

import com.qiniu.android.http.request.Request;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p659o0ooo0o.o00OO0OO;
import p659o0ooo0o.o00OOO00;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00O0;
import p660o0ooo0o0.o00O00o0;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OOOO0;

/* JADX INFO: loaded from: classes3.dex */
@JvmName(name = "HttpHeaders")
public final class oO00o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ByteString f51870OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ByteString f51871OooO0O0;

    static {
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        f51870OooO00o = oooO00o.OooO0OO("\"\\");
        f51871OooO0O0 = oooO00o.OooO0OO("\t ,=");
    }

    public static final boolean OooO00o(@NotNull o00OOOO0 promisesBody) {
        Intrinsics.checkNotNullParameter(promisesBody, "$this$promisesBody");
        if (Intrinsics.areEqual(promisesBody.f51439Oooo0oO.f51426OooO0OO, Request.HttpMethodHEAD)) {
            return false;
        }
        int i = promisesBody.f51443OoooO00;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && o00OOO00.OooOO0o(promisesBody) == -1 && !StringsKt.OooO("chunked", promisesBody.OooO0O0("Transfer-Encoding", null))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:107:0x0204 A[EDGE_INSN: B:107:0x0204->B:120:0x0243 BREAK  A[LOOP:1: B:22:0x00ae->B:71:0x017a]] */
    /* JADX WARN: Code duplicated, block: B:9:0x005a  */
    public static final void OooO0O0(@NotNull o00O0 receiveHeaders, @NotNull o00OO000 url, @NotNull o00O headers) {
        List<o00O00o0> listEmptyList;
        o00O00o0 o00o00o1;
        String str;
        o00O00o0.OooO00o oooO00o;
        Intrinsics.checkNotNullParameter(receiveHeaders, "$this$receiveHeaders");
        String str2 = "url";
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (receiveHeaders == o00O0.f51232OooO00o) {
            return;
        }
        o00O00o0.OooO00o oooO00o2 = o00O00o0.f51293OooOOO;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        List<String> listOooO0oO = headers.OooO0oO("Set-Cookie");
        int size = listOooO0oO.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            String setCookie = listOooO0oO.get(i2);
            Intrinsics.checkNotNullParameter(url, str2);
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(url, str2);
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            char c = ';';
            int iOooO0oo = o00OOO00.OooO0oo(setCookie, ';', i, i, 6);
            int iOooO0oo2 = o00OOO00.OooO0oo(setCookie, '=', i, iOooO0oo, 2);
            if (iOooO0oo2 == iOooO0oo) {
                o00o00o1 = null;
            } else {
                String strOooOoo0 = o00OOO00.OooOoo0(setCookie, i, iOooO0oo2);
                boolean z = true;
                if (!(strOooOoo0.length() == 0)) {
                    if (o00OOO00.OooOOO(strOooOoo0) == -1) {
                        String strOooOoo1 = o00OOO00.OooOoo0(setCookie, iOooO0oo2 + 1, iOooO0oo);
                        if (o00OOO00.OooOOO(strOooOoo1) == -1) {
                            int i3 = iOooO0oo + 1;
                            int length = setCookie.length();
                            long j = 253402300799999L;
                            long jOooO0O0 = 253402300799999L;
                            long j2 = -1;
                            String str3 = null;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = true;
                            String str4 = null;
                            while (true) {
                                if (i3 >= length) {
                                    str2 = str2;
                                    listOooO0oO = listOooO0oO;
                                    oooO00o2 = oooO00o2;
                                    if (j2 == Long.MIN_VALUE) {
                                        j = Long.MIN_VALUE;
                                    } else if (j2 != -1) {
                                        long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * ((long) 1000) : Long.MAX_VALUE);
                                        if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                                            j = j3;
                                        }
                                    } else {
                                        j = jOooO0O0;
                                    }
                                    String canParseAsIpAddress = url.f51387OooO0o0;
                                    if (str3 != null) {
                                        if (!Intrinsics.areEqual(canParseAsIpAddress, str3)) {
                                            if (StringsKt__StringsJVMKt.endsWith$default(canParseAsIpAddress, str3, false, 2, null) && canParseAsIpAddress.charAt((canParseAsIpAddress.length() - str3.length()) - 1) == '.') {
                                                byte[] bArr = o00OOO00.f51183OooO00o;
                                                Intrinsics.checkNotNullParameter(canParseAsIpAddress, "$this$canParseAsIpAddress");
                                                if (o00OOO00.f51187OooO0o.matches(canParseAsIpAddress)) {
                                                    z = false;
                                                }
                                            } else {
                                                z = false;
                                            }
                                        }
                                        if (!z) {
                                            o00o00o1 = null;
                                            i = 0;
                                            break;
                                        }
                                    } else {
                                        str3 = canParseAsIpAddress;
                                    }
                                    if (canParseAsIpAddress.length() != str3.length()) {
                                        PublicSuffixDatabase.OooO00o oooO00o3 = PublicSuffixDatabase.f53038OooO0oo;
                                        if (PublicSuffixDatabase.f53037OooO0oO.OooO00o(str3) == null) {
                                            o00o00o1 = null;
                                            i = 0;
                                            break;
                                        }
                                    }
                                    String strSubstring = "/";
                                    String str5 = str4;
                                    if (str5 == null || !StringsKt.OooOoOO(str5, "/")) {
                                        String strOooO0O0 = url.OooO0O0();
                                        i = 0;
                                        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) strOooO0O0, '/', 0, false, 6, (Object) null);
                                        if (iLastIndexOf$default != 0) {
                                            Objects.requireNonNull(strOooO0O0, "null cannot be cast to non-null type java.lang.String");
                                            strSubstring = strOooO0O0.substring(0, iLastIndexOf$default);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                        }
                                        str = strSubstring;
                                    } else {
                                        str = str5;
                                        i = 0;
                                    }
                                    o00o00o1 = new o00O00o0(strOooOoo0, strOooOoo1, j, str3, str, z2, z3, z4, z5);
                                    break;
                                }
                                String str6 = str2;
                                int iOooO0o = o00OOO00.OooO0o(setCookie, c, i3, length);
                                List<String> list = listOooO0oO;
                                int iOooO0o2 = o00OOO00.OooO0o(setCookie, '=', i3, iOooO0o);
                                String strOooOoo2 = o00OOO00.OooOoo0(setCookie, i3, iOooO0o2);
                                String strOooOoo3 = iOooO0o2 < iOooO0o ? o00OOO00.OooOoo0(setCookie, iOooO0o2 + 1, iOooO0o) : "";
                                if (StringsKt.OooO(strOooOoo2, "expires")) {
                                    try {
                                        jOooO0O0 = oooO00o2.OooO0O0(strOooOoo3, strOooOoo3.length());
                                        oooO00o = oooO00o2;
                                        z4 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                        oooO00o = oooO00o2;
                                    }
                                } else if (StringsKt.OooO(strOooOoo2, "max-age")) {
                                    try {
                                        long j4 = Long.parseLong(strOooOoo3);
                                        oooO00o = oooO00o2;
                                        j2 = j4 > 0 ? j4 : Long.MIN_VALUE;
                                    } catch (NumberFormatException e) {
                                        oooO00o = oooO00o2;
                                        try {
                                            if (!new Regex("-?\\d+").matches(strOooOoo3)) {
                                                throw e;
                                            }
                                            j2 = StringsKt.OooOoOO(strOooOoo3, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                        } catch (NumberFormatException | IllegalArgumentException unused2) {
                                            continue;
                                        }
                                    }
                                    z4 = true;
                                } else {
                                    oooO00o = oooO00o2;
                                    if (StringsKt.OooO(strOooOoo2, "domain")) {
                                        if (!(!StringsKt__StringsJVMKt.endsWith$default(strOooOoo3, ".", false, 2, null))) {
                                            throw new IllegalArgumentException("Failed requirement.".toString());
                                        }
                                        String strOooO0O1 = o00OO0OO.OooO0O0(StringsKt.removePrefix(strOooOoo3, (CharSequence) "."));
                                        if (strOooO0O1 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = strOooO0O1;
                                        z5 = false;
                                    } else if (StringsKt.OooO(strOooOoo2, "path")) {
                                        str4 = strOooOoo3;
                                    } else if (StringsKt.OooO(strOooOoo2, "secure")) {
                                        z2 = true;
                                    } else if (StringsKt.OooO(strOooOoo2, "httponly")) {
                                        z3 = true;
                                    }
                                }
                                i3 = iOooO0o + 1;
                                str2 = str6;
                                listOooO0oO = list;
                                oooO00o2 = oooO00o;
                                c = ';';
                            }
                        }
                    }
                    i = 0;
                }
                o00o00o1 = null;
            }
            if (o00o00o1 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o00o00o1);
            }
            i2++;
            str2 = str2;
            listOooO0oO = listOooO0oO;
            oooO00o2 = oooO00o2;
        }
        if (arrayList != null) {
            listEmptyList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "Collections.unmodifiableList(cookies)");
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        receiveHeaders.OooO00o(url, listEmptyList);
    }
}
