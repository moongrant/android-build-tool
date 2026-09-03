package p661o0ooo0oo;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p643o0ooOO0O.o00OO0O0;
import p663o0oooO0.o00O000o;
import p663o0oooO0.o0O0ooO;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000o00 implements Closeable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f58550OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f58551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooO00o f58552OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00O000o f58553OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f58554OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f58555OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f58556OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f58557OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f58558OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f58559OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f58560OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o0O0ooO f58561OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final o0O0ooO f58562OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final byte[] f58563OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public oO0Oo0oo f58564OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final o0O0ooO.OooO00o f58565OooOOoo;

    public interface OooO00o {
        void OooO0O0(@NotNull ByteString byteString) throws IOException;

        void OooO0OO(@NotNull String str) throws IOException;

        void OooO0Oo(@NotNull ByteString byteString);

        void OooO0o(int i, @NotNull String str);

        void OooO0o0(@NotNull ByteString byteString);
    }

    public oO000o00(boolean z, @NotNull o00O000o source, @NotNull oO000OOo frameCallback, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f58551OooO0Oo = z;
        this.f58553OooO0o0 = source;
        this.f58552OooO0o = frameCallback;
        this.f58554OooO0oO = z2;
        this.f58555OooO0oo = z3;
        this.f58561OooOOOO = new o0O0ooO();
        this.f58562OooOOOo = new o0O0ooO();
        this.f58563OooOOo = z ? null : new byte[4];
        this.f58565OooOOoo = z ? null : new o0O0ooO.OooO00o();
    }

    public final void OooO00o() throws IOException {
        short s;
        String strOoooOOO;
        long j = this.f58557OooOO0O;
        o0O0ooO o0o0ooo = this.f58561OooOOOO;
        if (j > 0) {
            this.f58553OooO0o0.OooOO0o(o0o0ooo, j);
            if (!this.f58551OooO0Oo) {
                o0O0ooO.OooO00o oooO00o = this.f58565OooOOoo;
                Intrinsics.checkNotNull(oooO00o);
                o0o0ooo.Oooo0o(oooO00o);
                oooO00o.OooO0OO(0L);
                byte[] bArr = this.f58563OooOOo;
                Intrinsics.checkNotNull(bArr);
                oO000Oo.OooO0O0(oooO00o, bArr);
                oooO00o.close();
            }
        }
        int i = this.f58556OooOO0;
        OooO00o oooO00o2 = this.f58552OooO0o;
        switch (i) {
            case 8:
                long j2 = o0o0ooo.f58720OooO0o0;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = o0o0ooo.readShort();
                    strOoooOOO = o0o0ooo.OoooOOO();
                    String strOooO00o = oO000Oo.OooO00o(s);
                    if (strOooO00o != null) {
                        throw new ProtocolException(strOooO00o);
                    }
                } else {
                    s = 1005;
                    strOoooOOO = "";
                }
                oooO00o2.OooO0o(s, strOoooOOO);
                this.f58550OooO = true;
                return;
            case 9:
                oooO00o2.OooO0Oo(o0o0ooo.Oooo0oo());
                return;
            case 10:
                oooO00o2.OooO0o0(o0o0ooo.Oooo0oo());
                return;
            default:
                int i2 = this.f58556OooOO0;
                byte[] bArr2 = o00OO0O0.f57561OooO00o;
                String hexString = Integer.toHexString(i2);
                Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                throw new ProtocolException(Intrinsics.stringPlus("Unknown control opcode: ", hexString));
        }
    }

    public final void OooO0OO() throws IOException {
        boolean z;
        if (this.f58550OooO) {
            throw new IOException("closed");
        }
        o00O000o o00o000o2 = this.f58553OooO0o0;
        long jOooO0oo = o00o000o2.timeout().OooO0oo();
        o00o000o2.timeout().OooO0O0();
        try {
            byte b = o00o000o2.readByte();
            byte[] bArr = o00OO0O0.f57561OooO00o;
            int i = b & UByte.MAX_VALUE;
            o00o000o2.timeout().OooO0oO(jOooO0oo, TimeUnit.NANOSECONDS);
            int i2 = i & 15;
            this.f58556OooOO0 = i2;
            boolean z2 = (i & 128) != 0;
            this.f58558OooOO0o = z2;
            boolean z3 = (i & 8) != 0;
            this.f58560OooOOO0 = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (i & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.f58554OooO0oO) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.f58559OooOOO = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((i & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((i & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int i3 = o00o000o2.readByte() & UByte.MAX_VALUE;
            boolean z5 = (i3 & 128) != 0;
            boolean z6 = this.f58551OooO0Oo;
            if (z5 == z6) {
                throw new ProtocolException(z6 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = i3 & 127;
            this.f58557OooOO0O = j;
            if (j == 126) {
                this.f58557OooOO0O = o00o000o2.readShort() & UShort.MAX_VALUE;
            } else if (j == 127) {
                long j2 = o00o000o2.readLong();
                this.f58557OooOO0O = j2;
                if (j2 < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.f58557OooOO0O);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (this.f58560OooOOO0 && this.f58557OooOO0O > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.f58563OooOOo;
                Intrinsics.checkNotNull(bArr2);
                o00o000o2.readFully(bArr2);
            }
        } catch (Throwable th) {
            o00o000o2.timeout().OooO0oO(jOooO0oo, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        oO0Oo0oo oo0oo0oo = this.f58564OooOOo0;
        if (oo0oo0oo == null) {
            return;
        }
        oo0oo0oo.close();
    }
}
