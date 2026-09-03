package p496o0o00o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p158o00OoOOO.o00Oo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f48990OooO00o = ComposableLambdaKt.composableLambdaInstance(-1170650001, false, OooO00o.f48991OooO0Oo);

    public static final class OooO00o extends Lambda implements Function4<RowScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f48991OooO0Oo = new OooO00o();

        public OooO00o() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(RowScope rowScope, Integer num, Composer composer, Integer num2) {
            int i;
            RowScope BottomListEntityDialog = rowScope;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(BottomListEntityDialog, "$this$BottomListEntityDialog");
            if ((iIntValue2 & 112) == 0) {
                i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((i & 721) == 144 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1170650001, iIntValue2, -1, "com.yalla.yalla.ui.activity.user.ComposableSingletons$UserInfoActivityKt.lambda-1.<anonymous> (UserInfoActivity.kt:733)");
                }
                if (iIntValue == 0) {
                    o00Oo0.OooO0OO(oOo00OO0.icon_userinfo_vip_change_bp, 0.0f, 0.0f, composer2, 0, 6);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
