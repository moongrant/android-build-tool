package androidx.camera.core.impl;

import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0o0Oo implements FeatureManager.Callback {
    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        FacebookSdk.m4043sdkInitialize$lambda5(z);
    }
}
