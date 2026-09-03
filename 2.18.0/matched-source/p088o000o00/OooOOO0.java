package p088o000o00;

import android.content.Context;
import com.yalla.yalla.ui.view.MomentDetailForwardView;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p003OooO0Oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f28622Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f28623OoooO00;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f28622Oooo = i;
        this.f28623OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28622Oooo) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new o0ooOOo((Context) this.f28623OoooO00, 1));
                break;
            default:
                MomentDetailForwardView.m485setForwardText$lambda2((MomentDetailForwardView) this.f28623OoooO00);
                break;
        }
    }
}
