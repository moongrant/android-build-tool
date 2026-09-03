package p197o00o0OOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> f39019OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f39020OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Modifier f39021OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo0o0O0(Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, int i) {
        super(2);
        this.f39019OooO0Oo = function3;
        this.f39021OooO0o0 = modifier;
        this.f39020OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-667514815, iIntValue, -1, "com.code.android.uikit.marquee.MarqueeText.<anonymous>.<anonymous>.<anonymous> (MarqueeTextComp.kt:147)");
            }
            this.f39019OooO0Oo.invoke(this.f39021OooO0o0, composer2, Integer.valueOf(((this.f39020OooO0o >> 6) & 14) | 48));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
