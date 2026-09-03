package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, List<String>> f11764OooO0Oo;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.f11764OooO0Oo = map;
    }
}
