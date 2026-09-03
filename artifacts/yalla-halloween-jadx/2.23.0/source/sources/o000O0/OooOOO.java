package o000O0;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyPagingItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItemsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,293:1\n36#2:294\n1057#3,6:295\n*S KotlinDebug\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItemsKt\n*L\n269#1:294\n269#1:295,6\n*E\n"})
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final androidx.paging.OooOOO f34342OooO00o;

    static {
        androidx.paging.OooOOO0.OooO0OO oooO0OO = new androidx.paging.OooOOO0.OooO0OO(false);
        f34342OooO00o = new androidx.paging.OooOOO(androidx.paging.OooOOO0.OooO0O0.f7165OooO0O0, oooO0OO, oooO0OO);
    }

    @Composable
    @NotNull
    public static final OooO0O0 OooO00o(@NotNull SharedFlow sharedFlow, @Nullable Composer composer) {
        Intrinsics.checkNotNullParameter(sharedFlow, "<this>");
        composer.startReplaceableGroup(388053246);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(388053246, 8, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:264)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(sharedFlow);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0O0(sharedFlow);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        OooO0O0 oooO0O0 = (OooO0O0) objRememberedValue;
        EffectsKt.LaunchedEffect(oooO0O0, new OooOO0O(emptyCoroutineContext, oooO0O0, null), composer, 72);
        EffectsKt.LaunchedEffect(oooO0O0, new OooOOO0(emptyCoroutineContext, oooO0O0, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return oooO0O0;
    }
}
