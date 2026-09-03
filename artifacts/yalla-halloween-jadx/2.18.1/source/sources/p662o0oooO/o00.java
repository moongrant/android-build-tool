package p662o0oooO;

import com.facebook.internal.security.CertificateUtil;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f51550OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f51551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f51552OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f51553OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f51554OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f51555OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    public final int f51556OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final ByteString f51557OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final ByteString f51558OooO0OO;

    static {
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        f51551OooO0Oo = oooO00o.OooO0OO(CertificateUtil.DELIMITER);
        f51553OooO0o0 = oooO00o.OooO0OO(":status");
        f51552OooO0o = oooO00o.OooO0OO(":method");
        f51554OooO0oO = oooO00o.OooO0OO(":path");
        f51555OooO0oo = oooO00o.OooO0OO(":scheme");
        f51550OooO = oooO00o.OooO0OO(":authority");
    }

    public o00(@NotNull ByteString name, @NotNull ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f51557OooO0O0 = name;
        this.f51558OooO0OO = value;
        this.f51556OooO00o = value.OooO0o0() + name.OooO0o0() + 32;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00)) {
            return false;
        }
        o00 o00Var = (o00) obj;
        return Intrinsics.areEqual(this.f51557OooO0O0, o00Var.f51557OooO0O0) && Intrinsics.areEqual(this.f51558OooO0OO, o00Var.f51558OooO0OO);
    }

    public final int hashCode() {
        ByteString byteString = this.f51557OooO0O0;
        int iHashCode = (byteString != null ? byteString.hashCode() : 0) * 31;
        ByteString byteString2 = this.f51558OooO0OO;
        return iHashCode + (byteString2 != null ? byteString2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return this.f51557OooO0O0.OooOOO() + ": " + this.f51558OooO0OO.OooOOO();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o00(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        this(oooO00o.OooO0OO(name), oooO00o.OooO0OO(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o00(@NotNull ByteString name, @NotNull String value) {
        this(name, ByteString.f53047OoooO00.OooO0OO(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
