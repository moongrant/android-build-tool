package p022Oooo00O;

import android.hardware.camera2.CameraCharacteristics;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;
import p023Oooo00o.oO00O0o0;
import p025Oooo0OO.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements oo0o0Oo, OnSuccessListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f506OooO0Oo;

    public /* synthetic */ o000O00(Object obj) {
        this.f506OooO0Oo = obj;
    }

    @Override // p025Oooo0OO.oo0o0Oo
    public final Object OooO00o(CameraCharacteristics.Key key) {
        return ((oO00O0o0) this.f506OooO0Oo).OooO00o(key);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((RemoteConfigManager) this.f506OooO0Oo).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
