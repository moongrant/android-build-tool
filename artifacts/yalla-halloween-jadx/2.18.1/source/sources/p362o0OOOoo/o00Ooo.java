package p362o0OOOoo;

import OooO00o.OooO00o;
import android.os.Build;
import java.util.Objects;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends o0ooOOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f38531OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f38532OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38533OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f38534OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f38535OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f38536OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f38537OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f38538OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f38539OooO0oo;

    public o00Ooo(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f38532OooO00o = i;
        Objects.requireNonNull(str, "Null model");
        this.f38533OooO0O0 = str;
        this.f38534OooO0OO = i2;
        this.f38535OooO0Oo = j;
        this.f38537OooO0o0 = j2;
        this.f38536OooO0o = z;
        this.f38538OooO0oO = i3;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f38539OooO0oo = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f38531OooO = str3;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0O0
    public final long OooO() {
        return this.f38535OooO0Oo;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0O0
    public final int OooO00o() {
        return this.f38532OooO00o;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0O0
    public final int OooO0O0() {
        return this.f38534OooO0OO;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0O0
    public final long OooO0OO() {
        return this.f38537OooO0o0;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0O0
    public final boolean OooO0Oo() {
        return this.f38536OooO0o;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0O0
    public final String OooO0o() {
        return this.f38533OooO0O0;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0O0
    public final String OooO0o0() {
        return this.f38539OooO0oo;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0O0
    public final String OooO0oO() {
        return this.f38531OooO;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0O0
    public final int OooO0oo() {
        return this.f38538OooO0oO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0ooOOo.OooO0O0)) {
            return false;
        }
        o0ooOOo.OooO0O0 oooO0O0 = (o0ooOOo.OooO0O0) obj;
        return this.f38532OooO00o == oooO0O0.OooO00o() && this.f38533OooO0O0.equals(oooO0O0.OooO0o()) && this.f38534OooO0OO == oooO0O0.OooO0O0() && this.f38535OooO0Oo == oooO0O0.OooO() && this.f38537OooO0o0 == oooO0O0.OooO0OO() && this.f38536OooO0o == oooO0O0.OooO0Oo() && this.f38538OooO0oO == oooO0O0.OooO0oo() && this.f38539OooO0oo.equals(oooO0O0.OooO0o0()) && this.f38531OooO.equals(oooO0O0.OooO0oO());
    }

    public final int hashCode() {
        int iHashCode = (((((this.f38532OooO00o ^ 1000003) * 1000003) ^ this.f38533OooO0O0.hashCode()) * 1000003) ^ this.f38534OooO0OO) * 1000003;
        long j = this.f38535OooO0Oo;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f38537OooO0o0;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f38536OooO0o ? 1231 : 1237)) * 1000003) ^ this.f38538OooO0oO) * 1000003) ^ this.f38539OooO0oo.hashCode()) * 1000003) ^ this.f38531OooO.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DeviceData{arch=");
        sbOooO0o0.append(this.f38532OooO00o);
        sbOooO0o0.append(", model=");
        sbOooO0o0.append(this.f38533OooO0O0);
        sbOooO0o0.append(", availableProcessors=");
        sbOooO0o0.append(this.f38534OooO0OO);
        sbOooO0o0.append(", totalRam=");
        sbOooO0o0.append(this.f38535OooO0Oo);
        sbOooO0o0.append(", diskSpace=");
        sbOooO0o0.append(this.f38537OooO0o0);
        sbOooO0o0.append(", isEmulator=");
        sbOooO0o0.append(this.f38536OooO0o);
        sbOooO0o0.append(", state=");
        sbOooO0o0.append(this.f38538OooO0oO);
        sbOooO0o0.append(", manufacturer=");
        sbOooO0o0.append(this.f38539OooO0oo);
        sbOooO0o0.append(", modelClass=");
        return OooO.OooO00o(sbOooO0o0, this.f38531OooO, "}");
    }
}
