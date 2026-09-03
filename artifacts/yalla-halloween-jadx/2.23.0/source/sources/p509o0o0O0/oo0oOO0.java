package p509o0o0O0;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MomentInputFacePanel.kt\ncom/yalla/yalla/ui/composable/moment/MomentInputFacePanelKt$MomentInputFacePanel$2$1\n*L\n1#1,496:1\n90#2,5:497\n*E\n"})
public final class oo0oOO0 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1 f51371OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MutableState f51372OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ MutableState f51373OooO0OO;

    public oo0oOO0(Function1 function1, MutableState mutableState, MutableState mutableState2) {
        this.f51371OooO00o = function1;
        this.f51372OooO0O0 = mutableState;
        this.f51373OooO0OO = mutableState2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        OooOOO0.OooO0OO("AAQQA", "onDispose");
        this.f51372OooO0O0.setValue(null);
        MutableState mutableState = this.f51373OooO0OO;
        mutableState.setValue(null);
        Function1 function1 = this.f51371OooO00o;
        if (function1 != null) {
            function1.invoke(o00O0OOO.OooO0OO(mutableState));
        }
    }
}
