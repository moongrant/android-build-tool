package p003OooO0o0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO;
import android.app.Dialog;
import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import o000O0Oo.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f122OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f123OooO0o0;

    public /* synthetic */ Oooo000(Object obj, int i) {
        this.f122OooO0Oo = i;
        this.f123OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Dialog dialog;
        int i = this.f122OooO0Oo;
        Object obj = this.f123OooO0o0;
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
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new OooOO0((Context) obj, 0));
                break;
        }
    }
}
