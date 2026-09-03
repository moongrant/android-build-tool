package p485o0o00O0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p184o00o00o.Oooo000;
import p184o00o00o.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOoOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Oooo000> f48179OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOoOOO0(Ref.ObjectRef<Oooo000> objectRef) {
        super(2);
        this.f48179OooO0Oo = objectRef;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object, o00o00o.Oooo000] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757956189, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailActivity.initView.<anonymous> (TopicDetailActivity.kt:353)");
            }
            ?? OooO00o2 = o000oOoO.OooO00o(0, composer2, 6, 0);
            this.f48179OooO0Oo.element = OooO00o2;
            Intrinsics.checkNotNull(OooO00o2);
            oO0O0Oo0.OooO00o(OooO00o2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
