package p515o0o0O0O0;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.jvm.internal.SourceDebugExtension;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MomentGifPlayManager.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentGifPlayManager$initSlidingObserver$2\n*L\n1#1,496:1\n56#2,3:497\n*E\n"})
public final class o0OOO0o implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f51826OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f51827OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f51828OooO0OO;

    public o0OOO0o(o0Oo0oo o0oo0oo2, int i, MomentAdapterTag momentAdapterTag) {
        this.f51826OooO00o = o0oo0oo2;
        this.f51827OooO0O0 = i;
        this.f51828OooO0OO = momentAdapterTag;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        o0Oo0oo o0oo0oo2 = this.f51826OooO00o;
        int i = this.f51827OooO0O0;
        MomentAdapterTag momentAdapterTag = this.f51828OooO0OO;
        o0Oo0oo.OooO00o(o0oo0oo2, i, momentAdapterTag);
        OooOOO0.OooO0O0("onSlidingDown onDispose momentAdapterTag is " + momentAdapterTag + ",listSize is " + i);
    }
}
