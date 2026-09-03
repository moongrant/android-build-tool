package p535o0o0Oo0;

import android.app.Activity;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200o00o0OoO.o00OO00O;
import p202o00o0o.o00Oo0;
import p207o00o0oO0.o000O0Oo;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentReward.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReward.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReward\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,223:1\n154#2:224\n154#2:225\n66#3,6:226\n72#3:260\n76#3:272\n78#4,11:232\n91#4:271\n456#5,8:243\n464#5,3:257\n36#5:261\n467#5,3:268\n25#5:285\n25#5:292\n4144#6,6:251\n1097#7,6:262\n1097#7,6:286\n1097#7,6:293\n81#8,11:273\n76#9:284\n*S KotlinDebug\n*F\n+ 1 MomentReward.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReward\n*L\n46#1:224\n47#1:225\n51#1:226,6\n51#1:260\n51#1:272\n51#1:232,11\n51#1:271\n51#1:243,8\n51#1:257,3\n58#1:261\n51#1:268,3\n87#1:285\n124#1:292\n51#1:251,6\n58#1:262,6\n87#1:286,6\n124#1:293,6\n83#1:273,11\n84#1:284\n*E\n"})
public final class oO00o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO00o00O f53933OooO00o = new oO00o00O();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53934OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f53935OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53936OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f53937OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState mutableState, LifecycleOwner lifecycleOwner, MomentReplyModel momentReplyModel, MomentVideoVM momentVideoVM) {
            super(0);
            this.f53934OooO0Oo = mutableState;
            this.f53936OooO0o0 = momentReplyModel;
            this.f53935OooO0o = momentVideoVM;
            this.f53937OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00Ooo.OooO().OooOOO0(this.f53934OooO0Oo.getValue().booleanValue());
            MomentReplyModel momentReplyModel = this.f53936OooO0o0;
            if (!momentReplyModel.getLocalSendRewardIsIn().getValue().booleanValue() && !momentReplyModel.getLocalShowRewardAnim().getValue().booleanValue()) {
                oOo00o0o onLogin = new oOo00o0o(momentReplyModel, this.f53935OooO0o, this.f53937OooO0oO);
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
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53938OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState) {
            super(0);
            this.f53938OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f53938OooO0Oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f53939OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53941OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f53942OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Alignment f53943OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f53944OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Modifier f53945OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f53946OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f53947OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, MutableState<Boolean> mutableState, Alignment alignment, float f, float f2, Modifier modifier, int i, int i2) {
            super(2);
            this.f53942OooO0o0 = z;
            this.f53941OooO0o = mutableState;
            this.f53943OooO0oO = alignment;
            this.f53944OooO0oo = f;
            this.f53939OooO = f2;
            this.f53945OooOO0 = modifier;
            this.f53946OooOO0O = i;
            this.f53947OooOO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO00o00O.this.OooO00o(this.f53942OooO0o0, this.f53941OooO0o, this.f53943OooO0oO, this.f53944OooO0oo, this.f53939OooO, this.f53945OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53946OooOO0O | 1), this.f53947OooOO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53949OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f53949OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53949OooO0o0 | 1);
            oO00o00O.this.OooO0O0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentReward.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReward.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReward$ShowNextShowSendRewardDialog$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,223:1\n154#2:224\n*S KotlinDebug\n*F\n+ 1 MomentReward.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReward$ShowNextShowSendRewardDialog$2$1\n*L\n113#1:224\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53950OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableState<Boolean> mutableState) {
            super(3);
            this.f53950OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            ColumnScope TextDialog = columnScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1309372975, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.ShowNextShowSendRewardDialog.<anonymous>.<anonymous> (MomentReward.kt:111)");
                }
                o00Oo0.OooO0O0(PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(25), 0.0f, 2, null), o0000.OooO0OO(o000000.send_reward_info), this.f53950OooO0Oo, composer2, 390, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f53951OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53953OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i) {
            super(2);
            this.f53953OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53953OooO0o0 | 1);
            oO00o00O.this.OooO0O0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53954OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f53955OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f53956OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f53957OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MutableState mutableState, LifecycleOwner lifecycleOwner, MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM) {
            super(0);
            this.f53954OooO0Oo = mutableState;
            this.f53956OooO0o0 = momentCommentDetailModel;
            this.f53955OooO0o = momentVideoVM;
            this.f53957OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00Ooo.OooO().OooOOO0(this.f53954OooO0Oo.getValue().booleanValue());
            MomentCommentDetailModel momentCommentDetailModel = this.f53956OooO0o0;
            if (!momentCommentDetailModel.getLocalSendRewardIsIn().getValue().booleanValue() && !momentCommentDetailModel.getLocalShowRewardAnim().getValue().booleanValue()) {
                oO0OO00o onLogin = new oO0OO00o(momentCommentDetailModel, this.f53955OooO0o, this.f53957OooO0oO);
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
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentReward.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReward.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReward$ShowNextShowSendRewardDialog$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,223:1\n154#2:224\n*S KotlinDebug\n*F\n+ 1 MomentReward.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReward$ShowNextShowSendRewardDialog$3$1\n*L\n150#1:224\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f53958OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState<Boolean> mutableState) {
            super(3);
            this.f53958OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            ColumnScope TextDialog = columnScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1104770676, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.ShowNextShowSendRewardDialog.<anonymous>.<anonymous> (MomentReward.kt:148)");
                }
                o00Oo0.OooO0O0(PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(25), 0.0f, 2, null), o0000.OooO0OO(o000000.send_reward_info), this.f53958OooO0Oo, composer2, 390, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f53959OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53961OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(int i) {
            super(2);
            this.f53961OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53961OooO0o0 | 1);
            oO00o00O.this.OooO0O0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53963OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(int i) {
            super(2);
            this.f53963OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53963OooO0o0 | 1);
            oO00o00O.this.OooO0O0(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:121:0x020a  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0135  */
    /* JADX WARN: Code duplicated, block: B:92:0x0141  */
    /* JADX WARN: Code duplicated, block: B:93:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x0156  */
    /* JADX WARN: Code duplicated, block: B:98:0x0164  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(boolean z, @NotNull MutableState<Boolean> showRewardAnim, @Nullable Alignment alignment, float f, float f2, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        Alignment bottomCenter;
        int i4;
        float f3;
        int i5;
        int i6;
        float f4;
        int i7;
        int i8;
        Modifier modifier2;
        int i9;
        float fM3775constructorimpl;
        float fM3775constructorimpl2;
        Modifier modifier3;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        int i10;
        Alignment alignment2;
        float f5;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(showRewardAnim, "showRewardAnim");
        Composer composerStartRestartGroup = composer.startRestartGroup(134328154);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(showRewardAnim) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 896) == 0) {
                bottomCenter = alignment;
                i3 |= composerStartRestartGroup.changed(bottomCenter) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    f3 = f;
                    if (composerStartRestartGroup.changed(f3)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        f4 = f2;
                        if (composerStartRestartGroup.changed(f4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((458752 & i) == 0) {
                            modifier2 = modifier;
                            if (composerStartRestartGroup.changed(modifier2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i11 != 0) {
                                bottomCenter = Alignment.INSTANCE.getBottomCenter();
                            }
                            if (i4 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(22);
                            } else {
                                fM3775constructorimpl = f3;
                            }
                            if (i6 != 0) {
                                fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                            } else {
                                fM3775constructorimpl2 = f4;
                            }
                            if (i8 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                            }
                            companion = Modifier.INSTANCE;
                            Modifier modifierM519requiredSizeVpY3zN4 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN4);
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
                            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (z || !showRewardAnim.getValue().booleanValue()) {
                                composerStartRestartGroup.startReplaceableGroup(2030887769);
                                if (z) {
                                    i10 = o0Oo0oo.ic_moment_comment_reward_color;
                                } else {
                                    i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                                }
                                ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(2030887404);
                                Modifier modifierM519requiredSizeVpY3zN5 = SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                boolean zChanged = composerStartRestartGroup.changed(showRewardAnim);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new OooO00o(showRewardAnim);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00OO00O.OooO00o("svga/anim_moment_reward.svga", true, 1, null, (Function0) objRememberedValue, modifierM519requiredSizeVpY3zN5, composerStartRestartGroup, 438, 8);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                                ComposerKt.traceEventEnd();
                            }
                            alignment2 = bottomCenter;
                            f5 = fM3775constructorimpl2;
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            alignment2 = bottomCenter;
                            fM3775constructorimpl = f3;
                            f5 = f4;
                            modifier4 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
                    }
                    i3 |= 196608;
                    modifier2 = modifier;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            bottomCenter = Alignment.INSTANCE.getBottomCenter();
                        }
                        if (i4 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(22);
                        } else {
                            fM3775constructorimpl = f3;
                        }
                        if (i6 != 0) {
                            fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                        } else {
                            fM3775constructorimpl2 = f4;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierM519requiredSizeVpY3zN6 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN6);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o2, composerM1320constructorimpl, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (z) {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        alignment2 = bottomCenter;
                        f5 = fM3775constructorimpl2;
                        modifier4 = modifier3;
                    } else {
                        if (i11 != 0) {
                            bottomCenter = Alignment.INSTANCE.getBottomCenter();
                        }
                        if (i4 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(22);
                        } else {
                            fM3775constructorimpl = f3;
                        }
                        if (i6 != 0) {
                            fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                        } else {
                            fM3775constructorimpl2 = f4;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierM519requiredSizeVpY3zN7 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o3 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN7);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o3, composerM1320constructorimpl, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        if (z) {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        alignment2 = bottomCenter;
                        f5 = fM3775constructorimpl2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
                }
                i3 |= 24576;
                f4 = f2;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            bottomCenter = Alignment.INSTANCE.getBottomCenter();
                        }
                        if (i4 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(22);
                        } else {
                            fM3775constructorimpl = f3;
                        }
                        if (i6 != 0) {
                            fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                        } else {
                            fM3775constructorimpl2 = f4;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierM519requiredSizeVpY3zN8 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o4 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN8);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyOooO00o4, composerM1320constructorimpl, currentCompositionLocalMap4);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        if (z) {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        alignment2 = bottomCenter;
                        f5 = fM3775constructorimpl2;
                        modifier4 = modifier3;
                    } else {
                        if (i11 != 0) {
                            bottomCenter = Alignment.INSTANCE.getBottomCenter();
                        }
                        if (i4 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(22);
                        } else {
                            fM3775constructorimpl = f3;
                        }
                        if (i6 != 0) {
                            fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                        } else {
                            fM3775constructorimpl2 = f4;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierM519requiredSizeVpY3zN9 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o5 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        constructor = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN9);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyOooO00o5, composerM1320constructorimpl, currentCompositionLocalMap5);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        if (z) {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        alignment2 = bottomCenter;
                        f5 = fM3775constructorimpl2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN10 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o6 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN10);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyOooO00o6, composerM1320constructorimpl, currentCompositionLocalMap6);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                } else {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN11 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o7 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    constructor = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN11);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion8, composerM1320constructorimpl, measurePolicyOooO00o7, composerM1320constructorimpl, currentCompositionLocalMap7);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
            }
            i3 |= 3072;
            f3 = f;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    f4 = f2;
                    if (composerStartRestartGroup.changed(f4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            bottomCenter = Alignment.INSTANCE.getBottomCenter();
                        }
                        if (i4 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(22);
                        } else {
                            fM3775constructorimpl = f3;
                        }
                        if (i6 != 0) {
                            fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                        } else {
                            fM3775constructorimpl2 = f4;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierM519requiredSizeVpY3zN12 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o8 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN12);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl, measurePolicyOooO00o8, composerM1320constructorimpl, currentCompositionLocalMap8);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        if (z) {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        alignment2 = bottomCenter;
                        f5 = fM3775constructorimpl2;
                        modifier4 = modifier3;
                    } else {
                        if (i11 != 0) {
                            bottomCenter = Alignment.INSTANCE.getBottomCenter();
                        }
                        if (i4 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(22);
                        } else {
                            fM3775constructorimpl = f3;
                        }
                        if (i6 != 0) {
                            fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                        } else {
                            fM3775constructorimpl2 = f4;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierM519requiredSizeVpY3zN13 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o9 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        constructor = companion10.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN13);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion10, composerM1320constructorimpl, measurePolicyOooO00o9, composerM1320constructorimpl, currentCompositionLocalMap9);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        if (z) {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        alignment2 = bottomCenter;
                        f5 = fM3775constructorimpl2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN14 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o10 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN14);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11, composerM1320constructorimpl, measurePolicyOooO00o10, composerM1320constructorimpl, currentCompositionLocalMap10);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                } else {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN15 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o11 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN15);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion12, composerM1320constructorimpl, measurePolicyOooO00o11, composerM1320constructorimpl, currentCompositionLocalMap11);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
            }
            i3 |= 24576;
            f4 = f2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN16 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o12 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN16);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion13, composerM1320constructorimpl, measurePolicyOooO00o12, composerM1320constructorimpl, currentCompositionLocalMap12);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                } else {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN17 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o13 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    constructor = companion14.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN17);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion14, composerM1320constructorimpl, measurePolicyOooO00o13, composerM1320constructorimpl, currentCompositionLocalMap13);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    bottomCenter = Alignment.INSTANCE.getBottomCenter();
                }
                if (i4 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(22);
                } else {
                    fM3775constructorimpl = f3;
                }
                if (i6 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                } else {
                    fM3775constructorimpl2 = f4;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN18 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o14 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN18);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1320constructorimpl, measurePolicyOooO00o14, composerM1320constructorimpl, currentCompositionLocalMap14);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                alignment2 = bottomCenter;
                f5 = fM3775constructorimpl2;
                modifier4 = modifier3;
            } else {
                if (i11 != 0) {
                    bottomCenter = Alignment.INSTANCE.getBottomCenter();
                }
                if (i4 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(22);
                } else {
                    fM3775constructorimpl = f3;
                }
                if (i6 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                } else {
                    fM3775constructorimpl2 = f4;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN19 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o15 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                constructor = companion16.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN19);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion16, composerM1320constructorimpl, measurePolicyOooO00o15, composerM1320constructorimpl, currentCompositionLocalMap15);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                alignment2 = bottomCenter;
                f5 = fM3775constructorimpl2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
        }
        i3 |= 384;
        bottomCenter = alignment;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                f3 = f;
                if (composerStartRestartGroup.changed(f3)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    f4 = f2;
                    if (composerStartRestartGroup.changed(f4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            bottomCenter = Alignment.INSTANCE.getBottomCenter();
                        }
                        if (i4 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(22);
                        } else {
                            fM3775constructorimpl = f3;
                        }
                        if (i6 != 0) {
                            fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                        } else {
                            fM3775constructorimpl2 = f4;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierM519requiredSizeVpY3zN110 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o16 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                        constructor = companion17.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN110);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion17, composerM1320constructorimpl, measurePolicyOooO00o16, composerM1320constructorimpl, currentCompositionLocalMap16);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        if (z) {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        alignment2 = bottomCenter;
                        f5 = fM3775constructorimpl2;
                        modifier4 = modifier3;
                    } else {
                        if (i11 != 0) {
                            bottomCenter = Alignment.INSTANCE.getBottomCenter();
                        }
                        if (i4 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(22);
                        } else {
                            fM3775constructorimpl = f3;
                        }
                        if (i6 != 0) {
                            fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                        } else {
                            fM3775constructorimpl2 = f4;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierM519requiredSizeVpY3zN111 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o17 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                        constructor = companion18.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN111);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion18, composerM1320constructorimpl, measurePolicyOooO00o17, composerM1320constructorimpl, currentCompositionLocalMap17);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf17, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        if (z) {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(2030887769);
                            if (z) {
                                i10 = o0Oo0oo.ic_moment_comment_reward_color;
                            } else {
                                i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        alignment2 = bottomCenter;
                        f5 = fM3775constructorimpl2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN112 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o18 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN112);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion19, composerM1320constructorimpl, measurePolicyOooO00o18, composerM1320constructorimpl, currentCompositionLocalMap18);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf18, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                } else {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN113 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o19 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN113);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion110, composerM1320constructorimpl, measurePolicyOooO00o19, composerM1320constructorimpl, currentCompositionLocalMap19);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf19, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
            }
            i3 |= 24576;
            f4 = f2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN114 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o110 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN114);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111, composerM1320constructorimpl, measurePolicyOooO00o110, composerM1320constructorimpl, currentCompositionLocalMap110);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                } else {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN115 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o111 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                    constructor = companion112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN115);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion112, composerM1320constructorimpl, measurePolicyOooO00o111, composerM1320constructorimpl, currentCompositionLocalMap111);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    bottomCenter = Alignment.INSTANCE.getBottomCenter();
                }
                if (i4 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(22);
                } else {
                    fM3775constructorimpl = f3;
                }
                if (i6 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                } else {
                    fM3775constructorimpl2 = f4;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN116 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o112 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN116);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion113, composerM1320constructorimpl, measurePolicyOooO00o112, composerM1320constructorimpl, currentCompositionLocalMap112);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                alignment2 = bottomCenter;
                f5 = fM3775constructorimpl2;
                modifier4 = modifier3;
            } else {
                if (i11 != 0) {
                    bottomCenter = Alignment.INSTANCE.getBottomCenter();
                }
                if (i4 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(22);
                } else {
                    fM3775constructorimpl = f3;
                }
                if (i6 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                } else {
                    fM3775constructorimpl2 = f4;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN117 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o113 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                constructor = companion114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN117);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion114, composerM1320constructorimpl, measurePolicyOooO00o113, composerM1320constructorimpl, currentCompositionLocalMap113);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                alignment2 = bottomCenter;
                f5 = fM3775constructorimpl2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
        }
        i3 |= 3072;
        f3 = f;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                f4 = f2;
                if (composerStartRestartGroup.changed(f4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN118 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o114 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                    constructor = companion115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN118);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion115, composerM1320constructorimpl, measurePolicyOooO00o114, composerM1320constructorimpl, currentCompositionLocalMap114);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                } else {
                    if (i11 != 0) {
                        bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    }
                    if (i4 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(22);
                    } else {
                        fM3775constructorimpl = f3;
                    }
                    if (i6 != 0) {
                        fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                    } else {
                        fM3775constructorimpl2 = f4;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN119 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o115 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                    constructor = companion116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN119);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion116, composerM1320constructorimpl, measurePolicyOooO00o115, composerM1320constructorimpl, currentCompositionLocalMap115);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2030887769);
                        if (z) {
                            i10 = o0Oo0oo.ic_moment_comment_reward_color;
                        } else {
                            i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    alignment2 = bottomCenter;
                    f5 = fM3775constructorimpl2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    bottomCenter = Alignment.INSTANCE.getBottomCenter();
                }
                if (i4 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(22);
                } else {
                    fM3775constructorimpl = f3;
                }
                if (i6 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                } else {
                    fM3775constructorimpl2 = f4;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN1110 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o116 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN1110);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion117, composerM1320constructorimpl, measurePolicyOooO00o116, composerM1320constructorimpl, currentCompositionLocalMap116);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf116, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                alignment2 = bottomCenter;
                f5 = fM3775constructorimpl2;
                modifier4 = modifier3;
            } else {
                if (i11 != 0) {
                    bottomCenter = Alignment.INSTANCE.getBottomCenter();
                }
                if (i4 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(22);
                } else {
                    fM3775constructorimpl = f3;
                }
                if (i6 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                } else {
                    fM3775constructorimpl2 = f4;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN1111 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o117 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN1111);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion118, composerM1320constructorimpl, measurePolicyOooO00o117, composerM1320constructorimpl, currentCompositionLocalMap117);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf117, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                alignment2 = bottomCenter;
                f5 = fM3775constructorimpl2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
        }
        i3 |= 24576;
        f4 = f2;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((458752 & i) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
                    bottomCenter = Alignment.INSTANCE.getBottomCenter();
                }
                if (i4 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(22);
                } else {
                    fM3775constructorimpl = f3;
                }
                if (i6 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                } else {
                    fM3775constructorimpl2 = f4;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN1112 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o118 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN1112);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion119, composerM1320constructorimpl, measurePolicyOooO00o118, composerM1320constructorimpl, currentCompositionLocalMap118);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf118, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                alignment2 = bottomCenter;
                f5 = fM3775constructorimpl2;
                modifier4 = modifier3;
            } else {
                if (i11 != 0) {
                    bottomCenter = Alignment.INSTANCE.getBottomCenter();
                }
                if (i4 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(22);
                } else {
                    fM3775constructorimpl = f3;
                }
                if (i6 != 0) {
                    fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
                } else {
                    fM3775constructorimpl2 = f4;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN1113 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o119 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                constructor = companion1110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN1113);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1110, composerM1320constructorimpl, measurePolicyOooO00o119, composerM1320constructorimpl, currentCompositionLocalMap119);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf119, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2030887769);
                    if (z) {
                        i10 = o0Oo0oo.ic_moment_comment_reward_color;
                    } else {
                        i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                alignment2 = bottomCenter;
                f5 = fM3775constructorimpl2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((374491 & i3) == 74898) {
            if (i11 != 0) {
                bottomCenter = Alignment.INSTANCE.getBottomCenter();
            }
            if (i4 != 0) {
                fM3775constructorimpl = Dp.m3775constructorimpl(22);
            } else {
                fM3775constructorimpl = f3;
            }
            if (i6 != 0) {
                fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
            } else {
                fM3775constructorimpl2 = f4;
            }
            if (i8 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierM519requiredSizeVpY3zN1114 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o1110 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN1114);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1320constructorimpl, measurePolicyOooO00o1110, composerM1320constructorimpl, currentCompositionLocalMap1110);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(2030887769);
                if (z) {
                    i10 = o0Oo0oo.ic_moment_comment_reward_color;
                } else {
                    i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(2030887769);
                if (z) {
                    i10 = o0Oo0oo.ic_moment_comment_reward_color;
                } else {
                    i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            alignment2 = bottomCenter;
            f5 = fM3775constructorimpl2;
            modifier4 = modifier3;
        } else {
            if (i11 != 0) {
                bottomCenter = Alignment.INSTANCE.getBottomCenter();
            }
            if (i4 != 0) {
                fM3775constructorimpl = Dp.m3775constructorimpl(22);
            } else {
                fM3775constructorimpl = f3;
            }
            if (i6 != 0) {
                fM3775constructorimpl2 = Dp.m3775constructorimpl(40);
            } else {
                fM3775constructorimpl2 = f4;
            }
            if (i8 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(134328154, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.RewardImage (MomentReward.kt:48)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierM519requiredSizeVpY3zN1115 = SizeKt.m519requiredSizeVpY3zN4(companion.then(modifier3), fM3775constructorimpl, fM3775constructorimpl2);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o1111 = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
            constructor = companion1112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN1115);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1112, composerM1320constructorimpl, measurePolicyOooO00o1111, composerM1320constructorimpl, currentCompositionLocalMap1111);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(2030887769);
                if (z) {
                    i10 = o0Oo0oo.ic_moment_comment_reward_color;
                } else {
                    i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(2030887769);
                if (z) {
                    i10 = o0Oo0oo.ic_moment_comment_reward_color;
                } else {
                    i10 = o0Oo0oo.ic_moment_comment_reward_gray;
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), (String) null, SizeKt.m519requiredSizeVpY3zN4(companion, fM3775constructorimpl, fM3775constructorimpl2), bottomCenter, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 2097208, 48);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            alignment2 = bottomCenter;
            f5 = fM3775constructorimpl2;
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(z, showRewardAnim, alignment2, fM3775constructorimpl, f5, modifier4, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1831171787);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1831171787, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReward.ShowNextShowSendRewardDialog (MomentReward.kt:80)");
            }
            if (o00Ooo.OooO().OooOO0o()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MomentReplyModel sendRewardDialogReply = momentVideoVM.getSendRewardDialogReply();
            composerStartRestartGroup.startReplaceableGroup(1014013948);
            if (sendRewardDialogReply != null) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                o000O0Oo.OooO0Oo(momentVideoVM.getSendRewardDialog(), null, o0000.OooO0OO(o000000.send_reward_title), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1309372975, true, new OooO0o(mutableState)), false, false, null, null, null, false, null, false, new OooO(mutableState, lifecycleOwner, sendRewardDialogReply, momentVideoVM), null, false, false, null, OooOO0.f53951OooO0Oo, null, null, composerStartRestartGroup, 3072, 12582912, 913394);
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0O(i));
                return;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MomentCommentDetailModel sendRewardDialogComment = momentVideoVM.getSendRewardDialogComment();
            if (sendRewardDialogComment != null) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) objRememberedValue2;
                o000O0Oo.OooO0Oo(momentVideoVM.getSendRewardDialog(), null, o0000.OooO0OO(o000000.send_reward_title), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1104770676, true, new OooOOO0(mutableState2)), false, false, null, null, null, false, null, false, new OooOOO(mutableState2, lifecycleOwner, sendRewardDialogComment, momentVideoVM), null, false, false, null, OooOOOO.f53959OooO0Oo, null, null, composerStartRestartGroup, 3072, 12582912, 913394);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup3 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup3.updateScope(new OooOo00(i));
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup4 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup4.updateScope(new OooOo(i));
    }
}
