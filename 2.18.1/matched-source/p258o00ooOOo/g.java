package p258o00ooOOo;

import android.view.View;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f34640Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f34641Oooo0oO;

    public /* synthetic */ g(Object obj, int i) {
        this.f34640Oooo0o = i;
        this.f34641Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34640Oooo0o) {
            case 0:
                j this$0 = (j) this.f34641Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo();
                break;
            default:
                MomentDetailGiftGiverView this$1 = (MomentDetailGiftGiverView) this.f34641Oooo0oO;
                int i = MomentDetailGiftGiverView.f24884OoooO0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function0<Unit> function0 = this$1.f24890OoooO00;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
