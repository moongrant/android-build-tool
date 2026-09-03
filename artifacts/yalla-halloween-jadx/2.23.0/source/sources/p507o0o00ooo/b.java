package p507o0o00ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseWebView2, Unit> f49775OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f49776OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f49777OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f49778OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f49779OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1, Modifier modifier, Function1 function2, int i, int i2) {
        super(2);
        this.f49775OooO0Oo = function1;
        this.f49777OooO0o0 = function2;
        this.f49776OooO0o = modifier;
        this.f49778OooO0oO = i;
        this.f49779OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        Function1<BaseWebView2, Unit> function1 = this.f49775OooO0Oo;
        Function1<Boolean, Unit> function2 = this.f49777OooO0o0;
        oOOO0O0o.OooO0O0(function1, this.f49776OooO0o, function2, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49778OooO0oO | 1), this.f49779OooO0oo);
        return Unit.INSTANCE;
    }
}
