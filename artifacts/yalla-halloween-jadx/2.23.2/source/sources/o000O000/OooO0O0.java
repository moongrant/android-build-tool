package o000O000;

import android.os.Bundle;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.List;
import p080o000OoO.o00;
import p080o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @UnstableApi
    public static final io.opentelemetry.api.common.OooO0o f33948OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @UnstableApi
    public static final OooO0O0 f33949OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f33950OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f33951OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImmutableList<Cue> f33952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @UnstableApi
    public final long f33953OooO0o0;

    static {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        f33949OooO0o = new OooO0O0(0L, o0O00.f19060OooO0oo);
        f33950OooO0oO = o00.Oooo00o(0);
        f33951OooO0oo = o00.Oooo00o(1);
        f33948OooO = new io.opentelemetry.api.common.OooO0o();
    }

    @UnstableApi
    public OooO0O0(long j, List list) {
        this.f33952OooO0Oo = ImmutableList.OooOO0O(list);
        this.f33953OooO0o0 = j;
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        int i = 0;
        while (true) {
            ImmutableList<Cue> immutableList = this.f33952OooO0Oo;
            if (i >= immutableList.size()) {
                bundle.putParcelableArrayList(f33950OooO0oO, o00oO0o.OooO0O0(oooO00o.OooO0oo()));
                bundle.putLong(f33951OooO0oo, this.f33953OooO0o0);
                return bundle;
            }
            if (immutableList.get(i).f6901OooO0oO == null) {
                oooO00o.OooO0OO(immutableList.get(i));
            }
            i++;
        }
    }
}
