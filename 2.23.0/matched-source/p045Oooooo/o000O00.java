package p045Oooooo;

import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yy.yyeva.view.EvaAnimView;
import com.yy.yyeva.view.InnerSurfaceView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1964OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1965OooO0o0;

    public /* synthetic */ o000O00(Object obj, int i) {
        this.f1964OooO0Oo = i;
        this.f1965OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1964OooO0Oo;
        Object obj = this.f1965OooO0o0;
        switch (i) {
            case 0:
                ((o00Oo0) obj).OooO0OO();
                break;
            case 1:
                MomentDetailCommentFragment this$0 = (MomentDetailCommentFragment) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.smoothScrollToPositionCommentMessageIndex();
                break;
            default:
                EvaAnimView this$1 = (EvaAnimView) obj;
                int i2 = EvaAnimView.f32973OooOOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                InnerSurfaceView innerSurfaceView = this$1.f32974OooO;
                if (innerSurfaceView != null) {
                    innerSurfaceView.setLayoutParams(this$1.f32981OooOO0O.OooO0O0(innerSurfaceView));
                }
                break;
        }
    }
}
