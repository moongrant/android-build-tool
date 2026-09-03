package p519o0o0O0oO;

import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import io.agora.rtc.Constants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p519o0o0O0oO.a5;
import p519o0o0O0oO.b5;
import p519o0o0O0oO.c5;
import p519o0o0O0oO.z4;
import p584o0oOooO0.oOo00OO0;
import p642o0ooOOo.o0OO;
import p642o0ooOOo.o0OO0O0;
import p642o0ooOOo.oO00000;
import p642o0ooOOo.oO0000Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserOutFitDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserOutFitDialog.kt\ncom/yalla/yalla/ui/dialog/UserOutFitDialog$onAddVehicleImageDialog$1\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,194:1\n73#2,4:195\n77#2,20:206\n25#3:199\n955#4,6:200\n*S KotlinDebug\n*F\n+ 1 UserOutFitDialog.kt\ncom/yalla/yalla/ui/dialog/UserOutFitDialog$onAddVehicleImageDialog$1\n*L\n57#1:195,4\n57#1:206,20\n57#1:199\n57#1:200,6\n*E\n"})
public final class d5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52203OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f52204OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52205OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f52206OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, int i, String str) {
        super(2);
        this.f52203OooO0Oo = mutableState;
        this.f52205OooO0o0 = mutableState2;
        this.f52204OooO0o = i;
        this.f52206OooO0oO = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-304677376, iIntValue, -1, "com.yalla.yalla.ui.dialog.UserOutFitDialog.onAddVehicleImageDialog.<anonymous> (UserOutFitDialog.kt:55)");
            }
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
            final MutableState<Boolean> mutableState = this.f52203OooO0Oo;
            final MutableState<Boolean> mutableState2 = this.f52205OooO0o0;
            final int i = this.f52204OooO0o;
            final String str = this.f52206OooO0oO;
            Object objOooO00o = OooOo00.OooO00o(composer2, -270267587, -3687241);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = new oO00000();
                composer2.updateRememberedValue(objOooO00o);
            }
            composer2.endReplaceableGroup();
            final oO00000 oo00000 = (oO00000) objOooO00o;
            composer2.startReplaceableGroup(-3687241);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ConstraintLayoutScope();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue;
            composer2.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Pair pairOooO0O0 = o0OO.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue2, oo00000, composer2);
            MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
            final Function0 function0 = (Function0) pairOooO0O0.component2();
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierWrapContentSize$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.dialog.UserOutFitDialog$onAddVehicleImageDialog$1$invoke$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    oO0000Oo.OooO00o(semantics, oo00000);
                    return Unit.INSTANCE;
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composer2, -819894182, true, new Function2<Composer, Integer, Unit>(function0, mutableState, mutableState2, i, str) { // from class: com.yalla.yalla.ui.dialog.UserOutFitDialog$onAddVehicleImageDialog$1$invoke$$inlined$ConstraintLayout$2

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ MutableState f27982OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ Function0 f27983OooO0o0;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public final /* synthetic */ MutableState f27984OooO0oO;

                /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
                public final /* synthetic */ String f27985OooO0oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.f27985OooO0oo = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer3, Integer num2) {
                    Composer composer4 = composer3;
                    if (((num2.intValue() & 11) ^ 2) == 0 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope2 = this.f27981OooO0Oo;
                        constraintLayoutScope2.getClass();
                        constraintLayoutScope2.OooO0Oo();
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        o0OO0O0 o0oo0o0OooO00o = oooO00oOooO0OO.OooO00o();
                        oooO00oOooO0OO.OooO0O0();
                        o0OO0O0 o0oo0o0OooO0OO = oooO00oOooO0OO.OooO0OO();
                        composer4.startReplaceableGroup(-492369756);
                        Object objRememberedValue3 = composer4.rememberedValue();
                        Composer.Companion companion2 = Composer.INSTANCE;
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = this.f27985OooO0oo;
                            composer4.updateRememberedValue(objRememberedValue3);
                        }
                        composer4.endReplaceableGroup();
                        String str2 = (String) objRememberedValue3;
                        composer4.startReplaceableGroup(1157296644);
                        MutableState mutableState3 = this.f27982OooO0o;
                        boolean zChanged = composer4.changed(mutableState3);
                        Object objRememberedValue4 = composer4.rememberedValue();
                        if (zChanged || objRememberedValue4 == companion2.getEmpty()) {
                            objRememberedValue4 = new z4(mutableState3);
                            composer4.updateRememberedValue(objRememberedValue4);
                        }
                        composer4.endReplaceableGroup();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        p154o00OoO00.OooOo00.OooO00o(str2, true, 0, null, (Function0) objRememberedValue4, ConstraintLayoutScope.OooO00o(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(companion3, Dp.m3765constructorimpl(330)), Dp.m3765constructorimpl(Constants.ERR_ALREADY_IN_RECORDING)), o0oo0o0OooO00o, a5.f52172OooO0Oo), composer4, 54, 12);
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_close_theme_image, composer4, 0);
                        Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(36, companion3, composer4, 1157296644);
                        boolean zChanged2 = composer4.changed(o0oo0o0OooO00o);
                        Object objRememberedValue5 = composer4.rememberedValue();
                        if (zChanged2 || objRememberedValue5 == companion2.getEmpty()) {
                            objRememberedValue5 = new b5(o0oo0o0OooO00o);
                            composer4.updateRememberedValue(objRememberedValue5);
                        }
                        composer4.endReplaceableGroup();
                        Modifier modifierOooO00o2 = ConstraintLayoutScope.OooO00o(modifierOooO00o, o0oo0o0OooO0OO, (Function1) objRememberedValue5);
                        composer4.startReplaceableGroup(1157296644);
                        MutableState mutableState4 = this.f27984OooO0oO;
                        boolean zChanged3 = composer4.changed(mutableState4);
                        Object objRememberedValue6 = composer4.rememberedValue();
                        if (zChanged3 || objRememberedValue6 == companion2.getEmpty()) {
                            objRememberedValue6 = new c5(mutableState4);
                            composer4.updateRememberedValue(objRememberedValue6);
                        }
                        composer4.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource, (String) null, ClickableKt.m202clickableXHw0xAI$default(modifierOooO00o2, false, null, null, (Function0) objRememberedValue6, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
                    }
                    return Unit.INSTANCE;
                }
            }), measurePolicy, composer2, 48, 0);
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
