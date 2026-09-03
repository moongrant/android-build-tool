package p010OooOOoo;

import androidx.activity.OooO00o;
import androidx.compose.runtime.DisposableEffectResult;
import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n1#1,483:1\n106#2,2:484\n*E\n"})
public final class Oooo000 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOo.OooO0o f214OooO00o;

    public Oooo000(OooOo.OooO0o oooO0o) {
        this.f214OooO00o = oooO0o;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        Iterator<OooO00o> it = this.f214OooO00o.f2192OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
