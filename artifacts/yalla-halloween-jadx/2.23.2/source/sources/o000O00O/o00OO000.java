package o000O00O;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o00OO000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00OO000 f34127OooO0O0 = new o00OO000(false);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f34128OooO00o;

    public o00OO000(boolean z) {
        this.f34128OooO00o = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && o00OO000.class == obj.getClass() && this.f34128OooO00o == ((o00OO000) obj).f34128OooO00o;
    }

    public final int hashCode() {
        return !this.f34128OooO00o ? 1 : 0;
    }
}
