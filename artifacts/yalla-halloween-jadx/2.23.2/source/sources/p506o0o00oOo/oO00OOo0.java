package p506o0o00oOo;

import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOo0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50461OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOo0(PremiumActivity premiumActivity) {
        super(1);
        this.f50461OooO0Oo = premiumActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        int i = PremiumActivity.f26673Oooo0oO;
        RecyclerView.Adapter adapter = this.f50461OooO0Oo.OooOooO().f43828OooOOO.getAdapter();
        if (adapter != null) {
            adapter.notifyItemRemoved(iIntValue);
        }
        return Unit.INSTANCE;
    }
}
