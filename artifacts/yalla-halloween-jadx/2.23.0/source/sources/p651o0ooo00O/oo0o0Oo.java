package p651o0ooo00O;

import com.qiniu.android.collect.ReportItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes5.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OO00O[] f59999OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Map<ByteString, Integer> f60000OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f60001OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f60002OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList f60003OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o00O0000 f60004OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f60005OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @JvmField
        @NotNull
        public o0OO00O[] f60006OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @JvmField
        public int f60007OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @JvmField
        public int f60008OooO0oo;

        public OooO00o(o0000O0.OooO0O0 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f60001OooO00o = 4096;
            this.f60002OooO0O0 = 4096;
            this.f60003OooO0OO = new ArrayList();
            this.f60004OooO0Oo = o000O0Oo.OooO0O0(source);
            this.f60006OooO0o0 = new o0OO00O[8];
            this.f60005OooO0o = 7;
        }

        public final int OooO00o(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f60006OooO0o0.length;
                while (true) {
                    length--;
                    i2 = this.f60005OooO0o;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    o0OO00O o0oo00o2 = this.f60006OooO0o0[length];
                    Intrinsics.checkNotNull(o0oo00o2);
                    int i4 = o0oo00o2.f59998OooO0OO;
                    i -= i4;
                    this.f60008OooO0oo -= i4;
                    this.f60007OooO0oO--;
                    i3++;
                }
                o0OO00O[] o0oo00oArr = this.f60006OooO0o0;
                System.arraycopy(o0oo00oArr, i2 + 1, o0oo00oArr, i2 + 1 + i3, this.f60007OooO0oO);
                this.f60005OooO0o += i3;
            }
            return i3;
        }

        public final ByteString OooO0O0(int i) throws IOException {
            if (i >= 0 && i <= oo0o0Oo.f59999OooO00o.length - 1) {
                return oo0o0Oo.f59999OooO00o[i].f59996OooO00o;
            }
            int length = this.f60005OooO0o + 1 + (i - oo0o0Oo.f59999OooO00o.length);
            if (length >= 0) {
                o0OO00O[] o0oo00oArr = this.f60006OooO0o0;
                if (length < o0oo00oArr.length) {
                    o0OO00O o0oo00o2 = o0oo00oArr[length];
                    Intrinsics.checkNotNull(o0oo00o2);
                    return o0oo00o2.f59996OooO00o;
                }
            }
            throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(i + 1)));
        }

        public final void OooO0OO(o0OO00O o0oo00o2) {
            this.f60003OooO0OO.add(o0oo00o2);
            int i = this.f60002OooO0O0;
            int i2 = o0oo00o2.f59998OooO0OO;
            if (i2 > i) {
                ArraysKt___ArraysJvmKt.fill$default(this.f60006OooO0o0, (Object) null, 0, 0, 6, (Object) null);
                this.f60005OooO0o = this.f60006OooO0o0.length - 1;
                this.f60007OooO0oO = 0;
                this.f60008OooO0oo = 0;
                return;
            }
            OooO00o((this.f60008OooO0oo + i2) - i);
            int i3 = this.f60007OooO0oO + 1;
            o0OO00O[] o0oo00oArr = this.f60006OooO0o0;
            if (i3 > o0oo00oArr.length) {
                o0OO00O[] o0oo00oArr2 = new o0OO00O[o0oo00oArr.length * 2];
                System.arraycopy(o0oo00oArr, 0, o0oo00oArr2, o0oo00oArr.length, o0oo00oArr.length);
                this.f60005OooO0o = this.f60006OooO0o0.length - 1;
                this.f60006OooO0o0 = o0oo00oArr2;
            }
            int i4 = this.f60005OooO0o;
            this.f60005OooO0o = i4 - 1;
            this.f60006OooO0o0[i4] = o0oo00o2;
            this.f60007OooO0oO++;
            this.f60008OooO0oo += i2;
        }

        @NotNull
        public final ByteString OooO0Oo() throws IOException {
            int i;
            o00O0000 source = this.f60004OooO0Oo;
            byte b = source.readByte();
            byte[] bArr = o0O000o0.f57386OooO00o;
            int i2 = b & UByte.MAX_VALUE;
            int i3 = 0;
            boolean z = (i2 & 128) == 128;
            long jOooO0o0 = OooO0o0(i2, 127);
            if (!z) {
                return source.Oooooo0(jOooO0o0);
            }
            o00000O sink = new o00000O();
            int[] iArr = o0000O.f59875OooO00o;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            o0000O.OooO00o oooO00o = o0000O.f59877OooO0OO;
            long j = 0;
            o0000O.OooO00o oooO00o2 = oooO00o;
            int i4 = 0;
            while (j < jOooO0o0) {
                j++;
                byte b2 = source.readByte();
                byte[] bArr2 = o0O000o0.f57386OooO00o;
                i3 = (i3 << 8) | (b2 & UByte.MAX_VALUE);
                i4 += 8;
                while (i4 >= 8) {
                    int i5 = i4 - 8;
                    o0000O.OooO00o[] oooO00oArr = oooO00o2.f59878OooO00o;
                    Intrinsics.checkNotNull(oooO00oArr);
                    oooO00o2 = oooO00oArr[(i3 >>> i5) & 255];
                    Intrinsics.checkNotNull(oooO00o2);
                    if (oooO00o2.f59878OooO00o == null) {
                        sink.o00O0O(oooO00o2.f59879OooO0O0);
                        i4 -= oooO00o2.f59880OooO0OO;
                        oooO00o2 = oooO00o;
                    } else {
                        i4 = i5;
                    }
                }
            }
            while (i4 > 0) {
                o0000O.OooO00o[] oooO00oArr2 = oooO00o2.f59878OooO00o;
                Intrinsics.checkNotNull(oooO00oArr2);
                o0000O.OooO00o oooO00o3 = oooO00oArr2[(i3 << (8 - i4)) & 255];
                Intrinsics.checkNotNull(oooO00o3);
                if (oooO00o3.f59878OooO00o != null || (i = oooO00o3.f59880OooO0OO) > i4) {
                    break;
                }
                sink.o00O0O(oooO00o3.f59879OooO0O0);
                i4 -= i;
                oooO00o2 = oooO00o;
            }
            return sink.Oooo0o0();
        }

        public final int OooO0o0(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.f60004OooO0Oo.readByte();
                byte[] bArr = o0O000o0.f57386OooO00o;
                int i5 = b & UByte.MAX_VALUE;
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @JvmField
        public int f60009OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f60010OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o00000O f60011OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f60012OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f60013OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @JvmField
        @NotNull
        public o0OO00O[] f60014OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @JvmField
        public int f60015OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f60016OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @JvmField
        public int f60017OooO0oo;

        public OooO0O0(o00000O out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f60010OooO00o = true;
            this.f60011OooO0O0 = out;
            this.f60012OooO0OO = Integer.MAX_VALUE;
            this.f60015OooO0o0 = 4096;
            this.f60014OooO0o = new o0OO00O[8];
            this.f60016OooO0oO = 7;
        }

        public final void OooO00o(int i) {
            int i2;
            if (i > 0) {
                int length = this.f60014OooO0o.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f60016OooO0oO;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    o0OO00O o0oo00o2 = this.f60014OooO0o[length];
                    Intrinsics.checkNotNull(o0oo00o2);
                    i -= o0oo00o2.f59998OooO0OO;
                    int i4 = this.f60009OooO;
                    o0OO00O o0oo00o3 = this.f60014OooO0o[length];
                    Intrinsics.checkNotNull(o0oo00o3);
                    this.f60009OooO = i4 - o0oo00o3.f59998OooO0OO;
                    this.f60017OooO0oo--;
                    i3++;
                    length--;
                }
                o0OO00O[] o0oo00oArr = this.f60014OooO0o;
                int i5 = i2 + 1;
                System.arraycopy(o0oo00oArr, i5, o0oo00oArr, i5 + i3, this.f60017OooO0oo);
                o0OO00O[] o0oo00oArr2 = this.f60014OooO0o;
                int i6 = this.f60016OooO0oO + 1;
                Arrays.fill(o0oo00oArr2, i6, i6 + i3, (Object) null);
                this.f60016OooO0oO += i3;
            }
        }

        public final void OooO0O0(o0OO00O o0oo00o2) {
            int i = this.f60015OooO0o0;
            int i2 = o0oo00o2.f59998OooO0OO;
            if (i2 > i) {
                ArraysKt___ArraysJvmKt.fill$default(this.f60014OooO0o, (Object) null, 0, 0, 6, (Object) null);
                this.f60016OooO0oO = this.f60014OooO0o.length - 1;
                this.f60017OooO0oo = 0;
                this.f60009OooO = 0;
                return;
            }
            OooO00o((this.f60009OooO + i2) - i);
            int i3 = this.f60017OooO0oo + 1;
            o0OO00O[] o0oo00oArr = this.f60014OooO0o;
            if (i3 > o0oo00oArr.length) {
                o0OO00O[] o0oo00oArr2 = new o0OO00O[o0oo00oArr.length * 2];
                System.arraycopy(o0oo00oArr, 0, o0oo00oArr2, o0oo00oArr.length, o0oo00oArr.length);
                this.f60016OooO0oO = this.f60014OooO0o.length - 1;
                this.f60014OooO0o = o0oo00oArr2;
            }
            int i4 = this.f60016OooO0oO;
            this.f60016OooO0oO = i4 - 1;
            this.f60014OooO0o[i4] = o0oo00o2;
            this.f60017OooO0oo++;
            this.f60009OooO += i2;
        }

        public final void OooO0OO(@NotNull ByteString source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "data");
            boolean z = this.f60010OooO00o;
            o00000O o00000o = this.f60011OooO0O0;
            int i = 0;
            if (z) {
                int[] iArr = o0000O.f59875OooO00o;
                Intrinsics.checkNotNullParameter(source, "bytes");
                int iOooO0o0 = source.OooO0o0();
                int i2 = 0;
                long j = 0;
                while (i2 < iOooO0o0) {
                    int i3 = i2 + 1;
                    byte bOooOO0 = source.OooOO0(i2);
                    byte[] bArr = o0O000o0.f57386OooO00o;
                    j += (long) o0000O.f59876OooO0O0[bOooOO0 & UByte.MAX_VALUE];
                    i2 = i3;
                }
                if (((int) ((j + ((long) 7)) >> 3)) < source.OooO0o0()) {
                    o00000O sink = new o00000O();
                    int[] iArr2 = o0000O.f59875OooO00o;
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    int iOooO0o1 = source.OooO0o0();
                    long j2 = 0;
                    int i4 = 0;
                    while (i < iOooO0o1) {
                        int i5 = i + 1;
                        byte bOooOO1 = source.OooOO0(i);
                        byte[] bArr2 = o0O000o0.f57386OooO00o;
                        int i6 = bOooOO1 & UByte.MAX_VALUE;
                        int i7 = o0000O.f59875OooO00o[i6];
                        byte b = o0000O.f59876OooO0O0[i6];
                        j2 = (j2 << b) | ((long) i7);
                        i4 += b;
                        while (i4 >= 8) {
                            i4 -= 8;
                            sink.o00O0O((int) (j2 >> i4));
                        }
                        i = i5;
                    }
                    if (i4 > 0) {
                        sink.o00O0O((int) ((255 >>> i4) | (j2 << (8 - i4))));
                    }
                    ByteString byteStringOooo0o0 = sink.Oooo0o0();
                    OooO0o0(byteStringOooo0o0.OooO0o0(), 127, 128);
                    o00000o.OoooooO(byteStringOooo0o0);
                    return;
                }
            }
            OooO0o0(source.OooO0o0(), 127, 0);
            o00000o.OoooooO(source);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        /* JADX WARN: Code duplicated, block: B:29:0x0079  */
        /* JADX WARN: Code duplicated, block: B:31:0x0081  */
        /* JADX WARN: Code duplicated, block: B:33:0x0092  */
        /* JADX WARN: Code duplicated, block: B:36:0x00aa A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:57:0x00a1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x00b3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x00b3 A[SYNTHETIC] */
        public final void OooO0Oo(@NotNull ArrayList headerBlock) throws IOException {
            int length;
            int length2;
            ByteString prefix;
            int i;
            int length3;
            o0OO00O o0oo00o2;
            o0OO00O o0oo00o3;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f60013OooO0Oo) {
                int i2 = this.f60012OooO0OO;
                if (i2 < this.f60015OooO0o0) {
                    OooO0o0(i2, 31, 32);
                }
                this.f60013OooO0Oo = false;
                this.f60012OooO0OO = Integer.MAX_VALUE;
                OooO0o0(this.f60015OooO0o0, 31, 32);
            }
            int size = headerBlock.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                o0OO00O o0oo00o4 = (o0OO00O) headerBlock.get(i3);
                ByteString byteStringOooOOo = o0oo00o4.f59996OooO00o.OooOOo();
                Integer num = oo0o0Oo.f60000OooO0O0.get(byteStringOooOOo);
                ByteString byteString = o0oo00o4.f59997OooO0O0;
                if (num != null) {
                    length = num.intValue() + 1;
                    if (2 <= length && length < 8) {
                        o0OO00O[] o0oo00oArr = oo0o0Oo.f59999OooO00o;
                        if (!Intrinsics.areEqual(o0oo00oArr[length - 1].f59997OooO0O0, byteString)) {
                            if (Intrinsics.areEqual(o0oo00oArr[length].f59997OooO0O0, byteString)) {
                                length2 = length + 1;
                            } else {
                                length2 = -1;
                            }
                        }
                    } else {
                        length2 = -1;
                    }
                    if (length2 == -1) {
                        i = this.f60016OooO0oO + 1;
                        length3 = this.f60014OooO0o.length;
                        while (i < length3) {
                            int i5 = i + 1;
                            o0oo00o2 = this.f60014OooO0o[i];
                            Intrinsics.checkNotNull(o0oo00o2);
                            if (Intrinsics.areEqual(o0oo00o2.f59996OooO00o, byteStringOooOOo)) {
                                o0oo00o3 = this.f60014OooO0o[i];
                                Intrinsics.checkNotNull(o0oo00o3);
                                if (Intrinsics.areEqual(o0oo00o3.f59997OooO0O0, byteString)) {
                                    length2 = oo0o0Oo.f59999OooO00o.length + (i - this.f60016OooO0oO);
                                    break;
                                } else if (length == -1) {
                                    length = oo0o0Oo.f59999OooO00o.length + (i - this.f60016OooO0oO);
                                }
                            }
                            i = i5;
                        }
                    }
                    if (length2 != -1) {
                        OooO0o0(length2, 127, 128);
                    } else if (length == -1) {
                        this.f60011OooO0O0.o00O0O(64);
                        OooO0OO(byteStringOooOOo);
                        OooO0OO(byteString);
                        OooO0O0(o0oo00o4);
                    } else {
                        prefix = o0OO00O.f59991OooO0Oo;
                        byteStringOooOOo.getClass();
                        Intrinsics.checkNotNullParameter(prefix, "prefix");
                        if (byteStringOooOOo.OooOOO(0, prefix, prefix.OooO0o0()) || Intrinsics.areEqual(o0OO00O.f59990OooO, byteStringOooOOo)) {
                            OooO0o0(length, 63, 64);
                            OooO0OO(byteString);
                            OooO0O0(o0oo00o4);
                        } else {
                            OooO0o0(length, 15, 0);
                            OooO0OO(byteString);
                        }
                    }
                    i3 = i4;
                } else {
                    length = -1;
                }
                length2 = length;
                if (length2 == -1) {
                    i = this.f60016OooO0oO + 1;
                    length3 = this.f60014OooO0o.length;
                    while (i < length3) {
                        int i6 = i + 1;
                        o0oo00o2 = this.f60014OooO0o[i];
                        Intrinsics.checkNotNull(o0oo00o2);
                        if (Intrinsics.areEqual(o0oo00o2.f59996OooO00o, byteStringOooOOo)) {
                            o0oo00o3 = this.f60014OooO0o[i];
                            Intrinsics.checkNotNull(o0oo00o3);
                            if (Intrinsics.areEqual(o0oo00o3.f59997OooO0O0, byteString)) {
                                length2 = oo0o0Oo.f59999OooO00o.length + (i - this.f60016OooO0oO);
                                break;
                            } else if (length == -1) {
                                length = oo0o0Oo.f59999OooO00o.length + (i - this.f60016OooO0oO);
                            }
                        }
                        i = i6;
                    }
                }
                if (length2 != -1) {
                    OooO0o0(length2, 127, 128);
                } else if (length == -1) {
                    this.f60011OooO0O0.o00O0O(64);
                    OooO0OO(byteStringOooOOo);
                    OooO0OO(byteString);
                    OooO0O0(o0oo00o4);
                } else {
                    prefix = o0OO00O.f59991OooO0Oo;
                    byteStringOooOOo.getClass();
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (byteStringOooOOo.OooOOO(0, prefix, prefix.OooO0o0())) {
                        OooO0o0(length, 63, 64);
                        OooO0OO(byteString);
                        OooO0O0(o0oo00o4);
                    } else {
                        OooO0o0(length, 63, 64);
                        OooO0OO(byteString);
                        OooO0O0(o0oo00o4);
                    }
                }
                i3 = i4;
            }
        }

        public final void OooO0o0(int i, int i2, int i3) {
            o00000O o00000o = this.f60011OooO0O0;
            if (i < i2) {
                o00000o.o00O0O(i | i3);
                return;
            }
            o00000o.o00O0O(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                o00000o.o00O0O(128 | (i4 & 127));
                i4 >>>= 7;
            }
            o00000o.o00O0O(i4);
        }
    }

    static {
        o0OO00O o0oo00o2 = new o0OO00O("", o0OO00O.f59990OooO);
        int i = 0;
        ByteString byteString = o0OO00O.f59992OooO0o;
        ByteString byteString2 = o0OO00O.f59994OooO0oO;
        ByteString byteString3 = o0OO00O.f59995OooO0oo;
        ByteString byteString4 = o0OO00O.f59993OooO0o0;
        o0OO00O[] o0oo00oArr = {o0oo00o2, new o0OO00O("GET", byteString), new o0OO00O("POST", byteString), new o0OO00O("/", byteString2), new o0OO00O("/index.html", byteString2), new o0OO00O("http", byteString3), new o0OO00O("https", byteString3), new o0OO00O("200", byteString4), new o0OO00O("204", byteString4), new o0OO00O("206", byteString4), new o0OO00O("304", byteString4), new o0OO00O("400", byteString4), new o0OO00O("404", byteString4), new o0OO00O("500", byteString4), new o0OO00O("accept-charset", ""), new o0OO00O("accept-encoding", "gzip, deflate"), new o0OO00O("accept-language", ""), new o0OO00O("accept-ranges", ""), new o0OO00O("accept", ""), new o0OO00O("access-control-allow-origin", ""), new o0OO00O("age", ""), new o0OO00O("allow", ""), new o0OO00O("authorization", ""), new o0OO00O("cache-control", ""), new o0OO00O("content-disposition", ""), new o0OO00O("content-encoding", ""), new o0OO00O("content-language", ""), new o0OO00O("content-length", ""), new o0OO00O("content-location", ""), new o0OO00O("content-range", ""), new o0OO00O("content-type", ""), new o0OO00O("cookie", ""), new o0OO00O("date", ""), new o0OO00O("etag", ""), new o0OO00O("expect", ""), new o0OO00O("expires", ""), new o0OO00O("from", ""), new o0OO00O(ReportItem.RequestKeyHost, ""), new o0OO00O("if-match", ""), new o0OO00O("if-modified-since", ""), new o0OO00O("if-none-match", ""), new o0OO00O("if-range", ""), new o0OO00O("if-unmodified-since", ""), new o0OO00O("last-modified", ""), new o0OO00O("link", ""), new o0OO00O("location", ""), new o0OO00O("max-forwards", ""), new o0OO00O("proxy-authenticate", ""), new o0OO00O("proxy-authorization", ""), new o0OO00O("range", ""), new o0OO00O("referer", ""), new o0OO00O("refresh", ""), new o0OO00O("retry-after", ""), new o0OO00O("server", ""), new o0OO00O("set-cookie", ""), new o0OO00O("strict-transport-security", ""), new o0OO00O("transfer-encoding", ""), new o0OO00O("user-agent", ""), new o0OO00O("vary", ""), new o0OO00O("via", ""), new o0OO00O("www-authenticate", "")};
        f59999OooO00o = o0oo00oArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i < 61) {
            int i2 = i + 1;
            if (!linkedHashMap.containsKey(o0oo00oArr[i].f59996OooO00o)) {
                linkedHashMap.put(o0oo00oArr[i].f59996OooO00o, Integer.valueOf(i));
            }
            i = i2;
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        f60000OooO0O0 = mapUnmodifiableMap;
    }

    @NotNull
    public static void OooO00o(@NotNull ByteString name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int iOooO0o0 = name.OooO0o0();
        int i = 0;
        while (i < iOooO0o0) {
            int i2 = i + 1;
            byte bOooOO0 = name.OooOO0(i);
            if (65 <= bOooOO0 && bOooOO0 <= 90) {
                throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR response malformed: mixed case name: ", name.OooOo00()));
            }
            i = i2;
        }
    }
}
