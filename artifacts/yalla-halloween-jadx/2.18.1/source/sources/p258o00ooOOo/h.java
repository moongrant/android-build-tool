package p258o00ooOOo;

import android.view.View;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f34642Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f34643Oooo0oO;

    public /* synthetic */ h(Object obj, int i) {
        this.f34642Oooo0o = i;
        this.f34643Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34642Oooo0o) {
            case 0:
                j this$0 = (j) this.f34643Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                f fVar = f.f34635OooO00o;
                long jOooO0O0 = f.OooO0O0(this$0.f34651OooOOO);
                Function1<? super Long, Unit> function1 = this$0.f34656OooOOo0;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(jOooO0O0));
                }
                this$0.OooO0Oo();
                break;
            default:
                MomentDetailGiftGiverView this$1 = (MomentDetailGiftGiverView) this.f34643Oooo0oO;
                int i = MomentDetailGiftGiverView.f24884OoooO0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function1<? super Integer, Unit> function2 = this$1.f24885Oooo;
                if (function2 != null) {
                    function2.invoke(0);
                }
                break;
        }
    }
}
