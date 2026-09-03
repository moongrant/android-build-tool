package p521o0o0O0o0;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.jvm.internal.SourceDebugExtension;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MomentGifPlayManager.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentGifPlayManager$initSlidingObserver$2\n*L\n1#1,496:1\n56#2,3:497\n*E\n"})
public final class o0000O0O implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000OO f52940OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f52941OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f52942OooO0OO;

    public o0000O0O(o000OO o000oo2, int i, MomentAdapterTag momentAdapterTag) {
        this.f52940OooO00o = o000oo2;
        this.f52941OooO0O0 = i;
        this.f52942OooO0OO = momentAdapterTag;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        o000OO o000oo2 = this.f52940OooO00o;
        int i = this.f52941OooO0O0;
        MomentAdapterTag momentAdapterTag = this.f52942OooO0OO;
        o000OO.OooO00o(o000oo2, i, momentAdapterTag);
        o0000O00.OooO0O0("onSlidingDown onDispose momentAdapterTag is " + momentAdapterTag + ",listSize is " + i);
    }
}
