package p516o0o0O00o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function3<List<o0O00o00>, Composer, Integer, Unit> f51493OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51494OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<o0O00o00> f51495OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(Function3 function3, ArrayList arrayList, int i) {
        super(2);
        this.f51493OooO0Oo = function3;
        this.f51495OooO0o0 = arrayList;
        this.f51494OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(256034543, iIntValue, -1, "com.yalla.yalla.ui.composable.common.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScrollableTabRow.kt:125)");
            }
            this.f51493OooO0Oo.invoke(this.f51495OooO0o0, composer2, Integer.valueOf(((this.f51494OooO0o >> 12) & 112) | 8));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
