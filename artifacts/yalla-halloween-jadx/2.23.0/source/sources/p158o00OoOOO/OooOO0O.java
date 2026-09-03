package p158o00OoOOO;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt$BaseDialog$1$1\n*L\n1#1,496:1\n46#2,2:497\n*E\n"})
public final class OooOO0O implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0 f38252OooO00o;

    public OooOO0O(Function0 function0) {
        this.f38252OooO00o = function0;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        Function0 function0 = this.f38252OooO00o;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
