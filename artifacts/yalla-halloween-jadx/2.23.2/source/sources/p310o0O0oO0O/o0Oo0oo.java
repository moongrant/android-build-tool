package p310o0O0oO0O;

import com.google.firebase.perf.config.RemoteConfigManager;
import p621o0oo0oOo.z5;
import p629o0ooO00O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo implements o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Ooo f41819OooO00o;

    public o0Oo0oo(o00Ooo o00ooo2) {
        this.f41819OooO00o = o00ooo2;
    }

    @Override // p629o0ooO00O.o00000O0
    public final Object get() {
        this.f41819OooO00o.getClass();
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        z5.OooO00o(remoteConfigManager);
        return remoteConfigManager;
    }
}
