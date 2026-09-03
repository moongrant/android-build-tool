package com.yalla.yalla.module.media.camera;

import androidx.lifecycle.Observer;
import p468o0OoooO0.o0OO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f24272OooO0Oo;

    public OooO00o(CameraViewModel cameraViewModel) {
        this.f24272OooO0Oo = cameraViewModel;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        int i = CameraActivity.f24134OooOOo;
        o0OO0O0.OooO00o("_Camera", "select music back: " + zBooleanValue);
        if (zBooleanValue) {
            this.f24272OooO0Oo.OooO0o().f24263OooO00o.setValue(null);
        }
    }
}
