package p543o0o0Ooo0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p196o00o0OOO.oOO00O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55504OooO00o = ComposableLambdaKt.composableLambdaInstance(-738079778, false, OooO00o.f55505OooO0Oo);

    @SourceDebugExtension({"SMAP\nRoomThemeCustomScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeCustomScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$RoomThemeCustomScreenKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,518:1\n154#2:519\n*S KotlinDebug\n*F\n+ 1 RoomThemeCustomScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$RoomThemeCustomScreenKt$lambda-1$1\n*L\n109#1:519\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55505OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope ContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-738079778, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$RoomThemeCustomScreenKt.lambda-1.<anonymous> (RoomThemeCustomScreen.kt:106)");
                }
                oOO00O.OooO00o(StringResources_androidKt.stringResource(o000000.room_theme_custom_no_data, composer2, 0), 0, 0.0f, null, null, false, PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(40), 0.0f, 2, null), null, null, composer2, 1572864, 446);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
