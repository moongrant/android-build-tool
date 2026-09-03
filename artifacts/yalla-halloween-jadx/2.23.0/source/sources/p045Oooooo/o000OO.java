package p045Oooooo;

import android.os.SystemClock;
import androidx.camera.video.internal.BufferProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.util.concurrent.OooO00o;
import com.zego.zegoavkit2.ZegoConstants;
import io.agora.rtc.internal.RtcEngineEvent;
import kotlin.jvm.internal.Intrinsics;
import p029Oooo0oo.o0o0000;
import p029Oooo0oo.oO0Oo;
import p030OoooO.OooOo00;
import p033OoooO0O.o00oO0o;
import p607o0oo0OOo.k1;
import p607o0oo0OOo.l1;
import p607o0oo0OOo.m1;
import p608o0oo0Oo.o0000O00;
import p609o0oo0OoO.p1;
import p610o0oo0Ooo.q1;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1974OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1975OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1976OooO0o0;

    public /* synthetic */ o000OO(int i, Object obj, Object obj2) {
        this.f1974OooO0Oo = i;
        this.f1976OooO0o0 = obj;
        this.f1975OooO0o = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x014d, code lost:
    
        if (r2 != 0) goto L51;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int iOooO00o;
        String str;
        int i = this.f1974OooO0Oo;
        int i2 = 1;
        Object obj = this.f1975OooO0o;
        Object obj2 = this.f1976OooO0o0;
        switch (i) {
            case 0:
                o0000Ooo.OooO0OO oooO0OO = (o0000Ooo.OooO0OO) obj2;
                o00O000.OooO00o oooO00o = (o00O000.OooO00o) obj;
                BufferProvider.State state = oooO0OO.f1941OooO0O0;
                if (state == BufferProvider.State.ACTIVE) {
                    o0000Ooo o0000ooo = o0000Ooo.this;
                    OooO00o<o000OO0O> OooO00o2 = o0000ooo.OooO00o();
                    OooOo00.OooO0o(true, OooO00o2, oooO00o, o00oO0o.OooO00o());
                    oooO00o.OooO00o(new o0o0000(i2, oooO0OO, OooO00o2), o00oO0o.OooO00o());
                    oooO0OO.f1942OooO0OO.add(OooO00o2);
                    OooO00o2.OooO(new oO0Oo(i2, oooO0OO, OooO00o2), o0000ooo.f1905OooO0oo);
                } else if (state != BufferProvider.State.INACTIVE) {
                    oooO00o.OooO0OO(new IllegalStateException("Unknown state: " + oooO0OO.f1941OooO0O0));
                } else {
                    oooO00o.OooO0OO(new IllegalStateException("BufferProvider is not active."));
                }
                break;
            default:
                m1 this$0 = (m1) obj2;
                p1 evaFileContainer = (p1) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(evaFileContainer, "$evaFileContainer");
                l1 l1Var = this$0.f56965OooOo0o;
                l1Var.f56940OooO0OO = this$0.f56947OooO0o;
                boolean z = this$0.f56953OooOO0o;
                int i3 = this$0.f56950OooO0oo;
                Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean zOooO0OO = l1Var.OooO0OO(evaFileContainer, i3);
                    String msg = "parseConfig cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms enableVersion1=" + z + " result=" + zOooO0OO;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.EvaAnimConfigManager", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    if (zOooO0OO) {
                        k1 k1Var = l1Var.f56939OooO0O0;
                        iOooO00o = k1Var != null ? l1Var.f56938OooO00o.f56961OooOo.OooO00o(k1Var) : 0;
                    } else {
                        iOooO00o = 10005;
                    }
                } catch (Throwable tr) {
                    String msg2 = "parseConfig error " + tr;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.EvaAnimConfigManager", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg2, "msg");
                    Intrinsics.checkNotNullParameter(tr, "tr");
                }
                if (iOooO00o == 0) {
                    StringBuilder sb = new StringBuilder("parse ");
                    l1 l1Var2 = this$0.f56965OooOo0o;
                    sb.append(l1Var2.f56939OooO0O0);
                    String msg3 = sb.toString();
                    Intrinsics.checkNotNullParameter("AnimPlayer", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg3, "msg");
                    k1 k1Var2 = l1Var2.f56939OooO0O0;
                    if (k1Var2 != null) {
                        if (!k1Var2.f56910OooO0o) {
                            q1 q1Var = this$0.f56945OooO0OO;
                        }
                        this$0.OooO00o(evaFileContainer);
                    }
                    Intrinsics.checkNotNullParameter("AnimPlayer", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("onVideoConfigReady return false", "msg");
                } else {
                    this$0.f56959OooOOo0 = false;
                    o0000O00 o0000o00 = this$0.f56946OooO0Oo;
                    if (o0000o00 != null) {
                        switch (iOooO00o) {
                            case RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS /* 10001 */:
                                str = "0x1 MediaExtractor exception";
                                break;
                            case 10002:
                                str = "0x2 MediaCodec exception";
                                break;
                            case 10003:
                                str = "0x3 thread create fail";
                                break;
                            case 10004:
                                str = "0x4 render create fail";
                                break;
                            case 10005:
                                str = "0x5 parse config fail";
                                break;
                            case 10006:
                                str = "0x6 yyeva fail";
                                break;
                            default:
                                str = "unknown";
                                break;
                        }
                        o0000o00.onFailed(iOooO00o, str.concat(ZegoConstants.ZegoVideoDataAuxPublishingStream));
                    }
                    o0000O00 o0000o01 = this$0.f56946OooO0Oo;
                    if (o0000o01 != null) {
                        o0000o01.onVideoComplete();
                    }
                }
                break;
        }
    }
}
