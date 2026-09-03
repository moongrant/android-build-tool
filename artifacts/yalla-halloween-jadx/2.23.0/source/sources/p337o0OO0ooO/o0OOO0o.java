package p337o0OO0ooO;

import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final ByteString f43419OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ByteString f43420OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ByteString f43421OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ByteString f43422OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ByteString f43423OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final ByteString f43424OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final ByteString f43425OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteString f43426OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ByteString f43427OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f43428OooO0OO;

    static {
        ByteString byteString = ByteString.f60866OooO0oO;
        f43420OooO0Oo = ByteString.OooO00o.OooO0OO(":status");
        f43422OooO0o0 = ByteString.OooO00o.OooO0OO(":method");
        f43421OooO0o = ByteString.OooO00o.OooO0OO(":path");
        f43423OooO0oO = ByteString.OooO00o.OooO0OO(":scheme");
        f43424OooO0oo = ByteString.OooO00o.OooO0OO(":authority");
        f43419OooO = ByteString.OooO00o.OooO0OO(":host");
        f43425OooOO0 = ByteString.OooO00o.OooO0OO(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(String str, String str2) {
        this(ByteString.OooO00o.OooO0OO(str), ByteString.OooO00o.OooO0OO(str2));
        ByteString byteString = ByteString.f60866OooO0oO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0OOO0o)) {
            return false;
        }
        o0OOO0o o0ooo0o2 = (o0OOO0o) obj;
        return this.f43426OooO00o.equals(o0ooo0o2.f43426OooO00o) && this.f43427OooO0O0.equals(o0ooo0o2.f43427OooO0O0);
    }

    public final int hashCode() {
        return this.f43427OooO0O0.hashCode() + ((this.f43426OooO00o.hashCode() + 527) * 31);
    }

    public final String toString() {
        return String.format("%s: %s", this.f43426OooO00o.OooOo00(), this.f43427OooO0O0.OooOo00());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(String str, ByteString byteString) {
        this(byteString, ByteString.OooO00o.OooO0OO(str));
        ByteString byteString2 = ByteString.f60866OooO0oO;
    }

    public o0OOO0o(ByteString byteString, ByteString byteString2) {
        this.f43426OooO00o = byteString;
        this.f43427OooO0O0 = byteString2;
        this.f43428OooO0OO = byteString2.OooO0o0() + byteString.OooO0o0() + 32;
    }
}
