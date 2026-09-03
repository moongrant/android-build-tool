package p655o0ooo0O;

import com.facebook.internal.security.CertificateUtil;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59417OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59418OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59419OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59420OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59421OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59422OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final ByteString f59423OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final ByteString f59424OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    public final int f59425OooO0OO;

    static {
        ByteString byteString = ByteString.f60193OooO0oO;
        f59418OooO0Oo = ByteString.OooO00o.OooO0OO(CertificateUtil.DELIMITER);
        f59420OooO0o0 = ByteString.OooO00o.OooO0OO(":status");
        f59419OooO0o = ByteString.OooO00o.OooO0OO(":method");
        f59421OooO0oO = ByteString.OooO00o.OooO0OO(":path");
        f59422OooO0oo = ByteString.OooO00o.OooO0OO(":scheme");
        f59417OooO = ByteString.OooO00o.OooO0OO(":authority");
    }

    public o0OOO0OO(@NotNull ByteString name, @NotNull ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f59423OooO00o = name;
        this.f59424OooO0O0 = value;
        this.f59425OooO0OO = value.OooO0o0() + name.OooO0o0() + 32;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OOO0OO)) {
            return false;
        }
        o0OOO0OO o0ooo0oo2 = (o0OOO0OO) obj;
        return Intrinsics.areEqual(this.f59423OooO00o, o0ooo0oo2.f59423OooO00o) && Intrinsics.areEqual(this.f59424OooO0O0, o0ooo0oo2.f59424OooO0O0);
    }

    public final int hashCode() {
        return this.f59424OooO0O0.hashCode() + (this.f59423OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return this.f59423OooO00o.OooOo00() + ": " + this.f59424OooO0O0.OooOo00();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(@NotNull String name, @NotNull String value) {
        this(ByteString.OooO00o.OooO0OO(name), ByteString.OooO00o.OooO0OO(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString byteString = ByteString.f60193OooO0oO;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(@NotNull String value, @NotNull ByteString name) {
        this(name, ByteString.OooO00o.OooO0OO(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString byteString = ByteString.f60193OooO0oO;
    }
}
