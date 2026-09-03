package p519o0o0O0OO;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MomentInputFacePanel.kt\ncom/yalla/yalla/ui/composable/moment/MomentInputFacePanelKt$MomentInputFacePanel$2$1\n*L\n1#1,496:1\n90#2,5:497\n*E\n"})
public final class o0O0oo0o implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1 f52395OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MutableState f52396OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ MutableState f52397OooO0OO;

    public o0O0oo0o(Function1 function1, MutableState mutableState, MutableState mutableState2) {
        this.f52395OooO00o = function1;
        this.f52396OooO0O0 = mutableState;
        this.f52397OooO0OO = mutableState2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        o0000O00.OooO0OO("AAQQA", "onDispose");
        this.f52396OooO0O0.setValue(null);
        MutableState mutableState = this.f52397OooO0OO;
        mutableState.setValue(null);
        Function1 function1 = this.f52395OooO00o;
        if (function1 != null) {
            function1.invoke(o0oO0O0o.OooO0OO(mutableState));
        }
    }
}
