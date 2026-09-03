package p543o0o0Ooo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55473OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f55474OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(MomentUserListVM momentUserListVM, int i) {
        super(2);
        this.f55473OooO0Oo = momentUserListVM;
        this.f55474OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55474OooO0o0 | 1);
        o2.OooO00o(this.f55473OooO0Oo, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
