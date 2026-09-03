package p325o0O0oo0o;

import android.webkit.WebView;
import kotlin.jvm.functions.Function1;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WebView f36922OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oO0Oo f36923OooO0O0;

    public o000O0(WebView webView, oO0Oo oo0oo) {
        this.f36922OooO00o = webView;
        this.f36923OooO0O0 = oo0oo;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        ((Function1) this.f36923OooO0O0.getValue()).invoke(this.f36922OooO00o);
    }
}
