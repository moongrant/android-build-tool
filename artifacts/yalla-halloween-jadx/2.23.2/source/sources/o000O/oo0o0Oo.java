package o000O;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class oo0o0Oo implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final oo0o0Oo f33891OooO0oO = new oo0o0Oo(new androidx.media3.common.o000oOoO[0]);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f33892OooO0oo = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f33893OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33894OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O00 f33895OooO0o0;

    static {
        new o0OO00O();
    }

    public oo0o0Oo(androidx.media3.common.o000oOoO... o000ooooArr) {
        this.f33895OooO0o0 = ImmutableList.OooOO0o(o000ooooArr);
        this.f33893OooO0Oo = o000ooooArr.length;
        int i = 0;
        while (true) {
            o0O00 o0o01 = this.f33895OooO0o0;
            if (i >= o0o01.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < o0o01.size(); i3++) {
                if (((androidx.media3.common.o000oOoO) o0o01.get(i)).equals(o0o01.get(i3))) {
                    Log.OooO0Oo("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final androidx.media3.common.o000oOoO OooO0OO(int i) {
        return (androidx.media3.common.o000oOoO) this.f33895OooO0o0.get(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oo0o0Oo.class != obj.getClass()) {
            return false;
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
        return this.f33893OooO0Oo == oo0o0oo.f33893OooO0Oo && this.f33895OooO0o0.equals(oo0o0oo.f33895OooO0o0);
    }

    public final int hashCode() {
        if (this.f33894OooO0o == 0) {
            this.f33894OooO0o = this.f33895OooO0o0.hashCode();
        }
        return this.f33894OooO0o;
    }

    @Override // androidx.media3.common.OooO0OO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f33892OooO0oo, p080o000OoO.o00oO0o.OooO0O0(this.f33895OooO0o0));
        return bundle;
    }
}
