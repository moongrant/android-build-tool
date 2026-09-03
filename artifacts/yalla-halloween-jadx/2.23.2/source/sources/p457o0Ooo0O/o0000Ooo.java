package p457o0Ooo0O;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import p199o00o0Oo0.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f47672OooO00o = ComposableLambdaKt.composableLambdaInstance(-1940199708, false, OooO00o.f47673OooO0Oo);

    public static final class OooO00o extends Lambda implements Function6<BoxScope, Dp, Float, Float, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47673OooO0Oo = new OooO00o();

        public OooO00o() {
            super(6);
        }

        @Override // kotlin.jvm.functions.Function6
        public final Unit invoke(BoxScope boxScope, Dp dp, Float f, Float f2, Composer composer, Integer num) {
            int i;
            BoxScope $receiver = boxScope;
            float fM3789unboximpl = dp.m3789unboximpl();
            float fFloatValue = f.floatValue();
            f2.floatValue();
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            if ((iIntValue & 14) == 0) {
                i = (composer2.changed($receiver) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 112) == 0) {
                i |= composer2.changed(fM3789unboximpl) ? 32 : 16;
            }
            if ((iIntValue & 896) == 0) {
                i |= composer2.changed(fFloatValue) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((41691 & i) == 8338 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1940199708, i, -1, "com.yalla.yalla.module.media.dialog.ComposableSingletons$CompressVideoChangeMusicVoiceKt.lambda-1.<anonymous> (CompressVideoChangeMusicVoice.kt:192)");
                }
                o0000.OooO00o($receiver, fM3789unboximpl, fFloatValue, composer2, (i & 14) | (i & 112) | (i & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
