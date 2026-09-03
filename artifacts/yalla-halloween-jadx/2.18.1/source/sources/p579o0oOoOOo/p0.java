package p579o0oOoOOo;

import android.webkit.WebView;
import com.yalla.yalla.common.util.WebPageInfo;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends Lambda implements Function1<WebView, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ WebPageInfo f46246Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<WebView> f46247Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(WebPageInfo webPageInfo, o0O00OO<WebView> o0o00oo2) {
        super(1);
        this.f46246Oooo0o = webPageInfo;
        this.f46247Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebView webView) {
        WebView it = webView;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f46247Oooo0oO.setValue(it);
        Objects.requireNonNull(this.f46246Oooo0o);
        WebView value = this.f46247Oooo0oO.getValue();
        if (value != null) {
            value.setBackgroundColor(0);
        }
        return Unit.INSTANCE;
    }
}
