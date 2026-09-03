package p655o0ooo0O;

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
import p648o0ooOoo.oO000o00;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOO0OO[] f59426OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Map<ByteString, Integer> f59427OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f59428OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f59429OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList f59430OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0o0000 f59431OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f59432OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @JvmField
        @NotNull
        public o0OOO0OO[] f59433OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @JvmField
        public int f59434OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @JvmField
        public int f59435OooO0oo;

        public OooO00o(oO000.OooO0O0 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f59428OooO00o = 4096;
            this.f59429OooO0O0 = 4096;
            this.f59430OooO0OO = new ArrayList();
            this.f59431OooO0Oo = o0OO.OooO0O0(source);
            this.f59433OooO0o0 = new o0OOO0OO[8];
            this.f59432OooO0o = 7;
        }

        public final int OooO00o(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f59433OooO0o0.length;
                while (true) {
                    length--;
                    i2 = this.f59432OooO0o;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    o0OOO0OO o0ooo0oo2 = this.f59433OooO0o0[length];
                    Intrinsics.checkNotNull(o0ooo0oo2);
                    int i4 = o0ooo0oo2.f59425OooO0OO;
                    i -= i4;
                    this.f59435OooO0oo -= i4;
                    this.f59434OooO0oO--;
                    i3++;
                }
                o0OOO0OO[] o0ooo0ooArr = this.f59433OooO0o0;
                System.arraycopy(o0ooo0ooArr, i2 + 1, o0ooo0ooArr, i2 + 1 + i3, this.f59434OooO0oO);
                this.f59432OooO0o += i3;
            }
            return i3;
        }

        public final ByteString OooO0O0(int i) throws IOException {
            if (i >= 0 && i <= o0OOOO00.f59426OooO00o.length - 1) {
                return o0OOOO00.f59426OooO00o[i].f59423OooO00o;
            }
            int length = this.f59432OooO0o + 1 + (i - o0OOOO00.f59426OooO00o.length);
            if (length >= 0) {
                o0OOO0OO[] o0ooo0ooArr = this.f59433OooO0o0;
                if (length < o0ooo0ooArr.length) {
                    o0OOO0OO o0ooo0oo2 = o0ooo0ooArr[length];
                    Intrinsics.checkNotNull(o0ooo0oo2);
                    return o0ooo0oo2.f59423OooO00o;
                }
            }
            throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(i + 1)));
        }

        public final void OooO0OO(o0OOO0OO o0ooo0oo2) {
            this.f59430OooO0OO.add(o0ooo0oo2);
            int i = this.f59429OooO0O0;
            int i2 = o0ooo0oo2.f59425OooO0OO;
            if (i2 > i) {
                ArraysKt___ArraysJvmKt.fill$default(this.f59433OooO0o0, (Object) null, 0, 0, 6, (Object) null);
                this.f59432OooO0o = this.f59433OooO0o0.length - 1;
                this.f59434OooO0oO = 0;
                this.f59435OooO0oo = 0;
                return;
            }
            OooO00o((this.f59435OooO0oo + i2) - i);
            int i3 = this.f59434OooO0oO + 1;
            o0OOO0OO[] o0ooo0ooArr = this.f59433OooO0o0;
            if (i3 > o0ooo0ooArr.length) {
                o0OOO0OO[] o0ooo0ooArr2 = new o0OOO0OO[o0ooo0ooArr.length * 2];
                System.arraycopy(o0ooo0ooArr, 0, o0ooo0ooArr2, o0ooo0ooArr.length, o0ooo0ooArr.length);
                this.f59432OooO0o = this.f59433OooO0o0.length - 1;
                this.f59433OooO0o0 = o0ooo0ooArr2;
            }
            int i4 = this.f59432OooO0o;
            this.f59432OooO0o = i4 - 1;
            this.f59433OooO0o0[i4] = o0ooo0oo2;
            this.f59434OooO0oO++;
            this.f59435OooO0oo += i2;
        }

        @NotNull
        public final ByteString OooO0Oo() throws IOException {
            int i;
            o0o0000 source = this.f59431OooO0Oo;
            byte b = source.readByte();
            byte[] bArr = oO000o00.f58124OooO00o;
            int i2 = b & UByte.MAX_VALUE;
            int i3 = 0;
            boolean z = (i2 & 128) == 128;
            long jOooO0o0 = OooO0o0(i2, 127);
            if (!z) {
                return source.Oooooo0(jOooO0o0);
            }
            oo0OOoo sink = new oo0OOoo();
            int[] iArr = oO0Ooooo.f59569OooO00o;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            oO0Ooooo.OooO00o oooO00o = oO0Ooooo.f59571OooO0OO;
            long j = 0;
            oO0Ooooo.OooO00o oooO00o2 = oooO00o;
            int i4 = 0;
            while (j < jOooO0o0) {
                j++;
                byte b2 = source.readByte();
                byte[] bArr2 = oO000o00.f58124OooO00o;
                i3 = (i3 << 8) | (b2 & UByte.MAX_VALUE);
                i4 += 8;
                while (i4 >= 8) {
                    int i5 = i4 - 8;
                    oO0Ooooo.OooO00o[] oooO00oArr = oooO00o2.f59572OooO00o;
                    Intrinsics.checkNotNull(oooO00oArr);
                    oooO00o2 = oooO00oArr[(i3 >>> i5) & 255];
                    Intrinsics.checkNotNull(oooO00o2);
                    if (oooO00o2.f59572OooO00o == null) {
                        sink.o00o0O(oooO00o2.f59573OooO0O0);
                        i4 -= oooO00o2.f59574OooO0OO;
                        oooO00o2 = oooO00o;
                    } else {
                        i4 = i5;
                    }
                }
            }
            while (i4 > 0) {
                oO0Ooooo.OooO00o[] oooO00oArr2 = oooO00o2.f59572OooO00o;
                Intrinsics.checkNotNull(oooO00oArr2);
                oO0Ooooo.OooO00o oooO00o3 = oooO00oArr2[(i3 << (8 - i4)) & 255];
                Intrinsics.checkNotNull(oooO00o3);
                if (oooO00o3.f59572OooO00o != null || (i = oooO00o3.f59574OooO0OO) > i4) {
                    break;
                }
                sink.o00o0O(oooO00o3.f59573OooO0O0);
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
                byte b = this.f59431OooO0Oo.readByte();
                byte[] bArr = oO000o00.f58124OooO00o;
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
        public int f59436OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f59437OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final oo0OOoo f59438OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f59439OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f59440OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @JvmField
        @NotNull
        public o0OOO0OO[] f59441OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @JvmField
        public int f59442OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f59443OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @JvmField
        public int f59444OooO0oo;

        public OooO0O0(oo0OOoo out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f59437OooO00o = true;
            this.f59438OooO0O0 = out;
            this.f59439OooO0OO = Integer.MAX_VALUE;
            this.f59442OooO0o0 = 4096;
            this.f59441OooO0o = new o0OOO0OO[8];
            this.f59443OooO0oO = 7;
        }

        public final void OooO00o(int i) {
            int i2;
            if (i > 0) {
                int length = this.f59441OooO0o.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f59443OooO0oO;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    o0OOO0OO o0ooo0oo2 = this.f59441OooO0o[length];
                    Intrinsics.checkNotNull(o0ooo0oo2);
                    i -= o0ooo0oo2.f59425OooO0OO;
                    int i4 = this.f59436OooO;
                    o0OOO0OO o0ooo0oo3 = this.f59441OooO0o[length];
                    Intrinsics.checkNotNull(o0ooo0oo3);
                    this.f59436OooO = i4 - o0ooo0oo3.f59425OooO0OO;
                    this.f59444OooO0oo--;
                    i3++;
                    length--;
                }
                o0OOO0OO[] o0ooo0ooArr = this.f59441OooO0o;
                int i5 = i2 + 1;
                System.arraycopy(o0ooo0ooArr, i5, o0ooo0ooArr, i5 + i3, this.f59444OooO0oo);
                o0OOO0OO[] o0ooo0ooArr2 = this.f59441OooO0o;
                int i6 = this.f59443OooO0oO + 1;
                Arrays.fill(o0ooo0ooArr2, i6, i6 + i3, (Object) null);
                this.f59443OooO0oO += i3;
            }
        }

        public final void OooO0O0(o0OOO0OO o0ooo0oo2) {
            int i = this.f59442OooO0o0;
            int i2 = o0ooo0oo2.f59425OooO0OO;
            if (i2 > i) {
                ArraysKt___ArraysJvmKt.fill$default(this.f59441OooO0o, (Object) null, 0, 0, 6, (Object) null);
                this.f59443OooO0oO = this.f59441OooO0o.length - 1;
                this.f59444OooO0oo = 0;
                this.f59436OooO = 0;
                return;
            }
            OooO00o((this.f59436OooO + i2) - i);
            int i3 = this.f59444OooO0oo + 1;
            o0OOO0OO[] o0ooo0ooArr = this.f59441OooO0o;
            if (i3 > o0ooo0ooArr.length) {
                o0OOO0OO[] o0ooo0ooArr2 = new o0OOO0OO[o0ooo0ooArr.length * 2];
                System.arraycopy(o0ooo0ooArr, 0, o0ooo0ooArr2, o0ooo0ooArr.length, o0ooo0ooArr.length);
                this.f59443OooO0oO = this.f59441OooO0o.length - 1;
                this.f59441OooO0o = o0ooo0ooArr2;
            }
            int i4 = this.f59443OooO0oO;
            this.f59443OooO0oO = i4 - 1;
            this.f59441OooO0o[i4] = o0ooo0oo2;
            this.f59444OooO0oo++;
            this.f59436OooO += i2;
        }

        public final void OooO0OO(@NotNull ByteString source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "data");
            boolean z = this.f59437OooO00o;
            oo0OOoo oo0oooo = this.f59438OooO0O0;
            int i = 0;
            if (z) {
                int[] iArr = oO0Ooooo.f59569OooO00o;
                Intrinsics.checkNotNullParameter(source, "bytes");
                int iOooO0o0 = source.OooO0o0();
                int i2 = 0;
                long j = 0;
                while (i2 < iOooO0o0) {
                    int i3 = i2 + 1;
                    byte bOooOO0 = source.OooOO0(i2);
                    byte[] bArr = oO000o00.f58124OooO00o;
                    j += (long) oO0Ooooo.f59570OooO0O0[bOooOO0 & UByte.MAX_VALUE];
                    i2 = i3;
                }
                if (((int) ((j + ((long) 7)) >> 3)) < source.OooO0o0()) {
                    oo0OOoo sink = new oo0OOoo();
                    int[] iArr2 = oO0Ooooo.f59569OooO00o;
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    int iOooO0o1 = source.OooO0o0();
                    long j2 = 0;
                    int i4 = 0;
                    while (i < iOooO0o1) {
                        int i5 = i + 1;
                        byte bOooOO1 = source.OooOO0(i);
                        byte[] bArr2 = oO000o00.f58124OooO00o;
                        int i6 = bOooOO1 & UByte.MAX_VALUE;
                        int i7 = oO0Ooooo.f59569OooO00o[i6];
                        byte b = oO0Ooooo.f59570OooO0O0[i6];
                        j2 = (j2 << b) | ((long) i7);
                        i4 += b;
                        while (i4 >= 8) {
                            i4 -= 8;
                            sink.o00o0O((int) (j2 >> i4));
                        }
                        i = i5;
                    }
                    if (i4 > 0) {
                        sink.o00o0O((int) ((255 >>> i4) | (j2 << (8 - i4))));
                    }
                    ByteString byteStringOooo0o0 = sink.Oooo0o0();
                    OooO0o0(byteStringOooo0o0.OooO0o0(), 127, 128);
                    oo0oooo.o00O0O(byteStringOooo0o0);
                    return;
                }
            }
            OooO0o0(source.OooO0o0(), 127, 0);
            oo0oooo.o00O0O(source);
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
            o0OOO0OO o0ooo0oo2;
            o0OOO0OO o0ooo0oo3;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f59440OooO0Oo) {
                int i2 = this.f59439OooO0OO;
                if (i2 < this.f59442OooO0o0) {
                    OooO0o0(i2, 31, 32);
                }
                this.f59440OooO0Oo = false;
                this.f59439OooO0OO = Integer.MAX_VALUE;
                OooO0o0(this.f59442OooO0o0, 31, 32);
            }
            int size = headerBlock.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                o0OOO0OO o0ooo0oo4 = (o0OOO0OO) headerBlock.get(i3);
                ByteString byteStringOooOOo = o0ooo0oo4.f59423OooO00o.OooOOo();
                Integer num = o0OOOO00.f59427OooO0O0.get(byteStringOooOOo);
                ByteString byteString = o0ooo0oo4.f59424OooO0O0;
                if (num != null) {
                    length = num.intValue() + 1;
                    if (2 <= length && length < 8) {
                        o0OOO0OO[] o0ooo0ooArr = o0OOOO00.f59426OooO00o;
                        if (!Intrinsics.areEqual(o0ooo0ooArr[length - 1].f59424OooO0O0, byteString)) {
                            if (Intrinsics.areEqual(o0ooo0ooArr[length].f59424OooO0O0, byteString)) {
                                length2 = length + 1;
                            } else {
                                length2 = -1;
                            }
                        }
                    } else {
                        length2 = -1;
                    }
                    if (length2 == -1) {
                        i = this.f59443OooO0oO + 1;
                        length3 = this.f59441OooO0o.length;
                        while (i < length3) {
                            int i5 = i + 1;
                            o0ooo0oo2 = this.f59441OooO0o[i];
                            Intrinsics.checkNotNull(o0ooo0oo2);
                            if (Intrinsics.areEqual(o0ooo0oo2.f59423OooO00o, byteStringOooOOo)) {
                                o0ooo0oo3 = this.f59441OooO0o[i];
                                Intrinsics.checkNotNull(o0ooo0oo3);
                                if (Intrinsics.areEqual(o0ooo0oo3.f59424OooO0O0, byteString)) {
                                    length2 = o0OOOO00.f59426OooO00o.length + (i - this.f59443OooO0oO);
                                    break;
                                } else if (length == -1) {
                                    length = o0OOOO00.f59426OooO00o.length + (i - this.f59443OooO0oO);
                                }
                            }
                            i = i5;
                        }
                    }
                    if (length2 != -1) {
                        OooO0o0(length2, 127, 128);
                    } else if (length == -1) {
                        this.f59438OooO0O0.o00o0O(64);
                        OooO0OO(byteStringOooOOo);
                        OooO0OO(byteString);
                        OooO0O0(o0ooo0oo4);
                    } else {
                        prefix = o0OOO0OO.f59418OooO0Oo;
                        byteStringOooOOo.getClass();
                        Intrinsics.checkNotNullParameter(prefix, "prefix");
                        if (byteStringOooOOo.OooOOO(0, prefix, prefix.OooO0o0()) || Intrinsics.areEqual(o0OOO0OO.f59417OooO, byteStringOooOOo)) {
                            OooO0o0(length, 63, 64);
                            OooO0OO(byteString);
                            OooO0O0(o0ooo0oo4);
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
                    i = this.f59443OooO0oO + 1;
                    length3 = this.f59441OooO0o.length;
                    while (i < length3) {
                        int i6 = i + 1;
                        o0ooo0oo2 = this.f59441OooO0o[i];
                        Intrinsics.checkNotNull(o0ooo0oo2);
                        if (Intrinsics.areEqual(o0ooo0oo2.f59423OooO00o, byteStringOooOOo)) {
                            o0ooo0oo3 = this.f59441OooO0o[i];
                            Intrinsics.checkNotNull(o0ooo0oo3);
                            if (Intrinsics.areEqual(o0ooo0oo3.f59424OooO0O0, byteString)) {
                                length2 = o0OOOO00.f59426OooO00o.length + (i - this.f59443OooO0oO);
                                break;
                            } else if (length == -1) {
                                length = o0OOOO00.f59426OooO00o.length + (i - this.f59443OooO0oO);
                            }
                        }
                        i = i6;
                    }
                }
                if (length2 != -1) {
                    OooO0o0(length2, 127, 128);
                } else if (length == -1) {
                    this.f59438OooO0O0.o00o0O(64);
                    OooO0OO(byteStringOooOOo);
                    OooO0OO(byteString);
                    OooO0O0(o0ooo0oo4);
                } else {
                    prefix = o0OOO0OO.f59418OooO0Oo;
                    byteStringOooOOo.getClass();
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (byteStringOooOOo.OooOOO(0, prefix, prefix.OooO0o0())) {
                        OooO0o0(length, 63, 64);
                        OooO0OO(byteString);
                        OooO0O0(o0ooo0oo4);
                    } else {
                        OooO0o0(length, 63, 64);
                        OooO0OO(byteString);
                        OooO0O0(o0ooo0oo4);
                    }
                }
                i3 = i4;
            }
        }

        public final void OooO0o0(int i, int i2, int i3) {
            oo0OOoo oo0oooo = this.f59438OooO0O0;
            if (i < i2) {
                oo0oooo.o00o0O(i | i3);
                return;
            }
            oo0oooo.o00o0O(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                oo0oooo.o00o0O(128 | (i4 & 127));
                i4 >>>= 7;
            }
            oo0oooo.o00o0O(i4);
        }
    }

    static {
        o0OOO0OO o0ooo0oo2 = new o0OOO0OO("", o0OOO0OO.f59417OooO);
        int i = 0;
        ByteString byteString = o0OOO0OO.f59419OooO0o;
        ByteString byteString2 = o0OOO0OO.f59421OooO0oO;
        ByteString byteString3 = o0OOO0OO.f59422OooO0oo;
        ByteString byteString4 = o0OOO0OO.f59420OooO0o0;
        o0OOO0OO[] o0ooo0ooArr = {o0ooo0oo2, new o0OOO0OO("GET", byteString), new o0OOO0OO("POST", byteString), new o0OOO0OO("/", byteString2), new o0OOO0OO("/index.html", byteString2), new o0OOO0OO("http", byteString3), new o0OOO0OO("https", byteString3), new o0OOO0OO("200", byteString4), new o0OOO0OO("204", byteString4), new o0OOO0OO("206", byteString4), new o0OOO0OO("304", byteString4), new o0OOO0OO("400", byteString4), new o0OOO0OO("404", byteString4), new o0OOO0OO("500", byteString4), new o0OOO0OO("accept-charset", ""), new o0OOO0OO("accept-encoding", "gzip, deflate"), new o0OOO0OO("accept-language", ""), new o0OOO0OO("accept-ranges", ""), new o0OOO0OO("accept", ""), new o0OOO0OO("access-control-allow-origin", ""), new o0OOO0OO("age", ""), new o0OOO0OO("allow", ""), new o0OOO0OO("authorization", ""), new o0OOO0OO("cache-control", ""), new o0OOO0OO("content-disposition", ""), new o0OOO0OO("content-encoding", ""), new o0OOO0OO("content-language", ""), new o0OOO0OO("content-length", ""), new o0OOO0OO("content-location", ""), new o0OOO0OO("content-range", ""), new o0OOO0OO("content-type", ""), new o0OOO0OO("cookie", ""), new o0OOO0OO("date", ""), new o0OOO0OO("etag", ""), new o0OOO0OO("expect", ""), new o0OOO0OO("expires", ""), new o0OOO0OO("from", ""), new o0OOO0OO(ReportItem.RequestKeyHost, ""), new o0OOO0OO("if-match", ""), new o0OOO0OO("if-modified-since", ""), new o0OOO0OO("if-none-match", ""), new o0OOO0OO("if-range", ""), new o0OOO0OO("if-unmodified-since", ""), new o0OOO0OO("last-modified", ""), new o0OOO0OO("link", ""), new o0OOO0OO("location", ""), new o0OOO0OO("max-forwards", ""), new o0OOO0OO("proxy-authenticate", ""), new o0OOO0OO("proxy-authorization", ""), new o0OOO0OO("range", ""), new o0OOO0OO("referer", ""), new o0OOO0OO("refresh", ""), new o0OOO0OO("retry-after", ""), new o0OOO0OO("server", ""), new o0OOO0OO("set-cookie", ""), new o0OOO0OO("strict-transport-security", ""), new o0OOO0OO("transfer-encoding", ""), new o0OOO0OO("user-agent", ""), new o0OOO0OO("vary", ""), new o0OOO0OO("via", ""), new o0OOO0OO("www-authenticate", "")};
        f59426OooO00o = o0ooo0ooArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i < 61) {
            int i2 = i + 1;
            if (!linkedHashMap.containsKey(o0ooo0ooArr[i].f59423OooO00o)) {
                linkedHashMap.put(o0ooo0ooArr[i].f59423OooO00o, Integer.valueOf(i));
            }
            i = i2;
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        f59427OooO0O0 = mapUnmodifiableMap;
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
