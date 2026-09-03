package p669oO0Oo;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.room.RoomMemberTaskHostInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO00o;
import o000O0.OooO0O0;
import p577o0oOoOoO.oOO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomMemberTaskHostInfoModel> f60443OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO000 f60444OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(OooO0O0<RoomMemberTaskHostInfoModel> oooO0O0, oOO000 ooo000) {
        super(1);
        this.f60443OooO0Oo = oooO0O0;
        this.f60444OooO0o0 = ooo000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-228861459, true, new o0000O0(this.f60444OooO0o0)), 3, null);
        OooO0O0<RoomMemberTaskHostInfoModel> oooO0O0 = this.f60443OooO0Oo;
        int iOooO0O0 = oooO0O0.OooO0O0();
        o0000O0O o0000o0o2 = o0000O0O.f60446OooO0Oo;
        Intrinsics.checkNotNullParameter(oooO0O0, "<this>");
        LazyListScope.CC.OooOO0O(LazyColumn, iOooO0O0, new OooO00o(oooO0O0, o0000o0o2), null, ComposableLambdaKt.composableLambdaInstance(217249988, true, new o000OO(oooO0O0)), 4, null);
        LazyListScope.CC.OooO(LazyColumn, null, null, o0000.f60428OooO00o, 3, null);
        return Unit.INSTANCE;
    }
}
