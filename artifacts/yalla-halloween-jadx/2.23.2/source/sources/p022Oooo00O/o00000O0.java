package p022Oooo00O;

import android.os.SystemClock;
import androidx.camera.core.OooOOO0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.zego.zegoavkit2.ZegoConstants;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p029Oooo0oo.o0OOOO00;
import p612o0oo0OoO.o5;
import p612o0oo0OoO.p5;
import p612o0oo0OoO.r5;
import p613o0oo0Ooo.w5;
import p615o0oo0o0.o000oOoO;
import p616o0oo0o00.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f482OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f483OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f484OooO0o0;

    public /* synthetic */ o00000O0(int i, Object obj, Object obj2) {
        this.f482OooO0Oo = i;
        this.f484OooO0o0 = obj;
        this.f483OooO0o = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
    
        if (r9 != false) goto L46;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int iOooO00o;
        String str;
        int i = this.f482OooO0Oo;
        Object obj = this.f483OooO0o;
        Object obj2 = this.f484OooO0o0;
        switch (i) {
            case 0:
                o000OO o000oo2 = (o000OO) obj2;
                String str2 = (String) obj;
                o000oo2.getClass();
                o000oo2.OooOo00("Use case " + str2 + " INACTIVE", null);
                o000oo2.f549OooO0Oo.OooO0o0(str2);
                o000oo2.Oooo0o0();
                break;
            case 1:
                Objects.requireNonNull(((o0OOOO00) obj2).OooO0Oo());
                Objects.requireNonNull((OooOOO0) obj);
                break;
            default:
                r5 this$0 = (r5) obj2;
                Oooo0 evaFileContainer = (Oooo0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(evaFileContainer, "$evaFileContainer");
                p5 p5Var = this$0.f57482OooOo0o;
                p5Var.f57455OooO0OO = this$0.f57464OooO0o;
                boolean z = this$0.f57470OooOO0o;
                int i2 = this$0.f57467OooO0oo;
                Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
                boolean z2 = false;
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean zOooO0OO = p5Var.OooO0OO(evaFileContainer, i2);
                    String msg = "parseConfig cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms enableVersion1=" + z + " result=" + zOooO0OO;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.EvaAnimConfigManager", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    if (zOooO0OO) {
                        o5 o5Var = p5Var.f57454OooO0O0;
                        iOooO00o = o5Var != null ? p5Var.f57453OooO00o.f57478OooOo.OooO00o(o5Var) : 0;
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
                    p5 p5Var2 = this$0.f57482OooOo0o;
                    sb.append(p5Var2.f57454OooO0O0);
                    String msg3 = sb.toString();
                    Intrinsics.checkNotNullParameter("AnimPlayer", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg3, "msg");
                    o5 o5Var2 = p5Var2.f57454OooO0O0;
                    if (o5Var2 != null) {
                        if (!o5Var2.f57425OooO0o) {
                            o000oOoO o000oooo2 = this$0.f57462OooO0OO;
                            if (o000oooo2 != null && o000oooo2.onVideoConfigReady(o5Var2)) {
                                z2 = true;
                            }
                        }
                        this$0.OooO00o(evaFileContainer);
                    }
                    Intrinsics.checkNotNullParameter("AnimPlayer", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("onVideoConfigReady return false", "msg");
                } else {
                    this$0.f57476OooOOo0 = false;
                    w5 w5Var = this$0.f57463OooO0Oo;
                    if (w5Var != null) {
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
                        w5Var.onFailed(iOooO00o, str.concat(ZegoConstants.ZegoVideoDataAuxPublishingStream));
                    }
                    w5 w5Var2 = this$0.f57463OooO0Oo;
                    if (w5Var2 != null) {
                        w5Var2.onVideoComplete();
                    }
                }
                break;
        }
    }
}
