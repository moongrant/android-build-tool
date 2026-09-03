package p045Oooooo;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.OooO00o;
import com.common.support.imagepicker.preview.component.video.widget.BaseVideoControlView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.EvaJniUtil;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p022Oooo00O.o000O00;
import p613o0oo0Oo.oO0O0O00;
import p613o0oo0Oo.oO0O0O0o;
import p617o0oo0o0.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1869OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1870OooO0o0;

    public /* synthetic */ o000000O(Object obj, int i) {
        this.f1869OooO0Oo = i;
        this.f1870OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1869OooO0Oo) {
            case 0:
                o0000Ooo o0000ooo = (o0000Ooo) this.f1870OooO0o0;
                o0000ooo.f1917OooOoo0 = true;
                if (o0000ooo.f1915OooOoOO) {
                    o0000ooo.f1895OooO0o0.stop();
                    o0000ooo.OooOO0();
                    return;
                }
                return;
            case 1:
                OooO00o oooO00o = (OooO00o) this.f1870OooO0o0;
                AnalyticsListener.OooO00o oooO00oOooo0O0 = oooO00o.Oooo0O0();
                oooO00o.Oooo0oo(oooO00oOooo0O0, 1028, new o000O00(oooO00oOooo0O0));
                oooO00o.f7346OooO.OooO0Oo();
                return;
            case 2:
                BaseVideoControlView.updateProgressRunnable$lambda$1$lambda$0((BaseVideoControlView) this.f1870OooO0o0);
                return;
            default:
                oO0O0O00 this$0 = (oO0O0O00) this.f1870OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Oooo0 oooo0 = this$0.f57068OooO0Oo.f57059OooOo;
                oooo0.getClass();
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("onDestroy", "msg");
                for (com.yy.yyeva.mix.OooO00o oooO00o2 : oooo0.f57110OooO0OO) {
                    synchronized (oooO00o2.f32425OooO0o) {
                        oooO00o2.f32427OooO0oO = true;
                        oooO00o2.f32425OooO0o.notifyAll();
                        Unit unit = Unit.INSTANCE;
                    }
                    EvaJniUtil.f32434OooO00o.mixRenderDestroy(oooO00o2.f32421OooO00o.f57042OooO0O0);
                }
                EvaJniUtil.f32434OooO00o.destroyRender(this$0.f57068OooO0Oo.f57042OooO0O0);
                this$0.f57068OooO0Oo.f57042OooO0O0 = -1;
                this$0.onVideoDestroy();
                if (this$0.f57068OooO0Oo.f57052OooOOO) {
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("destroyThread", "msg");
                    oO0O0O0o oo0o0o0o = this$0.f57070OooO0o0;
                    Handler handler = oo0o0o0o.f57091OooO0O0;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    oO0O0O0o oo0o0o0o2 = this$0.f57069OooO0o;
                    Handler handler2 = oo0o0o0o2.f57091OooO0O0;
                    if (handler2 != null) {
                        handler2.removeCallbacksAndMessages(null);
                    }
                    HandlerThread handlerThread = oo0o0o0o.f57090OooO00o;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    oo0o0o0o.f57090OooO00o = null;
                    HandlerThread handlerThread2 = oo0o0o0o2.f57090OooO00o;
                    if (handlerThread2 != null) {
                        handlerThread2.quitSafely();
                    }
                    oo0o0o0o2.f57090OooO00o = null;
                    oo0o0o0o.f57091OooO0O0 = null;
                    oo0o0o0o2.f57091OooO0O0 = null;
                    return;
                }
                return;
        }
    }
}
