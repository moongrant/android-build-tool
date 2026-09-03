package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000o0;
import p652o0ooo00o.o000O0O0;
import p659o0oooO00.o000O000;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "OooO00o", "okhttp"}, k = 1, mv = {1, 6, 0})
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final List<String> f60855OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final byte[] f60856OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final PublicSuffixDatabase f60857OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f60858OooO00o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CountDownLatch f60859OooO0O0 = new CountDownLatch(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public byte[] f60860OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f60861OooO0Oo;

    public static final class OooO00o {
        public static final String OooO00o(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            byte[] bArr3 = PublicSuffixDatabase.f60856OooO0o0;
            int length = bArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = (i5 + length) / 2;
                while (i6 > -1 && bArr[i6] != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i2 - i7;
                int i10 = i;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte b = bArr2[i10][i11];
                        byte[] bArr4 = o0O000o0.f57386OooO00o;
                        int i13 = b & UByte.MAX_VALUE;
                        z = z2;
                        i3 = i13;
                    }
                    byte b2 = bArr[i7 + i12];
                    byte[] bArr5 = o0O000o0.f57386OooO00o;
                    i4 = i3 - (b2 & UByte.MAX_VALUE);
                    if (i4 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i14 = i9 - i12;
                        int length2 = bArr2[i10].length - i11;
                        int length3 = bArr2.length;
                        for (int i15 = i10 + 1; i15 < length3; i15++) {
                            length2 += bArr2[i15].length;
                        }
                        if (length2 >= i14) {
                            if (length2 <= i14) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i7, i9, UTF_8);
                            }
                        }
                    }
                    i5 = i2 + 1;
                }
                length = i7 - 1;
            }
            return null;
        }
    }

    static {
        new OooO00o();
        f60856OooO0o0 = new byte[]{42};
        f60855OooO0o = CollectionsKt.listOf("*");
        f60857OooO0oO = new PublicSuffixDatabase();
    }

    public static List OooO0OO(String str) {
        List listSplit$default = StringsKt__StringsKt.split$default(str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual(CollectionsKt.last(listSplit$default), "") ? CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Nullable
    public final String OooO00o(@NotNull String domain) {
        String strOooO00o;
        String strOooO00o2;
        String strOooO00o3;
        List<String> listSplit$default;
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List listOooO0OO = OooO0OO(unicodeDomain);
        if (this.f60858OooO00o.get() || !this.f60858OooO00o.compareAndSet(false, true)) {
            try {
                this.f60859OooO0O0.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        OooO0O0();
                        break;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
                    o000O0O0.f60031OooO00o.getClass();
                    o000O0O0.OooO(e, 5, "Failed to read public suffix list");
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (!(this.f60860OooO0OO != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = listOooO0OO.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str = (String) listOooO0OO.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strOooO00o = null;
                break;
            }
            int i3 = i2 + 1;
            byte[] bArr2 = this.f60860OooO0OO;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr2 = null;
            }
            strOooO00o = OooO00o.OooO00o(bArr2, bArr, i2);
            if (strOooO00o != null) {
                break;
            }
            i2 = i3;
        }
        if (size3 <= 1) {
            strOooO00o2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                strOooO00o2 = null;
                break;
            }
            int i5 = i4 + 1;
            bArr3[i4] = f60856OooO0o0;
            byte[] bArr4 = this.f60860OooO0OO;
            if (bArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr4 = null;
            }
            strOooO00o2 = OooO00o.OooO00o(bArr4, bArr3, i4);
            if (strOooO00o2 != null) {
                break;
            }
            i4 = i5;
        }
        if (strOooO00o2 == null) {
            strOooO00o3 = null;
            break;
        }
        int i6 = size3 - 1;
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                strOooO00o3 = null;
                break;
            }
            int i8 = i7 + 1;
            byte[] bArr5 = this.f60861OooO0Oo;
            if (bArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                bArr5 = null;
            }
            strOooO00o3 = OooO00o.OooO00o(bArr5, bArr, i7);
            if (strOooO00o3 != null) {
                break;
            }
            i7 = i8;
        }
        if (strOooO00o3 != null) {
            listSplit$default = StringsKt__StringsKt.split$default(Intrinsics.stringPlus("!", strOooO00o3), new char[]{'.'}, false, 0, 6, (Object) null);
        } else if (strOooO00o == null && strOooO00o2 == null) {
            listSplit$default = f60855OooO0o;
        } else {
            List<String> listSplit$default2 = strOooO00o == null ? null : StringsKt__StringsKt.split$default(strOooO00o, new char[]{'.'}, false, 0, 6, (Object) null);
            if (listSplit$default2 == null) {
                listSplit$default2 = CollectionsKt.emptyList();
            }
            listSplit$default = strOooO00o2 == null ? null : StringsKt__StringsKt.split$default(strOooO00o2, new char[]{'.'}, false, 0, 6, (Object) null);
            if (listSplit$default == null) {
                listSplit$default = CollectionsKt.emptyList();
            }
            if (listSplit$default2.size() > listSplit$default.size()) {
                listSplit$default = listSplit$default2;
            }
        }
        if (listOooO0OO.size() == listSplit$default.size() && listSplit$default.get(0).charAt(0) != '!') {
            return null;
        }
        if (listSplit$default.get(0).charAt(0) == '!') {
            size = listOooO0OO.size();
            size2 = listSplit$default.size();
        } else {
            size = listOooO0OO.size();
            size2 = listSplit$default.size() + 1;
        }
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt.drop(CollectionsKt.asSequence(OooO0OO(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void OooO0O0() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(new o000O000(o000O0Oo.OooO0oo(resourceAsStream)));
        try {
            long j = o00o0000OooO0O0.readInt();
            o00o0000OooO0O0.OoooOoO(j);
            byte[] bArrOooo0OO = o00o0000OooO0O0.f60234OooO0o0.Oooo0OO(j);
            long j2 = o00o0000OooO0O0.readInt();
            o00o0000OooO0O0.OoooOoO(j2);
            byte[] bArrOooo0OO2 = o00o0000OooO0O0.f60234OooO0o0.Oooo0OO(j2);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(o00o0000OooO0O0, null);
            synchronized (this) {
                Intrinsics.checkNotNull(bArrOooo0OO);
                this.f60860OooO0OO = bArrOooo0OO;
                Intrinsics.checkNotNull(bArrOooo0OO2);
                this.f60861OooO0Oo = bArrOooo0OO2;
            }
            this.f60859OooO0O0.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o00o0000OooO0O0, th);
                throw th2;
            }
        }
    }
}
