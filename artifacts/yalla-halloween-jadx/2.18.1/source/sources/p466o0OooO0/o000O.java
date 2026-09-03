package p466o0OooO0;

import android.app.Activity;
import com.google.android.exoplayer2.Oooo0;
import com.yalla.yalla.ui.view.SendMomentLocationPowerView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p515o0o0O00.o00O00;
import p601o0oo00Oo.oO0Oo;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f40521Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f40522Oooo0oO;

    public /* synthetic */ o000O(Object obj, int i) {
        this.f40521Oooo0o = i;
        this.f40522Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40521Oooo0o) {
            case 0:
                ((Oooo0) this.f40522Oooo0oO).OooO0OO();
                break;
            default:
                SendMomentLocationPowerView this$0 = (SendMomentLocationPowerView) this.f40522Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Objects.requireNonNull(this$0);
                o00O00.OooO0O0("onReLocation : isOpenLocation = " + this$0.f25177OoooOOo);
                this$0.f25178OoooOo0 = true;
                Activity activity = this$0.f25170Oooo0oo;
                if (activity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activity");
                    activity = null;
                }
                o0O0O00.OooO0OO(activity, oo0o0Oo.f48609OooO0Oo, null, new oO0Oo(this$0));
                break;
        }
    }
}
