package p578o0oOoOoo;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p468o0OoooO0.o0OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicEditDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditDialog.kt\ncom/yalla/yalla/module/media/dialog/MusicEditDialogKt$AddMusicEditDialog$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,330:1\n50#2:331\n49#2:332\n1097#3,6:333\n154#4:339\n*S KotlinDebug\n*F\n+ 1 MusicEditDialog.kt\ncom/yalla/yalla/module/media/dialog/MusicEditDialogKt$AddMusicEditDialog$2\n*L\n104#1:331\n104#1:332\n104#1:333,6\n109#1:339\n*E\n"})
public final class oOOOOo0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f56477OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f56478OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f56479OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f56480OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f56481OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f56482OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f56483OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f56484OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f56485OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ String f56486OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56487OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f56488OooOOOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOOo0O(int i, long j, long j2, MutableFloatState mutableFloatState, MutableIntState mutableIntState, MutableState mutableState, String str, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5) {
        super(2);
        this.f56478OooO0Oo = mutableFloatState;
        this.f56480OooO0o0 = j;
        this.f56479OooO0o = i;
        this.f56481OooO0oO = j2;
        this.f56482OooO0oo = mutableIntState;
        this.f56477OooO = function1;
        this.f56483OooOO0 = function2;
        this.f56484OooOO0O = function3;
        this.f56485OooOO0o = function4;
        this.f56487OooOOO0 = mutableState;
        this.f56486OooOOO = str;
        this.f56488OooOOOO = function5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1207456140, iIntValue, -1, "com.yalla.yalla.module.media.dialog.AddMusicEditDialog.<anonymous> (MusicEditDialog.kt:102)");
            }
            Unit unit = Unit.INSTANCE;
            long j = this.f56480OooO0o0;
            Long lValueOf = Long.valueOf(j);
            composer2.startReplaceableGroup(511388516);
            MutableFloatState mutableFloatState = this.f56478OooO0Oo;
            boolean zChanged = composer2.changed(lValueOf) | composer2.changed(mutableFloatState);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new oOOO0O0o(mutableFloatState, j, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 70);
            long jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
            SurfaceKt.m1185SurfaceFjzlyU(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(360)), null, jM1705getTransparent0d7_KjU, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1309867312, true, new oOOOoo00(this.f56479OooO0o, this.f56480OooO0o0, this.f56481OooO0oO, this.f56478OooO0Oo, this.f56482OooO0oo, this.f56487OooOOO0, this.f56486OooOOO, this.f56477OooO, this.f56483OooOO0, this.f56484OooOO0O, this.f56485OooOO0o, this.f56488OooOOOO)), composer2, 1573254, 58);
            o0OO0O0.OooO00o("_MusicEditDialog", "sliderPosition  " + mutableFloatState);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
