package p536o0o0Oo0o;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Oooo0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserMomentListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt$UserMomentListContent$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,537:1\n154#2:538\n154#2:539\n*S KotlinDebug\n*F\n+ 1 UserMomentListScreen.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListScreenKt$UserMomentListContent$1$1\n*L\n181#1:538\n182#1:539\n*E\n"})
public final class oOO0OoO0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f55212OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f55213OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OoO0(Context context, String str) {
        super(3);
        this.f55212OooO0Oo = str;
        this.f55213OooO0o0 = context;
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
                ComposerKt.traceEventStart(-973286030, iIntValue, -1, "com.yalla.yalla.ui.screen.user.UserMomentListContent.<anonymous>.<anonymous> (UserMomentListScreen.kt:175)");
            }
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(this.f55212OooO0Oo, Oooo0.OooO00o())) {
                ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_user_moment_list_clock, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(8), 0.0f, 11, null), Dp.m3765constructorimpl(24)), false, false, 0L, false, null, null, null, new oOO0Oo00(this.f55213OooO0o0), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
