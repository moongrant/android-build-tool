package p423o0OoO0OO;

import android.graphics.drawable.Drawable;
import androidx.compose.animation.OooOOO;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nModifierExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierExt.kt\ncom/yalla/yalla/ext/ModifierExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,41:1\n76#2:42\n25#3:43\n1097#4,6:44\n*S KotlinDebug\n*F\n+ 1 ModifierExt.kt\ncom/yalla/yalla/ext/ModifierExtKt\n*L\n18#1:42\n19#1:43\n19#1:44,6\n*E\n"})
public final class o00O000 {

    public static final class OooO00o extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Drawable f46684OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Drawable drawable) {
            super(1);
            this.f46684OooO0Oo = drawable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            Drawable drawable = this.f46684OooO0Oo;
            if (drawable != null) {
                drawable.setBounds(0, 0, (int) Size.m1516getWidthimpl(drawBehind.mo2118getSizeNHjbRc()), (int) Size.m1513getHeightimpl(drawBehind.mo2118getSizeNHjbRc()));
            }
            if (drawable != null) {
                drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(drawBehind.getDrawContext().getCanvas()));
            }
            return Unit.INSTANCE;
        }
    }

    @Composable
    @NotNull
    public static final Modifier OooO00o(@NotNull Modifier modifier, @Nullable Drawable drawable, @Nullable Composer composer, int i) {
        if (OooOOO.OooO0O0(modifier, "<this>", composer, 1990928836)) {
            ComposerKt.traceEventStart(1990928836, i, -1, "com.yalla.yalla.ext.image9Patch (ModifierExt.kt:32)");
        }
        Modifier modifierDrawBehind = DrawModifierKt.drawBehind(Modifier.INSTANCE.then(modifier), new OooO00o(drawable));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierDrawBehind;
    }
}
