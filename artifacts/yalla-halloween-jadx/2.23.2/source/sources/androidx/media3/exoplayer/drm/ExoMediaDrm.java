package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o000O0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface ExoMediaDrm {

    public static final class KeyRequest {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f7630OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f7631OooO0O0;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(String str, byte[] bArr) {
            this.f7630OooO00o = bArr;
            this.f7631OooO0O0 = str;
        }
    }

    public interface OooO00o {
    }

    public interface OooO0O0 {
        ExoMediaDrm OooO00o(UUID uuid);
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f7632OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f7633OooO0O0;

        public OooO0OO(byte[] bArr, String str) {
            this.f7632OooO00o = bArr;
            this.f7633OooO0O0 = str;
        }
    }

    o000O00.OooO0O0 OooO(byte[] bArr) throws MediaCryptoException;

    Map<String, String> OooO00o(byte[] bArr);

    OooO0OO OooO0O0();

    byte[] OooO0OO() throws MediaDrmException;

    void OooO0Oo(byte[] bArr, byte[] bArr2);

    void OooO0o(byte[] bArr) throws DeniedByServerException;

    void OooO0o0(@Nullable DefaultDrmSessionManager.OooO00o oooO00o);

    void OooO0oO(byte[] bArr, o0oOO o0ooo2);

    int OooO0oo();

    void OooOO0(byte[] bArr);

    @Nullable
    byte[] OooOO0O(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    KeyRequest OooOO0o(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    boolean OooOOO0(String str, byte[] bArr);

    void release();
}
