package p651o0ooo00O;

import com.facebook.internal.security.CertificateUtil;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59990OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59991OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59992OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59993OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59994OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f59995OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final ByteString f59996OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final ByteString f59997OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    public final int f59998OooO0OO;

    static {
        ByteString byteString = ByteString.f60866OooO0oO;
        f59991OooO0Oo = ByteString.OooO00o.OooO0OO(CertificateUtil.DELIMITER);
        f59993OooO0o0 = ByteString.OooO00o.OooO0OO(":status");
        f59992OooO0o = ByteString.OooO00o.OooO0OO(":method");
        f59994OooO0oO = ByteString.OooO00o.OooO0OO(":path");
        f59995OooO0oo = ByteString.OooO00o.OooO0OO(":scheme");
        f59990OooO = ByteString.OooO00o.OooO0OO(":authority");
    }

    public o0OO00O(@NotNull ByteString name, @NotNull ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f59996OooO00o = name;
        this.f59997OooO0O0 = value;
        this.f59998OooO0OO = value.OooO0o0() + name.OooO0o0() + 32;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OO00O)) {
            return false;
        }
        o0OO00O o0oo00o2 = (o0OO00O) obj;
        return Intrinsics.areEqual(this.f59996OooO00o, o0oo00o2.f59996OooO00o) && Intrinsics.areEqual(this.f59997OooO0O0, o0oo00o2.f59997OooO0O0);
    }

    public final int hashCode() {
        return this.f59997OooO0O0.hashCode() + (this.f59996OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return this.f59996OooO00o.OooOo00() + ": " + this.f59997OooO0O0.OooOo00();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0OO00O(@NotNull String name, @NotNull String value) {
        this(ByteString.OooO00o.OooO0OO(name), ByteString.OooO00o.OooO0OO(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString byteString = ByteString.f60866OooO0oO;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0OO00O(@NotNull String value, @NotNull ByteString name) {
        this(name, ByteString.OooO00o.OooO0OO(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString byteString = ByteString.f60866OooO0oO;
    }
}
