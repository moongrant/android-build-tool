package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p200o00o0o.o0O0OOO0;
import p206o00o0oOO.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface ExoMediaDrm {

    public static final class KeyRequest {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f11760OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f11761OooO0O0;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(String str, byte[] bArr) {
            this.f11760OooO00o = bArr;
            this.f11761OooO0O0 = str;
        }
    }

    public interface OooO00o {
    }

    public interface OooO0O0 {
        ExoMediaDrm OooO00o(UUID uuid);
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f11762OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f11763OooO0O0;

        public OooO0OO(byte[] bArr, String str) {
            this.f11762OooO00o = bArr;
            this.f11763OooO0O0 = str;
        }
    }

    void OooO(byte[] bArr);

    Map<String, String> OooO00o(byte[] bArr);

    OooO0OO OooO0O0();

    byte[] OooO0OO() throws MediaDrmException;

    void OooO0Oo(byte[] bArr, byte[] bArr2);

    void OooO0o(@Nullable DefaultDrmSessionManager.OooO00o oooO00o);

    void OooO0o0(byte[] bArr) throws DeniedByServerException;

    int OooO0oO();

    o00Oo00 OooO0oo(byte[] bArr) throws MediaCryptoException;

    @Nullable
    byte[] OooOO0(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void OooOO0O(byte[] bArr, o0O0OOO0 o0o0ooo0);

    KeyRequest OooOO0o(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    boolean OooOOO0(String str, byte[] bArr);

    void release();
}
