package com.facebook.appevents;

import android.os.Bundle;
import com.yy.yyeva.view.EvaAnimViewV3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Oooo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10588OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10589OooO0o0;

    public /* synthetic */ Oooo000(Object obj, int i) {
        this.f10588OooO0Oo = i;
        this.f10589OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10588OooO0Oo;
        Object obj = this.f10589OooO0o0;
        switch (i) {
            case 0:
                UserDataStore.m4071setUserDataAndHash$lambda1((Bundle) obj);
                break;
            default:
                EvaAnimViewV3.onSurfaceTextureDestroyed$lambda$4((EvaAnimViewV3) obj);
                break;
        }
    }
}
