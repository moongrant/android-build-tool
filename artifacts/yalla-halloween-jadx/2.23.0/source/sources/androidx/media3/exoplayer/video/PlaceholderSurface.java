package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(17)
@UnstableApi
public final class PlaceholderSurface extends Surface {
    @Override // android.view.Surface
    public final void release() {
        super.release();
        throw null;
    }
}
