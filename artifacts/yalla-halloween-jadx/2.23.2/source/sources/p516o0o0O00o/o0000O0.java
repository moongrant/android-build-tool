package p516o0o0O00o;

import android.webkit.WebView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p231o00oOoO.o00000OO;
import p231o00oOoO.o0000O00;
import p231o00oOoO.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Color> f51168OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f51169OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51170OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f51171OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<WebView, Unit> f51172OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f51173OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f51174OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000O0(o0000O0O o0000o0o2, o0000O00 o0000o00, int i, Function1<? super WebView, Unit> function1, Function0<Unit> function0, MutableState<Color> mutableState, LifecycleOwner lifecycleOwner) {
        super(2);
        this.f51169OooO0Oo = o0000o0o2;
        this.f51171OooO0o0 = o0000o00;
        this.f51170OooO0o = i;
        this.f51172OooO0oO = function1;
        this.f51173OooO0oo = function0;
        this.f51168OooO = mutableState;
        this.f51174OooOO0 = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1698938788, iIntValue, -1, "com.yalla.yalla.ui.composable.common.BaseWebView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseWebView.kt:101)");
            }
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new o00000O(null), composer2, 70);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            o0000O0O o0000o0o2 = this.f51169OooO0Oo;
            o0000O00 o0000o00 = this.f51171OooO0o0;
            o0000Ooo o0000ooo = new o0000Ooo(this.f51172OooO0oO, this.f51173OooO0oo, o0000o00, this.f51168OooO, this.f51174OooOO0);
            o0000 o0000Var = o0000.f51119OooO0Oo;
            int i = this.f51170OooO0o;
            o00000OO.OooO00o(o0000o0o2, modifierFillMaxSize$default, false, o0000o00, o0000ooo, null, null, null, o0000Var, composer2, (i & 14) | 100663344 | ((i << 6) & 7168), 228);
            EffectsKt.DisposableEffect((Object) null, o0000oo.f51190OooO0Oo, composer2, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
