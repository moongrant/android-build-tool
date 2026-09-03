package p662o0oooO;

import com.qiniu.android.collect.ReportItem;
import com.qiniu.android.http.request.Request;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p659o0ooo0o.o00OOO00;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00[] f51572OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Map<ByteString, Integer> f51573OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00O0000 f51574OooO0OO = new o00O0000();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<o00> f51575OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O00OO f51576OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @JvmField
        @NotNull
        public o00[] f51577OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f51578OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @JvmField
        public int f51579OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @JvmField
        public int f51580OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f51581OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f51582OooO0oo;

        public OooO00o(o0O0O0O source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f51581OooO0oO = 4096;
            this.f51582OooO0oo = 4096;
            this.f51575OooO00o = new ArrayList();
            this.f51576OooO0O0 = (o0O00OO) o0O000Oo.OooO0OO(source);
            this.f51577OooO0OO = new o00[8];
            this.f51578OooO0Oo = 7;
        }

        public final void OooO00o() {
            ArraysKt___ArraysJvmKt.fill$default(this.f51577OooO0OO, (Object) null, 0, 0, 6, (Object) null);
            this.f51578OooO0Oo = this.f51577OooO0OO.length - 1;
            this.f51580OooO0o0 = 0;
            this.f51579OooO0o = 0;
        }

        public final int OooO0O0(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f51577OooO0OO.length;
                while (true) {
                    length--;
                    i2 = this.f51578OooO0Oo;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    o00 o00Var = this.f51577OooO0OO[length];
                    Intrinsics.checkNotNull(o00Var);
                    int i4 = o00Var.f51556OooO00o;
                    i -= i4;
                    this.f51579OooO0o -= i4;
                    this.f51580OooO0o0--;
                    i3++;
                }
                o00[] o00VarArr = this.f51577OooO0OO;
                System.arraycopy(o00VarArr, i2 + 1, o00VarArr, i2 + 1 + i3, this.f51580OooO0o0);
                this.f51578OooO0Oo += i3;
            }
            return i3;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x000d  */
        public final ByteString OooO0OO(int i) throws IOException {
            boolean z;
            if (i >= 0) {
                o00O0000 o00o0001 = o00O0000.f51574OooO0OO;
                if (i <= o00O0000.f51572OooO00o.length - 1) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                o00O0000 o00o0002 = o00O0000.f51574OooO0OO;
                return o00O0000.f51572OooO00o[i].f51557OooO0O0;
            }
            o00O0000 o00o0003 = o00O0000.f51574OooO0OO;
            int length = this.f51578OooO0Oo + 1 + (i - o00O0000.f51572OooO00o.length);
            if (length >= 0) {
                o00[] o00VarArr = this.f51577OooO0OO;
                if (length < o00VarArr.length) {
                    o00 o00Var = o00VarArr[length];
                    Intrinsics.checkNotNull(o00Var);
                    return o00Var.f51557OooO0O0;
                }
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Header index too large ");
            sbOooO0o0.append(i + 1);
            throw new IOException(sbOooO0o0.toString());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0oooO.o00>] */
        public final void OooO0Oo(o00 o00Var) {
            this.f51575OooO00o.add(o00Var);
            int i = o00Var.f51556OooO00o;
            int i2 = this.f51582OooO0oo;
            if (i > i2) {
                OooO00o();
                return;
            }
            OooO0O0((this.f51579OooO0o + i) - i2);
            int i3 = this.f51580OooO0o0 + 1;
            o00[] o00VarArr = this.f51577OooO0OO;
            if (i3 > o00VarArr.length) {
                o00[] o00VarArr2 = new o00[o00VarArr.length * 2];
                System.arraycopy(o00VarArr, 0, o00VarArr2, o00VarArr.length, o00VarArr.length);
                this.f51578OooO0Oo = this.f51577OooO0OO.length - 1;
                this.f51577OooO0OO = o00VarArr2;
            }
            int i4 = this.f51578OooO0Oo;
            this.f51578OooO0Oo = i4 - 1;
            this.f51577OooO0OO[i4] = o00Var;
            this.f51580OooO0o0++;
            this.f51579OooO0o += i;
        }

        public final int OooO0o(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.f51576OooO0O0.readByte();
                byte[] bArr = o00OOO00.f51183OooO00o;
                int i5 = b & UByte.MAX_VALUE;
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        @NotNull
        public final ByteString OooO0o0() throws IOException {
            byte b = this.f51576OooO0O0.readByte();
            byte[] bArr = o00OOO00.f51183OooO00o;
            int i = b & UByte.MAX_VALUE;
            int i2 = 0;
            boolean z = (i & 128) == 128;
            long jOooO0o = OooO0o(i, 127);
            if (!z) {
                return this.f51576OooO0O0.OooOOOo(jOooO0o);
            }
            o0oOO sink = new o0oOO();
            o00O0OO0 o00o0oo1 = o00O0OO0.f51653OooO0Oo;
            o0O00OO source = this.f51576OooO0O0;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            o00O0OO0.OooO00o oooO00o = o00O0OO0.f51652OooO0OO;
            int i3 = 0;
            for (long j = 0; j < jOooO0o; j++) {
                byte b2 = source.readByte();
                byte[] bArr2 = o00OOO00.f51183OooO00o;
                i2 = (i2 << 8) | (b2 & UByte.MAX_VALUE);
                i3 += 8;
                while (i3 >= 8) {
                    int i4 = i3 - 8;
                    int i5 = (i2 >>> i4) & KotlinVersion.MAX_COMPONENT_VALUE;
                    o00O0OO0.OooO00o[] oooO00oArr = oooO00o.f51654OooO00o;
                    Intrinsics.checkNotNull(oooO00oArr);
                    oooO00o = oooO00oArr[i5];
                    Intrinsics.checkNotNull(oooO00o);
                    if (oooO00o.f51654OooO00o == null) {
                        sink.Ooooo0o(oooO00o.f51655OooO0O0);
                        i3 -= oooO00o.f51656OooO0OO;
                        oooO00o = o00O0OO0.f51652OooO0OO;
                    } else {
                        i3 = i4;
                    }
                }
            }
            while (i3 > 0) {
                int i6 = (i2 << (8 - i3)) & KotlinVersion.MAX_COMPONENT_VALUE;
                o00O0OO0.OooO00o[] oooO00oArr2 = oooO00o.f51654OooO00o;
                Intrinsics.checkNotNull(oooO00oArr2);
                o00O0OO0.OooO00o oooO00o2 = oooO00oArr2[i6];
                Intrinsics.checkNotNull(oooO00o2);
                if (oooO00o2.f51654OooO00o != null || oooO00o2.f51656OooO0OO > i3) {
                    break;
                }
                sink.Ooooo0o(oooO00o2.f51655OooO0O0);
                i3 -= oooO00o2.f51656OooO0OO;
                oooO00o = o00O0OO0.f51652OooO0OO;
            }
            return sink.OooOoo();
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final o0oOO f51583OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f51584OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f51585OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @JvmField
        public int f51586OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @JvmField
        @NotNull
        public o00[] f51587OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @JvmField
        public int f51588OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f51589OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @JvmField
        public int f51590OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f51591OooO0oo;

        public OooO0O0(o0oOO out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f51591OooO0oo = true;
            this.f51583OooO = out;
            this.f51584OooO00o = Integer.MAX_VALUE;
            this.f51586OooO0OO = 4096;
            this.f51587OooO0Oo = new o00[8];
            this.f51589OooO0o0 = 7;
        }

        public final void OooO00o() {
            ArraysKt___ArraysJvmKt.fill$default(this.f51587OooO0Oo, (Object) null, 0, 0, 6, (Object) null);
            this.f51589OooO0o0 = this.f51587OooO0Oo.length - 1;
            this.f51588OooO0o = 0;
            this.f51590OooO0oO = 0;
        }

        public final int OooO0O0(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f51587OooO0Oo.length;
                while (true) {
                    length--;
                    i2 = this.f51589OooO0o0;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    o00 o00Var = this.f51587OooO0Oo[length];
                    Intrinsics.checkNotNull(o00Var);
                    i -= o00Var.f51556OooO00o;
                    int i4 = this.f51590OooO0oO;
                    o00 o00Var2 = this.f51587OooO0Oo[length];
                    Intrinsics.checkNotNull(o00Var2);
                    this.f51590OooO0oO = i4 - o00Var2.f51556OooO00o;
                    this.f51588OooO0o--;
                    i3++;
                }
                o00[] o00VarArr = this.f51587OooO0Oo;
                System.arraycopy(o00VarArr, i2 + 1, o00VarArr, i2 + 1 + i3, this.f51588OooO0o);
                o00[] o00VarArr2 = this.f51587OooO0Oo;
                int i5 = this.f51589OooO0o0;
                Arrays.fill(o00VarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f51589OooO0o0 += i3;
            }
            return i3;
        }

        public final void OooO0OO(o00 o00Var) {
            int i = o00Var.f51556OooO00o;
            int i2 = this.f51586OooO0OO;
            if (i > i2) {
                OooO00o();
                return;
            }
            OooO0O0((this.f51590OooO0oO + i) - i2);
            int i3 = this.f51588OooO0o + 1;
            o00[] o00VarArr = this.f51587OooO0Oo;
            if (i3 > o00VarArr.length) {
                o00[] o00VarArr2 = new o00[o00VarArr.length * 2];
                System.arraycopy(o00VarArr, 0, o00VarArr2, o00VarArr.length, o00VarArr.length);
                this.f51589OooO0o0 = this.f51587OooO0Oo.length - 1;
                this.f51587OooO0Oo = o00VarArr2;
            }
            int i4 = this.f51589OooO0o0;
            this.f51589OooO0o0 = i4 - 1;
            this.f51587OooO0Oo[i4] = o00Var;
            this.f51588OooO0o++;
            this.f51590OooO0oO += i;
        }

        public final void OooO0Oo(@NotNull ByteString source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "data");
            if (this.f51591OooO0oo) {
                o00O0OO0 o00o0oo1 = o00O0OO0.f51653OooO0Oo;
                Intrinsics.checkNotNullParameter(source, "bytes");
                int iOooO0o0 = source.OooO0o0();
                long j = 0;
                for (int i = 0; i < iOooO0o0; i++) {
                    byte bOooO0oo = source.OooO0oo(i);
                    byte[] bArr = o00OOO00.f51183OooO00o;
                    j += (long) o00O0OO0.f51651OooO0O0[bOooO0oo & UByte.MAX_VALUE];
                }
                if (((int) ((j + ((long) 7)) >> 3)) < source.OooO0o0()) {
                    o0oOO sink = new o0oOO();
                    o00O0OO0 o00o0oo2 = o00O0OO0.f51653OooO0Oo;
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    int iOooO0o1 = source.OooO0o0();
                    long j2 = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < iOooO0o1; i3++) {
                        byte bOooO0oo2 = source.OooO0oo(i3);
                        byte[] bArr2 = o00OOO00.f51183OooO00o;
                        int i4 = bOooO0oo2 & UByte.MAX_VALUE;
                        int i5 = o00O0OO0.f51650OooO00o[i4];
                        byte b = o00O0OO0.f51651OooO0O0[i4];
                        j2 = (j2 << b) | ((long) i5);
                        i2 += b;
                        while (i2 >= 8) {
                            i2 -= 8;
                            sink.Oooo000((int) (j2 >> i2));
                        }
                    }
                    if (i2 > 0) {
                        sink.Oooo000((int) ((255 >>> i2) | (j2 << (8 - i2))));
                    }
                    ByteString byteStringOooOoo = sink.OooOoo();
                    OooO0o(byteStringOooOoo.OooO0o0(), 127, 128);
                    this.f51583OooO.OoooOOO(byteStringOooOoo);
                    return;
                }
            }
            OooO0o(source.OooO0o0(), 127, 0);
            this.f51583OooO.OoooOOO(source);
        }

        public final void OooO0o(int i, int i2, int i3) {
            if (i < i2) {
                this.f51583OooO.Ooooo0o(i | i3);
                return;
            }
            this.f51583OooO.Ooooo0o(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f51583OooO.Ooooo0o(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f51583OooO.Ooooo0o(i4);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0072  */
        public final void OooO0o0(@NotNull List<o00> headerBlock) throws IOException {
            int length;
            int length2;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f51585OooO0O0) {
                int i = this.f51584OooO00o;
                if (i < this.f51586OooO0OO) {
                    OooO0o(i, 31, 32);
                }
                this.f51585OooO0O0 = false;
                this.f51584OooO00o = Integer.MAX_VALUE;
                OooO0o(this.f51586OooO0OO, 31, 32);
            }
            int size = headerBlock.size();
            for (int i2 = 0; i2 < size; i2++) {
                o00 o00Var = headerBlock.get(i2);
                ByteString byteStringOooOO0o = o00Var.f51557OooO0O0.OooOO0o();
                ByteString byteString = o00Var.f51558OooO0OO;
                o00O0000 o00o0001 = o00O0000.f51574OooO0OO;
                Integer num = o00O0000.f51573OooO0O0.get(byteStringOooOO0o);
                if (num != null) {
                    length = num.intValue() + 1;
                    if (2 <= length && 7 >= length) {
                        o00[] o00VarArr = o00O0000.f51572OooO00o;
                        if (Intrinsics.areEqual(o00VarArr[length - 1].f51558OooO0OO, byteString)) {
                            length2 = length;
                        } else if (Intrinsics.areEqual(o00VarArr[length].f51558OooO0OO, byteString)) {
                            length2 = length;
                            length++;
                        } else {
                            length2 = length;
                            length = -1;
                        }
                    } else {
                        length2 = length;
                        length = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length == -1) {
                    int length3 = this.f51587OooO0Oo.length;
                    for (int i3 = this.f51589OooO0o0 + 1; i3 < length3; i3++) {
                        o00 o00Var2 = this.f51587OooO0Oo[i3];
                        Intrinsics.checkNotNull(o00Var2);
                        if (Intrinsics.areEqual(o00Var2.f51557OooO0O0, byteStringOooOO0o)) {
                            o00 o00Var3 = this.f51587OooO0Oo[i3];
                            Intrinsics.checkNotNull(o00Var3);
                            if (Intrinsics.areEqual(o00Var3.f51558OooO0OO, byteString)) {
                                int i4 = i3 - this.f51589OooO0o0;
                                o00O0000 o00o0002 = o00O0000.f51574OooO0OO;
                                length = o00O0000.f51572OooO00o.length + i4;
                                break;
                            } else if (length2 == -1) {
                                int i5 = i3 - this.f51589OooO0o0;
                                o00O0000 o00o0003 = o00O0000.f51574OooO0OO;
                                length2 = i5 + o00O0000.f51572OooO00o.length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    OooO0o(length, 127, 128);
                } else if (length2 == -1) {
                    this.f51583OooO.Ooooo0o(64);
                    OooO0Oo(byteStringOooOO0o);
                    OooO0Oo(byteString);
                    OooO0OO(o00Var);
                } else {
                    ByteString prefix = o00.f51551OooO0Oo;
                    Objects.requireNonNull(byteStringOooOO0o);
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (byteStringOooOO0o.OooOO0O(prefix, prefix.data.length) && (!Intrinsics.areEqual(o00.f51550OooO, byteStringOooOO0o))) {
                        OooO0o(length2, 15, 0);
                        OooO0Oo(byteString);
                    } else {
                        OooO0o(length2, 63, 64);
                        OooO0Oo(byteString);
                        OooO0OO(o00Var);
                    }
                }
            }
        }
    }

    static {
        o00 o00Var = new o00(o00.f51550OooO, "");
        ByteString byteString = o00.f51552OooO0o;
        ByteString byteString2 = o00.f51554OooO0oO;
        ByteString byteString3 = o00.f51555OooO0oo;
        ByteString byteString4 = o00.f51553OooO0o0;
        o00[] o00VarArr = {o00Var, new o00(byteString, Request.HttpMethodGet), new o00(byteString, Request.HttpMethodPOST), new o00(byteString2, "/"), new o00(byteString2, "/index.html"), new o00(byteString3, "http"), new o00(byteString3, "https"), new o00(byteString4, "200"), new o00(byteString4, "204"), new o00(byteString4, "206"), new o00(byteString4, "304"), new o00(byteString4, "400"), new o00(byteString4, "404"), new o00(byteString4, "500"), new o00("accept-charset", ""), new o00("accept-encoding", "gzip, deflate"), new o00("accept-language", ""), new o00("accept-ranges", ""), new o00("accept", ""), new o00("access-control-allow-origin", ""), new o00("age", ""), new o00("allow", ""), new o00("authorization", ""), new o00("cache-control", ""), new o00("content-disposition", ""), new o00("content-encoding", ""), new o00("content-language", ""), new o00("content-length", ""), new o00("content-location", ""), new o00("content-range", ""), new o00("content-type", ""), new o00("cookie", ""), new o00("date", ""), new o00("etag", ""), new o00("expect", ""), new o00("expires", ""), new o00("from", ""), new o00(ReportItem.RequestKeyHost, ""), new o00("if-match", ""), new o00("if-modified-since", ""), new o00("if-none-match", ""), new o00("if-range", ""), new o00("if-unmodified-since", ""), new o00("last-modified", ""), new o00("link", ""), new o00("location", ""), new o00("max-forwards", ""), new o00("proxy-authenticate", ""), new o00("proxy-authorization", ""), new o00("range", ""), new o00("referer", ""), new o00("refresh", ""), new o00("retry-after", ""), new o00("server", ""), new o00("set-cookie", ""), new o00("strict-transport-security", ""), new o00("transfer-encoding", ""), new o00("user-agent", ""), new o00("vary", ""), new o00("via", ""), new o00("www-authenticate", "")};
        f51572OooO00o = o00VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00VarArr.length);
        int length = o00VarArr.length;
        for (int i = 0; i < length; i++) {
            o00[] o00VarArr2 = f51572OooO00o;
            if (!linkedHashMap.containsKey(o00VarArr2[i].f51557OooO0O0)) {
                linkedHashMap.put(o00VarArr2[i].f51557OooO0O0, Integer.valueOf(i));
            }
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        f51573OooO0O0 = mapUnmodifiableMap;
    }

    @NotNull
    public final ByteString OooO00o(@NotNull ByteString name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int iOooO0o0 = name.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte bOooO0oo = name.OooO0oo(i);
            if (b <= bOooO0oo && b2 >= bOooO0oo) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PROTOCOL_ERROR response malformed: mixed case name: ");
                sbOooO0o0.append(name.OooOOO());
                throw new IOException(sbOooO0o0.toString());
            }
        }
        return name;
    }
}
