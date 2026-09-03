package p539o0o0OoOO;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000Ooo;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import com.google.accompanist.pager.Pager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.data.cache.SharedGifFaceManager;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.view.EmojiFaceView;
import com.yalla.yalla.ui.view.GifFaceTopBuyContainer;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p100o000oOoo.o0000O0;
import p100o000oOoo.o000O00O;
import p184o00o00o.Oooo000;
import p184o00o00o.o000oOoO;
import p408o0Oo0o0O.o00Oo0;
import p417o0OoO0.o00000O;
import p469o0OoooOO.o0oO0O0o;
import p539o0o0OoOO.u0;
import p539o0o0OoOO.w0;
import p539o0o0OoOO.y0;
import p579o0oOoo.oO00Oo00;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOO;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nFacePanelComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanelComp.kt\ncom/yalla/yalla/ui/view/FacePanelCompKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 12 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,364:1\n65#2,7:365\n72#2:400\n76#2:448\n78#3,11:372\n78#3,11:407\n91#3:442\n91#3:447\n78#3,11:460\n91#3:493\n456#4,8:383\n464#4,3:397\n456#4,8:418\n464#4,3:432\n467#4,3:439\n467#4,3:444\n456#4,8:471\n464#4,3:485\n467#4,3:490\n25#4:500\n4144#5,6:391\n4144#5,6:426\n4144#5,6:479\n72#6,6:401\n78#6:435\n82#6:443\n76#7:436\n76#7:453\n76#7:495\n154#8:437\n164#8:438\n154#8:449\n154#8:450\n154#8:451\n154#8:452\n154#8:489\n73#9,6:454\n79#9:488\n83#9:494\n486#10,4:496\n490#10,2:504\n494#10:510\n1097#11,3:501\n1100#11,3:507\n486#12:506\n*S KotlinDebug\n*F\n+ 1 FacePanelComp.kt\ncom/yalla/yalla/ui/view/FacePanelCompKt\n*L\n73#1:365,7\n73#1:400\n73#1:448\n73#1:372,11\n74#1:407,11\n74#1:442\n73#1:447\n199#1:460,11\n199#1:493\n73#1:383,8\n73#1:397,3\n74#1:418,8\n74#1:432,3\n74#1:439,3\n73#1:444,3\n199#1:471,8\n199#1:485,3\n199#1:490,3\n259#1:500\n73#1:391,6\n74#1:426,6\n199#1:479,6\n74#1:401,6\n74#1:435\n74#1:443\n81#1:436\n196#1:453\n258#1:495\n102#1:437\n150#1:438\n173#1:449\n174#1:450\n175#1:451\n184#1:452\n204#1:489\n199#1:454,6\n199#1:488\n199#1:494\n259#1:496,4\n259#1:504,2\n259#1:510\n259#1:501,3\n259#1:507,3\n259#1:506\n*E\n"})
public final class p0 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ y0 f55611OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55612OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, y0 y0Var) {
            super(2);
            this.f55611OooO0Oo = y0Var;
            this.f55612OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55612OooO0o0 | 1);
            p0.OooO0O0(this.f55611OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ y0 f55613OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(y0 y0Var) {
            super(0);
            this.f55613OooO0Oo = y0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            EditText editText;
            EmojiFaceView emojiFaceView = this.f55613OooO0Oo.f55757OooOO0O;
            if (emojiFaceView != null && (editText = emojiFaceView.getEditText()) != null) {
                editText.dispatchKeyEvent(new KeyEvent(0, 67));
                editText.dispatchKeyEvent(new KeyEvent(1, 67));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55614OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ y0 f55615OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f55616OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55617OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, Oooo000 oooo000, y0 y0Var, int i) {
            super(2);
            this.f55614OooO0Oo = boxScope;
            this.f55616OooO0o0 = oooo000;
            this.f55615OooO0o = y0Var;
            this.f55617OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55617OooO0oO | 1);
            Oooo000 oooo000 = this.f55616OooO0o0;
            y0 y0Var = this.f55615OooO0o;
            p0.OooO00o(this.f55614OooO0Oo, oooo000, y0Var, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.FacePanelCompKt$FacePanelComp$1$1$1", f = "FacePanelComp.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f55618OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ y0 f55619OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f55620OooO0o0;

        public static final class OooO00o extends Lambda implements Function0<Integer> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Oooo000 f55621OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Oooo000 oooo000) {
                super(0);
                this.f55621OooO0Oo = oooo000;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.f55621OooO0Oo.OooO0oO());
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.view.FacePanelCompKt$FacePanelComp$1$1$1$2", f = "FacePanelComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ int f55622OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ y0 f55623OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(y0 y0Var, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f55623OooO0o0 = y0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f55623OooO0o0, continuation);
                oooO0O0.f55622OooO0Oo = ((Number) obj).intValue();
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                int i = this.f55622OooO0Oo;
                y0 y0Var = this.f55623OooO0o0;
                if (y0Var.f55747OooO.get(i).f55737OooO0OO == 1) {
                    ((MutableLiveData) o00Oo0.OooO0o0().f45219OooO0O0.getValue()).postValue(Boxing.boxBoolean(true));
                    o0OO000.OooO0O0("102205", MapsKt.mapOf(new Pair("sources", Boxing.boxInt(oO00Oo00.f56561OooO00o ? 1 : 2))));
                }
                boolean z = i == 0;
                y0Var.f55749OooO0O0.setValue(Boolean.valueOf(z));
                Function1<? super Boolean, Unit> function1 = y0Var.f55748OooO00o;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Oooo000 oooo000, y0 y0Var, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f55620OooO0o0 = oooo000;
            this.f55619OooO0o = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f55620OooO0o0, this.f55619OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f55618OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new OooO00o(this.f55620OooO0o0));
                OooO0O0 oooO0O0 = new OooO0O0(this.f55619OooO0o, null);
                this.f55618OooO0Oo = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, oooO0O0, this) == coroutine_suspended) {
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

    @SourceDebugExtension({"SMAP\nFacePanelComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanelComp.kt\ncom/yalla/yalla/ui/view/FacePanelCompKt$FacePanelComp$1$1$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n25#2:365\n1097#3,6:366\n*S KotlinDebug\n*F\n+ 1 FacePanelComp.kt\ncom/yalla/yalla/ui/view/FacePanelCompKt$FacePanelComp$1$1$2\n*L\n109#1:365\n109#1:366,6\n*E\n"})
    public static final class OooO0o extends Lambda implements Function4<p184o00o00o.OooOo00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ y0 f55624OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f55625OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(y0 y0Var, Context context) {
            super(4);
            this.f55624OooO0Oo = y0Var;
            this.f55625OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(p184o00o00o.OooOo00 oooOo00, Integer num, Composer composer, Integer num2) {
            int i;
            p184o00o00o.OooOo00 HorizontalPager = oooOo00;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 112) == 0) {
                i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((i & 721) == 144 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(103726367, iIntValue2, -1, "com.yalla.yalla.ui.view.FacePanelComp.<anonymous>.<anonymous>.<anonymous> (FacePanelComp.kt:103)");
                }
                y0 y0Var = this.f55624OooO0Oo;
                if (iIntValue < y0Var.f55747OooO.size()) {
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        int i2 = y0Var.f55747OooO.get(iIntValue).f55735OooO00o;
                        Context context = this.f55625OooO0o0;
                        if (i2 != 1) {
                            objRememberedValue = i2 != 2 ? new GifFaceTopBuyContainer(context, null, 6, 0) : View.inflate(context, oO00OO0O.layout_face_panel_sticker, null);
                        } else {
                            objRememberedValue = View.inflate(context, oO00OO0O.layout_face_panel_emoji, null);
                        }
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(new q0((View) objRememberedValue), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new s0(iIntValue, y0Var), composer2, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nFacePanelComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanelComp.kt\ncom/yalla/yalla/ui/view/FacePanelCompKt$IndicatorContainer$1$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,364:1\n171#2,12:365\n*S KotlinDebug\n*F\n+ 1 FacePanelComp.kt\ncom/yalla/yalla/ui/view/FacePanelCompKt$IndicatorContainer$1$1\n*L\n206#1:365,12\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ y0 f55626OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Context f55627OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f55628OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(y0 y0Var, Oooo000 oooo000, Context context) {
            super(1);
            this.f55626OooO0Oo = y0Var;
            this.f55628OooO0o0 = oooo000;
            this.f55627OooO0o = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyRow = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            final y0 y0Var = this.f55626OooO0Oo;
            final SnapshotStateList<w0> snapshotStateList = y0Var.f55747OooO;
            int size = snapshotStateList.size();
            Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.view.FacePanelCompKt$IndicatorContainer$1$1$invoke$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    snapshotStateList.get(num.intValue());
                    return null;
                }
            };
            final Oooo000 oooo000 = this.f55628OooO0o0;
            final Context context = this.f55627OooO0o;
            LazyRow.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.view.FacePanelCompKt$IndicatorContainer$1$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i;
                    Modifier modifierOooO00o;
                    o0000O0 o0000o0OooO0OO;
                    LazyItemScope items = lazyItemScope;
                    int iIntValue = num.intValue();
                    Composer composer2 = composer;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i |= composer2.changed(iIntValue) ? 32 : 16;
                    }
                    if ((i & 731) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                        }
                        w0 w0Var = (w0) snapshotStateList.get(iIntValue);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(58)), 0.0f, 1, null);
                        Context context2 = context;
                        y0 y0Var2 = y0Var;
                        Oooo000 oooo001 = oooo000;
                        float f = 4;
                        Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(PaddingKt.m477paddingVpY3zN4(o0O0O00.OooO0O0(modifierFillMaxHeight$default, false, false, 0L, false, null, null, null, new u0(context2, y0Var2, iIntValue, oooo001), 253), Dp.m3765constructorimpl(5), Dp.m3765constructorimpl(f)), oooo001.OooO0oO() == iIntValue ? o0oO0O0o.f46975Oooo : o0oO0O0o.f46945OooO00o, RoundedCornerShapeKt.getCircleShape());
                        composer2.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU);
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
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (Intrinsics.areEqual(LiveDataAdapterKt.observeAsState((MutableLiveData) o00Oo0.OooO0o0().f45219OooO0O0.getValue(), composer2, 8).getValue(), Boolean.FALSE) && w0Var.f55737OooO0OO == 1) {
                            modifierOooO00o = o0000Ooo.OooO00o(companion, false, 0L, Dp.m3765constructorimpl(f), false, false, Dp.m3765constructorimpl(23), Dp.m3765constructorimpl(-2), Dp.m3765constructorimpl(1), 571);
                        } else {
                            modifierOooO00o = companion;
                        }
                        boolean zOooo00o = StringsKt.Oooo00o(w0Var.f55736OooO0O0, "android");
                        String str = w0Var.f55736OooO0O0;
                        if (zOooo00o) {
                            composer2.startReplaceableGroup(-2094636825);
                            o0000o0OooO0OO = o000O00O.OooO00o(Uri.parse(str), composer2);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-2094636736);
                            o0000o0OooO0OO = p417o0OoO0.o00Oo0.OooO0OO(str, null, composer2, 0, 1);
                            composer2.endReplaceableGroup();
                        }
                        ImageKt.Image(o0000o0OooO0OO, (String) null, OooOo.OooO0O0(6, boxScopeInstance.align(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(27)), companion2.getCenter()).then(modifierOooO00o)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                        if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f55629OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55630OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ y0 f55631OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Oooo000 oooo000, y0 y0Var, int i) {
            super(2);
            this.f55629OooO0Oo = oooo000;
            this.f55631OooO0o0 = y0Var;
            this.f55630OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55630OooO0o | 1);
            p0.OooO0OO(this.f55629OooO0Oo, this.f55631OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.FacePanelCompKt$LoadIndicatorData$2", f = "FacePanelComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f55632OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ y0 f55633OooO0o0;

        public static final class OooO00o implements Observer<List<? extends GifListJson>> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ y0 f55634OooO0Oo;

            public OooO00o(y0 y0Var) {
                this.f55634OooO0Oo = y0Var;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(List<? extends GifListJson> list) {
                List<? extends GifListJson> list2 = list;
                if (list2 != null) {
                    y0 y0Var = this.f55634OooO0Oo;
                    int size = y0Var.f55747OooO.size();
                    SnapshotStateList<w0> snapshotStateList = y0Var.f55747OooO;
                    if (size > 2) {
                        snapshotStateList.removeRange(2, snapshotStateList.size());
                    }
                    if (snapshotStateList.size() <= 2) {
                        for (GifListJson gifListJson : list2) {
                            snapshotStateList.add(new w0(3, androidx.camera.core.impl.OooOOOO.OooO00o(p139o00OOooO.OooO0o.OooO0Oo(StringsKt.removePrefix(gifListJson.getFolderName(), (CharSequence) "/")), gifListJson.getFolderIcon()), gifListJson.getBuyType(), new v0(new MutableLiveData(gifListJson))));
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(LifecycleOwner lifecycleOwner, y0 y0Var, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f55632OooO0Oo = lifecycleOwner;
            this.f55633OooO0o0 = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f55632OooO0Oo, this.f55633OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SharedGifFaceManager.f22774OooO00o.getClass();
            SharedGifFaceManager.f22777OooO0Oo.observe(this.f55632OooO0Oo, new OooO00o(this.f55633OooO0o0));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ y0 f55635OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55636OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i, y0 y0Var) {
            super(2);
            this.f55635OooO0Oo = y0Var;
            this.f55636OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55636OooO0o0 | 1);
            p0.OooO0Oo(this.f55635OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f55637OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ y0 f55638OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.view.FacePanelCompKt$LoadIndicatorData$3$onChanged$1", f = "FacePanelComp.kt", i = {}, l = {288, 289}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f55639OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ y0 f55640OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(y0 y0Var, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f55640OooO0o0 = y0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f55640OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f55639OooO0Oo;
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
                Oooo000 oooo000 = this.f55640OooO0o0.f55758OooOO0o;
                if (oooo000 != null) {
                    this.f55639OooO0Oo = 1;
                    Saver<Oooo000, ?> saver = Oooo000.f38642OooO0oo;
                    if (oooo000.OooOO0(0, 0.0f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                SharedGifFaceManager sharedGifFaceManager = SharedGifFaceManager.f22774OooO00o;
                this.f55639OooO0Oo = 2;
                if (sharedGifFaceManager.OooO00o(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public OooOOOO(CoroutineScope coroutineScope, y0 y0Var) {
            this.f55637OooO0Oo = coroutineScope;
            this.f55638OooO0o0 = y0Var;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BuildersKt__Builders_commonKt.launch$default(this.f55637OooO0Oo, null, null, new OooO00o(this.f55638OooO0o0, null), 3, null);
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ y0 f55641OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55642OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(int i, y0 y0Var) {
            super(2);
            this.f55641OooO0Oo = y0Var;
            this.f55642OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55642OooO0o0 | 1);
            p0.OooO0Oo(this.f55641OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(BoxScope boxScope, Oooo000 oooo000, y0 y0Var, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1944815508);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1944815508, i, -1, "com.yalla.yalla.ui.view.DeleteButton (FacePanelComp.kt:166)");
        }
        if (oooo000.OooO0oO() == 0) {
            Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_new_face_emoji_delete, composerStartRestartGroup, 0);
            float f = 50;
            Modifier modifierClip = ClipKt.clip(SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(7), Dp.m3765constructorimpl(f), 3, null), Dp.m3765constructorimpl(f)), Dp.m3765constructorimpl(35)), RoundedCornerShapeKt.getCircleShape());
            int i2 = o0oO0O0o.f47152o00OOOo;
            ImageKt.Image(painterPainterResource, (String) null, boxScope.align(PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(BackgroundKt.m169backgroundbw27NRU$default(modifierClip, o0oO0O0o.f47094o000ooO0, null, 2, null), false, null, null, new OooO00o(y0Var), 7, null), Dp.m3765constructorimpl(4)), Alignment.INSTANCE.getBottomEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, oooo000, y0Var, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull y0 facePanelState, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(facePanelState, "facePanelState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-987934946);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-987934946, i, -1, "com.yalla.yalla.ui.view.FacePanelComp (FacePanelComp.kt:69)");
        }
        Oooo000 oooo000OooO00o = o000oOoO.OooO00o(0, composerStartRestartGroup, 6, 0);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Modifier.Companion companion = Modifier.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        int i2 = o0oO0O0o.f47152o00OOOo;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierFillMaxSize$default, o0oO0O0o.f46946OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        facePanelState.f55758OooOO0o = oooo000OooO00o;
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        EffectsKt.LaunchedEffect(oooo000OooO00o, new OooO0OO(oooo000OooO00o, facePanelState, null), composerStartRestartGroup, 64);
        Pager.OooO00o(facePanelState.f55747OooO.size(), androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(360)), 1.0f, false, 2, null), oooo000OooO00o, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 103726367, true, new OooO0o(facePanelState, context)), composerStartRestartGroup, 0, 6, 1016);
        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl((float) 0.5d), BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0oO0O0o.f47088o000oo, null, 2, null), composerStartRestartGroup, 6, 0);
        OooO0OO(oooo000OooO00o, facePanelState, composerStartRestartGroup, 64);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        OooO00o(boxScopeInstance, oooo000OooO00o, facePanelState, composerStartRestartGroup, 518);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i, facePanelState));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(Oooo000 oooo000, y0 y0Var, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(415611944);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(415611944, i, -1, "com.yalla.yalla.ui.view.IndicatorContainer (FacePanelComp.kt:194)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Modifier.Companion companion = Modifier.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        LazyDslKt.LazyRow(SizeKt.m509height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), Dp.m3765constructorimpl(42)), null, null, false, null, null, null, false, new OooOO0(y0Var, oooo000, context), composerStartRestartGroup, 0, 254);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        OooO0Oo(y0Var, composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(oooo000, y0Var, i));
    }

    @Composable
    public static final void OooO0Oo(@NotNull y0 facePanelState, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(facePanelState, "facePanelState");
        Composer composerStartRestartGroup = composer.startRestartGroup(2042180123);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2042180123, i, -1, "com.yalla.yalla.ui.view.LoadIndicatorData (FacePanelComp.kt:252)");
        }
        if (!facePanelState.f55754OooO0oO) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(i, facePanelState));
            return;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        if (objOooO00o == Composer.INSTANCE.getEmpty()) {
            objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(facePanelState, new OooOOO(lifecycleOwner, facePanelState, null), composerStartRestartGroup, 72);
        Observable<Object> observable = LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT");
        Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.CHAT_FACE_HAS_SOLD_OUT)");
        o00000O.OooO00o(observable, new OooOOOO(coroutineScope, facePanelState), composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOo00(i, facePanelState));
    }
}
