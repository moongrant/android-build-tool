package androidx.compose.ui.platform;

import com.facebook.appevents.AnalyticsUserIDStore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4188OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f4189OooO0o0;

    public /* synthetic */ OooOo00(Object obj, int i) {
        this.f4188OooO0Oo = i;
        this.f4189OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4188OooO0Oo;
        Object obj = this.f4189OooO0o0;
        switch (i) {
            case 0:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$44((AndroidComposeViewAccessibilityDelegateCompat) obj);
                break;
            default:
                AnalyticsUserIDStore.m4057setUserID$lambda1((String) obj);
                break;
        }
    }
}
