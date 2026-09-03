package p673oooOO0;

import com.google.firebase.perf.config.RemoteConfigManager;
import p617o0oo0oO0.o0O0ooO;
import p625o0ooO000.o000;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O implements o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0Oo f60968OooO00o;

    public o000000O(oo0o0Oo oo0o0oo) {
        this.f60968OooO00o = oo0o0oo;
    }

    @Override // p625o0ooO000.o000
    public final Object get() {
        this.f60968OooO00o.getClass();
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        o0O0ooO.OooO00o(remoteConfigManager);
        return remoteConfigManager;
    }
}
