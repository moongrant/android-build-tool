package p539o0o0OoOO;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.view.OooO0O0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogPropertiesKt$BottomSheetDialog$1\n*L\n1#1,496:1\n302#2,3:497\n*E\n"})
public final class e0 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f55530OooO00o;

    public e0(OooO0O0 oooO0O0) {
        this.f55530OooO00o = oooO0O0;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        OooO0O0 oooO0O0 = this.f55530OooO00o;
        oooO0O0.dismiss();
        oooO0O0.f30523OooOo00.disposeComposition();
    }
}
