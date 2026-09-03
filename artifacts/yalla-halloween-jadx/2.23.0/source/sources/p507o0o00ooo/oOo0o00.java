package p507o0o00ooo;

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
import p187o00o00oo.o00O;
import p187o00o00oo.o00O0OO;
import p187o00o00oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Color> f50147OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f50148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f50149OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O f50150OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<WebView, Unit> f50151OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f50152OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f50153OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOo0o00(o00OO0O0 o00oo0o1, o00O o00o2, int i, Function1<? super WebView, Unit> function1, Function0<Unit> function0, MutableState<Color> mutableState, LifecycleOwner lifecycleOwner) {
        super(2);
        this.f50148OooO0Oo = o00oo0o1;
        this.f50150OooO0o0 = o00o2;
        this.f50149OooO0o = i;
        this.f50151OooO0oO = function1;
        this.f50152OooO0oo = function0;
        this.f50147OooO = mutableState;
        this.f50153OooOO0 = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1698938788, iIntValue, -1, "com.yalla.yalla.ui.composable.common.BaseWebView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseWebView.kt:100)");
            }
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new oOOO0OO0(null), composer2, 70);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            o00OO0O0 o00oo0o1 = this.f50148OooO0Oo;
            o00O o00o2 = this.f50150OooO0o0;
            oOOOoo00 oooooo00 = new oOOOoo00(this.f50151OooO0oO, this.f50152OooO0oo, o00o2, this.f50147OooO, this.f50153OooOO0);
            oOOOOo0O oooooo0o = oOOOOo0O.f50140OooO0Oo;
            int i = this.f50149OooO0o;
            o00O0OO.OooO00o(o00oo0o1, modifierFillMaxSize$default, false, o00o2, oooooo00, null, null, null, oooooo0o, composer2, (i & 14) | 100663344 | ((i << 6) & 7168), 228);
            EffectsKt.DisposableEffect((Object) null, oOOo0O00.f50146OooO0Oo, composer2, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
