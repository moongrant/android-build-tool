package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.UnstableApi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o000O0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
@UnstableApi
public final class OooO0o implements ExoMediaDrm {
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final o000O00.OooO0O0 OooO(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final Map<String, String> OooO00o(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final ExoMediaDrm.OooO0OO OooO0O0() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] OooO0OO() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void OooO0Oo(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void OooO0o(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void OooO0o0(@Nullable DefaultDrmSessionManager.OooO00o oooO00o) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final /* synthetic */ void OooO0oO(byte[] bArr, o0oOO o0ooo2) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final int OooO0oo() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void OooOO0(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @Nullable
    public final byte[] OooOO0O(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final ExoMediaDrm.KeyRequest OooOO0o(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final boolean OooOOO0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void release() {
    }
}
