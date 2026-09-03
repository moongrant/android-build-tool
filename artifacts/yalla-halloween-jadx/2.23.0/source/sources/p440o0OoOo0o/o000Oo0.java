package p440o0OoOo0o;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p147o00Oo0Oo.o000OOo;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLinkedAccountsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$LinkedAccountScreenContent$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,284:1\n154#2:285\n154#2:286\n*S KotlinDebug\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$LinkedAccountScreenContent$1\n*L\n97#1:285\n98#1:286\n*E\n"})
public final class o000Oo0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f46148OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(LinkedAccountsVM linkedAccountsVM) {
        super(3);
        this.f46148OooO0Oo = linkedAccountsVM;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        RowScope Toolbar = rowScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(830100379, iIntValue, -1, "com.yalla.yalla.module.account.ui.screen.LinkedAccountScreenContent.<anonymous> (LinkedAccountsScreen.kt:91)");
            }
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icon_nav_more_three_dot, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(8), 0.0f, 11, null), Dp.m3765constructorimpl(24)), false, false, 0L, false, null, null, null, new o0000O(this.f46148OooO0Oo), 253), o000OOo.OooO0OO(composer2).f37701OooO, composer2, 56, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
