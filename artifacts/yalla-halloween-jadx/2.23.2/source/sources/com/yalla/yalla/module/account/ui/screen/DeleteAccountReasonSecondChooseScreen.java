package com.yalla.yalla.module.account.ui.screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.animation.OooOo;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.OooOO0O;
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
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.navigation.NavBackStackEntry;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0000;
import com.code.android.util.o0O0O00;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.model.DeleteAccountReasonChooseModel;
import com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonSecondChooseScreen;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p105o000oo0o.o00O00OO;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O0OO0;
import p516o0o0O00o.o0O0oo0o;
import p516o0o0O00o.oo0o0O0;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p532o0o0OOo0.o00O00O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.oOO0O00O;
import p590o0oOooo0.oOO0O0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u0002*\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 ¨\u0006$²\u0006\u000e\u0010#\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonSecondChooseScreen;", "Lo0o0OOo0/o000O0;", "", "MainContent", "(Landroidx/compose/runtime/Composer;I)V", "", "Lcom/yalla/yalla/model/DeleteAccountReasonChooseModel;", "listData", "Lcom/yalla/yalla/model/AccountBindInfo;", LinkedAccountsScreen.ACCOUNT_INFO_PARAM, "MainListChooseBody", "(Ljava/util/List;Lcom/yalla/yalla/model/AccountBindInfo;Landroidx/compose/runtime/Composer;I)V", DeviceRequestsHelper.DEVICE_INFO_MODEL, "OtherCompose", "(Lcom/yalla/yalla/model/DeleteAccountReasonChooseModel;Lcom/yalla/yalla/model/AccountBindInfo;Landroidx/compose/runtime/Composer;I)V", "", "nextButtonEnable", "Lkotlin/Function0;", "nextClick", "BottomButtons", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroid/app/Activity;", "activity", "", "reasonTypeOne", "reasonTypeTwo", "", "inputText", "onNextButtonClick", "(Landroid/app/Activity;Lcom/yalla/yalla/model/AccountBindInfo;ILjava/lang/Integer;Ljava/lang/String;)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "selectedPosition", "Account_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeleteAccountReasonSecondChooseScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAccountReasonSecondChooseScreen.kt\ncom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonSecondChooseScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,248:1\n76#2:249\n76#2:259\n76#2:260\n76#2:317\n76#2:374\n36#3:250\n25#3:261\n25#3:268\n36#3:275\n456#3,8:299\n464#3,3:313\n467#3,3:318\n36#3:324\n456#3,8:348\n464#3,3:362\n25#3:366\n456#3,8:392\n464#3,3:406\n467#3,3:410\n467#3,3:415\n456#3,8:438\n464#3,3:452\n36#3:459\n467#3,3:466\n1097#4,6:251\n1097#4,6:262\n1097#4,6:269\n1097#4,6:276\n1097#4,6:325\n1097#4,6:367\n1097#4,6:460\n154#5:257\n154#5:258\n154#5:323\n154#5:373\n154#5:420\n154#5:456\n154#5:457\n154#5:458\n72#6,6:282\n78#6:316\n82#6:322\n72#6,6:421\n78#6:455\n82#6:470\n78#7,11:288\n91#7:321\n78#7,11:337\n78#7,11:381\n91#7:413\n91#7:418\n78#7,11:427\n91#7:469\n4144#8,6:307\n4144#8,6:356\n4144#8,6:400\n4144#8,6:446\n66#9,6:331\n72#9:365\n66#9,6:375\n72#9:409\n76#9:414\n76#9:419\n81#10:471\n107#10,2:472\n*S KotlinDebug\n*F\n+ 1 DeleteAccountReasonSecondChooseScreen.kt\ncom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonSecondChooseScreen\n*L\n58#1:249\n93#1:259\n94#1:260\n155#1:317\n187#1:374\n63#1:250\n102#1:261\n104#1:268\n111#1:275\n108#1:299,8\n108#1:313,3\n108#1:318,3\n180#1:324\n178#1:348,8\n178#1:362,3\n183#1:366\n189#1:392,8\n189#1:406,3\n189#1:410,3\n178#1:415,3\n203#1:438,8\n203#1:452,3\n226#1:459\n203#1:466,3\n63#1:251,6\n102#1:262,6\n104#1:269,6\n111#1:276,6\n180#1:325,6\n183#1:367,6\n226#1:460,6\n73#1:257\n80#1:258\n176#1:323\n185#1:373\n206#1:420\n212#1:456\n217#1:457\n223#1:458\n108#1:282,6\n108#1:316\n108#1:322\n203#1:421,6\n203#1:455\n203#1:470\n108#1:288,11\n108#1:321\n178#1:337,11\n189#1:381,11\n189#1:413\n178#1:418\n203#1:427,11\n203#1:469\n108#1:307,6\n178#1:356,6\n189#1:400,6\n203#1:446,6\n178#1:331,6\n178#1:365\n189#1:375,6\n189#1:409\n189#1:414\n178#1:419\n102#1:471\n102#1:472,2\n*E\n"})
public final class DeleteAccountReasonSecondChooseScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final DeleteAccountReasonSecondChooseScreen INSTANCE = new DeleteAccountReasonSecondChooseScreen();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23131OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f23131OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23131OooO0o0 | 1);
            DeleteAccountReasonSecondChooseScreen.this.MainContent(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f23132OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p190o00o0O.OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
            o00O00.OooO0oO(DeleteAccountFirstWanScreen.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23133OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(0);
            this.f23133OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23133OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23135OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f23136OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23137OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.f23136OooO0o0 = z;
            this.f23135OooO0o = function0;
            this.f23137OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23137OooO0oO | 1);
            boolean z = this.f23136OooO0o0;
            Function0<Unit> function0 = this.f23135OooO0o;
            DeleteAccountReasonSecondChooseScreen.this.BottomButtons(z, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23139OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f23140OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ColumnScope columnScope, int i) {
            super(2);
            this.f23140OooO0o0 = columnScope;
            this.f23139OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23139OooO0o | 1);
            DeleteAccountReasonSecondChooseScreen.this.Content(this.f23140OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23142OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f23142OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23142OooO0o0 | 1);
            DeleteAccountReasonSecondChooseScreen.this.MainContent(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f23143OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(SoftwareKeyboardController softwareKeyboardController) {
            super(0);
            this.f23143OooO0Oo = softwareKeyboardController;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SoftwareKeyboardController softwareKeyboardController = this.f23143OooO0Oo;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<DeleteAccountReasonChooseModel> f23144OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Activity f23145OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f23146OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ AccountBindInfo f23147OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f23148OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(List<DeleteAccountReasonChooseModel> list, MutableState<String> mutableState, Activity activity, AccountBindInfo accountBindInfo, MutableState<Integer> mutableState2) {
            super(0);
            this.f23144OooO0Oo = list;
            this.f23146OooO0o0 = mutableState;
            this.f23145OooO0o = activity;
            this.f23147OooO0oO = accountBindInfo;
            this.f23148OooO0oo = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            DeleteAccountReasonChooseModel deleteAccountReasonChooseModel = this.f23144OooO0Oo.get(DeleteAccountReasonSecondChooseScreen.MainListChooseBody$lambda$4(this.f23148OooO0oo));
            String value = Intrinsics.areEqual(deleteAccountReasonChooseModel.isNeedInput(), Boolean.TRUE) ? this.f23146OooO0o0.getValue() : null;
            DeleteAccountReasonSecondChooseScreen deleteAccountReasonSecondChooseScreen = DeleteAccountReasonSecondChooseScreen.INSTANCE;
            Activity activity = this.f23145OooO0o;
            AccountBindInfo accountBindInfo = this.f23147OooO0oO;
            Integer pId = deleteAccountReasonChooseModel.getPId();
            deleteAccountReasonSecondChooseScreen.onNextButtonClick(activity, accountBindInfo, pId != null ? pId.intValue() : 0, deleteAccountReasonChooseModel.getId(), value);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nDeleteAccountReasonSecondChooseScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAccountReasonSecondChooseScreen.kt\ncom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonSecondChooseScreen$MainListChooseBody$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,248:1\n171#2,12:249\n*S KotlinDebug\n*F\n+ 1 DeleteAccountReasonSecondChooseScreen.kt\ncom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonSecondChooseScreen$MainListChooseBody$2$1\n*L\n119#1:249,12\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<DeleteAccountReasonChooseModel> f23149OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f23150OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f23151OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(List<DeleteAccountReasonChooseModel> list, MutableState<Integer> mutableState, MutableState<String> mutableState2) {
            super(1);
            this.f23149OooO0Oo = list;
            this.f23151OooO0o0 = mutableState;
            this.f23150OooO0o = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final List<DeleteAccountReasonChooseModel> list = this.f23149OooO0Oo;
            int size = list.size();
            Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonSecondChooseScreen$MainListChooseBody$2$1$invoke$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    list.get(num.intValue());
                    return null;
                }
            };
            final MutableState<Integer> mutableState = this.f23151OooO0o0;
            final MutableState<String> mutableState2 = this.f23150OooO0o;
            LazyColumn.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonSecondChooseScreen$MainListChooseBody$2$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i;
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
                        DeleteAccountReasonChooseModel deleteAccountReasonChooseModel = (DeleteAccountReasonChooseModel) list.get(iIntValue);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        float f = 20;
                        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f), 0.0f, 2, null);
                        composer2.startReplaceableGroup(-483455358);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
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
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 13, null);
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        composer2.startReplaceableGroup(511388516);
                        MutableState mutableState3 = mutableState;
                        boolean zChanged = composer2.changed(numValueOf) | composer2.changed(mutableState3);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new OooOO0(mutableState3, iIntValue);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierM482paddingqDBjuR0$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o = OooOO0O.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(DeleteAccountReasonSecondChooseScreen.MainListChooseBody$lambda$4(mutableState3) == iIntValue ? o0Oo0oo.yldialog_ic_check_selected : o0Oo0oo.yldialog_ic_unchecked, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(17)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(12), null, composer2, 6, 2);
                        String title = deleteAccountReasonChooseModel.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        TextKt.m1261Text4IGK_g(title, (Modifier) null, o0000oo.OooO0OO(composer2).f38626OooOO0O, oOO0O00O.OooO0OO(15, composer2), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(2062804364);
                        if (iIntValue == DeleteAccountReasonSecondChooseScreen.MainListChooseBody$lambda$4(mutableState3) && Intrinsics.areEqual(deleteAccountReasonChooseModel.isNeedInput(), Boolean.TRUE)) {
                            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(16), null, composer2, 6, 2);
                            oo0o0O0.OooO00o(companion, mutableState2, deleteAccountReasonChooseModel.getInputText(), 0, composer2, 54, 8);
                        }
                        if (OooOo.OooO00o(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ AccountBindInfo f23153OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<DeleteAccountReasonChooseModel> f23154OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23155OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(List<DeleteAccountReasonChooseModel> list, AccountBindInfo accountBindInfo, int i) {
            super(2);
            this.f23154OooO0o0 = list;
            this.f23153OooO0o = accountBindInfo;
            this.f23155OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23155OooO0oO | 1);
            List<DeleteAccountReasonChooseModel> list = this.f23154OooO0o0;
            AccountBindInfo accountBindInfo = this.f23153OooO0o;
            DeleteAccountReasonSecondChooseScreen.this.MainListChooseBody(list, accountBindInfo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Activity f23156OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountReasonChooseModel f23157OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AccountBindInfo f23158OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f23159OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(Activity activity, AccountBindInfo accountBindInfo, DeleteAccountReasonChooseModel deleteAccountReasonChooseModel, MutableState<String> mutableState) {
            super(0);
            this.f23156OooO0Oo = activity;
            this.f23158OooO0o0 = accountBindInfo;
            this.f23157OooO0o = deleteAccountReasonChooseModel;
            this.f23159OooO0oO = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            DeleteAccountReasonSecondChooseScreen deleteAccountReasonSecondChooseScreen = DeleteAccountReasonSecondChooseScreen.INSTANCE;
            Activity activity = this.f23156OooO0Oo;
            AccountBindInfo accountBindInfo = this.f23158OooO0o0;
            Integer id = this.f23157OooO0o.getId();
            deleteAccountReasonSecondChooseScreen.onNextButtonClick(activity, accountBindInfo, id != null ? id.intValue() : 0, null, this.f23159OooO0oO.getValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f23160OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(SoftwareKeyboardController softwareKeyboardController) {
            super(0);
            this.f23160OooO0Oo = softwareKeyboardController;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SoftwareKeyboardController softwareKeyboardController = this.f23160OooO0Oo;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ AccountBindInfo f23162OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountReasonChooseModel f23163OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23164OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(DeleteAccountReasonChooseModel deleteAccountReasonChooseModel, AccountBindInfo accountBindInfo, int i) {
            super(2);
            this.f23163OooO0o0 = deleteAccountReasonChooseModel;
            this.f23162OooO0o = accountBindInfo;
            this.f23164OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23164OooO0oO | 1);
            DeleteAccountReasonChooseModel deleteAccountReasonChooseModel = this.f23163OooO0o0;
            AccountBindInfo accountBindInfo = this.f23162OooO0o;
            DeleteAccountReasonSecondChooseScreen.this.OtherCompose(deleteAccountReasonChooseModel, accountBindInfo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private DeleteAccountReasonSecondChooseScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void BottomButtons(boolean z, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2133904748);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2133904748, i2, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonSecondChooseScreen.BottomButtons (DeleteAccountReasonSecondChooseScreen.kt:201)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(20), Dp.m3775constructorimpl(12));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = 37;
            o00O0OO0.OooO00o(o0000.OooO0OO(o000000.Cancel), 0L, null, null, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f)), OooO00o.f23132OooO0Oo, composerStartRestartGroup, 0, 905969664, 262142);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
            String strOooO0OO = o0000.OooO0OO(o000000.Next);
            Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f));
            TextButtonStyle textButtonStyle = z ? TextButtonStyle.GreenOutLined : TextButtonStyle.GreyOutLined;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO0O0(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            o00O0OO0.OooO00o(strOooO0OO, 0L, null, textButtonStyle, null, null, null, 0.0f, null, z, false, 0L, false, null, null, null, null, null, modifierM511height3ABfNKs, (Function0) objRememberedValue, composer2, (i2 << 27) & 1879048192, 100663296, 261622);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(z, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContent(Composer composer, int i) {
        int i2;
        AccountBindInfo accountBindInfo;
        DeleteAccountReasonChooseModel deleteAccountReasonChooseModel;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1297619818);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1297619818, i2, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonSecondChooseScreen.MainContent (DeleteAccountReasonSecondChooseScreen.kt:56)");
            }
            Bundle bundleOooO0O0 = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(unit);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = bundleOooO0O0.get(DeviceRequestsHelper.DEVICE_INFO_MODEL);
                DeleteAccountReasonChooseModel deleteAccountReasonChooseModel2 = obj instanceof DeleteAccountReasonChooseModel ? (DeleteAccountReasonChooseModel) obj : null;
                Object obj2 = bundleOooO0O0.get(LinkedAccountsScreen.ACCOUNT_INFO_PARAM);
                accountBindInfo = obj2 instanceof AccountBindInfo ? (AccountBindInfo) obj2 : null;
                composerStartRestartGroup.updateRememberedValue(null);
                deleteAccountReasonChooseModel = deleteAccountReasonChooseModel2;
            } else {
                accountBindInfo = null;
                deleteAccountReasonChooseModel = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (deleteAccountReasonChooseModel == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i));
                return;
            }
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(16), null, composerStartRestartGroup, 6, 2);
            String subTitle = deleteAccountReasonChooseModel.getSubTitle();
            if (subTitle == null) {
                subTitle = "";
            }
            DeleteAccountReasonChooseModel deleteAccountReasonChooseModel3 = deleteAccountReasonChooseModel;
            int i3 = i2;
            TextKt.m1261Text4IGK_g(subTitle, PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(20), 0.0f, 2, null), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, oOO0O00O.OooO0OO(17, composerStartRestartGroup), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 196656, 0, 131024);
            Boolean boolIsNeedInput = deleteAccountReasonChooseModel3.isNeedInput();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(boolIsNeedInput, bool) && Intrinsics.areEqual(deleteAccountReasonChooseModel3.isRequired(), bool)) {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1039756347);
                OtherCompose(deleteAccountReasonChooseModel3, accountBindInfo, composer2, DeleteAccountReasonChooseModel.$stable | (AccountBindInfo.$stable << 3) | ((i3 << 6) & 896));
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1039756255);
                List<DeleteAccountReasonChooseModel> children = deleteAccountReasonChooseModel3.getChildren();
                if (children != null) {
                    INSTANCE.MainListChooseBody(children, accountBindInfo, composer2, (AccountBindInfo.$stable << 3) | 392);
                }
                composer2.endReplaceableGroup();
            }
            Object objConsume = composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
            final Activity activity = (Activity) objConsume;
            LiveEventBus.get("FINISH_DELETE_ACCOUNT_REASON_ACTIVITY").observe((LifecycleOwner) composer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), new Observer() { // from class: o0OoOoO0.o00O00o0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj3) {
                    DeleteAccountReasonSecondChooseScreen.MainContent$lambda$2(activity, obj3);
                }
            });
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent$lambda$2(Activity activity, Object obj) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainListChooseBody(List<DeleteAccountReasonChooseModel> list, AccountBindInfo accountBindInfo, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1088755476);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1088755476, i, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonSecondChooseScreen.MainListChooseBody (DeleteAccountReasonSecondChooseScreen.kt:100)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composerStartRestartGroup, LocalSoftwareKeyboardController.$stable);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(current);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new OooOO0O(current);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierFillMaxWidth$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue3, 253);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        LazyDslKt.LazyColumn(androidx.compose.foundation.layout.OooOO0.OooO00o(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), null, null, false, null, null, null, false, new OooOOO0(list, mutableState, mutableState2), composerStartRestartGroup, 0, 254);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
        INSTANCE.BottomButtons(MainListChooseBody$lambda$4(mutableState) >= 0, new OooOOO(list, mutableState2, (Activity) objConsume, accountBindInfo, mutableState), composerStartRestartGroup, 384);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(list, accountBindInfo, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MainListChooseBody$lambda$4(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainListChooseBody$lambda$5(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OtherCompose(DeleteAccountReasonChooseModel deleteAccountReasonChooseModel, AccountBindInfo accountBindInfo, Composer composer, int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-704245488);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(deleteAccountReasonChooseModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(accountBindInfo) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-704245488, i2, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonSecondChooseScreen.OtherCompose (DeleteAccountReasonSecondChooseScreen.kt:172)");
            }
            SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composerStartRestartGroup, LocalSoftwareKeyboardController.$stable);
            float f = 20;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(current);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOo00(current);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierFillMaxSize$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                i3 = 2;
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i3 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue2;
            oo0o0O0.OooO00o(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f), 0.0f, i3, null), mutableState, deleteAccountReasonChooseModel.getInputText(), 0, composerStartRestartGroup, 54, 8);
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) objConsume;
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            INSTANCE.BottomButtons(((CharSequence) mutableState.getValue()).length() > 0, new OooOo(activity, accountBindInfo, deleteAccountReasonChooseModel, mutableState), composerStartRestartGroup, 384);
            if (com.facebook.appevents.OooOOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(deleteAccountReasonChooseModel, accountBindInfo, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNextButtonClick(Activity activity, AccountBindInfo accountInfo, int reasonTypeOne, Integer reasonTypeTwo, String inputText) {
        DeleteAccountParamsModel deleteAccountParams = new DeleteAccountParamsModel(reasonTypeOne, reasonTypeTwo, inputText);
        if (accountInfo != null) {
            if (!(accountInfo.getIsPh().length() == 0) && !Intrinsics.areEqual(accountInfo.getIsPh(), AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                String countryCode = oOO0O0O0.OooO0O0(new oOO0O0O0()).getCountryCode();
                int i = SmsCodeActivity.f24843Oooo0;
                SmsCodeActivity.OooO00o.OooO00o(activity, accountInfo.getIsPh(), countryCode, ClientCodeType.DeleteAccount, 0, deleteAccountParams, 0, null, false, 464);
                return;
            }
            int i2 = DeleteAccountCheckActivity.f24708OooOoO0;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(accountInfo, "mData");
            Intrinsics.checkNotNullParameter(deleteAccountParams, "deleteAccountParams");
            Intent intent = new Intent(activity, (Class<?>) DeleteAccountCheckActivity.class);
            intent.putExtra("LOGIN_PLATFORM_DATA", accountInfo);
            intent.putExtra("DELETE_REASON_TYPE", deleteAccountParams);
            activity.startActivity(intent);
        }
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(708453037);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(708453037, i2, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonSecondChooseScreen.Content (DeleteAccountReasonSecondChooseScreen.kt:49)");
            }
            o0O0oo0o.OooO00o(o0000.OooO0OO(o000000.delete_account), 0.0f, 0L, null, null, null, null, null, null, composerStartRestartGroup, 0, 510);
            composer2 = composerStartRestartGroup;
            MainContent(composer2, (i2 >> 3) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(columnScope, i));
    }
}
