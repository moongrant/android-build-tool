package p519o0o0O0OO;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.model.moment.MomentTypeDelete;
import com.yalla.yalla.model.moment.MomentTypePower;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p200o00o0OoO.o00OO00O;
import p384o0OOoo0O.o000oOoO;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.z0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentBottomComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentBottomCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,388:1\n76#2:389\n76#2:390\n76#2:391\n76#2:392\n76#2:393\n76#2:447\n76#2:508\n76#2:516\n81#3,11:394\n81#3,11:497\n154#4:405\n154#4:446\n154#4:483\n154#4:484\n154#4:517\n154#4:553\n154#4:566\n73#5,6:406\n79#5:440\n83#5:445\n73#5,6:448\n79#5:482\n83#5:489\n73#5,6:518\n79#5:552\n83#5:558\n78#6,11:412\n91#6:444\n78#6,11:454\n91#6:488\n78#6,11:524\n91#6:557\n78#6,11:580\n91#6:619\n456#7,8:423\n464#7,3:437\n467#7,3:441\n456#7,8:465\n464#7,3:479\n467#7,3:485\n25#7:490\n25#7:509\n456#7,8:535\n464#7,3:549\n467#7,3:554\n25#7:559\n36#7:567\n456#7,8:591\n464#7,3:605\n36#7:609\n467#7,3:616\n4144#8,6:431\n4144#8,6:473\n4144#8,6:543\n4144#8,6:599\n1097#9,6:491\n1097#9,6:510\n1097#9,6:560\n1097#9,6:568\n1097#9,6:610\n66#10,6:574\n72#10:608\n76#10:620\n81#11:621\n107#11,2:622\n*S KotlinDebug\n*F\n+ 1 MomentBottomComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentBottomCompKt\n*L\n65#1:389\n67#1:390\n71#1:391\n73#1:392\n76#1:393\n157#1:447\n221#1:508\n226#1:516\n78#1:394,11\n219#1:497,11\n84#1:405\n120#1:446\n191#1:483\n201#1:484\n230#1:517\n284#1:553\n305#1:566\n80#1:406,6\n80#1:440\n80#1:445\n159#1:448,6\n159#1:482\n159#1:489\n228#1:518,6\n228#1:552\n228#1:558\n80#1:412,11\n80#1:444\n159#1:454,11\n159#1:488\n228#1:524,11\n228#1:557\n302#1:580,11\n302#1:619\n80#1:423,8\n80#1:437,3\n80#1:441,3\n159#1:465,8\n159#1:479,3\n159#1:485,3\n217#1:490\n224#1:509\n228#1:535,8\n228#1:549,3\n228#1:554,3\n301#1:559\n306#1:567\n302#1:591,8\n302#1:605,3\n314#1:609\n302#1:616,3\n80#1:431,6\n159#1:473,6\n228#1:543,6\n302#1:599,6\n217#1:491,6\n224#1:510,6\n301#1:560,6\n306#1:568,6\n314#1:610,6\n302#1:574,6\n302#1:608\n302#1:620\n301#1:621\n301#1:622,2\n*E\n"})
public final class o000OO00 {

    public static final class OooO extends Lambda implements Function1<IntSize, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Size> f51936OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState<Size> mutableState) {
            super(1);
            this.f51936OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IntSize intSize) {
            long packedValue = intSize.getPackedValue();
            this.f51936OooO0Oo.setValue(Size.m1504boximpl(SizeKt.Size(IntSize.m3935getWidthimpl(packedValue) * 2.3f, IntSize.m3934getHeightimpl(packedValue) * 2.3f)));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f51937OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51938OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f51939OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51940OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Context f51941OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z, boolean z2) {
            super(0);
            this.f51937OooO0Oo = z;
            this.f51939OooO0o0 = z2;
            this.f51938OooO0o = momentAdapterTag;
            this.f51940OooO0oO = momentDetailModel;
            this.f51941OooO0oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f51937OooO0Oo) {
                if (this.f51939OooO0o0) {
                    MomentAdapterTag momentAdapterTag = this.f51938OooO0o;
                    o000O onLogin = new o000O(this.f51941OooO0oo, this.f51940OooO0oO, momentAdapterTag);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                        onLogin.invoke();
                    } else {
                        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            int i = LoginActivity.f24727OooOo0O;
                            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                        }
                    }
                } else {
                    o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f51942OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51943OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f51944OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51945OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51946OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, boolean z2, MomentAdapterTag momentAdapterTag, MomentDetailModel momentDetailModel, int i) {
            super(2);
            this.f51942OooO0Oo = z;
            this.f51944OooO0o0 = z2;
            this.f51943OooO0o = momentAdapterTag;
            this.f51945OooO0oO = momentDetailModel;
            this.f51946OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000OO00.OooO00o(this.f51942OooO0Oo, this.f51944OooO0o0, this.f51943OooO0o, this.f51945OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51946OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ BaseMomentDetailVM f51947OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51948OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f51949OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f51950OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51951OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51952OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f51953OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f51954OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51955OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Boolean> mutableState, boolean z, boolean z2, MomentAdapterTag momentAdapterTag, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner, boolean z3, MutableState<Boolean> mutableState2) {
            super(0);
            this.f51948OooO0Oo = mutableState;
            this.f51950OooO0o0 = z;
            this.f51949OooO0o = z2;
            this.f51951OooO0oO = momentAdapterTag;
            this.f51952OooO0oo = momentDetailModel;
            this.f51947OooO = baseMomentDetailVM;
            this.f51953OooOO0 = lifecycleOwner;
            this.f51954OooOO0O = z3;
            this.f51955OooOO0o = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f51948OooO0Oo.getValue().booleanValue() && !this.f51950OooO0o0) {
                if (this.f51949OooO0o) {
                    o00O0000 onLogin = new o00O0000(this.f51951OooO0oO, this.f51952OooO0oo, this.f51948OooO0Oo, this.f51947OooO, this.f51953OooOO0, this.f51954OooOO0O, this.f51955OooOO0o);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                        onLogin.invoke();
                    } else {
                        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            int i = LoginActivity.f24727OooOo0O;
                            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                        }
                    }
                } else {
                    o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f51956OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51957OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f51958OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51959OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51960OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, boolean z2, MomentAdapterTag momentAdapterTag, MomentDetailModel momentDetailModel, int i) {
            super(2);
            this.f51956OooO0Oo = z;
            this.f51958OooO0o0 = z2;
            this.f51957OooO0o = momentAdapterTag;
            this.f51959OooO0oO = momentDetailModel;
            this.f51960OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000OO00.OooO0OO(this.f51956OooO0Oo, this.f51958OooO0o0, this.f51957OooO0o, this.f51959OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51960OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51961OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MutableState<Boolean> mutableState) {
            super(0);
            this.f51961OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f51961OooO0Oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f51962OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51963OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f51964OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f51965OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51966OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51967OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f51968OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MomentDetailModel momentDetailModel, boolean z, boolean z2, MutableState<Boolean> mutableState, Modifier modifier, int i, int i2) {
            super(2);
            this.f51963OooO0Oo = momentDetailModel;
            this.f51965OooO0o0 = z;
            this.f51964OooO0o = z2;
            this.f51966OooO0oO = mutableState;
            this.f51967OooO0oo = modifier;
            this.f51962OooO = i;
            this.f51968OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000OO00.OooO0Oo(this.f51963OooO0Oo, this.f51965OooO0o0, this.f51964OooO0o, this.f51966OooO0oO, this.f51967OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51962OooO | 1), this.f51968OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Activity f51969OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51970OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f51971OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f51972OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51973OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ BaseMomentDetailVM f51974OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f51975OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentDetailModel momentDetailModel, boolean z, boolean z2, MomentAdapterTag momentAdapterTag, BaseMomentDetailVM baseMomentDetailVM, Activity activity, int i) {
            super(2);
            this.f51970OooO0Oo = momentDetailModel;
            this.f51972OooO0o0 = z;
            this.f51971OooO0o = z2;
            this.f51973OooO0oO = momentAdapterTag;
            this.f51974OooO0oo = baseMomentDetailVM;
            this.f51969OooO = activity;
            this.f51975OooOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000OO00.OooO0o0(this.f51970OooO0Oo, this.f51972OooO0o0, this.f51971OooO0o, this.f51973OooO0oO, this.f51974OooO0oo, this.f51969OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51975OooOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ BaseMomentDetailVM f51976OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f51977OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Activity f51978OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f51979OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51980OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51981OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(boolean z, boolean z2, Activity activity, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, BaseMomentDetailVM baseMomentDetailVM) {
            super(0);
            this.f51977OooO0Oo = z;
            this.f51979OooO0o0 = z2;
            this.f51978OooO0o = activity;
            this.f51980OooO0oO = momentDetailModel;
            this.f51981OooO0oo = momentAdapterTag;
            this.f51976OooO = baseMomentDetailVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f51977OooO0Oo) {
                if (this.f51979OooO0o0) {
                    o0O0ooO onLogin = new o0O0ooO(this.f51978OooO0o, this.f51980OooO0oO, this.f51981OooO0oo, this.f51976OooO);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                        onLogin.invoke();
                    } else {
                        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            int i = LoginActivity.f24727OooOo0O;
                            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                        }
                    }
                    o0oo0000.OooO00o.OooO0O0("106062");
                } else {
                    o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<PraisePostResultModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51982OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51983OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51984OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51985OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f51986OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, int i, MomentDetailModel momentDetailModel, boolean z) {
            super(1);
            this.f51982OooO0Oo = mutableState;
            this.f51984OooO0o0 = mutableState2;
            this.f51983OooO0o = i;
            this.f51985OooO0oO = momentDetailModel;
            this.f51986OooO0oo = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PraisePostResultModel praisePostResultModel) {
            PraisePostResultModel praisePostResultModel2 = praisePostResultModel;
            this.f51982OooO0Oo.setValue(Boolean.FALSE);
            int i = this.f51983OooO0o;
            this.f51984OooO0o0.setValue(Boolean.valueOf(i == 0));
            long num = praisePostResultModel2 != null ? praisePostResultModel2.getNum() : 0L;
            MomentDetailModel momentDetailModel = this.f51985OooO0oO;
            momentDetailModel.setPraiseNum(num);
            momentDetailModel.setPraise(true ^ momentDetailModel.isPraise());
            if (this.f51986OooO0oo) {
                if (i == 0) {
                    LiveEventBus.get("POST_DETAIL_PAGER_PRAISE_ADD").post(momentDetailModel);
                } else {
                    LiveEventBus.get("POST_DETAIL_PAGER_PRAISE_DELETE").post(momentDetailModel);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f51987OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f51988OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo00(Function1<? super Integer, Unit> function1, MutableState<Boolean> mutableState) {
            super(1);
            this.f51987OooO0Oo = function1;
            this.f51988OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            Function1<Integer, Unit> function1 = this.f51987OooO0Oo;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(it.getCode()));
            }
            this.f51988OooO0o0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(boolean z, boolean z2, MomentAdapterTag momentAdapterTag, MomentDetailModel momentDetailModel, Composer composer, int i) {
        long j;
        long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1642367939);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1642367939, i, -1, "com.yalla.yalla.ui.composable.moment.CommentContainer (MomentBottomComp.kt:155)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, new OooO00o(context, momentDetailModel, momentAdapterTag, z, z2), 253);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.icv_comment, composerStartRestartGroup, 0);
        Modifier modifierM525size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(21));
        ColorFilter.Companion companion3 = ColorFilter.INSTANCE;
        if (z || !z2) {
            composerStartRestartGroup.startReplaceableGroup(-748172467);
            j = o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-748172452);
            j = o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
        }
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(painterPainterResource, (String) null, modifierM525size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m1722tintxETnrds$default(companion3, j, 0, 2, null), composerStartRestartGroup, 440, 56);
        String strOooO0o = o0O0O0Oo.OooO0o(momentDetailModel.getCommentNum(), true);
        if (z || !z2) {
            composerStartRestartGroup.startReplaceableGroup(-748172250);
            j2 = o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-748172235);
            j2 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
        }
        long j3 = j2;
        composerStartRestartGroup.endReplaceableGroup();
        long sp = TextUnitKt.getSp(11);
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null);
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNull(strOooO0o);
        TextKt.m1261Text4IGK_g(strOooO0o, modifierM482paddingqDBjuR0$default, j3, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 3120, 0, 65520);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, z2, momentAdapterTag, momentDetailModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(int i, int i2, @Nullable Composer composer, @Nullable Modifier modifier) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-842330909);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-842330909, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentBottomComp (MomentBottomComp.kt:63)");
            }
            MomentAdapterTag momentAdapterTag = (MomentAdapterTag) composerStartRestartGroup.consume(oo0OOoo.f52731OooO0O0);
            if (((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52734OooO0o)).booleanValue() || momentAdapterTag == MomentAdapterTag.MomentEditRecord || ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52730OooO00o)).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o000OOo0(modifier3, i, i2));
                return;
            }
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0OOoo.f52733OooO0Oo);
            Activity activity = (Activity) composerStartRestartGroup.consume(oo0OOoo.f52735OooO0o0);
            boolean zIsApprovedState = MomentStateKt.isApprovedState(momentDetailModel);
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52729OooO)).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(BaseMomentDetailVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            BaseMomentDetailVM baseMomentDetailVM = (BaseMomentDetailVM) viewModel;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM511height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion.then(modifier3), 0.0f, 1, null), Dp.m3775constructorimpl(52));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            p598o0oo00Oo.o0000oo.f57360OooO00o.OooO00o("WRM MomentBottomComp\n isSendPosting = " + zBooleanValue + ", isApprovedState = " + zIsApprovedState + "\n data = " + momentDetailModel, composerStartRestartGroup, 48);
            OooO0o0(momentDetailModel, zBooleanValue, zIsApprovedState, momentAdapterTag, baseMomentDetailVM, activity, composerStartRestartGroup, 294920);
            SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            OooO00o(zBooleanValue, zIsApprovedState, momentAdapterTag, momentDetailModel, composerStartRestartGroup, 4096);
            OooO0OO(zBooleanValue, zIsApprovedState, momentAdapterTag, momentDetailModel, composerStartRestartGroup, 4096);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o00(modifier3, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(boolean z, boolean z2, MomentAdapterTag momentAdapterTag, MomentDetailModel momentDetailModel, Composer composer, int i) {
        long j;
        Composer composerStartRestartGroup = composer.startRestartGroup(1459176298);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1459176298, i, -1, "com.yalla.yalla.ui.composable.moment.PraiseContainer (MomentBottomComp.kt:215)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(BaseMomentDetailVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        BaseMomentDetailVM baseMomentDetailVM = (BaseMomentDetailVM) viewModel;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52730OooO00o)).booleanValue();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(41), 0.0f, 0.0f, 0.0f, 14, null), false, false, 0L, false, null, null, null, new OooO0OO(mutableState, z, z2, momentAdapterTag, momentDetailModel, baseMomentDetailVM, lifecycleOwner, zBooleanValue, mutableState2), 253);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        int i2 = i << 3;
        OooO0Oo(momentDetailModel, z, z2, mutableState2, null, composerStartRestartGroup, (i2 & 112) | 3080 | (i2 & 896), 16);
        String strOooO0o = o0O0O0Oo.OooO0o(momentDetailModel.getPraiseNum(), true);
        if (z || !z2) {
            composerStartRestartGroup.startReplaceableGroup(-986372893);
            j = o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-986372878);
            j = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
        }
        composerStartRestartGroup.endReplaceableGroup();
        long sp = TextUnitKt.getSp(11);
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null);
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNull(strOooO0o);
        TextKt.m1261Text4IGK_g(strOooO0o, modifierM482paddingqDBjuR0$default, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 3120, 0, 65520);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(z, z2, momentAdapterTag, momentDetailModel, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@NotNull MomentDetailModel data, boolean z, boolean z2, @NotNull MutableState<Boolean> showPraiseAnim, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int iOooO0o0;
        long j;
        ColorFilter colorFilterM1722tintxETnrds$default;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(showPraiseAnim, "showPraiseAnim");
        Composer composerStartRestartGroup = composer.startRestartGroup(767186293);
        Modifier modifier2 = (i2 & 16) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(767186293, i, -1, "com.yalla.yalla.ui.composable.moment.PraiseImage (MomentBottomComp.kt:299)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1504boximpl(SizeKt.Size(0.0f, 0.0f)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM525size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(companion2.then(modifier2), Dp.m3775constructorimpl(21));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new OooO(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM525size3ABfNKs, (Function1) objRememberedValue2);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnSizeChanged);
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
        if (data.isPraise() && showPraiseAnim.getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(502473483);
            z0 z0Var = z0.f57313OooO00o;
            String strOooO0o = z0.OooO0o();
            Modifier modifierM519requiredSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m519requiredSizeVpY3zN4(companion2, o0000O0.OooO0Oo(Size.m1516getWidthimpl(((Size) mutableState.getValue()).getPackedValue()), composerStartRestartGroup), o0000O0.OooO0Oo(Size.m1513getHeightimpl(((Size) mutableState.getValue()).getPackedValue()), composerStartRestartGroup));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(showPraiseAnim);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooOO0(showPraiseAnim);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00OO00O.OooO00o(strOooO0o, true, 1, null, (Function0) objRememberedValue3, modifierM519requiredSizeVpY3zN4, composerStartRestartGroup, 432, 8);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(502473823);
            composerStartRestartGroup.startReplaceableGroup(502473891);
            if (data.isPraise()) {
                z0 z0Var2 = z0.f57313OooO00o;
                iOooO0o0 = z0.OooO0o0(composerStartRestartGroup);
            } else {
                iOooO0o0 = o0Oo0oo.icv_praise;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Painter painterPainterResource = PainterResources_androidKt.painterResource(iOooO0o0, composerStartRestartGroup, 0);
            Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion2);
            composerStartRestartGroup.startReplaceableGroup(502474145);
            if (data.isPraise()) {
                colorFilterM1722tintxETnrds$default = null;
            } else {
                ColorFilter.Companion companion4 = ColorFilter.INSTANCE;
                if (z || !z2) {
                    composerStartRestartGroup.startReplaceableGroup(502474299);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(502474314);
                    j = o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
                }
                composerStartRestartGroup.endReplaceableGroup();
                colorFilterM1722tintxETnrds$default = ColorFilter.Companion.m1722tintxETnrds$default(companion4, j, 0, 2, null);
            }
            ColorFilter colorFilter = colorFilterM1722tintxETnrds$default;
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(painterPainterResource, (String) null, modifierMatchParentSize, (Alignment) null, (ContentScale) null, 0.0f, colorFilter, composerStartRestartGroup, 56, 56);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(data, z, z2, showPraiseAnim, modifier2, i, i2));
    }

    public static final void OooO0o(@NotNull MomentDetailModel itemData, @NotNull MutableState<Boolean> isInPraise, @NotNull BaseMomentDetailVM momentVM, @NotNull LifecycleOwner lifecycleOwner, boolean z, @NotNull MutableState<Boolean> showPraiseAnim, @Nullable Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        Intrinsics.checkNotNullParameter(isInPraise, "isInPraise");
        Intrinsics.checkNotNullParameter(momentVM, "momentVM");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(showPraiseAnim, "showPraiseAnim");
        boolean zIsPraise = itemData.isPraise();
        momentVM.postPraise(itemData.getId(), zIsPraise ? 1 : 0).observe(lifecycleOwner, new o000oOoO(new OooOOOO(isInPraise, showPraiseAnim, zIsPraise ? 1 : 0, itemData, z), new OooOo00(function1, isInPraise), null, false));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(MomentDetailModel momentDetailModel, boolean z, boolean z2, MomentAdapterTag momentAdapterTag, BaseMomentDetailVM baseMomentDetailVM, Activity activity, Composer composer, int i) {
        long j;
        Composer composerStartRestartGroup = composer.startRestartGroup(521249318);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(521249318, i, -1, "com.yalla.yalla.ui.composable.moment.Share (MomentBottomComp.kt:110)");
        }
        if (momentDetailModel.getPower() == MomentTypePower.Open.getValue() && momentDetailModel.getDeleteType() == MomentTypeDelete.NORMAL.getValue()) {
            Painter painterPainterResource = PainterResources_androidKt.painterResource(o0Oo0oo.icv_share, composerStartRestartGroup, 0);
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(21)), false, false, 0L, false, null, null, null, new OooOOO0(z, z2, activity, momentDetailModel, momentAdapterTag, baseMomentDetailVM), 253);
            ColorFilter.Companion companion = ColorFilter.INSTANCE;
            if (z || !z2) {
                composerStartRestartGroup.startReplaceableGroup(1154223614);
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1154223629);
                j = o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0;
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(painterPainterResource, (String) null, modifierOooO0O0, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m1722tintxETnrds$default(companion, j, 0, 2, null), composerStartRestartGroup, 56, 56);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(momentDetailModel, z, z2, momentAdapterTag, baseMomentDetailVM, activity, i));
    }
}
