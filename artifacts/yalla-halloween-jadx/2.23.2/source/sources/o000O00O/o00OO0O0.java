package o000O00O;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o00OO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00OO0O0 f34129OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f34130OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f34131OooO0O0;

    static {
        o00OO0O0 o00oo0o1 = new o00OO0O0(0L, 0L);
        new o00OO0O0(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
        new o00OO0O0(LongCompanionObject.MAX_VALUE, 0L);
        new o00OO0O0(0L, LongCompanionObject.MAX_VALUE);
        f34129OooO0OO = o00oo0o1;
    }

    public o00OO0O0(long j, long j2) {
        p080o000OoO.o00Oo0.OooO00o(j >= 0);
        p080o000OoO.o00Oo0.OooO00o(j2 >= 0);
        this.f34130OooO00o = j;
        this.f34131OooO0O0 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00OO0O0.class != obj.getClass()) {
            return false;
        }
        o00OO0O0 o00oo0o1 = (o00OO0O0) obj;
        return this.f34130OooO00o == o00oo0o1.f34130OooO00o && this.f34131OooO0O0 == o00oo0o1.f34131OooO0O0;
    }

    public final int hashCode() {
        return (((int) this.f34130OooO00o) * 31) + ((int) this.f34131OooO0O0);
    }
}
