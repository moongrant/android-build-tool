package p037OoooOo0;

import androidx.camera.core.impl.DeferrableSurface;
import com.facebook.appevents.codeless.CodelessManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1542OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1543OooO0o0;

    public /* synthetic */ o000OOo0(Object obj, int i) {
        this.f1542OooO0Oo = i;
        this.f1543OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1542OooO0Oo;
        Object obj = this.f1543OooO0o0;
        switch (i) {
            case 0:
                ((DeferrableSurface) obj).OooO0O0();
                break;
            default:
                CodelessManager.m4081checkCodelessSession$lambda1((String) obj);
                break;
        }
    }
}
