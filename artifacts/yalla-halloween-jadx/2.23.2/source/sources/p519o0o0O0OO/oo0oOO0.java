package p519o0o0O0OO;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentTypeDelete;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p448o0OoOoo.o00O0OOO;
import p476o0OooooO.o0OOo000;
import p521o0o0O0o0.o000OO;
import p521o0o0O0o0.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentDetailComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,334:1\n76#2:335\n76#2:336\n76#2:337\n76#2:338\n76#2:339\n76#2:351\n76#2:387\n81#3,11:340\n72#4,6:352\n78#4:386\n73#4,5:389\n78#4:422\n82#4:441\n82#4:449\n78#5,11:358\n78#5,11:394\n91#5:440\n91#5:448\n456#6,8:369\n464#6,3:383\n456#6,8:405\n464#6,3:419\n467#6,3:437\n467#6,3:445\n4144#7,6:377\n4144#7,6:413\n154#8:388\n154#8:423\n154#8:424\n154#8:425\n154#8:426\n154#8:427\n154#8:428\n154#8:429\n154#8:430\n154#8:431\n154#8:432\n154#8:433\n154#8:434\n154#8:435\n154#8:436\n154#8:442\n154#8:443\n154#8:444\n*S KotlinDebug\n*F\n+ 1 MomentDetailComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailCompKt\n*L\n132#1:335\n133#1:336\n134#1:337\n135#1:338\n136#1:339\n139#1:351\n158#1:387\n137#1:340,11\n143#1:352,6\n143#1:386\n193#1:389,5\n193#1:422\n193#1:441\n143#1:449\n143#1:358,11\n193#1:394,11\n193#1:440\n143#1:448\n143#1:369,8\n143#1:383,3\n193#1:405,8\n193#1:419,3\n193#1:437,3\n143#1:445,3\n143#1:377,6\n193#1:413,6\n195#1:388\n202#1:423\n203#1:424\n211#1:425\n213#1:426\n237#1:427\n239#1:428\n250#1:429\n252#1:430\n260#1:431\n262#1:432\n299#1:433\n300#1:434\n301#1:435\n308#1:436\n319#1:442\n324#1:443\n328#1:444\n*E\n"})
public final class oo0oOO0 {

    @SourceDebugExtension({"SMAP\nMomentDetailComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailCompKt$MomentDetailComp$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,334:1\n76#2:335\n76#2:336\n*S KotlinDebug\n*F\n+ 1 MomentDetailComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentDetailCompKt$MomentDetailComp$1\n*L\n80#1:335\n81#1:336\n*E\n"})
    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Long f52830OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f52831OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52832OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52833OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52834OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f52835OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f52836OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ EnterRoomParentPage f52837OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f52838OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ boolean f52839OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f52840OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f52841OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ Long f52842OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f52843OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(long j, int i, MomentDetailModel momentDetailModel, FragmentActivity fragmentActivity, String str, Long l, boolean z, EnterRoomParentPage enterRoomParentPage, Function1<? super MomentDetailModel, Unit> function1, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, boolean z2, ArrayList<String> arrayList, Long l2, int i2) {
            super(2);
            this.f52831OooO0Oo = j;
            this.f52833OooO0o0 = i;
            this.f52832OooO0o = momentDetailModel;
            this.f52834OooO0oO = fragmentActivity;
            this.f52835OooO0oo = str;
            this.f52830OooO = l;
            this.f52836OooOO0 = z;
            this.f52837OooOO0O = enterRoomParentPage;
            this.f52838OooOO0o = function1;
            this.f52840OooOOO0 = function2;
            this.f52839OooOOO = z2;
            this.f52841OooOOOO = arrayList;
            this.f52842OooOOOo = l2;
            this.f52843OooOOo0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2121086972, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.MomentDetailComp.<anonymous> (MomentDetailComp.kt:79)");
                }
                int iIntValue2 = ((Number) composer2.consume(oo0OOoo.f52737OooO0oo)).intValue();
                o000OO o000oo2 = (o000OO) composer2.consume(oo0OOoo.f52736OooO0oO);
                EffectsKt.DisposableEffect(Unit.INSTANCE, new oo0o0O0(o000oo2, iIntValue2), composer2, 6);
                SurfaceKt.m1201SurfaceFjzlyU(OnGloballyPositionedModifierKt.onGloballyPositioned(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new o00O0OO(iIntValue2, this.f52832OooO0o, o000oo2)), null, this.f52831OooO0Oo, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -71836360, true, new o00O0OOO(this.f52832OooO0o, this.f52834OooO0oO, this.f52835OooO0oo, this.f52830OooO, this.f52836OooOO0, this.f52837OooOO0O, this.f52838OooOO0o, this.f52840OooOOO0, this.f52839OooOOO, this.f52841OooOOOO, this.f52842OooOOOo, this.f52833OooO0o0, this.f52843OooOOo0)), composer2, ((this.f52833OooO0o0 << 3) & 896) | 1572864, 58);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ EnterRoomParentPage f52844OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52845OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000OO f52846OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52847OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f52848OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52849OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentDetailModel, Unit> f52850OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f52851OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f52852OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ boolean f52853OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f52854OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ long f52855OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ String f52856OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f52857OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ Long f52858OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final /* synthetic */ Long f52859OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public final /* synthetic */ int f52860OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final /* synthetic */ int f52861OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public final /* synthetic */ int f52862OooOo0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(MomentDetailModel momentDetailModel, int i, o000OO o000oo2, MomentAdapterTag momentAdapterTag, FragmentActivity fragmentActivity, EnterRoomParentPage enterRoomParentPage, Function1<? super MomentDetailModel, Unit> function1, boolean z, boolean z2, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, boolean z3, long j, String str, Long l, ArrayList<String> arrayList, Long l2, int i2, int i3, int i4) {
            super(2);
            this.f52845OooO0Oo = momentDetailModel;
            this.f52847OooO0o0 = i;
            this.f52846OooO0o = o000oo2;
            this.f52848OooO0oO = momentAdapterTag;
            this.f52849OooO0oo = fragmentActivity;
            this.f52844OooO = enterRoomParentPage;
            this.f52850OooOO0 = function1;
            this.f52851OooOO0O = z;
            this.f52852OooOO0o = z2;
            this.f52854OooOOO0 = function2;
            this.f52853OooOOO = z3;
            this.f52855OooOOOO = j;
            this.f52856OooOOOo = str;
            this.f52858OooOOo0 = l;
            this.f52857OooOOo = arrayList;
            this.f52859OooOOoo = l2;
            this.f52861OooOo00 = i2;
            this.f52860OooOo0 = i3;
            this.f52862OooOo0O = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oo0oOO0.OooO00o(this.f52845OooO0Oo, this.f52847OooO0o0, this.f52846OooO0o, this.f52848OooO0oO, this.f52849OooO0oo, this.f52844OooO, this.f52850OooOO0, this.f52851OooOO0O, this.f52852OooOO0o, this.f52854OooOOO0, this.f52853OooOOO, this.f52855OooOOOO, this.f52856OooOOOo, this.f52858OooOOo0, this.f52857OooOOo, this.f52859OooOOoo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52861OooOo00 | 1), RecomposeScopeImplKt.updateChangedFlags(this.f52860OooOo0), this.f52862OooOo0O);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull MomentDetailModel data, int i, @NotNull o000OO momentGifPlayManager, @Nullable MomentAdapterTag momentAdapterTag, @Nullable FragmentActivity fragmentActivity, @Nullable EnterRoomParentPage enterRoomParentPage, @Nullable Function1<? super MomentDetailModel, Unit> function1, boolean z, boolean z2, @Nullable Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, boolean z3, long j, @Nullable String str, @Nullable Long l, @Nullable ArrayList<String> arrayList, @Nullable Long l2, @Nullable Composer composer, int i2, int i3, int i4) {
        long j2;
        int i5;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(momentGifPlayManager, "momentGifPlayManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-162938052);
        boolean z4 = (i4 & 128) != 0 ? false : z;
        boolean z5 = (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : z2;
        Function2<? super PostDetailHeaderViewTag, Object, Unit> function3 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : function2;
        boolean z6 = (i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? false : z3;
        if ((i4 & 2048) != 0) {
            int i6 = o0OOo000.f48347o00OOooO;
            j2 = o0OOo000.f48135OooO0O0;
            i5 = i3 & (-113);
        } else {
            j2 = j;
            i5 = i3;
        }
        String str2 = (i4 & 4096) != 0 ? null : str;
        Long l3 = (i4 & 8192) != 0 ? null : l;
        ArrayList<String> arrayList2 = (i4 & 16384) != 0 ? null : arrayList;
        Long l4 = (32768 & i4) != 0 ? null : l2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-162938052, i2, i5, "com.yalla.yalla.ui.composable.moment.MomentDetailComp (MomentDetailComp.kt:68)");
        }
        ProvidedValue[] providedValueArr = new ProvidedValue[8];
        providedValueArr[0] = oo0OOoo.f52730OooO00o.provides(Boolean.valueOf(z4));
        providedValueArr[1] = oo0OOoo.f52731OooO0O0.provides(momentAdapterTag);
        providedValueArr[2] = oo0OOoo.f52735OooO0o0.provides(fragmentActivity);
        providedValueArr[3] = oo0OOoo.f52733OooO0Oo.provides(data);
        providedValueArr[4] = oo0OOoo.f52732OooO0OO.provides(data);
        providedValueArr[5] = oo0OOoo.f52736OooO0oO.provides(momentGifPlayManager);
        providedValueArr[6] = oo0OOoo.f52737OooO0oo.provides(Integer.valueOf(i));
        providedValueArr[7] = oo0OOoo.f52729OooO.provides(Boolean.valueOf(data.getSendPostModel() != null));
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2121086972, true, new OooO00o(j2, i5, data, fragmentActivity, str2, l3, z5, enterRoomParentPage, function1, function3, z6, arrayList2, l4, i2)), composerStartRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(data, i, momentGifPlayManager, momentAdapterTag, fragmentActivity, enterRoomParentPage, function1, z4, z5, function3, z6, j2, str2, l3, arrayList2, l4, i2, i3, i4));
    }

    public static final void OooO0O0(Modifier modifier, String str, Long l, boolean z, EnterRoomParentPage enterRoomParentPage, Function1 function1, Function2 function2, boolean z2, ArrayList arrayList, Long l2, Composer composer, int i, int i2) {
        int i3;
        float fM3775constructorimpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1880632759);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1880632759, i, -1, "com.yalla.yalla.ui.composable.moment.MomentContent (MomentDetailComp.kt:130)");
        }
        ProvidableCompositionLocal<MomentDetailModel> providableCompositionLocal = oo0OOoo.f52733OooO0Oo;
        MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(providableCompositionLocal);
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52730OooO00o)).booleanValue();
        MomentAdapterTag momentAdapterTag = (MomentAdapterTag) composerStartRestartGroup.consume(oo0OOoo.f52731OooO0O0);
        Activity activity = (Activity) composerStartRestartGroup.consume(oo0OOoo.f52735OooO0o0);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(BaseMomentDetailVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        BaseMomentDetailVM baseMomentDetailVM = (BaseMomentDetailVM) viewModel;
        boolean zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52729OooO)).booleanValue();
        System.currentTimeMillis();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null), false, false, 0L, false, null, null, null, new o00O00o0(context, momentDetailModel, momentAdapterTag, zBooleanValue2, zBooleanValue), 253);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ProvidableCompositionLocal<Boolean> providableCompositionLocal2 = oo0OOoo.f52734OooO0o;
        boolean zBooleanValue3 = ((Boolean) composerStartRestartGroup.consume(providableCompositionLocal2)).booleanValue();
        Modifier modifier3 = modifier2;
        o0oOO.OooO00o(companion, str, l, composerStartRestartGroup, (i & 112) | 6 | (i & 896), 0);
        o0OOO0o.OooO00o("1  hotTop", composerStartRestartGroup, 6);
        o00OOO0.OooO0O0(companion, z, new oo00o(momentDetailModel, zBooleanValue, momentAdapterTag, activity, l, z2, str, arrayList, baseMomentDetailVM, l2, function2), composerStartRestartGroup, ((i >> 6) & 112) | 6, 0);
        o0OOO0o.OooO00o("2  header", composerStartRestartGroup, 6);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        float f = 10;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_4 = arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f));
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = o00O0OOO.OooO00o(companion2, horizontalOrVerticalM392spacedBy0680j_4, composerStartRestartGroup, 6, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        o0OOO0o.OooO00o("3  topicEnter", composerStartRestartGroup, 6);
        o0OOO00.OooO00o(0, 0, composerStartRestartGroup, PaddingKt.m482paddingqDBjuR0$default(companion, zBooleanValue3 ? Dp.m3775constructorimpl(f) : Dp.m3775constructorimpl(64), 0.0f, 0.0f, 0.0f, 14, null));
        o0OOO0o.OooO00o("4  content", composerStartRestartGroup, 6);
        Modifier modifierM482paddingqDBjuR0$default = zBooleanValue3 ? PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null) : PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(61), 0.0f, Dp.m3775constructorimpl(33), 0.0f, 10, null);
        o00O0 o00o1 = new o00O0(momentDetailModel, zBooleanValue, momentAdapterTag, activity, l, z2, str, arrayList, baseMomentDetailVM, l2, function2);
        int i4 = (i >> 15) & 112;
        o00O00O.OooO00o(modifierM482paddingqDBjuR0$default, function2, o00o1, composerStartRestartGroup, i4, 0);
        o0OOO0o.OooO00o("5  image", composerStartRestartGroup, 6);
        o0O00o0.OooO0O0(zBooleanValue3 ? PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null) : PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(61), 0.0f, Dp.m3775constructorimpl(33), 0.0f, 10, null), function2, composerStartRestartGroup, i4, 0);
        o0OOO0o.OooO00o("6  vote", composerStartRestartGroup, 6);
        o0OOO0.OooO0OO(composerStartRestartGroup, 0);
        o0o0000.OooO00o(zBooleanValue3 ? PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null) : PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(61), 0.0f, Dp.m3775constructorimpl(33), 0.0f, 10, null), composerStartRestartGroup, 0);
        o0OOO0o.OooO00o("7  share", composerStartRestartGroup, 6);
        oo0ooO.OooO00o(zBooleanValue3 ? PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null) : PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(61), 0.0f, Dp.m3775constructorimpl(15), 0.0f, 10, null), enterRoomParentPage, composerStartRestartGroup, (i >> 9) & 112, 0);
        o0OOO0o.OooO00o("8  forward", composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(987236137);
        if (momentDetailModel.getForward() != null && momentDetailModel.getDeleteType() == MomentTypeDelete.NORMAL.getValue()) {
            MomentDetailModel forward = momentDetailModel.getForward();
            Intrinsics.checkNotNull(forward);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providableCompositionLocal.provides(forward), providableCompositionLocal2.provides(Boolean.TRUE)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1896075934, true, new o00O0O00(str, l, z, enterRoomParentPage, function1, function2, z2, arrayList, l2, i)), composerStartRestartGroup, 56);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o0OOO0o.OooO00o("9  addressAndMore", composerStartRestartGroup, 6);
        float f2 = 61;
        float fM3775constructorimpl2 = Dp.m3775constructorimpl(f2);
        float fM3775constructorimpl3 = Dp.m3775constructorimpl(33);
        if (zBooleanValue) {
            fM3775constructorimpl = Dp.m3775constructorimpl(f);
            i3 = 0;
        } else {
            i3 = 0;
            fM3775constructorimpl = Dp.m3775constructorimpl(0);
        }
        o00O00OO.OooO00o(PaddingKt.m482paddingqDBjuR0$default(companion, fM3775constructorimpl2, 0.0f, fM3775constructorimpl3, fM3775constructorimpl, 2, null), composerStartRestartGroup, i3);
        o0OOO0o.OooO00o("10  gift", composerStartRestartGroup, 6);
        float f3 = 15;
        o00OO0O0.OooO0OO(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 10, null), new o00O0O0(zBooleanValue, momentAdapterTag, function1, momentDetailModel), composerStartRestartGroup, 6, i3);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        o0OOO0o.OooO00o("11  bottom", composerStartRestartGroup, 6);
        o000OO00.OooO0O0(6, i3, composerStartRestartGroup, PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 10, null));
        o0OOO0o.OooO00o("12  wonderfulComment", composerStartRestartGroup, 6);
        oO00000.OooO00o(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), 0.0f, Dp.m3775constructorimpl(f3), 0.0f, 10, null), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(917295539);
        if (momentAdapterTag == MomentAdapterTag.MomentEditRecord) {
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o0OOO0o.OooO00o("13  end end end end end end end end end end end end end end end end end ", composerStartRestartGroup, 6);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O0O(modifier3, str, l, z, enterRoomParentPage, function1, function2, z2, arrayList, l2, i, i2));
    }
}
