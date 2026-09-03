package p259o00ooOOo;

import android.view.View;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f34664Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f34665OoooO00;

    public /* synthetic */ k(Object obj, int i) {
        this.f34664Oooo = i;
        this.f34665OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34664Oooo) {
            case 0:
                m this$0 = (m) this.f34665OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                i iVar = i.f34657OooO00o;
                long jOooO0O0 = i.OooO0O0(this$0.f34673OooOOO);
                Function1<? super Long, Unit> function1 = this$0.f34678OooOOo0;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(jOooO0O0));
                }
                this$0.OooO0Oo();
                break;
            default:
                MomentDetailGiftGiverView this$1 = (MomentDetailGiftGiverView) this.f34665OoooO00;
                int i = MomentDetailGiftGiverView.f24903o000oOoO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function1<? super Integer, Unit> function2 = this$1.f24908OoooO0O;
                if (function2 != null) {
                    function2.invoke(0);
                }
                break;
        }
    }
}
