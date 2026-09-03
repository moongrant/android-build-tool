package p244o00oo0Oo;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f40511OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Map<String, String> f40512OooO0O0;

    public final synchronized Map<String, String> OooO00o() {
        if (this.f40512OooO0O0 == null) {
            this.f40512OooO0O0 = Collections.unmodifiableMap(new HashMap(this.f40511OooO00o));
        }
        return this.f40512OooO0O0;
    }
}
