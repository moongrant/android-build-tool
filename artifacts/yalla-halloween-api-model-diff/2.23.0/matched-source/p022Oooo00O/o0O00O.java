package p022Oooo00O;

import androidx.camera.core.impl.DeferrableSurface;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f700OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f701OooO0o0;

    public /* synthetic */ o0O00O(Object obj, int i) {
        this.f700OooO0Oo = i;
        this.f701OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f700OooO0Oo;
        Object obj = this.f701OooO0o0;
        switch (i) {
            case 0:
                o0O00OO.f703OooOOO.remove((DeferrableSurface) obj);
                break;
            default:
                Task.Companion.m4116delay$lambda0((TaskCompletionSource) obj);
                break;
        }
    }
}
