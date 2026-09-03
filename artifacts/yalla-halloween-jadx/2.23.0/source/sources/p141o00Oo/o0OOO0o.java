package p141o00Oo;

import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCustomSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSlider.kt\ncom/code/android/uikit/slider/core/CustomSliderKt$sliderTapModifier$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1281:1\n486#2,4:1282\n490#2,2:1290\n494#2:1296\n25#3:1286\n1097#4,3:1287\n1100#4,3:1293\n486#5:1292\n*S KotlinDebug\n*F\n+ 1 CustomSlider.kt\ncom/code/android/uikit/slider/core/CustomSliderKt$sliderTapModifier$2\n*L\n977#1:1282,4\n977#1:1290,2\n977#1:1296\n977#1:1286\n977#1:1287,3\n977#1:1293,3\n977#1:1292\n*E\n"})
public final class o0OOO0o extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f37554OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f37555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f37556OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ DraggableState f37557OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f37558OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f37559OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f37560OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Float, Unit>> f37561OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(boolean z, o000OOo o000ooo2, MutableInteractionSource mutableInteractionSource, float f, boolean z2, MutableState mutableState, MutableState mutableState2, State state) {
        super(3);
        this.f37555OooO0Oo = z;
        this.f37557OooO0o0 = o000ooo2;
        this.f37556OooO0o = mutableInteractionSource;
        this.f37558OooO0oO = f;
        this.f37559OooO0oo = z2;
        this.f37554OooO = mutableState;
        this.f37560OooOO0 = mutableState2;
        this.f37561OooOO0O = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier composed = modifier;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(-2014773912);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2014773912, iIntValue, -1, "com.code.android.uikit.slider.core.sliderTapModifier.<anonymous> (CustomSlider.kt:974)");
        }
        if (this.f37555OooO0Oo) {
            Object objOooO00o = OooOo00.OooO00o(composer2, 773894976, -492369756);
            if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
            }
            composer2.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composer2.endReplaceableGroup();
            composed = SuspendingPointerInputFilterKt.pointerInput(composed, new Object[]{this.f37557OooO0o0, this.f37556OooO0o, Float.valueOf(this.f37558OooO0oO), Boolean.valueOf(this.f37559OooO0oo)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new o00oO0o(this.f37559OooO0oo, this.f37558OooO0oO, this.f37554OooO, this.f37560OooOO0, coroutineScope, this.f37557OooO0o0, this.f37561OooOO0O, null));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return composed;
    }
}
