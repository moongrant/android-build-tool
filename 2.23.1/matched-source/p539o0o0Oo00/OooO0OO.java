package p539o0o0Oo00;

import android.app.Activity;
import android.text.TextUtils;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
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
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.qiniu.android.storage.Configuration;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.zego.zegoavkit2.ZegoConstants;
import io.agora.rtc.Constants;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o00Ooo;
import p477o0Ooooo0.o0O0o;
import p519o0o0O0O.o00OO000;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentContentUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentContentUtils.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentContentUtilsKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,485:1\n1098#2:486\n927#2,6:487\n1098#2:672\n76#3:493\n76#3:534\n76#3:588\n50#4:494\n49#4:495\n50#4:502\n49#4:503\n25#4:510\n83#4,3:517\n50#4:526\n49#4:527\n36#4:535\n36#4:542\n50#4:549\n49#4:550\n25#4:557\n83#4,3:564\n25#4:573\n25#4:580\n67#4,3:590\n66#4:593\n456#4,8:617\n464#4,3:631\n36#4:635\n50#4:642\n49#4:643\n83#4,3:650\n467#4,3:659\n36#4:665\n1097#5,6:496\n1097#5,6:504\n1097#5,6:511\n1097#5,6:520\n1097#5,6:528\n1097#5,6:536\n1097#5,6:543\n1097#5,6:551\n1097#5,6:558\n1097#5,6:567\n1097#5,6:574\n1097#5,3:581\n1100#5,3:585\n1097#5,6:594\n1097#5,6:636\n1097#5,6:644\n1097#5,6:653\n1097#5,6:666\n154#6:584\n154#6:589\n154#6:664\n72#7,6:600\n78#7:634\n82#7:663\n78#8,11:606\n91#8:662\n4144#9,6:625\n81#10:673\n81#10:674\n107#10,2:675\n81#10:680\n81#10:681\n107#10,2:682\n81#10:684\n107#10,2:685\n75#11:677\n108#11,2:678\n*S KotlinDebug\n*F\n+ 1 MomentContentUtils.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentContentUtilsKt\n*L\n80#1:486\n166#1:487,6\n463#1:672\n259#1:493\n325#1:534\n358#1:588\n261#1:494\n261#1:495\n272#1:502\n272#1:503\n276#1:510\n277#1:517,3\n308#1:526\n308#1:527\n327#1:535\n328#1:542\n329#1:549\n329#1:550\n333#1:557\n334#1:564,3\n354#1:573\n357#1:580\n369#1:590,3\n369#1:593\n361#1:617,8\n361#1:631,3\n408#1:635\n414#1:642\n414#1:643\n429#1:650,3\n361#1:659,3\n455#1:665\n261#1:496,6\n272#1:504,6\n276#1:511,6\n277#1:520,6\n308#1:528,6\n327#1:536,6\n328#1:543,6\n329#1:551,6\n333#1:558,6\n334#1:567,6\n354#1:574,6\n357#1:581,3\n357#1:585,3\n369#1:594,6\n408#1:636,6\n414#1:644,6\n429#1:653,6\n455#1:666,6\n357#1:584\n363#1:589\n454#1:664\n361#1:600,6\n361#1:634\n361#1:663\n361#1:606,11\n361#1:662\n361#1:625,6\n261#1:673\n327#1:674\n327#1:675,2\n329#1:680\n354#1:681\n354#1:682,2\n357#1:684\n357#1:685,2\n328#1:677\n328#1:678,2\n*E\n"})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f54306OooO00o = LazyKt.lazy(o000oOoO.f54378OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, InlineTextContent> f54307OooO0O0 = new HashMap<>();

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.utils.MomentContentUtilsKt$MomentRichText$pressIndicator$1$1", f = "MomentContentUtils.kt", i = {}, l = {278}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54308OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f54309OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f54310OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f54311OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<AnnotatedString> f54312OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextLayoutResult> f54313OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f54314OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f54315OooOO0O;

        public static final class OooO00o extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function1<String, Unit> f54316OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MutableState<AnnotatedString> f54317OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(Function1<? super String, Unit> function1, MutableState<AnnotatedString> mutableState) {
                super(1);
                this.f54316OooO0Oo = function1;
                this.f54317OooO0o0 = mutableState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                offset.getPackedValue();
                Function1<String, Unit> function1 = this.f54316OooO0Oo;
                if (function1 != null) {
                    Lazy lazy = OooO0OO.f54306OooO00o;
                    function1.invoke(this.f54317OooO0o0.getValue().getText());
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<TextLayoutResult> f54318OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MutableState<AnnotatedString> f54319OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f54320OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ boolean f54321OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ boolean f54322OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(MutableState<TextLayoutResult> mutableState, Function0<Unit> function0, MutableState<AnnotatedString> mutableState2, boolean z, boolean z2) {
                super(1);
                this.f54318OooO0Oo = mutableState;
                this.f54320OooO0o0 = function0;
                this.f54319OooO0o = mutableState2;
                this.f54321OooO0oO = z;
                this.f54322OooO0oo = z2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                long packedValue = offset.getPackedValue();
                TextLayoutResult value = this.f54318OooO0Oo.getValue();
                if (value != null) {
                    int iM3292getOffsetForPositionk4lQ0M = value.m3292getOffsetForPositionk4lQ0M(packedValue);
                    Lazy lazy = OooO0OO.f54306OooO00o;
                    AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) this.f54319OooO0o.getValue().getStringAnnotations(iM3292getOffsetForPositionk4lQ0M, iM3292getOffsetForPositionk4lQ0M));
                    if (range == null || this.f54321OooO0oO || !Intrinsics.areEqual(range.getTag(), "userId") || this.f54322OooO0oo) {
                        this.f54320OooO0o0.invoke();
                    } else {
                        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26776Oooo0o, activityOooO0O0, (String) range.getItem(), false, 12);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(Function1<? super String, Unit> function1, MutableState<AnnotatedString> mutableState, MutableState<TextLayoutResult> mutableState2, Function0<Unit> function0, boolean z, boolean z2, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f54310OooO0o = function1;
            this.f54312OooO0oO = mutableState;
            this.f54313OooO0oo = mutableState2;
            this.f54308OooO = function0;
            this.f54314OooOO0 = z;
            this.f54315OooOO0O = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f54310OooO0o, this.f54312OooO0oO, this.f54313OooO0oo, this.f54308OooO, this.f54314OooOO0, this.f54315OooOO0O, continuation);
            oooO.f54311OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54309OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f54311OooO0o0;
                OooO00o oooO00o = new OooO00o(this.f54310OooO0o, this.f54312OooO0oO);
                OooO0O0 oooO0O0 = new OooO0O0(this.f54313OooO0oo, this.f54308OooO, this.f54312OooO0oO, this.f54314OooOO0, this.f54315OooOO0O);
                this.f54309OooO0Oo = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, oooO00o, null, oooO0O0, this, 5, null) == coroutine_suspended) {
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

    public static final class OooO00o extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54323OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult it = textLayoutResult;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.utils.MomentContentUtilsKt$MomentRichText$2$1", f = "MomentContentUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f54324OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<AnnotatedString> f54325OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState mutableState, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f54324OooO0Oo = function1;
            this.f54325OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f54325OooO0o0, this.f54324OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Function1<String, Unit> function1 = this.f54324OooO0Oo;
            if (function1 != null) {
                Lazy lazy = OooO0OO.f54306OooO00o;
                function1.invoke(this.f54325OooO0o0.getValue().toString());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0o0Oo00.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0483OooO0OO extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextLayoutResult> f54326OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<TextLayoutResult, Unit> f54327OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0483OooO0OO(MutableState<TextLayoutResult> mutableState, Function1<? super TextLayoutResult, Unit> function1) {
            super(1);
            this.f54326OooO0Oo = mutableState;
            this.f54327OooO0o0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult it = textLayoutResult;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f54326OooO0Oo.setValue(it);
            this.f54327OooO0o0.invoke(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<AnnotatedString.Builder, Unit> f54328OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f54329OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f54330OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54331OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ List<MomentSendContentAtModel> f54332OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentSendContentAtModel f54333OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ TextStyle f54334OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f54335OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f54336OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f54337OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f54338OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ Function1<TextLayoutResult, Unit> f54339OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f54340OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ int f54341OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54342OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final /* synthetic */ int f54343OooOOoo;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final /* synthetic */ int f54344OooOo00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Modifier modifier, String str, boolean z, List<MomentSendContentAtModel> list, MomentSendContentAtModel momentSendContentAtModel, Function1<? super AnnotatedString.Builder, Unit> function1, TextStyle textStyle, boolean z2, int i, int i2, Function1<? super String, Unit> function2, Function1<? super TextLayoutResult, Unit> function3, Function1<? super String, Unit> function4, Function0<Unit> function0, int i3, int i4, int i5) {
            super(2);
            this.f54329OooO0Oo = modifier;
            this.f54331OooO0o0 = str;
            this.f54330OooO0o = z;
            this.f54332OooO0oO = list;
            this.f54333OooO0oo = momentSendContentAtModel;
            this.f54328OooO = function1;
            this.f54334OooOO0 = textStyle;
            this.f54335OooOO0O = z2;
            this.f54336OooOO0o = i;
            this.f54338OooOOO0 = i2;
            this.f54337OooOOO = function2;
            this.f54339OooOOOO = function3;
            this.f54340OooOOOo = function4;
            this.f54342OooOOo0 = function0;
            this.f54341OooOOo = i3;
            this.f54343OooOOoo = i4;
            this.f54344OooOo00 = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0OO.OooO00o(this.f54329OooO0Oo, this.f54331OooO0o0, this.f54330OooO0o, this.f54332OooO0oO, this.f54333OooO0oo, this.f54328OooO, this.f54334OooOO0, this.f54335OooOO0O, this.f54336OooOO0o, this.f54338OooOOO0, this.f54337OooOOO, this.f54339OooOOOO, this.f54340OooOOOo, this.f54342OooOOo0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54341OooOOo | 1), RecomposeScopeImplKt.updateChangedFlags(this.f54343OooOOoo), this.f54344OooOo00);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f54345OooO0Oo = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult it = textLayoutResult;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentContentUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentContentUtils.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentContentUtilsKt$VideoMomentRichText$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,485:1\n154#2:486\n154#2:488\n58#3:487\n*S KotlinDebug\n*F\n+ 1 MomentContentUtils.kt\ncom/yalla/yalla/ui/composable/moment/utils/MomentContentUtilsKt$VideoMomentRichText$2$1\n*L\n371#1:486\n385#1:488\n371#1:487\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function1<Float, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Density f54346OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f54347OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Dp> f54348OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Density density, MutableState<Dp> mutableState, MutableState<Float> mutableState2) {
            super(1);
            this.f54346OooO0Oo = density;
            this.f54348OooO0o0 = mutableState;
            this.f54347OooO0o = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f) {
            float fFloatValue = f.floatValue();
            MutableState<Dp> mutableState = this.f54348OooO0o0;
            float fMo326toPx0680j_4 = this.f54346OooO0Oo.mo326toPx0680j_4(Dp.m3775constructorimpl(mutableState.getValue().m3789unboximpl() - Dp.m3775constructorimpl(Constants.ERR_ALREADY_IN_RECORDING)));
            MutableState<Float> mutableState2 = this.f54347OooO0o;
            if (fFloatValue < 0.0f) {
                if (Math.abs(OooO0OO.OooO0OO(mutableState2)) <= fMo326toPx0680j_4) {
                    mutableState2.setValue(Float.valueOf(OooO0OO.OooO0OO(mutableState2) + fFloatValue));
                }
            } else if (OooO0OO.OooO0OO(mutableState2) < 0.0f) {
                mutableState2.setValue(Float.valueOf(OooO0OO.OooO0OO(mutableState2) + fFloatValue));
                RangesKt.coerceAtMost(OooO0OO.OooO0OO(mutableState2), 0.0f);
            }
            p597o0oo00O.OooOOOO.OooO0O0("delta is " + fFloatValue + ",offsetY is " + OooO0OO.OooO0OO(mutableState2) + ",currentTextHeight is " + Dp.m3786toStringimpl(mutableState.getValue().m3789unboximpl()) + "," + Dp.m3786toStringimpl(Dp.m3775constructorimpl(180)) + ZegoConstants.ZegoVideoDataAuxPublishingStream);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Density f54349OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Dp> f54350OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Density density, MutableState<Dp> mutableState) {
            super(1);
            this.f54349OooO0Oo = density;
            this.f54350OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f54350OooO0o0.setValue(Dp.m3773boximpl(this.f54349OooO0Oo.mo323toDpu2uoSUM(IntSize.m3934getHeightimpl(it.mo2811getSizeYbymL2g()))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<Density, IntOffset> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f54351OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState<Float> mutableState) {
            super(1);
            this.f54351OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(Density density) {
            Density offset = density;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m3884boximpl(IntOffsetKt.IntOffset(0, MathKt.roundToInt(OooO0OO.OooO0OO(this.f54351OooO0Oo))));
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54352OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<TextLayoutResult, Unit> f54353OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextLayoutResult> f54354OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54355OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f54356OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOOO(MutableState<Boolean> mutableState, MutableState<TextLayoutResult> mutableState2, Function1<? super TextLayoutResult, Unit> function1, MutableState<Boolean> mutableState3, MutableIntState mutableIntState) {
            super(1);
            this.f54352OooO0Oo = mutableState;
            this.f54354OooO0o0 = mutableState2;
            this.f54353OooO0o = function1;
            this.f54355OooO0oO = mutableState3;
            this.f54356OooO0oo = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult textLayoutResult2 = textLayoutResult;
            Intrinsics.checkNotNullParameter(textLayoutResult2, "textLayoutResult");
            if (!this.f54352OooO0Oo.getValue().booleanValue() && textLayoutResult2.getHasVisualOverflow()) {
                this.f54355OooO0oO.setValue(Boolean.TRUE);
                this.f54356OooO0oo.setIntValue(TextLayoutResult.getLineEnd$default(textLayoutResult2, 1, false, 2, null));
            }
            this.f54354OooO0o0.setValue(textLayoutResult2);
            this.f54353OooO0o.invoke(textLayoutResult2);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<TextLayoutResult, Unit> f54357OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f54358OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54359OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f54360OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ List<MomentSendContentAtModel> f54361OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<AnnotatedString.Builder, Unit> f54362OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f54363OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f54364OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo(Modifier modifier, String str, MutableState<Boolean> mutableState, List<MomentSendContentAtModel> list, Function1<? super AnnotatedString.Builder, Unit> function1, Function1<? super TextLayoutResult, Unit> function2, int i, int i2) {
            super(2);
            this.f54358OooO0Oo = modifier;
            this.f54360OooO0o0 = str;
            this.f54359OooO0o = mutableState;
            this.f54361OooO0oO = list;
            this.f54362OooO0oo = function1;
            this.f54357OooO = function2;
            this.f54363OooOO0 = i;
            this.f54364OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO0OO.OooO0O0(this.f54358OooO0Oo, this.f54360OooO0o0, this.f54359OooO0o, this.f54361OooO0oO, this.f54362OooO0oo, this.f54357OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54363OooOO0 | 1), this.f54364OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54365OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MutableState<Boolean> mutableState) {
            super(0);
            this.f54365OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState<Boolean> mutableState = this.f54365OooO0Oo;
            mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class Oooo0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[o000000.values().length];
            try {
                iArr[o000000.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o000000.AtUser.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.utils.MomentContentUtilsKt$VideoMomentRichText$pressIndicator$1$1", f = "MomentContentUtils.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f54366OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f54367OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextLayoutResult> f54368OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f54369OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54370OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<AnnotatedString> f54371OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54372OooOO0;

        public static final class OooO00o extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<TextLayoutResult> f54373OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MutableState<AnnotatedString> f54374OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54375OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ boolean f54376OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f54377OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MutableState<TextLayoutResult> mutableState, MutableState<Boolean> mutableState2, MutableState<AnnotatedString> mutableState3, boolean z, MutableState<Boolean> mutableState4) {
                super(1);
                this.f54373OooO0Oo = mutableState;
                this.f54375OooO0o0 = mutableState2;
                this.f54374OooO0o = mutableState3;
                this.f54376OooO0oO = z;
                this.f54377OooO0oo = mutableState4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                long packedValue = offset.getPackedValue();
                TextLayoutResult value = this.f54373OooO0Oo.getValue();
                if (value != null) {
                    int iM3292getOffsetForPositionk4lQ0M = value.m3292getOffsetForPositionk4lQ0M(packedValue);
                    Lazy lazy = OooO0OO.f54306OooO00o;
                    AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) this.f54374OooO0o.getValue().getStringAnnotations(iM3292getOffsetForPositionk4lQ0M, iM3292getOffsetForPositionk4lQ0M));
                    if (range != null && !this.f54376OooO0oO && Intrinsics.areEqual(range.getTag(), "userId")) {
                        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26776Oooo0o, activityOooO0O0, (String) range.getItem(), false, 12);
                        }
                    } else if (this.f54377OooO0oo.getValue().booleanValue()) {
                        MutableState<Boolean> mutableState = this.f54375OooO0o0;
                        if (!mutableState.getValue().booleanValue()) {
                            mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MutableState<TextLayoutResult> mutableState, MutableState<Boolean> mutableState2, MutableState<AnnotatedString> mutableState3, boolean z, MutableState<Boolean> mutableState4, Continuation<? super Oooo000> continuation) {
            super(2, continuation);
            this.f54368OooO0o = mutableState;
            this.f54370OooO0oO = mutableState2;
            this.f54371OooO0oo = mutableState3;
            this.f54366OooO = z;
            this.f54372OooOO0 = mutableState4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Oooo000 oooo000 = new Oooo000(this.f54368OooO0o, this.f54370OooO0oO, this.f54371OooO0oo, this.f54366OooO, this.f54372OooOO0, continuation);
            oooo000.f54369OooO0o0 = obj;
            return oooo000;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((Oooo000) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54367OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f54369OooO0o0;
                OooO00o oooO00o = new OooO00o(this.f54368OooO0o, this.f54370OooO0oO, this.f54371OooO0oo, this.f54366OooO, this.f54372OooOO0);
                this.f54367OooO0Oo = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, oooO00o, this, 7, null) == coroutine_suspended) {
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

    public static final class o000oOoO extends Lambda implements Function0<Regex> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f54378OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Regex invoke() {
            return new Regex("(/\\[MRF_100[0-9]{3})|((@|#)\\{\\d{1,}\\})");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0140  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x015c  */
    /* JADX WARN: Code duplicated, block: B:114:0x015f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:119:0x016c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0177  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:127:0x017e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0184  */
    /* JADX WARN: Code duplicated, block: B:130:0x0187  */
    /* JADX WARN: Code duplicated, block: B:134:0x0190  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01da  */
    /* JADX WARN: Code duplicated, block: B:155:0x01de  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x0201  */
    /* JADX WARN: Code duplicated, block: B:168:0x0205  */
    /* JADX WARN: Code duplicated, block: B:169:0x0209  */
    /* JADX WARN: Code duplicated, block: B:171:0x020d  */
    /* JADX WARN: Code duplicated, block: B:172:0x020f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0213  */
    /* JADX WARN: Code duplicated, block: B:175:0x0216  */
    /* JADX WARN: Code duplicated, block: B:177:0x021a  */
    /* JADX WARN: Code duplicated, block: B:178:0x021c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0224  */
    /* JADX WARN: Code duplicated, block: B:182:0x0231  */
    /* JADX WARN: Code duplicated, block: B:185:0x0257  */
    /* JADX WARN: Code duplicated, block: B:189:0x0263  */
    /* JADX WARN: Code duplicated, block: B:192:0x0295  */
    /* JADX WARN: Code duplicated, block: B:194:0x029d  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:198:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:202:0x0302 A[LOOP:0: B:200:0x02ff->B:202:0x0302, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x0313  */
    /* JADX WARN: Code duplicated, block: B:207:0x031b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0360  */
    /* JADX WARN: Code duplicated, block: B:212:0x0368  */
    /* JADX WARN: Code duplicated, block: B:215:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:220:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x0108  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:0x0116  */
    /* JADX WARN: Code duplicated, block: B:88:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x0121  */
    /* JADX WARN: Code duplicated, block: B:93:0x0126  */
    /* JADX WARN: Code duplicated, block: B:95:0x012c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0132  */
    /* JADX WARN: Code duplicated, block: B:98:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, @NotNull String content, boolean z, @Nullable List<MomentSendContentAtModel> list, @Nullable MomentSendContentAtModel momentSendContentAtModel, @Nullable Function1<? super AnnotatedString.Builder, Unit> function1, @Nullable TextStyle textStyle, boolean z2, int i, int i2, @Nullable Function1<? super String, Unit> function2, @Nullable Function1<? super TextLayoutResult, Unit> function3, @Nullable Function1<? super String, Unit> function4, @NotNull Function0<Unit> onNormalClick, @Nullable Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Modifier modifier2;
        boolean z3;
        List<MomentSendContentAtModel> list2;
        MomentSendContentAtModel momentSendContentAtModel2;
        Function1<? super AnnotatedString.Builder, Unit> function5;
        TextStyle textStyle2;
        boolean z4;
        int iM3729getEllipsisgIe3tQ8;
        int i27;
        Function1<? super String, Unit> function6;
        Function1<? super TextLayoutResult, Unit> function7;
        Function1<? super String, Unit> function8;
        boolean zBooleanValue;
        boolean zChanged;
        Object objRememberedValue;
        MutableState mutableState;
        boolean zChanged2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        MutableState mutableState2;
        Object[] objArr;
        boolean zChanged3;
        int i28;
        Object objRememberedValue4;
        boolean zChanged4;
        Object objRememberedValue5;
        int i29;
        Function1<? super TextLayoutResult, Unit> function9;
        Function1<? super String, Unit> function10;
        MomentSendContentAtModel momentSendContentAtModel3;
        TextStyle textStyle3;
        List<MomentSendContentAtModel> list3;
        Function1<? super AnnotatedString.Builder, Unit> function11;
        Function1<? super String, Unit> function12;
        int i30;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onNormalClick, "onNormalClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-733496287);
        int i31 = i5 & 1;
        if (i31 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= composerStartRestartGroup.changed(content) ? 32 : 16;
        }
        int i32 = i5 & 4;
        int i33 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i32 == 0) {
            if ((i3 & 896) == 0) {
                i6 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 != 0) {
                i6 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i8 = i5 & 16;
            if (i8 != 0) {
                i6 |= 8192;
            }
            i9 = i5 & 32;
            if (i9 != 0) {
                i6 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i6 |= i10;
            }
            i11 = i5 & 64;
            if (i11 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(textStyle)) {
                    i12 = com.zego.zegoliveroom.constants.ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i6 |= i12;
            }
            i13 = i5 & 128;
            if (i13 != 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i6 |= i14;
            }
            i15 = i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i15 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i6 |= i16;
            }
            i17 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i17 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(i2)) {
                    i18 = 536870912;
                } else {
                    i18 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i6 |= i18;
            }
            i19 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i19 != 0) {
                i20 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i4 | i21;
            } else {
                i20 = i4;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i20 |= 48;
            } else if ((i4 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i20 |= i23;
            }
            i24 = i20;
            i25 = i5 & 4096;
            if (i25 != 0) {
                if ((i4 & 896) == 0) {
                    if (!composerStartRestartGroup.changedInstance(function4)) {
                        i33 = 128;
                    }
                    i24 |= i33;
                }
                if ((i5 & 8192) != 0) {
                    i24 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(onNormalClick)) {
                        i26 = 2048;
                    } else {
                        i26 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i24 |= i26;
                }
                if ((i5 & 24) != 24 && (1533916891 & i6) == 306783378 && (i24 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    z3 = z;
                    list3 = list;
                    momentSendContentAtModel3 = momentSendContentAtModel;
                    function11 = function1;
                    textStyle3 = textStyle;
                    z4 = z2;
                    i30 = i;
                    i29 = i2;
                    function12 = function2;
                    function9 = function3;
                    function10 = function4;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i32 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i7 != 0) {
                        list2 = null;
                    } else {
                        list2 = list;
                    }
                    if (i8 != 0) {
                        momentSendContentAtModel2 = null;
                    } else {
                        momentSendContentAtModel2 = momentSendContentAtModel;
                    }
                    if (i9 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i11 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i15 != 0) {
                        iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                    } else {
                        iM3729getEllipsisgIe3tQ8 = i;
                    }
                    if (i17 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i22 != 0) {
                        function7 = OooO00o.f54323OooO0Oo;
                    } else {
                        function7 = function3;
                    }
                    if (i25 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-733496287, i6, i24, "com.yalla.yalla.ui.composable.moment.utils.MomentRichText (MomentContentUtils.kt:257)");
                    }
                    zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    AnnotatedString annotatedString = (AnnotatedString) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(function6) | composerStartRestartGroup.changed(mutableState);
                    Function1<? super AnnotatedString.Builder, Unit> function13 = function5;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(annotatedString, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue3;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Function1<? super String, Unit> function14 = function6;
                    zChanged3 = false;
                    objArr = new Object[]{function8, mutableState, mutableState2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(z3), onNormalClick};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    for (i28 = 0; i28 < 6; i28++) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i28]);
                    }
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4);
                    AnnotatedString annotatedString2 = (AnnotatedString) mutableState.getValue();
                    Modifier modifierThen = modifier2.then(modifierPointerInput);
                    HashMap<String, InlineTextContent> map = f54307OooO0O0;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged4 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(function7);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function15 = (Function1) objRememberedValue5;
                    int i34 = i6 >> 12;
                    BasicTextKt.m736BasicTextRWo7tUw(annotatedString2, modifierThen, textStyle2, function15, iM3729getEllipsisgIe3tQ8, z4, i27, 0, map, null, composerStartRestartGroup, (i34 & 57344) | (i34 & 896) | 134217728 | ((i6 >> 6) & 458752) | ((i6 >> 9) & 3670016), 640);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i29 = i27;
                    function9 = function7;
                    function10 = function8;
                    momentSendContentAtModel3 = momentSendContentAtModel2;
                    textStyle3 = textStyle2;
                    list3 = list2;
                    function11 = function13;
                    function12 = function14;
                    i30 = iM3729getEllipsisgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier2, content, z3, list3, momentSendContentAtModel3, function11, textStyle3, z4, i30, i29, function12, function9, function10, onNormalClick, i3, i4, i5));
            }
            i24 |= 384;
            if ((i5 & 8192) != 0) {
                i24 |= 3072;
            } else if ((i4 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(onNormalClick)) {
                    i26 = 2048;
                } else {
                    i26 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i24 |= i26;
            }
            if ((i5 & 24) != 24) {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i32 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i7 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i8 != 0) {
                    momentSendContentAtModel2 = null;
                } else {
                    momentSendContentAtModel2 = momentSendContentAtModel;
                }
                if (i9 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i11 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i15 != 0) {
                    iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                } else {
                    iM3729getEllipsisgIe3tQ8 = i;
                }
                if (i17 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i2;
                }
                if (i19 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i22 != 0) {
                    function7 = OooO00o.f54323OooO0Oo;
                } else {
                    function7 = function3;
                }
                if (i25 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-733496287, i6, i24, "com.yalla.yalla.ui.composable.moment.utils.MomentRichText (MomentContentUtils.kt:257)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                AnnotatedString annotatedString3 = (AnnotatedString) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(function6) | composerStartRestartGroup.changed(mutableState);
                Function1<? super AnnotatedString.Builder, Unit> function16 = function5;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(annotatedString3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue3;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Function1<? super String, Unit> function17 = function6;
                zChanged3 = false;
                objArr = new Object[]{function8, mutableState, mutableState2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(z3), onNormalClick};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i28 < 6) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i28]);
                }
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(companion2, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4);
                AnnotatedString annotatedString4 = (AnnotatedString) mutableState.getValue();
                Modifier modifierThen2 = modifier2.then(modifierPointerInput2);
                HashMap<String, InlineTextContent> map2 = f54307OooO0O0;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(function7);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function18 = (Function1) objRememberedValue5;
                int i35 = i6 >> 12;
                BasicTextKt.m736BasicTextRWo7tUw(annotatedString4, modifierThen2, textStyle2, function18, iM3729getEllipsisgIe3tQ8, z4, i27, 0, map2, null, composerStartRestartGroup, (i35 & 57344) | (i35 & 896) | 134217728 | ((i6 >> 6) & 458752) | ((i6 >> 9) & 3670016), 640);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i29 = i27;
                function9 = function7;
                function10 = function8;
                momentSendContentAtModel3 = momentSendContentAtModel2;
                textStyle3 = textStyle2;
                list3 = list2;
                function11 = function16;
                function12 = function17;
                i30 = iM3729getEllipsisgIe3tQ8;
            } else {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i32 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i7 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i8 != 0) {
                    momentSendContentAtModel2 = null;
                } else {
                    momentSendContentAtModel2 = momentSendContentAtModel;
                }
                if (i9 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i11 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i15 != 0) {
                    iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                } else {
                    iM3729getEllipsisgIe3tQ8 = i;
                }
                if (i17 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i2;
                }
                if (i19 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i22 != 0) {
                    function7 = OooO00o.f54323OooO0Oo;
                } else {
                    function7 = function3;
                }
                if (i25 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-733496287, i6, i24, "com.yalla.yalla.ui.composable.moment.utils.MomentRichText (MomentContentUtils.kt:257)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                AnnotatedString annotatedString5 = (AnnotatedString) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(function6) | composerStartRestartGroup.changed(mutableState);
                Function1<? super AnnotatedString.Builder, Unit> function19 = function5;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(annotatedString5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue3;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Function1<? super String, Unit> function110 = function6;
                zChanged3 = false;
                objArr = new Object[]{function8, mutableState, mutableState2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(z3), onNormalClick};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i28 < 6) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i28]);
                }
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput3 = SuspendingPointerInputFilterKt.pointerInput(companion3, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4);
                AnnotatedString annotatedString6 = (AnnotatedString) mutableState.getValue();
                Modifier modifierThen3 = modifier2.then(modifierPointerInput3);
                HashMap<String, InlineTextContent> map3 = f54307OooO0O0;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(function7);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function111 = (Function1) objRememberedValue5;
                int i36 = i6 >> 12;
                BasicTextKt.m736BasicTextRWo7tUw(annotatedString6, modifierThen3, textStyle2, function111, iM3729getEllipsisgIe3tQ8, z4, i27, 0, map3, null, composerStartRestartGroup, (i36 & 57344) | (i36 & 896) | 134217728 | ((i6 >> 6) & 458752) | ((i6 >> 9) & 3670016), 640);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i29 = i27;
                function9 = function7;
                function10 = function8;
                momentSendContentAtModel3 = momentSendContentAtModel2;
                textStyle3 = textStyle2;
                list3 = list2;
                function11 = function19;
                function12 = function110;
                i30 = iM3729getEllipsisgIe3tQ8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier2, content, z3, list3, momentSendContentAtModel3, function11, textStyle3, z4, i30, i29, function12, function9, function10, onNormalClick, i3, i4, i5));
        }
        i6 |= 384;
        i7 = i5 & 8;
        if (i7 != 0) {
            i6 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        i8 = i5 & 16;
        if (i8 != 0) {
            i6 |= 8192;
        }
        i9 = i5 & 32;
        if (i9 != 0) {
            i6 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i6 |= i10;
        }
        i11 = i5 & 64;
        if (i11 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(textStyle)) {
                i12 = com.zego.zegoliveroom.constants.ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i12 = 524288;
            }
            i6 |= i12;
        }
        i13 = i5 & 128;
        if (i13 != 0) {
            i6 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i14 = 8388608;
            } else {
                i14 = Configuration.BLOCK_SIZE;
            }
            i6 |= i14;
        }
        i15 = i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i15 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(i)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i6 |= i16;
        }
        i17 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i17 != 0) {
            i6 |= 805306368;
        } else if ((i3 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(i2)) {
                i18 = 536870912;
            } else {
                i18 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i6 |= i18;
        }
        i19 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i19 != 0) {
            i20 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i20 = i4 | i21;
        } else {
            i20 = i4;
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
            i20 |= 48;
        } else if ((i4 & 112) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i20 |= i23;
        }
        i24 = i20;
        i25 = i5 & 4096;
        if (i25 != 0) {
            if ((i4 & 896) == 0) {
                if (!composerStartRestartGroup.changedInstance(function4)) {
                    i33 = 128;
                }
                i24 |= i33;
            }
            if ((i5 & 8192) != 0) {
                i24 |= 3072;
            } else if ((i4 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(onNormalClick)) {
                    i26 = 2048;
                } else {
                    i26 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i24 |= i26;
            }
            if ((i5 & 24) != 24) {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i32 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i7 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i8 != 0) {
                    momentSendContentAtModel2 = null;
                } else {
                    momentSendContentAtModel2 = momentSendContentAtModel;
                }
                if (i9 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i11 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i15 != 0) {
                    iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                } else {
                    iM3729getEllipsisgIe3tQ8 = i;
                }
                if (i17 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i2;
                }
                if (i19 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i22 != 0) {
                    function7 = OooO00o.f54323OooO0Oo;
                } else {
                    function7 = function3;
                }
                if (i25 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-733496287, i6, i24, "com.yalla.yalla.ui.composable.moment.utils.MomentRichText (MomentContentUtils.kt:257)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                AnnotatedString annotatedString7 = (AnnotatedString) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(function6) | composerStartRestartGroup.changed(mutableState);
                Function1<? super AnnotatedString.Builder, Unit> function112 = function5;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(annotatedString7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue3;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Function1<? super String, Unit> function113 = function6;
                zChanged3 = false;
                objArr = new Object[]{function8, mutableState, mutableState2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(z3), onNormalClick};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i28 < 6) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i28]);
                }
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput4 = SuspendingPointerInputFilterKt.pointerInput(companion4, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4);
                AnnotatedString annotatedString8 = (AnnotatedString) mutableState.getValue();
                Modifier modifierThen4 = modifier2.then(modifierPointerInput4);
                HashMap<String, InlineTextContent> map4 = f54307OooO0O0;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(function7);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function114 = (Function1) objRememberedValue5;
                int i37 = i6 >> 12;
                BasicTextKt.m736BasicTextRWo7tUw(annotatedString8, modifierThen4, textStyle2, function114, iM3729getEllipsisgIe3tQ8, z4, i27, 0, map4, null, composerStartRestartGroup, (i37 & 57344) | (i37 & 896) | 134217728 | ((i6 >> 6) & 458752) | ((i6 >> 9) & 3670016), 640);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i29 = i27;
                function9 = function7;
                function10 = function8;
                momentSendContentAtModel3 = momentSendContentAtModel2;
                textStyle3 = textStyle2;
                list3 = list2;
                function11 = function112;
                function12 = function113;
                i30 = iM3729getEllipsisgIe3tQ8;
            } else {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i32 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i7 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i8 != 0) {
                    momentSendContentAtModel2 = null;
                } else {
                    momentSendContentAtModel2 = momentSendContentAtModel;
                }
                if (i9 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i11 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i15 != 0) {
                    iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                } else {
                    iM3729getEllipsisgIe3tQ8 = i;
                }
                if (i17 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i2;
                }
                if (i19 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i22 != 0) {
                    function7 = OooO00o.f54323OooO0Oo;
                } else {
                    function7 = function3;
                }
                if (i25 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-733496287, i6, i24, "com.yalla.yalla.ui.composable.moment.utils.MomentRichText (MomentContentUtils.kt:257)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                AnnotatedString annotatedString9 = (AnnotatedString) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(function6) | composerStartRestartGroup.changed(mutableState);
                Function1<? super AnnotatedString.Builder, Unit> function115 = function5;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(annotatedString9, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue3;
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Function1<? super String, Unit> function116 = function6;
                zChanged3 = false;
                objArr = new Object[]{function8, mutableState, mutableState2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(z3), onNormalClick};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i28 < 6) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i28]);
                }
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput5 = SuspendingPointerInputFilterKt.pointerInput(companion5, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4);
                AnnotatedString annotatedString10 = (AnnotatedString) mutableState.getValue();
                Modifier modifierThen5 = modifier2.then(modifierPointerInput5);
                HashMap<String, InlineTextContent> map5 = f54307OooO0O0;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(function7);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function117 = (Function1) objRememberedValue5;
                int i38 = i6 >> 12;
                BasicTextKt.m736BasicTextRWo7tUw(annotatedString10, modifierThen5, textStyle2, function117, iM3729getEllipsisgIe3tQ8, z4, i27, 0, map5, null, composerStartRestartGroup, (i38 & 57344) | (i38 & 896) | 134217728 | ((i6 >> 6) & 458752) | ((i6 >> 9) & 3670016), 640);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i29 = i27;
                function9 = function7;
                function10 = function8;
                momentSendContentAtModel3 = momentSendContentAtModel2;
                textStyle3 = textStyle2;
                list3 = list2;
                function11 = function115;
                function12 = function116;
                i30 = iM3729getEllipsisgIe3tQ8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier2, content, z3, list3, momentSendContentAtModel3, function11, textStyle3, z4, i30, i29, function12, function9, function10, onNormalClick, i3, i4, i5));
        }
        i24 |= 384;
        if ((i5 & 8192) != 0) {
            i24 |= 3072;
        } else if ((i4 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(onNormalClick)) {
                i26 = 2048;
            } else {
                i26 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i24 |= i26;
        }
        if ((i5 & 24) != 24) {
            if (i31 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i32 != 0) {
                z3 = false;
            } else {
                z3 = z;
            }
            if (i7 != 0) {
                list2 = null;
            } else {
                list2 = list;
            }
            if (i8 != 0) {
                momentSendContentAtModel2 = null;
            } else {
                momentSendContentAtModel2 = momentSendContentAtModel;
            }
            if (i9 != 0) {
                function5 = null;
            } else {
                function5 = function1;
            }
            if (i11 != 0) {
                textStyle2 = TextStyle.INSTANCE.getDefault();
            } else {
                textStyle2 = textStyle;
            }
            if (i13 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if (i15 != 0) {
                iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
            } else {
                iM3729getEllipsisgIe3tQ8 = i;
            }
            if (i17 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i2;
            }
            if (i19 != 0) {
                function6 = null;
            } else {
                function6 = function2;
            }
            if (i22 != 0) {
                function7 = OooO00o.f54323OooO0Oo;
            } else {
                function7 = function3;
            }
            if (i25 != 0) {
                function8 = null;
            } else {
                function8 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-733496287, i6, i24, "com.yalla.yalla.ui.composable.moment.utils.MomentRichText (MomentContentUtils.kt:257)");
            }
            zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            AnnotatedString annotatedString11 = (AnnotatedString) mutableState.getValue();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(function6) | composerStartRestartGroup.changed(mutableState);
            Function1<? super AnnotatedString.Builder, Unit> function118 = function5;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(annotatedString11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue3;
            Modifier.Companion companion6 = Modifier.INSTANCE;
            Function1<? super String, Unit> function119 = function6;
            zChanged3 = false;
            objArr = new Object[]{function8, mutableState, mutableState2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(z3), onNormalClick};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            while (i28 < 6) {
                zChanged3 |= composerStartRestartGroup.changed(objArr[i28]);
            }
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierPointerInput6 = SuspendingPointerInputFilterKt.pointerInput(companion6, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4);
            AnnotatedString annotatedString12 = (AnnotatedString) mutableState.getValue();
            Modifier modifierThen6 = modifier2.then(modifierPointerInput6);
            HashMap<String, InlineTextContent> map6 = f54307OooO0O0;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged4 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(function7);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function1110 = (Function1) objRememberedValue5;
            int i39 = i6 >> 12;
            BasicTextKt.m736BasicTextRWo7tUw(annotatedString12, modifierThen6, textStyle2, function1110, iM3729getEllipsisgIe3tQ8, z4, i27, 0, map6, null, composerStartRestartGroup, (i39 & 57344) | (i39 & 896) | 134217728 | ((i6 >> 6) & 458752) | ((i6 >> 9) & 3670016), 640);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i29 = i27;
            function9 = function7;
            function10 = function8;
            momentSendContentAtModel3 = momentSendContentAtModel2;
            textStyle3 = textStyle2;
            list3 = list2;
            function11 = function118;
            function12 = function119;
            i30 = iM3729getEllipsisgIe3tQ8;
        } else {
            if (i31 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i32 != 0) {
                z3 = false;
            } else {
                z3 = z;
            }
            if (i7 != 0) {
                list2 = null;
            } else {
                list2 = list;
            }
            if (i8 != 0) {
                momentSendContentAtModel2 = null;
            } else {
                momentSendContentAtModel2 = momentSendContentAtModel;
            }
            if (i9 != 0) {
                function5 = null;
            } else {
                function5 = function1;
            }
            if (i11 != 0) {
                textStyle2 = TextStyle.INSTANCE.getDefault();
            } else {
                textStyle2 = textStyle;
            }
            if (i13 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if (i15 != 0) {
                iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
            } else {
                iM3729getEllipsisgIe3tQ8 = i;
            }
            if (i17 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i2;
            }
            if (i19 != 0) {
                function6 = null;
            } else {
                function6 = function2;
            }
            if (i22 != 0) {
                function7 = OooO00o.f54323OooO0Oo;
            } else {
                function7 = function3;
            }
            if (i25 != 0) {
                function8 = null;
            } else {
                function8 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-733496287, i6, i24, "com.yalla.yalla.ui.composable.moment.utils.MomentRichText (MomentContentUtils.kt:257)");
            }
            zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function5, content, list2, momentSendContentAtModel2), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            AnnotatedString annotatedString13 = (AnnotatedString) mutableState.getValue();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(function6) | composerStartRestartGroup.changed(mutableState);
            Function1<? super AnnotatedString.Builder, Unit> function1111 = function5;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new OooO0O0(mutableState, function6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(annotatedString13, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue3;
            Modifier.Companion companion7 = Modifier.INSTANCE;
            Function1<? super String, Unit> function1112 = function6;
            zChanged3 = false;
            objArr = new Object[]{function8, mutableState, mutableState2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(z3), onNormalClick};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            while (i28 < 6) {
                zChanged3 |= composerStartRestartGroup.changed(objArr[i28]);
            }
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new OooO(function8, mutableState, mutableState2, onNormalClick, zBooleanValue, z3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierPointerInput7 = SuspendingPointerInputFilterKt.pointerInput(companion7, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4);
            AnnotatedString annotatedString14 = (AnnotatedString) mutableState.getValue();
            Modifier modifierThen7 = modifier2.then(modifierPointerInput7);
            HashMap<String, InlineTextContent> map7 = f54307OooO0O0;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged4 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(function7);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new C0483OooO0OO(mutableState2, function7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function1113 = (Function1) objRememberedValue5;
            int i310 = i6 >> 12;
            BasicTextKt.m736BasicTextRWo7tUw(annotatedString14, modifierThen7, textStyle2, function1113, iM3729getEllipsisgIe3tQ8, z4, i27, 0, map7, null, composerStartRestartGroup, (i310 & 57344) | (i310 & 896) | 134217728 | ((i6 >> 6) & 458752) | ((i6 >> 9) & 3670016), 640);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i29 = i27;
            function9 = function7;
            function10 = function8;
            momentSendContentAtModel3 = momentSendContentAtModel2;
            textStyle3 = textStyle2;
            list3 = list2;
            function11 = function1111;
            function12 = function1112;
            i30 = iM3729getEllipsisgIe3tQ8;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier2, content, z3, list3, momentSendContentAtModel3, function11, textStyle3, z4, i30, i29, function12, function9, function10, onNormalClick, i3, i4, i5));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b2 A[LOOP:0: B:100:0x01b0->B:101:0x01b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:111:0x0210  */
    /* JADX WARN: Code duplicated, block: B:114:0x022e  */
    /* JADX WARN: Code duplicated, block: B:119:0x024e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:131:0x032a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0336  */
    /* JADX WARN: Code duplicated, block: B:135:0x033a  */
    /* JADX WARN: Code duplicated, block: B:138:0x034b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0359  */
    /* JADX WARN: Code duplicated, block: B:143:0x0379  */
    /* JADX WARN: Code duplicated, block: B:147:0x039c A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:150:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:158:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:160:0x0403  */
    /* JADX WARN: Code duplicated, block: B:163:0x042e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0430  */
    /* JADX WARN: Code duplicated, block: B:167:0x0482  */
    /* JADX WARN: Code duplicated, block: B:168:0x0486  */
    /* JADX WARN: Code duplicated, block: B:171:0x04a8 A[LOOP:1: B:170:0x04a6->B:171:0x04a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:176:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:179:0x0506  */
    /* JADX WARN: Code duplicated, block: B:181:0x0512  */
    /* JADX WARN: Code duplicated, block: B:182:0x0522  */
    /* JADX WARN: Code duplicated, block: B:185:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:187:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:191:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:196:0x0603  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0108  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0136  */
    /* JADX WARN: Code duplicated, block: B:93:0x0158  */
    /* JADX WARN: Code duplicated, block: B:95:0x0160  */
    /* JADX WARN: Code duplicated, block: B:98:0x0183  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@Nullable Modifier modifier, @NotNull String content, @NotNull MutableState<Boolean> isExpanded, @Nullable List<MomentSendContentAtModel> list, @Nullable Function1<? super AnnotatedString.Builder, Unit> function1, @Nullable Function1<? super TextLayoutResult, Unit> function2, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super AnnotatedString.Builder, Unit> function3;
        int i4;
        Function1<? super TextLayoutResult, Unit> function4;
        int i5;
        Modifier modifier3;
        List<MomentSendContentAtModel> list2;
        Function1<? super TextLayoutResult, Unit> function5;
        boolean zBooleanValue;
        boolean zChanged;
        Object objRememberedValue;
        MutableState mutableState;
        boolean zChanged2;
        Object objRememberedValue2;
        int i6;
        MutableIntState mutableIntState;
        boolean zChanged3;
        Object objRememberedValue3;
        MutableState mutableState2;
        Object objRememberedValue4;
        MutableState mutableState3;
        int i7;
        Object[] objArr;
        boolean zChanged4;
        Object obj;
        int i8;
        Object objRememberedValue5;
        Composer.Companion companion;
        MutableState mutableState4;
        Object objRememberedValue6;
        MutableState mutableState5;
        Density density;
        Modifier modifierOffset;
        Modifier modifierDraggable;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        AnnotatedString annotatedStringSubSequence;
        boolean zChanged5;
        Object objRememberedValue7;
        TextDirection textDirectionM3687boximpl;
        int i9;
        Object[] objArr2;
        int i10;
        boolean zChanged6;
        Object objRememberedValue8;
        Function1<? super TextLayoutResult, Unit> function6;
        List<MomentSendContentAtModel> list3;
        String strStringResource;
        boolean zChanged7;
        Object objRememberedValue9;
        boolean zChanged8;
        Object objRememberedValue10;
        boolean zChanged9;
        Object objRememberedValue11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(isExpanded, "isExpanded");
        Composer composerStartRestartGroup = composer.startRestartGroup(-869516808);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(isExpanded) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i13 = i2 & 16;
        if (i13 == 0) {
            if ((57344 & i) == 0) {
                function3 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((458752 & i) == 0) {
                    function4 = function2;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if (i12 != 8 && (374491 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    list3 = list;
                    function3 = function3;
                    function6 = function4;
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i12 != 0) {
                        list2 = null;
                    } else {
                        list2 = list;
                    }
                    if (i13 != 0) {
                        function3 = null;
                    }
                    if (i4 != 0) {
                        function5 = OooOO0.f54345OooO0Oo;
                    } else {
                        function5 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-869516808, i3, -1, "com.yalla.yalla.ui.composable.moment.utils.VideoMomentRichText (MomentContentUtils.kt:323)");
                    }
                    zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(content);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(content);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    i6 = 0;
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableIntState = (MutableIntState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState3 = (MutableState) objRememberedValue4;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    objArr = new Object[]{mutableState3, mutableState2, Boolean.valueOf(zBooleanValue), mutableState, isExpanded};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged4 = false;
                    for (i7 = 5; i6 < i7; i7 = 5) {
                        zChanged4 |= composerStartRestartGroup.changed(objArr[i6]);
                        i6++;
                    }
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged4 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        obj = oooo000;
                        Oooo000 oooo000 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(obj);
                        i8 = -492369756;
                    } else {
                        obj = objRememberedValue12;
                        i8 = -492369756;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) obj);
                    composerStartRestartGroup.startReplaceableGroup(i8);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4 = (MutableState) objRememberedValue5;
                    if (((Boolean) mutableState.getValue()).booleanValue() && !isExpanded.getValue().booleanValue()) {
                        mutableState4.setValue(Float.valueOf(0.0f));
                    }
                    composerStartRestartGroup.startReplaceableGroup(i8);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState5 = (MutableState) objRememberedValue6;
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    modifierOffset = Modifier.INSTANCE;
                    Modifier modifierM513heightInVpY3zN4$default = SizeKt.m513heightInVpY3zN4$default(modifierOffset, 0.0f, Dp.m3775constructorimpl(180), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-231670017);
                    if (isExpanded.getValue().booleanValue()) {
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifierOffset, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0), false, null, false, 12, null);
                        Orientation orientation = Orientation.Vertical;
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged9 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(mutableState4);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (zChanged9 || objRememberedValue11 == companion.getEmpty()) {
                            objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifierDraggable = DraggableKt.draggable(modifierVerticalScroll$default, DraggableKt.rememberDraggableState((Function1) objRememberedValue11, composerStartRestartGroup, 0), orientation, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? new DraggableKt.C06311(null) : null, (252 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : null, (252 & 128) != 0 ? false : false);
                    } else {
                        modifierDraggable = modifierOffset;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen = modifierM513heightInVpY3zN4$default.then(modifierDraggable);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO00o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
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
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    annotatedStringSubSequence = (((Boolean) mutableState.getValue()).booleanValue() || isExpanded.getValue().booleanValue()) ? (AnnotatedString) mutableState2.getValue() : ((AnnotatedString) mutableState2.getValue()).subSequence(0, mutableIntState.getIntValue());
                    Modifier modifierThen2 = modifier3.then(modifierPointerInput);
                    composerStartRestartGroup.startReplaceableGroup(-459443643);
                    if (isExpanded.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged8 = composerStartRestartGroup.changed(mutableState4);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (zChanged8 || objRememberedValue10 == companion.getEmpty()) {
                            objRememberedValue10 = new OooOOO0(mutableState4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifierOffset = OffsetKt.offset(modifierOffset, (Function1) objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen3 = modifierThen2.then(modifierOffset);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged5 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(density);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5 || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new OooOOO(density, mutableState5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierThen3, (Function1) objRememberedValue7);
                    PlatformTextStyle platformTextStyle = new PlatformTextStyle(true);
                    long j = o0O0o.f48107OooOOo;
                    FontWeight medium = FontWeight.INSTANCE.getMedium();
                    long sp = TextUnitKt.getSp(14);
                    if (p596o0oo000O.OooO0o.OooO0o0()) {
                        textDirectionM3687boximpl = null;
                    } else {
                        textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                    }
                    TextStyle textStyle = new TextStyle(j, sp, medium, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187384, (DefaultConstructorMarker) null);
                    int iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                    if (isExpanded.getValue().booleanValue()) {
                        i9 = Integer.MAX_VALUE;
                    } else {
                        i9 = 2;
                    }
                    int i14 = i9;
                    HashMap<String, InlineTextContent> map = f54307OooO0O0;
                    objArr2 = new Object[]{isExpanded, mutableState, mutableIntState, mutableState3, function5};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged6 = false;
                    for (i10 = 0; i10 < 5; i10++) {
                        zChanged6 |= composerStartRestartGroup.changed(objArr2[i10]);
                    }
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        OooOOOO oooOOOO = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                        composerStartRestartGroup.updateRememberedValue(oooOOOO);
                        objRememberedValue8 = oooOOOO;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier2 = modifier3;
                    BasicTextKt.m736BasicTextRWo7tUw(annotatedStringSubSequence, modifierOnGloballyPositioned, textStyle, (Function1) objRememberedValue8, iM3729getEllipsisgIe3tQ8, true, i14, 0, map, null, composerStartRestartGroup, 134438912, 640);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        if (isExpanded.getValue().booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-231666893);
                            strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_less, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-231666835);
                            strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_more, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        String str = strStringResource;
                        long sp2 = TextUnitKt.getSp(14);
                        long j2 = o0O0o.f48103OooOOO;
                        FontWeight medium2 = FontWeight.INSTANCE.getMedium();
                        TextStyle textStyle2 = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
                        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 13, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged7 = composerStartRestartGroup.changed(isExpanded);
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (zChanged7 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new OooOo00(isExpanded);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextKt.m1261Text4IGK_g(str, ClickableKt.m204clickableXHw0xAI$default(modifierM482paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue9, 7, null), j2, sp2, (FontStyle) null, medium2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composerStartRestartGroup, 199680, 0, 65488);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function6 = function5;
                    list3 = list2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(modifier2, content, isExpanded, list3, function3, function6, i, i2));
            }
            i3 |= 196608;
            function4 = function2;
            if (i12 != 8) {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i12 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i13 != 0) {
                    function3 = null;
                }
                if (i4 != 0) {
                    function5 = OooOO0.f54345OooO0Oo;
                } else {
                    function5 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-869516808, i3, -1, "com.yalla.yalla.ui.composable.moment.utils.VideoMomentRichText (MomentContentUtils.kt:323)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(content);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(content);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i6 = 0;
                if (zChanged2) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableIntState = (MutableIntState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState3 = (MutableState) objRememberedValue4;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                objArr = new Object[]{mutableState3, mutableState2, Boolean.valueOf(zBooleanValue), mutableState, isExpanded};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i6 < i7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i6]);
                    i6++;
                }
                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    obj = oooo000;
                    Oooo000 oooo001 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(obj);
                    i8 = -492369756;
                } else {
                    obj = oooo001;
                    Oooo000 oooo002 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(obj);
                    i8 = -492369756;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(companion4, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) obj);
                composerStartRestartGroup.startReplaceableGroup(i8);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4 = (MutableState) objRememberedValue5;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState4.setValue(Float.valueOf(0.0f));
                }
                composerStartRestartGroup.startReplaceableGroup(i8);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState5 = (MutableState) objRememberedValue6;
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                modifierOffset = Modifier.INSTANCE;
                Modifier modifierM513heightInVpY3zN4$default2 = SizeKt.m513heightInVpY3zN4$default(modifierOffset, 0.0f, Dp.m3775constructorimpl(180), 1, null);
                composerStartRestartGroup.startReplaceableGroup(-231670017);
                if (isExpanded.getValue().booleanValue()) {
                    Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifierOffset, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0), false, null, false, 12, null);
                    Orientation orientation2 = Orientation.Vertical;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged9 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(mutableState4);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9) {
                        objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierDraggable = DraggableKt.draggable(modifierVerticalScroll$default2, DraggableKt.rememberDraggableState((Function1) objRememberedValue11, composerStartRestartGroup, 0), orientation2, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? new DraggableKt.C06311(null) : null, (252 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : null, (252 & 128) != 0 ? false : false);
                } else {
                    modifierDraggable = modifierOffset;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen4 = modifierM513heightInVpY3zN4$default2.then(modifierDraggable);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO00o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen4);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyOooO00o2, composerM1320constructorimpl, currentCompositionLocalMap2);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    annotatedStringSubSequence = (AnnotatedString) mutableState2.getValue();
                }
                Modifier modifierThen5 = modifier3.then(modifierPointerInput2);
                composerStartRestartGroup.startReplaceableGroup(-459443643);
                if (isExpanded.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged8 = composerStartRestartGroup.changed(mutableState4);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8) {
                        objRememberedValue10 = new OooOOO0(mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new OooOOO0(mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierOffset = OffsetKt.offset(modifierOffset, (Function1) objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen6 = modifierThen5.then(modifierOffset);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged5 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(density);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    objRememberedValue7 = new OooOOO(density, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new OooOOO(density, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierThen6, (Function1) objRememberedValue7);
                PlatformTextStyle platformTextStyle2 = new PlatformTextStyle(true);
                long j3 = o0O0o.f48107OooOOo;
                FontWeight medium3 = FontWeight.INSTANCE.getMedium();
                long sp3 = TextUnitKt.getSp(14);
                if (p596o0oo000O.OooO0o.OooO0o0()) {
                    textDirectionM3687boximpl = null;
                } else {
                    textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                }
                TextStyle textStyle3 = new TextStyle(j3, sp3, medium3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle2, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187384, (DefaultConstructorMarker) null);
                int iM3729getEllipsisgIe3tQ9 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                if (isExpanded.getValue().booleanValue()) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = 2;
                }
                int i15 = i9;
                HashMap<String, InlineTextContent> map2 = f54307OooO0O0;
                objArr2 = new Object[]{isExpanded, mutableState, mutableIntState, mutableState3, function5};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged6 = false;
                while (i10 < 5) {
                    zChanged6 |= composerStartRestartGroup.changed(objArr2[i10]);
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    OooOOOO oooOOOO2 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                    composerStartRestartGroup.updateRememberedValue(oooOOOO2);
                    objRememberedValue8 = oooOOOO2;
                } else {
                    OooOOOO oooOOOO3 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                    composerStartRestartGroup.updateRememberedValue(oooOOOO3);
                    objRememberedValue8 = oooOOOO3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifier2 = modifier3;
                BasicTextKt.m736BasicTextRWo7tUw(annotatedStringSubSequence, modifierOnGloballyPositioned2, textStyle3, (Function1) objRememberedValue8, iM3729getEllipsisgIe3tQ9, true, i15, 0, map2, null, composerStartRestartGroup, 134438912, 640);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    if (isExpanded.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-231666893);
                        strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_less, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-231666835);
                        strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_more, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    String str2 = strStringResource;
                    long sp4 = TextUnitKt.getSp(14);
                    long j4 = o0O0o.f48103OooOOO;
                    FontWeight medium4 = FontWeight.INSTANCE.getMedium();
                    TextStyle textStyle4 = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
                    Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 13, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged7 = composerStartRestartGroup.changed(isExpanded);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue9 = new OooOo00(isExpanded);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        objRememberedValue9 = new OooOo00(isExpanded);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextKt.m1261Text4IGK_g(str2, ClickableKt.m204clickableXHw0xAI$default(modifierM482paddingqDBjuR0$default2, false, null, null, (Function0) objRememberedValue9, 7, null), j4, sp4, (FontStyle) null, medium4, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle4, composerStartRestartGroup, 199680, 0, 65488);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function6 = function5;
                list3 = list2;
            } else {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i12 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i13 != 0) {
                    function3 = null;
                }
                if (i4 != 0) {
                    function5 = OooOO0.f54345OooO0Oo;
                } else {
                    function5 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-869516808, i3, -1, "com.yalla.yalla.ui.composable.moment.utils.VideoMomentRichText (MomentContentUtils.kt:323)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(content);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(content);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i6 = 0;
                if (zChanged2) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableIntState = (MutableIntState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState3 = (MutableState) objRememberedValue4;
                Modifier.Companion companion6 = Modifier.INSTANCE;
                objArr = new Object[]{mutableState3, mutableState2, Boolean.valueOf(zBooleanValue), mutableState, isExpanded};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i6 < i7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i6]);
                    i6++;
                }
                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    obj = oooo002;
                    Oooo000 oooo003 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(obj);
                    i8 = -492369756;
                } else {
                    obj = oooo003;
                    Oooo000 oooo004 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(obj);
                    i8 = -492369756;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput3 = SuspendingPointerInputFilterKt.pointerInput(companion6, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) obj);
                composerStartRestartGroup.startReplaceableGroup(i8);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4 = (MutableState) objRememberedValue5;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState4.setValue(Float.valueOf(0.0f));
                }
                composerStartRestartGroup.startReplaceableGroup(i8);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState5 = (MutableState) objRememberedValue6;
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                modifierOffset = Modifier.INSTANCE;
                Modifier modifierM513heightInVpY3zN4$default3 = SizeKt.m513heightInVpY3zN4$default(modifierOffset, 0.0f, Dp.m3775constructorimpl(180), 1, null);
                composerStartRestartGroup.startReplaceableGroup(-231670017);
                if (isExpanded.getValue().booleanValue()) {
                    Modifier modifierVerticalScroll$default3 = ScrollKt.verticalScroll$default(modifierOffset, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0), false, null, false, 12, null);
                    Orientation orientation3 = Orientation.Vertical;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged9 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(mutableState4);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9) {
                        objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierDraggable = DraggableKt.draggable(modifierVerticalScroll$default3, DraggableKt.rememberDraggableState((Function1) objRememberedValue11, composerStartRestartGroup, 0), orientation3, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? new DraggableKt.C06311(null) : null, (252 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : null, (252 & 128) != 0 ? false : false);
                } else {
                    modifierDraggable = modifierOffset;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen7 = modifierM513heightInVpY3zN4$default3.then(modifierDraggable);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO00o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor = companion7.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyOooO00o3, composerM1320constructorimpl, currentCompositionLocalMap3);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    annotatedStringSubSequence = (AnnotatedString) mutableState2.getValue();
                }
                Modifier modifierThen8 = modifier3.then(modifierPointerInput3);
                composerStartRestartGroup.startReplaceableGroup(-459443643);
                if (isExpanded.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged8 = composerStartRestartGroup.changed(mutableState4);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8) {
                        objRememberedValue10 = new OooOOO0(mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new OooOOO0(mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierOffset = OffsetKt.offset(modifierOffset, (Function1) objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen9 = modifierThen8.then(modifierOffset);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged5 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(density);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    objRememberedValue7 = new OooOOO(density, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new OooOOO(density, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierThen9, (Function1) objRememberedValue7);
                PlatformTextStyle platformTextStyle3 = new PlatformTextStyle(true);
                long j5 = o0O0o.f48107OooOOo;
                FontWeight medium5 = FontWeight.INSTANCE.getMedium();
                long sp5 = TextUnitKt.getSp(14);
                if (p596o0oo000O.OooO0o.OooO0o0()) {
                    textDirectionM3687boximpl = null;
                } else {
                    textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                }
                TextStyle textStyle5 = new TextStyle(j5, sp5, medium5, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle3, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187384, (DefaultConstructorMarker) null);
                int iM3729getEllipsisgIe3tQ10 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                if (isExpanded.getValue().booleanValue()) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = 2;
                }
                int i16 = i9;
                HashMap<String, InlineTextContent> map3 = f54307OooO0O0;
                objArr2 = new Object[]{isExpanded, mutableState, mutableIntState, mutableState3, function5};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged6 = false;
                while (i10 < 5) {
                    zChanged6 |= composerStartRestartGroup.changed(objArr2[i10]);
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    OooOOOO oooOOOO4 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                    composerStartRestartGroup.updateRememberedValue(oooOOOO4);
                    objRememberedValue8 = oooOOOO4;
                } else {
                    OooOOOO oooOOOO5 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                    composerStartRestartGroup.updateRememberedValue(oooOOOO5);
                    objRememberedValue8 = oooOOOO5;
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifier2 = modifier3;
                BasicTextKt.m736BasicTextRWo7tUw(annotatedStringSubSequence, modifierOnGloballyPositioned3, textStyle5, (Function1) objRememberedValue8, iM3729getEllipsisgIe3tQ10, true, i16, 0, map3, null, composerStartRestartGroup, 134438912, 640);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    if (isExpanded.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-231666893);
                        strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_less, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-231666835);
                        strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_more, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    String str3 = strStringResource;
                    long sp6 = TextUnitKt.getSp(14);
                    long j6 = o0O0o.f48103OooOOO;
                    FontWeight medium6 = FontWeight.INSTANCE.getMedium();
                    TextStyle textStyle6 = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
                    Modifier modifierM482paddingqDBjuR0$default3 = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 13, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged7 = composerStartRestartGroup.changed(isExpanded);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue9 = new OooOo00(isExpanded);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        objRememberedValue9 = new OooOo00(isExpanded);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextKt.m1261Text4IGK_g(str3, ClickableKt.m204clickableXHw0xAI$default(modifierM482paddingqDBjuR0$default3, false, null, null, (Function0) objRememberedValue9, 7, null), j6, sp6, (FontStyle) null, medium6, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle6, composerStartRestartGroup, 199680, 0, 65488);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function6 = function5;
                list3 = list2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(modifier2, content, isExpanded, list3, function3, function6, i, i2));
        }
        i3 |= 24576;
        function3 = function1;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((458752 & i) == 0) {
                function4 = function2;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if (i12 != 8) {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i12 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i13 != 0) {
                    function3 = null;
                }
                if (i4 != 0) {
                    function5 = OooOO0.f54345OooO0Oo;
                } else {
                    function5 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-869516808, i3, -1, "com.yalla.yalla.ui.composable.moment.utils.VideoMomentRichText (MomentContentUtils.kt:323)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(content);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(content);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i6 = 0;
                if (zChanged2) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableIntState = (MutableIntState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState3 = (MutableState) objRememberedValue4;
                Modifier.Companion companion8 = Modifier.INSTANCE;
                objArr = new Object[]{mutableState3, mutableState2, Boolean.valueOf(zBooleanValue), mutableState, isExpanded};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i6 < i7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i6]);
                    i6++;
                }
                Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    obj = oooo004;
                    Oooo000 oooo005 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(obj);
                    i8 = -492369756;
                } else {
                    obj = oooo005;
                    Oooo000 oooo006 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(obj);
                    i8 = -492369756;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput4 = SuspendingPointerInputFilterKt.pointerInput(companion8, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) obj);
                composerStartRestartGroup.startReplaceableGroup(i8);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4 = (MutableState) objRememberedValue5;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState4.setValue(Float.valueOf(0.0f));
                }
                composerStartRestartGroup.startReplaceableGroup(i8);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState5 = (MutableState) objRememberedValue6;
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                modifierOffset = Modifier.INSTANCE;
                Modifier modifierM513heightInVpY3zN4$default4 = SizeKt.m513heightInVpY3zN4$default(modifierOffset, 0.0f, Dp.m3775constructorimpl(180), 1, null);
                composerStartRestartGroup.startReplaceableGroup(-231670017);
                if (isExpanded.getValue().booleanValue()) {
                    Modifier modifierVerticalScroll$default4 = ScrollKt.verticalScroll$default(modifierOffset, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0), false, null, false, 12, null);
                    Orientation orientation4 = Orientation.Vertical;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged9 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(mutableState4);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9) {
                        objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierDraggable = DraggableKt.draggable(modifierVerticalScroll$default4, DraggableKt.rememberDraggableState((Function1) objRememberedValue11, composerStartRestartGroup, 0), orientation4, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? new DraggableKt.C06311(null) : null, (252 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : null, (252 & 128) != 0 ? false : false);
                } else {
                    modifierDraggable = modifierOffset;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen10 = modifierM513heightInVpY3zN4$default4.then(modifierDraggable);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO00o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                constructor = companion9.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierThen10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl, measurePolicyOooO00o4, composerM1320constructorimpl, currentCompositionLocalMap4);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    annotatedStringSubSequence = (AnnotatedString) mutableState2.getValue();
                }
                Modifier modifierThen11 = modifier3.then(modifierPointerInput4);
                composerStartRestartGroup.startReplaceableGroup(-459443643);
                if (isExpanded.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged8 = composerStartRestartGroup.changed(mutableState4);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8) {
                        objRememberedValue10 = new OooOOO0(mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new OooOOO0(mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierOffset = OffsetKt.offset(modifierOffset, (Function1) objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen12 = modifierThen11.then(modifierOffset);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged5 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(density);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    objRememberedValue7 = new OooOOO(density, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new OooOOO(density, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOnGloballyPositioned4 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierThen12, (Function1) objRememberedValue7);
                PlatformTextStyle platformTextStyle4 = new PlatformTextStyle(true);
                long j7 = o0O0o.f48107OooOOo;
                FontWeight medium7 = FontWeight.INSTANCE.getMedium();
                long sp7 = TextUnitKt.getSp(14);
                if (p596o0oo000O.OooO0o.OooO0o0()) {
                    textDirectionM3687boximpl = null;
                } else {
                    textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                }
                TextStyle textStyle7 = new TextStyle(j7, sp7, medium7, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle4, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187384, (DefaultConstructorMarker) null);
                int iM3729getEllipsisgIe3tQ11 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                if (isExpanded.getValue().booleanValue()) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = 2;
                }
                int i17 = i9;
                HashMap<String, InlineTextContent> map4 = f54307OooO0O0;
                objArr2 = new Object[]{isExpanded, mutableState, mutableIntState, mutableState3, function5};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged6 = false;
                while (i10 < 5) {
                    zChanged6 |= composerStartRestartGroup.changed(objArr2[i10]);
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    OooOOOO oooOOOO6 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                    composerStartRestartGroup.updateRememberedValue(oooOOOO6);
                    objRememberedValue8 = oooOOOO6;
                } else {
                    OooOOOO oooOOOO7 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                    composerStartRestartGroup.updateRememberedValue(oooOOOO7);
                    objRememberedValue8 = oooOOOO7;
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifier2 = modifier3;
                BasicTextKt.m736BasicTextRWo7tUw(annotatedStringSubSequence, modifierOnGloballyPositioned4, textStyle7, (Function1) objRememberedValue8, iM3729getEllipsisgIe3tQ11, true, i17, 0, map4, null, composerStartRestartGroup, 134438912, 640);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    if (isExpanded.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-231666893);
                        strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_less, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-231666835);
                        strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_more, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    String str4 = strStringResource;
                    long sp8 = TextUnitKt.getSp(14);
                    long j8 = o0O0o.f48103OooOOO;
                    FontWeight medium8 = FontWeight.INSTANCE.getMedium();
                    TextStyle textStyle8 = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
                    Modifier modifierM482paddingqDBjuR0$default4 = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 13, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged7 = composerStartRestartGroup.changed(isExpanded);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue9 = new OooOo00(isExpanded);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        objRememberedValue9 = new OooOo00(isExpanded);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextKt.m1261Text4IGK_g(str4, ClickableKt.m204clickableXHw0xAI$default(modifierM482paddingqDBjuR0$default4, false, null, null, (Function0) objRememberedValue9, 7, null), j8, sp8, (FontStyle) null, medium8, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle8, composerStartRestartGroup, 199680, 0, 65488);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function6 = function5;
                list3 = list2;
            } else {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i12 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i13 != 0) {
                    function3 = null;
                }
                if (i4 != 0) {
                    function5 = OooOO0.f54345OooO0Oo;
                } else {
                    function5 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-869516808, i3, -1, "com.yalla.yalla.ui.composable.moment.utils.VideoMomentRichText (MomentContentUtils.kt:323)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(content);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(content);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i6 = 0;
                if (zChanged2) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableIntState = (MutableIntState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState3 = (MutableState) objRememberedValue4;
                Modifier.Companion companion10 = Modifier.INSTANCE;
                objArr = new Object[]{mutableState3, mutableState2, Boolean.valueOf(zBooleanValue), mutableState, isExpanded};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i6 < i7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i6]);
                    i6++;
                }
                Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    obj = oooo006;
                    Oooo000 oooo007 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(obj);
                    i8 = -492369756;
                } else {
                    obj = oooo007;
                    Oooo000 oooo008 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(obj);
                    i8 = -492369756;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput5 = SuspendingPointerInputFilterKt.pointerInput(companion10, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) obj);
                composerStartRestartGroup.startReplaceableGroup(i8);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4 = (MutableState) objRememberedValue5;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState4.setValue(Float.valueOf(0.0f));
                }
                composerStartRestartGroup.startReplaceableGroup(i8);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState5 = (MutableState) objRememberedValue6;
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                modifierOffset = Modifier.INSTANCE;
                Modifier modifierM513heightInVpY3zN4$default5 = SizeKt.m513heightInVpY3zN4$default(modifierOffset, 0.0f, Dp.m3775constructorimpl(180), 1, null);
                composerStartRestartGroup.startReplaceableGroup(-231670017);
                if (isExpanded.getValue().booleanValue()) {
                    Modifier modifierVerticalScroll$default5 = ScrollKt.verticalScroll$default(modifierOffset, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0), false, null, false, 12, null);
                    Orientation orientation5 = Orientation.Vertical;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged9 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(mutableState4);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9) {
                        objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierDraggable = DraggableKt.draggable(modifierVerticalScroll$default5, DraggableKt.rememberDraggableState((Function1) objRememberedValue11, composerStartRestartGroup, 0), orientation5, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? new DraggableKt.C06311(null) : null, (252 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : null, (252 & 128) != 0 ? false : false);
                } else {
                    modifierDraggable = modifierOffset;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen13 = modifierM513heightInVpY3zN4$default5.then(modifierDraggable);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooO00o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                constructor = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierThen13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11, composerM1320constructorimpl, measurePolicyOooO00o5, composerM1320constructorimpl, currentCompositionLocalMap5);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    annotatedStringSubSequence = (AnnotatedString) mutableState2.getValue();
                }
                Modifier modifierThen14 = modifier3.then(modifierPointerInput5);
                composerStartRestartGroup.startReplaceableGroup(-459443643);
                if (isExpanded.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged8 = composerStartRestartGroup.changed(mutableState4);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8) {
                        objRememberedValue10 = new OooOOO0(mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new OooOOO0(mutableState4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierOffset = OffsetKt.offset(modifierOffset, (Function1) objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen15 = modifierThen14.then(modifierOffset);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged5 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(density);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    objRememberedValue7 = new OooOOO(density, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new OooOOO(density, mutableState5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOnGloballyPositioned5 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierThen15, (Function1) objRememberedValue7);
                PlatformTextStyle platformTextStyle5 = new PlatformTextStyle(true);
                long j9 = o0O0o.f48107OooOOo;
                FontWeight medium9 = FontWeight.INSTANCE.getMedium();
                long sp9 = TextUnitKt.getSp(14);
                if (p596o0oo000O.OooO0o.OooO0o0()) {
                    textDirectionM3687boximpl = null;
                } else {
                    textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                }
                TextStyle textStyle9 = new TextStyle(j9, sp9, medium9, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle5, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187384, (DefaultConstructorMarker) null);
                int iM3729getEllipsisgIe3tQ12 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                if (isExpanded.getValue().booleanValue()) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = 2;
                }
                int i18 = i9;
                HashMap<String, InlineTextContent> map5 = f54307OooO0O0;
                objArr2 = new Object[]{isExpanded, mutableState, mutableIntState, mutableState3, function5};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged6 = false;
                while (i10 < 5) {
                    zChanged6 |= composerStartRestartGroup.changed(objArr2[i10]);
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    OooOOOO oooOOOO8 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                    composerStartRestartGroup.updateRememberedValue(oooOOOO8);
                    objRememberedValue8 = oooOOOO8;
                } else {
                    OooOOOO oooOOOO9 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                    composerStartRestartGroup.updateRememberedValue(oooOOOO9);
                    objRememberedValue8 = oooOOOO9;
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifier2 = modifier3;
                BasicTextKt.m736BasicTextRWo7tUw(annotatedStringSubSequence, modifierOnGloballyPositioned5, textStyle9, (Function1) objRememberedValue8, iM3729getEllipsisgIe3tQ12, true, i18, 0, map5, null, composerStartRestartGroup, 134438912, 640);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    if (isExpanded.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-231666893);
                        strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_less, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-231666835);
                        strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_more, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    String str5 = strStringResource;
                    long sp10 = TextUnitKt.getSp(14);
                    long j10 = o0O0o.f48103OooOOO;
                    FontWeight medium10 = FontWeight.INSTANCE.getMedium();
                    TextStyle textStyle10 = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
                    Modifier modifierM482paddingqDBjuR0$default5 = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 13, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged7 = composerStartRestartGroup.changed(isExpanded);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue9 = new OooOo00(isExpanded);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        objRememberedValue9 = new OooOo00(isExpanded);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextKt.m1261Text4IGK_g(str5, ClickableKt.m204clickableXHw0xAI$default(modifierM482paddingqDBjuR0$default5, false, null, null, (Function0) objRememberedValue9, 7, null), j10, sp10, (FontStyle) null, medium10, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle10, composerStartRestartGroup, 199680, 0, 65488);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function6 = function5;
                list3 = list2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(modifier2, content, isExpanded, list3, function3, function6, i, i2));
        }
        i3 |= 196608;
        function4 = function2;
        if (i12 != 8) {
            if (i11 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i12 != 0) {
                list2 = null;
            } else {
                list2 = list;
            }
            if (i13 != 0) {
                function3 = null;
            }
            if (i4 != 0) {
                function5 = OooOO0.f54345OooO0Oo;
            } else {
                function5 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-869516808, i3, -1, "com.yalla.yalla.ui.composable.moment.utils.VideoMomentRichText (MomentContentUtils.kt:323)");
            }
            zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(content);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(content);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            i6 = 0;
            if (zChanged2) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableIntState = (MutableIntState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState3 = (MutableState) objRememberedValue4;
            Modifier.Companion companion12 = Modifier.INSTANCE;
            objArr = new Object[]{mutableState3, mutableState2, Boolean.valueOf(zBooleanValue), mutableState, isExpanded};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged4 = false;
            while (i6 < i7) {
                zChanged4 |= composerStartRestartGroup.changed(objArr[i6]);
                i6++;
            }
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                obj = oooo008;
                Oooo000 oooo009 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(obj);
                i8 = -492369756;
            } else {
                obj = oooo009;
                Oooo000 oooo0010 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(obj);
                i8 = -492369756;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierPointerInput6 = SuspendingPointerInputFilterKt.pointerInput(companion12, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) obj);
            composerStartRestartGroup.startReplaceableGroup(i8);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState4 = (MutableState) objRememberedValue5;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                mutableState4.setValue(Float.valueOf(0.0f));
            }
            composerStartRestartGroup.startReplaceableGroup(i8);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState5 = (MutableState) objRememberedValue6;
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            modifierOffset = Modifier.INSTANCE;
            Modifier modifierM513heightInVpY3zN4$default6 = SizeKt.m513heightInVpY3zN4$default(modifierOffset, 0.0f, Dp.m3775constructorimpl(180), 1, null);
            composerStartRestartGroup.startReplaceableGroup(-231670017);
            if (isExpanded.getValue().booleanValue()) {
                Modifier modifierVerticalScroll$default6 = ScrollKt.verticalScroll$default(modifierOffset, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0), false, null, false, 12, null);
                Orientation orientation6 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged9 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(mutableState4);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged9) {
                    objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierDraggable = DraggableKt.draggable(modifierVerticalScroll$default6, DraggableKt.rememberDraggableState((Function1) objRememberedValue11, composerStartRestartGroup, 0), orientation6, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? new DraggableKt.C06311(null) : null, (252 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : null, (252 & 128) != 0 ? false : false);
            } else {
                modifierDraggable = modifierOffset;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen16 = modifierM513heightInVpY3zN4$default6.then(modifierDraggable);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooO00o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
            constructor = companion13.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierThen16);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion13, composerM1320constructorimpl, measurePolicyOooO00o6, composerM1320constructorimpl, currentCompositionLocalMap6);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                annotatedStringSubSequence = (AnnotatedString) mutableState2.getValue();
            }
            Modifier modifierThen17 = modifier3.then(modifierPointerInput6);
            composerStartRestartGroup.startReplaceableGroup(-459443643);
            if (isExpanded.getValue().booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged8 = composerStartRestartGroup.changed(mutableState4);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged8) {
                    objRememberedValue10 = new OooOOO0(mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new OooOOO0(mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierOffset = OffsetKt.offset(modifierOffset, (Function1) objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen18 = modifierThen17.then(modifierOffset);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged5 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(density);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged5) {
                objRememberedValue7 = new OooOOO(density, mutableState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new OooOOO(density, mutableState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOnGloballyPositioned6 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierThen18, (Function1) objRememberedValue7);
            PlatformTextStyle platformTextStyle6 = new PlatformTextStyle(true);
            long j11 = o0O0o.f48107OooOOo;
            FontWeight medium11 = FontWeight.INSTANCE.getMedium();
            long sp11 = TextUnitKt.getSp(14);
            if (p596o0oo000O.OooO0o.OooO0o0()) {
                textDirectionM3687boximpl = null;
            } else {
                textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
            }
            TextStyle textStyle11 = new TextStyle(j11, sp11, medium11, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle6, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187384, (DefaultConstructorMarker) null);
            int iM3729getEllipsisgIe3tQ13 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
            if (isExpanded.getValue().booleanValue()) {
                i9 = Integer.MAX_VALUE;
            } else {
                i9 = 2;
            }
            int i19 = i9;
            HashMap<String, InlineTextContent> map6 = f54307OooO0O0;
            objArr2 = new Object[]{isExpanded, mutableState, mutableIntState, mutableState3, function5};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged6 = false;
            while (i10 < 5) {
                zChanged6 |= composerStartRestartGroup.changed(objArr2[i10]);
            }
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged6) {
                OooOOOO oooOOOO10 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                composerStartRestartGroup.updateRememberedValue(oooOOOO10);
                objRememberedValue8 = oooOOOO10;
            } else {
                OooOOOO oooOOOO11 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                composerStartRestartGroup.updateRememberedValue(oooOOOO11);
                objRememberedValue8 = oooOOOO11;
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifier2 = modifier3;
            BasicTextKt.m736BasicTextRWo7tUw(annotatedStringSubSequence, modifierOnGloballyPositioned6, textStyle11, (Function1) objRememberedValue8, iM3729getEllipsisgIe3tQ13, true, i19, 0, map6, null, composerStartRestartGroup, 134438912, 640);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                if (isExpanded.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-231666893);
                    strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_less, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-231666835);
                    strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_more, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                String str6 = strStringResource;
                long sp12 = TextUnitKt.getSp(14);
                long j12 = o0O0o.f48103OooOOO;
                FontWeight medium12 = FontWeight.INSTANCE.getMedium();
                TextStyle textStyle12 = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
                Modifier modifierM482paddingqDBjuR0$default6 = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged7 = composerStartRestartGroup.changed(isExpanded);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChanged7) {
                    objRememberedValue9 = new OooOo00(isExpanded);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    objRememberedValue9 = new OooOo00(isExpanded);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1261Text4IGK_g(str6, ClickableKt.m204clickableXHw0xAI$default(modifierM482paddingqDBjuR0$default6, false, null, null, (Function0) objRememberedValue9, 7, null), j12, sp12, (FontStyle) null, medium12, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle12, composerStartRestartGroup, 199680, 0, 65488);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function6 = function5;
            list3 = list2;
        } else {
            if (i11 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i12 != 0) {
                list2 = null;
            } else {
                list2 = list;
            }
            if (i13 != 0) {
                function3 = null;
            }
            if (i4 != 0) {
                function5 = OooOO0.f54345OooO0Oo;
            } else {
                function5 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-869516808, i3, -1, "com.yalla.yalla.ui.composable.moment.utils.VideoMomentRichText (MomentContentUtils.kt:323)");
            }
            zBooleanValue = ((Boolean) composerStartRestartGroup.consume(o00OO000.f52248OooO0o)).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(content);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(content);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            i6 = 0;
            if (zChanged2) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableIntState = (MutableIntState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(list2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0o(function3, content, list2, null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState3 = (MutableState) objRememberedValue4;
            Modifier.Companion companion14 = Modifier.INSTANCE;
            objArr = new Object[]{mutableState3, mutableState2, Boolean.valueOf(zBooleanValue), mutableState, isExpanded};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged4 = false;
            while (i6 < i7) {
                zChanged4 |= composerStartRestartGroup.changed(objArr[i6]);
                i6++;
            }
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                obj = oooo0010;
                Oooo000 oooo0011 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(obj);
                i8 = -492369756;
            } else {
                obj = oooo0011;
                Oooo000 oooo0012 = new Oooo000(mutableState3, isExpanded, mutableState2, zBooleanValue, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(obj);
                i8 = -492369756;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierPointerInput7 = SuspendingPointerInputFilterKt.pointerInput(companion14, content, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) obj);
            composerStartRestartGroup.startReplaceableGroup(i8);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState4 = (MutableState) objRememberedValue5;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                mutableState4.setValue(Float.valueOf(0.0f));
            }
            composerStartRestartGroup.startReplaceableGroup(i8);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState5 = (MutableState) objRememberedValue6;
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            modifierOffset = Modifier.INSTANCE;
            Modifier modifierM513heightInVpY3zN4$default7 = SizeKt.m513heightInVpY3zN4$default(modifierOffset, 0.0f, Dp.m3775constructorimpl(180), 1, null);
            composerStartRestartGroup.startReplaceableGroup(-231670017);
            if (isExpanded.getValue().booleanValue()) {
                Modifier modifierVerticalScroll$default7 = ScrollKt.verticalScroll$default(modifierOffset, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0), false, null, false, 12, null);
                Orientation orientation7 = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged9 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(mutableState4);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged9) {
                    objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new OooOO0O(density, mutableState5, mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierDraggable = DraggableKt.draggable(modifierVerticalScroll$default7, DraggableKt.rememberDraggableState((Function1) objRememberedValue11, composerStartRestartGroup, 0), orientation7, (252 & 4) != 0, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? new DraggableKt.C06311(null) : null, (252 & 64) != 0 ? new DraggableKt.AnonymousClass2(null) : null, (252 & 128) != 0 ? false : false);
            } else {
                modifierDraggable = modifierOffset;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen19 = modifierM513heightInVpY3zN4$default7.then(modifierDraggable);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o7 = androidx.compose.material.OooO00o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
            constructor = companion15.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierThen19);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1320constructorimpl, measurePolicyOooO00o7, composerM1320constructorimpl, currentCompositionLocalMap7);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                annotatedStringSubSequence = (AnnotatedString) mutableState2.getValue();
            }
            Modifier modifierThen110 = modifier3.then(modifierPointerInput7);
            composerStartRestartGroup.startReplaceableGroup(-459443643);
            if (isExpanded.getValue().booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged8 = composerStartRestartGroup.changed(mutableState4);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged8) {
                    objRememberedValue10 = new OooOOO0(mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new OooOOO0(mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierOffset = OffsetKt.offset(modifierOffset, (Function1) objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen111 = modifierThen110.then(modifierOffset);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged5 = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changed(density);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged5) {
                objRememberedValue7 = new OooOOO(density, mutableState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new OooOOO(density, mutableState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOnGloballyPositioned7 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierThen111, (Function1) objRememberedValue7);
            PlatformTextStyle platformTextStyle7 = new PlatformTextStyle(true);
            long j13 = o0O0o.f48107OooOOo;
            FontWeight medium13 = FontWeight.INSTANCE.getMedium();
            long sp13 = TextUnitKt.getSp(14);
            if (p596o0oo000O.OooO0o.OooO0o0()) {
                textDirectionM3687boximpl = null;
            } else {
                textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
            }
            TextStyle textStyle13 = new TextStyle(j13, sp13, medium13, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle7, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187384, (DefaultConstructorMarker) null);
            int iM3729getEllipsisgIe3tQ14 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
            if (isExpanded.getValue().booleanValue()) {
                i9 = Integer.MAX_VALUE;
            } else {
                i9 = 2;
            }
            int i110 = i9;
            HashMap<String, InlineTextContent> map7 = f54307OooO0O0;
            objArr2 = new Object[]{isExpanded, mutableState, mutableIntState, mutableState3, function5};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged6 = false;
            while (i10 < 5) {
                zChanged6 |= composerStartRestartGroup.changed(objArr2[i10]);
            }
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged6) {
                OooOOOO oooOOOO12 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                composerStartRestartGroup.updateRememberedValue(oooOOOO12);
                objRememberedValue8 = oooOOOO12;
            } else {
                OooOOOO oooOOOO13 = new OooOOOO(isExpanded, mutableState3, function5, mutableState, mutableIntState);
                composerStartRestartGroup.updateRememberedValue(oooOOOO13);
                objRememberedValue8 = oooOOOO13;
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifier2 = modifier3;
            BasicTextKt.m736BasicTextRWo7tUw(annotatedStringSubSequence, modifierOnGloballyPositioned7, textStyle13, (Function1) objRememberedValue8, iM3729getEllipsisgIe3tQ14, true, i110, 0, map7, null, composerStartRestartGroup, 134438912, 640);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                if (isExpanded.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-231666893);
                    strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_less, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-231666835);
                    strStringResource = StringResources_androidKt.stringResource(o000OOo.video_feed_more, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                String str7 = strStringResource;
                long sp14 = TextUnitKt.getSp(14);
                long j14 = o0O0o.f48103OooOOO;
                FontWeight medium14 = FontWeight.INSTANCE.getMedium();
                TextStyle textStyle14 = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
                Modifier modifierM482paddingqDBjuR0$default7 = PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged7 = composerStartRestartGroup.changed(isExpanded);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChanged7) {
                    objRememberedValue9 = new OooOo00(isExpanded);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    objRememberedValue9 = new OooOo00(isExpanded);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1261Text4IGK_g(str7, ClickableKt.m204clickableXHw0xAI$default(modifierM482paddingqDBjuR0$default7, false, null, null, (Function0) objRememberedValue9, 7, null), j14, sp14, (FontStyle) null, medium14, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle14, composerStartRestartGroup, 199680, 0, 65488);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function6 = function5;
            list3 = list2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(modifier2, content, isExpanded, list3, function3, function6, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final float OooO0OO(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    public static final void OooO0Oo(int i, @NotNull String sHotKey) {
        Intrinsics.checkNotNullParameter(sHotKey, "sHotKey");
        HashMap<String, InlineTextContent> map = f54307OooO0O0;
        long sp = TextUnitKt.getSp(15);
        map.put(sHotKey, new InlineTextContent(new Placeholder(sp, sp, PlaceholderVerticalAlign.INSTANCE.m3255getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambdaInstance(-1592038581, true, new p539o0o0Oo00.OooO0o(i))));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final AnnotatedString OooO0o(@Nullable Function1<? super AnnotatedString.Builder, Unit> function1, @NotNull String text, @Nullable List<MomentSendContentAtModel> list, @Nullable MomentSendContentAtModel momentSendContentAtModel) {
        Triple triple;
        String name;
        String strOooO00o;
        String name2;
        Intrinsics.checkNotNullParameter(text, "text");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(text, "\n\n", "\n", false, 4, (Object) null);
        int i = 0;
        Sequence<MatchResult> sequenceFindAll$default = Regex.findAll$default((Regex) f54306OooO00o.getValue(), strReplace$default, 0, 2, null);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        if (function1 != null) {
            function1.invoke(builder);
        }
        if (momentSendContentAtModel != null) {
            if (momentSendContentAtModel.getName().length() > 0) {
                AnnotatedString annotatedStringAnnotatedString$default = AnnotatedStringKt.AnnotatedString$default(androidx.camera.core.impl.OooOOOO.OooO00o(o0000.OooO0OO(o000OOo.Reply_to), ": "), new SpanStyle(o0O0o.f48128Oooo0OO, 0L, (FontWeight) null, (FontStyle) (0 == true ? 1 : 0), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), null, 4, null);
                AnnotatedString annotatedStringAnnotatedString$default2 = AnnotatedStringKt.AnnotatedString$default(androidx.camera.core.impl.OooOOOO.OooO00o(momentSendContentAtModel.getName(), ": "), new SpanStyle(o0O0o.f48129Oooo0o, 0L, (FontWeight) null, (FontStyle) (0 == true ? 1 : 0), (FontSynthesis) (0 == true ? 1 : 0), (FontFamily) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 0L, (BaselineShift) null, (TextGeometricTransform) (0 == true ? 1 : 0), (LocaleList) (0 == true ? 1 : 0), 0L, (TextDecoration) null, (Shadow) (0 == true ? 1 : 0), (PlatformSpanStyle) (0 == true ? 1 : 0), (DrawStyle) (0 == true ? 1 : 0), 65534, (DefaultConstructorMarker) null), null, 4, null);
                builder.append(annotatedStringAnnotatedString$default);
                builder.append(annotatedStringAnnotatedString$default2);
                String uid = momentSendContentAtModel.getUid();
                int length = annotatedStringAnnotatedString$default2.length() + annotatedStringAnnotatedString$default.length();
                i = 0;
                builder.addStringAnnotation("userId", uid, 0, length);
            }
        }
        int last = i;
        for (MatchResult matchResult : sequenceFindAll$default) {
            builder.append(StringsKt.slice(strReplace$default, RangesKt.until(last, matchResult.getRange().getFirst())));
            char cFirst = StringsKt___StringsKt.first(matchResult.getValue());
            if (cFirst == '@') {
                String strSubstring = matchResult.getValue().substring(2, matchResult.getValue().length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                int iOooO0o = o0OoOo0.OooO0o(-1, strSubstring);
                if (iOooO0o < 0) {
                    triple = new Triple(o000000.Text, new AnnotatedString(matchResult.getValue(), null, null, 6, null), null);
                } else if (iOooO0o < (list != null ? list.size() : i)) {
                    MomentSendContentAtModel momentSendContentAtModel2 = list != null ? list.get(iOooO0o) : null;
                    if (p596o0oo000O.OooO0o.OooO0o0()) {
                        if (momentSendContentAtModel2 == null || (name2 = momentSendContentAtModel2.getName()) == null) {
                            name2 = "";
                        }
                        strOooO00o = p004OooO0oO.o000oOoO.OooO00o("\u2067@", name2, "\u2069");
                    } else {
                        if (momentSendContentAtModel2 == null || (name = momentSendContentAtModel2.getName()) == null) {
                            name = "";
                        }
                        strOooO00o = p004OooO0oO.o000oOoO.OooO00o("\u2066@", name, "\u2069");
                    }
                    triple = new Triple(o000000.AtUser, AnnotatedStringKt.AnnotatedString$default(strOooO00o, new SpanStyle(o0O0o.f48144Ooooo0o, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), null, 4, null), momentSendContentAtModel2 != null ? momentSendContentAtModel2.getUid() : null);
                } else {
                    triple = new Triple(o000000.Text, new AnnotatedString(matchResult.getValue(), null, null, 6, null), null);
                }
            } else {
                triple = cFirst == '/' ? new Triple(o000000.Image, new AnnotatedString(matchResult.getValue(), null, null, 6, null), null) : new Triple(o000000.Text, new AnnotatedString(matchResult.getValue(), null, null, 6, null), null);
            }
            o000000 o000000Var = (o000000) triple.component1();
            AnnotatedString annotatedString = (AnnotatedString) triple.component2();
            String str = (String) triple.component3();
            int i2 = Oooo0.$EnumSwitchMapping$0[o000000Var.ordinal()];
            if (i2 == 1) {
                InlineTextContentKt.appendInlineContent$default(builder, annotatedString.getText(), null, 2, null);
            } else if (i2 != 2) {
                builder.append(annotatedString);
            } else {
                int length2 = builder.getLength();
                builder.append(annotatedString);
                builder.addStringAnnotation("userId", str != null ? str : "", length2, annotatedString.getText().length() + length2);
            }
            last = matchResult.getRange().getLast() + 1;
        }
        if (SequencesKt.none(sequenceFindAll$default)) {
            builder.append(strReplace$default);
        } else {
            builder.append(StringsKt.slice(strReplace$default, new IntRange(last, StringsKt.getLastIndex(strReplace$default))));
        }
        return builder.toAnnotatedString();
    }

    public static final void OooO0o0(@NotNull AnnotatedString.Builder createAnnotateAtUserFirst, @Nullable String str, @Nullable Long l, long j, boolean z) {
        String strOooO0O0;
        Intrinsics.checkNotNullParameter(createAnnotateAtUserFirst, "$this$createAnnotateAtUserFirst");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (p596o0oo000O.OooO0o.OooO0o0()) {
            strOooO0O0 = o00Ooo.OooO0O0("\u2067", z ? "@" : "", str, ": \u2069");
        } else {
            strOooO0O0 = o00Ooo.OooO0O0("\u2066", z ? "@" : "", str, ": \u2069");
        }
        String str2 = strOooO0O0;
        int iPushStyle = createAnnotateAtUserFirst.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            createAnnotateAtUserFirst.append(str2);
            createAnnotateAtUserFirst.pushStringAnnotation("userId", String.valueOf(l));
        } finally {
            createAnnotateAtUserFirst.pop(iPushStyle);
        }
    }
}
