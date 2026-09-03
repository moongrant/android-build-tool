package p341o0OO0ooo;

import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final ByteString f42691OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ByteString f42692OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ByteString f42693OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ByteString f42694OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ByteString f42695OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final ByteString f42696OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final ByteString f42697OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteString f42698OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ByteString f42699OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f42700OooO0OO;

    static {
        ByteString byteString = ByteString.f60193OooO0oO;
        f42692OooO0Oo = ByteString.OooO00o.OooO0OO(":status");
        f42694OooO0o0 = ByteString.OooO00o.OooO0OO(":method");
        f42693OooO0o = ByteString.OooO00o.OooO0OO(":path");
        f42695OooO0oO = ByteString.OooO00o.OooO0OO(":scheme");
        f42696OooO0oo = ByteString.OooO00o.OooO0OO(":authority");
        f42691OooO = ByteString.OooO00o.OooO0OO(":host");
        f42697OooOO0 = ByteString.OooO00o.OooO0OO(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0000O0O(String str, String str2) {
        this(ByteString.OooO00o.OooO0OO(str), ByteString.OooO00o.OooO0OO(str2));
        ByteString byteString = ByteString.f60193OooO0oO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0000O0O)) {
            return false;
        }
        o0000O0O o0000o0o2 = (o0000O0O) obj;
        return this.f42698OooO00o.equals(o0000o0o2.f42698OooO00o) && this.f42699OooO0O0.equals(o0000o0o2.f42699OooO0O0);
    }

    public final int hashCode() {
        return this.f42699OooO0O0.hashCode() + ((this.f42698OooO00o.hashCode() + 527) * 31);
    }

    public final String toString() {
        return String.format("%s: %s", this.f42698OooO00o.OooOo00(), this.f42699OooO0O0.OooOo00());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0000O0O(String str, ByteString byteString) {
        this(byteString, ByteString.OooO00o.OooO0OO(str));
        ByteString byteString2 = ByteString.f60193OooO0oO;
    }

    public o0000O0O(ByteString byteString, ByteString byteString2) {
        this.f42698OooO00o = byteString;
        this.f42699OooO0O0 = byteString2;
        this.f42700OooO0OO = byteString2.OooO0o0() + byteString.OooO0o0() + 32;
    }
}
