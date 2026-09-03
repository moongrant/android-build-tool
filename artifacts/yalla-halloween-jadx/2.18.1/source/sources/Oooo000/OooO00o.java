package Oooo000;

import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements FeatureManager.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooO00o f796OooO0Oo = new OooO00o();

    public static float OooO00o(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        FacebookSdk.m96sdkInitialize$lambda5(z);
    }
}
