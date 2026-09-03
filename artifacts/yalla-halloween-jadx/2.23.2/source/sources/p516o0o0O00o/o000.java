package p516o0o0O00o;

import androidx.compose.runtime.MutableState;
import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 implements BaseWebView2.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f51116OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f51117OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ MutableState<ContentState> f51118OooO0OO;

    public o000(Function1 function1, MutableState mutableState, MutableState mutableState2) {
        this.f51116OooO00o = mutableState;
        this.f51117OooO0O0 = function1;
        this.f51118OooO0OO = mutableState2;
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView2.OooO0OO
    public final void OooO00o(int i) {
        this.f51116OooO00o.setValue(Float.valueOf(i / 100.0f));
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView2.OooO0OO
    public final void OooO0O0(boolean z) {
        this.f51118OooO0OO.setValue(z ? ContentState.Content : ContentState.Error);
        this.f51117OooO0O0.invoke(Boolean.valueOf(z));
        this.f51116OooO00o.setValue(Float.valueOf(0.0f));
    }
}
