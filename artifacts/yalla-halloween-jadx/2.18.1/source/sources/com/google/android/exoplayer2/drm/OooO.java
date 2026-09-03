package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p301o0O0Oooo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f13716OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f13717OooO0O0;

        public OooO00o(byte[] bArr, String str) {
            this.f13716OooO00o = bArr;
            this.f13717OooO0O0 = str;
        }
    }

    public interface OooO0O0 {
    }

    public interface OooO0OO {
        OooO OooO00o(UUID uuid);
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f13718OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f13719OooO0O0;

        public OooO0o(byte[] bArr, String str) {
            this.f13718OooO00o = bArr;
            this.f13719OooO0O0 = str;
        }
    }

    @Nullable
    byte[] OooO(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    Class<? extends o000OOo0> OooO00o();

    Map<String, String> OooO0O0(byte[] bArr);

    o000OOo0 OooO0OO(byte[] bArr) throws MediaCryptoException;

    OooO0o OooO0Oo();

    void OooO0o(byte[] bArr, byte[] bArr2);

    byte[] OooO0o0() throws MediaDrmException;

    void OooO0oO(byte[] bArr);

    void OooO0oo(@Nullable OooO0O0 oooO0O0);

    void OooOO0(byte[] bArr) throws DeniedByServerException;

    OooO00o OooOO0O(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    void release();
}
