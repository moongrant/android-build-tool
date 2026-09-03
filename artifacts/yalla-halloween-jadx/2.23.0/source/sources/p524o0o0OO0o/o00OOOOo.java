package p524o0o0OO0o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p560o0oOo000.o00000O0;
import p560o0oOo000.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53461OooO00o = ComposableLambdaKt.composableLambdaInstance(-1031190483, false, OooO00o.f53462OooO0Oo);

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53462OooO0Oo = new OooO00o();

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
                    ComposerKt.traceEventStart(-1031190483, iIntValue, -1, "com.yalla.yalla.ui.fragment.room.ComposableSingletons$RoomEventInfoFragmentKt.lambda-1.<anonymous> (RoomEventInfoFragment.kt:18)");
                }
                o00000O0 o00000o1 = o0000OO0.f56183OooO0O0;
                if (o00000o1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("event");
                    o00000o1 = null;
                }
                o00000o1.OooO0o0(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
