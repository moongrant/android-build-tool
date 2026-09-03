package com.yalla.yalla.developer.crash;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p193o00o0O0O.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCrashListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashListScreen.kt\ncom/yalla/yalla/developer/crash/CrashListScreen$Content$3$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,67:1\n154#2:68\n*S KotlinDebug\n*F\n+ 1 CrashListScreen.kt\ncom/yalla/yalla/developer/crash/CrashListScreen$Content$3$1$1$2\n*L\n60#1:68\n*E\n"})
public final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Pair<String, File> f22885OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO(Pair<String, ? extends File> pair) {
        super(2);
        this.f22885OooO0Oo = pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1194592952, iIntValue, -1, "com.yalla.yalla.developer.crash.CrashListScreen.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CrashListScreen.kt:59)");
            }
            TextKt.m1261Text4IGK_g(this.f22885OooO0Oo.getFirst(), PaddingKt.m478padding3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(10)), o0000oo.OooO0OO(composer2).f38616OooO, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
