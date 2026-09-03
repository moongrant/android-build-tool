package p226o00oOo00;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.appevents.OooOOO;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import p245o00oo0o.o0O00;
import p245o00oo0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O0 implements OooO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o000O0 f39864OooO0oO = new o000O0(new o000O00O[0]);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f39865OooO0oo = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f39866OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f39867OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.google.common.collect.o0O00 f39868OooO0o0;

    static {
        new OooOOO();
    }

    public o000O0(o000O00O... o000o00oArr) {
        this.f39868OooO0o0 = ImmutableList.OooOO0o(o000o00oArr);
        this.f39866OooO0Oo = o000o00oArr.length;
        int i = 0;
        while (true) {
            com.google.common.collect.o0O00 o0o01 = this.f39868OooO0o0;
            if (i >= o0o01.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < o0o01.size(); i3++) {
                if (((o000O00O) o0o01.get(i)).equals(o0o01.get(i3))) {
                    Log.OooO0Oo("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final o000O00O OooO00o(int i) {
        return (o000O00O) this.f39868OooO0o0.get(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000O0.class != obj.getClass()) {
            return false;
        }
        o000O0 o000o0 = (o000O0) obj;
        return this.f39866OooO0Oo == o000o0.f39866OooO0Oo && this.f39868OooO0o0.equals(o000o0.f39868OooO0o0);
    }

    public final int hashCode() {
        if (this.f39867OooO0o == 0) {
            this.f39867OooO0o = this.f39868OooO0o0.hashCode();
        }
        return this.f39867OooO0o;
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f39865OooO0oo, oOO00O.OooO0O0(this.f39868OooO0o0));
        return bundle;
    }
}
