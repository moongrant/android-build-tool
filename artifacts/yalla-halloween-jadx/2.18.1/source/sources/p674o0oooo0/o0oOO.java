package p674o0oooo0;

import androidx.appcompat.widget.o00000O0;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.AppEventsConstants;
import com.umeng.analytics.pro.bz;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okio.ByteString;
import okio.SegmentedByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O00OO;
import p676o0oooo0O.oOo0000O;
import p676o0oooo0O.oOo000o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOO implements o0oOOo, oo00oO, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @JvmField
    @Nullable
    public o0O00OOO f52098Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f52099Oooo0oO;

    public static final class OooO00o implements Closeable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @JvmField
        @Nullable
        public o0oOO f52101Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @JvmField
        public boolean f52102Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public o0O00OOO f52103Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @JvmField
        @Nullable
        public byte[] f52105OoooO00;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @JvmField
        public long f52100Oooo = -1;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @JvmField
        public int f52104OoooO0 = -1;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @JvmField
        public int f52106OoooO0O = -1;

        public final long OooO00o(long j) {
            o0oOO o0ooo2 = this.f52101Oooo0o;
            if (o0ooo2 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f52102Oooo0oO) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long j2 = o0ooo2.f52099Oooo0oO;
            int i = 1;
            if (j <= j2) {
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("newSize < 0: ", j).toString());
                }
                long j3 = j2 - j;
                while (j3 > 0) {
                    o0O00OOO o0o00ooo2 = o0ooo2.f52098Oooo0o;
                    Intrinsics.checkNotNull(o0o00ooo2);
                    o0O00OOO o0o00ooo3 = o0o00ooo2.f52073OooO0oO;
                    Intrinsics.checkNotNull(o0o00ooo3);
                    int i2 = o0o00ooo3.f52069OooO0OO;
                    long j4 = i2 - o0o00ooo3.f52068OooO0O0;
                    if (j4 > j3) {
                        o0o00ooo3.f52069OooO0OO = i2 - ((int) j3);
                        break;
                    }
                    o0ooo2.f52098Oooo0o = o0o00ooo3.OooO00o();
                    o0oO0Ooo.OooO0O0(o0o00ooo3);
                    j3 -= j4;
                }
                this.f52103Oooo0oo = null;
                this.f52100Oooo = j;
                this.f52105OoooO00 = null;
                this.f52104OoooO0 = -1;
                this.f52106OoooO0O = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                boolean z = true;
                while (j5 > 0) {
                    o0O00OOO o0o00oooO000oOoO = o0ooo2.o000oOoO(i);
                    int iMin = (int) Math.min(j5, 8192 - o0o00oooO000oOoO.f52069OooO0OO);
                    int i3 = o0o00oooO000oOoO.f52069OooO0OO + iMin;
                    o0o00oooO000oOoO.f52069OooO0OO = i3;
                    j5 -= (long) iMin;
                    if (z) {
                        this.f52103Oooo0oo = o0o00oooO000oOoO;
                        this.f52100Oooo = j2;
                        this.f52105OoooO00 = o0o00oooO000oOoO.f52067OooO00o;
                        this.f52104OoooO0 = i3 - iMin;
                        this.f52106OoooO0O = i3;
                        z = false;
                    }
                    i = 1;
                }
            }
            o0ooo2.f52099Oooo0oO = j;
            return j2;
        }

        public final int OooO0O0(long j) {
            long j2;
            o0O00OOO o0o00ooo2;
            o0oOO o0ooo2 = this.f52101Oooo0o;
            if (o0ooo2 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j >= -1) {
                long j3 = o0ooo2.f52099Oooo0oO;
                if (j <= j3) {
                    if (j == -1 || j == j3) {
                        this.f52103Oooo0oo = null;
                        this.f52100Oooo = j;
                        this.f52105OoooO00 = null;
                        this.f52104OoooO0 = -1;
                        this.f52106OoooO0O = -1;
                        return -1;
                    }
                    o0O00OOO o0o00ooo3 = o0ooo2.f52098Oooo0o;
                    o0O00OOO o0o00ooo4 = this.f52103Oooo0oo;
                    if (o0o00ooo4 != null) {
                        long j4 = this.f52100Oooo;
                        int i = this.f52104OoooO0;
                        Intrinsics.checkNotNull(o0o00ooo4);
                        j2 = j4 - ((long) (i - o0o00ooo4.f52068OooO0O0));
                        if (j2 > j) {
                            o0o00ooo2 = o0o00ooo3;
                            o0o00ooo3 = this.f52103Oooo0oo;
                            j3 = j2;
                            j2 = 0;
                        } else {
                            o0o00ooo2 = this.f52103Oooo0oo;
                        }
                    } else {
                        j2 = 0;
                        o0o00ooo2 = o0o00ooo3;
                    }
                    if (j3 - j > j - j2) {
                        while (true) {
                            Intrinsics.checkNotNull(o0o00ooo2);
                            int i2 = o0o00ooo2.f52069OooO0OO;
                            int i3 = o0o00ooo2.f52068OooO0O0;
                            if (j < ((long) (i2 - i3)) + j2) {
                                break;
                            }
                            j2 += (long) (i2 - i3);
                            o0o00ooo2 = o0o00ooo2.f52071OooO0o;
                        }
                    } else {
                        while (j3 > j) {
                            Intrinsics.checkNotNull(o0o00ooo3);
                            o0o00ooo3 = o0o00ooo3.f52073OooO0oO;
                            Intrinsics.checkNotNull(o0o00ooo3);
                            j3 -= (long) (o0o00ooo3.f52069OooO0OO - o0o00ooo3.f52068OooO0O0);
                        }
                        o0o00ooo2 = o0o00ooo3;
                        j2 = j3;
                    }
                    if (this.f52102Oooo0oO) {
                        Intrinsics.checkNotNull(o0o00ooo2);
                        if (o0o00ooo2.f52070OooO0Oo) {
                            byte[] bArr = o0o00ooo2.f52067OooO00o;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                            o0O00OOO o0o00ooo5 = new o0O00OOO(bArrCopyOf, o0o00ooo2.f52068OooO0O0, o0o00ooo2.f52069OooO0OO, false, true);
                            if (o0ooo2.f52098Oooo0o == o0o00ooo2) {
                                o0ooo2.f52098Oooo0o = o0o00ooo5;
                            }
                            o0o00ooo2.OooO0O0(o0o00ooo5);
                            o0O00OOO o0o00ooo6 = o0o00ooo5.f52073OooO0oO;
                            Intrinsics.checkNotNull(o0o00ooo6);
                            o0o00ooo6.OooO00o();
                            o0o00ooo2 = o0o00ooo5;
                        }
                    }
                    this.f52103Oooo0oo = o0o00ooo2;
                    this.f52100Oooo = j;
                    Intrinsics.checkNotNull(o0o00ooo2);
                    this.f52105OoooO00 = o0o00ooo2.f52067OooO00o;
                    int i4 = o0o00ooo2.f52068OooO0O0 + ((int) (j - j2));
                    this.f52104OoooO0 = i4;
                    int i5 = o0o00ooo2.f52069OooO0OO;
                    this.f52106OoooO0O = i5;
                    return i5 - i4;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + o0ooo2.f52099Oooo0oO);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!(this.f52101Oooo0o != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f52101Oooo0o = null;
            this.f52103Oooo0oo = null;
            this.f52100Oooo = -1L;
            this.f52105OoooO00 = null;
            this.f52104OoooO0 = -1;
            this.f52106OoooO0O = -1;
        }
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final o0oOO OooO0OO() {
        return this;
    }

    public final void OooO0Oo() throws EOFException {
        skip(this.f52099Oooo0oO);
    }

    @NotNull
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final o0oOO clone() {
        o0oOO o0ooo2 = new o0oOO();
        if (this.f52099Oooo0oO != 0) {
            o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
            Intrinsics.checkNotNull(o0o00ooo2);
            o0O00OOO o0o00oooOooO0OO = o0o00ooo2.OooO0OO();
            o0ooo2.f52098Oooo0o = o0o00oooOooO0OO;
            o0o00oooOooO0OO.f52073OooO0oO = o0o00oooOooO0OO;
            o0o00oooOooO0OO.f52071OooO0o = o0o00oooOooO0OO;
            for (o0O00OOO o0o00ooo3 = o0o00ooo2.f52071OooO0o; o0o00ooo3 != o0o00ooo2; o0o00ooo3 = o0o00ooo3.f52071OooO0o) {
                o0O00OOO o0o00ooo4 = o0o00oooOooO0OO.f52073OooO0oO;
                Intrinsics.checkNotNull(o0o00ooo4);
                Intrinsics.checkNotNull(o0o00ooo3);
                o0o00ooo4.OooO0O0(o0o00ooo3.OooO0OO());
            }
            o0ooo2.f52099Oooo0oO = this.f52099Oooo0oO;
        }
        return o0ooo2;
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final o0oOO OooO0o0() {
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    public final /* bridge */ /* synthetic */ oo00oO OooOO0(byte[] bArr) {
        OoooOOo(bArr);
        return this;
    }

    @Override // p674o0oooo0.o0oOOo
    public final long OooOO0O(@NotNull o0O00o00 sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = this.f52099Oooo0oO;
        if (j > 0) {
            sink.write(this, j);
        }
        return j;
    }

    public final long OooOOO() {
        long j = this.f52099Oooo0oO;
        if (j == 0) {
            return 0L;
        }
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        Intrinsics.checkNotNull(o0o00ooo2);
        o0O00OOO o0o00ooo3 = o0o00ooo2.f52073OooO0oO;
        Intrinsics.checkNotNull(o0o00ooo3);
        int i = o0o00ooo3.f52069OooO0OO;
        if (i < 8192 && o0o00ooo3.f52072OooO0o0) {
            j -= (long) (i - o0o00ooo3.f52068OooO0O0);
        }
        return j;
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final String OooOOO0(long j) throws EOFException {
        return Oooo0OO(j, Charsets.UTF_8);
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final ByteString OooOOOo(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount: ", j).toString());
        }
        if (this.f52099Oooo0oO < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(o0OO00O(j));
        }
        ByteString byteStringOoooOO0 = OoooOO0((int) j);
        skip(j);
        return byteStringOoooOO0;
    }

    @NotNull
    public final o0oOO OooOOo(@NotNull o0oOO out, long j, long j2) {
        Intrinsics.checkNotNullParameter(out, "out");
        o00OOO0O.OooO0O0(this.f52099Oooo0oO, j, j2);
        if (j2 != 0) {
            out.f52099Oooo0oO += j2;
            o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
            while (true) {
                Intrinsics.checkNotNull(o0o00ooo2);
                int i = o0o00ooo2.f52069OooO0OO;
                int i2 = o0o00ooo2.f52068OooO0O0;
                if (j < i - i2) {
                    break;
                }
                j -= (long) (i - i2);
                o0o00ooo2 = o0o00ooo2.f52071OooO0o;
            }
            while (j2 > 0) {
                Intrinsics.checkNotNull(o0o00ooo2);
                o0O00OOO o0o00oooOooO0OO = o0o00ooo2.OooO0OO();
                int i3 = o0o00oooOooO0OO.f52068OooO0O0 + ((int) j);
                o0o00oooOooO0OO.f52068OooO0O0 = i3;
                o0o00oooOooO0OO.f52069OooO0OO = Math.min(i3 + ((int) j2), o0o00oooOooO0OO.f52069OooO0OO);
                o0O00OOO o0o00ooo3 = out.f52098Oooo0o;
                if (o0o00ooo3 == null) {
                    o0o00oooOooO0OO.f52073OooO0oO = o0o00oooOooO0OO;
                    o0o00oooOooO0OO.f52071OooO0o = o0o00oooOooO0OO;
                    out.f52098Oooo0o = o0o00oooOooO0OO;
                } else {
                    Intrinsics.checkNotNull(o0o00ooo3);
                    o0O00OOO o0o00ooo4 = o0o00ooo3.f52073OooO0oO;
                    Intrinsics.checkNotNull(o0o00ooo4);
                    o0o00ooo4.OooO0O0(o0o00oooOooO0OO);
                }
                j2 -= (long) (o0o00oooOooO0OO.f52069OooO0OO - o0o00oooOooO0OO.f52068OooO0O0);
                o0o00ooo2 = o0o00ooo2.f52071OooO0o;
                j = 0;
            }
        }
        return this;
    }

    @JvmName(name = "getByte")
    public final byte OooOOoo(long j) {
        o00OOO0O.OooO0O0(this.f52099Oooo0oO, j, 1L);
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        if (o0o00ooo2 == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j2 = this.f52099Oooo0oO;
        if (j2 - j < j) {
            while (j2 > j) {
                o0o00ooo2 = o0o00ooo2.f52073OooO0oO;
                Intrinsics.checkNotNull(o0o00ooo2);
                j2 -= (long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
            }
            Intrinsics.checkNotNull(o0o00ooo2);
            return o0o00ooo2.f52067OooO00o[(int) ((((long) o0o00ooo2.f52068OooO0O0) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0)) + j3;
            if (j4 > j) {
                Intrinsics.checkNotNull(o0o00ooo2);
                return o0o00ooo2.f52067OooO00o[(int) ((((long) o0o00ooo2.f52068OooO0O0) + j) - j3)];
            }
            o0o00ooo2 = o0o00ooo2.f52071OooO0o;
            Intrinsics.checkNotNull(o0o00ooo2);
            j3 = j4;
        }
    }

    @Override // p674o0oooo0.oo00oO
    public final /* bridge */ /* synthetic */ oo00oO OooOo0(int i) {
        o00Oo0(i);
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    public final oo00oO OooOo00() {
        return this;
    }

    public final long OooOo0O(byte b, long j, long j2) {
        o0O00OOO o0o00ooo2;
        long j3 = 0;
        if (!(0 <= j && j2 >= j)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("size=");
            sbOooO0o0.append(this.f52099Oooo0oO);
            sbOooO0o0.append(" fromIndex=");
            sbOooO0o0.append(j);
            sbOooO0o0.append(" toIndex=");
            sbOooO0o0.append(j2);
            throw new IllegalArgumentException(sbOooO0o0.toString().toString());
        }
        long j4 = this.f52099Oooo0oO;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j != j2 && (o0o00ooo2 = this.f52098Oooo0o) != null) {
            if (j4 - j < j) {
                while (j4 > j) {
                    o0o00ooo2 = o0o00ooo2.f52073OooO0oO;
                    Intrinsics.checkNotNull(o0o00ooo2);
                    j4 -= (long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
                }
                while (j4 < j2) {
                    byte[] bArr = o0o00ooo2.f52067OooO00o;
                    int iMin = (int) Math.min(o0o00ooo2.f52069OooO0OO, (((long) o0o00ooo2.f52068OooO0O0) + j2) - j4);
                    for (int i = (int) ((((long) o0o00ooo2.f52068OooO0O0) + j) - j4); i < iMin; i++) {
                        if (bArr[i] == b) {
                            return ((long) (i - o0o00ooo2.f52068OooO0O0)) + j4;
                        }
                    }
                    j4 += (long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
                    o0o00ooo2 = o0o00ooo2.f52071OooO0o;
                    Intrinsics.checkNotNull(o0o00ooo2);
                    j = j4;
                }
            } else {
                while (true) {
                    long j5 = ((long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0)) + j3;
                    if (j5 > j) {
                        break;
                    }
                    o0o00ooo2 = o0o00ooo2.f52071OooO0o;
                    Intrinsics.checkNotNull(o0o00ooo2);
                    j3 = j5;
                }
                while (j3 < j2) {
                    byte[] bArr2 = o0o00ooo2.f52067OooO00o;
                    int iMin2 = (int) Math.min(o0o00ooo2.f52069OooO0OO, (((long) o0o00ooo2.f52068OooO0O0) + j2) - j3);
                    for (int i2 = (int) ((((long) o0o00ooo2.f52068OooO0O0) + j) - j3); i2 < iMin2; i2++) {
                        if (bArr2[i2] == b) {
                            return ((long) (i2 - o0o00ooo2.f52068OooO0O0)) + j3;
                        }
                    }
                    j3 += (long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
                    o0o00ooo2 = o0o00ooo2.f52071OooO0o;
                    Intrinsics.checkNotNull(o0o00ooo2);
                    j = j3;
                }
            }
        }
        return -1L;
    }

    @Override // p674o0oooo0.oo00oO
    public final /* bridge */ /* synthetic */ oo00oO OooOo0o(int i) {
        o0OoOo0(i);
        return this;
    }

    public final long OooOoO(@NotNull ByteString targetBytes, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        long j2 = j;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j3 = 0;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("fromIndex < 0: ", j2).toString());
        }
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        if (o0o00ooo2 == null) {
            return -1L;
        }
        long j4 = this.f52099Oooo0oO;
        if (j4 - j2 < j2) {
            while (j4 > j2) {
                o0o00ooo2 = o0o00ooo2.f52073OooO0oO;
                Intrinsics.checkNotNull(o0o00ooo2);
                j4 -= (long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
            }
            if (targetBytes.OooO0o0() == 2) {
                byte bOooO0oo = targetBytes.OooO0oo(0);
                byte bOooO0oo2 = targetBytes.OooO0oo(1);
                while (j4 < this.f52099Oooo0oO) {
                    byte[] bArr = o0o00ooo2.f52067OooO00o;
                    i3 = (int) ((((long) o0o00ooo2.f52068OooO0O0) + j2) - j4);
                    int i5 = o0o00ooo2.f52069OooO0OO;
                    while (i3 < i5) {
                        byte b = bArr[i3];
                        if (b == bOooO0oo || b == bOooO0oo2) {
                            i4 = o0o00ooo2.f52068OooO0O0;
                        } else {
                            i3++;
                        }
                    }
                    j4 += (long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
                    o0o00ooo2 = o0o00ooo2.f52071OooO0o;
                    Intrinsics.checkNotNull(o0o00ooo2);
                    j2 = j4;
                }
                return -1L;
            }
            byte[] data = targetBytes.getData();
            while (j4 < this.f52099Oooo0oO) {
                byte[] bArr2 = o0o00ooo2.f52067OooO00o;
                i3 = (int) ((((long) o0o00ooo2.f52068OooO0O0) + j2) - j4);
                int i6 = o0o00ooo2.f52069OooO0OO;
                while (i3 < i6) {
                    byte b2 = bArr2[i3];
                    for (byte b3 : data) {
                        if (b2 == b3) {
                            i4 = o0o00ooo2.f52068OooO0O0;
                        }
                    }
                    i3++;
                }
                j4 += (long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
                o0o00ooo2 = o0o00ooo2.f52071OooO0o;
                Intrinsics.checkNotNull(o0o00ooo2);
                j2 = j4;
            }
            return -1L;
            return ((long) (i3 - i4)) + j4;
        }
        while (true) {
            long j5 = ((long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0)) + j3;
            if (j5 > j2) {
                break;
            }
            o0o00ooo2 = o0o00ooo2.f52071OooO0o;
            Intrinsics.checkNotNull(o0o00ooo2);
            j3 = j5;
        }
        if (targetBytes.OooO0o0() == 2) {
            byte bOooO0oo3 = targetBytes.OooO0oo(0);
            byte bOooO0oo4 = targetBytes.OooO0oo(1);
            while (j3 < this.f52099Oooo0oO) {
                byte[] bArr3 = o0o00ooo2.f52067OooO00o;
                i = (int) ((((long) o0o00ooo2.f52068OooO0O0) + j2) - j3);
                int i7 = o0o00ooo2.f52069OooO0OO;
                while (i < i7) {
                    byte b4 = bArr3[i];
                    if (b4 == bOooO0oo3 || b4 == bOooO0oo4) {
                        i2 = o0o00ooo2.f52068OooO0O0;
                    } else {
                        i++;
                    }
                }
                j3 += (long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
                o0o00ooo2 = o0o00ooo2.f52071OooO0o;
                Intrinsics.checkNotNull(o0o00ooo2);
                j2 = j3;
            }
            return -1L;
        }
        byte[] data2 = targetBytes.getData();
        while (j3 < this.f52099Oooo0oO) {
            byte[] bArr4 = o0o00ooo2.f52067OooO00o;
            i = (int) ((((long) o0o00ooo2.f52068OooO0O0) + j2) - j3);
            int i8 = o0o00ooo2.f52069OooO0OO;
            while (i < i8) {
                byte b5 = bArr4[i];
                for (byte b6 : data2) {
                    if (b5 == b6) {
                        i2 = o0o00ooo2.f52068OooO0O0;
                    }
                }
                i++;
            }
            j3 += (long) (o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
            o0o00ooo2 = o0o00ooo2.f52071OooO0o;
            Intrinsics.checkNotNull(o0o00ooo2);
            j2 = j3;
        }
        return -1L;
        return ((long) (i - i2)) + j3;
    }

    @Override // p674o0oooo0.oo00oO
    public final oo00oO OooOoO0(long j) {
        ooOO(o00OOO0O.OooO0Oo(j));
        return this;
    }

    @JvmOverloads
    @NotNull
    public final OooO00o OooOoOO(@NotNull OooO00o unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = oOo0000O.f52108OooO00o;
        Intrinsics.checkNotNullParameter(this, "$this$commonReadAndWriteUnsafe");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (!(unsafeCursor.f52101Oooo0o == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.f52101Oooo0o = this;
        unsafeCursor.f52102Oooo0oO = true;
        return unsafeCursor;
    }

    @NotNull
    public final ByteString OooOoo() {
        return OooOOOo(this.f52099Oooo0oO);
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final byte[] OooOoo0() {
        return o0OO00O(this.f52099Oooo0oO);
    }

    @Override // p674o0oooo0.oo00oO
    public final oo00oO OooOooO(int i) {
        o0OoOo0(o00OOO0O.OooO0OO(i));
        return this;
    }

    @Override // p674o0oooo0.o0oOOo
    public final boolean OooOooo() {
        return this.f52099Oooo0oO == 0;
    }

    public final short Oooo0() throws EOFException {
        int i = readShort() & UShort.MAX_VALUE;
        return (short) (((i & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | ((65280 & i) >>> 8));
    }

    @Override // p674o0oooo0.oo00oO
    public final /* bridge */ /* synthetic */ oo00oO Oooo000(int i) {
        Ooooo0o(i);
        return this;
    }

    public final long Oooo00o() throws EOFException {
        long j = 0;
        if (this.f52099Oooo0oO == 0) {
            throw new EOFException();
        }
        long j2 = -7;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        do {
            o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
            Intrinsics.checkNotNull(o0o00ooo2);
            byte[] bArr = o0o00ooo2.f52067OooO00o;
            int i2 = o0o00ooo2.f52068OooO0O0;
            int i3 = o0o00ooo2.f52069OooO0OO;
            while (i2 < i3) {
                byte b = bArr[i2];
                byte b2 = (byte) 48;
                if (b >= b2 && b <= ((byte) 57)) {
                    int i4 = b2 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        o0oOO o0oooO0000O0 = new o0oOO().o0000O0(j);
                        o0oooO0000O0.Ooooo0o(b);
                        if (!z) {
                            o0oooO0000O0.readByte();
                        }
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Number too large: ");
                        sbOooO0o0.append(o0oooO0000O0.Oooo0o());
                        throw new NumberFormatException(sbOooO0o0.toString());
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != ((byte) 45) || i != 0) {
                        if (i != 0) {
                            z2 = true;
                            break;
                        }
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Expected leading [0-9] or '-' character but was 0x");
                        sbOooO0o1.append(o00OOO0O.OooO0o0(b));
                        throw new NumberFormatException(sbOooO0o1.toString());
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.f52098Oooo0o = o0o00ooo2.OooO00o();
                o0oO0Ooo.OooO0O0(o0o00ooo2);
            } else {
                o0o00ooo2.f52068OooO0O0 = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f52098Oooo0o != null);
        this.f52099Oooo0oO -= (long) i;
        return z ? j : -j;
    }

    @Override // p674o0oooo0.o0O0O0O
    public final long Oooo0O0(@NotNull o0oOO sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j).toString());
        }
        long j2 = this.f52099Oooo0oO;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.write(this, j);
        return j;
    }

    @NotNull
    public final String Oooo0OO(long j, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount: ", j).toString());
        }
        if (this.f52099Oooo0oO < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        Intrinsics.checkNotNull(o0o00ooo2);
        int i = o0o00ooo2.f52068OooO0O0;
        if (((long) i) + j > o0o00ooo2.f52069OooO0OO) {
            return new String(o0OO00O(j), charset);
        }
        int i2 = (int) j;
        String str = new String(o0o00ooo2.f52067OooO00o, i, i2, charset);
        int i3 = o0o00ooo2.f52068OooO0O0 + i2;
        o0o00ooo2.f52068OooO0O0 = i3;
        this.f52099Oooo0oO -= j;
        if (i3 == o0o00ooo2.f52069OooO0OO) {
            this.f52098Oooo0o = o0o00ooo2.OooO00o();
            o0oO0Ooo.OooO0O0(o0o00ooo2);
        }
        return str;
    }

    @NotNull
    public final String Oooo0o() {
        return Oooo0OO(this.f52099Oooo0oO, Charsets.UTF_8);
    }

    @Override // p674o0oooo0.o0oOOo
    public final long Oooo0oO(@NotNull ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return OooOoO(targetBytes, 0L);
    }

    @Override // p674o0oooo0.oo00oO
    public final oo00oO Oooo0oo() {
        return this;
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final String OoooO(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("limit < 0: ", j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long jOooOo0O = OooOo0O(b, 0L, j2);
        if (jOooOo0O != -1) {
            return oOo0000O.OooO00o(this, jOooOo0O);
        }
        if (j2 < this.f52099Oooo0oO && OooOOoo(j2 - 1) == ((byte) 13) && OooOOoo(j2) == b) {
            return oOo0000O.OooO00o(this, j2);
        }
        o0oOO o0ooo2 = new o0oOO();
        OooOOo(o0ooo2, 0L, Math.min(32, this.f52099Oooo0oO));
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("\\n not found: limit=");
        sbOooO0o0.append(Math.min(this.f52099Oooo0oO, j));
        sbOooO0o0.append(" content=");
        sbOooO0o0.append(o0ooo2.OooOoo().OooO0o());
        sbOooO0o0.append(Typography.ellipsis);
        throw new EOFException(sbOooO0o0.toString());
    }

    public final int OoooO0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f52099Oooo0oO == 0) {
            throw new EOFException();
        }
        byte bOooOOoo = OooOOoo(0L);
        if ((bOooOOoo & ByteCompanionObject.MIN_VALUE) == 0) {
            i = bOooOOoo & ByteCompanionObject.MAX_VALUE;
            i2 = 1;
            i3 = 0;
        } else if ((bOooOOoo & 224) == 192) {
            i = bOooOOoo & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bOooOOoo & 240) == 224) {
            i = bOooOOoo & bz.m;
            i2 = 3;
            i3 = RecyclerView.oo0o0Oo.FLAG_MOVED;
        } else {
            if ((bOooOOoo & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bOooOOoo & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f52099Oooo0oO < j) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("size < ", i2, ": ");
            sbOooO00o.append(this.f52099Oooo0oO);
            sbOooO00o.append(" (to read code point prefixed 0x");
            sbOooO00o.append(o00OOO0O.OooO0o0(bOooOOoo));
            sbOooO00o.append(')');
            throw new EOFException(sbOooO00o.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bOooOOoo2 = OooOOoo(j2);
            if ((bOooOOoo2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bOooOOoo2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 <= i && 57343 >= i) || i < i3) {
            return 65533;
        }
        return i;
    }

    @NotNull
    public final ByteString OoooOO0(int i) {
        if (i == 0) {
            return ByteString.f53046Oooo;
        }
        o00OOO0O.OooO0O0(this.f52099Oooo0oO, 0L, i);
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(o0o00ooo2);
            int i5 = o0o00ooo2.f52069OooO0OO;
            int i6 = o0o00ooo2.f52068OooO0O0;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            o0o00ooo2 = o0o00ooo2.f52071OooO0o;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        o0O00OOO o0o00ooo3 = this.f52098Oooo0o;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(o0o00ooo3);
            bArr[i7] = o0o00ooo3.f52067OooO00o;
            i2 += o0o00ooo3.f52069OooO0OO - o0o00ooo3.f52068OooO0O0;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = o0o00ooo3.f52068OooO0O0;
            o0o00ooo3.f52070OooO0Oo = true;
            i7++;
            o0o00ooo3 = o0o00ooo3.f52071OooO0o;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public final o0oOO OoooOOO(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.OooOOOO(this, byteString.OooO0o0());
        return this;
    }

    @NotNull
    public final o0oOO OoooOOo(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        OoooOoO(source, 0, source.length);
        return this;
    }

    @NotNull
    public final o0oOO OoooOoO(@NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        o00OOO0O.OooO0O0(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            o0O00OOO o0o00oooO000oOoO = o000oOoO(1);
            int iMin = Math.min(i3 - i, 8192 - o0o00oooO000oOoO.f52069OooO0OO);
            int i4 = i + iMin;
            ArraysKt.copyInto(source, o0o00oooO000oOoO.f52067OooO00o, o0o00oooO000oOoO.f52069OooO0OO, i, i4);
            o0o00oooO000oOoO.f52069OooO0OO += iMin;
            i = i4;
        }
        this.f52099Oooo0oO += j;
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    public final /* bridge */ /* synthetic */ oo00oO OoooOoo(String str) {
        o00oO0o(str);
        return this;
    }

    @Override // p674o0oooo0.o0oOOo
    public final boolean Ooooo00(long j, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.data.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j < 0 || length < 0 || this.f52099Oooo0oO - j < length || bytes.data.length - 0 < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (OooOOoo(((long) i) + j) != bytes.data[0 + i]) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final o0oOO Ooooo0o(int i) {
        o0O00OOO o0o00oooO000oOoO = o000oOoO(1);
        byte[] bArr = o0o00oooO000oOoO.f52067OooO00o;
        int i2 = o0o00oooO000oOoO.f52069OooO0OO;
        o0o00oooO000oOoO.f52069OooO0OO = i2 + 1;
        bArr[i2] = (byte) i;
        this.f52099Oooo0oO++;
        return this;
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final String OooooO0(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Oooo0OO(this.f52099Oooo0oO, charset);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5 A[LOOP:0: B:69:0x00f1->B:71:0x00f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0105  */
    @Override // p674o0oooo0.oo00oO
    @NotNull
    /* JADX INFO: renamed from: OooooOO, reason: merged with bridge method [inline-methods] */
    public final o0oOO o0000O0(long j) {
        byte[] bArr;
        int i;
        if (j == 0) {
            Ooooo0o(48);
        } else {
            boolean z = false;
            int i2 = 1;
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    o00oO0o("-9223372036854775808");
                } else {
                    z = true;
                    if (j < 100000000) {
                        if (j < 10000) {
                            if (j < 100) {
                                if (j >= 10) {
                                    i2 = 2;
                                }
                            } else if (j < 1000) {
                                i2 = 3;
                            } else {
                                i2 = 4;
                            }
                        } else if (j < 1000000) {
                            if (j < 100000) {
                                i2 = 5;
                            } else {
                                i2 = 6;
                            }
                        } else if (j < 10000000) {
                            i2 = 7;
                        } else {
                            i2 = 8;
                        }
                    } else if (j < 1000000000000L) {
                        if (j < 10000000000L) {
                            if (j < 1000000000) {
                                i2 = 9;
                            } else {
                                i2 = 10;
                            }
                        } else if (j < 100000000000L) {
                            i2 = 11;
                        } else {
                            i2 = 12;
                        }
                    } else if (j < 1000000000000000L) {
                        if (j < 10000000000000L) {
                            i2 = 13;
                        } else if (j < 100000000000000L) {
                            i2 = 14;
                        } else {
                            i2 = 15;
                        }
                    } else if (j < 100000000000000000L) {
                        if (j < 10000000000000000L) {
                            i2 = 16;
                        } else {
                            i2 = 17;
                        }
                    } else if (j < 1000000000000000000L) {
                        i2 = 18;
                    } else {
                        i2 = 19;
                    }
                    if (z) {
                        i2++;
                    }
                    o0O00OOO o0o00oooO000oOoO = o000oOoO(i2);
                    bArr = o0o00oooO000oOoO.f52067OooO00o;
                    i = o0o00oooO000oOoO.f52069OooO0OO + i2;
                    while (j != 0) {
                        long j2 = 10;
                        i--;
                        bArr[i] = oOo0000O.f52108OooO00o[(int) (j % j2)];
                        j /= j2;
                    }
                    if (z) {
                        bArr[i - 1] = (byte) 45;
                    }
                    o0o00oooO000oOoO.f52069OooO0OO += i2;
                    this.f52099Oooo0oO += (long) i2;
                }
            } else {
                if (j < 100000000) {
                    if (j < 10000) {
                        if (j < 100) {
                            if (j >= 10) {
                                i2 = 2;
                            }
                        } else if (j < 1000) {
                            i2 = 3;
                        } else {
                            i2 = 4;
                        }
                    } else if (j < 1000000) {
                        if (j < 100000) {
                            i2 = 5;
                        } else {
                            i2 = 6;
                        }
                    } else if (j < 10000000) {
                        i2 = 7;
                    } else {
                        i2 = 8;
                    }
                } else if (j < 1000000000000L) {
                    if (j < 10000000000L) {
                        if (j < 1000000000) {
                            i2 = 9;
                        } else {
                            i2 = 10;
                        }
                    } else if (j < 100000000000L) {
                        i2 = 11;
                    } else {
                        i2 = 12;
                    }
                } else if (j < 1000000000000000L) {
                    if (j < 10000000000000L) {
                        i2 = 13;
                    } else if (j < 100000000000000L) {
                        i2 = 14;
                    } else {
                        i2 = 15;
                    }
                } else if (j < 100000000000000000L) {
                    if (j < 10000000000000000L) {
                        i2 = 16;
                    } else {
                        i2 = 17;
                    }
                } else if (j < 1000000000000000000L) {
                    i2 = 18;
                } else {
                    i2 = 19;
                }
                if (z) {
                    i2++;
                }
                o0O00OOO o0o00oooO000oOoO2 = o000oOoO(i2);
                bArr = o0o00oooO000oOoO2.f52067OooO00o;
                i = o0o00oooO000oOoO2.f52069OooO0OO + i2;
                while (j != 0) {
                    long j3 = 10;
                    i--;
                    bArr[i] = oOo0000O.f52108OooO00o[(int) (j % j3)];
                    j /= j3;
                }
                if (z) {
                    bArr[i - 1] = (byte) 45;
                }
                o0o00oooO000oOoO2.f52069OooO0OO += i2;
                this.f52099Oooo0oO += (long) i2;
            }
        }
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    public final /* bridge */ /* synthetic */ oo00oO Oooooo0(byte[] bArr, int i, int i2) {
        OoooOoO(bArr, i, i2);
        return this;
    }

    @Override // p674o0oooo0.oo00oO
    @NotNull
    /* JADX INFO: renamed from: OoooooO, reason: merged with bridge method [inline-methods] */
    public final o0oOO Ooooooo(long j) {
        if (j == 0) {
            Ooooo0o(48);
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
            o0O00OOO o0o00oooO000oOoO = o000oOoO(i);
            byte[] bArr = o0o00oooO000oOoO.f52067OooO00o;
            int i2 = o0o00oooO000oOoO.f52069OooO0OO;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = oOo0000O.f52108OooO00o[(int) (15 & j)];
                j >>>= 4;
            }
            o0o00oooO000oOoO.f52069OooO0OO += i;
            this.f52099Oooo0oO += (long) i;
        }
        return this;
    }

    @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof o0oOO)) {
                return false;
            }
            long j = this.f52099Oooo0oO;
            o0oOO o0ooo2 = (o0oOO) obj;
            if (j != o0ooo2.f52099Oooo0oO) {
                return false;
            }
            if (j != 0) {
                o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
                Intrinsics.checkNotNull(o0o00ooo2);
                o0O00OOO o0o00ooo3 = o0ooo2.f52098Oooo0o;
                Intrinsics.checkNotNull(o0o00ooo3);
                int i = o0o00ooo2.f52068OooO0O0;
                int i2 = o0o00ooo3.f52068OooO0O0;
                long j2 = 0;
                while (j2 < this.f52099Oooo0oO) {
                    long jMin = Math.min(o0o00ooo2.f52069OooO0OO - i, o0o00ooo3.f52069OooO0OO - i2);
                    long j3 = 0;
                    while (j3 < jMin) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (o0o00ooo2.f52067OooO00o[i] != o0o00ooo3.f52067OooO00o[i2]) {
                            return false;
                        }
                        j3++;
                        i = i3;
                        i2 = i4;
                    }
                    if (i == o0o00ooo2.f52069OooO0OO) {
                        o0o00ooo2 = o0o00ooo2.f52071OooO0o;
                        Intrinsics.checkNotNull(o0o00ooo2);
                        i = o0o00ooo2.f52068OooO0O0;
                    }
                    if (i2 == o0o00ooo3.f52069OooO0OO) {
                        o0o00ooo3 = o0o00ooo3.f52071OooO0o;
                        Intrinsics.checkNotNull(o0o00ooo3);
                        i2 = o0o00ooo3.f52068OooO0O0;
                    }
                    j2 += jMin;
                }
            }
        }
        return true;
    }

    @Override // p674o0oooo0.oo00oO, p674o0oooo0.o0O00o00, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        if (o0o00ooo2 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = o0o00ooo2.f52069OooO0OO;
            for (int i3 = o0o00ooo2.f52068OooO0O0; i3 < i2; i3++) {
                i = (i * 31) + o0o00ooo2.f52067OooO00o[i3];
            }
            o0o00ooo2 = o0o00ooo2.f52071OooO0o;
            Intrinsics.checkNotNull(o0o00ooo2);
        } while (o0o00ooo2 != this.f52098Oooo0o);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p674o0oooo0.oo00oO
    public final /* bridge */ /* synthetic */ oo00oO o000000(ByteString byteString) {
        OoooOOO(byteString);
        return this;
    }

    @Override // p674o0oooo0.o0oOOo
    public final long o00000O0() throws EOFException {
        return o00OOO0O.OooO0Oo(readLong());
    }

    @Override // p674o0oooo0.o0oOOo
    public final int o00000OO(@NotNull o0O00 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iOooO0O0 = oOo0000O.OooO0O0(this, options, false);
        if (iOooO0O0 == -1) {
            return -1;
        }
        skip(options.f52040Oooo0o[iOooO0O0].OooO0o0());
        return iOooO0O0;
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final InputStream o0000OO0() {
        return new OooO0O0();
    }

    @Override // p674o0oooo0.o0oOOo
    public final void o0000oo(long j) throws EOFException {
        if (this.f52099Oooo0oO < j) {
            throw new EOFException();
        }
    }

    @Override // p674o0oooo0.o0oOOo
    public final long o000OO() throws EOFException {
        int i;
        if (this.f52099Oooo0oO == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
            Intrinsics.checkNotNull(o0o00ooo2);
            byte[] bArr = o0o00ooo2.f52067OooO00o;
            int i3 = o0o00ooo2.f52068OooO0O0;
            int i4 = o0o00ooo2.f52069OooO0OO;
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
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected leading [0-9a-fA-F] character but was 0x");
                        sbOooO0o0.append(o00OOO0O.OooO0o0(b));
                        throw new NumberFormatException(sbOooO0o0.toString());
                    }
                    i = (b - b3) + 10;
                } else {
                    i = b - b2;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    o0oOO o0oooOoooooo = new o0oOO().Ooooooo(j);
                    o0oooOoooooo.Ooooo0o(b);
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Number too large: ");
                    sbOooO0o1.append(o0oooOoooooo.Oooo0o());
                    throw new NumberFormatException(sbOooO0o1.toString());
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f52098Oooo0o = o0o00ooo2.OooO00o();
                o0oO0Ooo.OooO0O0(o0o00ooo2);
            } else {
                o0o00ooo2.f52068OooO0O0 = i3;
            }
            if (z) {
                break;
            }
        } while (this.f52098Oooo0o != null);
        this.f52099Oooo0oO -= (long) i2;
        return j;
    }

    @NotNull
    public final o0O00OOO o000oOoO(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        if (o0o00ooo2 == null) {
            o0O00OOO o0o00oooOooO0OO = o0oO0Ooo.OooO0OO();
            this.f52098Oooo0o = o0o00oooOooO0OO;
            o0o00oooOooO0OO.f52073OooO0oO = o0o00oooOooO0OO;
            o0o00oooOooO0OO.f52071OooO0o = o0o00oooOooO0OO;
            return o0o00oooOooO0OO;
        }
        Intrinsics.checkNotNull(o0o00ooo2);
        o0O00OOO o0o00ooo3 = o0o00ooo2.f52073OooO0oO;
        Intrinsics.checkNotNull(o0o00ooo3);
        if (o0o00ooo3.f52069OooO0OO + i <= 8192 && o0o00ooo3.f52072OooO0o0) {
            return o0o00ooo3;
        }
        o0O00OOO o0o00oooOooO0OO2 = o0oO0Ooo.OooO0OO();
        o0o00ooo3.OooO0O0(o0o00oooOooO0OO2);
        return o0o00oooOooO0OO2;
    }

    @NotNull
    public final o0oOO o00Oo0(int i) {
        o0O00OOO o0o00oooO000oOoO = o000oOoO(2);
        byte[] bArr = o0o00oooO000oOoO.f52067OooO00o;
        int i2 = o0o00oooO000oOoO.f52069OooO0OO;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        o0o00oooO000oOoO.f52069OooO0OO = i3 + 1;
        this.f52099Oooo0oO += 2;
        return this;
    }

    @NotNull
    public final o0oOO o00oO0O(@NotNull String string, int i, int i2) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (!(i2 <= string.length())) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("endIndex > string.length: ", i2, " > ");
            sbOooO00o.append(string.length());
            throw new IllegalArgumentException(sbOooO00o.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                o0O00OOO o0o00oooO000oOoO = o000oOoO(1);
                byte[] bArr = o0o00oooO000oOoO.f52067OooO00o;
                int i3 = o0o00oooO000oOoO.f52069OooO0OO - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = o0o00oooO000oOoO.f52069OooO0OO;
                int i6 = (i3 + i) - i5;
                o0o00oooO000oOoO.f52069OooO0OO = i5 + i6;
                this.f52099Oooo0oO += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    o0O00OOO o0o00oooO000oOoO2 = o000oOoO(2);
                    byte[] bArr2 = o0o00oooO000oOoO2.f52067OooO00o;
                    int i7 = o0o00oooO000oOoO2.f52069OooO0OO;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    o0o00oooO000oOoO2.f52069OooO0OO = i7 + 2;
                    this.f52099Oooo0oO += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    o0O00OOO o0o00oooO000oOoO3 = o000oOoO(3);
                    byte[] bArr3 = o0o00oooO000oOoO3.f52067OooO00o;
                    int i8 = o0o00oooO000oOoO3.f52069OooO0OO;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    o0o00oooO000oOoO3.f52069OooO0OO = i8 + 3;
                    this.f52099Oooo0oO += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        Ooooo0o(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        o0O00OOO o0o00oooO000oOoO4 = o000oOoO(4);
                        byte[] bArr4 = o0o00oooO000oOoO4.f52067OooO00o;
                        int i11 = o0o00oooO000oOoO4.f52069OooO0OO;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        o0o00oooO000oOoO4.f52069OooO0OO = i11 + 4;
                        this.f52099Oooo0oO += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    @NotNull
    public final o0oOO o00oO0o(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        o00oO0O(string, 0, string.length());
        return this;
    }

    @Override // p674o0oooo0.o0oOOo
    public final void o0O0O00(@NotNull o0oOO sink, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = this.f52099Oooo0oO;
        if (j2 >= j) {
            sink.write(this, j);
        } else {
            sink.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final byte[] o0OO00O(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount: ", j).toString());
        }
        if (this.f52099Oooo0oO < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @NotNull
    public final o0oOO o0OoOo0(int i) {
        o0O00OOO o0o00oooO000oOoO = o000oOoO(4);
        byte[] bArr = o0o00oooO000oOoO.f52067OooO00o;
        int i2 = o0o00oooO000oOoO.f52069OooO0OO;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i5] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        o0o00oooO000oOoO.f52069OooO0OO = i5 + 1;
        this.f52099Oooo0oO += 4;
        return this;
    }

    @Override // p674o0oooo0.o0oOOo
    @NotNull
    public final String o0ooOO0() throws EOFException {
        return OoooO(Long.MAX_VALUE);
    }

    @Override // p674o0oooo0.oo00oO
    public final long o0ooOOo(@NotNull o0O0O0O source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long jOooo0O0 = source.Oooo0O0(this, 8192);
            if (jOooo0O0 == -1) {
                return j;
            }
            j += jOooo0O0;
        }
    }

    @Override // p674o0oooo0.o0oOOo
    public final int o0ooOoO() throws EOFException {
        return o00OOO0O.OooO0OO(readInt());
    }

    @NotNull
    public final o0oOO oo000o(@NotNull String string, int i, int i2, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (!(i2 <= string.length())) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("endIndex > string.length: ", i2, " > ");
            sbOooO00o.append(string.length());
            throw new IllegalArgumentException(sbOooO00o.toString().toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            o00oO0O(string, i, i2);
            return this;
        }
        String strSubstring = string.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        OoooOoO(bytes, 0, bytes.length);
        return this;
    }

    @NotNull
    public final o0oOO oo0o0Oo(int i) {
        String str;
        if (i < 128) {
            Ooooo0o(i);
        } else if (i < 2048) {
            o0O00OOO o0o00oooO000oOoO = o000oOoO(2);
            byte[] bArr = o0o00oooO000oOoO.f52067OooO00o;
            int i2 = o0o00oooO000oOoO.f52069OooO0OO;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            o0o00oooO000oOoO.f52069OooO0OO = i2 + 2;
            this.f52099Oooo0oO += 2;
        } else if (55296 <= i && 57343 >= i) {
            Ooooo0o(63);
        } else if (i < 65536) {
            o0O00OOO o0o00oooO000oOoO2 = o000oOoO(3);
            byte[] bArr2 = o0o00oooO000oOoO2.f52067OooO00o;
            int i3 = o0o00oooO000oOoO2.f52069OooO0OO;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            o0o00oooO000oOoO2.f52069OooO0OO = i3 + 3;
            this.f52099Oooo0oO += 3;
        } else {
            if (i > 1114111) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unexpected code point: 0x");
                if (i != 0) {
                    char[] cArr = oOo000o0.f52109OooO00o;
                    int i4 = 0;
                    char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                    while (i4 < 8 && cArr2[i4] == '0') {
                        i4++;
                    }
                    str = new String(cArr2, i4, 8 - i4);
                } else {
                    str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                sbOooO0o0.append(str);
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
            o0O00OOO o0o00oooO000oOoO3 = o000oOoO(4);
            byte[] bArr3 = o0o00oooO000oOoO3.f52067OooO00o;
            int i5 = o0o00oooO000oOoO3.f52069OooO0OO;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i & 63) | 128);
            o0o00oooO000oOoO3.f52069OooO0OO = i5 + 4;
            this.f52099Oooo0oO += 4;
        }
        return this;
    }

    @NotNull
    public final o0oOO ooOO(long j) {
        o0O00OOO o0o00oooO000oOoO = o000oOoO(8);
        byte[] bArr = o0o00oooO000oOoO.f52067OooO00o;
        int i = o0o00oooO000oOoO.f52069OooO0OO;
        int i2 = i + 1;
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
        o0o00oooO000oOoO.f52069OooO0OO = i8 + 1;
        this.f52099Oooo0oO += 8;
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        if (o0o00ooo2 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
        sink.put(o0o00ooo2.f52067OooO00o, o0o00ooo2.f52068OooO0O0, iMin);
        int i = o0o00ooo2.f52068OooO0O0 + iMin;
        o0o00ooo2.f52068OooO0O0 = i;
        this.f52099Oooo0oO -= (long) iMin;
        if (i == o0o00ooo2.f52069OooO0OO) {
            this.f52098Oooo0o = o0o00ooo2.OooO00o();
            o0oO0Ooo.OooO0O0(o0o00ooo2);
        }
        return iMin;
    }

    @Override // p674o0oooo0.o0oOOo
    public final byte readByte() throws EOFException {
        if (this.f52099Oooo0oO == 0) {
            throw new EOFException();
        }
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        Intrinsics.checkNotNull(o0o00ooo2);
        int i = o0o00ooo2.f52068OooO0O0;
        int i2 = o0o00ooo2.f52069OooO0OO;
        int i3 = i + 1;
        byte b = o0o00ooo2.f52067OooO00o[i];
        this.f52099Oooo0oO--;
        if (i3 == i2) {
            this.f52098Oooo0o = o0o00ooo2.OooO00o();
            o0oO0Ooo.OooO0O0(o0o00ooo2);
        } else {
            o0o00ooo2.f52068OooO0O0 = i3;
        }
        return b;
    }

    @Override // p674o0oooo0.o0oOOo
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

    @Override // p674o0oooo0.o0oOOo
    public final int readInt() throws EOFException {
        if (this.f52099Oooo0oO < 4) {
            throw new EOFException();
        }
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        Intrinsics.checkNotNull(o0o00ooo2);
        int i = o0o00ooo2.f52068OooO0O0;
        int i2 = o0o00ooo2.f52069OooO0OO;
        if (i2 - i < 4) {
            return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
        }
        byte[] bArr = o0o00ooo2.f52067OooO00o;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i3] & UByte.MAX_VALUE) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & UByte.MAX_VALUE);
        this.f52099Oooo0oO -= 4;
        if (i8 == i2) {
            this.f52098Oooo0o = o0o00ooo2.OooO00o();
            o0oO0Ooo.OooO0O0(o0o00ooo2);
        } else {
            o0o00ooo2.f52068OooO0O0 = i8;
        }
        return i9;
    }

    @Override // p674o0oooo0.o0oOOo
    public final long readLong() throws EOFException {
        if (this.f52099Oooo0oO < 8) {
            throw new EOFException();
        }
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        Intrinsics.checkNotNull(o0o00ooo2);
        int i = o0o00ooo2.f52068OooO0O0;
        int i2 = o0o00ooo2.f52069OooO0OO;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = o0o00ooo2.f52067OooO00o;
        int i3 = i + 1;
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
        this.f52099Oooo0oO -= 8;
        if (i10 == i2) {
            this.f52098Oooo0o = o0o00ooo2.OooO00o();
            o0oO0Ooo.OooO0O0(o0o00ooo2);
        } else {
            o0o00ooo2.f52068OooO0O0 = i10;
        }
        return j8;
    }

    @Override // p674o0oooo0.o0oOOo
    public final short readShort() throws EOFException {
        if (this.f52099Oooo0oO < 2) {
            throw new EOFException();
        }
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        Intrinsics.checkNotNull(o0o00ooo2);
        int i = o0o00ooo2.f52068OooO0O0;
        int i2 = o0o00ooo2.f52069OooO0OO;
        if (i2 - i < 2) {
            return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
        }
        byte[] bArr = o0o00ooo2.f52067OooO00o;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & UByte.MAX_VALUE) << 8) | (bArr[i3] & UByte.MAX_VALUE);
        this.f52099Oooo0oO -= 2;
        if (i4 == i2) {
            this.f52098Oooo0o = o0o00ooo2.OooO00o();
            o0oO0Ooo.OooO0O0(o0o00ooo2);
        } else {
            o0o00ooo2.f52068OooO0O0 = i4;
        }
        return (short) i5;
    }

    @Override // p674o0oooo0.o0oOOo
    public final boolean request(long j) {
        return this.f52099Oooo0oO >= j;
    }

    @Override // p674o0oooo0.o0oOOo
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
            if (o0o00ooo2 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
            long j2 = iMin;
            this.f52099Oooo0oO -= j2;
            j -= j2;
            int i = o0o00ooo2.f52068OooO0O0 + iMin;
            o0o00ooo2.f52068OooO0O0 = i;
            if (i == o0o00ooo2.f52069OooO0OO) {
                this.f52098Oooo0o = o0o00ooo2.OooO00o();
                o0oO0Ooo.OooO0O0(o0o00ooo2);
            }
        }
    }

    @Override // p674o0oooo0.o0O0O0O
    @NotNull
    public final o0oO0O0o timeout() {
        return o0oO0O0o.f52090OooO0Oo;
    }

    @NotNull
    public final String toString() {
        long j = this.f52099Oooo0oO;
        if (j <= ((long) Integer.MAX_VALUE)) {
            return OoooOO0((int) j).toString();
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("size > Int.MAX_VALUE: ");
        sbOooO0o0.append(this.f52099Oooo0oO);
        throw new IllegalStateException(sbOooO0o0.toString().toString());
    }

    @Override // p674o0oooo0.o0O00o00
    public final void write(@NotNull o0oOO source, long j) {
        int i;
        o0O00OOO o0o00ooo2;
        o0O00OOO o0o00oooOooO0OO;
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        o00OOO0O.OooO0O0(source.f52099Oooo0oO, 0L, j);
        while (j > 0) {
            o0O00OOO o0o00ooo3 = source.f52098Oooo0o;
            Intrinsics.checkNotNull(o0o00ooo3);
            int i2 = o0o00ooo3.f52069OooO0OO;
            o0O00OOO o0o00ooo4 = source.f52098Oooo0o;
            Intrinsics.checkNotNull(o0o00ooo4);
            if (j < i2 - o0o00ooo4.f52068OooO0O0) {
                o0O00OOO o0o00ooo5 = this.f52098Oooo0o;
                if (o0o00ooo5 != null) {
                    Intrinsics.checkNotNull(o0o00ooo5);
                    o0o00ooo2 = o0o00ooo5.f52073OooO0oO;
                } else {
                    o0o00ooo2 = null;
                }
                if (o0o00ooo2 != null && o0o00ooo2.f52072OooO0o0) {
                    if ((((long) o0o00ooo2.f52069OooO0OO) + j) - ((long) (o0o00ooo2.f52070OooO0Oo ? 0 : o0o00ooo2.f52068OooO0O0)) <= 8192) {
                        o0O00OOO o0o00ooo6 = source.f52098Oooo0o;
                        Intrinsics.checkNotNull(o0o00ooo6);
                        o0o00ooo6.OooO0Oo(o0o00ooo2, (int) j);
                        source.f52099Oooo0oO -= j;
                        this.f52099Oooo0oO += j;
                        return;
                    }
                }
                o0O00OOO o0o00ooo7 = source.f52098Oooo0o;
                Intrinsics.checkNotNull(o0o00ooo7);
                int i3 = (int) j;
                Objects.requireNonNull(o0o00ooo7);
                if (!(i3 > 0 && i3 <= o0o00ooo7.f52069OooO0OO - o0o00ooo7.f52068OooO0O0)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i3 >= 1024) {
                    o0o00oooOooO0OO = o0o00ooo7.OooO0OO();
                } else {
                    o0o00oooOooO0OO = o0oO0Ooo.OooO0OO();
                    byte[] bArr = o0o00ooo7.f52067OooO00o;
                    byte[] bArr2 = o0o00oooOooO0OO.f52067OooO00o;
                    int i4 = o0o00ooo7.f52068OooO0O0;
                    ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr2, 0, i4, i4 + i3, 2, (Object) null);
                }
                o0o00oooOooO0OO.f52069OooO0OO = o0o00oooOooO0OO.f52068OooO0O0 + i3;
                o0o00ooo7.f52068OooO0O0 += i3;
                o0O00OOO o0o00ooo8 = o0o00ooo7.f52073OooO0oO;
                Intrinsics.checkNotNull(o0o00ooo8);
                o0o00ooo8.OooO0O0(o0o00oooOooO0OO);
                source.f52098Oooo0o = o0o00oooOooO0OO;
            }
            o0O00OOO o0o00ooo9 = source.f52098Oooo0o;
            Intrinsics.checkNotNull(o0o00ooo9);
            long j2 = o0o00ooo9.f52069OooO0OO - o0o00ooo9.f52068OooO0O0;
            source.f52098Oooo0o = o0o00ooo9.OooO00o();
            o0O00OOO o0o00ooo10 = this.f52098Oooo0o;
            if (o0o00ooo10 == null) {
                this.f52098Oooo0o = o0o00ooo9;
                o0o00ooo9.f52073OooO0oO = o0o00ooo9;
                o0o00ooo9.f52071OooO0o = o0o00ooo9;
            } else {
                Intrinsics.checkNotNull(o0o00ooo10);
                o0O00OOO o0o00ooo11 = o0o00ooo10.f52073OooO0oO;
                Intrinsics.checkNotNull(o0o00ooo11);
                o0o00ooo11.OooO0O0(o0o00ooo9);
                o0O00OOO o0o00ooo12 = o0o00ooo9.f52073OooO0oO;
                if (!(o0o00ooo12 != o0o00ooo9)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                Intrinsics.checkNotNull(o0o00ooo12);
                if (o0o00ooo12.f52072OooO0o0) {
                    int i5 = o0o00ooo9.f52069OooO0OO - o0o00ooo9.f52068OooO0O0;
                    o0O00OOO o0o00ooo13 = o0o00ooo9.f52073OooO0oO;
                    Intrinsics.checkNotNull(o0o00ooo13);
                    int i6 = 8192 - o0o00ooo13.f52069OooO0OO;
                    o0O00OOO o0o00ooo14 = o0o00ooo9.f52073OooO0oO;
                    Intrinsics.checkNotNull(o0o00ooo14);
                    if (o0o00ooo14.f52070OooO0Oo) {
                        i = 0;
                    } else {
                        o0O00OOO o0o00ooo15 = o0o00ooo9.f52073OooO0oO;
                        Intrinsics.checkNotNull(o0o00ooo15);
                        i = o0o00ooo15.f52068OooO0O0;
                    }
                    if (i5 <= i6 + i) {
                        o0O00OOO o0o00ooo16 = o0o00ooo9.f52073OooO0oO;
                        Intrinsics.checkNotNull(o0o00ooo16);
                        o0o00ooo9.OooO0Oo(o0o00ooo16, i5);
                        o0o00ooo9.OooO00o();
                        o0oO0Ooo.OooO0O0(o0o00ooo9);
                    }
                }
            }
            source.f52099Oooo0oO -= j2;
            this.f52099Oooo0oO += j2;
            j -= j2;
        }
    }

    public static final class OooO0O0 extends InputStream {
        public OooO0O0() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(o0oOO.this.f52099Oooo0oO, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            o0oOO o0ooo2 = o0oOO.this;
            if (o0ooo2.f52099Oooo0oO > 0) {
                return o0ooo2.readByte() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @NotNull
        public final String toString() {
            return o0oOO.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] sink, int i, int i2) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return o0oOO.this.read(sink, i, i2);
        }
    }

    public final int read(@NotNull byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        o00OOO0O.OooO0O0(sink.length, i, i2);
        o0O00OOO o0o00ooo2 = this.f52098Oooo0o;
        if (o0o00ooo2 == null) {
            return -1;
        }
        int iMin = Math.min(i2, o0o00ooo2.f52069OooO0OO - o0o00ooo2.f52068OooO0O0);
        byte[] bArr = o0o00ooo2.f52067OooO00o;
        int i3 = o0o00ooo2.f52068OooO0O0;
        ArraysKt.copyInto(bArr, sink, i, i3, i3 + iMin);
        int i4 = o0o00ooo2.f52068OooO0O0 + iMin;
        o0o00ooo2.f52068OooO0O0 = i4;
        this.f52099Oooo0oO -= (long) iMin;
        if (i4 != o0o00ooo2.f52069OooO0OO) {
            return iMin;
        }
        this.f52098Oooo0o = o0o00ooo2.OooO00o();
        o0oO0Ooo.OooO0O0(o0o00ooo2);
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            o0O00OOO o0o00oooO000oOoO = o000oOoO(1);
            int iMin = Math.min(i, 8192 - o0o00oooO000oOoO.f52069OooO0OO);
            source.get(o0o00oooO000oOoO.f52067OooO00o, o0o00oooO000oOoO.f52069OooO0OO, iMin);
            i -= iMin;
            o0o00oooO000oOoO.f52069OooO0OO += iMin;
        }
        this.f52099Oooo0oO += (long) iRemaining;
        return iRemaining;
    }
}
