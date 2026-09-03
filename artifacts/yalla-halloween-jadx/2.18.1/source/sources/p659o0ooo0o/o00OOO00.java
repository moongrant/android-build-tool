package p659o0ooo0o;

import Oooo000.o00oO0o;
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
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0o0Oo;
import p662o0oooO.o00;
import p674o0oooo0.o0O00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@JvmName(name = "Util")
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final byte[] f51183OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O f51184OooO0O0 = o00O.f51229Oooo0oO.OooO0OO(new String[0]);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00OOOOo.OooO0O0.OooO00o f51185OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O00 f51186OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Regex f51187OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final TimeZone f51188OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final String f51189OooO0oO;

    static {
        byte[] toResponseBody = new byte[0];
        f51183OooO00o = toResponseBody;
        Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
        o0oOO asResponseBody = new o0oOO();
        asResponseBody.OoooOOo(toResponseBody);
        Intrinsics.checkNotNullParameter(asResponseBody, "$this$asResponseBody");
        f51185OooO0OO = new o00OOOOo.OooO0O0.OooO00o(asResponseBody, null, 0);
        o0o0Oo.OooO00o.OooO0Oo(o0o0Oo.Companion, toResponseBody, null, 0, 7);
        o0O00.OooO00o oooO00o = o0O00.f52039Oooo0oo;
        ByteString.OooO00o oooO00o2 = ByteString.f53047OoooO00;
        f51186OooO0Oo = oooO00o.OooO0O0(oooO00o2.OooO0O0("efbbbf"), oooO00o2.OooO0O0("feff"), oooO00o2.OooO0O0("fffe"), oooO00o2.OooO0O0("0000ffff"), oooO00o2.OooO0O0("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f51188OooO0o0 = timeZone;
        f51187OooO0o = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = o00OO.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f51189OooO0oO = StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final boolean OooO(@NotNull o0O0O0O discard) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(discard, "$this$discard");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return OooOo0O(discard, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean OooO00o(@NotNull o00OO000 canReuseConnectionFor, @NotNull o00OO000 other) {
        Intrinsics.checkNotNullParameter(canReuseConnectionFor, "$this$canReuseConnectionFor");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(canReuseConnectionFor.f51387OooO0o0, other.f51387OooO0o0) && canReuseConnectionFor.f51386OooO0o == other.f51386OooO0o && Intrinsics.areEqual(canReuseConnectionFor.f51383OooO0O0, other.f51383OooO0O0);
    }

    public static final int OooO0O0(long j, @Nullable TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter("timeout", "name");
        if (!(j >= 0)) {
            throw new IllegalStateException("timeout < 0".toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (!(millis <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException("timeout too large.".toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.".toString());
    }

    public static final void OooO0OO(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void OooO0Oo(@NotNull Closeable closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int OooO0o(@NotNull String delimiterOffset, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        while (i < i2) {
            if (delimiterOffset.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final void OooO0o0(@NotNull Socket closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.areEqual(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final int OooO0oO(@NotNull String delimiterOffset, @NotNull String delimiters, int i, int i2) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i2) {
            if (StringsKt__StringsKt.contains$default(delimiters, delimiterOffset.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int OooO0oo(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return OooO0o(str, c, i, i2);
    }

    @NotNull
    public static final String OooOO0(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }

    public static final boolean OooOO0O(@NotNull String[] hasIntersection, @Nullable String[] strArr, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(hasIntersection, "$this$hasIntersection");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(hasIntersection.length == 0) && strArr != null) {
            if (!(strArr.length == 0)) {
                for (String str : hasIntersection) {
                    for (String str2 : strArr) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long OooOO0o(@NotNull o00OOOO0 headersContentLength) {
        Intrinsics.checkNotNullParameter(headersContentLength, "$this$headersContentLength");
        String toLongOrDefault = headersContentLength.f51444OoooO0O.OooO00o("Content-Length");
        if (toLongOrDefault != null) {
            Intrinsics.checkNotNullParameter(toLongOrDefault, "$this$toLongOrDefault");
            try {
                return Long.parseLong(toLongOrDefault);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final int OooOOO(@NotNull String indexOfControlOrNonAscii) {
        Intrinsics.checkNotNullParameter(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = indexOfControlOrNonAscii.charAt(i);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> OooOOO0(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int OooOOOO(@NotNull String indexOfFirstNonAsciiWhitespace, int i, int i2) {
        Intrinsics.checkNotNullParameter(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char cCharAt = indexOfFirstNonAsciiWhitespace.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int OooOOOo(@NotNull String indexOfLastNonAsciiWhitespace, int i, int i2) {
        Intrinsics.checkNotNullParameter(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char cCharAt = indexOfLastNonAsciiWhitespace.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final boolean OooOOo(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.OooO(name, "Authorization") || StringsKt.OooO(name, "Cookie") || StringsKt.OooO(name, "Proxy-Authorization") || StringsKt.OooO(name, "Set-Cookie");
    }

    @NotNull
    public static final String[] OooOOo0(@NotNull String[] intersect, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(intersect, "$this$intersect");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final int OooOOoo(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    @NotNull
    public static final String OooOo(int i) {
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final int OooOo0(@NotNull o0oOOo readMedium) throws IOException {
        Intrinsics.checkNotNullParameter(readMedium, "$this$readMedium");
        return (readMedium.readByte() & UByte.MAX_VALUE) | ((readMedium.readByte() & UByte.MAX_VALUE) << 16) | ((readMedium.readByte() & UByte.MAX_VALUE) << 8);
    }

    @NotNull
    public static final Charset OooOo00(@NotNull o0oOOo readBomAsCharset, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(readBomAsCharset, "$this$readBomAsCharset");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iO00000OO = readBomAsCharset.o00000OO(f51186OooO0Oo);
        if (iO00000OO == -1) {
            return charset;
        }
        if (iO00000OO == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iO00000OO == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iO00000OO == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iO00000OO == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        if (iO00000OO == 4) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[PHI: r13
      0x0072: PHI (r13v3 boolean) = (r13v2 boolean), (r13v7 boolean) binds: [B:22:0x0070, B:13:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public static final boolean OooOo0O(@NotNull o0O0O0O skipAll, int i) throws IOException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(skipAll, "$this$skipAll");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jOooO0OO = skipAll.timeout().OooO0o0() ? skipAll.timeout().OooO0OO() - jNanoTime : Long.MAX_VALUE;
        skipAll.timeout().OooO0Oo(Math.min(jOooO0OO, timeUnit.toNanos(i)) + jNanoTime);
        try {
            o0oOO o0ooo2 = new o0oOO();
            while (skipAll.Oooo0O0(o0ooo2, 8192L) != -1) {
                o0ooo2.OooO0Oo();
            }
            z = true;
            if (jOooO0OO == Long.MAX_VALUE) {
                skipAll.timeout().OooO00o();
            } else {
                skipAll.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
        } catch (InterruptedIOException unused) {
            z = false;
            if (jOooO0OO == Long.MAX_VALUE) {
                skipAll.timeout().OooO00o();
            }
        } catch (Throwable th) {
            if (jOooO0OO == Long.MAX_VALUE) {
                skipAll.timeout().OooO00o();
            } else {
                skipAll.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
            throw th;
        }
        return z;
    }

    @NotNull
    public static final o00O OooOo0o(@NotNull List<o00> toHeaders) {
        Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
        ArrayList arrayList = new ArrayList(20);
        for (o00 o00Var : toHeaders) {
            ByteString byteString = o00Var.f51557OooO0O0;
            ByteString byteString2 = o00Var.f51558OooO0OO;
            String name = byteString.OooOOO();
            String value = byteString2.OooOOO();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(name);
            arrayList.add(StringsKt.trim((CharSequence) value).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new o00O((String[]) array);
    }

    @NotNull
    public static final <T> List<T> OooOoO(@NotNull List<? extends T> toImmutableList) {
        Intrinsics.checkNotNullParameter(toImmutableList, "$this$toImmutableList");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) toImmutableList));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    @NotNull
    public static final String OooOoO0(@NotNull o00OO000 toHostHeader, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(toHostHeader, "$this$toHostHeader");
        String strOooO0O0 = StringsKt__StringsKt.contains$default(toHostHeader.f51387OooO0o0, CertificateUtil.DELIMITER, false, 2, (Object) null) ? o00oO0o.OooO0O0(o00O0O0O.OooO00o('['), toHostHeader.f51387OooO0o0, ']') : toHostHeader.f51387OooO0o0;
        if (!z) {
            int i2 = toHostHeader.f51386OooO0o;
            String scheme = toHostHeader.f51383OooO0O0;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && scheme.equals("https")) {
                    i = 443;
                } else {
                    i = -1;
                }
            } else if (scheme.equals("http")) {
                i = 80;
            } else {
                i = -1;
            }
            if (i2 == i) {
                return strOooO0O0;
            }
        }
        return strOooO0O0 + ':' + toHostHeader.f51386OooO0o;
    }

    public static final int OooOoOO(@Nullable String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @NotNull
    public static final Throwable OooOoo(@NotNull Exception withSuppressed, @NotNull List<? extends Exception> suppressed) {
        Intrinsics.checkNotNullParameter(withSuppressed, "$this$withSuppressed");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(withSuppressed, it.next());
        }
        return withSuppressed;
    }

    @NotNull
    public static final String OooOoo0(@NotNull String trimSubstring, int i, int i2) {
        Intrinsics.checkNotNullParameter(trimSubstring, "$this$trimSubstring");
        int iOooOOOO = OooOOOO(trimSubstring, i, i2);
        String strSubstring = trimSubstring.substring(iOooOOOO, OooOOOo(trimSubstring, iOooOOOO, i2));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
