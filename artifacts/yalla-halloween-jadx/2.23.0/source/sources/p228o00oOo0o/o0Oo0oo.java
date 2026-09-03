package p228o00oOo0o;

import androidx.annotation.Nullable;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f39980OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f39981OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f39982OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f39983OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f39984OooO0o0;

    public o0Oo0oo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f39980OooO00o = str;
        this.f39981OooO0O0 = str2;
        this.f39982OooO0OO = str3;
        this.f39983OooO0Oo = str4;
        this.f39984OooO0o0 = str5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0Oo0oo)) {
            return false;
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        return o0O00.OooO00o(this.f39980OooO00o, o0oo0oo2.f39980OooO00o) && o0O00.OooO00o(this.f39981OooO0O0, o0oo0oo2.f39981OooO0O0) && o0O00.OooO00o(this.f39982OooO0OO, o0oo0oo2.f39982OooO0OO) && o0O00.OooO00o(this.f39983OooO0Oo, o0oo0oo2.f39983OooO0Oo) && o0O00.OooO00o(this.f39984OooO0o0, o0oo0oo2.f39984OooO0o0);
    }

    public final int hashCode() {
        String str = this.f39980OooO00o;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39981OooO0O0;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39982OooO0OO;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f39983OooO0Oo;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f39984OooO0o0;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
