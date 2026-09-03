package p507o0o00ooo;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import com.code.android.uikit.contentstate.ContentState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<ContentState> f49731OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<WebView> f49732OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0O0(MutableState<ContentState> mutableState, MutableState<WebView> mutableState2) {
        super(0);
        this.f49731OooO0Oo = mutableState;
        this.f49732OooO0o0 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f49731OooO0Oo.setValue(ContentState.Loading);
        WebView value = this.f49732OooO0o0.getValue();
        if (value != null) {
            value.reload();
        }
        return Unit.INSTANCE;
    }
}
