package p045Oooooo;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.OooO00o;
import com.common.support.imagepicker.preview.component.video.widget.BaseVideoControlView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yy.yyeva.util.EvaJniUtil;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p022Oooo00O.o000O00;
import p613o0oo0Ooo.w5;
import p613o0oo0Ooo.x5;
import p618o0oo0o0o.o0oOo0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1866OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1867OooO0o0;

    public /* synthetic */ o000000O(Object obj, int i) {
        this.f1866OooO0Oo = i;
        this.f1867OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1866OooO0Oo) {
            case 0:
                o0000Ooo o0000ooo = (o0000Ooo) this.f1867OooO0o0;
                o0000ooo.f1914OooOoo0 = true;
                if (o0000ooo.f1912OooOoOO) {
                    o0000ooo.f1892OooO0o0.stop();
                    o0000ooo.OooOO0();
                    return;
                }
                return;
            case 1:
                OooO00o oooO00o = (OooO00o) this.f1867OooO0o0;
                AnalyticsListener.OooO00o oooO00oOooo0O0 = oooO00o.Oooo0O0();
                oooO00o.Oooo0oo(oooO00oOooo0O0, 1028, new o000O00(oooO00oOooo0O0));
                oooO00o.f7341OooO.OooO0Oo();
                return;
            case 2:
                BaseVideoControlView.updateProgressRunnable$lambda$1$lambda$0((BaseVideoControlView) this.f1867OooO0o0);
                return;
            case 3:
                TaskActivity this$0 = (TaskActivity) this.f1867OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i = TaskActivity.f25083OooOooO;
                this$0.OooOoO();
                return;
            default:
                w5 this$1 = (w5) this.f1867OooO0o0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o0oOo0O0 o0ooo0o1 = this$1.f57484OooO0Oo.f57478OooOo;
                o0ooo0o1.getClass();
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("onDestroy", "msg");
                for (com.yy.yyeva.mix.OooO00o oooO00o2 : o0ooo0o1.f57551OooO0OO) {
                    synchronized (oooO00o2.f32428OooO0o) {
                        oooO00o2.f32430OooO0oO = true;
                        oooO00o2.f32428OooO0o.notifyAll();
                        Unit unit = Unit.INSTANCE;
                    }
                    EvaJniUtil.f32437OooO00o.mixRenderDestroy(oooO00o2.f32424OooO00o.f57461OooO0O0);
                }
                EvaJniUtil.f32437OooO00o.destroyRender(this$1.f57484OooO0Oo.f57461OooO0O0);
                this$1.f57484OooO0Oo.f57461OooO0O0 = -1;
                this$1.onVideoDestroy();
                if (this$1.f57484OooO0Oo.f57471OooOOO) {
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("destroyThread", "msg");
                    x5 x5Var = this$1.f57486OooO0o0;
                    Handler handler = x5Var.f57510OooO0O0;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    x5 x5Var2 = this$1.f57485OooO0o;
                    Handler handler2 = x5Var2.f57510OooO0O0;
                    if (handler2 != null) {
                        handler2.removeCallbacksAndMessages(null);
                    }
                    HandlerThread handlerThread = x5Var.f57509OooO00o;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    x5Var.f57509OooO00o = null;
                    HandlerThread handlerThread2 = x5Var2.f57509OooO00o;
                    if (handlerThread2 != null) {
                        handlerThread2.quitSafely();
                    }
                    x5Var2.f57509OooO00o = null;
                    x5Var.f57510OooO0O0 = null;
                    x5Var2.f57510OooO0O0 = null;
                    return;
                }
                return;
        }
    }
}
