package p010OooOOoo;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.o00Oo0;
import androidx.activity.o00Ooo;
import androidx.activity.o0OoOo0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,110:1\n76#2:111\n76#2:112\n76#2:113\n23#3,8:114\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n*L\n51#1:111\n52#1:112\n53#1:113\n53#1:114,8\n*E\n"})
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<o0OoOo0> f216OooO00o = CompositionLocalKt.compositionLocalOf$default(null, OooO00o.f217OooO0Oo, 1, null);

    public static final class OooO00o extends Lambda implements Function0<o0OoOo0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f217OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ o0OoOo0 invoke() {
            return null;
        }
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public static o0OoOo0 OooO00o(@Nullable Composer composer) {
        composer.startReplaceableGroup(-2068013981);
        o0OoOo0 o0oooo0 = (o0OoOo0) composer.consume(f216OooO00o);
        composer.startReplaceableGroup(1680121597);
        if (o0oooo0 == null) {
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Intrinsics.checkNotNullParameter(view, "<this>");
            o0oooo0 = (o0OoOo0) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(view, o00Oo0.f2198OooO0Oo), o00Ooo.f2199OooO0Oo));
        }
        composer.endReplaceableGroup();
        if (o0oooo0 == null) {
            Object baseContext = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof o0OoOo0) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "innerContext.baseContext");
            }
            o0oooo0 = (o0OoOo0) baseContext;
        }
        composer.endReplaceableGroup();
        return o0oooo0;
    }
}
