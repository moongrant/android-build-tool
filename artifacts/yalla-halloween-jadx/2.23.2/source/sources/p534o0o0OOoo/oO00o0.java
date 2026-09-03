package p534o0o0OOoo;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOO;
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o0 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<FriendRequestMessage> f53593OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f53594OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f53595OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53596OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o0(OooOOOO<FriendRequestMessage> oooOOOO, MutableState<Boolean> mutableState, MutableState<Long> mutableState2, FriendRequestMessageVM friendRequestMessageVM) {
        super(1);
        this.f53593OooO0Oo = oooOOOO;
        this.f53595OooO0o0 = mutableState;
        this.f53594OooO0o = mutableState2;
        this.f53596OooO0oO = friendRequestMessageVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooOOOO<FriendRequestMessage> oooOOOO = this.f53593OooO0Oo;
        int iOooO0O0 = oooOOOO.OooO0O0();
        Intrinsics.checkNotNullParameter(oooOOOO, "<this>");
        LazyListScope.CC.OooOO0O(LazyColumn, iOooO0O0, new OooOOO(oooOOOO, oO00Oo0.f53591OooO0Oo), null, ComposableLambdaKt.composableLambdaInstance(-449757992, true, new oO00o00O(oooOOOO, this.f53595OooO0o0, this.f53594OooO0o, this.f53596OooO0oO)), 4, null);
        return Unit.INSTANCE;
    }
}
