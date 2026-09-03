package androidx.compose.ui.platform;

import androidx.core.widget.ContentLoadingProgressBar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f4182OooO0o0;

    public /* synthetic */ OooOo00(Object obj, int i) {
        this.f4181OooO0Oo = i;
        this.f4182OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4181OooO0Oo;
        Object obj = this.f4182OooO0o0;
        switch (i) {
            case 0:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$45((AndroidComposeViewAccessibilityDelegateCompat) obj);
                break;
            default:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) obj;
                int i2 = ContentLoadingProgressBar.f5463OooO0o;
                contentLoadingProgressBar.getClass();
                System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
                break;
        }
    }
}
