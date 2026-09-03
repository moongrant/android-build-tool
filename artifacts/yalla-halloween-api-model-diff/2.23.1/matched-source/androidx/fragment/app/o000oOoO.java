package androidx.fragment.app;

import android.view.View;
import com.facebook.internal.FacebookWebFallbackDialog;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6047OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f6048OooO0o0;

    public /* synthetic */ o000oOoO(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.f6047OooO0Oo = i;
        this.f6048OooO0o0 = onCreateContextMenuListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6047OooO0Oo;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f6048OooO0o0;
        switch (i) {
            case 0:
                ((Fragment) onCreateContextMenuListener).lambda$performCreateView$0();
                break;
            default:
                FacebookWebFallbackDialog.m4125cancel$lambda0((FacebookWebFallbackDialog) onCreateContextMenuListener);
                break;
        }
    }
}
