package p075o000OOo;

import androidx.lifecycle.ComputableLiveData;
import com.google.android.exoplayer2.source.dash.DashMediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34890OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34891OooO0o0;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f34890OooO0Oo = i;
        this.f34891OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34890OooO0Oo;
        Object obj = this.f34891OooO0o0;
        switch (i) {
            case 1:
                ComputableLiveData.refreshRunnable$lambda$0((ComputableLiveData) obj);
                break;
            default:
                int i2 = DashMediaSource.f13189Oooo;
                ((DashMediaSource) obj).OooOo0o(false);
                break;
        }
    }
}
