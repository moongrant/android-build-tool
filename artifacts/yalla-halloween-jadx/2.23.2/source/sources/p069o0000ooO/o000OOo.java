package p069o0000ooO;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f33825OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f33826OooO0O0 = 0.0f;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000OOo.class != obj.getClass()) {
            return false;
        }
        o000OOo o000ooo2 = (o000OOo) obj;
        return this.f33825OooO00o == o000ooo2.f33825OooO00o && Float.compare(o000ooo2.f33826OooO0O0, this.f33826OooO0O0) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f33826OooO0O0) + ((527 + this.f33825OooO00o) * 31);
    }
}
