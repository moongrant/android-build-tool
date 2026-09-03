package p533o0o0Oo0;

import android.content.Context;
import android.graphics.drawable.NinePatchDrawable;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p155o00OoO0o.OooOO0O;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomHereGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomHereGuide.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomHereGuideKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,144:1\n25#2:145\n25#2:152\n36#2:162\n25#2:169\n36#2:176\n1097#3,6:146\n1097#3,6:153\n1097#3,6:163\n1097#3,6:170\n1097#3,6:177\n76#4:159\n1#5:160\n154#6:161\n81#7:183\n81#7:187\n107#7,2:188\n81#7:190\n75#8:184\n108#8,2:185\n*S KotlinDebug\n*F\n+ 1 LiveRoomHereGuide.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomHereGuideKt\n*L\n56#1:145\n57#1:152\n69#1:162\n79#1:169\n102#1:176\n56#1:146,6\n57#1:153,6\n69#1:163,6\n79#1:170,6\n102#1:177,6\n61#1:159\n61#1:161\n54#1:183\n57#1:187\n57#1:188,2\n79#1:190\n56#1:184\n56#1:185,2\n*E\n"})
public final class o0O0O00 {

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.room.live.LiveRoomHereGuideKt$LiveRoomHereGuidePop$1$1", f = "LiveRoomHereGuide.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f54806OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54807OooO0o0;

        /* JADX INFO: renamed from: o0o0Oo0.o0O0O00$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.screen.room.live.LiveRoomHereGuideKt$LiveRoomHereGuidePop$1$1$1", f = "LiveRoomHereGuide.kt", i = {}, l = {71, 72}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0504OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f54808OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54809OooO0o0;

            /* JADX INFO: renamed from: o0o0Oo0.o0O0O00$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.ui.screen.room.live.LiveRoomHereGuideKt$LiveRoomHereGuidePop$1$1$1$1", f = "LiveRoomHereGuide.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0505OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ MutableState<Boolean> f54810OooO0Oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0505OooO00o(MutableState<Boolean> mutableState, Continuation<? super C0505OooO00o> continuation) {
                    super(2, continuation);
                    this.f54810OooO0Oo = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0505OooO00o(this.f54810OooO0Oo, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0505OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    this.f54810OooO0Oo.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0504OooO00o(MutableState<Boolean> mutableState, Continuation<? super C0504OooO00o> continuation) {
                super(2, continuation);
                this.f54809OooO0o0 = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0504OooO00o(this.f54809OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0504OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f54808OooO0Oo;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.f54808OooO0Oo = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0505OooO00o c0505OooO00o = new C0505OooO00o(this.f54809OooO0o0, null);
                this.f54808OooO0Oo = 2;
                if (BuildersKt.withContext(main, c0505OooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f54807OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f54807OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54806OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0504OooO00o c0504OooO00o = new C0504OooO00o(this.f54807OooO0o0, null);
                this.f54806OooO0Oo = 1;
                if (BuildersKt.withContext(io2, c0504OooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54811OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<Boolean> mutableState) {
            super(0);
            this.f54811OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54811OooO0Oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomHereGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomHereGuide.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomHereGuideKt$LiveRoomHereGuidePop$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,144:1\n154#2:145\n154#2:146\n154#2:147\n154#2:199\n83#3,3:148\n36#3:157\n456#3,8:181\n464#3,3:195\n467#3,3:200\n1097#4,6:151\n1097#4,6:158\n66#5,6:164\n72#5:198\n76#5:204\n78#6,11:170\n91#6:203\n4144#7,6:189\n*S KotlinDebug\n*F\n+ 1 LiveRoomHereGuide.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomHereGuideKt$LiveRoomHereGuidePop$3\n*L\n109#1:145\n111#1:146\n112#1:147\n138#1:199\n113#1:148,3\n120#1:157\n106#1:181,8\n106#1:195,3\n106#1:200,3\n113#1:151,6\n120#1:158,6\n106#1:164,6\n106#1:198\n106#1:204\n106#1:170,11\n106#1:203\n106#1:189,6\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<NinePatchDrawable> f54812OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54813OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f54814OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f54815OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f54816OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f54817OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, MutableFloatState mutableFloatState, float f, boolean z2, int i, MutableState<NinePatchDrawable> mutableState) {
            super(2);
            this.f54813OooO0Oo = z;
            this.f54815OooO0o0 = mutableFloatState;
            this.f54814OooO0o = f;
            this.f54816OooO0oO = z2;
            this.f54817OooO0oo = i;
            this.f54812OooO = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600024175, iIntValue, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomHereGuidePop.<anonymous> (LiveRoomHereGuide.kt:104)");
                }
                boolean z = this.f54813OooO0Oo;
                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.m530widthInVpY3zN4$default(z ? PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(7), 0.0f, 11, null) : Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(TextFieldImplKt.AnimationDuration), 1, null), Dp.m3765constructorimpl(33));
                Object[] objArr = {Boolean.valueOf(z), this.f54815OooO0o0, Float.valueOf(this.f54814OooO0o), Boolean.valueOf(this.f54816OooO0oO), Integer.valueOf(this.f54817OooO0oo)};
                boolean z2 = this.f54813OooO0Oo;
                float f = this.f54814OooO0o;
                boolean z3 = this.f54816OooO0oO;
                int i = this.f54817OooO0oo;
                MutableFloatState mutableFloatState = this.f54815OooO0o0;
                composer2.startReplaceableGroup(-568225417);
                boolean zChanged = false;
                for (int i2 = 0; i2 < 5; i2++) {
                    zChanged |= composer2.changed(objArr[i2]);
                }
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new o000OOo(z2, f, z3, i, mutableFloatState);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM509height3ABfNKs, (Function1) objRememberedValue);
                composer2.startReplaceableGroup(1157296644);
                MutableState<NinePatchDrawable> mutableState = this.f54812OooO;
                boolean zChanged2 = composer2.changed(mutableState);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new o000000(mutableState);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierOnSizeChanged, (Function1) objRememberedValue2);
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierDrawBehind);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                float f2 = 15;
                TextKt.m1251Text4IGK_g(o0000.OooO0OO(oO00OOo0.video_im_here_tip), PaddingKt.m480paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, companion.getTopCenter()), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(7), Dp.m3765constructorimpl(f2), 0.0f, 8, null), o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3072, 3120, 55280);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0O f54818OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54819OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54820OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54821OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(oo0O oo0o, int i, int i2, int i3) {
            super(2);
            this.f54818OooO0Oo = oo0o;
            this.f54820OooO0o0 = i;
            this.f54819OooO0o = i2;
            this.f54821OooO0oO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54821OooO0oO | 1);
            int i = this.f54820OooO0o0;
            int i2 = this.f54819OooO0o;
            o0O0O00.OooO00o(this.f54818OooO0Oo, i, i2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull oo0O micInfo, int i, int i2, @Nullable Composer composer, int i3) {
        int i4;
        List listListOf;
        List listListOf2;
        Intrinsics.checkNotNullParameter(micInfo, "micInfo");
        Composer composerStartRestartGroup = composer.startRestartGroup(929308319);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(929308319, i3, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomHereGuidePop (LiveRoomHereGuide.kt:48)");
        }
        State stateCollectAsState = SnapshotStateKt.collectAsState(micInfo.f54838OooO0OO, null, composerStartRestartGroup, 8, 1);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue2;
        if (((Number) stateCollectAsState.getValue()).longValue() <= 0) {
            mutableState.setValue(Boolean.FALSE);
        }
        float fMo324toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(Dp.m3765constructorimpl(0));
        int i5 = micInfo.f54836OooO00o;
        boolean z = i5 == 0 || i5 == 5;
        boolean z2 = i5 == 4 || i5 == 9;
        if (z) {
            mutableFloatState.setFloatValue(fMo324toPx0680j_4);
        }
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooO00o(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 70);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                Context contextOooO00o = o000O0.OooO00o();
                int i6 = oO00OOO.ic_room_here_pop_bg;
                if (z) {
                    listListOf2 = CollectionsKt.listOf(new OooOO0O(121, 58));
                } else {
                    if (z2) {
                        listListOf2 = CollectionsKt.listOf(new OooOO0O(32, 58));
                    } else {
                        i4 = 1;
                        listListOf = CollectionsKt.listOf((Object[]) new OooOO0O[]{new OooOO0O(32, 58), new OooOO0O(121, 58)});
                    }
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(p155o00OoO0o.OooOO0.OooO00o(contextOooO00o, i6, listListOf, CollectionsKt.listOf(new OooOO0O(42, i4))), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                listListOf = listListOf2;
                i4 = 1;
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(p155o00OoO0o.OooOO0.OooO00o(contextOooO00o, i6, listListOf, CollectionsKt.listOf(new OooOO0O(42, i4))), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue4;
            long jIntOffset = IntOffsetKt.IntOffset((int) mutableFloatState.getFloatValue(), i2);
            PopupProperties popupProperties = new PopupProperties(false, false, false, null, false, true, 24, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new OooO0O0(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidPopup_androidKt.m4004PopupK5zGePQ(null, jIntOffset, (Function0) objRememberedValue5, popupProperties, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1600024175, true, new OooO0OO(z2, mutableFloatState, fMo324toPx0680j_4, z, i, mutableState2)), composerStartRestartGroup, 27648, 1);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(micInfo, i, i2, i3));
    }
}
