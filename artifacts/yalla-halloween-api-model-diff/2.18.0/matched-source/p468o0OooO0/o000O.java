package p468o0OooO0;

import android.app.Activity;
import com.google.android.exoplayer2.Oooo0;
import com.yalla.yalla.ui.view.SendMomentLocationPowerView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p517o0o0O00.o00O00;
import p603o0oo00Oo.oO0Oo;
import p620o0oo0o0.o0O0O00;
import p620o0oo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f40540Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f40541OoooO00;

    public /* synthetic */ o000O(Object obj, int i) {
        this.f40540Oooo = i;
        this.f40541OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40540Oooo) {
            case 0:
                ((Oooo0) this.f40541OoooO00).OooO0OO();
                break;
            default:
                SendMomentLocationPowerView this$0 = (SendMomentLocationPowerView) this.f40541OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Objects.requireNonNull(this$0);
                o00O00.OooO0O0("onReLocation : isOpenLocation = " + this$0.f25196OoooOoo);
                this$0.f25197Ooooo00 = true;
                Activity activity = this$0.f25188OoooO0;
                if (activity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activity");
                    activity = null;
                }
                o0O0O00.OooO0OO(activity, oo0o0Oo.f48626OooO0Oo, null, new oO0Oo(this$0));
                break;
        }
    }
}
