package p414o0Oo0o0o;

import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final ByteString f39550OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ByteString f39551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ByteString f39552OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ByteString f39553OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ByteString f39554OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final ByteString f39555OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final ByteString f39556OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteString f39557OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ByteString f39558OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39559OooO0OO;

    static {
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        f39551OooO0Oo = oooO00o.OooO0OO(":status");
        f39553OooO0o0 = oooO00o.OooO0OO(":method");
        f39552OooO0o = oooO00o.OooO0OO(":path");
        f39554OooO0oO = oooO00o.OooO0OO(":scheme");
        f39555OooO0oo = oooO00o.OooO0OO(":authority");
        f39550OooO = oooO00o.OooO0OO(":host");
        f39556OooOO0 = oooO00o.OooO0OO(":version");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o000OO(String str, String str2) {
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        this(oooO00o.OooO0OO(str), oooO00o.OooO0OO(str2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o000OO)) {
            return false;
        }
        o000OO o000oo2 = (o000OO) obj;
        return this.f39557OooO00o.equals(o000oo2.f39557OooO00o) && this.f39558OooO0O0.equals(o000oo2.f39558OooO0O0);
    }

    public final int hashCode() {
        return this.f39558OooO0O0.hashCode() + ((this.f39557OooO00o.hashCode() + 527) * 31);
    }

    public final String toString() {
        return String.format("%s: %s", this.f39557OooO00o.OooOOO(), this.f39558OooO0O0.OooOOO());
    }

    public o000OO(ByteString byteString, String str) {
        this(byteString, ByteString.f53047OoooO00.OooO0OO(str));
    }

    public o000OO(ByteString byteString, ByteString byteString2) {
        this.f39557OooO00o = byteString;
        this.f39558OooO0O0 = byteString2;
        this.f39559OooO0OO = byteString2.OooO0o0() + byteString.OooO0o0() + 32;
    }
}
