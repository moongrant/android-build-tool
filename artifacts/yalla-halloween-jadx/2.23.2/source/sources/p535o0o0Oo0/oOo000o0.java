package p535o0o0Oo0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p476o0OooooO.o0OOo000;
import p519o0o0O0OO.o0oO0O0o;
import p522o0o0O0oO.oO00000o;
import p522o0o0O0oO.oO000O0;
import p583o0oOoo00.oo0o0Oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentVideoInputPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoInputPanel.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentVideoInputPanelKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,122:1\n81#2,11:123\n81#2,11:134\n81#2,11:145\n25#3:156\n1097#4,6:157\n76#5:163\n81#6:164\n107#6,2:165\n*S KotlinDebug\n*F\n+ 1 MomentVideoInputPanel.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentVideoInputPanelKt\n*L\n32#1:123,11\n33#1:134,11\n34#1:145,11\n35#1:156\n35#1:157,6\n39#1:163\n35#1:164\n35#1:165,2\n*E\n"})
public final class oOo000o0 {

    public static final class OooO extends Lambda implements Function1<oO00000o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54233OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f54234OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyVM f54235OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentVideoVM momentVideoVM, MomentReplyVM momentReplyVM, MomentCommentsVM momentCommentsVM) {
            super(1);
            this.f54233OooO0Oo = momentVideoVM;
            this.f54235OooO0o0 = momentReplyVM;
            this.f54234OooO0o = momentCommentsVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oO00000o oo00000o) {
            oO00000o it = oo00000o;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentVideoVM momentVideoVM = this.f54233OooO0Oo;
            MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
            if (currentMomentDetail != null) {
                MomentReplyVM momentReplyVM = this.f54235OooO0o0;
                MomentCommentsVM momentCommentsVM = this.f54234OooO0o;
                MomentSendCommentModel momentSendCommentModelInitSendContent = MomentSendCommentModel.INSTANCE.initSendContent(currentMomentDetail, momentVideoVM.getCurrentComment(), momentVideoVM.getCurrentReply(), momentVideoVM.getReplyUserInfo(), it.OooO0OO());
                MomentDetailModel currentMomentDetail2 = momentVideoVM.getCurrentMomentDetail();
                Long lValueOf = currentMomentDetail2 != null ? Long.valueOf(currentMomentDetail2.getId()) : null;
                o0000O00.OooO("WRM 添加 \n\t currentMomentDetailId = " + lValueOf + " \n\t currentCommentId = " + momentVideoVM.getCurrentCommentId() + " \n\t currentReplyId = " + momentVideoVM.getCurrentReplyId() + " \n sendCommentOrReply sendModel = " + p187o00o00o0.OooO.OooO00o(momentSendCommentModelInitSendContent));
                momentVideoVM.sendCommentOrReply(momentSendCommentModelInitSendContent, new oO0(it, momentSendCommentModelInitSendContent, momentVideoVM, momentReplyVM, momentCommentsVM));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54236OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentVideoVM momentVideoVM) {
            super(0);
            this.f54236OooO0Oo = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54236OooO0Oo.getShowFastInputPanel().setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<oO000O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54237OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentVideoVM momentVideoVM) {
            super(0);
            this.f54237OooO0Oo = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO000O0 invoke() {
            MomentVideoVM momentVideoVM = this.f54237OooO0Oo;
            MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
            Long lValueOf = currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getId()) : null;
            Long currentCommentId = momentVideoVM.getCurrentCommentId();
            Long currentReplyId = momentVideoVM.getCurrentReplyId();
            HashMap<String, oO000O0> map = oo0o0Oo.f56691OooO00o;
            return oo0o0Oo.OooO00o(lValueOf, currentCommentId, currentReplyId);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<oO000O0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54238OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentVideoVM momentVideoVM) {
            super(1);
            this.f54238OooO0Oo = momentVideoVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oO000O0 oo000o0) {
            oO000O0 it = oo000o0;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentVideoVM momentVideoVM = this.f54238OooO0Oo;
            MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
            Long lValueOf = currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getId()) : null;
            Long currentCommentId = momentVideoVM.getCurrentCommentId();
            Long currentReplyId = momentVideoVM.getCurrentReplyId();
            HashMap<String, oO000O0> map = oo0o0Oo.f56691OooO00o;
            oo0o0Oo.OooO0O0(lValueOf, currentCommentId, currentReplyId, it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54239OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54240OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentVideoVM momentVideoVM, MutableState<Boolean> mutableState) {
            super(1);
            this.f54239OooO0Oo = momentVideoVM;
            this.f54240OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            o0000O00.OooO0OO("onPanelVisibleChanged", "visible2 = " + zBooleanValue);
            o0000O00.OooO0O0("WRM 添加 onPanelVisibleChanged visible1 = " + zBooleanValue);
            this.f54240OooO0o0.setValue(Boolean.valueOf(zBooleanValue));
            if (!zBooleanValue) {
                this.f54239OooO0Oo.getShowFastInputPanel().setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54241OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54242OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(BoxScope boxScope, int i) {
            super(2);
            this.f54241OooO0Oo = boxScope;
            this.f54242OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54242OooO0o0 | 1);
            oOo000o0.OooO00o(this.f54241OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull BoxScope boxScope, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1662944582);
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
                ComposerKt.traceEventStart(1662944582, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentVideoInputPanel (MomentVideoInputPanel.kt:30)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(MomentCommentsVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentCommentsVM momentCommentsVM = (MomentCommentsVM) viewModel2;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current3 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel3 = ViewModelKt.viewModel(MomentReplyVM.class, current3, null, null, current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentReplyVM momentReplyVM = (MomentReplyVM) viewModel3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            int i3 = o0OOo000.f48347o00OOooO;
            com.code.android.util.OooOO0.OooO00o(o0OOo000.f48158OooOoO0, ((Boolean) mutableState.getValue()).booleanValue(), null, null, null, new OooO00o(momentVideoVM), composerStartRestartGroup, 0, 28);
            composer2 = composerStartRestartGroup;
            o0oO0O0o.OooO00o(momentVideoVM.getShowFastInputPanel(), momentVideoVM.getNeedShowEmojiFacePanel(), false, momentVideoVM.getReplyUserInfo(), new OooO0O0(momentVideoVM), new OooO0OO(momentVideoVM), new OooO0o(momentVideoVM, mutableState), new OooO(momentVideoVM, momentReplyVM, momentCommentsVM), null, null, boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), composerStartRestartGroup, 4096, 0, 772);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(boxScope, i));
    }
}
