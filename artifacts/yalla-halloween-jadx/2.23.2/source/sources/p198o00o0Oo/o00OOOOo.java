package p198o00o0Oo;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCustomSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSlider.kt\ncom/code/android/uikit/slider/core/SlideCustomParams\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1281:1\n154#2:1282\n154#2:1283\n154#2:1284\n154#2:1285\n154#2:1286\n*S KotlinDebug\n*F\n+ 1 CustomSlider.kt\ncom/code/android/uikit/slider/core/SlideCustomParams\n*L\n1257#1:1282\n1258#1:1283\n1259#1:1284\n1261#1:1285\n1262#1:1286\n*E\n"})
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f39166OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f39167OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f39168OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f39169OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f39170OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f39171OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Function10<BoxScope, Modifier, Dp, MutableInteractionSource, o00Oo00, Boolean, Dp, Dp, Composer, Integer, Unit> f39172OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final Function6<BoxScope, Dp, Float, Float, Composer, Integer, Unit> f39173OooO0oo;

    public o00OOOOo(float f, ComposableLambda composableLambda, ComposableLambda composableLambda2, int i) {
        float fM3775constructorimpl = (i & 1) != 0 ? Dp.m3775constructorimpl(4) : 0.0f;
        float fM3775constructorimpl2 = (i & 2) != 0 ? Dp.m3775constructorimpl(10) : 0.0f;
        f = (i & 4) != 0 ? Dp.m3775constructorimpl(4) : f;
        float fM3775constructorimpl3 = (i & 8) != 0 ? Dp.m3775constructorimpl(48) : 0.0f;
        float fM3775constructorimpl4 = (i & 16) != 0 ? Dp.m3775constructorimpl(144) : 0.0f;
        composableLambda = (i & 64) != 0 ? null : composableLambda;
        composableLambda2 = (i & 128) != 0 ? null : composableLambda2;
        this.f39166OooO00o = fM3775constructorimpl;
        this.f39167OooO0O0 = fM3775constructorimpl2;
        this.f39168OooO0OO = f;
        this.f39169OooO0Oo = fM3775constructorimpl3;
        this.f39171OooO0o0 = fM3775constructorimpl4;
        this.f39170OooO0o = false;
        this.f39172OooO0oO = composableLambda;
        this.f39173OooO0oo = composableLambda2;
    }
}
