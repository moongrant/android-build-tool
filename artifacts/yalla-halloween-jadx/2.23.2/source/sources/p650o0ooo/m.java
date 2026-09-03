package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p207o00o0oO0.o000O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f58379OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f58380OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f58381OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i, String str, String str2) {
        super(3);
        this.f58379OooO0Oo = i;
        this.f58381OooO0o0 = str;
        this.f58380OooO0o = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(it) ? 4 : 2;
        }
        int i = iIntValue;
        if ((i & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1363351607, i, -1, "com.yalla.yalla.ui.dialog.OpenNobleDialogUtil.showOpenNobleDialog.<anonymous> (OpenNobleDialogUtil.kt:28)");
            }
            o000O0Oo.OooO0Oo(it, null, null, ComposableLambdaKt.composableLambda(composer2, 1788988716, true, new k(this.f58379OooO0Oo, this.f58381OooO0o0, this.f58380OooO0o)), false, false, null, null, null, false, null, false, l.f58366OooO0Oo, null, false, false, null, null, null, null, composer2, (i & 14) | 199680, 384, 1044438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
