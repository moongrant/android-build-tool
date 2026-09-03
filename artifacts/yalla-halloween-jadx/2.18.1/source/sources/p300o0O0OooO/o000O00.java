package p300o0O0OooO;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.UUID;
import kotlin.KotlinVersion;
import o00O00O.OooO0OO;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final UUID f36005OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36006OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f36007OooO0OO;

        public OooO00o(UUID uuid, int i, byte[] bArr) {
            this.f36005OooO00o = uuid;
            this.f36006OooO0O0 = i;
            this.f36007OooO0OO = bArr;
        }
    }

    @Nullable
    public static OooO00o OooO00o(byte[] bArr) {
        o000 o000Var = new o000(bArr);
        if (o000Var.f36663OooO0OO < 32) {
            return null;
        }
        o000Var.OooOoOO(0);
        if (o000Var.OooO0Oo() != (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0) + 4 || o000Var.OooO0Oo() != 1886614376) {
            return null;
        }
        int iOooO0Oo = (o000Var.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (iOooO0Oo > 1) {
            OooO0OO.OooO0O0(37, "Unsupported pssh version: ", iOooO0Oo, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(o000Var.OooOO0O(), o000Var.OooOO0O());
        if (iOooO0Oo == 1) {
            o000Var.OooOoo0(o000Var.OooOo00() * 16);
        }
        int iOooOo00 = o000Var.OooOo00();
        if (iOooOo00 != o000Var.f36663OooO0OO - o000Var.f36662OooO0O0) {
            return null;
        }
        byte[] bArr2 = new byte[iOooOo00];
        o000Var.OooO0OO(bArr2, 0, iOooOo00);
        return new OooO00o(uuid, iOooO0Oo, bArr2);
    }

    @Nullable
    public static byte[] OooO0O0(byte[] bArr, UUID uuid) {
        OooO00o OooO00o2 = OooO00o(bArr);
        if (OooO00o2 == null) {
            return null;
        }
        if (uuid == null || uuid.equals(OooO00o2.f36005OooO00o)) {
            return OooO00o2.f36007OooO0OO;
        }
        String strValueOf = String.valueOf(uuid);
        String strValueOf2 = String.valueOf(OooO00o2.f36005OooO00o);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 33);
        sb.append("UUID mismatch. Expected: ");
        sb.append(strValueOf);
        sb.append(", got: ");
        sb.append(strValueOf2);
        sb.append(".");
        Log.w("PsshAtomUtil", sb.toString());
        return null;
    }
}
