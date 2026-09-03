package androidx.media3.session;

import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.codeless.ViewIndexingTrigger;
import com.facebook.internal.FetchedAppSettings;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O000 implements p080o000OoO.o0O0O00, ViewIndexingTrigger.OnShakeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9306OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9307OooO0o0;

    public /* synthetic */ o000O000(FetchedAppSettings fetchedAppSettings, String str) {
        this.f9306OooO0Oo = fetchedAppSettings;
        this.f9307OooO0o0 = str;
    }

    @Override // p080o000OoO.o0O0O00
    public final void accept(Object obj) {
        o000OO0O o000oo0o2 = (o000OO0O) this.f9306OooO0Oo;
        o000OO0O.OooO0OO oooO0OO = (o000OO0O.OooO0OO) this.f9307OooO0o0;
        o000oOoO.OooO00o oooO00o = (o000oOoO.OooO00o) obj;
        o000oo0o2.getClass();
        oooO0OO.getClass();
        oooO00o.OooO0OO();
        oooO00o.OooO0O0();
    }

    @Override // com.facebook.appevents.codeless.ViewIndexingTrigger.OnShakeListener
    public final void onShake() {
        CodelessManager.m4082onActivityResumed$lambda0((FetchedAppSettings) this.f9306OooO0Oo, (String) this.f9307OooO0o0);
    }
}
