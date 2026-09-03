package p648o0ooOoo;

import com.facebook.internal.security.CertificateUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O0O0O;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0oO0Ooo;
import p655o0ooo0O.o0OOO0OO;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OOO0;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
@JvmName(name = "Util")
public final class oO000o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final byte[] f58124OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0O000 f58125OooO0O0 = o0O000.OooO0O0.OooO0OO(new String[0]);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0O0O0O f58126OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final o0OOO0 f58127OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Regex f58128OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final TimeZone f58129OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final String f58130OooO0oO;

    static {
        byte[] bArr = new byte[0];
        f58124OooO00o = bArr;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        oo0OOoo oo0oooo = new oo0OOoo();
        oo0oooo.o00Ooo(bArr);
        Intrinsics.checkNotNullParameter(oo0oooo, "<this>");
        f58126OooO0OO = new o0O0O0O(null, 0, oo0oooo);
        o0oO0Ooo.OooO00o.OooO0OO(o0oO0Ooo.Companion, bArr, null, 0, 7);
        int i = o0OOO0.f59781OooO0o;
        ByteString byteString = ByteString.f60193OooO0oO;
        f58127OooO0Oo = o0OOO0.OooO00o.OooO0O0(ByteString.OooO00o.OooO0O0("efbbbf"), ByteString.OooO00o.OooO0O0("feff"), ByteString.OooO00o.OooO0O0("fffe"), ByteString.OooO00o.OooO0O0("0000ffff"), ByteString.OooO00o.OooO0O0("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f58129OooO0o0 = timeZone;
        f58128OooO0o = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = o0OoO00O.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f58130OooO0oO = StringsKt__StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    @NotNull
    public static final String OooO(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean OooO00o(@NotNull o0O000O o0o000o, @NotNull o0O000O other) {
        Intrinsics.checkNotNullParameter(o0o000o, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(o0o000o.f57792OooO0Oo, other.f57792OooO0Oo) && o0o000o.f57794OooO0o0 == other.f57794OooO0o0 && Intrinsics.areEqual(o0o000o.f57789OooO00o, other.f57789OooO00o);
    }

    public static final int OooO0O0(long j, @Nullable TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter("timeout", "name");
        boolean z = true;
        if (!(j >= 0)) {
            throw new IllegalStateException(Intrinsics.stringPlus("timeout", " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (!(millis <= 2147483647L)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("timeout", " too large.").toString());
        }
        if (millis == 0 && j > 0) {
            z = false;
        }
        if (z) {
            return (int) millis;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("timeout", " too small.").toString());
    }

    public static final void OooO0OO(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void OooO0Oo(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.areEqual(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final int OooO0o(@NotNull String str, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            if (str.charAt(i) == c) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final int OooO0o0(int i, int i2, @NotNull String str, @NotNull String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i2) {
            int i3 = i + 1;
            if (StringsKt__StringsKt.contains$default(delimiters, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int OooO0oO(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return OooO0o(str, c, i, i2);
    }

    public static final boolean OooO0oo(@NotNull oO00000 oo00000, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(oo00000, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return OooOo0(oo00000, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean OooOO0(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    Iterator it = ArrayIteratorKt.iterator(strArr2);
                    while (it.hasNext()) {
                        if (comparator.compare(str, (String) it.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long OooOO0O(@NotNull o0O00o00 o0o00o01) {
        Intrinsics.checkNotNullParameter(o0o00o01, "<this>");
        String strOooO00o = o0o00o01.f57846OooO.OooO00o("Content-Length");
        if (strOooO00o != null) {
            Intrinsics.checkNotNullParameter(strOooO00o, "<this>");
            try {
                return Long.parseLong(strOooO00o);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> OooOO0o(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int OooOOO(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final int OooOOO0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final int OooOOOO(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char cCharAt = str.charAt(i3);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3 = i4;
                }
            }
        }
        return i;
    }

    @NotNull
    public static final String[] OooOOOo(@NotNull String[] strArr, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = other.length;
            int i2 = 0;
            while (i2 < length2) {
                String str2 = other[i2];
                i2++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final int OooOOo(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if (!('A' <= c && c < 'G')) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static final boolean OooOOo0(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt__StringsJVMKt.equals(name, "Authorization", true) || StringsKt__StringsJVMKt.equals(name, "Cookie", true) || StringsKt__StringsJVMKt.equals(name, "Proxy-Authorization", true) || StringsKt__StringsJVMKt.equals(name, "Set-Cookie", true);
    }

    @NotNull
    public static final Charset OooOOoo(@NotNull o0O0o0 o0o0o0, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(o0o0o0, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iOoooo0o = o0o0o0.Ooooo0o(f58127OooO0Oo);
        if (iOoooo0o == -1) {
            return charset;
        }
        if (iOoooo0o == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iOoooo0o == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iOoooo0o == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iOoooo0o == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        if (iOoooo0o == 4) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    @NotNull
    public static final <T> List<T> OooOo(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final boolean OooOo0(@NotNull oO00000 oo00000, int i, @NotNull TimeUnit timeUnit) throws IOException {
        Intrinsics.checkNotNullParameter(oo00000, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jOooO0OO = oo00000.timeout().OooO0o0() ? oo00000.timeout().OooO0OO() - jNanoTime : Long.MAX_VALUE;
        oo00000.timeout().OooO0Oo(Math.min(jOooO0OO, timeUnit.toNanos(i)) + jNanoTime);
        try {
            oo0OOoo oo0oooo = new oo0OOoo();
            while (oo00000.OooOO0O(oo0oooo, 8192L) != -1) {
                oo0oooo.OooO0oO();
            }
            if (jOooO0OO == LongCompanionObject.MAX_VALUE) {
                oo00000.timeout().OooO00o();
            } else {
                oo00000.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jOooO0OO == LongCompanionObject.MAX_VALUE) {
                oo00000.timeout().OooO00o();
            } else {
                oo00000.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
            return false;
        } catch (Throwable th) {
            if (jOooO0OO == LongCompanionObject.MAX_VALUE) {
                oo00000.timeout().OooO00o();
            } else {
                oo00000.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
            throw th;
        }
    }

    public static final int OooOo00(@NotNull o0O0o0 o0o0o0) throws IOException {
        Intrinsics.checkNotNullParameter(o0o0o0, "<this>");
        return (o0o0o0.readByte() & UByte.MAX_VALUE) | ((o0o0o0.readByte() & UByte.MAX_VALUE) << 16) | ((o0o0o0.readByte() & UByte.MAX_VALUE) << 8);
    }

    @NotNull
    public static final o0O000 OooOo0O(@NotNull List<o0OOO0OO> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        o0O000.OooO00o oooO00o = new o0O000.OooO00o();
        for (o0OOO0OO o0ooo0oo2 : list) {
            oooO00o.OooO0O0(o0ooo0oo2.f59423OooO00o.OooOo00(), o0ooo0oo2.f59424OooO0O0.OooOo00());
        }
        return oooO00o.OooO0OO();
    }

    @NotNull
    public static final String OooOo0o(@NotNull o0O000O o0o000o, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(o0o000o, "<this>");
        boolean zContains$default = StringsKt__StringsKt.contains$default(o0o000o.f57792OooO0Oo, CertificateUtil.DELIMITER, false, 2, (Object) null);
        String str = o0o000o.f57792OooO0Oo;
        if (zContains$default) {
            str = "[" + str + ']';
        }
        int i2 = o0o000o.f57794OooO0o0;
        if (!z) {
            String scheme = o0o000o.f57789OooO00o;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                i = 80;
            } else {
                i = Intrinsics.areEqual(scheme, "https") ? 443 : -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    @NotNull
    public static final String OooOoO(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iOooOOO = OooOOO(i, i2, str);
        String strSubstring = str.substring(iOooOOO, OooOOOO(iOooOOO, i2, str));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final int OooOoO0(int i, @Nullable String str) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (lValueOf == null) {
            return i;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    @NotNull
    public static final void OooOoOO(@NotNull IOException iOException, @NotNull List suppressed) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(iOException, (Exception) it.next());
        }
    }
}
