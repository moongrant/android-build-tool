package p659o0oooO00;

import androidx.appcompat.widget.o0000O0;
import androidx.compose.animation.core.AnimationKt;
import com.facebook.appevents.AppEventsConstants;
import com.squareup.wire.internal.MathMethodsKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okio.ByteString;
import okio.SegmentedByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.OooOO0;
import p028Oooo0oO.o00O0000;
import p037OoooOo0.o000Oo0;
import p658o0oooO0.o00O0OOO;
import p658o0oooO0.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000O implements o0000, o0000Ooo, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @Nullable
    public o0O0ooO f60176OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f60177OooO0o0;

    public static final class OooO00o implements Closeable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @JvmField
        @Nullable
        public o00000O f60179OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public o0O0ooO f60180OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @JvmField
        public boolean f60181OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @JvmField
        @Nullable
        public byte[] f60183OooO0oo;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @JvmField
        public long f60182OooO0oO = -1;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @JvmField
        public int f60178OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @JvmField
        public int f60184OooOO0 = -1;

        public final void OooO00o(long j) {
            o00000O o00000o = this.f60179OooO0Oo;
            if (o00000o == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f60181OooO0o0) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long j2 = o00000o.f60177OooO0o0;
            int i = 1;
            if (j <= j2) {
                if ((j < 0 ? 0 : 1) == 0) {
                    throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("newSize < 0: ", j).toString());
                }
                long j3 = j2 - j;
                while (j3 > 0) {
                    o0O0ooO o0o0ooo = o00000o.f60176OooO0Oo;
                    Intrinsics.checkNotNull(o0o0ooo);
                    o0O0ooO o0o0ooo2 = o0o0ooo.f60255OooO0oO;
                    Intrinsics.checkNotNull(o0o0ooo2);
                    int i2 = o0o0ooo2.f60251OooO0OO;
                    long j4 = i2 - o0o0ooo2.f60250OooO0O0;
                    if (j4 > j3) {
                        o0o0ooo2.f60251OooO0OO = i2 - ((int) j3);
                        break;
                    } else {
                        o00000o.f60176OooO0Oo = o0o0ooo2.OooO00o();
                        o00oOoo.OooO00o(o0o0ooo2);
                        j3 -= j4;
                    }
                }
                this.f60180OooO0o = null;
                this.f60182OooO0oO = j;
                this.f60183OooO0oo = null;
                this.f60178OooO = -1;
                this.f60184OooOO0 = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                boolean z = true;
                while (j5 > 0) {
                    o0O0ooO o0o0oooOooooOo = o00000o.OooooOo(i);
                    int iMin = (int) Math.min(j5, 8192 - o0o0oooOooooOo.f60251OooO0OO);
                    int i3 = o0o0oooOooooOo.f60251OooO0OO + iMin;
                    o0o0oooOooooOo.f60251OooO0OO = i3;
                    j5 -= (long) iMin;
                    if (z) {
                        this.f60180OooO0o = o0o0oooOooooOo;
                        this.f60182OooO0oO = j2;
                        this.f60183OooO0oo = o0o0oooOooooOo.f60249OooO00o;
                        this.f60178OooO = i3 - iMin;
                        this.f60184OooOO0 = i3;
                        z = false;
                    }
                    i = 1;
                }
            }
            o00000o.f60177OooO0o0 = j;
        }

        public final int OooO0OO(long j) {
            long j2;
            o0O0ooO o0o0ooo;
            o00000O o00000o = this.f60179OooO0Oo;
            if (o00000o == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j >= -1) {
                long j3 = o00000o.f60177OooO0o0;
                if (j <= j3) {
                    if (j == -1 || j == j3) {
                        this.f60180OooO0o = null;
                        this.f60182OooO0oO = j;
                        this.f60183OooO0oo = null;
                        this.f60178OooO = -1;
                        this.f60184OooOO0 = -1;
                        return -1;
                    }
                    o0O0ooO o0o0ooo2 = o00000o.f60176OooO0Oo;
                    o0O0ooO o0o0ooo3 = this.f60180OooO0o;
                    long j4 = 0;
                    if (o0o0ooo3 != null) {
                        long j5 = this.f60182OooO0oO;
                        int i = this.f60178OooO;
                        Intrinsics.checkNotNull(o0o0ooo3);
                        j2 = j5 - ((long) (i - o0o0ooo3.f60250OooO0O0));
                        if (j2 > j) {
                            o0o0ooo = this.f60180OooO0o;
                        } else {
                            j4 = j2;
                            j2 = j3;
                            o0o0ooo = o0o0ooo2;
                            o0o0ooo2 = this.f60180OooO0o;
                        }
                    } else {
                        j2 = j3;
                        o0o0ooo = o0o0ooo2;
                    }
                    if (j2 - j > j - j4) {
                        while (true) {
                            Intrinsics.checkNotNull(o0o0ooo2);
                            long j6 = ((long) (o0o0ooo2.f60251OooO0OO - o0o0ooo2.f60250OooO0O0)) + j4;
                            if (j < j6) {
                                break;
                            }
                            o0o0ooo2 = o0o0ooo2.f60253OooO0o;
                            j4 = j6;
                        }
                    } else {
                        while (j2 > j) {
                            Intrinsics.checkNotNull(o0o0ooo);
                            o0o0ooo = o0o0ooo.f60255OooO0oO;
                            Intrinsics.checkNotNull(o0o0ooo);
                            j2 -= (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
                        }
                        o0o0ooo2 = o0o0ooo;
                        j4 = j2;
                    }
                    if (this.f60181OooO0o0) {
                        Intrinsics.checkNotNull(o0o0ooo2);
                        if (o0o0ooo2.f60252OooO0Oo) {
                            byte[] bArr = o0o0ooo2.f60249OooO00o;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                            o0O0ooO o0o0ooo4 = new o0O0ooO(bArrCopyOf, o0o0ooo2.f60250OooO0O0, o0o0ooo2.f60251OooO0OO, false, true);
                            if (o00000o.f60176OooO0Oo == o0o0ooo2) {
                                o00000o.f60176OooO0Oo = o0o0ooo4;
                            }
                            o0o0ooo2.OooO0O0(o0o0ooo4);
                            o0O0ooO o0o0ooo5 = o0o0ooo4.f60255OooO0oO;
                            Intrinsics.checkNotNull(o0o0ooo5);
                            o0o0ooo5.OooO00o();
                            o0o0ooo2 = o0o0ooo4;
                        }
                    }
                    this.f60180OooO0o = o0o0ooo2;
                    this.f60182OooO0oO = j;
                    Intrinsics.checkNotNull(o0o0ooo2);
                    this.f60183OooO0oo = o0o0ooo2.f60249OooO00o;
                    int i2 = o0o0ooo2.f60250OooO0O0 + ((int) (j - j4));
                    this.f60178OooO = i2;
                    int i3 = o0o0ooo2.f60251OooO0OO;
                    this.f60184OooOO0 = i3;
                    return i3 - i2;
                }
            }
            StringBuilder sbOooO00o = o00O0000.OooO00o("offset=", j, " > size=");
            sbOooO00o.append(o00000o.f60177OooO0o0);
            throw new ArrayIndexOutOfBoundsException(sbOooO00o.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!(this.f60179OooO0Oo != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f60179OooO0Oo = null;
            this.f60180OooO0o = null;
            this.f60182OooO0oO = -1L;
            this.f60183OooO0oo = null;
            this.f60178OooO = -1;
            this.f60184OooOO0 = -1;
        }
    }

    @Override // p659o0oooO00.o0000, p659o0oooO00.o0000Ooo
    @NotNull
    public final o00000O OooO0O0() {
        return this;
    }

    @Override // p659o0oooO00.o0000, p659o0oooO00.o0000Ooo
    @NotNull
    public final o00000O OooO0Oo() {
        return this;
    }

    public final void OooO0oO() throws EOFException {
        skip(this.f60177OooO0o0);
    }

    @Override // p659o0oooO00.o0000Ooo
    public final o0000Ooo OooOO0o() {
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    public final /* bridge */ /* synthetic */ o0000Ooo OooOOO(int i) {
        o0ooOOo(i);
        return this;
    }

    @Override // p659o0oooO00.o0000Ooo
    public final o0000Ooo OooOOOo(long j) {
        o0OOO0o(oo00o.OooO0Oo(j));
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: OooOOo, reason: merged with bridge method [inline-methods] */
    public final o00000O clone() {
        o00000O o00000o = new o00000O();
        if (this.f60177OooO0o0 != 0) {
            o0O0ooO o0o0ooo = this.f60176OooO0Oo;
            Intrinsics.checkNotNull(o0o0ooo);
            o0O0ooO o0o0oooOooO0OO = o0o0ooo.OooO0OO();
            o00000o.f60176OooO0Oo = o0o0oooOooO0OO;
            o0o0oooOooO0OO.f60255OooO0oO = o0o0oooOooO0OO;
            o0o0oooOooO0OO.f60253OooO0o = o0o0oooOooO0OO;
            for (o0O0ooO o0o0ooo2 = o0o0ooo.f60253OooO0o; o0o0ooo2 != o0o0ooo; o0o0ooo2 = o0o0ooo2.f60253OooO0o) {
                o0O0ooO o0o0ooo3 = o0o0oooOooO0OO.f60255OooO0oO;
                Intrinsics.checkNotNull(o0o0ooo3);
                Intrinsics.checkNotNull(o0o0ooo2);
                o0o0ooo3.OooO0O0(o0o0ooo2.OooO0OO());
            }
            o00000o.f60177OooO0o0 = this.f60177OooO0o0;
        }
        return o00000o;
    }

    @JvmName(name = "getByte")
    public final byte OooOo(long j) {
        oo00o.OooO0O0(this.f60177OooO0o0, j, 1L);
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        if (o0o0ooo == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j2 = this.f60177OooO0o0;
        if (j2 - j < j) {
            while (j2 > j) {
                o0o0ooo = o0o0ooo.f60255OooO0oO;
                Intrinsics.checkNotNull(o0o0ooo);
                j2 -= (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
            }
            Intrinsics.checkNotNull(o0o0ooo);
            return o0o0ooo.f60249OooO00o[(int) ((((long) o0o0ooo.f60250OooO0O0) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0)) + j3;
            if (j4 > j) {
                Intrinsics.checkNotNull(o0o0ooo);
                return o0o0ooo.f60249OooO00o[(int) ((((long) o0o0ooo.f60250OooO0O0) + j) - j3)];
            }
            o0o0ooo = o0o0ooo.f60253OooO0o;
            Intrinsics.checkNotNull(o0o0ooo);
            j3 = j4;
        }
    }

    @NotNull
    public final void OooOo0(long j, long j2, @NotNull o00000O out) {
        Intrinsics.checkNotNullParameter(out, "out");
        oo00o.OooO0O0(this.f60177OooO0o0, j, j2);
        if (j2 == 0) {
            return;
        }
        out.f60177OooO0o0 += j2;
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        while (true) {
            Intrinsics.checkNotNull(o0o0ooo);
            long j3 = o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0;
            if (j < j3) {
                break;
            }
            j -= j3;
            o0o0ooo = o0o0ooo.f60253OooO0o;
        }
        while (j2 > 0) {
            Intrinsics.checkNotNull(o0o0ooo);
            o0O0ooO o0o0oooOooO0OO = o0o0ooo.OooO0OO();
            int i = o0o0oooOooO0OO.f60250OooO0O0 + ((int) j);
            o0o0oooOooO0OO.f60250OooO0O0 = i;
            o0o0oooOooO0OO.f60251OooO0OO = Math.min(i + ((int) j2), o0o0oooOooO0OO.f60251OooO0OO);
            o0O0ooO o0o0ooo2 = out.f60176OooO0Oo;
            if (o0o0ooo2 == null) {
                o0o0oooOooO0OO.f60255OooO0oO = o0o0oooOooO0OO;
                o0o0oooOooO0OO.f60253OooO0o = o0o0oooOooO0OO;
                out.f60176OooO0Oo = o0o0oooOooO0OO;
            } else {
                Intrinsics.checkNotNull(o0o0ooo2);
                o0O0ooO o0o0ooo3 = o0o0ooo2.f60255OooO0oO;
                Intrinsics.checkNotNull(o0o0ooo3);
                o0o0ooo3.OooO0O0(o0o0oooOooO0OO);
            }
            j2 -= (long) (o0o0oooOooO0OO.f60251OooO0OO - o0o0oooOooO0OO.f60250OooO0O0);
            o0o0ooo = o0o0ooo.f60253OooO0o;
            j = 0;
        }
    }

    public final long OooOo00() {
        long j = this.f60177OooO0o0;
        if (j == 0) {
            return 0L;
        }
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        Intrinsics.checkNotNull(o0o0ooo);
        o0O0ooO o0o0ooo2 = o0o0ooo.f60255OooO0oO;
        Intrinsics.checkNotNull(o0o0ooo2);
        int i = o0o0ooo2.f60251OooO0OO;
        if (i < 8192 && o0o0ooo2.f60254OooO0o0) {
            j -= (long) (i - o0o0ooo2.f60250OooO0O0);
        }
        return j;
    }

    @Override // p659o0oooO00.o0000Ooo
    public final o0000Ooo OooOoO() {
        return this;
    }

    @Override // p659o0oooO00.o0000
    public final long OooOoO0(@NotNull ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return Oooo0(0L, targetBytes);
    }

    @Override // p659o0oooO00.o0000
    public final int OooOoo(@NotNull o000O0O0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iOooO0O0 = o00O0OOO.OooO0O0(this, options, false);
        if (iOooO0O0 == -1) {
            return -1;
        }
        skip(options.f60214OooO0Oo[iOooO0O0].OooO0o0());
        return iOooO0O0;
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final String OooOoo0(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("limit < 0: ", j).toString());
        }
        long j2 = LongCompanionObject.MAX_VALUE;
        if (j != LongCompanionObject.MAX_VALUE) {
            j2 = j + 1;
        }
        byte b = (byte) 10;
        long jOooo00o = Oooo00o(b, 0L, j2);
        if (jOooo00o != -1) {
            return o00O0OOO.OooO00o(this, jOooo00o);
        }
        if (j2 < this.f60177OooO0o0 && OooOo(j2 - 1) == ((byte) 13) && OooOo(j2) == b) {
            return o00O0OOO.OooO00o(this, j2);
        }
        o00000O o00000o = new o00000O();
        OooOo0(0L, Math.min(32, this.f60177OooO0o0), o00000o);
        throw new EOFException("\\n not found: limit=" + Math.min(this.f60177OooO0o0, j) + " content=" + o00000o.Oooo0o0().OooO0o() + Typography.ellipsis);
    }

    @Override // p659o0oooO00.o0000Ooo
    public final /* bridge */ /* synthetic */ o0000Ooo OooOooo(String str) {
        o00000O(str);
        return this;
    }

    public final short Oooo() throws EOFException {
        short s = readShort();
        OooO00o oooO00o = oo00o.f60256OooO00o;
        int i = s & UShort.MAX_VALUE;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    public final long Oooo0(long j, @NotNull ByteString targetBytes) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j2 = 0;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("fromIndex < 0: ", j).toString());
        }
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        if (o0o0ooo != null) {
            long j3 = this.f60177OooO0o0;
            if (j3 - j < j) {
                while (j3 > j) {
                    o0o0ooo = o0o0ooo.f60255OooO0oO;
                    Intrinsics.checkNotNull(o0o0ooo);
                    j3 -= (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
                }
                byte[] bArr = targetBytes.data;
                if (bArr.length == 2) {
                    byte b = bArr[0];
                    byte b2 = bArr[1];
                    while (j3 < this.f60177OooO0o0) {
                        byte[] bArr2 = o0o0ooo.f60249OooO00o;
                        i3 = (int) ((((long) o0o0ooo.f60250OooO0O0) + j) - j3);
                        int i5 = o0o0ooo.f60251OooO0OO;
                        while (i3 < i5) {
                            byte b3 = bArr2[i3];
                            if (b3 == b || b3 == b2) {
                                i4 = o0o0ooo.f60250OooO0O0;
                                return ((long) (i3 - i4)) + j3;
                            }
                            i3++;
                        }
                        j3 += (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
                        o0o0ooo = o0o0ooo.f60253OooO0o;
                        Intrinsics.checkNotNull(o0o0ooo);
                        j = j3;
                    }
                } else {
                    while (j3 < this.f60177OooO0o0) {
                        byte[] bArr3 = o0o0ooo.f60249OooO00o;
                        i3 = (int) ((((long) o0o0ooo.f60250OooO0O0) + j) - j3);
                        int i6 = o0o0ooo.f60251OooO0OO;
                        while (i3 < i6) {
                            byte b4 = bArr3[i3];
                            for (byte b5 : bArr) {
                                if (b4 == b5) {
                                    i4 = o0o0ooo.f60250OooO0O0;
                                    return ((long) (i3 - i4)) + j3;
                                }
                            }
                            i3++;
                        }
                        j3 += (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
                        o0o0ooo = o0o0ooo.f60253OooO0o;
                        Intrinsics.checkNotNull(o0o0ooo);
                        j = j3;
                    }
                }
            } else {
                while (true) {
                    long j4 = ((long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0)) + j2;
                    if (j4 > j) {
                        break;
                    }
                    o0o0ooo = o0o0ooo.f60253OooO0o;
                    Intrinsics.checkNotNull(o0o0ooo);
                    j2 = j4;
                }
                byte[] bArr4 = targetBytes.data;
                if (bArr4.length == 2) {
                    byte b6 = bArr4[0];
                    byte b7 = bArr4[1];
                    while (j2 < this.f60177OooO0o0) {
                        byte[] bArr5 = o0o0ooo.f60249OooO00o;
                        i = (int) ((((long) o0o0ooo.f60250OooO0O0) + j) - j2);
                        int i7 = o0o0ooo.f60251OooO0OO;
                        while (i < i7) {
                            byte b8 = bArr5[i];
                            if (b8 == b6 || b8 == b7) {
                                i2 = o0o0ooo.f60250OooO0O0;
                                return ((long) (i - i2)) + j2;
                            }
                            i++;
                        }
                        j2 += (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
                        o0o0ooo = o0o0ooo.f60253OooO0o;
                        Intrinsics.checkNotNull(o0o0ooo);
                        j = j2;
                    }
                } else {
                    while (j2 < this.f60177OooO0o0) {
                        byte[] bArr6 = o0o0ooo.f60249OooO00o;
                        i = (int) ((((long) o0o0ooo.f60250OooO0O0) + j) - j2);
                        int i8 = o0o0ooo.f60251OooO0OO;
                        while (i < i8) {
                            byte b9 = bArr6[i];
                            for (byte b10 : bArr4) {
                                if (b9 == b10) {
                                    i2 = o0o0ooo.f60250OooO0O0;
                                    return ((long) (i - i2)) + j2;
                                }
                            }
                            i++;
                        }
                        j2 += (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
                        o0o0ooo = o0o0ooo.f60253OooO0o;
                        Intrinsics.checkNotNull(o0o0ooo);
                        j = j2;
                    }
                }
            }
        }
        return -1L;
    }

    @Override // p659o0oooO00.o0000Ooo
    public final long Oooo000(@NotNull o00O00 source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long jO0000OO0 = source.o0000OO0(this, 8192L);
            if (jO0000OO0 == -1) {
                return j;
            }
            j += jO0000OO0;
        }
    }

    @Override // p659o0oooO00.o0000
    public final boolean Oooo00O(long j, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.data.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j < 0 || length < 0 || this.f60177OooO0o0 - j < length || bytes.data.length - 0 < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (OooOo(((long) i) + j) != bytes.data[0 + i]) {
                return false;
            }
        }
        return true;
    }

    public final long Oooo00o(byte b, long j, long j2) {
        o0O0ooO o0o0ooo;
        long j3 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.f60177OooO0o0);
            o000Oo0.OooO0O0.OooO00o(sb, " fromIndex=", j, " toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j4 = this.f60177OooO0o0;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j != j2 && (o0o0ooo = this.f60176OooO0Oo) != null) {
            if (j4 - j < j) {
                while (j4 > j) {
                    o0o0ooo = o0o0ooo.f60255OooO0oO;
                    Intrinsics.checkNotNull(o0o0ooo);
                    j4 -= (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
                }
                while (j4 < j2) {
                    byte[] bArr = o0o0ooo.f60249OooO00o;
                    int iMin = (int) Math.min(o0o0ooo.f60251OooO0OO, (((long) o0o0ooo.f60250OooO0O0) + j2) - j4);
                    for (int i = (int) ((((long) o0o0ooo.f60250OooO0O0) + j) - j4); i < iMin; i++) {
                        if (bArr[i] == b) {
                            return ((long) (i - o0o0ooo.f60250OooO0O0)) + j4;
                        }
                    }
                    j4 += (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
                    o0o0ooo = o0o0ooo.f60253OooO0o;
                    Intrinsics.checkNotNull(o0o0ooo);
                    j = j4;
                }
            } else {
                while (true) {
                    long j5 = ((long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0)) + j3;
                    if (j5 > j) {
                        break;
                    }
                    o0o0ooo = o0o0ooo.f60253OooO0o;
                    Intrinsics.checkNotNull(o0o0ooo);
                    j3 = j5;
                }
                while (j3 < j2) {
                    byte[] bArr2 = o0o0ooo.f60249OooO00o;
                    int iMin2 = (int) Math.min(o0o0ooo.f60251OooO0OO, (((long) o0o0ooo.f60250OooO0O0) + j2) - j3);
                    for (int i2 = (int) ((((long) o0o0ooo.f60250OooO0O0) + j) - j3); i2 < iMin2; i2++) {
                        if (bArr2[i2] == b) {
                            return ((long) (i2 - o0o0ooo.f60250OooO0O0)) + j3;
                        }
                    }
                    j3 += (long) (o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
                    o0o0ooo = o0o0ooo.f60253OooO0o;
                    Intrinsics.checkNotNull(o0o0ooo);
                    j = j3;
                }
            }
        }
        return -1L;
    }

    @JvmOverloads
    @NotNull
    public final OooO00o Oooo0O0(@NotNull OooO00o unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = o00O0OOO.f60155OooO00o;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        OooO00o oooO00o = oo00o.f60256OooO00o;
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == oo00o.f60256OooO00o) {
            unsafeCursor = new OooO00o();
        }
        if (!(unsafeCursor.f60179OooO0Oo == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.f60179OooO0Oo = this;
        unsafeCursor.f60181OooO0o0 = true;
        return unsafeCursor;
    }

    @NotNull
    public final byte[] Oooo0OO(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount: ", j).toString());
        }
        if (this.f60177OooO0o0 < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final long Oooo0o() throws EOFException {
        if (this.f60177OooO0o0 == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = -7;
        long j2 = 0;
        boolean z2 = false;
        do {
            o0O0ooO o0o0ooo = this.f60176OooO0Oo;
            Intrinsics.checkNotNull(o0o0ooo);
            byte[] bArr = o0o0ooo.f60249OooO00o;
            int i2 = o0o0ooo.f60250OooO0O0;
            int i3 = o0o0ooo.f60251OooO0OO;
            while (i2 < i3) {
                byte b = bArr[i2];
                byte b2 = (byte) 48;
                if (b >= b2 && b <= ((byte) 57)) {
                    int i4 = b2 - b;
                    if (j2 < -922337203685477580L || (j2 == -922337203685477580L && i4 < j)) {
                        o00000O o00000o = new o00000O();
                        o00000o.Ooooo00(j2);
                        o00000o.o00O0O(b);
                        if (!z) {
                            o00000o.readByte();
                        }
                        throw new NumberFormatException("Number too large: ".concat(o00000o.OoooOO0()));
                    }
                    j2 = (j2 * 10) + ((long) i4);
                } else {
                    if (b != ((byte) 45) || i != 0) {
                        z2 = true;
                        break;
                    }
                    j--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.f60176OooO0Oo = o0o0ooo.OooO00o();
                o00oOoo.OooO00o(o0o0ooo);
            } else {
                o0o0ooo.f60250OooO0O0 = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f60176OooO0Oo != null);
        long j3 = this.f60177OooO0o0 - ((long) i);
        this.f60177OooO0o0 = j3;
        if (i >= (z ? 2 : 1)) {
            return z ? j2 : -j2;
        }
        if (j3 == 0) {
            throw new EOFException();
        }
        StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbOooO0O0.append(oo00o.OooO0o0(OooOo(0L)));
        throw new NumberFormatException(sbOooO0O0.toString());
    }

    @NotNull
    public final ByteString Oooo0o0() {
        return Oooooo0(this.f60177OooO0o0);
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final String OoooO0() throws EOFException {
        return OooOoo0(LongCompanionObject.MAX_VALUE);
    }

    @NotNull
    public final String OoooO00(long j, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount: ", j).toString());
        }
        if (this.f60177OooO0o0 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        Intrinsics.checkNotNull(o0o0ooo);
        int i = o0o0ooo.f60250OooO0O0;
        if (((long) i) + j > o0o0ooo.f60251OooO0OO) {
            return new String(Oooo0OO(j), charset);
        }
        int i2 = (int) j;
        String str = new String(o0o0ooo.f60249OooO00o, i, i2, charset);
        int i3 = o0o0ooo.f60250OooO0O0 + i2;
        o0o0ooo.f60250OooO0O0 = i3;
        this.f60177OooO0o0 -= j;
        if (i3 == o0o0ooo.f60251OooO0OO) {
            this.f60176OooO0Oo = o0o0ooo.OooO00o();
            o00oOoo.OooO00o(o0o0ooo);
        }
        return str;
    }

    @NotNull
    public final String OoooOO0() {
        return OoooO00(this.f60177OooO0o0, Charsets.UTF_8);
    }

    @Override // p659o0oooO00.o0000
    public final void OoooOoO(long j) throws EOFException {
        if (this.f60177OooO0o0 < j) {
            throw new EOFException();
        }
    }

    public final int OoooOoo() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f60177OooO0o0 == 0) {
            throw new EOFException();
        }
        byte bOooOo = OooOo(0L);
        boolean z = false;
        if ((bOooOo & ByteCompanionObject.MIN_VALUE) == 0) {
            i = bOooOo & ByteCompanionObject.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((bOooOo & 224) == 192) {
            i = bOooOo & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bOooOo & 240) == 224) {
            i = bOooOo & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bOooOo & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bOooOo & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f60177OooO0o0 < j) {
            StringBuilder sbOooO00o = o0000O0.OooO00o("size < ", i2, ": ");
            sbOooO00o.append(this.f60177OooO0o0);
            sbOooO00o.append(" (to read code point prefixed 0x");
            sbOooO00o.append(oo00o.OooO0o0(bOooOo));
            sbOooO00o.append(')');
            throw new EOFException(sbOooO00o.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bOooOo2 = OooOo(j2);
            if ((bOooOo2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bOooOo2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if (55296 <= i && i < 57344) {
            z = true;
        }
        if (!z && i >= i3) {
            return i;
        }
        return 65533;
    }

    @NotNull
    public final ByteString Ooooo0o(int i) {
        if (i == 0) {
            return ByteString.f60866OooO0oO;
        }
        oo00o.OooO0O0(this.f60177OooO0o0, 0L, i);
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(o0o0ooo);
            int i5 = o0o0ooo.f60251OooO0OO;
            int i6 = o0o0ooo.f60250OooO0O0;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            o0o0ooo = o0o0ooo.f60253OooO0o;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        o0O0ooO o0o0ooo2 = this.f60176OooO0Oo;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(o0o0ooo2);
            bArr[i7] = o0o0ooo2.f60249OooO00o;
            i2 += o0o0ooo2.f60251OooO0OO - o0o0ooo2.f60250OooO0O0;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = o0o0ooo2.f60250OooO0O0;
            o0o0ooo2.f60252OooO0Oo = true;
            i7++;
            o0o0ooo2 = o0o0ooo2.f60253OooO0o;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final String OooooO0(long j) throws EOFException {
        return OoooO00(j, Charsets.UTF_8);
    }

    @NotNull
    public final o0O0ooO OooooOo(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        if (o0o0ooo == null) {
            o0O0ooO o0o0oooOooO0O0 = o00oOoo.OooO0O0();
            this.f60176OooO0Oo = o0o0oooOooO0O0;
            o0o0oooOooO0O0.f60255OooO0oO = o0o0oooOooO0O0;
            o0o0oooOooO0O0.f60253OooO0o = o0o0oooOooO0O0;
            return o0o0oooOooO0O0;
        }
        Intrinsics.checkNotNull(o0o0ooo);
        o0O0ooO o0o0ooo2 = o0o0ooo.f60255OooO0oO;
        Intrinsics.checkNotNull(o0o0ooo2);
        if (o0o0ooo2.f60251OooO0OO + i <= 8192 && o0o0ooo2.f60254OooO0o0) {
            return o0o0ooo2;
        }
        o0O0ooO o0o0oooOooO0O1 = o00oOoo.OooO0O0();
        o0o0ooo2.OooO0O0(o0o0oooOooO0O1);
        return o0o0oooOooO0O1;
    }

    @NotNull
    public final void Oooooo(int i, int i2, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        oo00o.OooO0O0(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            o0O0ooO o0o0oooOooooOo = OooooOo(1);
            int iMin = Math.min(i3 - i, 8192 - o0o0oooOooooOo.f60251OooO0OO);
            int i4 = i + iMin;
            ArraysKt.copyInto(source, o0o0oooOooooOo.f60249OooO00o, o0o0oooOooooOo.f60251OooO0OO, i, i4);
            o0o0oooOooooOo.f60251OooO0OO += iMin;
            i = i4;
        }
        this.f60177OooO0o0 += j;
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final ByteString Oooooo0(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount: ", j).toString());
        }
        if (this.f60177OooO0o0 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(Oooo0OO(j));
        }
        ByteString byteStringOoooo0o = Ooooo0o((int) j);
        skip(j);
        return byteStringOoooo0o;
    }

    @NotNull
    public final void OoooooO(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.OooOo0(this, byteString.OooO0o0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p659o0oooO00.o00O000
    public final void close() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof o00000O) {
                long j = this.f60177OooO0o0;
                o00000O o00000o = (o00000O) obj;
                if (j == o00000o.f60177OooO0o0) {
                    if (j != 0) {
                        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
                        Intrinsics.checkNotNull(o0o0ooo);
                        o0O0ooO o0o0ooo2 = o00000o.f60176OooO0Oo;
                        Intrinsics.checkNotNull(o0o0ooo2);
                        int i = o0o0ooo.f60250OooO0O0;
                        int i2 = o0o0ooo2.f60250OooO0O0;
                        long j2 = 0;
                        while (j2 < this.f60177OooO0o0) {
                            long jMin = Math.min(o0o0ooo.f60251OooO0OO - i, o0o0ooo2.f60251OooO0OO - i2);
                            long j3 = 0;
                            while (j3 < jMin) {
                                int i3 = i + 1;
                                byte b = o0o0ooo.f60249OooO00o[i];
                                int i4 = i2 + 1;
                                if (b == o0o0ooo2.f60249OooO00o[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == o0o0ooo.f60251OooO0OO) {
                                o0O0ooO o0o0ooo3 = o0o0ooo.f60253OooO0o;
                                Intrinsics.checkNotNull(o0o0ooo3);
                                i = o0o0ooo3.f60250OooO0O0;
                                o0o0ooo = o0o0ooo3;
                            }
                            if (i2 == o0o0ooo2.f60251OooO0OO) {
                                o0o0ooo2 = o0o0ooo2.f60253OooO0o;
                                Intrinsics.checkNotNull(o0o0ooo2);
                                i2 = o0o0ooo2.f60250OooO0O0;
                            }
                            j2 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p659o0oooO00.o0000Ooo, p659o0oooO00.o00O000, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        if (o0o0ooo == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = o0o0ooo.f60251OooO0OO;
            for (int i3 = o0o0ooo.f60250OooO0O0; i3 < i2; i3++) {
                i = (i * 31) + o0o0ooo.f60249OooO00o[i3];
            }
            o0o0ooo = o0o0ooo.f60253OooO0o;
            Intrinsics.checkNotNull(o0o0ooo);
        } while (o0o0ooo != this.f60176OooO0Oo);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final String o000000(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return OoooO00(this.f60177OooO0o0, charset);
    }

    @NotNull
    public final void o00000O(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        o000OOo(0, string.length(), string);
    }

    @Override // p659o0oooO00.o0000Ooo
    public final /* bridge */ /* synthetic */ o0000Ooo o00000O0(long j) {
        o00ooo(j);
        return this;
    }

    @NotNull
    public final void o00000o0(int i) {
        String strOooO0OO;
        if (i < 128) {
            o00O0O(i);
            return;
        }
        if (i < 2048) {
            o0O0ooO o0o0oooOooooOo = OooooOo(2);
            int i2 = o0o0oooOooooOo.f60251OooO0OO;
            byte[] bArr = o0o0oooOooooOo.f60249OooO00o;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            o0o0oooOooooOo.f60251OooO0OO = i2 + 2;
            this.f60177OooO0o0 += 2;
            return;
        }
        int i3 = 0;
        if (55296 <= i && i < 57344) {
            o00O0O(63);
            return;
        }
        if (i < 65536) {
            o0O0ooO o0o0oooOooooOo2 = OooooOo(3);
            int i4 = o0o0oooOooooOo2.f60251OooO0OO;
            byte[] bArr2 = o0o0oooOooooOo2.f60249OooO00o;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i & 63) | 128);
            o0o0oooOooooOo2.f60251OooO0OO = i4 + 3;
            this.f60177OooO0o0 += 3;
            return;
        }
        if (i <= 1114111) {
            o0O0ooO o0o0oooOooooOo3 = OooooOo(4);
            int i5 = o0o0oooOooooOo3.f60251OooO0OO;
            byte[] bArr3 = o0o0oooOooooOo3.f60249OooO00o;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i & 63) | 128);
            o0o0oooOooooOo3.f60251OooO0OO = i5 + 4;
            this.f60177OooO0o0 += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        OooO00o oooO00o = oo00o.f60256OooO00o;
        if (i != 0) {
            char[] cArr = oo0oOO0.f60161OooO00o;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            strOooO0OO = StringsKt.OooO0OO(cArr2, i3);
        } else {
            strOooO0OO = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        sb.append(strOooO0OO);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p659o0oooO00.o0000Ooo
    public final /* bridge */ /* synthetic */ o0000Ooo o0000O00(ByteString byteString) {
        OoooooO(byteString);
        return this;
    }

    @Override // p659o0oooO00.o00O00
    public final long o0000OO0(@NotNull o00000O sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        long j2 = this.f60177OooO0o0;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.write(this, j);
        return j;
    }

    @Override // p659o0oooO00.o0000
    public final long o0000Oo0() throws EOFException {
        int i;
        if (this.f60177OooO0o0 == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            o0O0ooO o0o0ooo = this.f60176OooO0Oo;
            Intrinsics.checkNotNull(o0o0ooo);
            byte[] bArr = o0o0ooo.f60249OooO00o;
            int i3 = o0o0ooo.f60250OooO0O0;
            int i4 = o0o0ooo.f60251OooO0OO;
            while (i3 < i4) {
                byte b = bArr[i3];
                byte b2 = (byte) 48;
                if (b < b2 || b > ((byte) 57)) {
                    byte b3 = (byte) 97;
                    if ((b < b3 || b > ((byte) 102)) && (b < (b3 = (byte) 65) || b > ((byte) 70))) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + oo00o.OooO0o0(b));
                    }
                    i = (b - b3) + 10;
                } else {
                    i = b - b2;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    o00000O o00000o = new o00000O();
                    o00000o.o00ooo(j);
                    o00000o.o00O0O(b);
                    throw new NumberFormatException("Number too large: ".concat(o00000o.OoooOO0()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f60176OooO0Oo = o0o0ooo.OooO00o();
                o00oOoo.OooO00o(o0o0ooo);
            } else {
                o0o0ooo.f60250OooO0O0 = i3;
            }
            if (z) {
                break;
            }
        } while (this.f60176OooO0Oo != null);
        this.f60177OooO0o0 -= (long) i2;
        return j;
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final InputStream o0000OoO() {
        return new OooO0O0();
    }

    @Override // p659o0oooO00.o0000
    public final int o0000Ooo() throws EOFException {
        int i = readInt();
        OooO00o oooO00o = oo00o.f60256OooO00o;
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // p659o0oooO00.o0000Ooo
    public final /* bridge */ /* synthetic */ o0000Ooo o000OO(int i, int i2, byte[] bArr) {
        Oooooo(i, i2, bArr);
        return this;
    }

    @NotNull
    public final void o000OOo(int i, int i2, @NotNull String string) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(OooOO0.OooO00o("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (!(i2 <= string.length())) {
            StringBuilder sbOooO00o = o0000O0.OooO00o("endIndex > string.length: ", i2, " > ");
            sbOooO00o.append(string.length());
            throw new IllegalArgumentException(sbOooO00o.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                o0O0ooO o0o0oooOooooOo = OooooOo(1);
                int i3 = o0o0oooOooooOo.f60251OooO0OO - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = o0o0oooOooooOo.f60249OooO00o;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = o0o0oooOooooOo.f60251OooO0OO;
                int i6 = (i3 + i) - i5;
                o0o0oooOooooOo.f60251OooO0OO = i5 + i6;
                this.f60177OooO0o0 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    o0O0ooO o0o0oooOooooOo2 = OooooOo(2);
                    int i7 = o0o0oooOooooOo2.f60251OooO0OO;
                    byte[] bArr2 = o0o0oooOooooOo2.f60249OooO00o;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    o0o0oooOooooOo2.f60251OooO0OO = i7 + 2;
                    this.f60177OooO0o0 += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    o0O0ooO o0o0oooOooooOo3 = OooooOo(3);
                    int i8 = o0o0oooOooooOo3.f60251OooO0OO;
                    byte[] bArr3 = o0o0oooOooooOo3.f60249OooO00o;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    o0o0oooOooooOo3.f60251OooO0OO = i8 + 3;
                    this.f60177OooO0o0 += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            o0O0ooO o0o0oooOooooOo4 = OooooOo(4);
                            int i11 = o0o0oooOooooOo4.f60251OooO0OO;
                            byte[] bArr4 = o0o0oooOooooOo4.f60249OooO00o;
                            bArr4[i11] = (byte) ((i10 >> 18) | 240);
                            bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                            o0o0oooOooooOo4.f60251OooO0OO = i11 + 4;
                            this.f60177OooO0o0 += 4;
                            i += 2;
                        }
                    }
                    o00O0O(63);
                    i = i9;
                }
                i++;
            }
        }
    }

    @Override // p659o0oooO00.o0000
    public final long o000oOoO() throws EOFException {
        return oo00o.OooO0Oo(readLong());
    }

    @NotNull
    public final void o00O0O(int i) {
        o0O0ooO o0o0oooOooooOo = OooooOo(1);
        int i2 = o0o0oooOooooOo.f60251OooO0OO;
        o0o0oooOooooOo.f60251OooO0OO = i2 + 1;
        o0o0oooOooooOo.f60249OooO00o[i2] = (byte) i;
        this.f60177OooO0o0++;
    }

    @Override // p659o0oooO00.o0000Ooo
    @NotNull
    /* JADX INFO: renamed from: o00Oo0, reason: merged with bridge method [inline-methods] */
    public final o00000O Ooooo00(long j) {
        boolean z;
        byte[] bArr;
        if (j == 0) {
            o00O0O(48);
        } else {
            int i = 1;
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    o00000O("-9223372036854775808");
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (j < 100000000) {
                if (j < 10000) {
                    if (j >= 100) {
                        i = j < 1000 ? 3 : 4;
                    } else if (j >= 10) {
                        i = 2;
                    }
                } else if (j < AnimationKt.MillisToNanos) {
                    i = j < 100000 ? 5 : 6;
                } else {
                    i = j < 10000000 ? 7 : 8;
                }
            } else if (j < 1000000000000L) {
                if (j < 10000000000L) {
                    i = j < MathMethodsKt.NANOS_PER_SECOND ? 9 : 10;
                } else {
                    i = j < 100000000000L ? 11 : 12;
                }
            } else if (j < 1000000000000000L) {
                if (j < 10000000000000L) {
                    i = 13;
                } else {
                    i = j < 100000000000000L ? 14 : 15;
                }
            } else if (j < 100000000000000000L) {
                i = j < 10000000000000000L ? 16 : 17;
            } else {
                i = j < 1000000000000000000L ? 18 : 19;
            }
            if (z) {
                i++;
            }
            o0O0ooO o0o0oooOooooOo = OooooOo(i);
            int i2 = o0o0oooOooooOo.f60251OooO0OO + i;
            while (true) {
                bArr = o0o0oooOooooOo.f60249OooO00o;
                if (j == 0) {
                    break;
                }
                long j2 = 10;
                i2--;
                bArr[i2] = o00O0OOO.f60155OooO00o[(int) (j % j2)];
                j /= j2;
            }
            if (z) {
                bArr[i2 - 1] = (byte) 45;
            }
            o0o0oooOooooOo.f60251OooO0OO += i;
            this.f60177OooO0o0 += (long) i;
        }
        return this;
    }

    @Override // p659o0oooO00.o0000
    @NotNull
    public final byte[] o00Ooo() {
        return Oooo0OO(this.f60177OooO0o0);
    }

    @Override // p659o0oooO00.o0000Ooo
    public final o0000Ooo o00o0O(int i) {
        OooO00o oooO00o = oo00o.f60256OooO00o;
        o0ooOOo(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
        return this;
    }

    @Override // p659o0oooO00.o0000
    public final long o00oO0O(@NotNull o0000Ooo sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = this.f60177OooO0o0;
        if (j > 0) {
            sink.write(this, j);
        }
        return j;
    }

    @Override // p659o0oooO00.o0000Ooo
    public final /* bridge */ /* synthetic */ o0000Ooo o00oO0o(int i) {
        o00O0O(i);
        return this;
    }

    @NotNull
    public final o00000O o00ooo(long j) {
        if (j == 0) {
            o00O0O(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            o0O0ooO o0o0oooOooooOo = OooooOo(i);
            int i2 = o0o0oooOooooOo.f60251OooO0OO;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                o0o0oooOooooOo.f60249OooO00o[i3] = o00O0OOO.f60155OooO00o[(int) (15 & j)];
                j >>>= 4;
            }
            o0o0oooOooooOo.f60251OooO0OO += i;
            this.f60177OooO0o0 += (long) i;
        }
        return this;
    }

    @NotNull
    public final o00000O o0O0O00(@NotNull String string, int i, int i2, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(OooOO0.OooO00o("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (!(i2 <= string.length())) {
            StringBuilder sbOooO00o = o0000O0.OooO00o("endIndex > string.length: ", i2, " > ");
            sbOooO00o.append(string.length());
            throw new IllegalArgumentException(sbOooO00o.toString().toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            o000OOo(i, i2, string);
            return this;
        }
        String strSubstring = string.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        Oooooo(0, bytes.length, bytes);
        return this;
    }

    @NotNull
    public final void o0OOO0o(long j) {
        o0O0ooO o0o0oooOooooOo = OooooOo(8);
        int i = o0o0oooOooooOo.f60251OooO0OO;
        int i2 = i + 1;
        byte[] bArr = o0o0oooOooooOo.f60249OooO00o;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        o0o0oooOooooOo.f60251OooO0OO = i8 + 1;
        this.f60177OooO0o0 += 8;
    }

    @Override // p659o0oooO00.o0000Ooo
    public final /* bridge */ /* synthetic */ o0000Ooo o0OoOo0(int i) {
        oo0o0Oo(i);
        return this;
    }

    @NotNull
    public final void o0ooOOo(int i) {
        o0O0ooO o0o0oooOooooOo = OooooOo(4);
        int i2 = o0o0oooOooooOo.f60251OooO0OO;
        int i3 = i2 + 1;
        byte[] bArr = o0o0oooOooooOo.f60249OooO00o;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        o0o0oooOooooOo.f60251OooO0OO = i5 + 1;
        this.f60177OooO0o0 += 4;
    }

    @Override // p659o0oooO00.o0000
    public final void o0ooOoO(@NotNull o00000O sink, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = this.f60177OooO0o0;
        if (j2 >= j) {
            sink.write(this, j);
        } else {
            sink.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // p659o0oooO00.o0000
    public final boolean oo000o() {
        return this.f60177OooO0o0 == 0;
    }

    @NotNull
    public final void oo0o0Oo(int i) {
        o0O0ooO o0o0oooOooooOo = OooooOo(2);
        int i2 = o0o0oooOooooOo.f60251OooO0OO;
        int i3 = i2 + 1;
        byte[] bArr = o0o0oooOooooOo.f60249OooO00o;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        o0o0oooOooooOo.f60251OooO0OO = i3 + 1;
        this.f60177OooO0o0 += 2;
    }

    @NotNull
    public final void ooOO(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Oooooo(0, source.length, source);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        if (o0o0ooo == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
        sink.put(o0o0ooo.f60249OooO00o, o0o0ooo.f60250OooO0O0, iMin);
        int i = o0o0ooo.f60250OooO0O0 + iMin;
        o0o0ooo.f60250OooO0O0 = i;
        this.f60177OooO0o0 -= (long) iMin;
        if (i == o0o0ooo.f60251OooO0OO) {
            this.f60176OooO0Oo = o0o0ooo.OooO00o();
            o00oOoo.OooO00o(o0o0ooo);
        }
        return iMin;
    }

    @Override // p659o0oooO00.o0000
    public final byte readByte() throws EOFException {
        if (this.f60177OooO0o0 == 0) {
            throw new EOFException();
        }
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        Intrinsics.checkNotNull(o0o0ooo);
        int i = o0o0ooo.f60250OooO0O0;
        int i2 = o0o0ooo.f60251OooO0OO;
        int i3 = i + 1;
        byte b = o0o0ooo.f60249OooO00o[i];
        this.f60177OooO0o0--;
        if (i3 == i2) {
            this.f60176OooO0Oo = o0o0ooo.OooO00o();
            o00oOoo.OooO00o(o0o0ooo);
        } else {
            o0o0ooo.f60250OooO0O0 = i3;
        }
        return b;
    }

    @Override // p659o0oooO00.o0000
    public final void readFully(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // p659o0oooO00.o0000
    public final int readInt() throws EOFException {
        if (this.f60177OooO0o0 < 4) {
            throw new EOFException();
        }
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        Intrinsics.checkNotNull(o0o0ooo);
        int i = o0o0ooo.f60250OooO0O0;
        int i2 = o0o0ooo.f60251OooO0OO;
        if (i2 - i < 4) {
            return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
        }
        int i3 = i + 1;
        byte[] bArr = o0o0ooo.f60249OooO00o;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i3] & UByte.MAX_VALUE) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & UByte.MAX_VALUE);
        this.f60177OooO0o0 -= 4;
        if (i8 == i2) {
            this.f60176OooO0Oo = o0o0ooo.OooO00o();
            o00oOoo.OooO00o(o0o0ooo);
        } else {
            o0o0ooo.f60250OooO0O0 = i8;
        }
        return i9;
    }

    @Override // p659o0oooO00.o0000
    public final long readLong() throws EOFException {
        if (this.f60177OooO0o0 < 8) {
            throw new EOFException();
        }
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        Intrinsics.checkNotNull(o0o0ooo);
        int i = o0o0ooo.f60250OooO0O0;
        int i2 = o0o0ooo.f60251OooO0OO;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        int i3 = i + 1;
        byte[] bArr = o0o0ooo.f60249OooO00o;
        long j = (((long) bArr[i]) & 255) << 56;
        int i4 = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 48);
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 40);
        int i6 = i5 + 1;
        long j4 = ((((long) bArr[i5]) & 255) << 32) | j3;
        int i7 = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 24);
        int i8 = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 16);
        int i9 = i8 + 1;
        long j7 = j6 | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i9 + 1;
        long j8 = j7 | (((long) bArr[i9]) & 255);
        this.f60177OooO0o0 -= 8;
        if (i10 == i2) {
            this.f60176OooO0Oo = o0o0ooo.OooO00o();
            o00oOoo.OooO00o(o0o0ooo);
        } else {
            o0o0ooo.f60250OooO0O0 = i10;
        }
        return j8;
    }

    @Override // p659o0oooO00.o0000
    public final short readShort() throws EOFException {
        if (this.f60177OooO0o0 < 2) {
            throw new EOFException();
        }
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        Intrinsics.checkNotNull(o0o0ooo);
        int i = o0o0ooo.f60250OooO0O0;
        int i2 = o0o0ooo.f60251OooO0OO;
        if (i2 - i < 2) {
            return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
        }
        int i3 = i + 1;
        byte[] bArr = o0o0ooo.f60249OooO00o;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & UByte.MAX_VALUE) << 8) | (bArr[i3] & UByte.MAX_VALUE);
        this.f60177OooO0o0 -= 2;
        if (i4 == i2) {
            this.f60176OooO0Oo = o0o0ooo.OooO00o();
            o00oOoo.OooO00o(o0o0ooo);
        } else {
            o0o0ooo.f60250OooO0O0 = i4;
        }
        return (short) i5;
    }

    @Override // p659o0oooO00.o0000
    public final boolean request(long j) {
        return this.f60177OooO0o0 >= j;
    }

    @Override // p659o0oooO00.o0000
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            o0O0ooO o0o0ooo = this.f60176OooO0Oo;
            if (o0o0ooo == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
            long j2 = iMin;
            this.f60177OooO0o0 -= j2;
            j -= j2;
            int i = o0o0ooo.f60250OooO0O0 + iMin;
            o0o0ooo.f60250OooO0O0 = i;
            if (i == o0o0ooo.f60251OooO0OO) {
                this.f60176OooO0Oo = o0o0ooo.OooO00o();
                o00oOoo.OooO00o(o0o0ooo);
            }
        }
    }

    @Override // p659o0oooO00.o00O00
    @NotNull
    public final o00O00O timeout() {
        return o00O00O.f60237OooO0Oo;
    }

    @NotNull
    public final String toString() {
        long j = this.f60177OooO0o0;
        if (j <= 2147483647L) {
            return Ooooo0o((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f60177OooO0o0).toString());
    }

    @Override // p659o0oooO00.o0000Ooo
    public final /* bridge */ /* synthetic */ o0000Ooo write(byte[] bArr) {
        ooOO(bArr);
        return this;
    }

    public static final class OooO0O0 extends InputStream {
        public OooO0O0() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(o00000O.this.f60177OooO0o0, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            o00000O o00000o = o00000O.this;
            if (o00000o.f60177OooO0o0 > 0) {
                return o00000o.readByte() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @NotNull
        public final String toString() {
            return o00000O.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] sink, int i, int i2) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return o00000O.this.read(sink, i, i2);
        }
    }

    @Override // p659o0oooO00.o00O000
    public final void write(@NotNull o00000O source, long j) {
        int i;
        o0O0ooO o0o0ooo;
        o0O0ooO o0o0oooOooO0O0;
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        oo00o.OooO0O0(source.f60177OooO0o0, 0L, j);
        while (j > 0) {
            o0O0ooO o0o0ooo2 = source.f60176OooO0Oo;
            Intrinsics.checkNotNull(o0o0ooo2);
            int i2 = o0o0ooo2.f60251OooO0OO;
            o0O0ooO o0o0ooo3 = source.f60176OooO0Oo;
            Intrinsics.checkNotNull(o0o0ooo3);
            if (j < i2 - o0o0ooo3.f60250OooO0O0) {
                o0O0ooO o0o0ooo4 = this.f60176OooO0Oo;
                if (o0o0ooo4 != null) {
                    Intrinsics.checkNotNull(o0o0ooo4);
                    o0o0ooo = o0o0ooo4.f60255OooO0oO;
                } else {
                    o0o0ooo = null;
                }
                if (o0o0ooo != null && o0o0ooo.f60254OooO0o0) {
                    if ((((long) o0o0ooo.f60251OooO0OO) + j) - ((long) (o0o0ooo.f60252OooO0Oo ? 0 : o0o0ooo.f60250OooO0O0)) <= 8192) {
                        o0O0ooO o0o0ooo5 = source.f60176OooO0Oo;
                        Intrinsics.checkNotNull(o0o0ooo5);
                        o0o0ooo5.OooO0Oo(o0o0ooo, (int) j);
                        source.f60177OooO0o0 -= j;
                        this.f60177OooO0o0 += j;
                        return;
                    }
                }
                o0O0ooO o0o0ooo6 = source.f60176OooO0Oo;
                Intrinsics.checkNotNull(o0o0ooo6);
                int i3 = (int) j;
                o0o0ooo6.getClass();
                if (!(i3 > 0 && i3 <= o0o0ooo6.f60251OooO0OO - o0o0ooo6.f60250OooO0O0)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i3 >= 1024) {
                    o0o0oooOooO0O0 = o0o0ooo6.OooO0OO();
                } else {
                    o0o0oooOooO0O0 = o00oOoo.OooO0O0();
                    int i4 = o0o0ooo6.f60250OooO0O0;
                    ArraysKt___ArraysJvmKt.copyInto$default(o0o0ooo6.f60249OooO00o, o0o0oooOooO0O0.f60249OooO00o, 0, i4, i4 + i3, 2, (Object) null);
                }
                o0o0oooOooO0O0.f60251OooO0OO = o0o0oooOooO0O0.f60250OooO0O0 + i3;
                o0o0ooo6.f60250OooO0O0 += i3;
                o0O0ooO o0o0ooo7 = o0o0ooo6.f60255OooO0oO;
                Intrinsics.checkNotNull(o0o0ooo7);
                o0o0ooo7.OooO0O0(o0o0oooOooO0O0);
                source.f60176OooO0Oo = o0o0oooOooO0O0;
            }
            o0O0ooO o0o0ooo8 = source.f60176OooO0Oo;
            Intrinsics.checkNotNull(o0o0ooo8);
            long j2 = o0o0ooo8.f60251OooO0OO - o0o0ooo8.f60250OooO0O0;
            source.f60176OooO0Oo = o0o0ooo8.OooO00o();
            o0O0ooO o0o0ooo9 = this.f60176OooO0Oo;
            if (o0o0ooo9 == null) {
                this.f60176OooO0Oo = o0o0ooo8;
                o0o0ooo8.f60255OooO0oO = o0o0ooo8;
                o0o0ooo8.f60253OooO0o = o0o0ooo8;
            } else {
                Intrinsics.checkNotNull(o0o0ooo9);
                o0O0ooO o0o0ooo10 = o0o0ooo9.f60255OooO0oO;
                Intrinsics.checkNotNull(o0o0ooo10);
                o0o0ooo10.OooO0O0(o0o0ooo8);
                o0O0ooO o0o0ooo11 = o0o0ooo8.f60255OooO0oO;
                if (!(o0o0ooo11 != o0o0ooo8)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                Intrinsics.checkNotNull(o0o0ooo11);
                if (o0o0ooo11.f60254OooO0o0) {
                    int i5 = o0o0ooo8.f60251OooO0OO - o0o0ooo8.f60250OooO0O0;
                    o0O0ooO o0o0ooo12 = o0o0ooo8.f60255OooO0oO;
                    Intrinsics.checkNotNull(o0o0ooo12);
                    int i6 = 8192 - o0o0ooo12.f60251OooO0OO;
                    o0O0ooO o0o0ooo13 = o0o0ooo8.f60255OooO0oO;
                    Intrinsics.checkNotNull(o0o0ooo13);
                    if (o0o0ooo13.f60252OooO0Oo) {
                        i = 0;
                    } else {
                        o0O0ooO o0o0ooo14 = o0o0ooo8.f60255OooO0oO;
                        Intrinsics.checkNotNull(o0o0ooo14);
                        i = o0o0ooo14.f60250OooO0O0;
                    }
                    if (i5 <= i6 + i) {
                        o0O0ooO o0o0ooo15 = o0o0ooo8.f60255OooO0oO;
                        Intrinsics.checkNotNull(o0o0ooo15);
                        o0o0ooo8.OooO0Oo(o0o0ooo15, i5);
                        o0o0ooo8.OooO00o();
                        o00oOoo.OooO00o(o0o0ooo8);
                    }
                }
            }
            source.f60177OooO0o0 -= j2;
            this.f60177OooO0o0 += j2;
            j -= j2;
        }
    }

    public final int read(@NotNull byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        oo00o.OooO0O0(sink.length, i, i2);
        o0O0ooO o0o0ooo = this.f60176OooO0Oo;
        if (o0o0ooo == null) {
            return -1;
        }
        int iMin = Math.min(i2, o0o0ooo.f60251OooO0OO - o0o0ooo.f60250OooO0O0);
        int i3 = o0o0ooo.f60250OooO0O0;
        ArraysKt.copyInto(o0o0ooo.f60249OooO00o, sink, i, i3, i3 + iMin);
        int i4 = o0o0ooo.f60250OooO0O0 + iMin;
        o0o0ooo.f60250OooO0O0 = i4;
        this.f60177OooO0o0 -= (long) iMin;
        if (i4 == o0o0ooo.f60251OooO0OO) {
            this.f60176OooO0Oo = o0o0ooo.OooO00o();
            o00oOoo.OooO00o(o0o0ooo);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            o0O0ooO o0o0oooOooooOo = OooooOo(1);
            int iMin = Math.min(i, 8192 - o0o0oooOooooOo.f60251OooO0OO);
            source.get(o0o0oooOooooOo.f60249OooO00o, o0o0oooOooooOo.f60251OooO0OO, iMin);
            i -= iMin;
            o0o0oooOooooOo.f60251OooO0OO += iMin;
        }
        this.f60177OooO0o0 += (long) iRemaining;
        return iRemaining;
    }
}
