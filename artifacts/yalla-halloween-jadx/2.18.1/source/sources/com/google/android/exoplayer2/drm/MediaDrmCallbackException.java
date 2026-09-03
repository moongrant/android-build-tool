package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Map<String, List<String>> f13715Oooo0o;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.f13715Oooo0o = map;
    }
}
