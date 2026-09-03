package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
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
import p659o0ooo0o.o00OOO00;
import p667o0oooOO.s;
import p674o0oooo0.o0O000;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "OooO00o", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicBoolean f53039OooO00o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CountDownLatch f53040OooO0O0 = new CountDownLatch(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public byte[] f53041OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public byte[] f53042OooO0Oo;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f53038OooO0oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final byte[] f53036OooO0o0 = {(byte) 42};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final List<String> f53035OooO0o = CollectionsKt.listOf("*");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final PublicSuffixDatabase f53037OooO0oO = new PublicSuffixDatabase();

    public static final class OooO00o {
        public static final String OooO00o(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            OooO00o oooO00o = PublicSuffixDatabase.f53038OooO0oo;
            int length = bArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = (i5 + length) / 2;
                while (i6 > -1 && bArr[i6] != ((byte) 10)) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (bArr[i2] == ((byte) 10)) {
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
                        byte[] bArr3 = o00OOO00.f51183OooO00o;
                        int i13 = b & UByte.MAX_VALUE;
                        z = z2;
                        i3 = i13;
                    }
                    byte b2 = bArr[i7 + i12];
                    byte[] bArr4 = o00OOO00.f51183OooO00o;
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
                        z2 = true;
                        i11 = -1;
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

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    @Nullable
    public final String OooO00o(@NotNull String domain) {
        String strOooO00o;
        String strOooO00o2;
        String strOooO00o3;
        List<String> listEmptyList;
        List<String> listEmptyList2;
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List<String> listOooO0OO = OooO0OO(unicodeDomain);
        if (this.f53039OooO00o.get() || !this.f53039OooO00o.compareAndSet(false, true)) {
            try {
                this.f53040OooO0O0.await();
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
                    s.OooO00o oooO00o = s.f51921OooO0OO;
                    s.f51919OooO00o.OooO("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (!(this.f53041OooO0OO != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = listOooO0OO.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str = listOooO0OO.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = str.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strOooO00o = null;
                break;
            }
            byte[] bArr2 = this.f53041OooO0OO;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
            }
            strOooO00o = OooO00o.OooO00o(bArr2, bArr, i2);
            if (strOooO00o != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strOooO00o2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strOooO00o2 = null;
                break;
            }
            bArr3[i3] = f53036OooO0o0;
            byte[] bArr4 = this.f53041OooO0OO;
            if (bArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
            }
            strOooO00o2 = OooO00o.OooO00o(bArr4, bArr3, i3);
            if (strOooO00o2 != null) {
                break;
            }
            i3++;
        }
        if (strOooO00o2 == null) {
            strOooO00o3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strOooO00o3 = null;
                break;
            }
            byte[] bArr5 = this.f53042OooO0Oo;
            if (bArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
            }
            strOooO00o3 = OooO00o.OooO00o(bArr5, bArr, i5);
            if (strOooO00o3 != null) {
                break;
            }
            i5++;
        }
        if (strOooO00o3 != null) {
            listEmptyList2 = StringsKt__StringsKt.split$default('!' + strOooO00o3, new char[]{'.'}, false, 0, 6, (Object) null);
        } else if (strOooO00o == null && strOooO00o2 == null) {
            listEmptyList2 = f53035OooO0o;
        } else {
            if (strOooO00o == null || (listEmptyList = StringsKt__StringsKt.split$default(strOooO00o, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (strOooO00o2 == null || (listEmptyList2 = StringsKt__StringsKt.split$default(strOooO00o2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
            if (listEmptyList.size() > listEmptyList2.size()) {
                listEmptyList2 = listEmptyList;
            }
        }
        if (listOooO0OO.size() == listEmptyList2.size() && listEmptyList2.get(0).charAt(0) != '!') {
            return null;
        }
        if (listEmptyList2.get(0).charAt(0) == '!') {
            size = listOooO0OO.size();
            size2 = listEmptyList2.size();
        } else {
            size = listOooO0OO.size();
            size2 = listEmptyList2.size() + 1;
        }
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt.drop(CollectionsKt.asSequence(OooO0OO(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void OooO0O0() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(new o0O000(o0O000Oo.OooO(resourceAsStream)));
            try {
                byte[] bArrO0OO00O = o0ooooOooO0OO.o0OO00O(o0ooooOooO0OO.readInt());
                byte[] bArrO0OO00O2 = o0ooooOooO0OO.o0OO00O(o0ooooOooO0OO.readInt());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(o0ooooOooO0OO, null);
                synchronized (this) {
                    Intrinsics.checkNotNull(bArrO0OO00O);
                    this.f53041OooO0OO = bArrO0OO00O;
                    Intrinsics.checkNotNull(bArrO0OO00O2);
                    this.f53042OooO0Oo = bArrO0OO00O2;
                }
                this.f53040OooO0O0.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(o0ooooOooO0OO, th);
                    throw th2;
                }
            }
        }
    }

    public final List<String> OooO0OO(String str) {
        List<String> listSplit$default = StringsKt__StringsKt.split$default(str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual((String) CollectionsKt.last((List) listSplit$default), "") ? CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }
}
