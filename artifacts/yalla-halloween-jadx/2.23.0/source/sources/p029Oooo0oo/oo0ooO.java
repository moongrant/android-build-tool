package p029Oooo0oo;

import com.facebook.appevents.AppEventsManager;
import com.facebook.internal.FeatureManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0ooO implements FeatureManager.Callback {
    public static String OooO00o(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        return sb.toString();
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m4067onSuccess$lambda3(z);
    }
}
