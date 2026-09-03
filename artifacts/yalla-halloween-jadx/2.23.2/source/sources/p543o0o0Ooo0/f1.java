package p543o0o0Ooo0;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreen$Content$3\n*L\n1#1,496:1\n139#2,2:497\n*E\n"})
public final class f1 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f55407OooO00o;

    public f1(BaseMomentDetailVM baseMomentDetailVM) {
        this.f55407OooO00o = baseMomentDetailVM;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f55407OooO00o.statisticalTime();
    }
}
