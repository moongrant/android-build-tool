package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.ui.vm.user.HeadFrameViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nHeaderFrameScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderFrameScreen.kt\ncom/yalla/yalla/ui/screen/user/HeaderFrameScreen$HeaddressList$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,387:1\n154#2:388\n*S KotlinDebug\n*F\n+ 1 HeaderFrameScreen.kt\ncom/yalla/yalla/ui/screen/user/HeaderFrameScreen$HeaddressList$3$1\n*L\n272#1:388\n*E\n"})
public final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ HeadFrameViewModel f29444OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(HeadFrameViewModel headFrameViewModel) {
        super(2);
        this.f29444OooO0Oo = headFrameViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1592929136, iIntValue, -1, "com.yalla.yalla.ui.screen.user.HeaderFrameScreen.HeaddressList.<anonymous>.<anonymous> (HeaderFrameScreen.kt:270)");
            }
            float f = 14;
            LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(4), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, PaddingKt.m474PaddingValuesa9UjIt4(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(0), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(53)), false, null, null, null, false, new OooOOO(this.f29444OooO0Oo), composer2, 3120, 500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
