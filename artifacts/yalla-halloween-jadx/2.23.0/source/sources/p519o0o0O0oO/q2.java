package p519o0o0O0oO;

import android.content.res.Configuration;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p150o00Oo0oO.o0000Ooo;
import p187o00o00oo.o00O0O0O;
import p187o00o00oo.o00O0OO;
import p187o00o00oo.o00OO0O0;
import p426o0OoOO.o000oOoO;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomWebDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomWebDialog.kt\ncom/yalla/yalla/ui/dialog/RoomWebDialog\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,138:1\n76#2:139\n76#2:142\n154#3:140\n154#3:143\n88#4:141\n88#4:144\n36#5:145\n36#5:152\n1097#6,6:146\n1097#6,6:153\n*S KotlinDebug\n*F\n+ 1 RoomWebDialog.kt\ncom/yalla/yalla/ui/dialog/RoomWebDialog\n*L\n45#1:139\n48#1:142\n46#1:140\n49#1:143\n46#1:141\n49#1:144\n52#1:145\n54#1:152\n52#1:146,6\n54#1:153,6\n*E\n"})
public final class q2 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final q2 f53094OooO00o = new q2();

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f53095OooO0Oo;

        public OooO(t2.OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53095OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f53095OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f53095OooO0Oo;
        }

        public final int hashCode() {
            return this.f53095OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53095OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f53097OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ WebPageInfo f53098OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f53099OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(WebPageInfo webPageInfo, Function0<Unit> function0, int i) {
            super(2);
            this.f53098OooO0o0 = webPageInfo;
            this.f53097OooO0o = function0;
            this.f53099OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53099OooO0oO | 1);
            WebPageInfo webPageInfo = this.f53098OooO0o0;
            Function0<Unit> function0 = this.f53097OooO0o;
            q2.this.OooO00o(webPageInfo, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f53100OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(0);
            this.f53100OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f53100OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomWebDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomWebDialog.kt\ncom/yalla/yalla/ui/dialog/RoomWebDialog$OnDialog$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,138:1\n76#2:139\n76#2:260\n154#3:140\n154#3:142\n154#3:178\n154#3:179\n154#3:215\n154#3:216\n154#3:217\n154#3:225\n88#4:141\n72#5,6:143\n78#5:177\n82#5:265\n78#6,11:149\n78#6,11:186\n91#6:229\n91#6:264\n456#7,8:160\n464#7,3:174\n456#7,8:197\n464#7,3:211\n36#7:218\n467#7,3:226\n36#7:231\n36#7:238\n50#7:245\n49#7:246\n25#7:253\n467#7,3:261\n4144#8,6:168\n4144#8,6:205\n66#9,6:180\n72#9:214\n76#9:230\n1097#10,6:219\n1097#10,6:232\n1097#10,6:239\n1097#10,6:247\n1097#10,6:254\n81#11:266\n81#11:267\n107#11,2:268\n81#11:270\n107#11,2:271\n*S KotlinDebug\n*F\n+ 1 RoomWebDialog.kt\ncom/yalla/yalla/ui/dialog/RoomWebDialog$OnDialog$3\n*L\n57#1:139\n112#1:260\n61#1:140\n62#1:142\n69#1:178\n71#1:179\n77#1:215\n87#1:216\n88#1:217\n92#1:225\n61#1:141\n58#1:143,6\n58#1:177\n58#1:265\n58#1:149,11\n66#1:186,11\n66#1:229\n58#1:264\n58#1:160,8\n58#1:174,3\n66#1:197,8\n66#1:211,3\n89#1:218\n66#1:226,3\n97#1:231\n102#1:238\n104#1:245\n104#1:246\n110#1:253\n58#1:261,3\n58#1:168,6\n66#1:205,6\n66#1:180,6\n66#1:214\n66#1:230\n89#1:219,6\n97#1:232,6\n102#1:239,6\n104#1:247,6\n110#1:254,6\n97#1:266\n102#1:267\n102#1:268,2\n110#1:270\n110#1:271,2\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebPageInfo f53101OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53102OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(WebPageInfo webPageInfo, MutableState<Boolean> mutableState) {
            super(2);
            this.f53101OooO0Oo = webPageInfo;
            this.f53102OooO0o0 = mutableState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r2v18 */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2;
            Modifier.Companion companion;
            MutableState<Boolean> mutableState;
            int i;
            int i2;
            ?? r2;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer3.getSkipping()) {
                composer3.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1220101633, iIntValue, -1, "com.yalla.yalla.ui.dialog.RoomWebDialog.OnDialog.<anonymous> (RoomWebDialog.kt:55)");
                }
                Configuration configuration = (Configuration) composer3.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                WebPageInfo webPageInfo = this.f53101OooO0Oo;
                Dp dp = webPageInfo.f32828OooOOOo;
                float f = 24;
                Modifier modifierClip = ClipKt.clip(SizeKt.m509height3ABfNKs(modifierFillMaxWidth$default, dp != null ? dp.m3779unboximpl() : Dp.m3765constructorimpl(Dp.m3765constructorimpl(configuration.screenHeightDp) * 0.72f)), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 12, null));
                composer3.startReplaceableGroup(-483455358);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                boolean z = false;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion3, top, composer3, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClip);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(1794678366);
                boolean z2 = webPageInfo.f32821OooO0oo;
                MutableState<Boolean> mutableState2 = this.f53102OooO0o0;
                if (z2) {
                    float f2 = 56;
                    Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(f2, BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 12, null)), webPageInfo.f32827OooOOOO, null, 2, null), composer3, 733328855);
                    MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion3, false, composer3, 0, -1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer3);
                    Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                    if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.m1251Text4IGK_g(webPageInfo.f32820OooO0oO, PaddingKt.m478paddingVpY3zN4$default(boxScopeInstance.align(companion2, companion3.getCenter()), Dp.m3765constructorimpl(f2), 0.0f, 2, null), o000OOo.OooO0OO(composer3).f37701OooO, TextUnitKt.getSp(17), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 131056);
                    composer2 = composer3;
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icv_close, composer2, 0);
                    long j = o000OOo.OooO0OO(composer2).f37701OooO;
                    Alignment centerEnd = companion3.getCenterEnd();
                    companion = companion2;
                    Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(companion, centerEnd), 0.0f, 0.0f, Dp.m3765constructorimpl(16), 0.0f, 11, null), Dp.m3765constructorimpl(f));
                    i = 1157296644;
                    composer2.startReplaceableGroup(1157296644);
                    mutableState = mutableState2;
                    boolean zChanged = composer2.changed(mutableState);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new r2(mutableState);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    IconKt.m1103Iconww6aTOc(painterPainterResource, (String) null, PaddingKt.m476padding3ABfNKs(o0O0O00.OooO0O0(modifierM523size3ABfNKs, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), Dp.m3765constructorimpl(3)), j, composer2, 56, 0);
                    o000oOoO.OooO00o(composer2);
                    z = false;
                } else {
                    composer2 = composer3;
                    companion = companion2;
                    mutableState = mutableState2;
                    i = 1157296644;
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(i);
                boolean zChanged2 = composer2.changed(webPageInfo);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    i2 = 2;
                    MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(webPageInfo.OooO0O0(z), null, 2, null);
                    composer2.updateRememberedValue(mutableStateMutableStateOf$default);
                    objRememberedValue2 = mutableStateMutableStateOf$default;
                    r2 = 0;
                } else {
                    r2 = 0;
                    i2 = 2;
                }
                composer2.endReplaceableGroup();
                MutableState mutableState3 = (MutableState) objRememberedValue2;
                OooOOO0.OooO0OO("RoomWebDialog", "RoomWebDialog  url:  " + ((String) mutableState3.getValue()));
                o00OO0O0 o00oo0o0OooO0OO = o00O0OO.OooO0OO((String) mutableState3.getValue(), composer2);
                String str = (String) mutableState3.getValue();
                composer2.startReplaceableGroup(i);
                boolean zChanged3 = composer2.changed(str);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, r2, i2, r2);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState4 = (MutableState) objRememberedValue3;
                o00O0O0O o00o0o0oOooO00o = o00oo0o0OooO0OO.OooO00o();
                composer2.startReplaceableGroup(511388516);
                boolean zChanged4 = composer2.changed(o00oo0o0OooO0OO) | composer2.changed(mutableState4);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new s2(mutableState4, o00oo0o0OooO0OO, r2);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(o00o0o0oOooO00o, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 64);
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, i2, r2);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState5 = (MutableState) objRememberedValue5;
                EffectsKt.LaunchedEffect((Object) r2, new t2((LifecycleOwner) composer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), mutableState5, r2), composer2, 70);
                o0000Ooo.OooO0o0((ContentState) mutableState4.getValue(), false, SizeKt.fillMaxSize$default(companion, 0.0f, 1, r2), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 376366969, true, new w2(webPageInfo, o00oo0o0OooO0OO, mutableState5, mutableState)), composer2, 12583296, 122);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f53104OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ WebPageInfo f53105OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f53106OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(WebPageInfo webPageInfo, Function0<Unit> function0, int i) {
            super(2);
            this.f53105OooO0o0 = webPageInfo;
            this.f53104OooO0o = function0;
            this.f53106OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53106OooO0oO | 1);
            WebPageInfo webPageInfo = this.f53105OooO0o0;
            Function0<Unit> function0 = this.f53104OooO0o;
            q2.this.OooO00o(webPageInfo, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull WebPageInfo webPageInfo, @NotNull Function0<Unit> onDismiss, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(webPageInfo, "webPageInfo");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(2069071347);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2069071347, i, -1, "com.yalla.yalla.ui.dialog.RoomWebDialog.OnDialog (RoomWebDialog.kt:37)");
        }
        WebPageInfo webPageInfo2 = WebPageInfo.f32815OooOOo;
        if (Intrinsics.areEqual(webPageInfo, WebPageInfo.f32815OooOOo)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(webPageInfo, onDismiss, i));
            return;
        }
        WebFrom webFrom = webPageInfo.f32817OooO0Oo;
        if (webFrom == WebFrom.FaqRule) {
            composerStartRestartGroup.startReplaceableGroup(-302634333);
            webPageInfo.f32828OooOOOo = Dp.m3763boximpl(Dp.m3765constructorimpl(Dp.m3765constructorimpl(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp) * 0.68f));
            composerStartRestartGroup.endReplaceableGroup();
        } else if (webFrom == WebFrom.UserWealthLevel) {
            composerStartRestartGroup.startReplaceableGroup(-302634127);
            webPageInfo.f32828OooOOOo = Dp.m3763boximpl(Dp.m3765constructorimpl(Dp.m3765constructorimpl(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp) * 0.76f));
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-302633973);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(webPageInfo);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!StringsKt.isBlank(webPageInfo.f32819OooO0o0)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        int i2 = oO00Oo00.WindowAnimBottomWithAlpha;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(onDismiss);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new OooO0O0(onDismiss);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        p158o00OoOOO.OooOOO0.OooO00o(mutableState, false, false, null, (Function0) objRememberedValue2, 80, i2, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1220101633, true, new OooO0OO(webPageInfo, mutableState)), composerStartRestartGroup, 100663296, 142);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0o(webPageInfo, onDismiss, i));
    }
}
