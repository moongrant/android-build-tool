package p161o00OoOo0;

import android.view.View;
import com.code.android.yldialog.timechoose.OooO0OO;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000000O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f38503OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f38504OooO0o0;

    public /* synthetic */ o000000O(Object obj, int i) {
        this.f38503OooO0Oo = i;
        this.f38504OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f38503OooO0Oo;
        Object obj = this.f38504OooO0o0;
        switch (i) {
            case 0:
                OooO0OO this$0 = (OooO0OO) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Lazy lazy = o000OOo.f38508OooO00o;
                long jOooO0O0 = o000OOo.OooO0O0(this$0.f10485OooOOO);
                Function1<? super Long, Unit> function1 = this$0.f10490OooOOo0;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(jOooO0O0));
                }
                this$0.OooO0OO();
                break;
            default:
                VideoControlView videoControlView = (VideoControlView) obj;
                if (((VideoView) videoControlView.f22388OooO0Oo).OooO0OO()) {
                    ((VideoView) videoControlView.f22388OooO0Oo).OooO0o0();
                } else {
                    ((VideoView) videoControlView.f22388OooO0Oo).OooO0oO();
                }
                videoControlView.OooO0O0();
                break;
        }
    }
}
