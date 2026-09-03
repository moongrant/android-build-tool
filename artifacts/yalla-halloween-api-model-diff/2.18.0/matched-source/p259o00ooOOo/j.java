package p259o00ooOOo;

import android.view.View;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f34662Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f34663OoooO00;

    public /* synthetic */ j(Object obj, int i) {
        this.f34662Oooo = i;
        this.f34663OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34662Oooo) {
            case 0:
                m this$0 = (m) this.f34663OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo();
                break;
            default:
                MomentDetailGiftGiverView this$1 = (MomentDetailGiftGiverView) this.f34663OoooO00;
                int i = MomentDetailGiftGiverView.f24903o000oOoO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function0<Unit> function0 = this$1.f24905OoooO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
