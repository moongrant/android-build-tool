package p543o0o0Ooo0;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class j2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55452OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LazyListState f55453OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f55454OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f55455OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(MomentUserListVM momentUserListVM, String str, LazyListState lazyListState, int i) {
        super(2);
        this.f55452OooO0Oo = momentUserListVM;
        this.f55454OooO0o0 = str;
        this.f55453OooO0o = lazyListState;
        this.f55455OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55455OooO0oO | 1);
        String str = this.f55454OooO0o0;
        LazyListState lazyListState = this.f55453OooO0o;
        o2.OooO0Oo(this.f55452OooO0Oo, str, lazyListState, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
