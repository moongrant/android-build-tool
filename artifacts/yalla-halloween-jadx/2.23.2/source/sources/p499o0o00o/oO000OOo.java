package p499o0o00o;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o000O;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomTurntableGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTurntableGameManager$Content$4$1\n*L\n1#1,496:1\n112#2,2:497\n*E\n"})
public final class oO000OOo implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState f50027OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MutableState f50028OooO0O0;

    public oO000OOo(MutableState mutableState, MutableState mutableState2) {
        this.f50027OooO00o = mutableState;
        this.f50028OooO0O0 = mutableState2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f50028OooO0O0.setValue("");
        OooO00o.f24520OooOO0O.f48510OooO00o.setValue(Boolean.FALSE);
        MutableState mutableState = this.f50027OooO00o;
        BaseWebView baseWebView = (BaseWebView) mutableState.getValue();
        if (baseWebView != null) {
            baseWebView.OooO0Oo();
        }
        BaseWebView baseWebView2 = (BaseWebView) mutableState.getValue();
        if (baseWebView2 != null) {
            o000O.OooO0O0(baseWebView2);
        }
        BaseWebView baseWebView3 = (BaseWebView) mutableState.getValue();
        if (baseWebView3 != null) {
            o000O.OooO0o(baseWebView3);
        }
        mutableState.setValue(null);
    }
}
