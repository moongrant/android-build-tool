package p226o00oOo00;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final AtomicLong f39822OooO0O0 = new AtomicLong();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, List<String>> f39823OooO00o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0000(long j, DataSpec dataSpec, long j2) {
        this(Collections.emptyMap());
        Uri uri = dataSpec.f14161OooO00o;
    }

    public o0000(Map map) {
        this.f39823OooO00o = map;
    }
}
