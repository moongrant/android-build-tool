package p669oO0Oo;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0Oo extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f60673OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<Integer> f60674OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(MixedRoomActivity mixedRoomActivity, State<Integer> state) {
        super(1);
        this.f60673OooO0Oo = mixedRoomActivity;
        this.f60674OooO0o0 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        Integer value;
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, o000O000.f60461OooO0O0, 7, null);
        MixedRoomActivity mixedRoomActivity = this.f60673OooO0Oo;
        LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1003043122, true, new o0O00o00(mixedRoomActivity)), 7, null);
        State<Integer> state = this.f60674OooO0o0;
        Integer value2 = state.getValue();
        if (value2 != null && value2.intValue() == 1) {
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-398792462, true, new o0O00oO0(mixedRoomActivity)), 7, null);
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-124108823, true, new o0O0O0O(mixedRoomActivity)), 7, null);
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1204886, true, new o0oO0O0o(mixedRoomActivity)), 7, null);
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(121699051, true, new o0O0oo0o(mixedRoomActivity)), 7, null);
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, o000O000.f60462OooO0OO, 7, null);
        }
        Integer value3 = state.getValue();
        if ((value3 != null && value3.intValue() == 1) || ((value = state.getValue()) != null && value.intValue() == 2)) {
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, o000O000.f60463OooO0Oo, 7, null);
        }
        return Unit.INSTANCE;
    }
}
