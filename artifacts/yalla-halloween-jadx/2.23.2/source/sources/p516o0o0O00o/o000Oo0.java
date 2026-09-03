package p516o0o0O00o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseWebView2, Unit> f51262OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f51263OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f51264OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f51265OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f51266OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(Function1 function1, Modifier modifier, Function1 function2, int i, int i2) {
        super(2);
        this.f51262OooO0Oo = function1;
        this.f51264OooO0o0 = function2;
        this.f51263OooO0o = modifier;
        this.f51265OooO0oO = i;
        this.f51266OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        Function1<BaseWebView2, Unit> function1 = this.f51262OooO0Oo;
        Function1<Boolean, Unit> function2 = this.f51264OooO0o0;
        o00000O0.OooO0O0(function1, this.f51263OooO0o, function2, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51265OooO0oO | 1), this.f51266OooO0oo);
        return Unit.INSTANCE;
    }
}
