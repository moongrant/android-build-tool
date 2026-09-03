package p003OooO0o0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO;
import android.app.Dialog;
import androidx.camera.core.impl.DeferrableSurface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f121OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f122OooO0o0;

    public /* synthetic */ Oooo000(Object obj, int i) {
        this.f121OooO0Oo = i;
        this.f122OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Dialog dialog;
        int i = this.f121OooO0Oo;
        Object obj = this.f122OooO0o0;
        switch (i) {
            case 0:
                OooO this$0 = (OooO) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isAdded() && (dialog = this$0.f44OooO0o) != null) {
                    dialog.dismiss();
                    break;
                }
                break;
            default:
                ((DeferrableSurface) obj).OooO00o();
                break;
        }
    }
}
