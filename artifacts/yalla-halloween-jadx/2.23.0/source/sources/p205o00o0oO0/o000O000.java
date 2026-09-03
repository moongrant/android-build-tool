package p205o00o0oO0;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f39346OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f39347OooO0O0 = 0.0f;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000O000.class != obj.getClass()) {
            return false;
        }
        o000O000 o000o001 = (o000O000) obj;
        return this.f39346OooO00o == o000o001.f39346OooO00o && Float.compare(o000o001.f39347OooO0O0, this.f39347OooO0O0) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f39347OooO0O0) + ((527 + this.f39346OooO00o) * 31);
    }
}
