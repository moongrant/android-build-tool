package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, List<String>> f7634OooO0Oo;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.f7634OooO0Oo = map;
    }
}
