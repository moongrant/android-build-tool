package p228o00oOo0o;

import androidx.annotation.Nullable;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f39952OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f39953OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f39954OooO0OO;

    public o00oO0o(String str, @Nullable String str2, @Nullable String str3) {
        this.f39952OooO00o = str;
        this.f39953OooO0O0 = str2;
        this.f39954OooO0OO = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00oO0o.class != obj.getClass()) {
            return false;
        }
        o00oO0o o00oo0o2 = (o00oO0o) obj;
        return o0O00.OooO00o(this.f39952OooO00o, o00oo0o2.f39952OooO00o) && o0O00.OooO00o(this.f39953OooO0O0, o00oo0o2.f39953OooO0O0) && o0O00.OooO00o(this.f39954OooO0OO, o00oo0o2.f39954OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = this.f39952OooO00o.hashCode() * 31;
        String str = this.f39953OooO0O0;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39954OooO0OO;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
