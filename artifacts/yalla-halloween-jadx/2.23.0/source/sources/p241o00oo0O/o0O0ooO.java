package p241o00oo0O;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooO;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.OooO0o;
import java.util.Collections;
import java.util.List;
import p226o00oOo00.o000O00O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O0ooO implements OooO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f40409OooO0o = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f40410OooO0oO = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O00O f40411OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ImmutableList<Integer> f40412OooO0o0;

    static {
        new o00O0000();
    }

    public o0O0ooO(o000O00O o000o00o2, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= o000o00o2.f39873OooO0Oo)) {
            throw new IndexOutOfBoundsException();
        }
        this.f40411OooO0Oo = o000o00o2;
        this.f40412OooO0o0 = ImmutableList.OooOO0O(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0O0ooO.class != obj.getClass()) {
            return false;
        }
        o0O0ooO o0o0ooo = (o0O0ooO) obj;
        return this.f40411OooO0Oo.equals(o0o0ooo.f40411OooO0Oo) && this.f40412OooO0o0.equals(o0o0ooo.f40412OooO0o0);
    }

    public final int hashCode() {
        return (this.f40412OooO0o0.hashCode() * 31) + this.f40411OooO0Oo.hashCode();
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f40409OooO0o, this.f40411OooO0Oo.toBundle());
        bundle.putIntArray(f40410OooO0oO, OooO0o.OooO0Oo(this.f40412OooO0o0));
        return bundle;
    }
}
