package p669oO0Oo;

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
import o000O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f60589OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LazyListState f60590OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<LiveRoomMemberUserRankModel.RankDataDTO> f60591OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f60592OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(boolean z, OooO0O0<LiveRoomMemberUserRankModel.RankDataDTO> oooO0O0, LazyListState lazyListState, MutableState<Boolean> mutableState) {
        super(3);
        this.f60589OooO0Oo = z;
        this.f60591OooO0o0 = oooO0O0;
        this.f60590OooO0o = lazyListState;
        this.f60592OooO0oO = mutableState;
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
                ComposerKt.traceEventStart(-1366356328, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog.onDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberUserRankDialog.kt:206)");
            }
            o0O00o0 o0o00o1 = o0O00o0.f60622OooO00o;
            boolean z = this.f60589OooO0Oo;
            OooO0O0<LiveRoomMemberUserRankModel.RankDataDTO> oooO0O0 = this.f60591OooO0o0;
            LazyListState lazyListState = this.f60590OooO0o;
            MutableState<Boolean> mutableState = this.f60592OooO0oO;
            int i = OooO0O0.f34327OooO0o0;
            o0o00o1.OooO0O0(z, oooO0O0, lazyListState, mutableState, composer2, 27712);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
