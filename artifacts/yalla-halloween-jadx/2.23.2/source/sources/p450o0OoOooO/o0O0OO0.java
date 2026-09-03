package p450o0OoOooO;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.OooOo00;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
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
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.booking.rtlviewpager.RtlViewPager;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.page.EventMineFragment;
import com.yalla.yalla.module.event.ui.page.EventSquareFragment;
import com.yalla.yalla.module.event.ui.screen.EventPage;
import com.yalla.yalla.module.event.ui.view.EventKt;
import com.yalla.yalla.module.event.vm.EventDisplayViewModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p232o00oOoO0.o000O000;
import p232o00oOoO0.o000Oo0;
import p423o0OoO0OO.o00O0000;
import p448o0OoOoo.oo0oOO0;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p586o0oOooO0.oO0o0000;
import p650o0ooo.e;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventDisplayScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDisplayScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventDisplayScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,212:1\n81#2,11:213\n81#2,11:281\n81#2,11:292\n81#2,11:441\n76#3:224\n76#3:265\n76#3:439\n76#3:440\n72#4,6:225\n78#4:259\n82#4:264\n78#5,11:231\n91#5:263\n78#5,11:306\n78#5,11:340\n91#5:387\n78#5,11:398\n91#5:431\n91#5:437\n456#6,8:242\n464#6,3:256\n467#6,3:260\n25#6:270\n456#6,8:317\n464#6,3:331\n456#6,8:351\n464#6,3:365\n36#6:369\n36#6:377\n467#6,3:384\n456#6,8:409\n464#6,3:423\n467#6,3:428\n467#6,3:434\n25#6:452\n36#6:459\n4144#7,6:250\n4144#7,6:325\n4144#7,6:359\n4144#7,6:417\n486#8,4:266\n490#8,2:274\n494#8:280\n1097#9,3:271\n1100#9,3:277\n1097#9,6:370\n1097#9,6:378\n1097#9,6:453\n1097#9,6:460\n486#10:276\n154#11:303\n154#11:335\n154#11:336\n154#11:337\n154#11:376\n154#11:389\n154#11:390\n154#11:391\n154#11:427\n154#11:433\n77#12,2:304\n79#12:334\n77#12,2:338\n79#12:368\n83#12:388\n83#12:438\n66#13,6:392\n72#13:426\n76#13:432\n*S KotlinDebug\n*F\n+ 1 EventDisplayScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventDisplayScreenKt\n*L\n52#1:213,11\n71#1:281,11\n72#1:292,11\n155#1:441,11\n58#1:224\n69#1:265\n153#1:439\n154#1:440\n61#1:225,6\n61#1:259\n61#1:264\n61#1:231,11\n61#1:263\n73#1:306,11\n95#1:340,11\n95#1:387\n118#1:398,11\n118#1:431\n73#1:437\n61#1:242,8\n61#1:256,3\n61#1:260,3\n70#1:270\n73#1:317,8\n73#1:331,3\n95#1:351,8\n95#1:365,3\n106#1:369\n113#1:377\n95#1:384,3\n118#1:409,8\n118#1:423,3\n118#1:428,3\n73#1:434,3\n156#1:452\n181#1:459\n61#1:250,6\n73#1:325,6\n95#1:359,6\n118#1:417,6\n70#1:266,4\n70#1:274,2\n70#1:280\n70#1:271,3\n70#1:277,3\n106#1:370,6\n113#1:378,6\n156#1:453,6\n181#1:460,6\n70#1:276\n77#1:303\n82#1:335\n88#1:336\n93#1:337\n108#1:376\n120#1:389\n121#1:390\n122#1:391\n143#1:427\n147#1:433\n73#1:304,2\n73#1:334\n95#1:338,2\n95#1:368\n95#1:388\n73#1:438\n118#1:392,6\n118#1:426\n118#1:432\n*E\n"})
public final class o0O0OO0 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f47534OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f47534OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0OO0.OooO0O0(composer, RecomposeScopeImplKt.updateChangedFlags(this.f47534OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f47535OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f47535OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0OO0.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f47535OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Context, RtlViewPager> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventDisplayViewModel f47536OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<RtlViewPager> f47537OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f47538OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(EventDisplayViewModel eventDisplayViewModel, FragmentActivity fragmentActivity, MutableState<RtlViewPager> mutableState) {
            super(1);
            this.f47536OooO0Oo = eventDisplayViewModel;
            this.f47538OooO0o0 = fragmentActivity;
            this.f47537OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final RtlViewPager invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            RtlViewPager rtlViewPager = new RtlViewPager(it);
            List listMutableListOf = CollectionsKt.mutableListOf(new EventSquareFragment(), new EventMineFragment());
            rtlViewPager.setId(o0OO00O.viewPagerId);
            rtlViewPager.setOffscreenPageLimit(listMutableListOf.size());
            EventDisplayViewModel eventDisplayViewModel = this.f47536OooO0Oo;
            rtlViewPager.setCurrentItem(1 ^ (eventDisplayViewModel.isSquareState() ? 1 : 0));
            FragmentManager supportFragmentManager = this.f47538OooO0o0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            rtlViewPager.setAdapter(new oO0o0000(supportFragmentManager, listMutableListOf));
            rtlViewPager.OooO0O0(new o0O0OOO0(listMutableListOf, eventDisplayViewModel));
            this.f47537OooO0o.setValue(rtlViewPager);
            return rtlViewPager;
        }
    }

    public static final class OooO0OO<T> implements Observer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventDisplayViewModel f47539OooO0Oo;

        public OooO0OO(EventDisplayViewModel eventDisplayViewModel) {
            this.f47539OooO0Oo = eventDisplayViewModel;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            EventPage eventPage = EventPage.MineCreator;
            EventDisplayViewModel eventDisplayViewModel = this.f47539OooO0Oo;
            eventDisplayViewModel.setEventPageState(eventPage);
            eventDisplayViewModel.setSquareState(false);
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f47540OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f47540OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0OO0.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f47540OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f47541OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Context context) {
            super(0);
            this.f47541OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = this.f47541OooO0Oo;
            if (context instanceof Activity) {
                ((Activity) context).onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventDisplayViewModel f47542OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(EventDisplayViewModel eventDisplayViewModel) {
            super(0);
            this.f47542OooO0Oo = eventDisplayViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47542OooO0Oo.setSquareState(true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f47543OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f47544OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(EventViewModel eventViewModel, CoroutineScope coroutineScope) {
            super(0);
            this.f47543OooO0Oo = eventViewModel;
            this.f47544OooO0o0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("101001");
            EventViewModel eventViewModel = this.f47543OooO0Oo;
            eventViewModel.getShowLoadingDialog().setValue(Boolean.TRUE);
            BuildersKt__Builders_commonKt.launch$default(this.f47544OooO0o0, null, null, new o0O0OOOo(eventViewModel, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventDisplayViewModel f47545OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(EventDisplayViewModel eventDisplayViewModel) {
            super(0);
            this.f47545OooO0Oo = eventDisplayViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47545OooO0Oo.setSquareState(false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f47546OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i) {
            super(2);
            this.f47546OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0OO0.OooO0OO(composer, RecomposeScopeImplKt.updateChangedFlags(this.f47546OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1037143118);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1037143118, i, -1, "com.yalla.yalla.module.event.ui.screen.EventDisplayContent (EventDisplayScreen.kt:151)");
            }
            if (!(composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()) instanceof FragmentActivity)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i));
                return;
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity fragmentActivity = (FragmentActivity) objConsume;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventDisplayViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventDisplayViewModel eventDisplayViewModel = (EventDisplayViewModel) viewModel;
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 407253972, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objOooO00o);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objOooO00o;
            RtlViewPager rtlViewPager = (RtlViewPager) mutableState.getValue();
            if (rtlViewPager != null) {
                rtlViewPager.setCurrentItem(!eventDisplayViewModel.isSquareState() ? 1 : 0);
            }
            AndroidView_androidKt.AndroidView(new OooO0O0(eventDisplayViewModel, fragmentActivity, mutableState), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composerStartRestartGroup, 48, 4);
            composerStartRestartGroup.endReplaceableGroup();
            Observable<Object> observable = LiveEventBus.get("EVENT_CREATE_SUCCESS");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(eventDisplayViewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new OooO0OO(eventDisplayViewModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0000.OooO00o(observable, (Observer) objRememberedValue, composerStartRestartGroup, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0o(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-127388918);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-127388918, i, -1, "com.yalla.yalla.module.event.ui.screen.EventDisplayLayer (EventDisplayScreen.kt:50)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventViewModel eventViewModel = (EventViewModel) viewModel;
            o000O000.OooO00o(o000Oo0.OooO00o(composerStartRestartGroup), o0OOo000.f48134OooO00o, true, 4);
            e.OooO00o(null, eventViewModel.getShowLoadingDialog().getValue().booleanValue(), null, composerStartRestartGroup, 0, 6);
            EventKt.OooOO0o(eventViewModel.getShowAddToCalendarDialog(), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), eventViewModel.getAddToCalendarEventModel(), composerStartRestartGroup, (EventModel.$stable << 6) | 64);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            OooO0OO(composerStartRestartGroup, 0);
            OooO00o(composerStartRestartGroup, 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(Composer composer, int i) {
        long j;
        long j2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1981630388);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1981630388, i, -1, "com.yalla.yalla.module.event.ui.screen.EventDisplayToolbar (EventDisplayScreen.kt:67)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objOooO00o, composerStartRestartGroup, 1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventDisplayViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventDisplayViewModel eventDisplayViewModel = (EventDisplayViewModel) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(EventViewModel.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventViewModel eventViewModel = (EventViewModel) viewModel2;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null)), Dp.m3775constructorimpl(50)), o0000oo.OooO0OO(composerStartRestartGroup).f38619OooO0OO, null, 2, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 8;
            oo0oOO0.OooO00o(f, companion2, composerStartRestartGroup, 6);
            IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.btn_return, composerStartRestartGroup, 0), (String) null, PaddingKt.m478padding3ABfNKs(ClickableKt.m204clickableXHw0xAI$default(ClipKt.clip(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), false, null, null, new OooOO0(context), 7, null), Dp.m3775constructorimpl(f)), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, composerStartRestartGroup, 56, 0);
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
            Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
            Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            String strStringResource = StringResources_androidKt.stringResource(o000000.event_square_title, composerStartRestartGroup, 0);
            long sp = TextUnitKt.getSp(17);
            if (eventDisplayViewModel.isSquareState()) {
                composerStartRestartGroup.startReplaceableGroup(217420582);
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
            } else {
                composerStartRestartGroup.startReplaceableGroup(217420597);
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
            }
            long j3 = j;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(eventDisplayViewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new OooOO0O(eventDisplayViewModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m1261Text4IGK_g(strStringResource, o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j3, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
            oo0oOO0.OooO00o(23, companion2, composerStartRestartGroup, 6);
            String strStringResource2 = StringResources_androidKt.stringResource(o000000.event_mine_title, composerStartRestartGroup, 0);
            long sp2 = TextUnitKt.getSp(17);
            if (eventDisplayViewModel.isSquareState()) {
                composerStartRestartGroup.startReplaceableGroup(217420953);
                j2 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
            } else {
                composerStartRestartGroup.startReplaceableGroup(217420968);
                j2 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
            }
            long j4 = j2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(eventDisplayViewModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OooOOO0(eventDisplayViewModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m1261Text4IGK_g(strStringResource2, o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253), j4, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
            o0ooOOo.OooO00o(composerStartRestartGroup);
            Modifier modifierM204clickableXHw0xAI$default = ClickableKt.m204clickableXHw0xAI$default(BackgroundKt.background$default(ClipKt.clip(SizeKt.m511height3ABfNKs(SizeKt.m530width3ABfNKs(companion2, Dp.m3775constructorimpl(42)), Dp.m3775constructorimpl(25)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(13))), Brush.Companion.m1636horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0OOo000.f48223o0000o0o), Color.m1671boximpl(o0OOo000.f48185Ooooo00)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), false, null, null, new OooOOO(eventViewModel, coroutineScopeOooO00o), 7, null);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM204clickableXHw0xAI$default);
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
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO00o, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_event_create_title, composer2, 0), (String) null, BoxScopeInstance.INSTANCE.align(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(15)), companion3.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            o0ooOOo.OooO00o(composer2);
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion2, Dp.m3775constructorimpl(10)), composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(i));
    }
}
