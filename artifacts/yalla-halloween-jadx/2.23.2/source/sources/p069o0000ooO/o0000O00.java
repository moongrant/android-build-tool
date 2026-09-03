package p069o0000ooO;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f33816OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f33817OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f33818OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f33819OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f33820OooO0o0;

    public o0000O00(Object obj) {
        this(obj, -1L);
    }

    public final boolean OooO00o() {
        return this.f33817OooO0O0 != -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000O00)) {
            return false;
        }
        o0000O00 o0000o00 = (o0000O00) obj;
        return this.f33816OooO00o.equals(o0000o00.f33816OooO00o) && this.f33817OooO0O0 == o0000o00.f33817OooO0O0 && this.f33818OooO0OO == o0000o00.f33818OooO0OO && this.f33819OooO0Oo == o0000o00.f33819OooO0Oo && this.f33820OooO0o0 == o0000o00.f33820OooO0o0;
    }

    public final int hashCode() {
        return ((((((((this.f33816OooO00o.hashCode() + 527) * 31) + this.f33817OooO0O0) * 31) + this.f33818OooO0OO) * 31) + ((int) this.f33819OooO0Oo)) * 31) + this.f33820OooO0o0;
    }

    public o0000O00(Object obj, long j) {
        this(j, -1, -1, -1, obj);
    }

    public o0000O00(o0000O00 o0000o00) {
        this.f33816OooO00o = o0000o00.f33816OooO00o;
        this.f33817OooO0O0 = o0000o00.f33817OooO0O0;
        this.f33818OooO0OO = o0000o00.f33818OooO0OO;
        this.f33819OooO0Oo = o0000o00.f33819OooO0Oo;
        this.f33820OooO0o0 = o0000o00.f33820OooO0o0;
    }

    public o0000O00(long j, int i, int i2, int i3, Object obj) {
        this.f33816OooO00o = obj;
        this.f33817OooO0O0 = i;
        this.f33818OooO0OO = i2;
        this.f33819OooO0Oo = j;
        this.f33820OooO0o0 = i3;
    }
}
