package p445o0OoOoO0;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLinkedAccountsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$LinkedAccountScreenContent$7\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,311:1\n154#2:312\n154#2:313\n*S KotlinDebug\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$LinkedAccountScreenContent$7\n*L\n188#1:312\n189#1:313\n*E\n"})
public final class oo0O extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f47357OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(LinkedAccountsVM linkedAccountsVM) {
        super(3);
        this.f47357OooO0Oo = linkedAccountsVM;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        RowScope SettingItem = rowScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1735314943, iIntValue, -1, "com.yalla.yalla.module.account.ui.screen.LinkedAccountScreenContent.<anonymous> (LinkedAccountsScreen.kt:183)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(this.f47357OooO0Oo.isBindFacebook() ? o0Oo0oo.account_facebook_green : o0Oo0oo.account_facebook_gray, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 11, null), Dp.m3775constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
