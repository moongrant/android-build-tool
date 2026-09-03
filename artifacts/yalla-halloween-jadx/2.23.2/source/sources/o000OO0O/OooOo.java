package o000OO0O;

import android.media.UnsupportedSchemeException;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOo implements ExoMediaDrm.OooO0O0 {
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.OooO0O0
    public final ExoMediaDrm OooO00o(UUID uuid) {
        try {
            try {
                return new androidx.media3.exoplayer.drm.OooOO0(uuid);
            } catch (UnsupportedDrmException unused) {
                Log.OooO0OO("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new androidx.media3.exoplayer.drm.OooO0o();
            }
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(e2);
        }
    }
}
