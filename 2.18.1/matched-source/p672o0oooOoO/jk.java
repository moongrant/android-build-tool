package p672o0oooOoO;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p659o0ooo0o.o00OOO00;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class jk implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f52002Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f52003Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f52004Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f52005Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final o0oOO f52006OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f52007OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f52008OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final o0oOO f52009OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ek f52010OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final o0oOO.OooO00o f52011OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final boolean f52012OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final o0oOOo f52013OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final OooO00o f52014OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final boolean f52015OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final boolean f52016Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final byte[] f52017o000oOoO;

    public interface OooO00o {
        void OooO00o(@NotNull ByteString byteString) throws IOException;

        void OooO0O0(@NotNull String str) throws IOException;

        void OooO0OO(@NotNull ByteString byteString);

        void OooO0Oo(@NotNull ByteString byteString);

        void OooO0o0(int i, @NotNull String str);
    }

    public jk(boolean z, @NotNull o0oOOo source, @NotNull OooO00o frameCallback, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f52012OoooOOo = z;
        this.f52013OoooOo0 = source;
        this.f52014OoooOoO = frameCallback;
        this.f52015OoooOoo = z2;
        this.f52016Ooooo00 = z3;
        this.f52009OoooO0O = new o0oOO();
        this.f52006OoooO = new o0oOO();
        this.f52017o000oOoO = z ? null : new byte[4];
        this.f52011OoooOOO = z ? null : new o0oOO.OooO00o();
    }

    public final void OooO00o() throws IOException {
        String strOooo0o;
        long j = this.f52005Oooo0oo;
        if (j > 0) {
            this.f52013OoooOo0.o0O0O00(this.f52009OoooO0O, j);
            if (!this.f52012OoooOOo) {
                o0oOO o0ooo2 = this.f52009OoooO0O;
                o0oOO.OooO00o oooO00o = this.f52011OoooOOO;
                Intrinsics.checkNotNull(oooO00o);
                o0ooo2.OooOoOO(oooO00o);
                this.f52011OoooOOO.OooO0O0(0L);
                o0oOO.OooO00o oooO00o2 = this.f52011OoooOOO;
                byte[] bArr = this.f52017o000oOoO;
                Intrinsics.checkNotNull(bArr);
                ik.OooO0O0(oooO00o2, bArr);
                this.f52011OoooOOO.close();
            }
        }
        switch (this.f52004Oooo0oO) {
            case 8:
                short s = 1005;
                o0oOO o0ooo3 = this.f52009OoooO0O;
                long j2 = o0ooo3.f52099Oooo0oO;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = o0ooo3.readShort();
                    strOooo0o = this.f52009OoooO0O.Oooo0o();
                    String strOooO00o = ik.OooO00o(s);
                    if (strOooO00o != null) {
                        throw new ProtocolException(strOooO00o);
                    }
                } else {
                    strOooo0o = "";
                }
                this.f52014OoooOoO.OooO0o0(s, strOooo0o);
                this.f52003Oooo0o = true;
                return;
            case 9:
                this.f52014OoooOoO.OooO0OO(this.f52009OoooO0O.OooOoo());
                return;
            case 10:
                this.f52014OoooOoO.OooO0Oo(this.f52009OoooO0O.OooOoo());
                return;
            default:
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unknown control opcode: ");
                sbOooO0o0.append(o00OOO00.OooOo(this.f52004Oooo0oO));
                throw new ProtocolException(sbOooO0o0.toString());
        }
    }

    public final void OooO0O0() throws IOException {
        boolean z;
        if (this.f52003Oooo0o) {
            throw new IOException("closed");
        }
        long jOooO0oo = this.f52013OoooOo0.timeout().OooO0oo();
        this.f52013OoooOo0.timeout().OooO0O0();
        try {
            byte b = this.f52013OoooOo0.readByte();
            byte[] bArr = o00OOO00.f51183OooO00o;
            int i = b & UByte.MAX_VALUE;
            this.f52013OoooOo0.timeout().OooO0oO(jOooO0oo, TimeUnit.NANOSECONDS);
            int i2 = i & 15;
            this.f52004Oooo0oO = i2;
            boolean z2 = (i & 128) != 0;
            this.f52002Oooo = z2;
            boolean z3 = (i & 8) != 0;
            this.f52008OoooO00 = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (i & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.f52015OoooOoo) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.f52007OoooO0 = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((i & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((i & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int i3 = this.f52013OoooOo0.readByte() & UByte.MAX_VALUE;
            boolean z5 = (i3 & 128) != 0;
            if (z5 == this.f52012OoooOOo) {
                throw new ProtocolException(this.f52012OoooOOo ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = i3 & 127;
            this.f52005Oooo0oo = j;
            if (j == 126) {
                this.f52005Oooo0oo = this.f52013OoooOo0.readShort() & UShort.MAX_VALUE;
            } else if (j == 127) {
                long j2 = this.f52013OoooOo0.readLong();
                this.f52005Oooo0oo = j2;
                if (j2 < 0) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Frame length 0x");
                    String hexString = Long.toHexString(this.f52005Oooo0oo);
                    Intrinsics.checkNotNullExpressionValue(hexString, "java.lang.Long.toHexString(this)");
                    sbOooO0o0.append(hexString);
                    sbOooO0o0.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sbOooO0o0.toString());
                }
            }
            if (this.f52008OoooO00 && this.f52005Oooo0oo > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                o0oOOo o0oooo2 = this.f52013OoooOo0;
                byte[] bArr2 = this.f52017o000oOoO;
                Intrinsics.checkNotNull(bArr2);
                o0oooo2.readFully(bArr2);
            }
        } catch (Throwable th) {
            this.f52013OoooOo0.timeout().OooO0oO(jOooO0oo, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ek ekVar = this.f52010OoooOO0;
        if (ekVar != null) {
            ekVar.close();
        }
    }
}
