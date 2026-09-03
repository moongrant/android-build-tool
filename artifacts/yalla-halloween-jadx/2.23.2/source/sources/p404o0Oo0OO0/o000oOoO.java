package p404o0Oo0OO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function3<MutableState<Boolean>, Composer, Integer, Unit> f43662OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Triple<MutableState<Boolean>, ComposeView, Boolean> f43663OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000oOoO(Function3<? super MutableState<Boolean>, ? super Composer, ? super Integer, Unit> function3, Triple<? extends MutableState<Boolean>, ComposeView, Boolean> triple) {
        super(2);
        this.f43662OooO0Oo = function3;
        this.f43663OooO0o0 = triple;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1777301820, iIntValue, -1, "com.yalla.yalla.base.activity.ComposeDialogProxy.showDialog.<anonymous>.<anonymous> (ComposeDialogProxy.kt:50)");
            }
            this.f43662OooO0Oo.invoke(this.f43663OooO0o0.getFirst(), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
