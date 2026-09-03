package p530o0o0OOOO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53390OooO00o = ComposableLambdaKt.composableLambdaInstance(-1031190483, false, OooO00o.f53391OooO0Oo);

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53391OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1031190483, iIntValue, -1, "com.yalla.yalla.ui.fragment.room.ComposableSingletons$RoomEventInfoFragmentKt.lambda-1.<anonymous> (RoomEventInfoFragment.kt:19)");
                }
                o0OOO0o o0ooo0o2 = o00000OO.f56399OooO0O0;
                if (o0ooo0o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("event");
                    o0ooo0o2 = null;
                }
                o0ooo0o2.OooO0o0(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
