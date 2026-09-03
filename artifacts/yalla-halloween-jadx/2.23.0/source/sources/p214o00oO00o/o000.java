package p214o00oO00o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import java.nio.ByteBuffer;
import java.util.UUID;
import p101o000oo.Oooo000;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000 {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final UUID f39655OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f39656OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f39657OooO0OO;

        public OooO00o(UUID uuid, int i, byte[] bArr) {
            this.f39655OooO00o = uuid;
            this.f39656OooO0O0 = i;
            this.f39657OooO0OO = bArr;
        }
    }

    public static byte[] OooO00o(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    @Nullable
    public static OooO00o OooO0O0(byte[] bArr) {
        o00Oo00 o00oo00 = new o00Oo00(bArr);
        if (o00oo00.f40593OooO0OO < 32) {
            return null;
        }
        o00oo00.Oooo00O(0);
        if (o00oo00.OooO0o() != (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0) + 4 || o00oo00.OooO0o() != 1886614376) {
            return null;
        }
        int iOooO0o = (o00oo00.OooO0o() >> 24) & 255;
        if (iOooO0o > 1) {
            Oooo000.OooO0O0("Unsupported pssh version: ", iOooO0o, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(o00oo00.OooOOOO(), o00oo00.OooOOOO());
        if (iOooO0o == 1) {
            o00oo00.Oooo00o(o00oo00.OooOoO0() * 16);
        }
        int iOooOoO0 = o00oo00.OooOoO0();
        if (iOooOoO0 != o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0) {
            return null;
        }
        byte[] bArr2 = new byte[iOooOoO0];
        o00oo00.OooO0Oo(0, iOooOoO0, bArr2);
        return new OooO00o(uuid, iOooO0o, bArr2);
    }

    @Nullable
    public static byte[] OooO0OO(UUID uuid, byte[] bArr) {
        OooO00o oooO00oOooO0O0 = OooO0O0(bArr);
        if (oooO00oOooO0O0 == null) {
            return null;
        }
        UUID uuid2 = oooO00oOooO0O0.f39655OooO00o;
        if (uuid.equals(uuid2)) {
            return oooO00oOooO0O0.f39657OooO0OO;
        }
        Log.OooO0o("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
