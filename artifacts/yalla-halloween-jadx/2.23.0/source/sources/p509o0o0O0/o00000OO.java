package p509o0o0O0;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;
import p515o0o0O0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MomentDetailComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailCompKt$MomentDetailComp$1$1\n*L\n1#1,496:1\n85#2,2:497\n*E\n"})
public final class o00000OO implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f50462OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f50463OooO0O0;

    public o00000OO(o0Oo0oo o0oo0oo2, int i) {
        this.f50462OooO00o = o0oo0oo2;
        this.f50463OooO0O0 = i;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        o0Oo0oo o0oo0oo2 = this.f50462OooO00o;
        if (o0oo0oo2 != null) {
            o0oo0oo2.f51830OooO0O0.remove(Integer.valueOf(this.f50463OooO0O0));
        }
    }
}
