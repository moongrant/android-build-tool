package p587o0oOooOO;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
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
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0000Ooo;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p121o00O0Ooo.o0000;
import p121o00O0Ooo.o000O0o;
import p184o00o00O0.OooO0OO;
import p230o00oOo0o.o00000;
import p230o00oOo0o.o000000;
import p230o00oOo0o.o0O0O00;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o000OO;
import p423o0OoO0OO.o00O0000;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.oo0o0Oo;
import p587o0oOooOO.n;
import p587o0oOooOO.r;
import p587o0oOooOO.t;
import p590o0oOooo0.oOOOoo00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFacePanelComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanelComp.kt\ncom/yalla/yalla/ui/view/FacePanelCompKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 12 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,364:1\n65#2,7:365\n72#2:400\n76#2:448\n78#3,11:372\n78#3,11:407\n91#3:442\n91#3:447\n78#3,11:460\n91#3:493\n456#4,8:383\n464#4,3:397\n456#4,8:418\n464#4,3:432\n467#4,3:439\n467#4,3:444\n456#4,8:471\n464#4,3:485\n467#4,3:490\n25#4:500\n4144#5,6:391\n4144#5,6:426\n4144#5,6:479\n72#6,6:401\n78#6:435\n82#6:443\n76#7:436\n76#7:453\n76#7:495\n154#8:437\n164#8:438\n154#8:449\n154#8:450\n154#8:451\n154#8:452\n154#8:489\n73#9,6:454\n79#9:488\n83#9:494\n486#10,4:496\n490#10,2:504\n494#10:510\n1097#11,3:501\n1100#11,3:507\n486#12:506\n*S KotlinDebug\n*F\n+ 1 FacePanelComp.kt\ncom/yalla/yalla/ui/view/FacePanelCompKt\n*L\n73#1:365,7\n73#1:400\n73#1:448\n73#1:372,11\n74#1:407,11\n74#1:442\n73#1:447\n199#1:460,11\n199#1:493\n73#1:383,8\n73#1:397,3\n74#1:418,8\n74#1:432,3\n74#1:439,3\n73#1:444,3\n199#1:471,8\n199#1:485,3\n199#1:490,3\n259#1:500\n73#1:391,6\n74#1:426,6\n199#1:479,6\n74#1:401,6\n74#1:435\n74#1:443\n81#1:436\n196#1:453\n258#1:495\n102#1:437\n150#1:438\n173#1:449\n174#1:450\n175#1:451\n184#1:452\n204#1:489\n199#1:454,6\n199#1:488\n199#1:494\n259#1:496,4\n259#1:504,2\n259#1:510\n259#1:501,3\n259#1:507,3\n259#1:506\n*E\n"})
public final class i {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ t f56811OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56812OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, t tVar) {
            super(2);
            this.f56811OooO0Oo = tVar;
            this.f56812OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56812OooO0o0 | 1);
            i.OooO0O0(this.f56811OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ t f56813OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(t tVar) {
            super(0);
            this.f56813OooO0Oo = tVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            EditText editText;
            EmojiFaceView emojiFaceView = this.f56813OooO0Oo.f56985OooOO0O;
            if (emojiFaceView != null && (editText = emojiFaceView.getEditText()) != null) {
                editText.dispatchKeyEvent(new KeyEvent(0, 67));
                editText.dispatchKeyEvent(new KeyEvent(1, 67));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f56814OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ t f56815OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000000 f56816OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f56817OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, o000000 o000000Var, t tVar, int i) {
            super(2);
            this.f56814OooO0Oo = boxScope;
            this.f56816OooO0o0 = o000000Var;
            this.f56815OooO0o = tVar;
            this.f56817OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56817OooO0oO | 1);
            o000000 o000000Var = this.f56816OooO0o0;
            t tVar = this.f56815OooO0o;
            i.OooO00o(this.f56814OooO0Oo, o000000Var, tVar, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.FacePanelCompKt$FacePanelComp$1$1$1", f = "FacePanelComp.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56818OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ t f56819OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000000 f56820OooO0o0;

        public static final class OooO00o extends Lambda implements Function0<Integer> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o000000 f56821OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o000000 o000000Var) {
                super(0);
                this.f56821OooO0Oo = o000000Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.f56821OooO0Oo.OooO0oO());
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.view.FacePanelCompKt$FacePanelComp$1$1$1$2", f = "FacePanelComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ int f56822OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ t f56823OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(t tVar, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f56823OooO0o0 = tVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f56823OooO0o0, continuation);
                oooO0O0.f56822OooO0Oo = ((Number) obj).intValue();
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
                int i = this.f56822OooO0Oo;
                t tVar = this.f56823OooO0o0;
                if (tVar.f56975OooO.get(i).f56941OooO0OO == 1) {
                    ((MutableLiveData) o00Ooo.OooO0o0().f46399OooO0O0.getValue()).postValue(Boxing.boxBoolean(true));
                    o0oo0000.OooO00o.OooO0OO("102205", MapsKt.mapOf(new Pair("sources", Boxing.boxInt(oOOOoo00.f57236OooO00o ? 1 : 2))));
                }
                boolean z = i == 0;
                tVar.f56977OooO0O0.setValue(Boolean.valueOf(z));
                Function1<? super Boolean, Unit> function1 = tVar.f56976OooO00o;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000000 o000000Var, t tVar, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f56820OooO0o0 = o000000Var;
            this.f56819OooO0o = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f56820OooO0o0, this.f56819OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56818OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new OooO00o(this.f56820OooO0o0));
                OooO0O0 oooO0O0 = new OooO0O0(this.f56819OooO0o, null);
                this.f56818OooO0Oo = 1;
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
    public static final class OooO0o extends Lambda implements Function4<o0O0O00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ t f56824OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f56825OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(t tVar, Context context) {
            super(4);
            this.f56824OooO0Oo = tVar;
            this.f56825OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
            o0O0O00 HorizontalPager = o0o0o00;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 112) == 0) {
                iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(103726367, iIntValue2, -1, "com.yalla.yalla.ui.view.FacePanelComp.<anonymous>.<anonymous>.<anonymous> (FacePanelComp.kt:104)");
                }
                t tVar = this.f56824OooO0Oo;
                if (iIntValue < tVar.f56975OooO.size()) {
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        int i = tVar.f56975OooO.get(iIntValue).f56939OooO00o;
                        Context context = this.f56825OooO0o0;
                        if (i != 1) {
                            objRememberedValue = i != 2 ? new GifFaceTopBuyContainer(context, null, 6, 0) : View.inflate(context, oo0o0Oo.layout_face_panel_sticker, null);
                        } else {
                            objRememberedValue = View.inflate(context, oo0o0Oo.layout_face_panel_emoji, null);
                        }
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(new j((View) objRememberedValue), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new l(iIntValue, tVar), composer2, 48, 0);
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
        public final /* synthetic */ t f56826OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Context f56827OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000000 f56828OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(t tVar, o000000 o000000Var, Context context) {
            super(1);
            this.f56826OooO0Oo = tVar;
            this.f56828OooO0o0 = o000000Var;
            this.f56827OooO0o = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyRow = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            final t tVar = this.f56826OooO0Oo;
            final SnapshotStateList<r> snapshotStateList = tVar.f56975OooO;
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
            final o000000 o000000Var = this.f56828OooO0o0;
            final Context context = this.f56827OooO0o;
            LazyRow.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.view.FacePanelCompKt$IndicatorContainer$1$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i;
                    Modifier modifierOooO00o;
                    o0000 o0000VarOooO0OO;
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
                        r rVar = (r) snapshotStateList.get(iIntValue);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(58)), 0.0f, 1, null);
                        Context context2 = context;
                        t tVar2 = tVar;
                        o000000 o000000Var2 = o000000Var;
                        float f = 4;
                        Modifier modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(PaddingKt.m479paddingVpY3zN4(com.code.android.util.o0O0O00.OooO0O0(modifierFillMaxHeight$default, false, false, 0L, false, null, null, null, new n(context2, tVar2, iIntValue, o000000Var2), 253), Dp.m3775constructorimpl(5), Dp.m3775constructorimpl(f)), o000000Var2.OooO0oO() == iIntValue ? o0OOo000.f48177OoooO00 : o0OOo000.f48134OooO00o, RoundedCornerShapeKt.getCircleShape());
                        composer2.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM170backgroundbw27NRU);
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
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (Intrinsics.areEqual(LiveDataAdapterKt.observeAsState((MutableLiveData) o00Ooo.OooO0o0().f46399OooO0O0.getValue(), composer2, 8).getValue(), Boolean.FALSE) && rVar.f56941OooO0OO == 1) {
                            modifierOooO00o = o0000Ooo.OooO00o(companion, false, 0L, Dp.m3775constructorimpl(f), false, false, Dp.m3775constructorimpl(23), Dp.m3775constructorimpl(-2), Dp.m3775constructorimpl(1), 571);
                        } else {
                            modifierOooO00o = companion;
                        }
                        boolean zStartsWith$default = StringsKt__StringsJVMKt.startsWith$default(rVar.f56940OooO0O0, "android", false, 2, null);
                        String str = rVar.f56940OooO0O0;
                        if (zStartsWith$default) {
                            composer2.startReplaceableGroup(-2094636825);
                            o0000VarOooO0OO = o000O0o.OooO00o(Uri.parse(str), composer2);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-2094636736);
                            o0000VarOooO0OO = o000OO.OooO0OO(str, null, composer2, 0, 1);
                            composer2.endReplaceableGroup();
                        }
                        ImageKt.Image(o0000VarOooO0OO, (String) null, o00O0O0.OooO00o(6, boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(27)), companion2.getCenter()).then(modifierOooO00o)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                        if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
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
        public final /* synthetic */ o000000 f56829OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f56830OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ t f56831OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o000000 o000000Var, t tVar, int i) {
            super(2);
            this.f56829OooO0Oo = o000000Var;
            this.f56831OooO0o0 = tVar;
            this.f56830OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56830OooO0o | 1);
            i.OooO0OO(this.f56829OooO0Oo, this.f56831OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.FacePanelCompKt$LoadIndicatorData$2", f = "FacePanelComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f56832OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ t f56833OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(LifecycleOwner lifecycleOwner, t tVar, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f56832OooO0Oo = lifecycleOwner;
            this.f56833OooO0o0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f56832OooO0Oo, this.f56833OooO0o0, continuation);
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
            SharedGifFaceManager.f22301OooO00o.getClass();
            MutableLiveData<List<GifListJson>> mutableLiveData = SharedGifFaceManager.f22304OooO0Oo;
            final t tVar = this.f56833OooO0o0;
            mutableLiveData.observe(this.f56832OooO0Oo, new Observer() { // from class: o0oOooOO.p
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    List<GifListJson> list = (List) obj2;
                    if (list != null) {
                        t tVar2 = tVar;
                        int size = tVar2.f56975OooO.size();
                        SnapshotStateList<r> snapshotStateList = tVar2.f56975OooO;
                        if (size > 2) {
                            snapshotStateList.removeRange(2, snapshotStateList.size());
                        }
                        if (snapshotStateList.size() <= 2) {
                            for (GifListJson gifListJson : list) {
                                snapshotStateList.add(new r(3, OooOOOO.OooO00o(OooO0OO.OooO0Oo(StringsKt.removePrefix(gifListJson.getFolderName(), (CharSequence) "/")), gifListJson.getFolderIcon()), gifListJson.getBuyType(), new q(new MutableLiveData(gifListJson))));
                            }
                        }
                    }
                }
            });
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ t f56834OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56835OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i, t tVar) {
            super(2);
            this.f56834OooO0Oo = tVar;
            this.f56835OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56835OooO0o0 | 1);
            i.OooO0Oo(this.f56834OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.FacePanelCompKt$LoadIndicatorData$3$1", f = "FacePanelComp.kt", i = {}, l = {288, 289}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56836OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ t f56837OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(t tVar, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f56837OooO0o0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f56837OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56836OooO0Oo;
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
            o000000 o000000Var = this.f56837OooO0o0.f56986OooOO0o;
            if (o000000Var != null) {
                this.f56836OooO0Oo = 1;
                Saver<o000000, ?> saver = o000000.f39751OooO0oo;
                if (o000000Var.OooOO0(0, 0.0f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            SharedGifFaceManager sharedGifFaceManager = SharedGifFaceManager.f22301OooO00o;
            this.f56836OooO0Oo = 2;
            if (sharedGifFaceManager.OooO00o(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ t f56838OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f56839OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(int i, t tVar) {
            super(2);
            this.f56838OooO0Oo = tVar;
            this.f56839OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56839OooO0o0 | 1);
            i.OooO0Oo(this.f56838OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(BoxScope boxScope, o000000 o000000Var, t tVar, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1944815508);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1944815508, i, -1, "com.yalla.yalla.ui.view.DeleteButton (FacePanelComp.kt:166)");
        }
        if (o000000Var.OooO0oO() == 0) {
            Painter painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_new_face_emoji_delete, composerStartRestartGroup, 0);
            float f = 50;
            Modifier modifierClip = ClipKt.clip(SizeKt.m511height3ABfNKs(SizeKt.m530width3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3775constructorimpl(7), Dp.m3775constructorimpl(f), 3, null), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(35)), RoundedCornerShapeKt.getCircleShape());
            int i2 = o0OOo000.f48347o00OOooO;
            ImageKt.Image(painterPainterResource, (String) null, boxScope.align(PaddingKt.m478padding3ABfNKs(ClickableKt.m204clickableXHw0xAI$default(BackgroundKt.m171backgroundbw27NRU$default(modifierClip, o0OOo000.f48286o000ooo0, null, 2, null), false, null, null, new OooO00o(tVar), 7, null), Dp.m3775constructorimpl(4)), Alignment.INSTANCE.getBottomEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, o000000Var, tVar, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull t facePanelState, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(facePanelState, "facePanelState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-987934946);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-987934946, i, -1, "com.yalla.yalla.ui.view.FacePanelComp (FacePanelComp.kt:69)");
        }
        o000000 o000000VarOooO00o = o00000.OooO00o(0, composerStartRestartGroup, 6, 0);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Modifier.Companion companion = Modifier.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        int i2 = o0OOo000.f48347o00OOooO;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(modifierFillMaxSize$default, o0OOo000.f48135OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        facePanelState.f56986OooOO0o = o000000VarOooO00o;
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        EffectsKt.LaunchedEffect(o000000VarOooO00o, new OooO0OO(o000000VarOooO00o, facePanelState, null), composerStartRestartGroup, 64);
        Pager.OooO00o(facePanelState.f56975OooO.size(), androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(360)), 1.0f, false, 2, null), o000000VarOooO00o, false, 0.0f, null, null, null, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 103726367, true, new OooO0o(facePanelState, context)), composerStartRestartGroup, 0, 6, 1016);
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl((float) 0.5d), BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0OOo000.f48284o000ooOO, null, 2, null), composerStartRestartGroup, 6, 0);
        OooO0OO(o000000VarOooO00o, facePanelState, composerStartRestartGroup, 64);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        OooO00o(boxScopeInstance, o000000VarOooO00o, facePanelState, composerStartRestartGroup, 518);
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
    public static final void OooO0OO(o000000 o000000Var, t tVar, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(415611944);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(415611944, i, -1, "com.yalla.yalla.ui.view.IndicatorContainer (FacePanelComp.kt:194)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Modifier.Companion companion = Modifier.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0O.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        LazyDslKt.LazyRow(SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(42)), null, null, false, null, null, null, false, new OooOO0(tVar, o000000Var, context), composerStartRestartGroup, 0, 254);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        OooO0Oo(tVar, composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(o000000Var, tVar, i));
    }

    @Composable
    public static final void OooO0Oo(@NotNull final t facePanelState, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(facePanelState, "facePanelState");
        Composer composerStartRestartGroup = composer.startRestartGroup(2042180123);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2042180123, i, -1, "com.yalla.yalla.ui.view.LoadIndicatorData (FacePanelComp.kt:252)");
        }
        if (!facePanelState.f56982OooO0oO) {
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
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(facePanelState, new OooOOO(lifecycleOwner, facePanelState, null), composerStartRestartGroup, 72);
        Observable<Object> observable = LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT");
        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
        o00O0000.OooO00o(observable, new Observer() { // from class: o0oOooOO.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object it) {
                CoroutineScope coroutineScope2 = coroutineScope;
                Intrinsics.checkNotNullParameter(coroutineScope2, "$coroutineScope");
                t facePanelState2 = facePanelState;
                Intrinsics.checkNotNullParameter(facePanelState2, "$facePanelState");
                Intrinsics.checkNotNullParameter(it, "it");
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new i.OooOOOO(facePanelState2, null), 3, null);
            }
        }, composerStartRestartGroup, 72);
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
