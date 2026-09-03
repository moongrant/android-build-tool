package p022Oooo00O;

import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yy.yyeva.view.EvaAnimViewV3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f666OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f667OooO0o0;

    public /* synthetic */ o00Ooo(Object obj, int i) {
        this.f666OooO0Oo = i;
        this.f667OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f666OooO0Oo;
        Object obj = this.f667OooO0o0;
        switch (i) {
            case 0:
                ((o0Oo0oo) obj).OooOo0();
                break;
            case 1:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i2 = MomentDetailActivity.f26057Oooo0;
                this$0.OooOoo0().commentReplaceCid();
                break;
            default:
                EvaAnimViewV3.ui$lambda$8((Function0) obj);
                break;
        }
    }
}
