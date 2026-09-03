package p540o0o0OoO0;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OO0O extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f54946OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<Integer> f54947OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(MixedRoomActivity mixedRoomActivity, State<Integer> state) {
        super(1);
        this.f54946OooO0Oo = mixedRoomActivity;
        this.f54947OooO0o0 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        Integer value;
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, o0O000o0.f54732OooO0O0, 7, null);
        MixedRoomActivity mixedRoomActivity = this.f54946OooO0Oo;
        LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1003043122, true, new oO0O0OoO(mixedRoomActivity)), 7, null);
        State<Integer> state = this.f54947OooO0o0;
        Integer value2 = state.getValue();
        if (value2 != null && value2.intValue() == 1) {
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-398792462, true, new oO00O0o0(mixedRoomActivity)), 7, null);
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-124108823, true, new oO00O0o(mixedRoomActivity)), 7, null);
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1204886, true, new oOo00OO0(mixedRoomActivity)), 7, null);
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, ComposableLambdaKt.composableLambdaInstance(121699051, true, new oO00O0oO(mixedRoomActivity)), 7, null);
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, o0O000o0.f54733OooO0OO, 7, null);
        }
        Integer value3 = state.getValue();
        if ((value3 != null && value3.intValue() == 1) || ((value = state.getValue()) != null && value.intValue() == 2)) {
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, null, null, o0O000o0.f54734OooO0Oo, 7, null);
        }
        return Unit.INSTANCE;
    }
}
