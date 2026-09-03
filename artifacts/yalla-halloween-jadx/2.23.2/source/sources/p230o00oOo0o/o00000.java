package p230o00oOo0o;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\ncom/google/accompanist/pager/PagerStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,390:1\n36#2:391\n1114#3,6:392\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\ncom/google/accompanist/pager/PagerStateKt\n*L\n69#1:391\n69#1:392,6\n*E\n"})
public final class o00000 {

    public static final class OooO00o extends Lambda implements Function0<o000000> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f39750OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(0);
            this.f39750OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000000 invoke() {
            return new o000000(this.f39750OooO0Oo);
        }
    }

    @Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of rememberPagerState is androidx.compose.foundation.pager.rememberPagerState().\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @ReplaceWith(expression = "androidx.compose.foundation.pager.rememberPagerState(initialPage = initialPage)", imports = {"androidx.compose.foundation.pager.rememberPagerState"}))
    @Composable
    @NotNull
    public static final o000000 OooO00o(@IntRange(from = ULong.MIN_VALUE) int i, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1352421093);
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1352421093, i2, -1, "com.google.accompanist.pager.rememberPagerState (PagerState.kt:66)");
        }
        Object[] objArr = new Object[0];
        Saver<o000000, ?> saver = o000000.f39751OooO0oo;
        Saver<o000000, ?> saver2 = o000000.f39751OooO0oo;
        Integer numValueOf = Integer.valueOf(i);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(numValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO00o(i);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        o000000 o000000Var = (o000000) RememberSaveableKt.m1333rememberSaveable(objArr, (Saver) saver2, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o000000Var;
    }
}
