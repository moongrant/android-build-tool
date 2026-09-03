package p674o0oooOoO;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p661o0ooo0o.o00OOO00;
import p676o0oooo0.o0oOO;
import p676o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class ik implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f52020Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f52021OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public long f52022OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f52023OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f52024OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f52025OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final o0oOO f52026OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public dk f52027OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final byte[] f52028OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final o0oOO.OooO00o f52029OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final boolean f52030OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final o0oOOo f52031Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final OooO00o f52032Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final boolean f52033OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final boolean f52034OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final o0oOO f52035o000oOoO;

    public interface OooO00o {
        void OooO00o(@NotNull ByteString byteString) throws IOException;

        void OooO0O0(@NotNull String str) throws IOException;

        void OooO0OO(@NotNull ByteString byteString);

        void OooO0Oo(@NotNull ByteString byteString);

        void OooO0o0(int i, @NotNull String str);
    }

    public ik(boolean z, @NotNull o0oOOo source, @NotNull OooO00o frameCallback, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f52030OoooOoo = z;
        this.f52031Ooooo00 = source;
        this.f52032Ooooo0o = frameCallback;
        this.f52033OooooO0 = z2;
        this.f52034OooooOO = z3;
        this.f52035o000oOoO = new o0oOO();
        this.f52026OoooOOO = new o0oOO();
        this.f52028OoooOo0 = z ? null : new byte[4];
        this.f52029OoooOoO = z ? null : new o0oOO.OooO00o();
    }

    public final void OooO00o() throws IOException {
        String strOooo0o;
        long j = this.f52022OoooO0;
        if (j > 0) {
            this.f52031Ooooo00.o0O0O00(this.f52035o000oOoO, j);
            if (!this.f52030OoooOoo) {
                o0oOO o0ooo2 = this.f52035o000oOoO;
                o0oOO.OooO00o oooO00o = this.f52029OoooOoO;
                Intrinsics.checkNotNull(oooO00o);
                o0ooo2.OooOoOO(oooO00o);
                this.f52029OoooOoO.OooO0O0(0L);
                o0oOO.OooO00o oooO00o2 = this.f52029OoooOoO;
                byte[] bArr = this.f52028OoooOo0;
                Intrinsics.checkNotNull(bArr);
                hk.OooO0O0(oooO00o2, bArr);
                this.f52029OoooOoO.close();
            }
        }
        switch (this.f52023OoooO00) {
            case 8:
                short s = 1005;
                o0oOO o0ooo3 = this.f52035o000oOoO;
                long j2 = o0ooo3.f52117OoooO00;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = o0ooo3.readShort();
                    strOooo0o = this.f52035o000oOoO.Oooo0o();
                    String strOooO00o = hk.OooO00o(s);
                    if (strOooO00o != null) {
                        throw new ProtocolException(strOooO00o);
                    }
                } else {
                    strOooo0o = "";
                }
                this.f52032Ooooo0o.OooO0o0(s, strOooo0o);
                this.f52020Oooo = true;
                return;
            case 9:
                this.f52032Ooooo0o.OooO0OO(this.f52035o000oOoO.OooOoo());
                return;
            case 10:
                this.f52032Ooooo0o.OooO0Oo(this.f52035o000oOoO.OooOoo());
                return;
            default:
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Unknown control opcode: ");
                sbOooO0O0.append(o00OOO00.OooOo(this.f52023OoooO00));
                throw new ProtocolException(sbOooO0O0.toString());
        }
    }

    public final void OooO0O0() throws IOException {
        boolean z;
        if (this.f52020Oooo) {
            throw new IOException("closed");
        }
        long jOooO0oo = this.f52031Ooooo00.timeout().OooO0oo();
        this.f52031Ooooo00.timeout().OooO0O0();
        try {
            byte b = this.f52031Ooooo00.readByte();
            byte[] bArr = o00OOO00.f51201OooO00o;
            int i = b & UByte.MAX_VALUE;
            this.f52031Ooooo00.timeout().OooO0oO(jOooO0oo, TimeUnit.NANOSECONDS);
            int i2 = i & 15;
            this.f52023OoooO00 = i2;
            boolean z2 = (i & 128) != 0;
            this.f52024OoooO0O = z2;
            boolean z3 = (i & 8) != 0;
            this.f52021OoooO = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (i & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.f52033OooooO0) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.f52025OoooOO0 = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((i & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((i & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int i3 = this.f52031Ooooo00.readByte() & UByte.MAX_VALUE;
            boolean z5 = (i3 & 128) != 0;
            if (z5 == this.f52030OoooOoo) {
                throw new ProtocolException(this.f52030OoooOoo ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = i3 & 127;
            this.f52022OoooO0 = j;
            if (j == 126) {
                this.f52022OoooO0 = this.f52031Ooooo00.readShort() & UShort.MAX_VALUE;
            } else if (j == 127) {
                long j2 = this.f52031Ooooo00.readLong();
                this.f52022OoooO0 = j2;
                if (j2 < 0) {
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Frame length 0x");
                    String hexString = Long.toHexString(this.f52022OoooO0);
                    Intrinsics.checkNotNullExpressionValue(hexString, "java.lang.Long.toHexString(this)");
                    sbOooO0O0.append(hexString);
                    sbOooO0O0.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sbOooO0O0.toString());
                }
            }
            if (this.f52021OoooO && this.f52022OoooO0 > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                o0oOOo o0oooo2 = this.f52031Ooooo00;
                byte[] bArr2 = this.f52028OoooOo0;
                Intrinsics.checkNotNull(bArr2);
                o0oooo2.readFully(bArr2);
            }
        } catch (Throwable th) {
            this.f52031Ooooo00.timeout().OooO0oO(jOooO0oo, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        dk dkVar = this.f52027OoooOOo;
        if (dkVar != null) {
            dkVar.close();
        }
    }
}
