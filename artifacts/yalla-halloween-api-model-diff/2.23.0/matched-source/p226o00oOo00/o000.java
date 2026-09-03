package p226o00oOo00;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.source.Oooo0;
import com.yy.yyeva.mix.OooO00o;
import com.yy.yyeva.util.EvaJniUtil;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p608o0oo0Oo.o0000O00;
import p608o0oo0Oo.o0000oo;
import p612o0oo0o0.o0000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f39820OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39821OooO0o0;

    public /* synthetic */ o000(Object obj, int i) {
        this.f39820OooO0Oo = i;
        this.f39821OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39820OooO0Oo) {
            case 0:
                ((Oooo0) this.f39821OooO0o0).OooOoO0();
                return;
            default:
                o0000O00 this$0 = (o0000O00) this.f39821OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0000O o0000o2 = this$0.f56971OooO0Oo.f56961OooOo;
                o0000o2.getClass();
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("onDestroy", "msg");
                for (OooO00o oooO00o : o0000o2.f57010OooO0OO) {
                    synchronized (oooO00o.f32963OooO0o) {
                        oooO00o.f32965OooO0oO = true;
                        oooO00o.f32963OooO0o.notifyAll();
                        Unit unit = Unit.INSTANCE;
                    }
                    EvaJniUtil.f32972OooO00o.mixRenderDestroy(oooO00o.f32959OooO00o.f56944OooO0O0);
                }
                EvaJniUtil.f32972OooO00o.destroyRender(this$0.f56971OooO0Oo.f56944OooO0O0);
                this$0.f56971OooO0Oo.f56944OooO0O0 = -1;
                this$0.onVideoDestroy();
                if (this$0.f56971OooO0Oo.f56954OooOOO) {
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("destroyThread", "msg");
                    o0000oo o0000ooVar = this$0.f56973OooO0o0;
                    Handler handler = o0000ooVar.f56994OooO0O0;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    o0000oo o0000ooVar2 = this$0.f56972OooO0o;
                    Handler handler2 = o0000ooVar2.f56994OooO0O0;
                    if (handler2 != null) {
                        handler2.removeCallbacksAndMessages(null);
                    }
                    HandlerThread handlerThread = o0000ooVar.f56993OooO00o;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    o0000ooVar.f56993OooO00o = null;
                    HandlerThread handlerThread2 = o0000ooVar2.f56993OooO00o;
                    if (handlerThread2 != null) {
                        handlerThread2.quitSafely();
                    }
                    o0000ooVar2.f56993OooO00o = null;
                    o0000ooVar.f56994OooO0O0 = null;
                    o0000ooVar2.f56994OooO0O0 = null;
                    return;
                }
                return;
        }
    }
}
