package p485o0o00O0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47802OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f47803OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(MomentDetailActivity momentDetailActivity, int i) {
        super(2);
        this.f47802OooO0Oo = momentDetailActivity;
        this.f47803OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f47803OooO0o0 | 1);
        MomentDetailActivity.OooOoO0(this.f47802OooO0Oo, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
