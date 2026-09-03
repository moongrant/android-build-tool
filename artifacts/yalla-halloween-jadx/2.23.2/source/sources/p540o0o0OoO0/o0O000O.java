package p540o0o0OoO0;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.room.RoomMemberTaskHostInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOO;
import p107o000ooO0.OooOOOO;
import p581o0oOoo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000O extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<RoomMemberTaskHostInfoModel> f54727OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000oo f54728OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(OooOOOO<RoomMemberTaskHostInfoModel> oooOOOO, o0000oo o0000ooVar) {
        super(1);
        this.f54727OooO0Oo = oooOOOO;
        this.f54728OooO0o0 = o0000ooVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-228861459, true, new o0O00000(this.f54728OooO0o0)), 3, null);
        OooOOOO<RoomMemberTaskHostInfoModel> oooOOOO = this.f54727OooO0Oo;
        int iOooO0O0 = oooOOOO.OooO0O0();
        Intrinsics.checkNotNullParameter(oooOOOO, "<this>");
        LazyListScope.CC.OooOO0O(LazyColumn, iOooO0O0, new OooOOO(oooOOOO, o0O0000O.f54726OooO0Oo), null, ComposableLambdaKt.composableLambdaInstance(217249988, true, new o0O000(oooOOOO)), 4, null);
        LazyListScope.CC.OooO(LazyColumn, null, null, o0oOOo.f54891OooO00o, 3, null);
        return Unit.INSTANCE;
    }
}
