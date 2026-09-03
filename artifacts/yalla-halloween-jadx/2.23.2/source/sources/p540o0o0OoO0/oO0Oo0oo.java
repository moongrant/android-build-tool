package p540o0o0OoO0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.LiveRoomMemberUserRankModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0oo extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f54990OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LazyListState f54991OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<LiveRoomMemberUserRankModel.RankDataDTO> f54992OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54993OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0oo(boolean z, OooOOOO<LiveRoomMemberUserRankModel.RankDataDTO> oooOOOO, LazyListState lazyListState, MutableState<Boolean> mutableState) {
        super(3);
        this.f54990OooO0Oo = z;
        this.f54992OooO0o0 = oooOOOO;
        this.f54991OooO0o = lazyListState;
        this.f54993OooO0oO = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        BoxScope RefreshContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366356328, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.onDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberUserRankDialog.kt:207)");
            }
            o oVar = o.f54639OooO00o;
            boolean z = this.f54990OooO0Oo;
            OooOOOO<LiveRoomMemberUserRankModel.RankDataDTO> oooOOOO = this.f54992OooO0o0;
            LazyListState lazyListState = this.f54991OooO0o;
            MutableState<Boolean> mutableState = this.f54993OooO0oO;
            int i = OooOOOO.f35803OooO0o0;
            oVar.OooO0O0(z, oooOOOO, lazyListState, mutableState, composer2, 27712);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
