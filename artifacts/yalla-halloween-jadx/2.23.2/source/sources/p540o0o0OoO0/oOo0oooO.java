package p540o0o0OoO0;

import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOo;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.IconKt;
import androidx.compose.material.OooOO0O;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O0OO0;
import p207o00o0oO0.o000O0Oo;
import p454o0Ooo000.OooOo00;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o00OOOOo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLiveEnterPasswordDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveEnterPasswordDialog.kt\ncom/yalla/yalla/ui/dialog/room/RoomLiveEnterPasswordDialog\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,401:1\n25#2:402\n25#2:409\n36#2:416\n25#2:423\n25#2:430\n456#2,8:454\n464#2,3:468\n467#2,3:472\n456#2,8:494\n464#2,3:508\n467#2,3:512\n456#2,8:534\n464#2,3:548\n467#2,3:552\n456#2,8:574\n464#2,3:588\n467#2,3:592\n1097#3,6:403\n1097#3,6:410\n1097#3,6:417\n1097#3,6:424\n1097#3,6:431\n154#4:437\n154#4:477\n154#4:517\n154#4:557\n67#5,5:438\n72#5:471\n76#5:476\n67#5,5:478\n72#5:511\n76#5:516\n67#5,5:518\n72#5:551\n76#5:556\n67#5,5:558\n72#5:591\n76#5:596\n78#6,11:443\n91#6:475\n78#6,11:483\n91#6:515\n78#6,11:523\n91#6:555\n78#6,11:563\n91#6:595\n4144#7,6:462\n4144#7,6:502\n4144#7,6:542\n4144#7,6:582\n81#8:597\n107#8,2:598\n81#8:600\n107#8,2:601\n81#8:603\n107#8,2:604\n*S KotlinDebug\n*F\n+ 1 RoomLiveEnterPasswordDialog.kt\ncom/yalla/yalla/ui/dialog/room/RoomLiveEnterPasswordDialog\n*L\n77#1:402\n78#1:409\n79#1:416\n84#1:423\n85#1:430\n306#1:454,8\n306#1:468,3\n306#1:472,3\n331#1:494,8\n331#1:508,3\n331#1:512,3\n354#1:534,8\n354#1:548,3\n354#1:552,3\n379#1:574,8\n379#1:588,3\n379#1:592,3\n77#1:403,6\n78#1:410,6\n79#1:417,6\n84#1:424,6\n85#1:431,6\n310#1:437\n335#1:477\n358#1:517\n383#1:557\n306#1:438,5\n306#1:471\n306#1:476\n331#1:478,5\n331#1:511\n331#1:516\n354#1:518,5\n354#1:551\n354#1:556\n379#1:558,5\n379#1:591\n379#1:596\n306#1:443,11\n306#1:475\n331#1:483,11\n331#1:515\n354#1:523,11\n354#1:555\n379#1:563,11\n379#1:595\n306#1:462,6\n331#1:502,6\n354#1:542,6\n379#1:582,6\n78#1:597\n78#1:598,2\n84#1:600\n84#1:601,2\n85#1:603\n85#1:604,2\n*E\n"})
public final class oOo0oooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOo0oooO f55031OooO00o = new oOo0oooO();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55033OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f55033OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55033OooO0o0 | 1);
            oOo0oooO.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog$OnDialog$1$1", f = "RoomLiveEnterPasswordDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f55034OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<String> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f55034OooO0Oo = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f55034OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            if (Intrinsics.areEqual(com.yalla.yalla.service.room.OooO00o.OooO0OO(), com.yalla.yalla.service.room.OooO0OO.AbstractC0317OooO0OO.OooO00o.f24591OooO00o)) {
                this.f55034OooO0Oo.setValue("");
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomLiveEnterPasswordDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveEnterPasswordDialog.kt\ncom/yalla/yalla/ui/dialog/room/RoomLiveEnterPasswordDialog$OnDialog$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,401:1\n66#2,6:402\n72#2:436\n76#2:534\n78#3,11:408\n78#3,11:494\n91#3:528\n91#3:533\n78#3,11:543\n91#3:577\n456#4,8:419\n464#4,3:433\n25#4:437\n36#4:444\n50#4:452\n49#4:453\n50#4:460\n49#4:461\n36#4:468\n67#4,3:478\n66#4:481\n456#4,8:505\n464#4,3:519\n467#4,3:525\n467#4,3:530\n456#4,8:554\n464#4,3:568\n467#4,3:574\n36#4:582\n4144#5,6:427\n4144#5,6:513\n4144#5,6:562\n1097#6,6:438\n1097#6,6:445\n1097#6,6:454\n1097#6,6:462\n1097#6,6:469\n1097#6,6:482\n1097#6,6:583\n154#7:451\n164#7:475\n154#7:476\n154#7:477\n154#7:523\n154#7:524\n154#7:535\n154#7:536\n154#7:572\n154#7:573\n154#7:579\n154#7:580\n154#7:581\n73#8,6:488\n79#8:522\n83#8:529\n73#8,6:537\n79#8:571\n83#8:578\n*S KotlinDebug\n*F\n+ 1 RoomLiveEnterPasswordDialog.kt\ncom/yalla/yalla/ui/dialog/room/RoomLiveEnterPasswordDialog$OnDialog$2\n*L\n92#1:402,6\n92#1:436\n92#1:534\n92#1:408,11\n131#1:494,11\n131#1:528\n92#1:533\n159#1:543,11\n159#1:577\n92#1:419,8\n92#1:433,3\n95#1:437\n105#1:444\n100#1:452\n100#1:453\n120#1:460\n120#1:461\n126#1:468\n138#1:478,3\n138#1:481\n131#1:505,8\n131#1:519,3\n131#1:525,3\n92#1:530,3\n159#1:554,8\n159#1:568,3\n159#1:574,3\n202#1:582\n92#1:427,6\n131#1:513,6\n159#1:562,6\n95#1:438,6\n105#1:445,6\n100#1:454,6\n120#1:462,6\n126#1:469,6\n138#1:482,6\n202#1:583,6\n115#1:451\n133#1:475\n135#1:476\n137#1:477\n148#1:523\n150#1:524\n156#1:535\n158#1:536\n167#1:572\n169#1:573\n177#1:579\n200#1:580\n201#1:581\n131#1:488,6\n131#1:522\n131#1:529\n159#1:537,6\n159#1:571\n159#1:578\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f55035OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55036OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55037OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
            super(3);
            this.f55035OooO0Oo = mutableState;
            this.f55037OooO0o0 = mutableState2;
            this.f55036OooO0o = mutableState3;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            long j;
            Modifier modifier;
            Composer composer2;
            boolean z;
            long j2;
            ColumnScope TextDialog = columnScope;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer3.changed(TextDialog) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer3.getSkipping()) {
                composer3.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-202826242, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog.OnDialog.<anonymous> (RoomLiveEnterPasswordDialog.kt:91)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Modifier modifierAlign = TextDialog.align(companion, companion2.getCenterHorizontally());
                composer3.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer3, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer3);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer3.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue == companion4.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceableGroup();
                FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                MutableState<String> mutableState = this.f55035OooO0Oo;
                String value = mutableState.getValue();
                composer3.startReplaceableGroup(1157296644);
                boolean zChanged = composer3.changed(mutableState);
                Object objRememberedValue2 = composer3.rememberedValue();
                if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                    objRememberedValue2 = new oO0O0Oo0(mutableState);
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                composer3.endReplaceableGroup();
                KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue2, null, null, null, null, null, 62, null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m3527getNumberPasswordPjHm6EE(), ImeAction.INSTANCE.m3478getDoneeUduSuo(), 3, null);
                Modifier modifierAlpha = AlphaKt.alpha(FocusRequesterModifierKt.focusRequester(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(1)), focusRequester), 0.0f);
                composer3.startReplaceableGroup(511388516);
                boolean zChanged2 = composer3.changed(mutableState);
                MutableState<Boolean> mutableState2 = this.f55037OooO0o0;
                boolean zChanged3 = zChanged2 | composer3.changed(mutableState2);
                Object objRememberedValue3 = composer3.rememberedValue();
                if (zChanged3 || objRememberedValue3 == companion4.getEmpty()) {
                    objRememberedValue3 = new oOo0o0oO(mutableState, mutableState2);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                composer3.endReplaceableGroup();
                BasicTextFieldKt.BasicTextField(value, (Function1<? super String, Unit>) objRememberedValue3, modifierAlpha, false, false, (TextStyle) null, keyboardOptions, keyboardActions, true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer3, 907542528, 0, 64568);
                SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composer3, LocalSoftwareKeyboardController.$stable);
                Unit unit = Unit.INSTANCE;
                composer3.startReplaceableGroup(511388516);
                boolean zChanged4 = composer3.changed(focusRequester) | composer3.changed(current);
                Object objRememberedValue4 = composer3.rememberedValue();
                if (zChanged4 || objRememberedValue4 == companion4.getEmpty()) {
                    objRememberedValue4 = new ooOOO0Oo(focusRequester, current, null);
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                composer3.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer3, 70);
                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                com.yalla.yalla.service.room.OooO0OO OooO0OO2 = com.yalla.yalla.service.room.OooO00o.OooO0OO();
                composer3.startReplaceableGroup(1157296644);
                boolean zChanged5 = composer3.changed(mutableState2);
                Object objRememberedValue5 = composer3.rememberedValue();
                if (zChanged5 || objRememberedValue5 == companion4.getEmpty()) {
                    objRememberedValue5 = new ooOOO00O(mutableState2, null);
                    composer3.updateRememberedValue(objRememberedValue5);
                }
                composer3.endReplaceableGroup();
                EffectsKt.LaunchedEffect(OooO0OO2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer3, 64);
                float fM3775constructorimpl = Dp.m3775constructorimpl((float) 0.5d);
                if (mutableState2.getValue().booleanValue()) {
                    composer3.startReplaceableGroup(-1186904617);
                    j = o0000oo.OooO0OO(composer3).f38623OooO0oO;
                } else {
                    composer3.startReplaceableGroup(-1186904597);
                    j = o0000oo.OooO0OO(composer3).f38621OooO0o;
                }
                composer3.endReplaceableGroup();
                float f = 45;
                Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(f, BorderKt.m182borderxT4_qwU(companion, fM3775constructorimpl, j, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(4))), composer3, 1618982084);
                MutableState<Boolean> mutableState3 = this.f55036OooO0o;
                boolean zChanged6 = composer3.changed(mutableState3) | composer3.changed(focusRequester) | composer3.changed(current);
                Object objRememberedValue6 = composer3.rememberedValue();
                if (zChanged6 || objRememberedValue6 == companion4.getEmpty()) {
                    objRememberedValue6 = new ooo0o(focusRequester, current, mutableState3);
                    composer3.updateRememberedValue(objRememberedValue6);
                }
                composer3.endReplaceableGroup();
                Modifier modifierOooO0O1 = o0O0O00.OooO0O0(modifierOooO0O0, false, false, 0L, false, null, null, null, (Function0) objRememberedValue6, 253);
                composer3.startReplaceableGroup(693286680);
                int i = 0;
                MeasurePolicy measurePolicyOooO00o2 = OooOO0O.OooO00o(companion2, Arrangement.INSTANCE.getStart(), composer3, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer3);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-1186904191);
                int i2 = 0;
                for (int i3 = 4; i2 < i3; i3 = 4) {
                    int i4 = i2;
                    ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.icon_room_lock_password, composer3, i), (String) null, PaddingKt.m478padding3ABfNKs(AlphaKt.alpha(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(f)), mutableState.getValue().length() > i2 ? 1.0f : 0.0f), Dp.m3775constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                    if (i4 < 3) {
                        if (mutableState2.getValue().booleanValue()) {
                            composer3.startReplaceableGroup(-1719983759);
                            j2 = o0000oo.OooO0OO(composer3).f38623OooO0oO;
                        } else {
                            composer3.startReplaceableGroup(-1719983739);
                            j2 = o0000oo.OooO0OO(composer3).f38621OooO0o;
                        }
                        composer3.endReplaceableGroup();
                        o00OOOOo.OooO0O0(null, 0.0f, j2, composer3, 0, 3);
                    }
                    i2 = i4 + 1;
                    i = 0;
                }
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                float f2 = 12;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composer3, 6, 2);
                composer3.startReplaceableGroup(-1204502480);
                if (mutableState2.getValue().booleanValue()) {
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), null, composer3, 6, 2);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion5.getCenterVertically();
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierAlign2 = TextDialog.align(companion6, companion5.getCenterHorizontally());
                    composer3.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composer3, 48, -1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign2);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer3);
                    Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl3, measurePolicyOooO0O0, composerM1320constructorimpl3, currentCompositionLocalMap3);
                    if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer3)), composer3, 2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.icon_error_red, composer3, 0);
                    long j3 = o0OOo000.f48245o000OO0O;
                    IconKt.m1119Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m525size3ABfNKs(companion6, Dp.m3775constructorimpl(f2)), j3, composer3, 440, 0);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composer3, 6, 2);
                    z = false;
                    modifier = null;
                    composer2 = composer3;
                    TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.dialog_error_tips, composer3, 0), (Modifier) null, j3, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                    o0ooOOo.OooO00o(composer2);
                } else {
                    modifier = null;
                    composer2 = composer3;
                    z = false;
                }
                composer2.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f2), modifier, composer2, 6, r10);
                ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                boolean zAreEqual = Intrinsics.areEqual(com.yalla.yalla.service.room.OooO00o.OooO0OO(), com.yalla.yalla.service.room.OooO0OO.AbstractC0317OooO0OO.OooO0O0.f24592OooO00o);
                if (mutableState.getValue().length() >= 4) {
                    z = true;
                }
                boolean z2 = z;
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1206005227, true, new oO0OO00(zAreEqual));
                TextButtonStyle textButtonStyle = z2 ? TextButtonStyle.Green : TextButtonStyle.GreyDisable;
                float f3 = 36;
                Modifier modifierOooO00o = OooOo00.OooO00o(f3, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, modifier), Dp.m3775constructorimpl(f3)), 0.0f, 2, modifier, composer2, 1157296644);
                boolean zChanged7 = composer2.changed(mutableState);
                Object objRememberedValue7 = composer2.rememberedValue();
                if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new oO0OO0O(mutableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                o00O0OO0.OooO0O0(composableLambda, textButtonStyle, null, null, null, 0.0f, null, z2, false, 0L, false, null, null, null, null, modifierOooO00o, (Function0) objRememberedValue7, composer2, 6, 196608, 32636);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f55038OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
            p429o0OoOO.o0Oo0oo.OooO00o();
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomLiveEnterPasswordDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveEnterPasswordDialog.kt\ncom/yalla/yalla/ui/dialog/room/RoomLiveEnterPasswordDialog$OnDialog$4\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,401:1\n81#2,11:402\n76#3:413\n25#4:414\n456#4,8:439\n464#4,3:453\n456#4,8:474\n464#4,3:488\n50#4:497\n49#4:498\n456#4,8:519\n464#4,3:533\n467#4,3:538\n467#4,3:543\n467#4,3:548\n1097#5,6:415\n1097#5,6:499\n154#6:421\n154#6:492\n154#6:493\n154#6:494\n154#6:495\n154#6:496\n154#6:505\n154#6:537\n72#7,6:422\n78#7:456\n82#7:552\n78#8,11:428\n78#8,11:463\n78#8,11:508\n91#8:541\n91#8:546\n91#8:551\n4144#9,6:447\n4144#9,6:482\n4144#9,6:527\n66#10,6:457\n72#10:491\n76#10:547\n77#11,2:506\n79#11:536\n83#11:542\n81#12:553\n107#12,2:554\n81#12:556\n*S KotlinDebug\n*F\n+ 1 RoomLiveEnterPasswordDialog.kt\ncom/yalla/yalla/ui/dialog/room/RoomLiveEnterPasswordDialog$OnDialog$4\n*L\n211#1:402,11\n212#1:413\n213#1:414\n220#1:439,8\n220#1:453,3\n226#1:474,8\n226#1:488,3\n260#1:497\n260#1:498\n256#1:519,8\n256#1:533,3\n256#1:538,3\n226#1:543,3\n220#1:548,3\n213#1:415,6\n260#1:499,6\n223#1:421\n235#1:492\n238#1:493\n240#1:494\n241#1:495\n251#1:496\n266#1:505\n272#1:537\n220#1:422,6\n220#1:456\n220#1:552\n220#1:428,11\n226#1:463,11\n256#1:508,11\n256#1:541\n226#1:546\n220#1:551\n220#1:447,6\n226#1:482,6\n256#1:527,6\n226#1:457,6\n226#1:491\n226#1:547\n256#1:506,2\n256#1:536\n256#1:542\n213#1:553\n213#1:554,2\n281#1:556\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55039OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableState<Boolean> mutableState) {
            super(3);
            this.f55039OooO0Oo = mutableState;
        }

        /* JADX WARN: Code duplicated, block: B:78:0x043f  */
        /* JADX WARN: Code duplicated, block: B:83:0x0464  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            ColumnScope TextDialog = columnScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1745262394, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog.OnDialog.<anonymous> (RoomLiveEnterPasswordDialog.kt:210)");
                }
                composer2.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(RoomFollowAndJoinCheckVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
                composer2.endReplaceableGroup();
                RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM = (RoomFollowAndJoinCheckVM) viewModel;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                EffectsKt.LaunchedEffect(Long.valueOf(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0()), new oO0Oo0o0(roomFollowAndJoinCheckVM, lifecycleOwner, mutableState, null), composer2, 64);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f = 16;
                Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 3, null));
                long j = o0OOo000.f48270o000o0Oo;
                Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(modifierClip, j, null, 2, null);
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion3, top, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                composer2.startReplaceableGroup(-1186899963);
                MutableState<Boolean> mutableState2 = this.f55039OooO0Oo;
                long j2 = oOo0oooO.OooO0OO(mutableState2) ? j : o0000oo.OooO0OO(composer2).f38622OooO0o0;
                composer2.endReplaceableGroup();
                Modifier modifierM171backgroundbw27NRU$default2 = BackgroundKt.m171backgroundbw27NRU$default(modifierFillMaxWidth$default, j2, null, 2, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-390940388);
                if (oOo0oooO.OooO0OO(mutableState2)) {
                    BoxKt.Box(ShadowKt.m1359shadows4CzXII$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 13, null), companion3.getBottomCenter()), 0.0f, 1, null), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(2), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 3, null), true, 0L, 0L, 24, null), composer2, 0);
                    BoxKt.Box(BackgroundKt.m170backgroundbw27NRU(boxScopeInstance.matchParentSize(companion2), o0000oo.OooO0OO(composer2).f38622OooO0o0, RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 3, null)), composer2, 0);
                }
                composer2.endReplaceableGroup();
                SoftwareKeyboardController current2 = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composer2, LocalSoftwareKeyboardController.$stable);
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                Modifier modifierAlign = boxScopeInstance.align(companion2, companion3.getCenter());
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(mutableState2) | composer2.changed(current2);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new oO0o0000(current2, mutableState2);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(modifierAlign, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(15), 7, null);
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy, composerM1320constructorimpl3, currentCompositionLocalMap3);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.password_dialog_more_features, composer2, 0), (Modifier) null, o0000oo.OooO0OO(composer2).f38626OooOO0O, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(3), null, composer2, 6, 2);
                IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.icon_password_dialog_bottom, composer2, 0), (String) null, (Modifier) null, o0000oo.OooO0OO(composer2).f38626OooOO0O, composer2, 56, 4);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(-1204496282);
                if (oOo0oooO.OooO0OO(mutableState2)) {
                    State stateObserveAsState = LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24545OooOO0O, Boolean.FALSE, composer2, 56);
                    boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    oOo0oooO ooo0oooo = oOo0oooO.f55031OooO00o;
                    if (zBooleanValue) {
                        composer2.startReplaceableGroup(-1186897071);
                        oOo0oooO.OooO0o0(ooo0oooo, roomFollowAndJoinCheckVM, lifecycleOwner, composer2, 448);
                        o00OOOOo.OooO00o(null, 0.0f, 0L, composer2, 0, 7);
                        oOo0oooO.OooO0Oo(ooo0oooo, roomFollowAndJoinCheckVM, lifecycleOwner, composer2, 448);
                        composer2.endReplaceableGroup();
                    } else if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        Boolean bool = (Boolean) stateObserveAsState.getValue();
                        Intrinsics.checkNotNullExpressionValue(bool, "invoke$lambda$7$lambda$6(...)");
                        if (bool.booleanValue()) {
                            composer2.startReplaceableGroup(-1186896787);
                            oOo0oooO.OooO0o(ooo0oooo, roomFollowAndJoinCheckVM, lifecycleOwner, composer2, 448);
                            composer2.endReplaceableGroup();
                        } else if (!((Boolean) mutableState.getValue()).booleanValue() || ((Boolean) stateObserveAsState.getValue()).booleanValue()) {
                            composer2.startReplaceableGroup(-1186896503);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1186896625);
                            oOo0oooO.OooO0O0(ooo0oooo, roomFollowAndJoinCheckVM, lifecycleOwner, composer2, 448);
                            composer2.endReplaceableGroup();
                        }
                    } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer2.startReplaceableGroup(-1186896503);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1186896503);
                        composer2.endReplaceableGroup();
                    }
                }
                if (OooOo.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0O0(oOo0oooO ooo0oooo, RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM, LifecycleOwner lifecycleOwner, Composer composer, int i) {
        ooo0oooo.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-504414813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-504414813, i, -1, "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog.FollowBottom (RoomLiveEnterPasswordDialog.kt:304)");
        }
        Alignment center = Alignment.INSTANCE.getCenter();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(50)), false, false, 0L, false, null, null, null, new oO0O0O00(roomFollowAndJoinCheckVM, lifecycleOwner), 253);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.password_dialog_Follow_room, composerStartRestartGroup, 0), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0O0O0o(ooo0oooo, roomFollowAndJoinCheckVM, lifecycleOwner, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean OooO0OO(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void OooO0Oo(oOo0oooO ooo0oooo, RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM, LifecycleOwner lifecycleOwner, Composer composer, int i) {
        ooo0oooo.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-3194277);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-3194277, i, -1, "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog.UnJoinAndUnFollowButton (RoomLiveEnterPasswordDialog.kt:377)");
        }
        Alignment center = Alignment.INSTANCE.getCenter();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(50)), false, false, 0L, false, null, null, null, new oOo00o00(roomFollowAndJoinCheckVM, lifecycleOwner), 253);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.password_dialog_UnJoin_unFollow, composerStartRestartGroup, 0), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO(ooo0oooo, roomFollowAndJoinCheckVM, lifecycleOwner, i));
    }

    public static final void OooO0o(oOo0oooO ooo0oooo, RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM, LifecycleOwner lifecycleOwner, Composer composer, int i) {
        ooo0oooo.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-170766269);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-170766269, i, -1, "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog.UnfollowButton (RoomLiveEnterPasswordDialog.kt:329)");
        }
        Alignment center = Alignment.INSTANCE.getCenter();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(50)), false, false, 0L, false, null, null, null, new oOO00(roomFollowAndJoinCheckVM, lifecycleOwner), 253);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.password_dialog_unFollow_Room, composerStartRestartGroup, 0), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOO00O0(ooo0oooo, roomFollowAndJoinCheckVM, lifecycleOwner, i));
    }

    public static final void OooO0o0(oOo0oooO ooo0oooo, RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM, LifecycleOwner lifecycleOwner, Composer composer, int i) {
        ooo0oooo.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1444791268);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1444791268, i, -1, "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog.UnJoinButton (RoomLiveEnterPasswordDialog.kt:352)");
        }
        Alignment center = Alignment.INSTANCE.getCenter();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(50)), false, false, 0L, false, null, null, null, new oOO0000(roomFollowAndJoinCheckVM, lifecycleOwner), 253);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.password_dialog_unJoin_room, composerStartRestartGroup, 0), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOO000(ooo0oooo, roomFollowAndJoinCheckVM, lifecycleOwner, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(631370889);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(631370889, i, -1, "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog.OnDialog (RoomLiveEnterPasswordDialog.kt:75)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            com.yalla.yalla.service.room.OooO0OO OooO0OO2 = com.yalla.yalla.service.room.OooO00o.OooO0OO();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooO00o(mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(OooO0OO2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 64);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(mutableState, StringResources_androidKt.stringResource(o000000.dialog_lock_tips, composerStartRestartGroup, 0), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -202826242, true, new OooO0O0(mutableState2, (MutableState) objRememberedValue5, mutableState3)), true, false, OooO0OO.f55038OooO0Oo, null, null, false, null, false, null, null, false, false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1745262394, true, new OooO0o(mutableState3)), null, composer2, 1797126, 100663296, 786308);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i));
    }
}
