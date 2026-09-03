package p090o000o00o;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.util.UUID;
import p070o000O0o.Oooo000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0oOOo {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final UUID f35091OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f35092OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f35093OooO0OO;

        public OooO00o(UUID uuid, int i, byte[] bArr) {
            this.f35091OooO00o = uuid;
            this.f35092OooO0O0 = i;
            this.f35093OooO0OO = bArr;
        }
    }

    @Nullable
    public static OooO00o OooO00o(byte[] bArr) {
        o000O000 o000o001 = new o000O000(bArr);
        if (o000o001.f34964OooO0OO < 32) {
            return null;
        }
        o000o001.Oooo00O(0);
        if (o000o001.OooO0o() != (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0) + 4 || o000o001.OooO0o() != 1886614376) {
            return null;
        }
        int iOooO0o = (o000o001.OooO0o() >> 24) & 255;
        if (iOooO0o > 1) {
            Oooo000.OooO00o("Unsupported pssh version: ", iOooO0o, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(o000o001.OooOOOO(), o000o001.OooOOOO());
        if (iOooO0o == 1) {
            o000o001.Oooo00o(o000o001.OooOoO0() * 16);
        }
        int iOooOoO0 = o000o001.OooOoO0();
        if (iOooOoO0 != o000o001.f34964OooO0OO - o000o001.f34963OooO0O0) {
            return null;
        }
        byte[] bArr2 = new byte[iOooOoO0];
        o000o001.OooO0Oo(0, iOooOoO0, bArr2);
        return new OooO00o(uuid, iOooO0o, bArr2);
    }

    @Nullable
    public static byte[] OooO0O0(UUID uuid, byte[] bArr) {
        OooO00o OooO00o2 = OooO00o(bArr);
        if (OooO00o2 == null) {
            return null;
        }
        UUID uuid2 = OooO00o2.f35091OooO00o;
        if (uuid.equals(uuid2)) {
            return OooO00o2.f35093OooO0OO;
        }
        Log.OooO0o("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
