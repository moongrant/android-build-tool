package p650o0ooo;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.user.BindMoreAccountModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o0o extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<BindMoreAccountModel.Reward> f59034OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00o0o(List<BindMoreAccountModel.Reward> list) {
        super(1);
        this.f59034OooO0Oo = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyRow = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<BindMoreAccountModel.Reward> list = this.f59034OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyRow, list.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-1445810937, true, new oO00o0(list)), 6, null);
        return Unit.INSTANCE;
    }
}
