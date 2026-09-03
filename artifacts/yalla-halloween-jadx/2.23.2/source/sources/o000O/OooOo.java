package o000O;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final AtomicLong f33842OooO0O0 = new AtomicLong();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, List<String>> f33843OooO00o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OooOo(long j, DataSpec dataSpec, long j2) {
        this(Collections.emptyMap());
        Uri uri = dataSpec.f6970OooO00o;
    }

    public OooOo(Map map) {
        this.f33843OooO00o = map;
    }
}
