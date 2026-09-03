package OooOOOO;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import androidx.media3.common.o00Ooo;
import com.yallatech.support.basecore.net.BizResponse;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AppStatus;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.OooOo;
import o000OOO.o000oOoO;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0Oo0oo;
import p023Oooo00o.oO0000O;
import p080o000OoO.o000OO00;
import p310o0O0oO0.o00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f182OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f183OooO0o0;

    public /* synthetic */ OooO00o(int i, Object obj, Object obj2) {
        this.f181OooO0Oo = i;
        this.f183OooO0o0 = obj;
        this.f182OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f181OooO0Oo) {
            case 0:
                OooO0O0 this$0 = (OooO0O0) this.f183OooO0o0;
                OooO0O0.OooO0o this_apply = (OooO0O0.OooO0o) this.f182OooO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this$0.getClass();
                Pair<String, String>[] pairArr = OooO0OO.OooOO0O.f109OooO00o;
                BizResponse bizResponseOooO00o = OooO0OO.OooOO0O.OooO00o(YCSDKOpenKit.getAppId$lib_release(), this_apply);
                boolean zIsSuccess = bizResponseOooO00o.isSuccess();
                o00Oo0 o00oo1 = this$0.f184OooO0O0;
                if (!zIsSuccess) {
                    o00oo1.OooO0Oo(o00oo1.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
                } else {
                    AppStatus appStatus = (AppStatus) bizResponseOooO00o.getData();
                    if (appStatus != null) {
                        int status = appStatus.getStatus();
                        if (status == 1) {
                            if (appStatus.getShareStatus() != 2) {
                                o0Oo0oo o0oo0oo2 = o00oo1.f130OooO0Oo;
                                if (o0oo0oo2 != null) {
                                    o0oo0oo2.f142OooO0O0 = appStatus;
                                }
                                o00oo1.OooO0oo();
                            } else {
                                o00oo1.OooO0Oo(o00oo1.OooO00o(-1006, bizResponseOooO00o.getMessage()));
                            }
                        } else if (status == 2) {
                            o00oo1.OooO0Oo(o00oo1.OooO00o(100010, bizResponseOooO00o.getMessage()));
                        } else {
                            o00oo1.OooO0Oo(o00oo1.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
                        }
                    } else {
                        o00oo1.OooO0Oo(o00oo1.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
                    }
                }
                break;
            case 1:
                oO0000O.OooO0OO oooO0OO = (oO0000O.OooO0OO) this.f183OooO0o0;
                oooO0OO.f922OooO00o.onConfigureFailed((CameraCaptureSession) this.f182OooO0o);
                break;
            case 2:
            default:
                o00O o00o2 = (o00O) this.f183OooO0o0;
                Context context = (Context) this.f182OooO0o;
                if (o00o2.f41784OooO00o == null && context != null) {
                    o00o2.f41784OooO00o = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                    break;
                }
                break;
            case 3:
                androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o = (androidx.media3.exoplayer.audio.OooO0O0.OooO00o) this.f183OooO0o0;
                OooOo oooOo = (OooOo) this.f182OooO0o;
                oooO00o.getClass();
                synchronized (oooOo) {
                }
                androidx.media3.exoplayer.audio.OooO0O0 oooO0O0 = oooO00o.f7535OooO0O0;
                int i = o000OO00.f34965OooO00o;
                oooO0O0.OooO0Oo(oooOo);
                break;
            case 4:
                o000oOoO.OooO00o oooO00o2 = (o000oOoO.OooO00o) this.f183OooO0o0;
                o00Ooo o00ooo2 = (o00Ooo) this.f182OooO0o;
                oooO00o2.getClass();
                int i2 = o000OO00.f34965OooO00o;
                oooO00o2.f34591OooO0O0.onVideoSizeChanged(o00ooo2);
                break;
        }
    }
}
