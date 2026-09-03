package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.NativeCrypto;
import org.jetbrains.annotations.NotNull;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lokhttp3/TlsVersion;", "", "", "javaName", "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "Companion", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "okhttp"}, k = 1, mv = {1, 4, 0})
public enum TlsVersion {
    TLS_1_3(NativeCrypto.SUPPORTED_PROTOCOL_TLSV1_3),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0(NativeCrypto.OBSOLETE_PROTOCOL_SSLV3);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String javaName;

    /* JADX INFO: renamed from: okhttp3.TlsVersion$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JvmStatic
        @NotNull
        public final TlsVersion OooO00o(@NotNull String javaName) {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals(NativeCrypto.SUPPORTED_PROTOCOL_TLSV1_3)) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (javaName.equals(NativeCrypto.OBSOLETE_PROTOCOL_SSLV3)) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException(OooOo00.OooO0Oo("Unexpected TLS version: ", javaName));
        }
    }

    TlsVersion(String str) {
        this.javaName = str;
    }

    @JvmName(name = "javaName")
    @NotNull
    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }
}
