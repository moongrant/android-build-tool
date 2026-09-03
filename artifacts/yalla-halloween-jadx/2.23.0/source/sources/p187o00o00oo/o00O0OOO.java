package p187o00o00oo;

import android.webkit.WebView;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WebView.kt\ncom/google/accompanist/web/WebViewKt$WebView$8$1\n*L\n1#1,484:1\n121#2:485\n*E\n"})
public final class o00O0OOO implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WebView f38744OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ State f38745OooO0O0;

    public o00O0OOO(WebView webView, State state) {
        this.f38744OooO00o = webView;
        this.f38745OooO0O0 = state;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ((Function1) this.f38745OooO0O0.getValue()).invoke(this.f38744OooO00o);
    }
}
