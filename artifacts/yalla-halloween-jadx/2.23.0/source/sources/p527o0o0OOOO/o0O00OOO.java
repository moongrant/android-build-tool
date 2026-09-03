package p527o0o0OOOO;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OOO extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<FriendRequestMessage> f53641OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f53642OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f53643OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53644OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(OooO0O0<FriendRequestMessage> oooO0O0, MutableState<Boolean> mutableState, MutableState<Long> mutableState2, FriendRequestMessageVM friendRequestMessageVM) {
        super(4);
        this.f53641OooO0Oo = oooO0O0;
        this.f53643OooO0o0 = mutableState;
        this.f53642OooO0o = mutableState2;
        this.f53644OooO0oO = friendRequestMessageVM;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449757992, iIntValue2, -1, "com.yalla.yalla.ui.screen.message.FriendRequestMessageScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FriendRequestMessageScreen.kt:120)");
            }
            FriendRequestMessage friendRequestMessageOooO00o = this.f53641OooO0Oo.OooO00o(iIntValue);
            if (friendRequestMessageOooO00o != null) {
                o0OoO00O o0ooo00o2 = new o0OoO00O(friendRequestMessageOooO00o);
                o0O00O0o o0o00o0o = new o0O00O0o(friendRequestMessageOooO00o, this.f53643OooO0o0, this.f53642OooO0o);
                FriendRequestMessageVM friendRequestMessageVM = this.f53644OooO0oO;
                o0oO0O0o.OooO0O0(friendRequestMessageOooO00o, o0ooo00o2, o0o00o0o, new o0O00O(friendRequestMessageVM, friendRequestMessageOooO00o), new o0O00OO(friendRequestMessageVM, friendRequestMessageOooO00o), composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
