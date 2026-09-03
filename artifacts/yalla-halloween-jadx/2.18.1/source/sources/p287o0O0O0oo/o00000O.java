package p287o0O0O0oo;

import OooO00o.OooO00o;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Objects;
import p058o0000OoO.OooO;
import p289o0O0OOoO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O extends o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f35515OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000Ooo f35516OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000Ooo f35517OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f35518OooO0Oo;

    public o00000O(Context context, o0000Ooo o0000ooo, o0000Ooo o0000ooo2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f35515OooO00o = context;
        Objects.requireNonNull(o0000ooo, "Null wallClock");
        this.f35516OooO0O0 = o0000ooo;
        Objects.requireNonNull(o0000ooo2, "Null monotonicClock");
        this.f35517OooO0OO = o0000ooo2;
        Objects.requireNonNull(str, "Null backendName");
        this.f35518OooO0Oo = str;
    }

    @Override // p287o0O0O0oo.o0000oo
    public final Context OooO00o() {
        return this.f35515OooO00o;
    }

    @Override // p287o0O0O0oo.o0000oo
    @NonNull
    public final String OooO0O0() {
        return this.f35518OooO0Oo;
    }

    @Override // p287o0O0O0oo.o0000oo
    public final o0000Ooo OooO0OO() {
        return this.f35517OooO0OO;
    }

    @Override // p287o0O0O0oo.o0000oo
    public final o0000Ooo OooO0Oo() {
        return this.f35516OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0000oo)) {
            return false;
        }
        o0000oo o0000ooVar = (o0000oo) obj;
        return this.f35515OooO00o.equals(o0000ooVar.OooO00o()) && this.f35516OooO0O0.equals(o0000ooVar.OooO0Oo()) && this.f35517OooO0OO.equals(o0000ooVar.OooO0OO()) && this.f35518OooO0Oo.equals(o0000ooVar.OooO0O0());
    }

    public final int hashCode() {
        return ((((((this.f35515OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f35516OooO0O0.hashCode()) * 1000003) ^ this.f35517OooO0OO.hashCode()) * 1000003) ^ this.f35518OooO0Oo.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CreationContext{applicationContext=");
        sbOooO0o0.append(this.f35515OooO00o);
        sbOooO0o0.append(", wallClock=");
        sbOooO0o0.append(this.f35516OooO0O0);
        sbOooO0o0.append(", monotonicClock=");
        sbOooO0o0.append(this.f35517OooO0OO);
        sbOooO0o0.append(", backendName=");
        return OooO.OooO00o(sbOooO0o0, this.f35518OooO0Oo, "}");
    }
}
