package com.yalla.yalla.ui.screen.moment;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Oooo000;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o00O0O0;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.ui.vm.moment.TopicGroupJoinVM;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p195o00o0OO0.o00000OO;
import p207o00o0oO0.o000O0Oo;
import p423o0OoO0OO.o000O000;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p532o0o0OOo0.o00O00O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p650o0ooo.e;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0004*\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/screen/moment/TopicGroupJoinScreen;", "Lo0o0OOo0/o000O0;", "Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "Layer", "(Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;Landroidx/compose/runtime/Composer;I)V", "TopicGroupJoinLayer", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/ScrollState;", "rememberScrollState", "TopicGroupJoinToolbar", "(Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)V", "TopicGroupJoinContent", "Landroidx/compose/foundation/layout/BoxScope;", "TopicGroupJoinButton", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopicGroupJoinScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicGroupJoinScreen.kt\ncom/yalla/yalla/ui/screen/moment/TopicGroupJoinScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,311:1\n76#2:312\n81#3,11:313\n81#3,11:364\n81#3,11:638\n66#4,6:324\n72#4:358\n76#4:363\n66#4,6:412\n72#4:446\n76#4:506\n67#4,5:651\n72#4:684\n76#4:691\n78#5,11:330\n91#5:362\n78#5,11:382\n78#5,11:418\n78#5,11:457\n91#5:500\n91#5:505\n78#5,11:514\n78#5,11:550\n78#5,11:582\n91#5:615\n91#5:625\n91#5:631\n91#5:636\n78#5,11:656\n91#5:690\n456#6,8:341\n464#6,3:355\n467#6,3:359\n456#6,8:393\n464#6,3:407\n456#6,8:429\n464#6,3:443\n456#6,8:468\n464#6,3:482\n467#6,3:497\n467#6,3:502\n456#6,8:525\n464#6,3:539\n456#6,8:561\n464#6,3:575\n456#6,8:593\n464#6,3:607\n467#6,3:612\n467#6,3:622\n467#6,3:628\n467#6,3:633\n456#6,8:667\n464#6,3:681\n467#6,3:687\n4144#7,6:349\n4144#7,6:401\n4144#7,6:437\n4144#7,6:476\n4144#7,6:533\n4144#7,6:569\n4144#7,6:601\n4144#7,6:675\n154#8:375\n154#8:411\n154#8:447\n154#8:448\n154#8:449\n154#8:450\n154#8:486\n154#8:487\n154#8:495\n154#8:496\n154#8:507\n154#8:543\n154#8:579\n154#8:611\n154#8:617\n154#8:618\n154#8:619\n154#8:620\n154#8:621\n154#8:627\n154#8:649\n154#8:650\n154#8:685\n154#8:686\n72#9,6:376\n78#9:410\n72#9,6:451\n78#9:485\n82#9:501\n72#9,6:508\n78#9:542\n72#9,6:544\n78#9:578\n82#9:626\n82#9:632\n82#9:637\n1098#10:488\n927#10,6:489\n77#11,2:580\n79#11:610\n83#11:616\n*S KotlinDebug\n*F\n+ 1 TopicGroupJoinScreen.kt\ncom/yalla/yalla/ui/screen/moment/TopicGroupJoinScreen\n*L\n50#1:312\n61#1:313,11\n115#1:364,11\n272#1:638,11\n97#1:324,6\n97#1:358\n97#1:363\n136#1:412,6\n136#1:446\n136#1:506\n273#1:651,5\n273#1:684\n273#1:691\n97#1:330,11\n97#1:362\n129#1:382,11\n136#1:418,11\n160#1:457,11\n160#1:500\n136#1:505\n200#1:514,11\n204#1:550,11\n210#1:582,11\n210#1:615\n204#1:625\n200#1:631\n129#1:636\n273#1:656,11\n273#1:690\n97#1:341,8\n97#1:355,3\n97#1:359,3\n129#1:393,8\n129#1:407,3\n136#1:429,8\n136#1:443,3\n160#1:468,8\n160#1:482,3\n160#1:497,3\n136#1:502,3\n200#1:525,8\n200#1:539,3\n204#1:561,8\n204#1:575,3\n210#1:593,8\n210#1:607,3\n210#1:612,3\n204#1:622,3\n200#1:628,3\n129#1:633,3\n273#1:667,8\n273#1:681,3\n273#1:687,3\n97#1:349,6\n129#1:401,6\n136#1:437,6\n160#1:476,6\n200#1:533,6\n204#1:569,6\n210#1:601,6\n273#1:675,6\n116#1:375\n139#1:411\n146#1:447\n154#1:448\n155#1:449\n161#1:450\n165#1:486\n167#1:487\n190#1:495\n195#1:496\n201#1:507\n206#1:543\n221#1:579\n234#1:611\n242#1:617\n247#1:618\n253#1:619\n257#1:620\n263#1:621\n265#1:627\n276#1:649\n278#1:650\n295#1:685\n304#1:686\n129#1:376,6\n129#1:410\n160#1:451,6\n160#1:485\n160#1:501\n200#1:508,6\n200#1:542\n204#1:544,6\n204#1:578\n204#1:626\n200#1:632\n129#1:637\n173#1:488\n174#1:489,6\n210#1:580,2\n210#1:610\n210#1:616\n*E\n"})
public final class TopicGroupJoinScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final TopicGroupJoinScreen INSTANCE = new TopicGroupJoinScreen();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28728OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopicGroupInfoModel f28729OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(TopicGroupInfoModel topicGroupInfoModel, int i) {
            super(2);
            this.f28729OooO0o0 = topicGroupInfoModel;
            this.f28728OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28728OooO0o | 1);
            TopicGroupJoinScreen.this.Layer(this.f28729OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28731OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f28732OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f28732OooO0o0 = columnScope;
            this.f28731OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28731OooO0o | 1);
            TopicGroupJoinScreen.this.Content(this.f28732OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28734OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f28735OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ColumnScope columnScope, int i) {
            super(2);
            this.f28735OooO0o0 = columnScope;
            this.f28734OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28734OooO0o | 1);
            TopicGroupJoinScreen.this.Content(this.f28735OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TopicGroupJoinVM f28736OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(TopicGroupJoinVM topicGroupJoinVM) {
            super(0);
            this.f28736OooO0Oo = topicGroupJoinVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0OO("103004", MapsKt.mapOf(new Pair("type", 2)));
            this.f28736OooO0Oo.toBindingYallaChat();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f28737OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ TopicGroupInfoModel f28738OooO00o;

        public OooOO0(TopicGroupInfoModel topicGroupInfoModel) {
            this.f28738OooO00o = topicGroupInfoModel;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return Oooo000.OooO0O0(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public final <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            T tNewInstance = modelClass.getConstructor(TopicGroupInfoModel.class).newInstance(this.f28738OooO00o);
            Intrinsics.checkNotNullExpressionValue(tNewInstance, "newInstance(...)");
            return tNewInstance;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TopicGroupJoinVM f28739OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(TopicGroupJoinVM topicGroupJoinVM) {
            super(0);
            this.f28739OooO0Oo = topicGroupJoinVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TopicGroupJoinVM topicGroupJoinVM = this.f28739OooO0Oo;
            if (topicGroupJoinVM.getTopicGroupInfoModel().getIsFollowed()) {
                o0oo0000.OooO00o.OooO0O0("103007");
            } else {
                o0oo0000.OooO00o.OooO0O0("103006");
            }
            topicGroupJoinVM.checkGroupJoinOrInto();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28741OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScrollState f28742OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ScrollState scrollState, int i) {
            super(2);
            this.f28742OooO0o0 = scrollState;
            this.f28741OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28741OooO0o | 1);
            TopicGroupJoinScreen.this.TopicGroupJoinContent(this.f28742OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28744OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f28745OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(BoxScope boxScope, int i) {
            super(2);
            this.f28745OooO0o0 = boxScope;
            this.f28744OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28744OooO0o | 1);
            TopicGroupJoinScreen.this.TopicGroupJoinButton(this.f28745OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28747OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i) {
            super(2);
            this.f28747OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28747OooO0o0 | 1);
            TopicGroupJoinScreen.this.TopicGroupJoinLayer(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28749OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScrollState f28750OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(ScrollState scrollState, int i) {
            super(2);
            this.f28750OooO0o0 = scrollState;
            this.f28749OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28749OooO0o | 1);
            TopicGroupJoinScreen.this.TopicGroupJoinToolbar(this.f28750OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private TopicGroupJoinScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void Layer(TopicGroupInfoModel topicGroupInfoModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1587826269);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1587826269, i, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen.Layer (TopicGroupJoinScreen.kt:59)");
        }
        OooOO0 oooOO1 = new OooOO0(topicGroupInfoModel);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(TopicGroupJoinVM.class, current, null, oooOO1, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        TopicGroupJoinVM topicGroupJoinVM = (TopicGroupJoinVM) viewModel;
        e.OooO00o(null, topicGroupJoinVM.getShowLoadingDialog().getValue().booleanValue(), null, composerStartRestartGroup, 0, 6);
        if (topicGroupJoinVM.getShowDialogBinding().getValue().booleanValue()) {
            o0oo0000.OooO00o.OooO0OO("303002", MapsKt.mapOf(new Pair("type", 2)));
        }
        o000O0Oo.OooO0Oo(topicGroupJoinVM.getShowDialogBinding(), o0000.OooO0OO(o000000.topic_group_create_please_link_yallachat_title), null, null, false, false, null, null, o0000.OooO0OO(o000000.topic_group_create_please_link_yallachat), false, null, false, new OooO0OO(topicGroupJoinVM), null, false, false, null, OooO0o.f28737OooO0Oo, null, null, composerStartRestartGroup, 0, 12582912, 913148);
        if (topicGroupJoinVM.isDisbanded().getValue().booleanValue()) {
            o00O00.OooO0o(null);
        }
        TopicGroupJoinLayer(composerStartRestartGroup, (i >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(topicGroupInfoModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TopicGroupJoinButton(BoxScope boxScope, Composer composer, int i) {
        int i2;
        String strStringResource;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-624323582);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-624323582, i2, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen.TopicGroupJoinButton (TopicGroupJoinScreen.kt:270)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(TopicGroupJoinVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            TopicGroupJoinVM topicGroupJoinVM = (TopicGroupJoinVM) viewModel;
            Modifier.Companion companion = Modifier.INSTANCE;
            int i3 = o0OOo000.f48347o00OOooO;
            float f = 15;
            float f2 = 12;
            Modifier modifierM481paddingqDBjuR0 = PaddingKt.m481paddingqDBjuR0(BackgroundKt.m171backgroundbw27NRU$default(companion, o0OOo000.f48368oo000o, null, 2, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierM204clickableXHw0xAI$default = ClickableKt.m204clickableXHw0xAI$default(o00O0O0.OooO00o(21, boxScope.align(modifierM481paddingqDBjuR0, companion2.getBottomCenter())), false, null, null, new OooOO0O(topicGroupJoinVM), 7, null);
            Alignment topCenter = companion2.getTopCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topCenter, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM204clickableXHw0xAI$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_topic_group_create_bottom, composerStartRestartGroup, 0), "", SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(43)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            if (topicGroupJoinVM.getTopicGroupInfoModel().getIsFollowed()) {
                composerStartRestartGroup.startReplaceableGroup(678978951);
                strStringResource = StringResources_androidKt.stringResource(o000000.topic_group_join_bottom_join, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(678979042);
                strStringResource = StringResources_androidKt.stringResource(o000000.topic_group_join_bottom_join_and_follow, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strStringResource, PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(8), Dp.m3775constructorimpl(f), 0.0f, 8, null), o0OOo000.f48372oo0o0Oo, o0000O0.OooO0OO(15, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(boxScope, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TopicGroupJoinContent(ScrollState scrollState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1266655446);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1266655446, i2, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen.TopicGroupJoinContent (TopicGroupJoinScreen.kt:126)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(BackgroundKt.m171backgroundbw27NRU$default(companion, o0OOo000.f48368oo000o, null, 2, null), 0.0f, 1, null)), scrollState, false, null, false, 14, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = 148;
            Modifier modifierM513heightInVpY3zN4$default = SizeKt.m513heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM513heightInVpY3zN4$default);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_topic_group_create_top_bg_start, composerStartRestartGroup, 0), (String) null, boxScopeInstance.align(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(127)), companion2.getTopStart()), companion2.getTopStart(), (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 3128, 112);
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_topic_group_create_top_bg_end, composerStartRestartGroup, 0), (String) null, boxScopeInstance.align(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(40), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(122), Dp.m3775constructorimpl(f)), companion2.getTopEnd()), companion2.getTopEnd(), (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 3128, 112);
            float f2 = 15;
            Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f2), 0.0f, 2, null);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composer2, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
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
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O1, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, o000O000.OooO00o() > 72 ? Dp.m3775constructorimpl(72) : Dp.m3775constructorimpl(o000O000.OooO00o())), composer2, 0);
            composer2.startReplaceableGroup(-1822648677);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            long jOooO0OO = o0000O0.OooO0OO(30, composer2, 6);
            long j = o0OOo000.f48135OooO0O0;
            int iPushStyle = builder.pushStyle(new SpanStyle(j, jOooO0OO, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0OOo000.f48235o000O00O, OffsetKt.Offset(6.0f, 6.0f), 10.0f, null), (PlatformSpanStyle) null, (DrawStyle) null, 57336, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(o000000.topic_group_join_title, composer2, 0));
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composer2.endReplaceableGroup();
                TextKt.m1262TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                androidx.compose.ui.semantics.OooO0O0.OooO0O0(8, companion, composer2, 6);
                float f3 = 12;
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.topic_group_join_description, composer2, 0), PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(f3), 7, null), o0OOo000.f48147OooOOOO, o0000O0.OooO0OO(12, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier modifierM480paddingVpY3zN4$default2 = PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f2), 0.0f, 2, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O2 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO0O2, composerM1320constructorimpl4, currentCompositionLocalMap4);
                if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(ClipKt.clip(companion, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f3))), 0.0f, 1, null), j, null, 2, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O3 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl5 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl5, measurePolicyOooO0O3, composerM1320constructorimpl5, currentCompositionLocalMap5);
                if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                Modifier modifierM481paddingqDBjuR0 = PaddingKt.m481paddingqDBjuR0(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Brush.Companion.m1644verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.mutableListOf(Color.m1671boximpl(o0OOo000.f48233o000O00), Color.m1671boximpl(o0OOo000.f48134OooO00o)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f3));
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM481paddingqDBjuR0);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl6 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o6 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl6, measurePolicyRowMeasurePolicy, composerM1320constructorimpl6, currentCompositionLocalMap6);
                if (composerM1320constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash6, composerM1320constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_topic_group_create_star_start, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.topic_group_join_requirement_title, composer2, 0), rowScopeInstance.align(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(4), 0.0f, 2, null), companion2.getCenterVertically()), o0OOo000.f48352o00oO0o, o0000O0.OooO0OO(14, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_topic_group_create_star_end, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f3)), composer2, 6);
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.topic_group_join_content_owner_or_fans, composer2, 0), PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f2), 0.0f, 2, null), o0000oo.OooO0OO(composer2).f38627OooOO0o, o0000O0.OooO0OO(12, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f3)), composer2, 6);
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.topic_group_join_content_not_install_or_bind, composer2, 0), PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f2), 0.0f, 2, null), o0000oo.OooO0OO(composer2).f38627OooOO0o, o0000O0.OooO0OO(12, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(ComposerKt.reuseKey)), composer2, 6);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(300)), composer2, 6);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(scrollState, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TopicGroupJoinLayer(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(496147324);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(496147324, i, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen.TopicGroupJoinLayer (TopicGroupJoinScreen.kt:95)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0);
            TopicGroupJoinScreen topicGroupJoinScreen = INSTANCE;
            topicGroupJoinScreen.TopicGroupJoinContent(scrollStateRememberScrollState, composerStartRestartGroup, 48);
            topicGroupJoinScreen.TopicGroupJoinToolbar(scrollStateRememberScrollState, composerStartRestartGroup, 48);
            topicGroupJoinScreen.TopicGroupJoinButton(boxScopeInstance, composerStartRestartGroup, 54);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TopicGroupJoinToolbar(ScrollState scrollState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(963359404);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(963359404, i2, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen.TopicGroupJoinToolbar (TopicGroupJoinScreen.kt:113)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(TopicGroupJoinVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            TopicGroupJoinVM topicGroupJoinVM = (TopicGroupJoinVM) viewModel;
            topicGroupJoinVM.getAlphaToolbar().setValue(Float.valueOf(RangesKt.coerceIn(scrollState.getValue() / Dp.m3775constructorimpl(50), 0.0f, 1.0f)));
            String strStringResource = StringResources_androidKt.stringResource(o000000.topic_group_join, composerStartRestartGroup, 0);
            float fFloatValue = topicGroupJoinVM.getAlphaToolbar().getValue().floatValue();
            int i3 = o0OOo000.f48347o00OOooO;
            long j = o0OOo000.f48135OooO0O0;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(Modifier.INSTANCE, Color.m1680copywmQWz5c$default(o0OOo000.f48351o00oO0O, topicGroupJoinVM.getAlphaToolbar().getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer2 = composerStartRestartGroup;
            o0O0oo0o.OooO00o(strStringResource, fFloatValue, j, null, null, null, null, null, modifierM171backgroundbw27NRU$default, composerStartRestartGroup, 0, 248);
            o00000OO.OooO0O0(true, composer2, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(scrollState, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1851769654);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1851769654, i2, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen.Content (TopicGroupJoinScreen.kt:48)");
            }
            Object obj = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup).get("DATA");
            TopicGroupInfoModel topicGroupInfoModel = obj instanceof TopicGroupInfoModel ? (TopicGroupInfoModel) obj : null;
            if (topicGroupInfoModel == null) {
                o00O00.OooO0o(null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
                return;
            }
            Layer(topicGroupInfoModel, composerStartRestartGroup, (i2 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(columnScope, i));
    }
}
