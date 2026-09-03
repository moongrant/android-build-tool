package p492o0o00OO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p230o00oOo0o.o00000;
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<o000000> f49373OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo0(Ref.ObjectRef<o000000> objectRef) {
        super(2);
        this.f49373OooO0Oo = objectRef;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object, o00oOo0o.o000000] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757956189, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailActivity.initView.<anonymous> (TopicDetailActivity.kt:354)");
            }
            ?? OooO00o2 = o00000.OooO00o(0, composer2, 6, 0);
            this.f49373OooO0Oo.element = OooO00o2;
            Intrinsics.checkNotNull(OooO00o2);
            oOo000Oo.OooO00o(OooO00o2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
