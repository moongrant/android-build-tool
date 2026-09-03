package o000O0O;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f34179OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Map<String, String> f34180OooO0O0;

    public final synchronized Map<String, String> OooO00o() {
        if (this.f34180OooO0O0 == null) {
            this.f34180OooO0O0 = Collections.unmodifiableMap(new HashMap(this.f34179OooO00o));
        }
        return this.f34180OooO0O0;
    }
}
