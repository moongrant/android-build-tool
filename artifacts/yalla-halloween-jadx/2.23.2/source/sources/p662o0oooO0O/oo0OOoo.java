package p662o0oooO0O;

import androidx.appcompat.widget.o0000O0;
import androidx.compose.animation.core.AnimationKt;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.OooOOO0;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;
import okio.ByteString;
import okio.SegmentedByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;
import p037OoooOo0.o000O0o;
import p659o0oooO.o00;

/* JADX INFO: loaded from: classes5.dex */
public final class oo0OOoo implements o0O0o0, o0O0o00O, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @Nullable
    public oO0Oo f59827OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f59828OooO0o0;

    public static final class OooO00o implements Closeable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @JvmField
        @Nullable
        public oo0OOoo f59830OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public oO0Oo f59831OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @JvmField
        public boolean f59832OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @JvmField
        @Nullable
        public byte[] f59834OooO0oo;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @JvmField
        public long f59833OooO0oO = -1;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @JvmField
        public int f59829OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @JvmField
        public int f59835OooOO0 = -1;

        public final void OooO00o(long j) {
            oo0OOoo oo0oooo = this.f59830OooO0Oo;
            if (oo0oooo == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f59832OooO0o0) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long j2 = oo0oooo.f59828OooO0o0;
            int i = 1;
            if (j <= j2) {
                if ((j < 0 ? 0 : 1) == 0) {
                    throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("newSize < 0: ", j).toString());
                }
                long j3 = j2 - j;
                while (j3 > 0) {
                    oO0Oo oo0oo = oo0oooo.f59827OooO0Oo;
                    Intrinsics.checkNotNull(oo0oo);
                    oO0Oo oo0oo2 = oo0oo.f59826OooO0oO;
                    Intrinsics.checkNotNull(oo0oo2);
                    int i2 = oo0oo2.f59822OooO0OO;
                    long j4 = i2 - oo0oo2.f59821OooO0O0;
                    if (j4 > j3) {
                        oo0oo2.f59822OooO0OO = i2 - ((int) j3);
                        break;
                    } else {
                        oo0oooo.f59827OooO0Oo = oo0oo2.OooO00o();
                        o0oo0000.OooO00o(oo0oo2);
                        j3 -= j4;
                    }
                }
                this.f59831OooO0o = null;
                this.f59833OooO0oO = j;
                this.f59834OooO0oo = null;
                this.f59829OooO = -1;
                this.f59835OooOO0 = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                boolean z = true;
                while (j5 > 0) {
                    oO0Oo oo0ooOooooo = oo0oooo.Oooooo(i);
                    int iMin = (int) Math.min(j5, 8192 - oo0ooOooooo.f59822OooO0OO);
                    int i3 = oo0ooOooooo.f59822OooO0OO + iMin;
                    oo0ooOooooo.f59822OooO0OO = i3;
                    j5 -= (long) iMin;
                    if (z) {
                        this.f59831OooO0o = oo0ooOooooo;
                        this.f59833OooO0oO = j2;
                        this.f59834OooO0oo = oo0ooOooooo.f59820OooO00o;
                        this.f59829OooO = i3 - iMin;
                        this.f59835OooOO0 = i3;
                        z = false;
                    }
                    i = 1;
                }
            }
            oo0oooo.f59828OooO0o0 = j;
        }

        public final int OooO0OO(long j) {
            long j2;
            oO0Oo oo0oo;
            oo0OOoo oo0oooo = this.f59830OooO0Oo;
            if (oo0oooo == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j >= -1) {
                long j3 = oo0oooo.f59828OooO0o0;
                if (j <= j3) {
                    if (j == -1 || j == j3) {
                        this.f59831OooO0o = null;
                        this.f59833OooO0oO = j;
                        this.f59834OooO0oo = null;
                        this.f59829OooO = -1;
                        this.f59835OooOO0 = -1;
                        return -1;
                    }
                    oO0Oo oo0oo2 = oo0oooo.f59827OooO0Oo;
                    oO0Oo oo0oo3 = this.f59831OooO0o;
                    long j4 = 0;
                    if (oo0oo3 != null) {
                        long j5 = this.f59833OooO0oO;
                        int i = this.f59829OooO;
                        Intrinsics.checkNotNull(oo0oo3);
                        j2 = j5 - ((long) (i - oo0oo3.f59821OooO0O0));
                        if (j2 > j) {
                            oo0oo = this.f59831OooO0o;
                        } else {
                            j4 = j2;
                            j2 = j3;
                            oo0oo = oo0oo2;
                            oo0oo2 = this.f59831OooO0o;
                        }
                    } else {
                        j2 = j3;
                        oo0oo = oo0oo2;
                    }
                    if (j2 - j > j - j4) {
                        while (true) {
                            Intrinsics.checkNotNull(oo0oo2);
                            long j6 = ((long) (oo0oo2.f59822OooO0OO - oo0oo2.f59821OooO0O0)) + j4;
                            if (j < j6) {
                                break;
                            }
                            oo0oo2 = oo0oo2.f59824OooO0o;
                            j4 = j6;
                        }
                    } else {
                        while (j2 > j) {
                            Intrinsics.checkNotNull(oo0oo);
                            oo0oo = oo0oo.f59826OooO0oO;
                            Intrinsics.checkNotNull(oo0oo);
                            j2 -= (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
                        }
                        oo0oo2 = oo0oo;
                        j4 = j2;
                    }
                    if (this.f59832OooO0o0) {
                        Intrinsics.checkNotNull(oo0oo2);
                        if (oo0oo2.f59823OooO0Oo) {
                            byte[] bArr = oo0oo2.f59820OooO00o;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                            oO0Oo oo0oo4 = new oO0Oo(bArrCopyOf, oo0oo2.f59821OooO0O0, oo0oo2.f59822OooO0OO, false, true);
                            if (oo0oooo.f59827OooO0Oo == oo0oo2) {
                                oo0oooo.f59827OooO0Oo = oo0oo4;
                            }
                            oo0oo2.OooO0O0(oo0oo4);
                            oO0Oo oo0oo5 = oo0oo4.f59826OooO0oO;
                            Intrinsics.checkNotNull(oo0oo5);
                            oo0oo5.OooO00o();
                            oo0oo2 = oo0oo4;
                        }
                    }
                    this.f59831OooO0o = oo0oo2;
                    this.f59833OooO0oO = j;
                    Intrinsics.checkNotNull(oo0oo2);
                    this.f59834OooO0oo = oo0oo2.f59820OooO00o;
                    int i2 = oo0oo2.f59821OooO0O0 + ((int) (j - j4));
                    this.f59829OooO = i2;
                    int i3 = oo0oo2.f59822OooO0OO;
                    this.f59835OooOO0 = i3;
                    return i3 - i2;
                }
            }
            StringBuilder sbOooO00o = o00O0000.OooO00o("offset=", j, " > size=");
            sbOooO00o.append(oo0oooo.f59828OooO0o0);
            throw new ArrayIndexOutOfBoundsException(sbOooO00o.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!(this.f59830OooO0Oo != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f59830OooO0Oo = null;
            this.f59831OooO0o = null;
            this.f59833OooO0oO = -1L;
            this.f59834OooO0oo = null;
            this.f59829OooO = -1;
            this.f59835OooOO0 = -1;
        }
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final oo0OOoo OooO0O0() {
        return this;
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final oo0OOoo OooO0Oo() {
        return this;
    }

    public final void OooO0oO() throws EOFException {
        skip(this.f59828OooO0o0);
    }

    @Override // p662o0oooO0O.oO00000
    public final long OooOO0O(@NotNull oo0OOoo sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        long j2 = this.f59828OooO0o0;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.write(this, j);
        return j;
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final o0O0o00O OooOOO0() {
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final /* bridge */ /* synthetic */ o0O0o00O OooOOOO(int i) {
        oo0o0Oo(i);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: OooOOo, reason: merged with bridge method [inline-methods] */
    public final oo0OOoo clone() {
        oo0OOoo oo0oooo = new oo0OOoo();
        if (this.f59828OooO0o0 != 0) {
            oO0Oo oo0oo = this.f59827OooO0Oo;
            Intrinsics.checkNotNull(oo0oo);
            oO0Oo oo0ooOooO0OO = oo0oo.OooO0OO();
            oo0oooo.f59827OooO0Oo = oo0ooOooO0OO;
            oo0ooOooO0OO.f59826OooO0oO = oo0ooOooO0OO;
            oo0ooOooO0OO.f59824OooO0o = oo0ooOooO0OO;
            for (oO0Oo oo0oo2 = oo0oo.f59824OooO0o; oo0oo2 != oo0oo; oo0oo2 = oo0oo2.f59824OooO0o) {
                oO0Oo oo0oo3 = oo0ooOooO0OO.f59826OooO0oO;
                Intrinsics.checkNotNull(oo0oo3);
                Intrinsics.checkNotNull(oo0oo2);
                oo0oo3.OooO0O0(oo0oo2.OooO0OO());
            }
            oo0oooo.f59828OooO0o0 = this.f59828OooO0o0;
        }
        return oo0oooo;
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final o0O0o00O OooOOo0(long j) {
        o0O0O00(oO000.OooO0Oo(j));
        return this;
    }

    @JvmName(name = "getByte")
    public final byte OooOo(long j) {
        oO000.OooO0O0(this.f59828OooO0o0, j, 1L);
        oO0Oo oo0oo = this.f59827OooO0Oo;
        if (oo0oo == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j2 = this.f59828OooO0o0;
        if (j2 - j < j) {
            while (j2 > j) {
                oo0oo = oo0oo.f59826OooO0oO;
                Intrinsics.checkNotNull(oo0oo);
                j2 -= (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
            }
            Intrinsics.checkNotNull(oo0oo);
            return oo0oo.f59820OooO00o[(int) ((((long) oo0oo.f59821OooO0O0) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0)) + j3;
            if (j4 > j) {
                Intrinsics.checkNotNull(oo0oo);
                return oo0oo.f59820OooO00o[(int) ((((long) oo0oo.f59821OooO0O0) + j) - j3)];
            }
            oo0oo = oo0oo.f59824OooO0o;
            Intrinsics.checkNotNull(oo0oo);
            j3 = j4;
        }
    }

    @NotNull
    public final void OooOo0(long j, long j2, @NotNull oo0OOoo out) {
        Intrinsics.checkNotNullParameter(out, "out");
        oO000.OooO0O0(this.f59828OooO0o0, j, j2);
        if (j2 == 0) {
            return;
        }
        out.f59828OooO0o0 += j2;
        oO0Oo oo0oo = this.f59827OooO0Oo;
        while (true) {
            Intrinsics.checkNotNull(oo0oo);
            long j3 = oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0;
            if (j < j3) {
                break;
            }
            j -= j3;
            oo0oo = oo0oo.f59824OooO0o;
        }
        while (j2 > 0) {
            Intrinsics.checkNotNull(oo0oo);
            oO0Oo oo0ooOooO0OO = oo0oo.OooO0OO();
            int i = oo0ooOooO0OO.f59821OooO0O0 + ((int) j);
            oo0ooOooO0OO.f59821OooO0O0 = i;
            oo0ooOooO0OO.f59822OooO0OO = Math.min(i + ((int) j2), oo0ooOooO0OO.f59822OooO0OO);
            oO0Oo oo0oo2 = out.f59827OooO0Oo;
            if (oo0oo2 == null) {
                oo0ooOooO0OO.f59826OooO0oO = oo0ooOooO0OO;
                oo0ooOooO0OO.f59824OooO0o = oo0ooOooO0OO;
                out.f59827OooO0Oo = oo0ooOooO0OO;
            } else {
                Intrinsics.checkNotNull(oo0oo2);
                oO0Oo oo0oo3 = oo0oo2.f59826OooO0oO;
                Intrinsics.checkNotNull(oo0oo3);
                oo0oo3.OooO0O0(oo0ooOooO0OO);
            }
            j2 -= (long) (oo0ooOooO0OO.f59822OooO0OO - oo0ooOooO0OO.f59821OooO0O0);
            oo0oo = oo0oo.f59824OooO0o;
            j = 0;
        }
    }

    public final long OooOo00() {
        long j = this.f59828OooO0o0;
        if (j == 0) {
            return 0L;
        }
        oO0Oo oo0oo = this.f59827OooO0Oo;
        Intrinsics.checkNotNull(oo0oo);
        oO0Oo oo0oo2 = oo0oo.f59826OooO0oO;
        Intrinsics.checkNotNull(oo0oo2);
        int i = oo0oo2.f59822OooO0OO;
        if (i < 8192 && oo0oo2.f59825OooO0o0) {
            j -= (long) (i - oo0oo2.f59821OooO0O0);
        }
        return j;
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final o0O0o00O OooOoO() {
        return this;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final long OooOoO0(@NotNull ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return Oooo0(0L, targetBytes);
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final String OooOooO(long j) throws EOFException {
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
            return o00.OooO00o(this, jOooo00o);
        }
        if (j2 < this.f59828OooO0o0 && OooOo(j2 - 1) == ((byte) 13) && OooOo(j2) == b) {
            return o00.OooO00o(this, j2);
        }
        oo0OOoo oo0oooo = new oo0OOoo();
        OooOo0(0L, Math.min(32, this.f59828OooO0o0), oo0oooo);
        throw new EOFException("\\n not found: limit=" + Math.min(this.f59828OooO0o0, j) + " content=" + oo0oooo.Oooo0o0().OooO0o() + Typography.ellipsis);
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
        oO0Oo oo0oo = this.f59827OooO0Oo;
        if (oo0oo != null) {
            long j3 = this.f59828OooO0o0;
            if (j3 - j < j) {
                while (j3 > j) {
                    oo0oo = oo0oo.f59826OooO0oO;
                    Intrinsics.checkNotNull(oo0oo);
                    j3 -= (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
                }
                byte[] bArr = targetBytes.data;
                if (bArr.length == 2) {
                    byte b = bArr[0];
                    byte b2 = bArr[1];
                    while (j3 < this.f59828OooO0o0) {
                        byte[] bArr2 = oo0oo.f59820OooO00o;
                        i3 = (int) ((((long) oo0oo.f59821OooO0O0) + j) - j3);
                        int i5 = oo0oo.f59822OooO0OO;
                        while (i3 < i5) {
                            byte b3 = bArr2[i3];
                            if (b3 == b || b3 == b2) {
                                i4 = oo0oo.f59821OooO0O0;
                                return ((long) (i3 - i4)) + j3;
                            }
                            i3++;
                        }
                        j3 += (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
                        oo0oo = oo0oo.f59824OooO0o;
                        Intrinsics.checkNotNull(oo0oo);
                        j = j3;
                    }
                } else {
                    while (j3 < this.f59828OooO0o0) {
                        byte[] bArr3 = oo0oo.f59820OooO00o;
                        i3 = (int) ((((long) oo0oo.f59821OooO0O0) + j) - j3);
                        int i6 = oo0oo.f59822OooO0OO;
                        while (i3 < i6) {
                            byte b4 = bArr3[i3];
                            for (byte b5 : bArr) {
                                if (b4 == b5) {
                                    i4 = oo0oo.f59821OooO0O0;
                                    return ((long) (i3 - i4)) + j3;
                                }
                            }
                            i3++;
                        }
                        j3 += (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
                        oo0oo = oo0oo.f59824OooO0o;
                        Intrinsics.checkNotNull(oo0oo);
                        j = j3;
                    }
                }
            } else {
                while (true) {
                    long j4 = ((long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0)) + j2;
                    if (j4 > j) {
                        break;
                    }
                    oo0oo = oo0oo.f59824OooO0o;
                    Intrinsics.checkNotNull(oo0oo);
                    j2 = j4;
                }
                byte[] bArr4 = targetBytes.data;
                if (bArr4.length == 2) {
                    byte b6 = bArr4[0];
                    byte b7 = bArr4[1];
                    while (j2 < this.f59828OooO0o0) {
                        byte[] bArr5 = oo0oo.f59820OooO00o;
                        i = (int) ((((long) oo0oo.f59821OooO0O0) + j) - j2);
                        int i7 = oo0oo.f59822OooO0OO;
                        while (i < i7) {
                            byte b8 = bArr5[i];
                            if (b8 == b6 || b8 == b7) {
                                i2 = oo0oo.f59821OooO0O0;
                                return ((long) (i - i2)) + j2;
                            }
                            i++;
                        }
                        j2 += (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
                        oo0oo = oo0oo.f59824OooO0o;
                        Intrinsics.checkNotNull(oo0oo);
                        j = j2;
                    }
                } else {
                    while (j2 < this.f59828OooO0o0) {
                        byte[] bArr6 = oo0oo.f59820OooO00o;
                        i = (int) ((((long) oo0oo.f59821OooO0O0) + j) - j2);
                        int i8 = oo0oo.f59822OooO0OO;
                        while (i < i8) {
                            byte b9 = bArr6[i];
                            for (byte b10 : bArr4) {
                                if (b9 == b10) {
                                    i2 = oo0oo.f59821OooO0O0;
                                    return ((long) (i - i2)) + j2;
                                }
                            }
                            i++;
                        }
                        j2 += (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
                        oo0oo = oo0oo.f59824OooO0o;
                        Intrinsics.checkNotNull(oo0oo);
                        j = j2;
                    }
                }
            }
        }
        return -1L;
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final /* bridge */ /* synthetic */ o0O0o00O Oooo000(String str) {
        o00000OO(str);
        return this;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final boolean Oooo00O(long j, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.data.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j < 0 || length < 0 || this.f59828OooO0o0 - j < length || bytes.data.length - 0 < length) {
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
        oO0Oo oo0oo;
        long j3 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.f59828OooO0o0);
            OooOOO0.OooO00o(sb, " fromIndex=", j, " toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j4 = this.f59828OooO0o0;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j != j2 && (oo0oo = this.f59827OooO0Oo) != null) {
            if (j4 - j < j) {
                while (j4 > j) {
                    oo0oo = oo0oo.f59826OooO0oO;
                    Intrinsics.checkNotNull(oo0oo);
                    j4 -= (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
                }
                while (j4 < j2) {
                    byte[] bArr = oo0oo.f59820OooO00o;
                    int iMin = (int) Math.min(oo0oo.f59822OooO0OO, (((long) oo0oo.f59821OooO0O0) + j2) - j4);
                    for (int i = (int) ((((long) oo0oo.f59821OooO0O0) + j) - j4); i < iMin; i++) {
                        if (bArr[i] == b) {
                            return ((long) (i - oo0oo.f59821OooO0O0)) + j4;
                        }
                    }
                    j4 += (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
                    oo0oo = oo0oo.f59824OooO0o;
                    Intrinsics.checkNotNull(oo0oo);
                    j = j4;
                }
            } else {
                while (true) {
                    long j5 = ((long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0)) + j3;
                    if (j5 > j) {
                        break;
                    }
                    oo0oo = oo0oo.f59824OooO0o;
                    Intrinsics.checkNotNull(oo0oo);
                    j3 = j5;
                }
                while (j3 < j2) {
                    byte[] bArr2 = oo0oo.f59820OooO00o;
                    int iMin2 = (int) Math.min(oo0oo.f59822OooO0OO, (((long) oo0oo.f59821OooO0O0) + j2) - j3);
                    for (int i2 = (int) ((((long) oo0oo.f59821OooO0O0) + j) - j3); i2 < iMin2; i2++) {
                        if (bArr2[i2] == b) {
                            return ((long) (i2 - oo0oo.f59821OooO0O0)) + j3;
                        }
                    }
                    j3 += (long) (oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
                    oo0oo = oo0oo.f59824OooO0o;
                    Intrinsics.checkNotNull(oo0oo);
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
        byte[] bArr = o00.f59624OooO00o;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        OooO00o oooO00o = oO000.f59809OooO00o;
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == oO000.f59809OooO00o) {
            unsafeCursor = new OooO00o();
        }
        if (!(unsafeCursor.f59830OooO0Oo == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.f59830OooO0Oo = this;
        unsafeCursor.f59832OooO0o0 = true;
        return unsafeCursor;
    }

    @NotNull
    public final byte[] Oooo0OO(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount: ", j).toString());
        }
        if (this.f59828OooO0o0 < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final void Oooo0o(@NotNull oo0OOoo sink, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = this.f59828OooO0o0;
        if (j2 >= j) {
            sink.write(this, j);
        } else {
            sink.write(this, j2);
            throw new EOFException();
        }
    }

    @NotNull
    public final ByteString Oooo0o0() {
        return Oooooo0(this.f59828OooO0o0);
    }

    public final long Oooo0oO() throws EOFException {
        if (this.f59828OooO0o0 == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = -7;
        long j2 = 0;
        boolean z2 = false;
        do {
            oO0Oo oo0oo = this.f59827OooO0Oo;
            Intrinsics.checkNotNull(oo0oo);
            byte[] bArr = oo0oo.f59820OooO00o;
            int i2 = oo0oo.f59821OooO0O0;
            int i3 = oo0oo.f59822OooO0OO;
            while (i2 < i3) {
                byte b = bArr[i2];
                byte b2 = (byte) 48;
                if (b >= b2 && b <= ((byte) 57)) {
                    int i4 = b2 - b;
                    if (j2 < -922337203685477580L || (j2 == -922337203685477580L && i4 < j)) {
                        oo0OOoo oo0oooo = new oo0OOoo();
                        oo0oooo.Ooooo00(j2);
                        oo0oooo.o00o0O(b);
                        if (!z) {
                            oo0oooo.readByte();
                        }
                        throw new NumberFormatException("Number too large: ".concat(oo0oooo.OoooOO0()));
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
                this.f59827OooO0Oo = oo0oo.OooO00o();
                o0oo0000.OooO00o(oo0oo);
            } else {
                oo0oo.f59821OooO0O0 = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f59827OooO0Oo != null);
        long j3 = this.f59828OooO0o0 - ((long) i);
        this.f59828OooO0o0 = j3;
        if (i >= (z ? 2 : 1)) {
            return z ? j2 : -j2;
        }
        if (j3 == 0) {
            throw new EOFException();
        }
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbOooO0O0.append(oO000.OooO0o0(OooOo(0L)));
        throw new NumberFormatException(sbOooO0O0.toString());
    }

    @NotNull
    public final String OoooO0(long j, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount: ", j).toString());
        }
        if (this.f59828OooO0o0 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        oO0Oo oo0oo = this.f59827OooO0Oo;
        Intrinsics.checkNotNull(oo0oo);
        int i = oo0oo.f59821OooO0O0;
        if (((long) i) + j > oo0oo.f59822OooO0OO) {
            return new String(Oooo0OO(j), charset);
        }
        int i2 = (int) j;
        String str = new String(oo0oo.f59820OooO00o, i, i2, charset);
        int i3 = oo0oo.f59821OooO0O0 + i2;
        oo0oo.f59821OooO0O0 = i3;
        this.f59828OooO0o0 -= j;
        if (i3 == oo0oo.f59822OooO0OO) {
            this.f59827OooO0Oo = oo0oo.OooO00o();
            o0oo0000.OooO00o(oo0oo);
        }
        return str;
    }

    public final short OoooO00() throws EOFException {
        short s = readShort();
        OooO00o oooO00o = oO000.f59809OooO00o;
        int i = s & UShort.MAX_VALUE;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final String OoooO0O() throws EOFException {
        return OooOooO(LongCompanionObject.MAX_VALUE);
    }

    @NotNull
    public final String OoooOO0() {
        return OoooO0(this.f59828OooO0o0, Charsets.UTF_8);
    }

    @Override // p662o0oooO0O.o0O0o0
    public final void OoooOoO(long j) throws EOFException {
        if (this.f59828OooO0o0 < j) {
            throw new EOFException();
        }
    }

    public final int OoooOoo() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f59828OooO0o0 == 0) {
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
        if (this.f59828OooO0o0 < j) {
            StringBuilder sbOooO0O0 = o0000O0.OooO0O0("size < ", i2, ": ");
            sbOooO0O0.append(this.f59828OooO0o0);
            sbOooO0O0.append(" (to read code point prefixed 0x");
            sbOooO0O0.append(oO000.OooO0o0(bOooOo));
            sbOooO0O0.append(')');
            throw new EOFException(sbOooO0O0.toString());
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

    @Override // p662o0oooO0O.o0O0o0
    public final int Ooooo0o(@NotNull o0OOO0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iOooO0O0 = o00.OooO0O0(this, options, false);
        if (iOooO0O0 == -1) {
            return -1;
        }
        skip(options.f59782OooO0Oo[iOooO0O0].OooO0o0());
        return iOooO0O0;
    }

    @NotNull
    public final ByteString OooooO0(int i) {
        if (i == 0) {
            return ByteString.f60193OooO0oO;
        }
        oO000.OooO0O0(this.f59828OooO0o0, 0L, i);
        oO0Oo oo0oo = this.f59827OooO0Oo;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(oo0oo);
            int i5 = oo0oo.f59822OooO0OO;
            int i6 = oo0oo.f59821OooO0O0;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            oo0oo = oo0oo.f59824OooO0o;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        oO0Oo oo0oo2 = this.f59827OooO0Oo;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(oo0oo2);
            bArr[i7] = oo0oo2.f59820OooO00o;
            i2 += oo0oo2.f59822OooO0OO - oo0oo2.f59821OooO0O0;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = oo0oo2.f59821OooO0O0;
            oo0oo2.f59823OooO0Oo = true;
            i7++;
            oo0oo2 = oo0oo2.f59824OooO0o;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final String OooooOO(long j) throws EOFException {
        return OoooO0(j, Charsets.UTF_8);
    }

    @NotNull
    public final oO0Oo Oooooo(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        oO0Oo oo0oo = this.f59827OooO0Oo;
        if (oo0oo == null) {
            oO0Oo oo0ooOooO0O0 = o0oo0000.OooO0O0();
            this.f59827OooO0Oo = oo0ooOooO0O0;
            oo0ooOooO0O0.f59826OooO0oO = oo0ooOooO0O0;
            oo0ooOooO0O0.f59824OooO0o = oo0ooOooO0O0;
            return oo0ooOooO0O0;
        }
        Intrinsics.checkNotNull(oo0oo);
        oO0Oo oo0oo2 = oo0oo.f59826OooO0oO;
        Intrinsics.checkNotNull(oo0oo2);
        if (oo0oo2.f59822OooO0OO + i <= 8192 && oo0oo2.f59825OooO0o0) {
            return oo0oo2;
        }
        oO0Oo oo0ooOooO0O1 = o0oo0000.OooO0O0();
        oo0oo2.OooO0O0(oo0ooOooO0O1);
        return oo0ooOooO0O1;
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final ByteString Oooooo0(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(androidx.compose.ui.input.key.OooO00o.OooO00o("byteCount: ", j).toString());
        }
        if (this.f59828OooO0o0 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(Oooo0OO(j));
        }
        ByteString byteStringOooooO0 = OooooO0((int) j);
        skip(j);
        return byteStringOooooO0;
    }

    @NotNull
    public final void OoooooO(int i, int i2, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        oO000.OooO0O0(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            oO0Oo oo0ooOooooo = Oooooo(1);
            int iMin = Math.min(i3 - i, 8192 - oo0ooOooooo.f59822OooO0OO);
            int i4 = i + iMin;
            ArraysKt.copyInto(source, oo0ooOooooo.f59820OooO00o, oo0ooOooooo.f59822OooO0OO, i, i4);
            oo0ooOooooo.f59822OooO0OO += iMin;
            i = i4;
        }
        this.f59828OooO0o0 += j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p662o0oooO0O.ooo0Oo0
    public final void close() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof oo0OOoo) {
                long j = this.f59828OooO0o0;
                oo0OOoo oo0oooo = (oo0OOoo) obj;
                if (j == oo0oooo.f59828OooO0o0) {
                    if (j != 0) {
                        oO0Oo oo0oo = this.f59827OooO0Oo;
                        Intrinsics.checkNotNull(oo0oo);
                        oO0Oo oo0oo2 = oo0oooo.f59827OooO0Oo;
                        Intrinsics.checkNotNull(oo0oo2);
                        int i = oo0oo.f59821OooO0O0;
                        int i2 = oo0oo2.f59821OooO0O0;
                        long j2 = 0;
                        while (j2 < this.f59828OooO0o0) {
                            long jMin = Math.min(oo0oo.f59822OooO0OO - i, oo0oo2.f59822OooO0OO - i2);
                            long j3 = 0;
                            while (j3 < jMin) {
                                int i3 = i + 1;
                                byte b = oo0oo.f59820OooO00o[i];
                                int i4 = i2 + 1;
                                if (b == oo0oo2.f59820OooO00o[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == oo0oo.f59822OooO0OO) {
                                oO0Oo oo0oo3 = oo0oo.f59824OooO0o;
                                Intrinsics.checkNotNull(oo0oo3);
                                i = oo0oo3.f59821OooO0O0;
                                oo0oo = oo0oo3;
                            }
                            if (i2 == oo0oo2.f59822OooO0OO) {
                                oo0oo2 = oo0oo2.f59824OooO0o;
                                Intrinsics.checkNotNull(oo0oo2);
                                i2 = oo0oo2.f59821OooO0O0;
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

    @Override // p662o0oooO0O.o0O0o00O, p662o0oooO0O.ooo0Oo0, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        oO0Oo oo0oo = this.f59827OooO0Oo;
        if (oo0oo == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = oo0oo.f59822OooO0OO;
            for (int i3 = oo0oo.f59821OooO0O0; i3 < i2; i3++) {
                i = (i * 31) + oo0oo.f59820OooO00o[i3];
            }
            oo0oo = oo0oo.f59824OooO0o;
            Intrinsics.checkNotNull(oo0oo);
        } while (oo0oo != this.f59827OooO0Oo);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @NotNull
    public final oo0OOoo o000000(@NotNull String string, int i, int i2, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (!(i2 <= string.length())) {
            StringBuilder sbOooO0O0 = o0000O0.OooO0O0("endIndex > string.length: ", i2, " > ");
            sbOooO0O0.append(string.length());
            throw new IllegalArgumentException(sbOooO0O0.toString().toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            o000000O(i, i2, string);
            return this;
        }
        String strSubstring = string.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        OoooooO(0, bytes.length, bytes);
        return this;
    }

    @NotNull
    public final void o000000O(int i, int i2, @NotNull String string) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (!(i2 <= string.length())) {
            StringBuilder sbOooO0O0 = o0000O0.OooO0O0("endIndex > string.length: ", i2, " > ");
            sbOooO0O0.append(string.length());
            throw new IllegalArgumentException(sbOooO0O0.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                oO0Oo oo0ooOooooo = Oooooo(1);
                int i3 = oo0ooOooooo.f59822OooO0OO - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = oo0ooOooooo.f59820OooO00o;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = oo0ooOooooo.f59822OooO0OO;
                int i6 = (i3 + i) - i5;
                oo0ooOooooo.f59822OooO0OO = i5 + i6;
                this.f59828OooO0o0 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    oO0Oo oo0ooOooooo2 = Oooooo(2);
                    int i7 = oo0ooOooooo2.f59822OooO0OO;
                    byte[] bArr2 = oo0ooOooooo2.f59820OooO00o;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    oo0ooOooooo2.f59822OooO0OO = i7 + 2;
                    this.f59828OooO0o0 += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    oO0Oo oo0ooOooooo3 = Oooooo(3);
                    int i8 = oo0ooOooooo3.f59822OooO0OO;
                    byte[] bArr3 = oo0ooOooooo3.f59820OooO00o;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    oo0ooOooooo3.f59822OooO0OO = i8 + 3;
                    this.f59828OooO0o0 += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            oO0Oo oo0ooOooooo4 = Oooooo(4);
                            int i11 = oo0ooOooooo4.f59822OooO0OO;
                            byte[] bArr4 = oo0ooOooooo4.f59820OooO00o;
                            bArr4[i11] = (byte) ((i10 >> 18) | 240);
                            bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                            oo0ooOooooo4.f59822OooO0OO = i11 + 4;
                            this.f59828OooO0o0 += 4;
                            i += 2;
                        }
                    }
                    o00o0O(63);
                    i = i9;
                }
                i++;
            }
        }
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final String o000000o(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return OoooO0(this.f59828OooO0o0, charset);
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final /* bridge */ /* synthetic */ o0O0o00O o00000O(long j) {
        o0ooOoO(j);
        return this;
    }

    @NotNull
    public final void o00000OO(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        o000000O(0, string.length(), string);
    }

    @NotNull
    public final void o00000o0(int i) {
        String strConcatToString;
        if (i < 128) {
            o00o0O(i);
            return;
        }
        if (i < 2048) {
            oO0Oo oo0ooOooooo = Oooooo(2);
            int i2 = oo0ooOooooo.f59822OooO0OO;
            byte[] bArr = oo0ooOooooo.f59820OooO00o;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            oo0ooOooooo.f59822OooO0OO = i2 + 2;
            this.f59828OooO0o0 += 2;
            return;
        }
        int i3 = 0;
        if (55296 <= i && i < 57344) {
            o00o0O(63);
            return;
        }
        if (i < 65536) {
            oO0Oo oo0ooOooooo2 = Oooooo(3);
            int i4 = oo0ooOooooo2.f59822OooO0OO;
            byte[] bArr2 = oo0ooOooooo2.f59820OooO00o;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i & 63) | 128);
            oo0ooOooooo2.f59822OooO0OO = i4 + 3;
            this.f59828OooO0o0 += 3;
            return;
        }
        if (i <= 1114111) {
            oO0Oo oo0ooOooooo3 = Oooooo(4);
            int i5 = oo0ooOooooo3.f59822OooO0OO;
            byte[] bArr3 = oo0ooOooooo3.f59820OooO00o;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i & 63) | 128);
            oo0ooOooooo3.f59822OooO0OO = i5 + 4;
            this.f59828OooO0o0 += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        OooO00o oooO00o = oO000.f59809OooO00o;
        if (i != 0) {
            char[] cArr = p659o0oooO.o00O0000.f59652OooO00o;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            strConcatToString = StringsKt__StringsJVMKt.concatToString(cArr2, i3, 8);
        } else {
            strConcatToString = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        sb.append(strConcatToString);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p662o0oooO0O.o0O0o0
    public final long o00000oo(@NotNull o0O0o00O sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = this.f59828OooO0o0;
        if (j > 0) {
            sink.write(this, j);
        }
        return j;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final long o0000Oo0() throws EOFException {
        int i;
        if (this.f59828OooO0o0 == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            oO0Oo oo0oo = this.f59827OooO0Oo;
            Intrinsics.checkNotNull(oo0oo);
            byte[] bArr = oo0oo.f59820OooO00o;
            int i3 = oo0oo.f59821OooO0O0;
            int i4 = oo0oo.f59822OooO0OO;
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
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + oO000.OooO0o0(b));
                    }
                    i = (b - b3) + 10;
                } else {
                    i = b - b2;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    oo0OOoo oo0oooo = new oo0OOoo();
                    oo0oooo.o0ooOoO(j);
                    oo0oooo.o00o0O(b);
                    throw new NumberFormatException("Number too large: ".concat(oo0oooo.OoooOO0()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f59827OooO0Oo = oo0oo.OooO00o();
                o0oo0000.OooO00o(oo0oo);
            } else {
                oo0oo.f59821OooO0O0 = i3;
            }
            if (z) {
                break;
            }
        } while (this.f59827OooO0Oo != null);
        this.f59828OooO0o0 -= (long) i2;
        return j;
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final InputStream o0000OoO() {
        return new OooO0O0();
    }

    @Override // p662o0oooO0O.o0O0o0
    public final int o0000Ooo() throws EOFException {
        int i = readInt();
        OooO00o oooO00o = oO000.f59809OooO00o;
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final /* bridge */ /* synthetic */ o0O0o00O o0000oo(ByteString byteString) {
        o00O0O(byteString);
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final /* bridge */ /* synthetic */ o0O0o00O o000OO(int i, int i2, byte[] bArr) {
        OoooooO(i, i2, bArr);
        return this;
    }

    @NotNull
    public final void o000OOo(int i) {
        oO0Oo oo0ooOooooo = Oooooo(2);
        int i2 = oo0ooOooooo.f59822OooO0OO;
        int i3 = i2 + 1;
        byte[] bArr = oo0ooOooooo.f59820OooO00o;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        oo0ooOooooo.f59822OooO0OO = i3 + 1;
        this.f59828OooO0o0 += 2;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final long o000oOoO() throws EOFException {
        return oO000.OooO0Oo(readLong());
    }

    @NotNull
    public final void o00O0O(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.OooOo0(this, byteString.OooO0o0());
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final long o00Oo0(@NotNull oO00000 source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long jOooOO0O = source.OooOO0O(this, 8192L);
            if (jOooOO0O == -1) {
                return j;
            }
            j += jOooOO0O;
        }
    }

    @NotNull
    public final void o00Ooo(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        OoooooO(0, source.length, source);
    }

    @NotNull
    public final void o00o0O(int i) {
        oO0Oo oo0ooOooooo = Oooooo(1);
        int i2 = oo0ooOooooo.f59822OooO0OO;
        oo0ooOooooo.f59822OooO0OO = i2 + 1;
        oo0ooOooooo.f59820OooO00o[i2] = (byte) i;
        this.f59828OooO0o0++;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final boolean o00oO0O() {
        return this.f59828OooO0o0 == 0;
    }

    @Override // p662o0oooO0O.o0O0o00O
    @NotNull
    /* JADX INFO: renamed from: o00oO0o, reason: merged with bridge method [inline-methods] */
    public final oo0OOoo Ooooo00(long j) {
        boolean z;
        byte[] bArr;
        if (j == 0) {
            o00o0O(48);
        } else {
            int i = 1;
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    o00000OO("-9223372036854775808");
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
            oO0Oo oo0ooOooooo = Oooooo(i);
            int i2 = oo0ooOooooo.f59822OooO0OO + i;
            while (true) {
                bArr = oo0ooOooooo.f59820OooO00o;
                if (j == 0) {
                    break;
                }
                long j2 = 10;
                i2--;
                bArr[i2] = o00.f59624OooO00o[(int) (j % j2)];
                j /= j2;
            }
            if (z) {
                bArr[i2 - 1] = (byte) 45;
            }
            oo0ooOooooo.f59822OooO0OO += i;
            this.f59828OooO0o0 += (long) i;
        }
        return this;
    }

    @Override // p662o0oooO0O.o0O0o0
    @NotNull
    public final byte[] o00ooo() {
        return Oooo0OO(this.f59828OooO0o0);
    }

    @NotNull
    public final void o0O0O00(long j) {
        oO0Oo oo0ooOooooo = Oooooo(8);
        int i = oo0ooOooooo.f59822OooO0OO;
        int i2 = i + 1;
        byte[] bArr = oo0ooOooooo.f59820OooO00o;
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
        oo0ooOooooo.f59822OooO0OO = i8 + 1;
        this.f59828OooO0o0 += 8;
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final /* bridge */ /* synthetic */ o0O0o00O o0OoOo0(int i) {
        o000OOo(i);
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final /* bridge */ /* synthetic */ o0O0o00O o0ooOO0(int i) {
        o00o0O(i);
        return this;
    }

    @NotNull
    public final oo0OOoo o0ooOoO(long j) {
        if (j == 0) {
            o00o0O(48);
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
            oO0Oo oo0ooOooooo = Oooooo(i);
            int i2 = oo0ooOooooo.f59822OooO0OO;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                oo0ooOooooo.f59820OooO00o[i3] = o00.f59624OooO00o[(int) (15 & j)];
                j >>>= 4;
            }
            oo0ooOooooo.f59822OooO0OO += i;
            this.f59828OooO0o0 += (long) i;
        }
        return this;
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final o0O0o00O oo000o(int i) {
        OooO00o oooO00o = oO000.f59809OooO00o;
        oo0o0Oo(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
        return this;
    }

    @NotNull
    public final void oo0o0Oo(int i) {
        oO0Oo oo0ooOooooo = Oooooo(4);
        int i2 = oo0ooOooooo.f59822OooO0OO;
        int i3 = i2 + 1;
        byte[] bArr = oo0ooOooooo.f59820OooO00o;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        oo0ooOooooo.f59822OooO0OO = i5 + 1;
        this.f59828OooO0o0 += 4;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        oO0Oo oo0oo = this.f59827OooO0Oo;
        if (oo0oo == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
        sink.put(oo0oo.f59820OooO00o, oo0oo.f59821OooO0O0, iMin);
        int i = oo0oo.f59821OooO0O0 + iMin;
        oo0oo.f59821OooO0O0 = i;
        this.f59828OooO0o0 -= (long) iMin;
        if (i == oo0oo.f59822OooO0OO) {
            this.f59827OooO0Oo = oo0oo.OooO00o();
            o0oo0000.OooO00o(oo0oo);
        }
        return iMin;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final byte readByte() throws EOFException {
        if (this.f59828OooO0o0 == 0) {
            throw new EOFException();
        }
        oO0Oo oo0oo = this.f59827OooO0Oo;
        Intrinsics.checkNotNull(oo0oo);
        int i = oo0oo.f59821OooO0O0;
        int i2 = oo0oo.f59822OooO0OO;
        int i3 = i + 1;
        byte b = oo0oo.f59820OooO00o[i];
        this.f59828OooO0o0--;
        if (i3 == i2) {
            this.f59827OooO0Oo = oo0oo.OooO00o();
            o0oo0000.OooO00o(oo0oo);
        } else {
            oo0oo.f59821OooO0O0 = i3;
        }
        return b;
    }

    @Override // p662o0oooO0O.o0O0o0
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

    @Override // p662o0oooO0O.o0O0o0
    public final int readInt() throws EOFException {
        if (this.f59828OooO0o0 < 4) {
            throw new EOFException();
        }
        oO0Oo oo0oo = this.f59827OooO0Oo;
        Intrinsics.checkNotNull(oo0oo);
        int i = oo0oo.f59821OooO0O0;
        int i2 = oo0oo.f59822OooO0OO;
        if (i2 - i < 4) {
            return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
        }
        int i3 = i + 1;
        byte[] bArr = oo0oo.f59820OooO00o;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i3] & UByte.MAX_VALUE) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & UByte.MAX_VALUE);
        this.f59828OooO0o0 -= 4;
        if (i8 == i2) {
            this.f59827OooO0Oo = oo0oo.OooO00o();
            o0oo0000.OooO00o(oo0oo);
        } else {
            oo0oo.f59821OooO0O0 = i8;
        }
        return i9;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final long readLong() throws EOFException {
        if (this.f59828OooO0o0 < 8) {
            throw new EOFException();
        }
        oO0Oo oo0oo = this.f59827OooO0Oo;
        Intrinsics.checkNotNull(oo0oo);
        int i = oo0oo.f59821OooO0O0;
        int i2 = oo0oo.f59822OooO0OO;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        int i3 = i + 1;
        byte[] bArr = oo0oo.f59820OooO00o;
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
        this.f59828OooO0o0 -= 8;
        if (i10 == i2) {
            this.f59827OooO0Oo = oo0oo.OooO00o();
            o0oo0000.OooO00o(oo0oo);
        } else {
            oo0oo.f59821OooO0O0 = i10;
        }
        return j8;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final short readShort() throws EOFException {
        if (this.f59828OooO0o0 < 2) {
            throw new EOFException();
        }
        oO0Oo oo0oo = this.f59827OooO0Oo;
        Intrinsics.checkNotNull(oo0oo);
        int i = oo0oo.f59821OooO0O0;
        int i2 = oo0oo.f59822OooO0OO;
        if (i2 - i < 2) {
            return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
        }
        int i3 = i + 1;
        byte[] bArr = oo0oo.f59820OooO00o;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & UByte.MAX_VALUE) << 8) | (bArr[i3] & UByte.MAX_VALUE);
        this.f59828OooO0o0 -= 2;
        if (i4 == i2) {
            this.f59827OooO0Oo = oo0oo.OooO00o();
            o0oo0000.OooO00o(oo0oo);
        } else {
            oo0oo.f59821OooO0O0 = i4;
        }
        return (short) i5;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final boolean request(long j) {
        return this.f59828OooO0o0 >= j;
    }

    @Override // p662o0oooO0O.o0O0o0
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            oO0Oo oo0oo = this.f59827OooO0Oo;
            if (oo0oo == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
            long j2 = iMin;
            this.f59828OooO0o0 -= j2;
            j -= j2;
            int i = oo0oo.f59821OooO0O0 + iMin;
            oo0oo.f59821OooO0O0 = i;
            if (i == oo0oo.f59822OooO0OO) {
                this.f59827OooO0Oo = oo0oo.OooO00o();
                o0oo0000.OooO00o(oo0oo);
            }
        }
    }

    @Override // p662o0oooO0O.oO00000
    @NotNull
    public final oO00000o timeout() {
        return oO00000o.f59811OooO0Oo;
    }

    @NotNull
    public final String toString() {
        long j = this.f59828OooO0o0;
        if (j <= 2147483647L) {
            return OooooO0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f59828OooO0o0).toString());
    }

    @Override // p662o0oooO0O.o0O0o00O
    public final /* bridge */ /* synthetic */ o0O0o00O write(byte[] bArr) {
        o00Ooo(bArr);
        return this;
    }

    public static final class OooO0O0 extends InputStream {
        public OooO0O0() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(oo0OOoo.this.f59828OooO0o0, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            oo0OOoo oo0oooo = oo0OOoo.this;
            if (oo0oooo.f59828OooO0o0 > 0) {
                return oo0oooo.readByte() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @NotNull
        public final String toString() {
            return oo0OOoo.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] sink, int i, int i2) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return oo0OOoo.this.read(sink, i, i2);
        }
    }

    @Override // p662o0oooO0O.ooo0Oo0
    public final void write(@NotNull oo0OOoo source, long j) {
        int i;
        oO0Oo oo0oo;
        oO0Oo oo0ooOooO0O0;
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        oO000.OooO0O0(source.f59828OooO0o0, 0L, j);
        while (j > 0) {
            oO0Oo oo0oo2 = source.f59827OooO0Oo;
            Intrinsics.checkNotNull(oo0oo2);
            int i2 = oo0oo2.f59822OooO0OO;
            oO0Oo oo0oo3 = source.f59827OooO0Oo;
            Intrinsics.checkNotNull(oo0oo3);
            if (j < i2 - oo0oo3.f59821OooO0O0) {
                oO0Oo oo0oo4 = this.f59827OooO0Oo;
                if (oo0oo4 != null) {
                    Intrinsics.checkNotNull(oo0oo4);
                    oo0oo = oo0oo4.f59826OooO0oO;
                } else {
                    oo0oo = null;
                }
                if (oo0oo != null && oo0oo.f59825OooO0o0) {
                    if ((((long) oo0oo.f59822OooO0OO) + j) - ((long) (oo0oo.f59823OooO0Oo ? 0 : oo0oo.f59821OooO0O0)) <= 8192) {
                        oO0Oo oo0oo5 = source.f59827OooO0Oo;
                        Intrinsics.checkNotNull(oo0oo5);
                        oo0oo5.OooO0Oo(oo0oo, (int) j);
                        source.f59828OooO0o0 -= j;
                        this.f59828OooO0o0 += j;
                        return;
                    }
                }
                oO0Oo oo0oo6 = source.f59827OooO0Oo;
                Intrinsics.checkNotNull(oo0oo6);
                int i3 = (int) j;
                oo0oo6.getClass();
                if (!(i3 > 0 && i3 <= oo0oo6.f59822OooO0OO - oo0oo6.f59821OooO0O0)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i3 >= 1024) {
                    oo0ooOooO0O0 = oo0oo6.OooO0OO();
                } else {
                    oo0ooOooO0O0 = o0oo0000.OooO0O0();
                    int i4 = oo0oo6.f59821OooO0O0;
                    ArraysKt___ArraysJvmKt.copyInto$default(oo0oo6.f59820OooO00o, oo0ooOooO0O0.f59820OooO00o, 0, i4, i4 + i3, 2, (Object) null);
                }
                oo0ooOooO0O0.f59822OooO0OO = oo0ooOooO0O0.f59821OooO0O0 + i3;
                oo0oo6.f59821OooO0O0 += i3;
                oO0Oo oo0oo7 = oo0oo6.f59826OooO0oO;
                Intrinsics.checkNotNull(oo0oo7);
                oo0oo7.OooO0O0(oo0ooOooO0O0);
                source.f59827OooO0Oo = oo0ooOooO0O0;
            }
            oO0Oo oo0oo8 = source.f59827OooO0Oo;
            Intrinsics.checkNotNull(oo0oo8);
            long j2 = oo0oo8.f59822OooO0OO - oo0oo8.f59821OooO0O0;
            source.f59827OooO0Oo = oo0oo8.OooO00o();
            oO0Oo oo0oo9 = this.f59827OooO0Oo;
            if (oo0oo9 == null) {
                this.f59827OooO0Oo = oo0oo8;
                oo0oo8.f59826OooO0oO = oo0oo8;
                oo0oo8.f59824OooO0o = oo0oo8;
            } else {
                Intrinsics.checkNotNull(oo0oo9);
                oO0Oo oo0oo10 = oo0oo9.f59826OooO0oO;
                Intrinsics.checkNotNull(oo0oo10);
                oo0oo10.OooO0O0(oo0oo8);
                oO0Oo oo0oo11 = oo0oo8.f59826OooO0oO;
                if (!(oo0oo11 != oo0oo8)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                Intrinsics.checkNotNull(oo0oo11);
                if (oo0oo11.f59825OooO0o0) {
                    int i5 = oo0oo8.f59822OooO0OO - oo0oo8.f59821OooO0O0;
                    oO0Oo oo0oo12 = oo0oo8.f59826OooO0oO;
                    Intrinsics.checkNotNull(oo0oo12);
                    int i6 = 8192 - oo0oo12.f59822OooO0OO;
                    oO0Oo oo0oo13 = oo0oo8.f59826OooO0oO;
                    Intrinsics.checkNotNull(oo0oo13);
                    if (oo0oo13.f59823OooO0Oo) {
                        i = 0;
                    } else {
                        oO0Oo oo0oo14 = oo0oo8.f59826OooO0oO;
                        Intrinsics.checkNotNull(oo0oo14);
                        i = oo0oo14.f59821OooO0O0;
                    }
                    if (i5 <= i6 + i) {
                        oO0Oo oo0oo15 = oo0oo8.f59826OooO0oO;
                        Intrinsics.checkNotNull(oo0oo15);
                        oo0oo8.OooO0Oo(oo0oo15, i5);
                        oo0oo8.OooO00o();
                        o0oo0000.OooO00o(oo0oo8);
                    }
                }
            }
            source.f59828OooO0o0 -= j2;
            this.f59828OooO0o0 += j2;
            j -= j2;
        }
    }

    public final int read(@NotNull byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        oO000.OooO0O0(sink.length, i, i2);
        oO0Oo oo0oo = this.f59827OooO0Oo;
        if (oo0oo == null) {
            return -1;
        }
        int iMin = Math.min(i2, oo0oo.f59822OooO0OO - oo0oo.f59821OooO0O0);
        int i3 = oo0oo.f59821OooO0O0;
        ArraysKt.copyInto(oo0oo.f59820OooO00o, sink, i, i3, i3 + iMin);
        int i4 = oo0oo.f59821OooO0O0 + iMin;
        oo0oo.f59821OooO0O0 = i4;
        this.f59828OooO0o0 -= (long) iMin;
        if (i4 == oo0oo.f59822OooO0OO) {
            this.f59827OooO0Oo = oo0oo.OooO00o();
            o0oo0000.OooO00o(oo0oo);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            oO0Oo oo0ooOooooo = Oooooo(1);
            int iMin = Math.min(i, 8192 - oo0ooOooooo.f59822OooO0OO);
            source.get(oo0ooOooooo.f59820OooO00o, oo0ooOooooo.f59822OooO0OO, iMin);
            i -= iMin;
            oo0ooOooooo.f59822OooO0OO += iMin;
        }
        this.f59828OooO0o0 += (long) iRemaining;
        return iRemaining;
    }
}
