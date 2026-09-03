package p534o0o0OOoo;

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
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o00O extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<FriendRequestMessage> f53602OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f53603OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f53604OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53605OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00O(OooOOOO<FriendRequestMessage> oooOOOO, MutableState<Boolean> mutableState, MutableState<Long> mutableState2, FriendRequestMessageVM friendRequestMessageVM) {
        super(4);
        this.f53602OooO0Oo = oooOOOO;
        this.f53604OooO0o0 = mutableState;
        this.f53603OooO0o = mutableState2;
        this.f53605OooO0oO = friendRequestMessageVM;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449757992, iIntValue2, -1, "com.yalla.yalla.ui.screen.message.FriendRequestMessageScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FriendRequestMessageScreen.kt:121)");
            }
            FriendRequestMessage friendRequestMessageOooO00o = this.f53602OooO0Oo.OooO00o(iIntValue);
            if (friendRequestMessageOooO00o != null) {
                oOOoOOO0 ooooooo0 = new oOOoOOO0(friendRequestMessageOooO00o);
                oO00o000 oo00o000 = new oO00o000(friendRequestMessageOooO00o, this.f53604OooO0o0, this.f53603OooO0o);
                FriendRequestMessageVM friendRequestMessageVM = this.f53605OooO0oO;
                oOo000Oo.OooO0O0(friendRequestMessageOooO00o, ooooooo0, oo00o000, new oO00o00(friendRequestMessageVM, friendRequestMessageOooO00o), new oO0OOO00(friendRequestMessageVM, friendRequestMessageOooO00o), composer2, 8);
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
