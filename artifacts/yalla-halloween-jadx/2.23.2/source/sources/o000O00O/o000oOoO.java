package o000O00O;

import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.appevents.AppEventsManager;
import com.facebook.internal.FeatureManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements androidx.media3.common.OooO0OO.OooO00o, FeatureManager.Callback {
    @Override // androidx.media3.common.OooO0OO.OooO00o
    public final androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m4068onSuccess$lambda2(z);
    }
}
