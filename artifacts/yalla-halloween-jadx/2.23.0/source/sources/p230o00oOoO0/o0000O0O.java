package p230o00oOoO0;

import android.os.Bundle;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.text.Cue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.List;
import p245o00oo0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000O0O implements OooO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o0000O0O f40111OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f40112OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f40113OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImmutableList<Cue> f40114OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f40115OooO0o0;

    static {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        f40111OooO0o = new o0000O0O(0L, o0O00.f19536OooO0oo);
        f40112OooO0oO = p245o00oo0o.o0O00.Oooo00O(0);
        f40113OooO0oo = p245o00oo0o.o0O00.Oooo00O(1);
    }

    public o0000O0O(long j, List list) {
        this.f40114OooO0Oo = ImmutableList.OooOO0O(list);
        this.f40115OooO0o0 = j;
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        int i = 0;
        while (true) {
            ImmutableList<Cue> immutableList = this.f40114OooO0Oo;
            if (i >= immutableList.size()) {
                bundle.putParcelableArrayList(f40112OooO0oO, oOO00O.OooO0O0(oooO00o.OooO0oo()));
                bundle.putLong(f40113OooO0oo, this.f40115OooO0o0);
                return bundle;
            }
            if (immutableList.get(i).f13405OooO0oO == null) {
                oooO00o.OooO0OO(immutableList.get(i));
            }
            i++;
        }
    }
}
