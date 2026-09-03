package p650o0ooo;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class u2 extends Lambda implements Function1<WebView, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<WebView> f59174OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(MutableState<WebView> mutableState) {
        super(1);
        this.f59174OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebView webView) {
        WebView it = webView;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f59174OooO0Oo.setValue(it);
        return Unit.INSTANCE;
    }
}
