package p528o0o0OOOo;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.PostUserModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;
import p148o00Oo0o.oo0o0Oo;
import p153o00OoO0.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0oo extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<PostUserModel> f54047OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0oo(OooO0O0<PostUserModel> oooO0O0) {
        super(1);
        this.f54047OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.CC.OooO(LazyColumn, null, null, o0O0OO0.f53716OooO0O0, 3, null);
        OooO0O0<PostUserModel> oooO0O0 = this.f54047OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooO0O0.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(477289982, true, new oO0OoOO0(oooO0O0)), 6, null);
        OooOo00.OooO00o(LazyColumn, oooO0O0, o0000.OooO0OO(oo0o0Oo.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
