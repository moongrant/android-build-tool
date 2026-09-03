package p566o0oOo00O;

import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45182Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(PremiumActivity premiumActivity) {
        super(1);
        this.f45182Oooo0o = premiumActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        PremiumActivity premiumActivity = this.f45182Oooo0o;
        PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
        RecyclerView.Adapter adapter = premiumActivity.Oooo00o().f51120OooOOO.getAdapter();
        if (adapter != null) {
            adapter.notifyItemRemoved(iIntValue);
        }
        return Unit.INSTANCE;
    }
}
