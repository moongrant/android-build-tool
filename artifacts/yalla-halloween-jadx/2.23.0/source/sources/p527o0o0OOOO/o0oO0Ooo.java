package p527o0o0OOOO;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO00o;
import o000O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<FriendRequestMessage> f53660OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f53661OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f53662OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53663OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(OooO0O0<FriendRequestMessage> oooO0O0, MutableState<Boolean> mutableState, MutableState<Long> mutableState2, FriendRequestMessageVM friendRequestMessageVM) {
        super(1);
        this.f53660OooO0Oo = oooO0O0;
        this.f53662OooO0o0 = mutableState;
        this.f53661OooO0o = mutableState2;
        this.f53663OooO0oO = friendRequestMessageVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooO0O0<FriendRequestMessage> oooO0O0 = this.f53660OooO0Oo;
        int iOooO0O0 = oooO0O0.OooO0O0();
        o0O00 o0o01 = o0O00.f53625OooO0Oo;
        Intrinsics.checkNotNullParameter(oooO0O0, "<this>");
        LazyListScope.CC.OooOO0O(LazyColumn, iOooO0O0, new OooO00o(oooO0O0, o0o01), null, ComposableLambdaKt.composableLambdaInstance(-449757992, true, new o0O00OOO(oooO0O0, this.f53662OooO0o0, this.f53661OooO0o, this.f53663OooO0oO)), 4, null);
        return Unit.INSTANCE;
    }
}
