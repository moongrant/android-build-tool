package p089o000o00O;

import androidx.annotation.NonNull;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f35221OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f35222OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f35223OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f35224OooO0Oo;

    public o00O00OO(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f35221OooO00o = z;
        this.f35222OooO0O0 = z2;
        this.f35223OooO0OO = z3;
        this.f35224OooO0Oo = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O00OO)) {
            return false;
        }
        o00O00OO o00o00oo2 = (o00O00OO) obj;
        return this.f35221OooO00o == o00o00oo2.f35221OooO00o && this.f35222OooO0O0 == o00o00oo2.f35222OooO0O0 && this.f35223OooO0OO == o00o00oo2.f35223OooO0OO && this.f35224OooO0Oo == o00o00oo2.f35224OooO0Oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z = this.f35222OooO0O0;
        ?? r1 = this.f35221OooO00o;
        int i = r1;
        if (z) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.f35223OooO0OO) {
            i2 = i + PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return this.f35224OooO0Oo ? i2 + 4096 : i2;
    }

    @NonNull
    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f35221OooO00o), Boolean.valueOf(this.f35222OooO0O0), Boolean.valueOf(this.f35223OooO0OO), Boolean.valueOf(this.f35224OooO0Oo));
    }
}
