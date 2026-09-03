package com.yalla.yalla.ui.fragment.message;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooOOO;
import androidx.compose.material.OooOOO0;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000Ooo;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.manager.SharedMessageVM;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p150o00Oo0oO.o00000OO;
import p411o0Oo0oO0.o000OOo;
import p469o0OoooOO.o0oO0O0o;
import p522o0o0OO0.o00Ooo;
import p522o0o0OO0.o00oO0o;
import p522o0o0OO0.o0OOO0o;
import p522o0o0OO0.o0ooOOo;
import p522o0o0OO0.oo000o;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMessageListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageListFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageListFragmentKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,388:1\n66#2,6:389\n72#2:423\n67#2,5:426\n72#2:459\n76#2:465\n76#2:470\n66#2,6:507\n72#2:541\n76#2:592\n66#2,6:605\n72#2:639\n76#2:693\n78#3,11:395\n78#3,11:431\n91#3:464\n91#3:469\n78#3,11:478\n78#3,11:513\n78#3,11:548\n91#3:586\n91#3:591\n91#3:596\n78#3,11:611\n78#3,11:646\n91#3:687\n91#3:692\n456#4,8:406\n464#4,3:420\n456#4,8:442\n464#4,3:456\n467#4,3:461\n467#4,3:466\n456#4,8:489\n464#4,3:503\n456#4,8:524\n464#4,3:538\n456#4,8:559\n464#4,3:573\n467#4,3:583\n467#4,3:588\n467#4,3:593\n36#4:598\n456#4,8:622\n464#4,3:636\n456#4,8:657\n464#4,3:671\n467#4,3:684\n467#4,3:689\n4144#5,6:414\n4144#5,6:450\n4144#5,6:497\n4144#5,6:532\n4144#5,6:567\n4144#5,6:630\n4144#5,6:665\n154#6:424\n154#6:425\n154#6:460\n154#6:577\n154#6:578\n154#6:579\n154#6:580\n154#6:581\n154#6:582\n154#6:675\n154#6:676\n154#6:677\n154#6:678\n154#6:679\n154#6:680\n154#6:681\n154#6:682\n154#6:683\n76#7:471\n73#8,6:472\n79#8:506\n83#8:597\n72#9,6:542\n78#9:576\n82#9:587\n72#9,6:640\n78#9:674\n82#9:688\n1097#10,6:599\n*S KotlinDebug\n*F\n+ 1 MessageListFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageListFragmentKt\n*L\n250#1:389,6\n250#1:423\n253#1:426,5\n253#1:459\n253#1:465\n250#1:470\n275#1:507,6\n275#1:541\n275#1:592\n339#1:605,6\n339#1:639\n339#1:693\n250#1:395,11\n253#1:431,11\n253#1:464\n250#1:469\n269#1:478,11\n275#1:513,11\n282#1:548,11\n282#1:586\n275#1:591\n269#1:596\n339#1:611,11\n346#1:646,11\n346#1:687\n339#1:692\n250#1:406,8\n250#1:420,3\n253#1:442,8\n253#1:456,3\n253#1:461,3\n250#1:466,3\n269#1:489,8\n269#1:503,3\n275#1:524,8\n275#1:538,3\n282#1:559,8\n282#1:573,3\n282#1:583,3\n275#1:588,3\n269#1:593,3\n342#1:598\n339#1:622,8\n339#1:636,3\n346#1:657,8\n346#1:671,3\n346#1:684,3\n339#1:689,3\n250#1:414,6\n253#1:450,6\n269#1:497,6\n275#1:532,6\n282#1:567,6\n339#1:630,6\n346#1:665,6\n256#1:424\n258#1:425\n260#1:460\n291#1:577\n295#1:578\n296#1:579\n297#1:580\n304#1:581\n305#1:582\n355#1:675\n358#1:676\n359#1:677\n360#1:678\n365#1:679\n366#1:680\n367#1:681\n374#1:682\n375#1:683\n267#1:471\n269#1:472,6\n269#1:506\n269#1:597\n282#1:542,6\n282#1:576\n282#1:587\n346#1:640,6\n346#1:674\n346#1:688\n342#1:599,6\n*E\n"})
public final class OooOO0 {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28555OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f28555OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28555OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28556OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f28557OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f28558OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28559OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f28560OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28561OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f28562OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f28563OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RowScope rowScope, int i, String str, int i2, boolean z, Function0<Unit> function0, int i3, int i4) {
            super(2);
            this.f28557OooO0Oo = rowScope;
            this.f28559OooO0o0 = i;
            this.f28558OooO0o = str;
            this.f28560OooO0oO = i2;
            this.f28561OooO0oo = z;
            this.f28556OooO = function0;
            this.f28562OooOO0 = i3;
            this.f28563OooOO0O = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOO0.OooO0O0(this.f28557OooO0Oo, this.f28559OooO0o0, this.f28558OooO0o, this.f28560OooO0oO, this.f28561OooO0oo, this.f28556OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28562OooOO0 | 1), this.f28563OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28564OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28564OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28564OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28564OooO0Oo;
        }

        public final int hashCode() {
            return this.f28564OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28564OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x037e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0386  */
    /* JADX WARN: Code duplicated, block: B:82:0x0389  */
    /* JADX WARN: Code duplicated, block: B:87:0x039c  */
    /* JADX WARN: Code duplicated, block: B:90:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:94:0x03bb  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(int i, int i2, @Nullable Composer composer, @Nullable Modifier modifier) {
        Modifier modifier2;
        int i3;
        int i4;
        Modifier modifier3;
        int i5;
        int i6;
        int iIntValue;
        Composer composer2;
        boolean z;
        LiveData<Integer> unreadMomentsMessageCount;
        State stateObserveAsState;
        int iIntValue2;
        Integer num;
        State stateObserveAsState2;
        Integer num2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-685210167);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-685210167, i, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContent (MessageListFragment.kt:265)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-2133658704);
            if (o000OOo.OooO0O0(composerStartRestartGroup)) {
                LiveData<Integer> unreadFriendRequestsMessageCount = SharedMessageVM.INSTANCE.getUnreadFriendRequestsMessageCount();
                Intrinsics.checkNotNull(unreadFriendRequestsMessageCount);
                i4 = (Integer) LiveDataAdapterKt.observeAsState(unreadFriendRequestsMessageCount, composerStartRestartGroup, 8).getValue();
            } else {
                i4 = 0;
            }
            Integer num3 = i4;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierThen = SizeKt.fillMaxWidth$default(BackgroundKt.m169backgroundbw27NRU$default(companion, o0oO0O0o.f46946OooO0O0, null, 2, null), 0.0f, 1, null).then(modifier4);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, start, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), false, false, 0L, false, null, null, null, oo000o.f53446OooO0Oo, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(arrangement, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO0O0, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.icon_new_friends_notice, composerStartRestartGroup, 0), (String) null, o0000Ooo.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(48)), num3, Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            modifier3 = modifier4;
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Friend_Requests, composerStartRestartGroup, 0), SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3120, 0, 65008);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            int i8 = oO00OOO.icon_new_message_activity;
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.subscription_activies_notice, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(118124789);
            if (o000OOo.OooO0O0(composerStartRestartGroup)) {
                LiveData<Integer> unreadActivityMessageCount = SharedMessageVM.INSTANCE.getUnreadActivityMessageCount();
                if (unreadActivityMessageCount == null) {
                    i5 = 8;
                    stateObserveAsState2 = null;
                } else {
                    i5 = 8;
                    stateObserveAsState2 = LiveDataAdapterKt.observeAsState(unreadActivityMessageCount, composerStartRestartGroup, 8);
                }
                if (stateObserveAsState2 != null && (num2 = (Integer) stateObserveAsState2.getValue()) != null) {
                    i6 = i5;
                    iIntValue = num2.intValue();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                OooO0O0(rowScopeInstance, i8, strStringResource, iIntValue, false, new o00oO0o(context), composerStartRestartGroup, 6, 8);
                int i9 = oO00OOO.icon_new_message_moment;
                String strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.moment_notifications, composer2, 0);
                composer2.startReplaceableGroup(118125218);
                if (o000OOo.OooO0O0(composer2)) {
                    unreadMomentsMessageCount = SharedMessageVM.INSTANCE.getUnreadMomentsMessageCount();
                    if (unreadMomentsMessageCount == null) {
                        stateObserveAsState = null;
                    } else {
                        stateObserveAsState = LiveDataAdapterKt.observeAsState(unreadMomentsMessageCount, composer2, i6);
                    }
                    if (stateObserveAsState != null || (num = (Integer) stateObserveAsState.getValue()) == null) {
                        iIntValue2 = 0;
                    } else {
                        iIntValue2 = num.intValue();
                    }
                    if (iIntValue2 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                composer2.endReplaceableGroup();
                OooO0O0(rowScopeInstance, i9, strStringResource2, 0, z, new o0ooOOo(context), composer2, 6, 4);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                i5 = 8;
            }
            i6 = i5;
            iIntValue = 0;
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            OooO0O0(rowScopeInstance, i8, strStringResource, iIntValue, false, new o00oO0o(context), composerStartRestartGroup, 6, 8);
            int i10 = oO00OOO.icon_new_message_moment;
            String strStringResource3 = StringResources_androidKt.stringResource(oO00OOo0.moment_notifications, composer2, 0);
            composer2.startReplaceableGroup(118125218);
            if (o000OOo.OooO0O0(composer2)) {
                z = true;
            } else {
                unreadMomentsMessageCount = SharedMessageVM.INSTANCE.getUnreadMomentsMessageCount();
                if (unreadMomentsMessageCount == null) {
                    stateObserveAsState = null;
                } else {
                    stateObserveAsState = LiveDataAdapterKt.observeAsState(unreadMomentsMessageCount, composer2, i6);
                }
                if (stateObserveAsState != null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            composer2.endReplaceableGroup();
            OooO0O0(rowScopeInstance, i10, strStringResource3, 0, z, new o0ooOOo(context), composer2, 6, 4);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(modifier3, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01db  */
    /* JADX WARN: Code duplicated, block: B:105:0x01df  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:113:0x031e  */
    /* JADX WARN: Code duplicated, block: B:118:0x032c  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:86:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x0157  */
    /* JADX WARN: Code duplicated, block: B:92:0x0163  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:96:0x0178  */
    /* JADX WARN: Code duplicated, block: B:98:0x0186  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(RowScope rowScope, int i, String str, int i2, boolean z, Function0<Unit> function0, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        boolean z3;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1309constructorimpl2;
        Function2 function2OooO00o2;
        int i13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2001425374);
        if ((i4 & Integer.MIN_VALUE) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 1) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 2) == 0) {
            if ((i3 & 896) == 0) {
                i5 |= composerStartRestartGroup.changed(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 7168) == 0) {
                    i7 = i2;
                    if (composerStartRestartGroup.changed(i7)) {
                        i8 = 2048;
                    } else {
                        i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 8;
                if (i9 != 0) {
                    if ((57344 & i3) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i5 |= i10;
                    }
                    if ((i4 & 16) != 0) {
                        if ((458752 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(function0)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                        }
                        if ((374491 & i5) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i6 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i7;
                            }
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierOooO00o = OooOO0O.OooO00o(rowScope, companion, 1.0f, false, 2, null);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function0);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new OooO00o(function0);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierOooO00o, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            constructor = companion3.getConstructor();
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
                            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyOooO0O0 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO0O0, composerM1309constructorimpl2, currentCompositionLocalMap2);
                            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            long sp = TextUnitKt.getSp(12);
                            TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                            if (o00000OO.OooO00o(composerStartRestartGroup)) {
                                ComposerKt.traceEventEnd();
                            }
                            i13 = i12;
                            z2 = z3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i13 = i7;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
                    }
                    i11 = 196608;
                    i5 |= i11;
                    if ((374491 & i5) == 74898) {
                        if (i6 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i7;
                        }
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                        }
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierOooO00o2 = OooOO0O.OooO00o(rowScope, companion4, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function0);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOooO0O1 = o0O0O00.OooO0O0(modifierOooO00o2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion5, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        constructor = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyOooO00o2, composerM1309constructorimpl, currentCompositionLocalMap3);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O1 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally2, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl2, measurePolicyOooO0O1, composerM1309constructorimpl2, currentCompositionLocalMap4);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion4, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        long sp2 = TextUnitKt.getSp(12);
                        TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion4, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                        if (o00000OO.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        i13 = i12;
                        z2 = z3;
                    } else {
                        if (i6 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i7;
                        }
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                        }
                        Modifier.Companion companion7 = Modifier.INSTANCE;
                        Modifier modifierOooO00o3 = OooOO0O.OooO00o(rowScope, companion7, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function0);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOooO0O2 = o0O0O00.OooO0O0(modifierOooO00o3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion8 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion8, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierOooO0O2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1309constructorimpl, measurePolicyOooO00o3, composerM1309constructorimpl, currentCompositionLocalMap5);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally3 = companion8.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O2 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally3, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion9, composerM1309constructorimpl2, measurePolicyOooO0O2, composerM1309constructorimpl2, currentCompositionLocalMap6);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion7, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        long sp3 = TextUnitKt.getSp(12);
                        TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion7, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                        if (o00000OO.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        i13 = i12;
                        z2 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
                }
                i5 |= 24576;
                z2 = z;
                if ((i4 & 16) != 0) {
                    if ((458752 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                    }
                    if ((374491 & i5) == 74898) {
                        if (i6 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i7;
                        }
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                        }
                        Modifier.Companion companion10 = Modifier.INSTANCE;
                        Modifier modifierOooO00o4 = OooOO0O.OooO00o(rowScope, companion10, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function0);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOooO0O3 = o0O0O00.OooO0O0(modifierOooO00o4, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion11 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o4 = p018OooOoo0.OooOOO.OooO00o(companion11, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                        constructor = companion12.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierOooO0O3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion12, composerM1309constructorimpl, measurePolicyOooO00o4, composerM1309constructorimpl, currentCompositionLocalMap7);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally4 = companion11.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O3 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally4, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion12.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion12, composerM1309constructorimpl2, measurePolicyOooO0O3, composerM1309constructorimpl2, currentCompositionLocalMap8);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion10, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        long sp4 = TextUnitKt.getSp(12);
                        TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion10, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                        if (o00000OO.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        i13 = i12;
                        z2 = z3;
                    } else {
                        if (i6 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i7;
                        }
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                        }
                        Modifier.Companion companion13 = Modifier.INSTANCE;
                        Modifier modifierOooO00o5 = OooOO0O.OooO00o(rowScope, companion13, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function0);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOooO0O4 = o0O0O00.OooO0O0(modifierOooO00o5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion14 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o5 = p018OooOoo0.OooOOO.OooO00o(companion14, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                        constructor = companion15.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierOooO0O4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1309constructorimpl, measurePolicyOooO00o5, composerM1309constructorimpl, currentCompositionLocalMap9);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally5 = companion14.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O4 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally5, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion15.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion15, composerM1309constructorimpl2, measurePolicyOooO0O4, composerM1309constructorimpl2, currentCompositionLocalMap10);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion13, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        long sp5 = TextUnitKt.getSp(12);
                        TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion13, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp5, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                        if (o00000OO.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        i13 = i12;
                        z2 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
                }
                i11 = 196608;
                i5 |= i11;
                if ((374491 & i5) == 74898) {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion16 = Modifier.INSTANCE;
                    Modifier modifierOooO00o6 = OooOO0O.OooO00o(rowScope, companion16, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O5 = o0O0O00.OooO0O0(modifierOooO00o6, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion17 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o6 = p018OooOoo0.OooOOO.OooO00o(companion17, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierOooO0O5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion18, composerM1309constructorimpl, measurePolicyOooO00o6, composerM1309constructorimpl, currentCompositionLocalMap11);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion16, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally6 = companion17.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O5 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally6, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion18, composerM1309constructorimpl2, measurePolicyOooO0O5, composerM1309constructorimpl2, currentCompositionLocalMap12);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion16, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp6 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion16, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp6, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                } else {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion19 = Modifier.INSTANCE;
                    Modifier modifierOooO00o7 = OooOO0O.OooO00o(rowScope, companion19, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O6 = o0O0O00.OooO0O0(modifierOooO00o7, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion110 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o7 = p018OooOoo0.OooOOO.OooO00o(companion110, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierOooO0O6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111, composerM1309constructorimpl, measurePolicyOooO00o7, composerM1309constructorimpl, currentCompositionLocalMap13);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion19, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally7 = companion110.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O6 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally7, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111, composerM1309constructorimpl2, measurePolicyOooO0O6, composerM1309constructorimpl2, currentCompositionLocalMap14);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion19, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp7 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion19, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
            }
            i5 |= 3072;
            i7 = i2;
            i9 = i4 & 8;
            if (i9 != 0) {
                if ((57344 & i3) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i5 |= i10;
                }
                if ((i4 & 16) != 0) {
                    if ((458752 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                    }
                    if ((374491 & i5) == 74898) {
                        if (i6 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i7;
                        }
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                        }
                        Modifier.Companion companion112 = Modifier.INSTANCE;
                        Modifier modifierOooO00o8 = OooOO0O.OooO00o(rowScope, companion112, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function0);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOooO0O7 = o0O0O00.OooO0O0(modifierOooO00o8, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion113 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o8 = p018OooOoo0.OooOOO.OooO00o(companion113, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                        constructor = companion114.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierOooO0O7);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion114, composerM1309constructorimpl, measurePolicyOooO00o8, composerM1309constructorimpl, currentCompositionLocalMap15);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion112, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally8 = companion113.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O7 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally8, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion114.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion114, composerM1309constructorimpl2, measurePolicyOooO0O7, composerM1309constructorimpl2, currentCompositionLocalMap16);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion112, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        long sp8 = TextUnitKt.getSp(12);
                        TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion112, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                        if (o00000OO.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        i13 = i12;
                        z2 = z3;
                    } else {
                        if (i6 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i7;
                        }
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                        }
                        Modifier.Companion companion115 = Modifier.INSTANCE;
                        Modifier modifierOooO00o9 = OooOO0O.OooO00o(rowScope, companion115, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function0);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOooO0O8 = o0O0O00.OooO0O0(modifierOooO00o9, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion116 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o9 = p018OooOoo0.OooOOO.OooO00o(companion116, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                        constructor = companion117.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierOooO0O8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion117, composerM1309constructorimpl, measurePolicyOooO00o9, composerM1309constructorimpl, currentCompositionLocalMap17);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf17, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion115, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally9 = companion116.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O8 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally9, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion117.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default9);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion117, composerM1309constructorimpl2, measurePolicyOooO0O8, composerM1309constructorimpl2, currentCompositionLocalMap18);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf18, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance9 = ColumnScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion115, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        long sp9 = TextUnitKt.getSp(12);
                        TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion115, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp9, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                        if (o00000OO.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        i13 = i12;
                        z2 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
                }
                i11 = 196608;
                i5 |= i11;
                if ((374491 & i5) == 74898) {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion118 = Modifier.INSTANCE;
                    Modifier modifierOooO00o10 = OooOO0O.OooO00o(rowScope, companion118, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O9 = o0O0O00.OooO0O0(modifierOooO00o10, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion119 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o10 = p018OooOoo0.OooOOO.OooO00o(companion119, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                    constructor = companion1110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierOooO0O9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1110, composerM1309constructorimpl, measurePolicyOooO00o10, composerM1309constructorimpl, currentCompositionLocalMap19);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf19, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(companion118, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally10 = companion119.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O9 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally10, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion1110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1110, composerM1309constructorimpl2, measurePolicyOooO0O9, composerM1309constructorimpl2, currentCompositionLocalMap110);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance10 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion118, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp10 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion118, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp10, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                } else {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion1111 = Modifier.INSTANCE;
                    Modifier modifierOooO00o11 = OooOO0O.OooO00o(rowScope, companion1111, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O10 = o0O0O00.OooO0O0(modifierOooO00o11, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion1112 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o11 = p018OooOoo0.OooOOO.OooO00o(companion1112, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
                    constructor = companion1113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierOooO0O10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1113, composerM1309constructorimpl, measurePolicyOooO00o11, composerM1309constructorimpl, currentCompositionLocalMap111);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(companion1111, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally11 = companion1112.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O10 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally11, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion1113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default11);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1113, composerM1309constructorimpl2, measurePolicyOooO0O10, composerM1309constructorimpl2, currentCompositionLocalMap112);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance11 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion1111, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp11 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion1111, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp11, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
            }
            i5 |= 24576;
            z2 = z;
            if ((i4 & 16) != 0) {
                if ((458752 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                }
                if ((374491 & i5) == 74898) {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion1114 = Modifier.INSTANCE;
                    Modifier modifierOooO00o12 = OooOO0O.OooO00o(rowScope, companion1114, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O11 = o0O0O00.OooO0O0(modifierOooO00o12, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion1115 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o12 = p018OooOoo0.OooOOO.OooO00o(companion1115, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1116 = ComposeUiNode.INSTANCE;
                    constructor = companion1116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierOooO0O11);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1116, composerM1309constructorimpl, measurePolicyOooO00o12, composerM1309constructorimpl, currentCompositionLocalMap113);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf113, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(companion1114, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally12 = companion1115.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O11 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally12, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion1116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1116, composerM1309constructorimpl2, measurePolicyOooO0O11, composerM1309constructorimpl2, currentCompositionLocalMap114);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf114, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance12 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion1114, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp12 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion1114, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp12, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                } else {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion1117 = Modifier.INSTANCE;
                    Modifier modifierOooO00o13 = OooOO0O.OooO00o(rowScope, companion1117, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O12 = o0O0O00.OooO0O0(modifierOooO00o13, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion1118 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o13 = p018OooOoo0.OooOOO.OooO00o(companion1118, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1119 = ComposeUiNode.INSTANCE;
                    constructor = companion1119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierOooO0O12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1119, composerM1309constructorimpl, measurePolicyOooO00o13, composerM1309constructorimpl, currentCompositionLocalMap115);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf115, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(companion1117, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally13 = companion1118.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O12 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally13, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion1119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default13);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1119, composerM1309constructorimpl2, measurePolicyOooO0O12, composerM1309constructorimpl2, currentCompositionLocalMap116);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf116, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance13 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion1117, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp13 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion1117, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp13, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
            }
            i11 = 196608;
            i5 |= i11;
            if ((374491 & i5) == 74898) {
                if (i6 != 0) {
                    i12 = 0;
                } else {
                    i12 = i7;
                }
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                }
                Modifier.Companion companion11110 = Modifier.INSTANCE;
                Modifier modifierOooO00o14 = OooOO0O.OooO00o(rowScope, companion11110, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O13 = o0O0O00.OooO0O0(modifierOooO00o14, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion11111 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o14 = p018OooOoo0.OooOOO.OooO00o(companion11111, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11112 = ComposeUiNode.INSTANCE;
                constructor = companion11112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierOooO0O13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11112, composerM1309constructorimpl, measurePolicyOooO00o14, composerM1309constructorimpl, currentCompositionLocalMap117);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf117, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(companion11110, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally14 = companion11111.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O13 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally14, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion11112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default14);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11112, composerM1309constructorimpl2, measurePolicyOooO0O13, composerM1309constructorimpl2, currentCompositionLocalMap118);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf118, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance14 = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion11110, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                long sp14 = TextUnitKt.getSp(12);
                TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion11110, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp14, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                if (o00000OO.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                z2 = z3;
            } else {
                if (i6 != 0) {
                    i12 = 0;
                } else {
                    i12 = i7;
                }
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                }
                Modifier.Companion companion11113 = Modifier.INSTANCE;
                Modifier modifierOooO00o15 = OooOO0O.OooO00o(rowScope, companion11113, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O14 = o0O0O00.OooO0O0(modifierOooO00o15, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion11114 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o15 = p018OooOoo0.OooOOO.OooO00o(companion11114, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11115 = ComposeUiNode.INSTANCE;
                constructor = companion11115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierOooO0O14);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11115, composerM1309constructorimpl, measurePolicyOooO00o15, composerM1309constructorimpl, currentCompositionLocalMap119);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf119, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(companion11113, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally15 = companion11114.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O14 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally15, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion11115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11115, composerM1309constructorimpl2, measurePolicyOooO0O14, composerM1309constructorimpl2, currentCompositionLocalMap1110);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance15 = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion11113, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                long sp15 = TextUnitKt.getSp(12);
                TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion11113, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp15, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                if (o00000OO.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                z2 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
        }
        i5 |= 384;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 7168) == 0) {
                i7 = i2;
                if (composerStartRestartGroup.changed(i7)) {
                    i8 = 2048;
                } else {
                    i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i5 |= i8;
            }
            i9 = i4 & 8;
            if (i9 != 0) {
                if ((57344 & i3) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i5 |= i10;
                }
                if ((i4 & 16) != 0) {
                    if ((458752 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                    }
                    if ((374491 & i5) == 74898) {
                        if (i6 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i7;
                        }
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                        }
                        Modifier.Companion companion11116 = Modifier.INSTANCE;
                        Modifier modifierOooO00o16 = OooOO0O.OooO00o(rowScope, companion11116, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function0);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOooO0O15 = o0O0O00.OooO0O0(modifierOooO00o16, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion11117 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o16 = p018OooOoo0.OooOOO.OooO00o(companion11117, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion11118 = ComposeUiNode.INSTANCE;
                        constructor = companion11118.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierOooO0O15);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11118, composerM1309constructorimpl, measurePolicyOooO00o16, composerM1309constructorimpl, currentCompositionLocalMap1111);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default16 = SizeKt.fillMaxWidth$default(companion11116, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally16 = companion11117.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O15 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally16, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion11118.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1112 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default16);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11118, composerM1309constructorimpl2, measurePolicyOooO0O15, composerM1309constructorimpl2, currentCompositionLocalMap1112);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance16 = ColumnScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion11116, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        long sp16 = TextUnitKt.getSp(12);
                        TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion11116, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp16, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                        if (o00000OO.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        i13 = i12;
                        z2 = z3;
                    } else {
                        if (i6 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i7;
                        }
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                        }
                        Modifier.Companion companion11119 = Modifier.INSTANCE;
                        Modifier modifierOooO00o17 = OooOO0O.OooO00o(rowScope, companion11119, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function0);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOooO0O16 = o0O0O00.OooO0O0(modifierOooO00o17, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion111110 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o17 = p018OooOoo0.OooOOO.OooO00o(companion111110, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion111111 = ComposeUiNode.INSTANCE;
                        constructor = companion111111.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1113 = LayoutKt.modifierMaterializerOf(modifierOooO0O16);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111111, composerM1309constructorimpl, measurePolicyOooO00o17, composerM1309constructorimpl, currentCompositionLocalMap1113);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1113, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default17 = SizeKt.fillMaxWidth$default(companion11119, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally17 = companion111110.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO0O16 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally17, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion111111.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1114 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default17);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111111, composerM1309constructorimpl2, measurePolicyOooO0O16, composerM1309constructorimpl2, currentCompositionLocalMap1114);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1114, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance17 = ColumnScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion11119, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        long sp17 = TextUnitKt.getSp(12);
                        TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion11119, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp17, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                        if (o00000OO.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        i13 = i12;
                        z2 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
                }
                i11 = 196608;
                i5 |= i11;
                if ((374491 & i5) == 74898) {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion111112 = Modifier.INSTANCE;
                    Modifier modifierOooO00o18 = OooOO0O.OooO00o(rowScope, companion111112, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O17 = o0O0O00.OooO0O0(modifierOooO00o18, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion111113 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o18 = p018OooOoo0.OooOOO.OooO00o(companion111113, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111114 = ComposeUiNode.INSTANCE;
                    constructor = companion111114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1115 = LayoutKt.modifierMaterializerOf(modifierOooO0O17);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111114, composerM1309constructorimpl, measurePolicyOooO00o18, composerM1309constructorimpl, currentCompositionLocalMap1115);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1115, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default18 = SizeKt.fillMaxWidth$default(companion111112, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally18 = companion111113.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O17 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally18, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion111114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1116 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default18);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111114, composerM1309constructorimpl2, measurePolicyOooO0O17, composerM1309constructorimpl2, currentCompositionLocalMap1116);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1116, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance18 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion111112, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp18 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion111112, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp18, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                } else {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion111115 = Modifier.INSTANCE;
                    Modifier modifierOooO00o19 = OooOO0O.OooO00o(rowScope, companion111115, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O18 = o0O0O00.OooO0O0(modifierOooO00o19, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion111116 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o19 = p018OooOoo0.OooOOO.OooO00o(companion111116, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111117 = ComposeUiNode.INSTANCE;
                    constructor = companion111117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1117 = LayoutKt.modifierMaterializerOf(modifierOooO0O18);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111117, composerM1309constructorimpl, measurePolicyOooO00o19, composerM1309constructorimpl, currentCompositionLocalMap1117);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1117, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default19 = SizeKt.fillMaxWidth$default(companion111115, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally19 = companion111116.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O18 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally19, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion111117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1118 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default19);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111117, composerM1309constructorimpl2, measurePolicyOooO0O18, composerM1309constructorimpl2, currentCompositionLocalMap1118);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1118, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance19 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion111115, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp19 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion111115, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp19, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
            }
            i5 |= 24576;
            z2 = z;
            if ((i4 & 16) != 0) {
                if ((458752 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                }
                if ((374491 & i5) == 74898) {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion111118 = Modifier.INSTANCE;
                    Modifier modifierOooO00o110 = OooOO0O.OooO00o(rowScope, companion111118, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O19 = o0O0O00.OooO0O0(modifierOooO00o110, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion111119 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o110 = p018OooOoo0.OooOOO.OooO00o(companion111119, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1111110 = ComposeUiNode.INSTANCE;
                    constructor = companion1111110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1119 = LayoutKt.modifierMaterializerOf(modifierOooO0O19);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111110, composerM1309constructorimpl, measurePolicyOooO00o110, composerM1309constructorimpl, currentCompositionLocalMap1119);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1119, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default110 = SizeKt.fillMaxWidth$default(companion111118, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally110 = companion111119.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O19 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally110, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion1111110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11110 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default110);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111110, composerM1309constructorimpl2, measurePolicyOooO0O19, composerM1309constructorimpl2, currentCompositionLocalMap11110);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance110 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion111118, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp110 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion111118, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp110, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                } else {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion1111111 = Modifier.INSTANCE;
                    Modifier modifierOooO00o111 = OooOO0O.OooO00o(rowScope, companion1111111, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O110 = o0O0O00.OooO0O0(modifierOooO00o111, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion1111112 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o111 = p018OooOoo0.OooOOO.OooO00o(companion1111112, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1111113 = ComposeUiNode.INSTANCE;
                    constructor = companion1111113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11111 = LayoutKt.modifierMaterializerOf(modifierOooO0O110);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111113, composerM1309constructorimpl, measurePolicyOooO00o111, composerM1309constructorimpl, currentCompositionLocalMap11111);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default111 = SizeKt.fillMaxWidth$default(companion1111111, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally111 = companion1111112.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O110 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally111, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion1111113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11112 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default111);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111113, composerM1309constructorimpl2, measurePolicyOooO0O110, composerM1309constructorimpl2, currentCompositionLocalMap11112);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance111 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion1111111, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp111 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion1111111, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp111, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
            }
            i11 = 196608;
            i5 |= i11;
            if ((374491 & i5) == 74898) {
                if (i6 != 0) {
                    i12 = 0;
                } else {
                    i12 = i7;
                }
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                }
                Modifier.Companion companion1111114 = Modifier.INSTANCE;
                Modifier modifierOooO00o112 = OooOO0O.OooO00o(rowScope, companion1111114, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O111 = o0O0O00.OooO0O0(modifierOooO00o112, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion1111115 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o112 = p018OooOoo0.OooOOO.OooO00o(companion1111115, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1111116 = ComposeUiNode.INSTANCE;
                constructor = companion1111116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11113 = LayoutKt.modifierMaterializerOf(modifierOooO0O111);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111116, composerM1309constructorimpl, measurePolicyOooO00o112, composerM1309constructorimpl, currentCompositionLocalMap11113);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11113, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default112 = SizeKt.fillMaxWidth$default(companion1111114, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally112 = companion1111115.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O111 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally112, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion1111116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11114 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default112);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111116, composerM1309constructorimpl2, measurePolicyOooO0O111, composerM1309constructorimpl2, currentCompositionLocalMap11114);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11114, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance112 = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion1111114, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                long sp112 = TextUnitKt.getSp(12);
                TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion1111114, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp112, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                if (o00000OO.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                z2 = z3;
            } else {
                if (i6 != 0) {
                    i12 = 0;
                } else {
                    i12 = i7;
                }
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                }
                Modifier.Companion companion1111117 = Modifier.INSTANCE;
                Modifier modifierOooO00o113 = OooOO0O.OooO00o(rowScope, companion1111117, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O112 = o0O0O00.OooO0O0(modifierOooO00o113, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion1111118 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o113 = p018OooOoo0.OooOOO.OooO00o(companion1111118, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1111119 = ComposeUiNode.INSTANCE;
                constructor = companion1111119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11115 = LayoutKt.modifierMaterializerOf(modifierOooO0O112);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111119, composerM1309constructorimpl, measurePolicyOooO00o113, composerM1309constructorimpl, currentCompositionLocalMap11115);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11115, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default113 = SizeKt.fillMaxWidth$default(companion1111117, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally113 = companion1111118.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O112 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally113, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion1111119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11116 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default113);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111119, composerM1309constructorimpl2, measurePolicyOooO0O112, composerM1309constructorimpl2, currentCompositionLocalMap11116);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11116, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance113 = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion1111117, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                long sp113 = TextUnitKt.getSp(12);
                TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion1111117, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp113, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                if (o00000OO.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                z2 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
        }
        i5 |= 3072;
        i7 = i2;
        i9 = i4 & 8;
        if (i9 != 0) {
            if ((57344 & i3) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i5 |= i10;
            }
            if ((i4 & 16) != 0) {
                if ((458752 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                }
                if ((374491 & i5) == 74898) {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion11111110 = Modifier.INSTANCE;
                    Modifier modifierOooO00o114 = OooOO0O.OooO00o(rowScope, companion11111110, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O113 = o0O0O00.OooO0O0(modifierOooO00o114, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion11111111 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o114 = p018OooOoo0.OooOOO.OooO00o(companion11111111, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11111112 = ComposeUiNode.INSTANCE;
                    constructor = companion11111112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11117 = LayoutKt.modifierMaterializerOf(modifierOooO0O113);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11111112, composerM1309constructorimpl, measurePolicyOooO00o114, composerM1309constructorimpl, currentCompositionLocalMap11117);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11117, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default114 = SizeKt.fillMaxWidth$default(companion11111110, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally114 = companion11111111.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O113 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally114, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion11111112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11118 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11111112, composerM1309constructorimpl2, measurePolicyOooO0O113, composerM1309constructorimpl2, currentCompositionLocalMap11118);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11118, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance114 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion11111110, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp114 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion11111110, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp114, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                } else {
                    if (i6 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i7;
                    }
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                    }
                    Modifier.Companion companion11111113 = Modifier.INSTANCE;
                    Modifier modifierOooO00o115 = OooOO0O.OooO00o(rowScope, companion11111113, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function0);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O114 = o0O0O00.OooO0O0(modifierOooO00o115, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion11111114 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o115 = p018OooOoo0.OooOOO.OooO00o(companion11111114, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11111115 = ComposeUiNode.INSTANCE;
                    constructor = companion11111115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11119 = LayoutKt.modifierMaterializerOf(modifierOooO0O114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11111115, composerM1309constructorimpl, measurePolicyOooO00o115, composerM1309constructorimpl, currentCompositionLocalMap11119);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11119, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default115 = SizeKt.fillMaxWidth$default(companion11111113, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally115 = companion11111114.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O114 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally115, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion11111115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111110 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default115);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11111115, composerM1309constructorimpl2, measurePolicyOooO0O114, composerM1309constructorimpl2, currentCompositionLocalMap111110);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance115 = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion11111113, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    long sp115 = TextUnitKt.getSp(12);
                    TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion11111113, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp115, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                    if (o00000OO.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    z2 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
            }
            i11 = 196608;
            i5 |= i11;
            if ((374491 & i5) == 74898) {
                if (i6 != 0) {
                    i12 = 0;
                } else {
                    i12 = i7;
                }
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                }
                Modifier.Companion companion11111116 = Modifier.INSTANCE;
                Modifier modifierOooO00o116 = OooOO0O.OooO00o(rowScope, companion11111116, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O115 = o0O0O00.OooO0O0(modifierOooO00o116, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion11111117 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o116 = p018OooOoo0.OooOOO.OooO00o(companion11111117, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11111118 = ComposeUiNode.INSTANCE;
                constructor = companion11111118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111111 = LayoutKt.modifierMaterializerOf(modifierOooO0O115);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11111118, composerM1309constructorimpl, measurePolicyOooO00o116, composerM1309constructorimpl, currentCompositionLocalMap111111);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default116 = SizeKt.fillMaxWidth$default(companion11111116, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally116 = companion11111117.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O115 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally116, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion11111118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111112 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11111118, composerM1309constructorimpl2, measurePolicyOooO0O115, composerM1309constructorimpl2, currentCompositionLocalMap111112);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance116 = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion11111116, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                long sp116 = TextUnitKt.getSp(12);
                TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion11111116, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp116, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                if (o00000OO.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                z2 = z3;
            } else {
                if (i6 != 0) {
                    i12 = 0;
                } else {
                    i12 = i7;
                }
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                }
                Modifier.Companion companion11111119 = Modifier.INSTANCE;
                Modifier modifierOooO00o117 = OooOO0O.OooO00o(rowScope, companion11111119, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O116 = o0O0O00.OooO0O0(modifierOooO00o117, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion111111110 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o117 = p018OooOoo0.OooOOO.OooO00o(companion111111110, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111111111 = ComposeUiNode.INSTANCE;
                constructor = companion111111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111113 = LayoutKt.modifierMaterializerOf(modifierOooO0O116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111111111, composerM1309constructorimpl, measurePolicyOooO00o117, composerM1309constructorimpl, currentCompositionLocalMap111113);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111113, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default117 = SizeKt.fillMaxWidth$default(companion11111119, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally117 = companion111111110.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O116 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally117, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion111111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111114 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default117);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111111111, composerM1309constructorimpl2, measurePolicyOooO0O116, composerM1309constructorimpl2, currentCompositionLocalMap111114);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111114, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance117 = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion11111119, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                long sp117 = TextUnitKt.getSp(12);
                TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion11111119, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp117, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                if (o00000OO.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                z2 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
        }
        i5 |= 24576;
        z2 = z;
        if ((i4 & 16) != 0) {
            if ((458752 & i3) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
            }
            if ((374491 & i5) == 74898) {
                if (i6 != 0) {
                    i12 = 0;
                } else {
                    i12 = i7;
                }
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                }
                Modifier.Companion companion111111112 = Modifier.INSTANCE;
                Modifier modifierOooO00o118 = OooOO0O.OooO00o(rowScope, companion111111112, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O117 = o0O0O00.OooO0O0(modifierOooO00o118, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion111111113 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o118 = p018OooOoo0.OooOOO.OooO00o(companion111111113, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111111114 = ComposeUiNode.INSTANCE;
                constructor = companion111111114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111115 = LayoutKt.modifierMaterializerOf(modifierOooO0O117);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111111114, composerM1309constructorimpl, measurePolicyOooO00o118, composerM1309constructorimpl, currentCompositionLocalMap111115);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111115, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default118 = SizeKt.fillMaxWidth$default(companion111111112, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally118 = companion111111113.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O117 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally118, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion111111114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111116 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default118);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111111114, composerM1309constructorimpl2, measurePolicyOooO0O117, composerM1309constructorimpl2, currentCompositionLocalMap111116);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111116, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance118 = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion111111112, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                long sp118 = TextUnitKt.getSp(12);
                TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion111111112, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp118, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                if (o00000OO.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                z2 = z3;
            } else {
                if (i6 != 0) {
                    i12 = 0;
                } else {
                    i12 = i7;
                }
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
                }
                Modifier.Companion companion111111115 = Modifier.INSTANCE;
                Modifier modifierOooO00o119 = OooOO0O.OooO00o(rowScope, companion111111115, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function0);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O118 = o0O0O00.OooO0O0(modifierOooO00o119, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion111111116 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o119 = p018OooOoo0.OooOOO.OooO00o(companion111111116, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111111117 = ComposeUiNode.INSTANCE;
                constructor = companion111111117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111117 = LayoutKt.modifierMaterializerOf(modifierOooO0O118);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111111117, composerM1309constructorimpl, measurePolicyOooO00o119, composerM1309constructorimpl, currentCompositionLocalMap111117);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111117, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default119 = SizeKt.fillMaxWidth$default(companion111111115, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally119 = companion111111116.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O118 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally119, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion111111117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111118 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default119);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111111117, composerM1309constructorimpl2, measurePolicyOooO0O118, composerM1309constructorimpl2, currentCompositionLocalMap111118);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111118, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance119 = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion111111115, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                long sp119 = TextUnitKt.getSp(12);
                TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion111111115, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp119, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
                if (o00000OO.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                z2 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
        }
        i11 = 196608;
        i5 |= i11;
        if ((374491 & i5) == 74898) {
            if (i6 != 0) {
                i12 = 0;
            } else {
                i12 = i7;
            }
            if (i9 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
            }
            Modifier.Companion companion111111118 = Modifier.INSTANCE;
            Modifier modifierOooO00o1110 = OooOO0O.OooO00o(rowScope, companion111111118, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O119 = o0O0O00.OooO0O0(modifierOooO00o1110, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion111111119 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o1110 = p018OooOoo0.OooOOO.OooO00o(companion111111119, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111111110 = ComposeUiNode.INSTANCE;
            constructor = companion1111111110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111119 = LayoutKt.modifierMaterializerOf(modifierOooO0O119);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111111110, composerM1309constructorimpl, measurePolicyOooO00o1110, composerM1309constructorimpl, currentCompositionLocalMap111119);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111119, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default1110 = SizeKt.fillMaxWidth$default(companion111111118, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally1110 = companion111111119.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O119 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally1110, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion1111111110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111110 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default1110);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111111110, composerM1309constructorimpl2, measurePolicyOooO0O119, composerM1309constructorimpl2, currentCompositionLocalMap1111110);
            if (composerM1309constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance1110 = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion111111118, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            long sp1110 = TextUnitKt.getSp(12);
            TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion111111118, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp1110, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
            if (o00000OO.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            i13 = i12;
            z2 = z3;
        } else {
            if (i6 != 0) {
                i12 = 0;
            } else {
                i12 = i7;
            }
            if (i9 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2001425374, i5, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContentItem (MessageListFragment.kt:337)");
            }
            Modifier.Companion companion1111111111 = Modifier.INSTANCE;
            Modifier modifierOooO00o1111 = OooOO0O.OooO00o(rowScope, companion1111111111, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function0);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O1110 = o0O0O00.OooO0O0(modifierOooO00o1111, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion1111111112 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o1111 = p018OooOoo0.OooOOO.OooO00o(companion1111111112, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111111113 = ComposeUiNode.INSTANCE;
            constructor = companion1111111113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111111 = LayoutKt.modifierMaterializerOf(modifierOooO0O1110);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111111113, composerM1309constructorimpl, measurePolicyOooO00o1111, composerM1309constructorimpl, currentCompositionLocalMap1111111);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default1111 = SizeKt.fillMaxWidth$default(companion1111111111, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally1111 = companion1111111112.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O1110 = OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally1111, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion1111111113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111112 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default1111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111111113, composerM1309constructorimpl2, measurePolicyOooO0O1110, composerM1309constructorimpl2, currentCompositionLocalMap1111112);
            if (composerM1309constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance1111 = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i5 >> 3) & 14), (String) null, o0000Ooo.OooO0O0(o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion1111111111, Dp.m3765constructorimpl(48)), z3, 0L, Dp.m3765constructorimpl(4), false, false, Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(0), 0.0f, 826), Integer.valueOf(i12), Dp.m3765constructorimpl(8), false, false, 0L, Dp.m3765constructorimpl(36), Dp.m3765constructorimpl(-3), 0.0f, 15980), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            long sp1111 = TextUnitKt.getSp(12);
            TextKt.m1251Text4IGK_g(str, SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion1111111111, 0.0f, Dp.m3765constructorimpl(6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(90)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, sp1111, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, ((i5 >> 6) & 14) | 3120, 0, 65008);
            if (o00000OO.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            i13 = i12;
            z2 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, i, str, i13, z2, function0, i3, i4));
    }

    public static final void OooO0OO(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1634517144);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1634517144, i, -1, "com.yalla.yalla.ui.fragment.message.MessageListTopContainer (MessageListFragment.kt:248)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            oOOOOo0O.f56683OooO00o.OooO00o(64, 1, composerStartRestartGroup, null);
            Alignment centerStart = companion2.getCenterStart();
            float f = 15;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m477paddingVpY3zN4(companion, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(8)), 0.0f, 1, null);
            float fM3765constructorimpl = Dp.m3765constructorimpl(12);
            RoundedCornerShape roundedCornerShapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f));
            long j = o0oO0O0o.f46969OooOoO0;
            Modifier modifierM1348shadows4CzXII$default = ShadowKt.m1348shadows4CzXII$default(modifierFillMaxWidth$default2, fM3765constructorimpl, roundedCornerShapeM727RoundedCornerShape0680j_4, false, j, j, 4, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM1348shadows4CzXII$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            OooO00o(6, 0, composerStartRestartGroup, PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(16), 0.0f, Dp.m3765constructorimpl(11), 5, null));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(i));
    }
}
