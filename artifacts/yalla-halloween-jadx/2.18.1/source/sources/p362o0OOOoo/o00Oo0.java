package p362o0OOOoo;

import OooO00o.OooO00o;
import java.util.Objects;
import p354o0OOOo.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends o0ooOOo.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38525OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38526OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f38527OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f38528OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOOO f38529OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f38530OooO0o0;

    public o00Oo0(String str, String str2, String str3, String str4, int i, OooOOO oooOOO) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f38525OooO00o = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f38526OooO0O0 = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f38527OooO0OO = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f38528OooO0Oo = str4;
        this.f38530OooO0o0 = i;
        Objects.requireNonNull(oooOOO, "Null developmentPlatformProvider");
        this.f38529OooO0o = oooOOO;
    }

    @Override // o0OOOoo.o0ooOOo.OooO00o
    public final String OooO00o() {
        return this.f38525OooO00o;
    }

    @Override // o0OOOoo.o0ooOOo.OooO00o
    public final int OooO0O0() {
        return this.f38530OooO0o0;
    }

    @Override // o0OOOoo.o0ooOOo.OooO00o
    public final OooOOO OooO0OO() {
        return this.f38529OooO0o;
    }

    @Override // o0OOOoo.o0ooOOo.OooO00o
    public final String OooO0Oo() {
        return this.f38528OooO0Oo;
    }

    @Override // o0OOOoo.o0ooOOo.OooO00o
    public final String OooO0o() {
        return this.f38527OooO0OO;
    }

    @Override // o0OOOoo.o0ooOOo.OooO00o
    public final String OooO0o0() {
        return this.f38526OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0ooOOo.OooO00o)) {
            return false;
        }
        o0ooOOo.OooO00o oooO00o = (o0ooOOo.OooO00o) obj;
        return this.f38525OooO00o.equals(oooO00o.OooO00o()) && this.f38526OooO0O0.equals(oooO00o.OooO0o0()) && this.f38527OooO0OO.equals(oooO00o.OooO0o()) && this.f38528OooO0Oo.equals(oooO00o.OooO0Oo()) && this.f38530OooO0o0 == oooO00o.OooO0O0() && this.f38529OooO0o.equals(oooO00o.OooO0OO());
    }

    public final int hashCode() {
        return ((((((((((this.f38525OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f38526OooO0O0.hashCode()) * 1000003) ^ this.f38527OooO0OO.hashCode()) * 1000003) ^ this.f38528OooO0Oo.hashCode()) * 1000003) ^ this.f38530OooO0o0) * 1000003) ^ this.f38529OooO0o.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AppData{appIdentifier=");
        sbOooO0o0.append(this.f38525OooO00o);
        sbOooO0o0.append(", versionCode=");
        sbOooO0o0.append(this.f38526OooO0O0);
        sbOooO0o0.append(", versionName=");
        sbOooO0o0.append(this.f38527OooO0OO);
        sbOooO0o0.append(", installUuid=");
        sbOooO0o0.append(this.f38528OooO0Oo);
        sbOooO0o0.append(", deliveryMechanism=");
        sbOooO0o0.append(this.f38530OooO0o0);
        sbOooO0o0.append(", developmentPlatformProvider=");
        sbOooO0o0.append(this.f38529OooO0o);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
