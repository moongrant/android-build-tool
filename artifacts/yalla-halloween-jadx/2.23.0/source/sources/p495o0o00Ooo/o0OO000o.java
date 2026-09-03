package p495o0o00Ooo;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o000OO00;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomTurntableGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTurntableGameManager$Content$4$1\n*L\n1#1,496:1\n111#2,2:497\n*E\n"})
public final class o0OO000o implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState f48919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MutableState f48920OooO0O0;

    public o0OO000o(MutableState mutableState, MutableState mutableState2) {
        this.f48919OooO00o = mutableState;
        this.f48920OooO0O0 = mutableState2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f48920OooO0O0.setValue("");
        OooO00o.f24982OooOO0O.f47423OooO00o.setValue(Boolean.FALSE);
        MutableState mutableState = this.f48919OooO00o;
        BaseWebView baseWebView = (BaseWebView) mutableState.getValue();
        if (baseWebView != null) {
            baseWebView.OooO0Oo();
        }
        BaseWebView baseWebView2 = (BaseWebView) mutableState.getValue();
        if (baseWebView2 != null) {
            o000OO00.OooO0O0(baseWebView2);
        }
        BaseWebView baseWebView3 = (BaseWebView) mutableState.getValue();
        if (baseWebView3 != null) {
            o000OO00.OooO0o(baseWebView3);
        }
        mutableState.setValue(null);
    }
}
