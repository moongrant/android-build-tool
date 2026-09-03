package p069o0000ooO;

import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.FeatureManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OOo implements FeatureManager.Callback {
    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        ActivityLifecycleTracker.m4094startTracking$lambda0(z);
    }
}
