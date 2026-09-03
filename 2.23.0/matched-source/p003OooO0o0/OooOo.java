package p003OooO0o0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.VideoRecordEvent;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.exoplayer2.drm.OooO0O0;
import com.yallatech.support.platform.base.BaseResp;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f118OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f119OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f120OooO0o0;

    public /* synthetic */ OooOo(int i, Object obj, Object obj2) {
        this.f118OooO0Oo = i;
        this.f120OooO0o0 = obj;
        this.f119OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f118OooO0Oo;
        Object obj = this.f119OooO0o;
        Object obj2 = this.f120OooO0o0;
        switch (i) {
            case 0:
                OooO this$0 = (OooO) obj2;
                BaseResp response = (BaseResp) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(response, "$response");
                this$0.OooO0OO(response);
                break;
            case 1:
                ((OooOO0O.OooOOO0) obj2).OooOOo0().accept((VideoRecordEvent) obj);
                break;
            case 2:
                Context context = (Context) obj;
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.OooO0O0.OooO00o(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Oooo000(context, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) obj2;
                ((OooO0O0) obj).Oooo0O0(oooO00o.f11769OooO00o, oooO00o.f11770OooO0O0);
                break;
        }
    }
}
