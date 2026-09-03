package p660o0oooO0;

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
import p648o0ooOoo.oO000o00;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o00oOoo implements Closeable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f59723OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f59724OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooO00o f59725OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0O0o0 f59726OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f59727OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f59728OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f59729OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f59730OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f59731OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f59732OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f59733OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f59734OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f59735OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final byte[] f59736OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o000O f59737OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final oo0OOoo.OooO00o f59738OooOOoo;

    public interface OooO00o {
        void OooO0O0(@NotNull ByteString byteString) throws IOException;

        void OooO0OO(@NotNull String str) throws IOException;

        void OooO0Oo(@NotNull ByteString byteString);

        void OooO0o(int i, @NotNull String str);

        void OooO0o0(@NotNull ByteString byteString);
    }

    public o00oOoo(boolean z, @NotNull o0O0o0 source, @NotNull o000OO00 frameCallback, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f59724OooO0Oo = z;
        this.f59726OooO0o0 = source;
        this.f59725OooO0o = frameCallback;
        this.f59727OooO0oO = z2;
        this.f59728OooO0oo = z3;
        this.f59734OooOOOO = new oo0OOoo();
        this.f59735OooOOOo = new oo0OOoo();
        this.f59736OooOOo = z ? null : new byte[4];
        this.f59738OooOOoo = z ? null : new oo0OOoo.OooO00o();
    }

    public final void OooO00o() throws IOException {
        short s;
        String strOoooOO0;
        long j = this.f59730OooOO0O;
        oo0OOoo oo0oooo = this.f59734OooOOOO;
        if (j > 0) {
            this.f59726OooO0o0.Oooo0o(oo0oooo, j);
            if (!this.f59724OooO0Oo) {
                oo0OOoo.OooO00o oooO00o = this.f59738OooOOoo;
                Intrinsics.checkNotNull(oooO00o);
                oo0oooo.Oooo0O0(oooO00o);
                oooO00o.OooO0OO(0L);
                byte[] bArr = this.f59736OooOOo;
                Intrinsics.checkNotNull(bArr);
                o0O0ooO.OooO0O0(oooO00o, bArr);
                oooO00o.close();
            }
        }
        int i = this.f59729OooOO0;
        OooO00o oooO00o2 = this.f59725OooO0o;
        switch (i) {
            case 8:
                long j2 = oo0oooo.f59828OooO0o0;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = oo0oooo.readShort();
                    strOoooOO0 = oo0oooo.OoooOO0();
                    String strOooO00o = o0O0ooO.OooO00o(s);
                    if (strOooO00o != null) {
                        throw new ProtocolException(strOooO00o);
                    }
                } else {
                    s = 1005;
                    strOoooOO0 = "";
                }
                oooO00o2.OooO0o(s, strOoooOO0);
                this.f59723OooO = true;
                return;
            case 9:
                oooO00o2.OooO0Oo(oo0oooo.Oooo0o0());
                return;
            case 10:
                oooO00o2.OooO0o0(oo0oooo.Oooo0o0());
                return;
            default:
                int i2 = this.f59729OooOO0;
                byte[] bArr2 = oO000o00.f58124OooO00o;
                String hexString = Integer.toHexString(i2);
                Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                throw new ProtocolException(Intrinsics.stringPlus("Unknown control opcode: ", hexString));
        }
    }

    public final void OooO0OO() throws IOException {
        boolean z;
        if (this.f59723OooO) {
            throw new IOException("closed");
        }
        o0O0o0 o0o0o0 = this.f59726OooO0o0;
        long jOooO0oo = o0o0o0.timeout().OooO0oo();
        o0o0o0.timeout().OooO0O0();
        try {
            byte b = o0o0o0.readByte();
            byte[] bArr = oO000o00.f58124OooO00o;
            int i = b & UByte.MAX_VALUE;
            o0o0o0.timeout().OooO0oO(jOooO0oo, TimeUnit.NANOSECONDS);
            int i2 = i & 15;
            this.f59729OooOO0 = i2;
            boolean z2 = (i & 128) != 0;
            this.f59731OooOO0o = z2;
            boolean z3 = (i & 8) != 0;
            this.f59733OooOOO0 = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (i & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.f59727OooO0oO) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.f59732OooOOO = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((i & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((i & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int i3 = o0o0o0.readByte() & UByte.MAX_VALUE;
            boolean z5 = (i3 & 128) != 0;
            boolean z6 = this.f59724OooO0Oo;
            if (z5 == z6) {
                throw new ProtocolException(z6 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = i3 & 127;
            this.f59730OooOO0O = j;
            if (j == 126) {
                this.f59730OooOO0O = o0o0o0.readShort() & UShort.MAX_VALUE;
            } else if (j == 127) {
                long j2 = o0o0o0.readLong();
                this.f59730OooOO0O = j2;
                if (j2 < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.f59730OooOO0O);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (this.f59733OooOOO0 && this.f59730OooOO0O > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.f59736OooOOo;
                Intrinsics.checkNotNull(bArr2);
                o0o0o0.readFully(bArr2);
            }
        } catch (Throwable th) {
            o0o0o0.timeout().OooO0oO(jOooO0oo, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        o000O o000o = this.f59737OooOOo0;
        if (o000o == null) {
            return;
        }
        o000o.close();
    }
}
