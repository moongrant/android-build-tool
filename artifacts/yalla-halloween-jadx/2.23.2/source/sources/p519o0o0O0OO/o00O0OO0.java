package p519o0o0O0OO;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;
import p521o0o0O0o0.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MomentDetailComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailCompKt$MomentDetailComp$1$1\n*L\n1#1,496:1\n85#2,2:497\n*E\n"})
public final class o00O0OO0 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000OO f52094OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f52095OooO0O0;

    public o00O0OO0(o000OO o000oo2, int i) {
        this.f52094OooO00o = o000oo2;
        this.f52095OooO0O0 = i;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        o000OO o000oo2 = this.f52094OooO00o;
        if (o000oo2 != null) {
            o000oo2.f52952OooO0O0.remove(Integer.valueOf(this.f52095OooO0O0));
        }
    }
}
