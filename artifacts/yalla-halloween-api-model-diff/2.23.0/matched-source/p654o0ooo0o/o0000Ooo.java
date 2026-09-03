package p654o0ooo0o;

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
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000Ooo implements Closeable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f60104OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f60105OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooO00o f60106OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0000 f60107OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f60108OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f60109OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f60110OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f60111OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f60112OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f60113OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f60114OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o00000O f60115OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final o00000O f60116OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final byte[] f60117OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o000000 f60118OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final o00000O.OooO00o f60119OooOOoo;

    public interface OooO00o {
        void OooO0O0(@NotNull ByteString byteString) throws IOException;

        void OooO0OO(@NotNull String str) throws IOException;

        void OooO0Oo(@NotNull ByteString byteString);

        void OooO0o(int i, @NotNull String str);

        void OooO0o0(@NotNull ByteString byteString);
    }

    public o0000Ooo(boolean z, @NotNull o0000 source, @NotNull o000000O frameCallback, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f60105OooO0Oo = z;
        this.f60107OooO0o0 = source;
        this.f60106OooO0o = frameCallback;
        this.f60108OooO0oO = z2;
        this.f60109OooO0oo = z3;
        this.f60115OooOOOO = new o00000O();
        this.f60116OooOOOo = new o00000O();
        this.f60117OooOOo = z ? null : new byte[4];
        this.f60119OooOOoo = z ? null : new o00000O.OooO00o();
    }

    public final void OooO00o() throws IOException {
        short s;
        String strOoooOO0;
        long j = this.f60111OooOO0O;
        o00000O o00000o = this.f60115OooOOOO;
        if (j > 0) {
            this.f60107OooO0o0.o0ooOoO(o00000o, j);
            if (!this.f60105OooO0Oo) {
                o00000O.OooO00o oooO00o = this.f60119OooOOoo;
                Intrinsics.checkNotNull(oooO00o);
                o00000o.Oooo0O0(oooO00o);
                oooO00o.OooO0OO(0L);
                byte[] bArr = this.f60117OooOOo;
                Intrinsics.checkNotNull(bArr);
                o00000OO.OooO0O0(oooO00o, bArr);
                oooO00o.close();
            }
        }
        int i = this.f60110OooOO0;
        OooO00o oooO00o2 = this.f60106OooO0o;
        switch (i) {
            case 8:
                long j2 = o00000o.f60177OooO0o0;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = o00000o.readShort();
                    strOoooOO0 = o00000o.OoooOO0();
                    String strOooO00o = o00000OO.OooO00o(s);
                    if (strOooO00o != null) {
                        throw new ProtocolException(strOooO00o);
                    }
                } else {
                    s = 1005;
                    strOoooOO0 = "";
                }
                oooO00o2.OooO0o(s, strOoooOO0);
                this.f60104OooO = true;
                return;
            case 9:
                oooO00o2.OooO0Oo(o00000o.Oooo0o0());
                return;
            case 10:
                oooO00o2.OooO0o0(o00000o.Oooo0o0());
                return;
            default:
                int i2 = this.f60110OooOO0;
                byte[] bArr2 = o0O000o0.f57386OooO00o;
                String hexString = Integer.toHexString(i2);
                Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                throw new ProtocolException(Intrinsics.stringPlus("Unknown control opcode: ", hexString));
        }
    }

    public final void OooO0OO() throws IOException {
        boolean z;
        if (this.f60104OooO) {
            throw new IOException("closed");
        }
        o0000 o0000Var = this.f60107OooO0o0;
        long jOooO0oo = o0000Var.timeout().OooO0oo();
        o0000Var.timeout().OooO0O0();
        try {
            byte b = o0000Var.readByte();
            byte[] bArr = o0O000o0.f57386OooO00o;
            int i = b & UByte.MAX_VALUE;
            o0000Var.timeout().OooO0oO(jOooO0oo, TimeUnit.NANOSECONDS);
            int i2 = i & 15;
            this.f60110OooOO0 = i2;
            boolean z2 = (i & 128) != 0;
            this.f60112OooOO0o = z2;
            boolean z3 = (i & 8) != 0;
            this.f60114OooOOO0 = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (i & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.f60108OooO0oO) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.f60113OooOOO = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((i & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((i & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int i3 = o0000Var.readByte() & UByte.MAX_VALUE;
            boolean z5 = (i3 & 128) != 0;
            boolean z6 = this.f60105OooO0Oo;
            if (z5 == z6) {
                throw new ProtocolException(z6 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = i3 & 127;
            this.f60111OooOO0O = j;
            if (j == 126) {
                this.f60111OooOO0O = o0000Var.readShort() & UShort.MAX_VALUE;
            } else if (j == 127) {
                long j2 = o0000Var.readLong();
                this.f60111OooOO0O = j2;
                if (j2 < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.f60111OooOO0O);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (this.f60114OooOOO0 && this.f60111OooOO0O > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.f60117OooOOo;
                Intrinsics.checkNotNull(bArr2);
                o0000Var.readFully(bArr2);
            }
        } catch (Throwable th) {
            o0000Var.timeout().OooO0oO(jOooO0oo, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        o000000 o000000Var = this.f60118OooOOo0;
        if (o000000Var == null) {
            return;
        }
        o000000Var.close();
    }
}
