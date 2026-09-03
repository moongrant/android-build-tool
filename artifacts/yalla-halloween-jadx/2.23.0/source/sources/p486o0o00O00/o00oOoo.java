package p486o0o00O00;

import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p147o00Oo0Oo.o000OOo;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.j1;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchActivity.kt\ncom/yalla/yalla/ui/activity/main/MainSearchActivity$initView$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,156:1\n154#2:157\n154#2:158\n*S KotlinDebug\n*F\n+ 1 MainSearchActivity.kt\ncom/yalla/yalla/ui/activity/main/MainSearchActivity$initView$2$1\n*L\n109#1:157\n118#1:158\n*E\n"})
public final class o00oOoo extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f48335OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(MainSearchActivity mainSearchActivity) {
        super(3);
        this.f48335OooO0Oo = mainSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        int i;
        RowScope Toolbar = rowScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
        if ((iIntValue & 14) == 0) {
            i = (composer2.changed(Toolbar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((i & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-125996508, iIntValue, -1, "com.yalla.yalla.ui.activity.main.MainSearchActivity.initView.<anonymous>.<anonymous> (MainSearchActivity.kt:92)");
            }
            j1 j1Var = j1.f49943OooO00o;
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.search_room_user);
            PaddingValues paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
            long j = o000OOo.OooO0OO(composer2).f37703OooO0O0;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO00o = OooOO0O.OooO00o(Toolbar, companion, 1.0f, false, 2, null);
            MainSearchActivity mainSearchActivity = this.f48335OooO0Oo;
            j1Var.OooO00o(null, new o000OOo0(mainSearchActivity), new o00(mainSearchActivity), new o00O0000(mainSearchActivity), strOooO0OO, 0L, false, j, null, 0, paddingValuesM469PaddingValues0680j_4, null, modifierOooO00o, 0L, 0L, 0, composer2, 0, 2097158, 60257);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Search, composer2, 0);
            long sp = TextUnitKt.getSp(16);
            composer2.startReplaceableGroup(-561632817);
            int i2 = MainSearchActivity.f25414OooOoO;
            long j2 = StringsKt.isBlank(mainSearchActivity.OooOoO().getSearchText()) ^ true ? o0oO0O0o.f46993OoooOo0 : o000OOo.OooO0OO(composer2).f37714OooOOO0;
            composer2.endReplaceableGroup();
            TextKt.m1251Text4IGK_g(strStringResource, o0O0O00.OooO0O0(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(12), 0.0f, Dp.m3765constructorimpl(16), 0.0f, 10, null), false, false, 0L, false, null, null, null, new o0O0ooO(mainSearchActivity), 253), j2, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
