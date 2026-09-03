package kotlin.collections;

import android.media.UnsupportedSchemeException;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.OooOO0;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.util.Log;
import java.util.UUID;
import kotlin.UInt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO00o implements ExoMediaDrm.OooO0O0 {
    public static int OooO0O0(UInt uInt, int i) {
        return UInt.m4308constructorimpl(uInt.getData() + i);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.OooO0O0
    public ExoMediaDrm OooO00o(UUID uuid) {
        try {
            try {
                return new OooOO0(uuid);
            } catch (UnsupportedDrmException unused) {
                Log.OooO0OO("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new com.google.android.exoplayer2.drm.OooO0o();
            }
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(e2);
        }
    }
}
