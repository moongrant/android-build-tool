package p536o0o0Oo0o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserMyOutFitModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.ui.vm.user.EntranceEffectProfileCardVM;
import io.agora.rtc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p148o00Oo0o.o00000O0;
import p148o00Oo0o.o0O0O00;
import p150o00Oo0oO.o0000Ooo;
import p377o0OOoOo.o000O000;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.v0;
import p519o0o0O0oO.y4;
import p571o0oOoOO.o0O0OOO0;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEntranceEffectProfileCardScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntranceEffectProfileCardScreen.kt\ncom/yalla/yalla/ui/screen/user/EntranceEffectProfileCardScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,460:1\n81#2,11:461\n81#2,11:472\n76#3:483\n76#3:694\n154#4:484\n154#4:485\n154#4:486\n154#4:487\n154#4:528\n154#4:529\n154#4:565\n154#4:566\n154#4:567\n154#4:568\n154#4:588\n154#4:596\n154#4:597\n154#4:598\n154#4:599\n154#4:600\n154#4:636\n154#4:637\n154#4:643\n154#4:644\n154#4:645\n154#4:685\n154#4:686\n72#5,6:488\n78#5:522\n82#5:527\n78#6,11:494\n91#6:526\n78#6,11:536\n91#6:572\n78#6,11:607\n91#6:641\n78#6,11:651\n91#6:683\n456#7,8:505\n464#7,3:519\n467#7,3:523\n456#7,8:547\n464#7,3:561\n467#7,3:569\n25#7:574\n36#7:581\n25#7:589\n456#7,8:618\n464#7,3:632\n467#7,3:638\n456#7,8:662\n464#7,3:676\n467#7,3:680\n36#7:687\n4144#8,6:513\n4144#8,6:555\n4144#8,6:626\n4144#8,6:670\n66#9,6:530\n72#9:564\n76#9:573\n67#9,5:646\n72#9:679\n76#9:684\n1097#10,6:575\n1097#10,6:582\n1097#10,6:590\n1097#10,6:688\n73#11,6:601\n79#11:635\n83#11:642\n81#12:695\n107#12,2:696\n*S KotlinDebug\n*F\n+ 1 EntranceEffectProfileCardScreen.kt\ncom/yalla/yalla/ui/screen/user/EntranceEffectProfileCardScreenKt\n*L\n80#1:461,11\n94#1:472,11\n96#1:483\n374#1:694\n147#1:484\n149#1:485\n151#1:486\n152#1:487\n170#1:528\n171#1:529\n183#1:565\n185#1:566\n187#1:567\n189#1:568\n229#1:588\n236#1:596\n238#1:597\n255#1:598\n256#1:599\n261#1:600\n266#1:636\n268#1:637\n291#1:643\n292#1:644\n304#1:645\n341#1:685\n354#1:686\n143#1:488,6\n143#1:522\n143#1:527\n143#1:494,11\n143#1:526\n167#1:536,11\n167#1:572\n252#1:607,11\n252#1:641\n300#1:651,11\n300#1:683\n143#1:505,8\n143#1:519,3\n143#1:523,3\n167#1:547,8\n167#1:561,3\n167#1:569,3\n205#1:574\n214#1:581\n234#1:589\n252#1:618,8\n252#1:632,3\n252#1:638,3\n300#1:662,8\n300#1:676,3\n300#1:680,3\n355#1:687\n143#1:513,6\n167#1:555,6\n252#1:626,6\n300#1:670,6\n167#1:530,6\n167#1:564\n167#1:573\n300#1:646,5\n300#1:679\n300#1:684\n205#1:575,6\n214#1:582,6\n234#1:590,6\n355#1:688,6\n252#1:601,6\n252#1:635\n252#1:642\n205#1:695\n205#1:696,2\n*E\n"})
public final class o0OOOO00 {

    public static final class OooO extends Lambda implements Function4<ColumnScope, UserMyOutFitModel, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f54996OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(EntranceEffectProfileCardVM entranceEffectProfileCardVM) {
            super(4);
            this.f54996OooO0Oo = entranceEffectProfileCardVM;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(ColumnScope columnScope, UserMyOutFitModel userMyOutFitModel, Composer composer, Integer num) {
            ColumnScope onAddProfilePreViewDialog = columnScope;
            UserMyOutFitModel it = userMyOutFitModel;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(onAddProfilePreViewDialog, "$this$onAddProfilePreViewDialog");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1116441296, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MainContentList.<anonymous> (EntranceEffectProfileCardScreen.kt:101)");
            }
            Oo0000.OooO0OO(this.f54996OooO0Oo, it, composer2, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f54997OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54998OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, int i2) {
            super(2);
            this.f54997OooO0Oo = i;
            this.f54998OooO0o0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54998OooO0o0 | 1);
            o0OOOO00.OooO00o(this.f54997OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f54999OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Integer f55000OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55001OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55002OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, int i2, Integer num, int i3) {
            super(2);
            this.f54999OooO0Oo = i;
            this.f55001OooO0o0 = i2;
            this.f55000OooO0o = num;
            this.f55002OooO0oO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55002OooO0oO | 1);
            int i = this.f55001OooO0o0;
            Integer num2 = this.f55000OooO0o;
            o0OOOO00.OooO0O0(this.f54999OooO0Oo, i, num2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserMyOutFitModel f55003OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55004OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55005OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(UserMyOutFitModel userMyOutFitModel, int i, int i2) {
            super(2);
            this.f55003OooO0Oo = userMyOutFitModel;
            this.f55005OooO0o0 = i;
            this.f55004OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55004OooO0o | 1);
            o0OOOO00.OooO0OO(this.f55003OooO0Oo, this.f55005OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<UserMyOutFitModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f55006OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f55007OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f55008OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(EntranceEffectProfileCardVM entranceEffectProfileCardVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
            super(1);
            this.f55006OooO0Oo = entranceEffectProfileCardVM;
            this.f55008OooO0o0 = o0o0ooo0;
            this.f55007OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(UserMyOutFitModel userMyOutFitModel) {
            UserMyOutFitModel model = userMyOutFitModel;
            Intrinsics.checkNotNullParameter(model, "model");
            o0OOOO00.OooOOO(model, this.f55006OooO0Oo, this.f55008OooO0o0, this.f55007OooO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f55009OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(EntranceEffectProfileCardVM entranceEffectProfileCardVM) {
            super(3);
            this.f55009OooO0Oo = entranceEffectProfileCardVM;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2071493849, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MainContentList.<anonymous> (EntranceEffectProfileCardScreen.kt:108)");
                }
                o0000Ooo.OooO00o(StringResources_androidKt.stringResource(this.f55009OooO0Oo.getPageType() == 1 ? oO00OOo0.my_utfit_data_is_empty : oO00OOo0.my_entrance_data_is_empty, composer2, 0), 0, 0.0f, null, null, false, null, null, null, composer2, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEntranceEffectProfileCardScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntranceEffectProfileCardScreen.kt\ncom/yalla/yalla/ui/screen/user/EntranceEffectProfileCardScreenKt$MainContentList$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,460:1\n154#2:461\n154#2:462\n154#2:463\n*S KotlinDebug\n*F\n+ 1 EntranceEffectProfileCardScreen.kt\ncom/yalla/yalla/ui/screen/user/EntranceEffectProfileCardScreenKt$MainContentList$4\n*L\n120#1:461\n121#1:462\n122#1:463\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<UserMyOutFitModel> f55010OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f55011OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f55012OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f55013OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o000O0.OooO0O0<UserMyOutFitModel> oooO0O0, EntranceEffectProfileCardVM entranceEffectProfileCardVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f55010OooO0Oo = oooO0O0;
            this.f55012OooO0o0 = entranceEffectProfileCardVM;
            this.f55011OooO0o = o0o0ooo0;
            this.f55013OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1422901079, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MainContentList.<anonymous> (EntranceEffectProfileCardScreen.kt:116)");
                }
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                PaddingValues paddingValuesM470PaddingValuesYgX7TsA = PaddingKt.m470PaddingValuesYgX7TsA(Dp.m3765constructorimpl(9), Dp.m3765constructorimpl(8));
                Arrangement arrangement = Arrangement.INSTANCE;
                float f = 1;
                LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, paddingValuesM470PaddingValuesYgX7TsA, false, arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f)), arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f)), null, false, new o0oo0000(this.f55010OooO0Oo, this.f55012OooO0o0, this.f55011OooO0o, this.f55013OooO0oO), composer2, 1772592, 404);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEntranceEffectProfileCardScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntranceEffectProfileCardScreen.kt\ncom/yalla/yalla/ui/screen/user/EntranceEffectProfileCardScreenKt$MainPic$1$1\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,460:1\n489#2,11:461\n*S KotlinDebug\n*F\n+ 1 EntranceEffectProfileCardScreen.kt\ncom/yalla/yalla/ui/screen/user/EntranceEffectProfileCardScreenKt$MainPic$1$1\n*L\n215#1:461,11\n*E\n"})
    public static final class OooOOO extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55014OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MutableState<Boolean> mutableState) {
            super(1);
            this.f55014OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<Boolean> mutableState = this.f55014OooO0Oo;
            it.f8593OooO0o0 = new ooo0Oo0(mutableState, mutableState);
            p417o0OoO0.o00Oo0.OooO0o(it, new ColorDrawable(Color.parseColor("#FF2C2C34")));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<UserMyOutFitModel> f55015OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55016OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f55017OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o000O0.OooO0O0<UserMyOutFitModel> oooO0O0, EntranceEffectProfileCardVM entranceEffectProfileCardVM, int i) {
            super(2);
            this.f55015OooO0Oo = oooO0O0;
            this.f55017OooO0o0 = entranceEffectProfileCardVM;
            this.f55016OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55016OooO0o | 1);
            o0OOOO00.OooO0Oo(this.f55015OooO0Oo, this.f55017OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55018OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55019OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f55020OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55021OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(BoxScope boxScope, String str, int i, int i2) {
            super(2);
            this.f55018OooO0Oo = boxScope;
            this.f55020OooO0o0 = str;
            this.f55019OooO0o = i;
            this.f55021OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55021OooO0oO | 1);
            String str = this.f55020OooO0o0;
            int i = this.f55019OooO0o;
            o0OOOO00.OooO0o0(this.f55018OooO0Oo, str, i, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEntranceEffectProfileCardScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntranceEffectProfileCardScreen.kt\ncom/yalla/yalla/ui/screen/user/EntranceEffectProfileCardScreenKt$MyOutFitItemUseButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,460:1\n154#2:461\n154#2:462\n*S KotlinDebug\n*F\n+ 1 EntranceEffectProfileCardScreen.kt\ncom/yalla/yalla/ui/screen/user/EntranceEffectProfileCardScreenKt$MyOutFitItemUseButton$1\n*L\n347#1:461\n349#1:462\n*E\n"})
    public static final class OooOo extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserMyOutFitModel f55022OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(UserMyOutFitModel userMyOutFitModel) {
            super(3);
            this.f55022OooO0Oo = userMyOutFitModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope TextButton = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(92243332, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MyOutFitItemUseButton.<anonymous> (EntranceEffectProfileCardScreen.kt:341)");
                }
                if (this.f55022OooO0Oo.getSelected()) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_store_bubble_use, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composer2, 6, 2);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EntranceEffectProfileCardVM f55023OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55024OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(EntranceEffectProfileCardVM entranceEffectProfileCardVM, int i) {
            super(2);
            this.f55023OooO0Oo = entranceEffectProfileCardVM;
            this.f55024OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55024OooO0o0 | 1);
            o0OOOO00.OooO0o(this.f55023OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserMyOutFitModel f55025OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55026OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55027OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(UserMyOutFitModel userMyOutFitModel, Function0<Unit> function0, int i) {
            super(2);
            this.f55025OooO0Oo = userMyOutFitModel;
            this.f55027OooO0o0 = function0;
            this.f55026OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55026OooO0o | 1);
            o0OOOO00.OooO0oO(this.f55025OooO0Oo, this.f55027OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55028OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(Function0<Unit> function0) {
            super(0);
            this.f55028OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55028OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f55029OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(Context context) {
            super(0);
            this.f55029OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = PremiumActivity.f27140Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(this.f55029OooO0Oo, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55030OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55031OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f55030OooO0Oo = mutableState;
            this.f55031OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55031OooO0o0 | 1);
            o0OOOO00.OooO0oo(this.f55030OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55032OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55033OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(BoxScope boxScope, int i) {
            super(2);
            this.f55032OooO0Oo = boxScope;
            this.f55033OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55033OooO0o0 | 1);
            o0OOOO00.OooO(this.f55032OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55034OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Integer f55035OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55036OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55037OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(BoxScope boxScope, int i, Integer num, int i2) {
            super(2);
            this.f55034OooO0Oo = boxScope;
            this.f55036OooO0o0 = i;
            this.f55035OooO0o = num;
            this.f55037OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55037OooO0oO | 1);
            int i = this.f55036OooO0o0;
            Integer num2 = this.f55035OooO0o;
            o0OOOO00.OooOO0(this.f55034OooO0Oo, i, num2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00oO0o f55038OooO0Oo = new o00oO0o();

        public o00oO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55039OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55040OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f55039OooO0Oo = mutableState;
            this.f55040OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55040OooO0o0 | 1);
            o0OOOO00.OooOO0o(this.f55039OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OOO0o f55041OooO0Oo = new o0OOO0o();

        public o0OOO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.Vip1, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0Oo0oo f55042OooO0Oo = new o0Oo0oo();

        public o0Oo0oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OoOo0 f55043OooO0Oo = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55044OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55045OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f55044OooO0Oo = mutableState;
            this.f55045OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55045OooO0o0 | 1);
            o0OOOO00.OooOO0O(this.f55044OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final oo000o f55046OooO0Oo = new oo000o();

        public oo000o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.Vip1, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO(BoxScope boxScope, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(414855402);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(414855402, i, -1, "com.yalla.yalla.ui.screen.user.RightTopOpenBig (EntranceEffectProfileCardScreen.kt:284)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_profile_expand, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m476padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m3765constructorimpl(2)), Dp.m3765constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Oo0(boxScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(int i, @Nullable Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2135474770);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2135474770, i2, -1, "com.yalla.yalla.ui.screen.user.EntranceEffectAndProfileCardScreen (EntranceEffectProfileCardScreen.kt:78)");
            }
            String strValueOf = String.valueOf(i);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EntranceEffectProfileCardVM.class, current, strValueOf, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EntranceEffectProfileCardVM entranceEffectProfileCardVM = (EntranceEffectProfileCardVM) viewModel;
            entranceEffectProfileCardVM.setPageType(i);
            o000O0.OooO0O0 oooO0O0OooO00o = o000O0.OooOOO.OooO00o(entranceEffectProfileCardVM.getPagingSourceData().f37667OooO0oo, composerStartRestartGroup);
            int i4 = o000O0.OooO0O0.f34327OooO0o0;
            OooO0Oo(oooO0O0OooO00o, entranceEffectProfileCardVM, composerStartRestartGroup, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(int i, int i2, Integer num, Composer composer, int i3) {
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(51135358);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(num) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i4 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(51135358, i3, -1, "com.yalla.yalla.ui.screen.user.LeftTopTimeRemaining (EntranceEffectProfileCardScreen.kt:247)");
            }
            if ((i > 0 || i2 > 0) && (num == null || num.intValue() != -1)) {
                boolean z = i2 > 0;
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 5;
                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 12, null), Dp.m3765constructorimpl(20));
                int i5 = o0oO0O0o.f47152o00OOOo;
                Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(BackgroundKt.m168backgroundbw27NRU(modifierM509height3ABfNKs, z ? o0oO0O0o.f47050o000O0o : o0oO0O0o.f47054o000OO, RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3765constructorimpl(4), 0.0f, Dp.m3765constructorimpl(6), 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(z ? oOo00OO0.ic_store_limit_time_disable : oOo00OO0.ic_store_limit_time, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(11)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(2), null, composerStartRestartGroup, 6, 2);
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.store_xxx_days);
                String[] strArr = new String[1];
                strArr[0] = i2 > 0 ? String.valueOf(i2) : String.valueOf(i);
                String strOooO00o = o0000O.OooO00o(strOooO0OO, strArr);
                int i6 = o0oO0O0o.f47152o00OOOo;
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(strOooO00o, (Modifier) null, o0oO0O0o.f46946OooO0O0, o0000O0.OooO0OO(11, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
                p426o0OoOO.o000oOoO.OooO00o(composer2);
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, i2, num, i3));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(UserMyOutFitModel userMyOutFitModel, int i, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1478033357);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1478033357, i2, -1, "com.yalla.yalla.ui.screen.user.ListItemMainContent (EntranceEffectProfileCardScreen.kt:165)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 6;
        float f2 = 0;
        Modifier modifierClip = ClipKt.clip(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(Constants.ERR_PUBLISH_STREAM_NOT_FOUND)), RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2)));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClip);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        OooO0o0(boxScopeInstance, userMyOutFitModel.getPicUrl(), i, composerStartRestartGroup, ((i2 << 3) & 896) | 6);
        OooOO0(boxScopeInstance, userMyOutFitModel.getObtainType(), userMyOutFitModel.getObtainLevel(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-950749384);
        if (userMyOutFitModel.getSelected()) {
            Modifier modifierM437offsetVpY3zN4$default = OffsetKt.m437offsetVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m512requiredHeight3ABfNKs(companion, Dp.m3765constructorimpl(Constants.ERR_MODULE_NOT_FOUND)), 0.0f, 1, null), 0.0f, Dp.m3765constructorimpl(1), 1, null);
            float fM3765constructorimpl = Dp.m3765constructorimpl(2);
            int i3 = o0oO0O0o.f47152o00OOOo;
            BoxKt.Box(BorderKt.m180borderxT4_qwU(modifierM437offsetVpY3zN4$default, fM3765constructorimpl, o0oO0O0o.f46993OoooOo0, RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2))), composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        OooO0O0(userMyOutFitModel.getDayNum(), userMyOutFitModel.getFrozenDay(), userMyOutFitModel.getTimeLong(), composerStartRestartGroup, 0);
        OooO(boxScopeInstance, composerStartRestartGroup, 6);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(userMyOutFitModel, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(o000O0.OooO0O0<UserMyOutFitModel> oooO0O0, EntranceEffectProfileCardVM entranceEffectProfileCardVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(48864205);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(48864205, i, -1, "com.yalla.yalla.ui.screen.user.MainContentList (EntranceEffectProfileCardScreen.kt:88)");
        }
        OooO0o(entranceEffectProfileCardVM, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(o0O0OOO0.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        o0O0OOO0 o0o0ooo0 = (o0O0OOO0) viewModel;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        y4.f53219OooO00o.OooO00o(entranceEffectProfileCardVM.getCurrentPosition(), (o000O00O.o0Oo0oo) oooO0O0.f34330OooO0OO.getValue(), entranceEffectProfileCardVM.getShowProfilePreViewDialog(), new OooO0o(entranceEffectProfileCardVM, o0o0ooo0, lifecycleOwner), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1116441296, true, new OooO(entranceEffectProfileCardVM)), composerStartRestartGroup, 221248);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2071493849, true, new OooOO0(entranceEffectProfileCardVM));
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1422901079, true, new OooOO0O(oooO0O0, entranceEffectProfileCardVM, o0o0ooo0, lifecycleOwner));
        int i2 = o000O0.OooO0O0.f34327OooO0o0;
        o0O0O00.OooO00o(oooO0O0, modifierFillMaxSize$default, null, null, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, (i & 14) | 102236216, 188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(oooO0O0, entranceEffectProfileCardVM, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(@NotNull EntranceEffectProfileCardVM viewModel, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1514426791);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1514426791, i, -1, "com.yalla.yalla.ui.screen.user.MyOutFitCommonDialog (EntranceEffectProfileCardScreen.kt:360)");
        }
        OooO0oo(viewModel.getShowPremiumBuyFrozenDialog(), composerStartRestartGroup, 0);
        OooOO0O(viewModel.getShowVipBuyFrozenDialog(), composerStartRestartGroup, 0);
        OooOO0o(viewModel.getShowVipGiveFrozenDialog(), composerStartRestartGroup, 0);
        o0OO00OO.OooO00o(viewModel.getShowVipHiddenDialog(), composerStartRestartGroup, 0);
        o0OO00OO.OooO0O0(viewModel.getShowWealthHiddenDialog(), composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(viewModel, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(BoxScope boxScope, String str, int i, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-296451542);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-296451542, i3, -1, "com.yalla.yalla.ui.screen.user.MainPic (EntranceEffectProfileCardScreen.kt:203)");
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
            composerStartRestartGroup.startReplaceableGroup(-938935420);
            Modifier modifierOooO0Oo = i == 0 ? com.code.android.util.o0O0O00.OooO0Oo(Modifier.INSTANCE, composerStartRestartGroup, 6) : Modifier.INSTANCE;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OooOOO(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            p100o000oOoo.o0000O0 o0000o0OooO0OO = p417o0OoO0.o00Oo0.OooO0OO(str, (Function1) objRememberedValue2, composerStartRestartGroup, (i3 >> 3) & 14, 0);
            ContentScale crop = ContentScale.INSTANCE.getCrop();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = 6;
            float f2 = 0;
            ImageKt.Image(o0000o0OooO0OO, "", SizeKt.fillMaxSize$default(ClipKt.clip(companion2.then(modifierOooO0Oo), RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2))), 0.0f, 1, null), (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = "svga/anim_loading.svga";
                    composerStartRestartGroup.updateRememberedValue("svga/anim_loading.svga");
                }
                composerStartRestartGroup.endReplaceableGroup();
                p154o00OoO00.OooOo00.OooO00o((String) objRememberedValue3, true, 0, null, null, PaddingKt.m480paddingqDBjuR0$default(boxScope.align(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(30)), Alignment.INSTANCE.getCenter()), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(11), 7, null), composerStartRestartGroup, 54, 28);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(boxScope, str, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oO(UserMyOutFitModel userMyOutFitModel, Function0<Unit> function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1288639356);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288639356, i, -1, "com.yalla.yalla.ui.screen.user.MyOutFitItemUseButton (EntranceEffectProfileCardScreen.kt:332)");
        }
        boolean z = userMyOutFitModel.getFrozenDay() == 0;
        String strOooO0OO = o0000.OooO0OO(userMyOutFitModel.getSelected() ? oO00OOo0.In_Use : oO00OOo0.Use);
        int i2 = o0oO0O0o.f47152o00OOOo;
        long j = o0oO0O0o.f46946OooO0O0;
        androidx.compose.ui.graphics.Color colorM1660boximpl = z ? null : androidx.compose.ui.graphics.Color.m1660boximpl(o0oO0O0o.f47044o000O00);
        long jOooO0OO = o0000O0.OooO0OO(16, composerStartRestartGroup, 6);
        TextButtonStyle textButtonStyle = z ? TextButtonStyle.Green : TextButtonStyle.GreyDisable;
        RoundedCornerShape roundedCornerShapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(0));
        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(36));
        androidx.compose.ui.graphics.Color colorM1660boximpl2 = androidx.compose.ui.graphics.Color.m1660boximpl(j);
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 92243332, true, new OooOo(userMyOutFitModel));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function0);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Oooo000(function0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o00000O0.OooO00o(strOooO0OO, jOooO0OO, null, textButtonStyle, colorM1660boximpl2, colorM1660boximpl, roundedCornerShapeM727RoundedCornerShape0680j_4, 0.0f, null, false, false, 0L, false, null, null, composableLambda, null, null, modifierM509height3ABfNKs, (Function0) objRememberedValue, composerStartRestartGroup, 0, 100859904, 229252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(userMyOutFitModel, function0, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oo(@NotNull MutableState<Boolean> show, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(show, "show");
        Composer composerStartRestartGroup = composer.startRestartGroup(1994697026);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(show) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1994697026, i2, -1, "com.yalla.yalla.ui.screen.user.PremiumBubbleBuyFrozenDialog (EntranceEffectProfileCardScreen.kt:372)");
            }
            composer2 = composerStartRestartGroup;
            p158o00OoOOO.oo000o.OooO0Oo(show, null, o0000.OooO0OO(oO00OOo0.only_premium_use), null, false, false, null, null, o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium), false, null, false, new o000oOoO((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null, false, false, null, o0OoOo0.f55043OooO0Oo, null, null, composer2, i2 & 14, 12582912, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(show, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooOO0(BoxScope boxScope, int i, Integer num, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String strOooO00o;
        Composer composerStartRestartGroup = composer.startRestartGroup(-406952272);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-406952272, i2, -1, "com.yalla.yalla.ui.screen.user.UsablePermissionDescription (EntranceEffectProfileCardScreen.kt:297)");
            }
            if (i > 0) {
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment center = companion.getCenter();
                Modifier modifierAlign = boxScope.align(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(24)), companion.getBottomCenter());
                int i4 = o0oO0O0o.f47152o00OOOo;
                Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierAlign, o0oO0O0o.f47041o0000ooO, null, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (i != 1) {
                    strOooO00o = "";
                    if (i != 2) {
                        composerStartRestartGroup.startReplaceableGroup(1976310379);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(1449224858);
                        strOooO00o = num != null ? o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.free_for_vip_xxx, composerStartRestartGroup, 0), String.valueOf(VipLevel.INSTANCE.of(num.intValue()).level())) : "";
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1449224745);
                    strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.free_for_xxx, composerStartRestartGroup, 0), PremiumLevel.INSTANCE.of(num).premiumName());
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(strOooO00o, (Modifier) null, o0oO0O0o.f47006o000, o0000O0.OooO0OO(12, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
                p426o0OoOO.o000oOoO.OooO00o(composer2);
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(boxScope, i, num, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooOO0O(MutableState<Boolean> mutableState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-599486840);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(mutableState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-599486840, i2, -1, "com.yalla.yalla.ui.screen.user.VipBubbleBuyFrozenDialog (EntranceEffectProfileCardScreen.kt:386)");
            }
            composer2 = composerStartRestartGroup;
            p158o00OoOOO.oo000o.OooO0Oo(mutableState, null, o0000.OooO0OO(oO00OOo0.vip_can_use), null, false, false, null, null, o0000.OooO0OO(oO00OOo0.Get_Vip), false, null, false, oo000o.f55046OooO0Oo, null, false, false, null, o00oO0o.f55038OooO0Oo, null, null, composer2, i2 & 14, 12583296, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0ooOOo(mutableState, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooOO0o(MutableState<Boolean> mutableState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(38867527);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(mutableState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(38867527, i2, -1, "com.yalla.yalla.ui.screen.user.VipBubbleGiveFrozenDialog (EntranceEffectProfileCardScreen.kt:399)");
            }
            composer2 = composerStartRestartGroup;
            p158o00OoOOO.oo000o.OooO0Oo(mutableState, null, o0000.OooO0OO(oO00OOo0.firzen_vip_use_ubfrozen), null, false, false, null, null, o0000.OooO0OO(oO00OOo0.Unfreeze_VIP), false, null, false, o0OOO0o.f55041OooO0Oo, null, false, false, null, o0Oo0oo.f55042OooO0Oo, null, null, composer2, i2 & 14, 12583296, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OO00O(mutableState, i));
    }

    public static final void OooOOO(UserMyOutFitModel userMyOutFitModel, EntranceEffectProfileCardVM entranceEffectProfileCardVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        Integer canBuyUserType;
        Integer canBuyUserType2;
        if (userMyOutFitModel.getSelected()) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.item_in_used);
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (userMyOutFitModel.getFrozenDay() != 0 && userMyOutFitModel.getCanBuy() && (canBuyUserType2 = userMyOutFitModel.getCanBuyUserType()) != null && canBuyUserType2.intValue() == 1) {
            entranceEffectProfileCardVM.getShowPremiumBuyFrozenDialog().setValue(Boolean.TRUE);
            return;
        }
        if (userMyOutFitModel.getFrozenDay() != 0 && userMyOutFitModel.getCanBuy() && (canBuyUserType = userMyOutFitModel.getCanBuyUserType()) != null && canBuyUserType.intValue() == 2) {
            entranceEffectProfileCardVM.getShowVipBuyFrozenDialog().setValue(Boolean.TRUE);
            return;
        }
        if (userMyOutFitModel.getFrozenDay() != 0 && !userMyOutFitModel.getCanBuy() && userMyOutFitModel.getObtainType() == 2) {
            entranceEffectProfileCardVM.getShowVipGiveFrozenDialog().setValue(Boolean.TRUE);
            return;
        }
        p420o0OoO0OO.o0OO00O<ApiResult<Boolean>> o0oo00oUseProfile = entranceEffectProfileCardVM.useProfile(userMyOutFitModel.getShopId());
        v0.OooO0O0(o0oo00oUseProfile, o0o0ooo0, false, 6);
        o000O000.OooO0Oo(o0oo00oUseProfile, lifecycleOwner, true, null, new o(entranceEffectProfileCardVM), oO00000.f55084OooO0Oo, 4);
    }

    public static final void OooOOO0(UserMyOutFitModel userMyOutFitModel, EntranceEffectProfileCardVM entranceEffectProfileCardVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, int i, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1149362061);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1149362061, i2, -1, "com.yalla.yalla.ui.screen.user.ListItemContainer (EntranceEffectProfileCardScreen.kt:134)");
        }
        float f = 4;
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(com.facebook.OooOo.OooO0O0(6, PaddingKt.m476padding3ABfNKs(BorderKt.m180borderxT4_qwU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(f), userMyOutFitModel.getSelected() ? o0oO0O0o.f46997Ooooo0o : o0oO0O0o.f46945OooO00o, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(10))), Dp.m3765constructorimpl(f))), false, false, 0L, false, null, null, null, new o0OOOO0o(entranceEffectProfileCardVM, i), 253);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        OooO0OO(userMyOutFitModel, entranceEffectProfileCardVM.getPageType(), composerStartRestartGroup, 8);
        OooO0oO(userMyOutFitModel, new o0OOo000(userMyOutFitModel, entranceEffectProfileCardVM, o0o0ooo0, lifecycleOwner), composerStartRestartGroup, 8);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o0o0000(userMyOutFitModel, entranceEffectProfileCardVM, o0o0ooo0, lifecycleOwner, i, i2));
    }
}
