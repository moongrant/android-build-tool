package p109o000ooo;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f30020OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f30021OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f30022OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f30023OooO0Oo;

    public o00000O(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f30020OooO00o = z;
        this.f30021OooO0O0 = z2;
        this.f30022OooO0OO = z3;
        this.f30023OooO0Oo = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000O)) {
            return false;
        }
        o00000O o00000o = (o00000O) obj;
        return this.f30020OooO00o == o00000o.f30020OooO00o && this.f30021OooO0O0 == o00000o.f30021OooO0O0 && this.f30022OooO0OO == o00000o.f30022OooO0OO && this.f30023OooO0Oo == o00000o.f30023OooO0Oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r0 = this.f30020OooO00o;
        int i = r0;
        if (this.f30021OooO0O0) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.f30022OooO0OO) {
            i2 = i + 256;
        }
        return this.f30023OooO0Oo ? i2 + 4096 : i2;
    }

    @NonNull
    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f30020OooO00o), Boolean.valueOf(this.f30021OooO0O0), Boolean.valueOf(this.f30022OooO0OO), Boolean.valueOf(this.f30023OooO0Oo));
    }
}
