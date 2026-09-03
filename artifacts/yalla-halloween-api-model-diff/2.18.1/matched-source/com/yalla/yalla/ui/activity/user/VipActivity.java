package com.yalla.yalla.ui.activity.user;

import Oooo0.o000oOoO;
import Oooo0.o0oOOo;
import Oooo0.oo00oO;
import Oooo000.o000O00O;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import code.easy.contentstate.ContentState;
import com.google.accompanist.pager.Pager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.ItemVipModel;
import com.yalla.yalla.model.VipModel;
import com.yalla.yalla.ui.activity.BaseComposeActivity;
import com.yalla.yalla.ui.screen.main.VipExperienceScreen;
import com.yalla.yalla.ui.vm.room.VipVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import o00000O0.o0OO00O;
import o0000O0O.o00Oo0;
import o0000OO.o00000O;
import o0000OO.o00000O0;
import o0000OO.o0O0O00;
import o0O0O00.o000000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O0O;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0O0O;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0O0OOO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000O0o;
import p191o00o0O.o000OOo;
import p257o00ooOO0.o0O0oo0o;
import p261o00ooOoO.u;
import p263o00ooo.o000OO0O;
import p391o0OOooOo.o0O00000;
import p507o0o00oOO.o0000O0;
import p508o0o00oOo.o0O0ooO;
import p510o0o00oo0.o0O000o0;
import p524o0o0O0oO.o0O00o0;
import p566o0oOo00O.oO000;
import p566o0oOo00O.oO000O0O;
import p566o0oOo00O.oO000Oo;
import p566o0oOo00O.oO000Oo0;
import p566o0oOo00O.oO0Oo0oo;
import p566o0oOo00O.oO0OoOO0;
import p566o0oOo00O.oO0o0o;
import p571o0oOo0o.o00O0OO;
import p584o0oOoo.o000O;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/VipActivity;", "Lcom/yalla/yalla/ui/activity/BaseComposeActivity;", "<init>", "()V", "OooO0O0", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VipActivity extends BaseComposeActivity {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f23570OoooOOo = new OooO0O0();

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f23571OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23572OoooO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VipVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.VipActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.VipActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.VipActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23627Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23627Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f23573OoooO0O = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(ContentState.Loading);

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f23574OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f23575OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public o0O00OO<Boolean> f23576o000oOoO;

    public static final class OooO extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23584Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0000OO.OooOO0O oooOO0O) {
            super(1);
            this.f23584Oooo0o = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, this.f23584Oooo0o.f27365OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27361OooO0o, this.f23584Oooo0o.f27367OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0O0O00.OooO00o.OooO00o(constrainAs.f27363OooO0oO, this.f23584Oooo0o.f27366OooO0OO, -6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f23586Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f23587Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00o0 o00o00o1, int i) {
            super(2);
            this.f23586Oooo0oO = o00o00o1;
            this.f23587Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            VipActivity vipActivity = VipActivity.this;
            o00O00o0 o00o00o1 = this.f23586Oooo0oO;
            int i = this.f23587Oooo0oo | 1;
            OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            vipActivity.OooOOo(o00o00o1, ooo00o, i);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 {
        public final void OooO00o(@NotNull Context context, @NotNull VipLevel kaVipLevel) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(kaVipLevel, "kaVipLevel");
            Intent intent = new Intent(context, (Class<?>) VipActivity.class);
            intent.putExtra("KA_VIP_LEVEL", kaVipLevel.getValue());
            context.startActivity(intent);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23588Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ float f23589Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0000OO.OooOO0O oooOO0O, float f) {
            super(1);
            this.f23588Oooo0o = oooOO0O;
            this.f23589Oooo0oO = f;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0O0O00.OooO00o.OooO00o(constrainAs.f27363OooO0oO, this.f23588Oooo0o.f27366OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, constrainAs.f27359OooO0OO.f27365OooO0O0, this.f23589Oooo0oO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o0000O0O.o000oOoO, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Float> f23590Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0O00OO<Float> o0o00oo2) {
            super(1);
            this.f23590Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000O0O.o000oOoO o000oooo2) {
            long j = o000oooo2.f27322OooO00o;
            OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            this.f23590Oooo0o.setValue(Float.valueOf(((int) (j >> 32)) / 2.0f));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<p191o00o0O.o0Oo0oo, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f23591Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j) {
            super(1);
            this.f23591Oooo0o = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(p191o00o0O.o0Oo0oo o0oo0oo2) {
            p191o00o0O.o0Oo0oo Canvas = o0oo0oo2;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            o000O0o o000o0oOooO00o = p145o00Oo0.o00Ooo.OooO00o();
            float f = 2;
            float f2 = 12;
            p145o00Oo0.o0OoOo0 o0oooo1 = (p145o00Oo0.o0OoOo0) o000o0oOooO00o;
            o0oooo1.OooOO0((o00O0O.OooOo00.OooO0Oo(Canvas.OooO0OO()) / f) - f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            o0oooo1.OooOOO((o00O0O.OooOo00.OooO0Oo(Canvas.OooO0OO()) / f) + f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            o0oooo1.OooOOO(o00O0O.OooOo00.OooO0Oo(Canvas.OooO0OO()) / f, f2);
            o0oooo1.close();
            Canvas.Oooo0oO(o000o0oOooO00o, this.f23591Oooo0o, 1.0f, o000OOo.f33065OooO00o, null, 3);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f23592Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(float f) {
            super(1);
            this.f23592Oooo0o = f;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, constrainAs.f27359OooO0OO.f27365OooO0O0, this.f23592Oooo0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            o0O0O00.OooO00o.OooO00o(constrainAs.f27362OooO0o0, constrainAs.f27359OooO0OO.f27366OooO0OO, 108, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ VipModel f23594Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f23595Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(VipModel vipModel, int i) {
            super(2);
            this.f23594Oooo0oO = vipModel;
            this.f23595Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            VipActivity vipActivity = VipActivity.this;
            VipModel vipModel = this.f23594Oooo0oO;
            int i = this.f23595Oooo0oo | 1;
            OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            vipActivity.OooOOoo(vipModel, ooo00o, i);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00000.OooO0OO("Me_VIP_increase");
            VipExperienceScreen vipExperienceScreen = VipExperienceScreen.f24691OooO00o;
            VipActivity vipActivity = VipActivity.this;
            OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            int currentExperience = vipActivity.Oooo000().getPersonalKaVipModel().getCurrentExperience();
            Bundle bundleOooO00o = o000O00O.OooO0OO.OooO00o();
            bundleOooO00o.putInt("key", currentExperience);
            o000O.OooO00o(vipExperienceScreen, bundleOooO00o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function3<o0O0O0O, oOO00O, Integer, Unit> {
        public OooOOOO() {
            super(3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O0O0O o0o0o0o, oOO00O ooo00o, Integer num) {
            o0O0O0O Toolbar = o0o0o0o;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                ooo00o2.OooO0o0(711498295);
                if (((Boolean) VipActivity.this.f23571OoooO.getValue()).booleanValue()) {
                    o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.drawable.svg_setting, ooo00o2);
                    o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                    p031OoooO.o0OOO0o.OooO00o(o000oo0oOooO00o, null, p254o00ooO0O.o000O0o.OooO0O0(SizeKt.OooOO0(o00OOOO0.OooO00o.f4198Oooo0o, 24), false, false, null, new com.yalla.yalla.ui.activity.user.OooOOOO(VipActivity.this), KotlinVersion.MAX_COMPONENT_VALUE), o0000O0.f41693OooO0OO, ooo00o2, 3128, 0);
                }
                ooo00o2.Oooo0o0();
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, 12), ooo00o2, 6);
                o000OO0O o000oo0oOooO00o2 = o00000.OooO0O0.OooO00o(R.drawable.icon_badge_doubt_gray, ooo00o2);
                o0000O0 o0000o2 = o0000O0.f41691OooO00o;
                p031OoooO.o0OOO0o.OooO00o(o000oo0oOooO00o2, null, p254o00ooO0O.o000O0o.OooO0O0(SizeKt.OooOO0(oooO00o, 24), false, false, null, new com.yalla.yalla.ui.activity.user.OooOo00(VipActivity.this), KotlinVersion.MAX_COMPONENT_VALUE), o0000O0.f41693OooO0OO, ooo00o2, 3128, 0);
                o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, 14), ooo00o2, 6);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {
        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipActivity.this.f23576o000oOoO.setValue(Boolean.TRUE);
            o0O00000.OooO0OO("Me_VIP_service");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0oOOo f23600Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f23601Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(o0oOOo o0oooo2, int i) {
            super(2);
            this.f23600Oooo0oO = o0oooo2;
            this.f23601Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            VipActivity vipActivity = VipActivity.this;
            o0oOOo o0oooo2 = this.f23600Oooo0oO;
            int i = this.f23601Oooo0oo | 1;
            OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            vipActivity.OooOo00(o0oooo2, ooo00o, i);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ VipModel f23603Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f23604Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(VipModel vipModel, int i) {
            super(2);
            this.f23603Oooo0oO = vipModel;
            this.f23604Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            VipActivity vipActivity = VipActivity.this;
            VipModel vipModel = this.f23603Oooo0oO;
            int i = this.f23604Oooo0oo | 1;
            OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            vipActivity.OooOo0O(vipModel, ooo00o, i);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f23606Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(int i) {
            super(2);
            this.f23606Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            VipActivity.this.OooOo0(ooo00o, this.f23606Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {
        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipActivity vipActivity = VipActivity.this;
            OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            vipActivity.Oooo00O();
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f23609Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(int i) {
            super(2);
            this.f23609Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            VipActivity.this.OooOOo0(ooo00o, this.f23609Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {
        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipActivity.OooOoo(VipActivity.this, false);
            VipActivity.this.Oooo000().updateKaVipDialogState();
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f23611Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ VipActivity f23612Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(o00O00o0 o00o00o1, VipActivity vipActivity) {
            super(2);
            this.f23611Oooo0o = o00o00o1;
            this.f23612Oooo0oO = vipActivity;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        /* JADX WARN: Type inference failed for: r26v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O composer = ooo00o;
            if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00O00o0 o00o00o1 = this.f23611Oooo0o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooOO0o = SizeKt.OooOO0o(oooO00o, 280);
                o00OO0OO alignment = o00OO0O0.OooO00o.f4175OooO0o;
                o00OOOO0 o00oooo0OooO00o = o00o00o1.OooO00o(o00oooo0OooOO0o, alignment);
                o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4184OooOOOO;
                VipActivity vipActivity = this.f23612Oooo0oO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                Oooo0o0.o00O000.OooOo00 oooOo00 = p028Oooo0o0.o00O000.f2032OooO0Oo;
                o000000 o000000VarOooO00o = oo00o.OooO00o(oooOo00, oooO00o2, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                ?? r0 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r0);
                ?? r2 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r2);
                ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r3);
                ?? r26 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r26, composer, "composer", composer), composer, 0);
                o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(o000O00O.OooO0O0(composer, 2058660585, -1163856341, oooO00o), 66);
                o000000 o000000VarOooO00o2 = o00O00O.OooO0OO.OooO00o(composer, 733328855, alignment, false, composer, -1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r0, composer, oooO2, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r26, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                float f = 33;
                o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(SizeKt.OooO0oO(oooO00o, f));
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                long j = o0000O0.f41693OooO0OO;
                o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO0o, j, o000O0Oo.f32099OooO00o);
                o00OO0OO alignment2 = o00OO0O0.OooO00o.f4170OooO;
                Intrinsics.checkNotNullParameter(o00oooo0OooO0O0, "<this>");
                Intrinsics.checkNotNullParameter(alignment2, "alignment");
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                o0O0OOO0.OooO00o(o00oooo0OooO0O0.OooOOoo(new p028Oooo0o0.o00O00O(alignment2, false)), composer, 0);
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.user_ka_vip_upgrade_dialog_header, composer), null, SizeKt.OooO0o0(oooO00o), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                VipLevel.Companion companion = VipLevel.INSTANCE;
                OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
                int iOooO0O0 = companion.OooO0O0(vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPLv()).OooO0O0();
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("VIP");
                if (iOooO0O0 <= 0) {
                    iOooO0O0 = VipLevel.Vip1.getValue();
                }
                sbOooO0o0.append(iOooO0O0);
                String string = sbOooO0o0.toString();
                long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(21);
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment, false);
                Intrinsics.checkNotNullParameter(other, "other");
                o000O0O0.OooO0OO(string, other, j, jOooO0OO, null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 3456, 0, 64880);
                o0O0OO0.OooO00o(composer);
                float f2 = 20;
                o00OOOO0 o00oooo0OooO = PaddingKt.OooO(SizeKt.OooO0o(BackgroundKt.OooO0O0(p442o0OoOo0.Oooo000.OooO00o(oooO00o, p033OoooO00.o00O0O.OooO0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, f2, 3)), j, o000O0Oo.f32099OooO00o)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 26, 7);
                composer.OooO0o0(-483455358);
                o000000 o000000VarOooO00o3 = oo00o.OooO00o(oooOo00, oooO00o2, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r0, composer, oooO3, r2, composer, layoutDirection3, r3, composer, o00ooooo4, r26, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                float f3 = 15;
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f3), composer, 6);
                int iOooO0O1 = companion.OooO0O0(vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPLv()).OooO0O0();
                String strOooO00o = o00000.OooO0OO.OooO00o(R.string.user_ka_vip_upgrade_dialog_content, composer);
                String[] strArr = new String[1];
                if (iOooO0O1 <= 0) {
                    iOooO0O1 = VipLevel.Vip1.getValue();
                }
                strArr[0] = String.valueOf(iOooO0O1);
                o000O0O0.OooO0OO(com.yalla.support.common.util.OooOo.OooO00o(strOooO00o, strArr), PaddingKt.OooO0oO(oooO00o, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), u.OooO0O0(composer).OooO0oo(), o0000O0O.o00Oo0.OooO0OO(14), null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 3120, 0, 64880);
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, 14), composer, 6);
                o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(companion.OooO00o(vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPLv()), composer);
                o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(oooO00o, 120);
                o0O0O00.OooOO0.OooO00o.OooO0O0 oooO0O1 = o0O0O00.OooOO0.OooO00o.f35243OooO0oO;
                Oooo0.o00.OooO00o(o000oo0oOooO00o, null, o00oooo0OooOO0, null, oooO0O1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, 12), composer, 6);
                o000O0O0.OooO0OO(com.yalla.support.common.util.OooOo.OooO00o(o00000.OooO0OO.OooO00o(R.string.user_ka_vip_upgrade_dialog_valid_time, composer), o00O0.f48624OooO00o.OooO0OO(vipActivity.Oooo000().getPersonalKaVipModel().getExpireTimeStamp(), "dd/MM/yyyy")), null, u.OooO0O0(composer).OooO0oO(), o0000O0O.o00Oo0.OooO0OO(13), null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 3072, 0, 64882);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f2), composer, 6);
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.user_ka_vip_upgrade_dialog_close, composer), null, ClickableKt.OooO0Oo(SizeKt.OooOO0(oooO00o, f), false, new com.yalla.yalla.ui.activity.user.OooOo(vipActivity), 7), null, oooO0O1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                o0O0OO0.OooO00o(composer);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f23613Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ VipActivity f23614Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(boolean z, VipActivity vipActivity) {
            super(0);
            this.f23613Oooo0o = z;
            this.f23614Oooo0oO = vipActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            try {
                if (this.f23613Oooo0o) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("whatsapp://send/?phone=971521235670&text=Hello%2C%20Yalla&app_absent=0"));
                    intent.setPackage("com.whatsapp");
                    this.f23614Oooo0oO.startActivity(intent);
                } else {
                    p516o0o0O000.Oooo000.OooO0OO(this.f23614Oooo0oO, "com.whatsapp");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function1<Boolean, Unit> {
        public o0OO00O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            VipActivity.this.f23573OoooO0O.setValue((bool2 == null || !bool2.booleanValue()) ? ContentState.Empty : ContentState.Content);
            VipActivity vipActivity = VipActivity.this;
            vipActivity.f23575OoooOOO = vipActivity.getIntent().getIntExtra("KA_VIP_LEVEL", VipLevel.Vip0.getValue());
            VipActivity vipActivity2 = VipActivity.this;
            VipActivity.OooOoo(vipActivity2, vipActivity2.Oooo000().getPersonalKaVipModel().getDoPopUp());
            VipActivity vipActivity3 = VipActivity.this;
            vipActivity3.f23571OoooO.setValue(Boolean.valueOf(vipActivity3.Oooo000().getPersonalKaVipModel().getKaVIPState() == VipState.Vip.getValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f23617Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(int i) {
            super(2);
            this.f23617Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            VipActivity.this.OooOo(ooo00o, this.f23617Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class o0Oo0oo {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VipLevel.values().length];
            iArr[VipLevel.Vip1.ordinal()] = 1;
            iArr[VipLevel.Vip2.ordinal()] = 2;
            iArr[VipLevel.Vip3.ordinal()] = 3;
            iArr[VipLevel.Vip4.ordinal()] = 4;
            iArr[VipLevel.Vip5.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0oOOo f23618Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ VipActivity f23619Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(o0oOOo o0oooo2, VipActivity vipActivity) {
            super(3);
            this.f23618Oooo0o = o0oooo2;
            this.f23619Oooo0oO = vipActivity;
        }

        /* JADX WARN: Type inference failed for: r21v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 EasyContentState = o00o00o1;
            oOO00O composer = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(EasyContentState, "$this$EasyContentState");
            if ((iIntValue & 81) == 16 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0OO = oo00oO.OooO0OO(oooO00o, this.f23618Oooo0o);
                VipActivity vipActivity = this.f23619Oooo0oO;
                composer.OooO0o0(733328855);
                o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0OO);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                ?? r2 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r2);
                ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r3);
                ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r4);
                ?? r21 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r21, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                VipActivity.OooOoO0(vipActivity, BoxScopeInstance.f5741OooO00o, composer, 70);
                o00OOOO0 o00oooo0OooO0O0 = WindowInsetsPadding_androidKt.OooO0O0(oooO00o);
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                Oooo0o0.o00O000.OooOo00 oooOo00 = p028Oooo0o0.o00O000.f2032OooO0Oo;
                o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4182OooOOO;
                o000000 o000000VarOooO00o = oo00o.OooO00o(oooOo00, oooO00o2, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r2, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r21, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, 50), composer, 6);
                composer.OooO0o0(-483455358);
                o000000 o000000VarOooO00o2 = oo00o.OooO00o(oooOo00, oooO00o2, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r2, composer, oooO3, r3, composer, layoutDirection3, r4, composer, o00ooooo4, r21, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                o0O0O0O.OooOO0 oooOO0OooO00o = o0O0O0O.OooOOO0.OooO00o(RangesKt.coerceAtLeast(VipLevel.INSTANCE.OooO0O0(vipActivity.f23575OoooOOO > VipLevel.Vip0.getValue() ? vipActivity.f23575OoooOOO : vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPLv()).OooO0O0() - 1, 0), composer, 0);
                VipActivity.OooOoO(vipActivity, oooOO0OooO00o, composer, 64);
                VipActivity.OooOoo0(vipActivity, oooOO0OooO00o, composer, 64);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0ooOOo f23620Oooo0o = new o0ooOOo();

        public o0ooOOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f23622Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f23623Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(o00O00o0 o00o00o1, int i) {
            super(2);
            this.f23622Oooo0oO = o00o00o1;
            this.f23623Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            VipActivity.this.OooOo0o(this.f23622Oooo0oO, ooo00o, this.f23623Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function1<ApiError, Unit> {
        public oo0o0Oo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            VipActivity vipActivity = VipActivity.this;
            vipActivity.f23573OoooO0O.setValue(ContentState.Error);
            return Unit.INSTANCE;
        }
    }

    public VipActivity() {
        Boolean bool = Boolean.FALSE;
        this.f23571OoooO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f23574OoooOO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f23576o000oOoO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f23575OoooOOO = VipLevel.Vip0.getValue();
    }

    public static final void OooOoO(VipActivity vipActivity, o0O0O0O.OooOO0 oooOO1, oOO00O ooo00o, int i) {
        Objects.requireNonNull(vipActivity);
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(292272758);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        Pager.OooO00o(vipActivity.Oooo000().getKaVipModels().size(), SizeKt.OooO0oO(SizeKt.OooO0o(PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, 5)), 238), oooOO1, false, -75, null, null, null, null, false, o00O0000.OooO00o(ooo00oOooOOo, 1474858129, new oO0o0o(vipActivity)), ooo00oOooOOo, ((i << 6) & 896) | 24624, 6, 1000);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oO0OoOO0(vipActivity, oooOO1, i));
    }

    public static final void OooOoO0(VipActivity vipActivity, o00O00o0 o00o00o1, oOO00O ooo00o, int i) {
        int i2;
        Objects.requireNonNull(vipActivity);
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-2054444699);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o00o00o1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.drawable.user_ka_vip_background_1, ooo00oOooOOo);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), 355);
            o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4173OooO0OO;
            Oooo0.o00.OooO00o(o000oo0oOooO00o, null, o00oooo0OooO0oO, o00oo0oo, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 3512, 112);
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.user_ka_vip_background_2, ooo00oOooOOo), null, o00o00o1.OooO00o(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), ShopVehicleListModel.VehicleTagType_Vip300), o00oo0oo), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 56, 120);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oO000O0O(vipActivity, o00o00o1, i));
    }

    /* JADX WARN: Type inference failed for: r23v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    public static final void OooOoOO(VipActivity vipActivity, o00O00o0 o00o00o1, int i, oOO00O ooo00o, int i2) {
        Function0<o000000.OooO00o> function0;
        long j;
        int i3;
        String strOooO00o;
        long j2;
        VipActivity vipActivity2;
        String strOooO00o2;
        Objects.requireNonNull(vipActivity);
        oOO00O composer = ooo00o.OooOOo(578393449);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        VipModel vipModel = vipActivity.Oooo000().getKaVipModels().get(i);
        VipLevel.Companion companion = VipLevel.INSTANCE;
        VipLevel vipLevelOooO0O0 = companion.OooO0O0(vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPLv());
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO00o = o00o00o1.OooO00o(SizeKt.OooO0oO(SizeKt.OooOO0o(oooO00o, 298), 170), o00OO0O0.OooO00o.f4175OooO0o);
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO00o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function1);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r2 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r2);
        ?? r5 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r5);
        ?? r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r6);
        ?? r23 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r23, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        float f = 15;
        o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, f, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12);
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        Oooo0o0.o00O000.OooOOOO oooOOOO = p028Oooo0o0.o00O000.f2030OooO0O0;
        o000000 o000000VarOooO00o = o0O00o00.OooO00o(oooOOOO, o00OO0O0.OooO00o.f4180OooOO0O, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function1);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r2, composer, oooO2, r5, composer, layoutDirection2, r6, composer, o00ooooo3, r23, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(companion.OooO00o(vipModel.getKaVipLv()), composer), null, SizeKt.OooOO0(oooO00o, 96), null, o0O0O00.OooOO0.OooO00o.f35243OooO0oO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
        o00OOOO0 o00oooo0OooO2 = PaddingKt.OooO(oooO00o, 8, 17, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12);
        composer.OooO0o0(-483455358);
        o000000 o000000VarOooO00o2 = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO2);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            function0 = function1;
            composer.OooOoO0(function0);
        } else {
            function0 = function1;
            composer.Oooo00O();
        }
        Function0<o000000.OooO00o> function2 = function0;
        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r2, composer, oooO3, r5, composer, layoutDirection3, r6, composer, o00ooooo4, r23, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(oooO00o, 37);
        o000000 o000000VarOooO00o3 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, o00OO0O0.OooO00o.f4181OooOO0o, composer, -1323940314);
        o0000O0O.OooO oooO4 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection4 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo5 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O3 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function2);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O3).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r2, composer, oooO4, r5, composer, layoutDirection4, r6, composer, o00ooooo5, r23, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        VipLevel vipLevelOooO0O1 = companion.OooO0O0(vipModel.getKaVipLv());
        int[] iArr = o0Oo0oo.$EnumSwitchMapping$0;
        int i4 = iArr[vipLevelOooO0O1.ordinal()];
        int i5 = R.drawable.user_ka_vip_level_1;
        if (i4 != 1) {
            if (i4 == 2) {
                i5 = R.drawable.user_ka_vip_level_2;
            } else if (i4 == 3) {
                i5 = R.drawable.user_ka_vip_level_3;
            } else if (i4 == 4) {
                i5 = R.drawable.user_ka_vip_level_4;
            } else if (i4 == 5) {
                i5 = R.drawable.user_ka_vip_level_5;
            }
        }
        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(i5, composer), null, SizeKt.OooO0oO(oooO00o, 22), null, o0O0O00.OooOO0.OooO00o.f35240OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
        float f2 = 4;
        o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f2), composer, 6);
        composer.OooO0o0(585562193);
        if (vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPLv() == vipModel.getKaVipLv()) {
            String strOooO00o3 = o00000.OooO0OO.OooO00o(R.string.user_ka_vip_current_level, composer);
            long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(10);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o000O0O0.OooO0OO(strOooO00o3, PaddingKt.OooO0o(BackgroundKt.OooO0O0(p442o0OoOo0.Oooo000.OooO00o(oooO00o, p033OoooO00.o00O0O.OooO0OO(f2)), vipActivity.OooOooO(vipModel.getKaVipLv()), o000O0Oo.f32099OooO00o), f2, 2), o0000O0.f41690OooO, jOooO0OO, null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, null, 0L, 0, false, 0, null, null, composer, 3456, 0, 65392);
            j = 4294967296L;
        } else {
            j = 4294967296L;
        }
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.OooO0o0(585562995);
        if (vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPLv() < vipModel.getKaVipLv()) {
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.user_ka_vip_not_current_level, composer), null, vipActivity.OooOooo(vipModel.getKaVipLv()), o0000O0O.o00Oo0.OooO0OO(10), null, null, null, o0000O0O.o00Oo0.OooO0o0(j, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65394);
        }
        composer.Oooo0o0();
        composer.OooO0o0(1571428003);
        VipLevel vipLevel = VipLevel.Vip0;
        if ((vipLevelOooO0O0 == vipLevel && vipModel.getKaVipLv() == VipLevel.Vip1.getValue() && vipActivity.Oooo000().getPersonalKaVipModel().getCurrentExperience() > 0) || vipLevelOooO0O0.getValue() == vipModel.getKaVipLv()) {
            if (vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPState() == VipState.VipFrozen.getValue()) {
                composer.OooO0o0(585564083);
                strOooO00o2 = com.yalla.support.common.util.OooOo.OooO00o(o00000.OooO0OO.OooO00o(R.string.user_ka_vip_remain_time, composer), String.valueOf(vipActivity.Oooo000().getPersonalKaVipModel().getLeftDayNum()));
                composer.Oooo0o0();
            } else {
                composer.OooO0o0(585564170);
                strOooO00o2 = com.yalla.support.common.util.OooOo.OooO00o(o00000.OooO0OO.OooO00o(vipLevelOooO0O0 == vipLevel ? R.string.user_ka_vip_experience_expiry_time : R.string.user_ka_vip_expiry_time, composer), o00O0.f48624OooO00o.OooO0OO(vipActivity.Oooo000().getPersonalKaVipModel().getExpireTimeStamp(), "dd/MM/yyyy"));
                composer.Oooo0o0();
            }
            o000O0O0.OooO0OO(strOooO00o2, null, vipActivity.OooOooo(vipModel.getKaVipLv()), o0000O0O.o00Oo0.OooO0OO(10), null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65394);
        }
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        if (vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPState() == VipState.VipFrozen.getValue() && vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPLv() == vipModel.getKaVipLv()) {
            vipActivity2 = vipActivity;
        } else if ((vipLevelOooO0O0 == vipLevel && vipModel.getKaVipLv() == VipLevel.Vip1.getValue()) || vipLevelOooO0O0.getValue() == vipModel.getKaVipLv()) {
            composer.OooO0o0(1571430084);
            vipActivity.OooOOoo(vipModel, composer, 72);
            composer.Oooo0o0();
            vipActivity2 = vipActivity;
        } else {
            composer.OooO0o0(1571430204);
            if (vipLevelOooO0O0.getValue() > vipModel.getKaVipLv()) {
                strOooO00o = p558o0oOOoo.oo0o0O0.OooO00o(composer, 1571430412, R.string.user_ka_vip_over_this_level, composer);
                i3 = 1;
            } else if (vipModel.getKaVipLv() - vipLevelOooO0O0.getValue() == 100) {
                composer.OooO0o0(1571430609);
                i3 = 1;
                strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(o00000.OooO0OO.OooO00o(R.string.user_ka_vip_upgrade_level, composer), p522o0o0O0o.o00O0.OooO0O0(String.valueOf(vipActivity.Oooo000().getPersonalKaVipModel().getCurrentExperience() + vipActivity.Oooo000().getPersonalKaVipModel().getLeftExperience())));
                composer.Oooo0o0();
            } else {
                i3 = 1;
                strOooO00o = p558o0oOOoo.oo0o0O0.OooO00o(composer, 1571431089, R.string.user_ka_vip_continue_refueling_to_level, composer);
            }
            long jOooO0OO2 = o0000O0O.o00Oo0.OooO0OO(12);
            int i6 = iArr[companion.OooO0O0(vipModel.getKaVipLv()).ordinal()];
            if (i6 == i3) {
                o0000O0 o0000o2 = o0000O0.f41691OooO00o;
                j2 = o0000O0.f41800o00oO0o;
            } else if (i6 == 2) {
                o0000O0 o0000o3 = o0000O0.f41691OooO00o;
                j2 = o0000O0.f41799o00oO0O;
            } else if (i6 == 3) {
                o0000O0 o0000o4 = o0000O0.f41691OooO00o;
                j2 = o0000O0.f41807o0ooOO0;
            } else if (i6 == 4) {
                o0000O0 o0000o5 = o0000O0.f41691OooO00o;
                j2 = o0000O0.f41741OoooOoo;
            } else if (i6 != 5) {
                o0000O0 o0000o6 = o0000O0.f41691OooO00o;
                j2 = o0000O0.f41800o00oO0o;
            } else {
                o0000O0 o0000o7 = o0000O0.f41691OooO00o;
                j2 = o0000O0.f41808o0ooOOo;
            }
            float f3 = 24;
            o00OOOO0 o00oooo0OooO3 = PaddingKt.OooO(oooO00o, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, 26, 2);
            o00OO0OO alignment = o00OO0O0.OooO00o.f4178OooO0oo;
            Intrinsics.checkNotNullParameter(o00oooo0OooO3, "<this>");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            Function1<o00O000o, Unit> function4 = o00oOoo.f6560OooO00o;
            Function1<o00O000o, Unit> function5 = o00oOoo.f6560OooO00o;
            vipActivity2 = vipActivity;
            o000O0O0.OooO0OO(strOooO00o, o00oooo0OooO3.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false)), j2, jOooO0OO2, null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65392);
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooO00o = p032OoooO0.oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new oO0Oo0oo(vipActivity2, o00o00o1, i, i2));
    }

    public static final void OooOoo(VipActivity vipActivity, boolean z) {
        vipActivity.f23574OoooOO0.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooOoo0(VipActivity vipActivity, o0O0O0O.OooOO0 oooOO1, oOO00O ooo00o, int i) {
        Objects.requireNonNull(vipActivity);
        oOO00O composer = ooo00o.OooOOo(-1190660026);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        int iOooO0O0 = VipLevel.INSTANCE.OooO0O0(oooOO1.OooO0o0()).OooO0O0();
        VipModel vipModel = vipActivity.Oooo000().getKaVipModels().size() > iOooO0O0 ? vipActivity.Oooo000().getKaVipModels().get(iOooO0O0) : vipActivity.Oooo000().getKaVipModels().get(0);
        vipActivity.OooOo0O(vipModel, composer, 72);
        List<ItemVipModel> privilegeData = vipModel.getPrivilegeData();
        composer.OooO0o0(-739185155);
        if (privilegeData != null) {
            o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(SizeKt.OooO0o(o00OOOO0.OooO00o.f4198Oooo0o), 14, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            o00OO0OO.OooO00o oooO00o = o00OO0O0.OooO00o.f4184OooOOOO;
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            o0O0ooO.OooO00o(privilegeData, 3, o00O0000.OooO00o(composer, 91034954, new oO000Oo0(vipActivity, vipModel)), composer, 440);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            Unit unit = Unit.INSTANCE;
        }
        composer.Oooo0o0();
        if (vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPState() != VipState.Vip.getValue()) {
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(o00OOOO0.OooO00o.f4198Oooo0o, 41), composer, 6);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oO000Oo(vipActivity, oooOO1, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOo(o00O00o0 o00o00o1, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(578621191);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o00o00o1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.user_ka_vip_background_3, ooo00oOooOOo), null, o00o00o1.OooO00o(SizeKt.OooO0o(o00OOOO0.OooO00o.f4198Oooo0o), o00OO0O0.OooO00o.f4170OooO), null, o0O0O00.OooOO0.OooO00o.f35242OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 24632, 104);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(o00o00o1, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @Override // com.yalla.yalla.ui.activity.BaseComposeActivity
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOo0(@Nullable oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-1608266631);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(oooO00o, o0000O0.f41729Oooo0o0, o000O0Oo.f32099OooO00o);
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r7 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r7);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r3);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r16 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r16, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5741OooO00o;
        o0oOOo o0ooooOooO0O0 = oo00oO.OooO0O0(composer, 0);
        OooOOo(boxScopeInstance, composer, 70);
        composer.OooO0o0(-483455358);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(oooO00o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r7, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r16, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        ContentState contentState = (ContentState) this.f23573OoooO0O.getValue();
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o0O000O o0o000o = new o0O000O(true);
        oooO00o.OooOOoo(o0o000o);
        o0O000o0.OooO0Oo(contentState, o0o000o, null, null, null, new o000oOoO(), o00O0000.OooO00o(composer, 2138497177, new o0OoOo0(o0ooooOooO0O0, this)), composer, 1572864, 28);
        OooOo0(composer, 8);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        OooOo00(o0ooooOooO0O0, composer, 64);
        OooOo0o(boxScopeInstance, composer, 70);
        OooOo(composer, 8);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00O0O(i));
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r21v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOoo(final VipModel vipModel, oOO00O ooo00o, int i) {
        int i2;
        oOO00O composer = ooo00o.OooOOo(-894304267);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
        composer.OooO0o0(733328855);
        o00OO0OO alignment = o00OO0O0.OooO00o.f4172OooO0O0;
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(alignment, false, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0o0);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r10 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r10);
        ?? r1 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r1);
        ?? r7 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r7);
        ?? r21 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r21, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        int currentExperience = Oooo000().getPersonalKaVipModel().getCurrentExperience() <= 0 ? 0 : Oooo000().getPersonalKaVipModel().getCurrentExperience();
        float leftExperience = currentExperience / (Oooo000().getPersonalKaVipModel().getLeftExperience() + currentExperience);
        float f = 230;
        final float f2 = leftExperience * f;
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        float f3 = 15;
        o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, f3, 115, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12);
        Intrinsics.checkNotNullParameter(o00oooo0OooO, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o00OOOO0 o00oooo0OooOOoo = o00oooo0OooO.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false));
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooOOoo);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r10, composer, oooO2, r1, composer, layoutDirection2, r7, composer, o00ooooo3, r21, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        int i3 = 2;
        o00OOOO0 o00oooo0OooOO0o = SizeKt.OooOO0o(SizeKt.OooO0oO(p442o0OoOo0.Oooo000.OooO00o(oooO00o, p033OoooO00.o00O0O.OooO0OO(2)), 5), f);
        long jOooOooo = OooOooo(vipModel.getKaVipLv());
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        p031OoooO.oo0o0Oo.OooO0O0(leftExperience, o00oooo0OooOO0o, o0000O0.f41693OooO0OO, jOooOooo, composer, 384, 0);
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("VIP");
        int i4 = o0Oo0oo.$EnumSwitchMapping$0[VipLevel.INSTANCE.OooO0O0(Oooo000().getPersonalKaVipModel().getKaVIPLv()).ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                i3 = 3;
            } else if (i4 != 3) {
                i3 = (i4 == 4 || i4 == 5) ? 5 : 1;
            } else {
                i3 = 4;
            }
        }
        sbOooO0o0.append(i3);
        o000O0O0.OooO0OO(sbOooO0o0.toString(), PaddingKt.OooO(oooO00o, 4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), OooOooo(vipModel.getKaVipLv()), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, null, 0L, 0, false, 0, null, null, composer, 3120, 0, 65392);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        o00OOOO0 o00oooo0OooO0o1 = SizeKt.OooO0o0(oooO00o);
        composer.OooO0o0(-270267587);
        composer.OooO0o0(-3687241);
        Object objOooO0o = composer.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = new o0000OO.o000OOo();
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        final o0000OO.o000OOo o000ooo2 = (o0000OO.o000OOo) objOooO0o;
        composer.OooO0o0(-3687241);
        Object objOooO0o2 = composer.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = new ConstraintLayoutScope();
            composer.Oooo00o(objOooO0o2);
        }
        composer.Oooo0o0();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objOooO0o2;
        composer.OooO0o0(-3687241);
        Object objOooO0o3 = composer.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = o0OOO00.OooO0Oo(Boolean.FALSE);
            composer.Oooo00o(objOooO0o3);
        }
        composer.Oooo0o0();
        Pair pairOooO0O0 = o0000OO.Oooo000.OooO0O0(constraintLayoutScope, (o0O00OO) objOooO0o3, o000ooo2, composer);
        o000000 o000000Var = (o000000) pairOooO0O0.component1();
        final Function0 function4 = (Function0) pairOooO0O0.component2();
        o0O0O00.o00Oo0.OooO00o(SemanticsModifierKt.OooO00o(o00oooo0OooO0o1, false, new Function1<o00000O0.o0OO00O, Unit>() { // from class: com.yalla.yalla.ui.activity.user.VipActivity$ExperienceProgressBar$lambda-19$$inlined$ConstraintLayout$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o0OO00O o0oo00o2) {
                o0OO00O semantics = o0oo00o2;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                o00000O0.OooO00o(semantics, o000ooo2);
                return Unit.INSTANCE;
            }
        }), o00O0000.OooO00o(composer, -819894182, new Function2<oOO00O, Integer, Unit>() { // from class: com.yalla.yalla.ui.activity.user.VipActivity$ExperienceProgressBar$lambda-19$$inlined$ConstraintLayout$2

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ int f23579Oooo0o = 6;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(oOO00O ooo00o2, Integer num) {
                String string;
                VipActivity$ExperienceProgressBar$lambda19$$inlined$ConstraintLayout$2 vipActivity$ExperienceProgressBar$lambda19$$inlined$ConstraintLayout$2 = this;
                oOO00O ooo00o3 = ooo00o2;
                if (((num.intValue() & 11) ^ 2) == 0 && ooo00o3.OooOo0()) {
                    ooo00o3.OooOoo0();
                } else {
                    Objects.requireNonNull(constraintLayoutScope);
                    constraintLayoutScope.OooO0Oo();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    int i5 = ((vipActivity$ExperienceProgressBar$lambda19$$inlined$ConstraintLayout$2.f23579Oooo0o >> 3) & 112) | 8;
                    if ((i5 & 14) == 0) {
                        i5 |= ooo00o3.Oooo0oo(constraintLayoutScope2) ? 4 : 2;
                    }
                    if ((i5 & 91) == 18 && ooo00o3.OooOo0()) {
                        ooo00o3.OooOoo0();
                    } else {
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        o0000OO.OooOO0O oooOO0OOooO00o = oooO00oOooO0OO.OooO00o();
                        o0000OO.OooOO0O oooOO0OOooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0000OO.OooOO0O oooOO0OOooO0OO = oooO00oOooO0OO.OooO0OO();
                        VipActivity vipActivity = this;
                        int kaVipLv = vipModel.getKaVipLv();
                        VipActivity.OooO0O0 oooO0O1 = VipActivity.f23570OoooOOo;
                        long jOooOooO = vipActivity.OooOooO(kaVipLv);
                        ooo00o3.OooO0o0(-492369756);
                        Object objOooO0o4 = ooo00o3.OooO0o();
                        oOO00O.OooO00o.C0323OooO00o c0323OooO00o2 = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0o4 == c0323OooO00o2) {
                            objOooO0o4 = o0OOO00.OooO0Oo(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                            ooo00o3.Oooo00o(objOooO0o4);
                        }
                        ooo00o3.Oooo0o0();
                        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o4;
                        float f4 = 3;
                        float fMax = Math.max(((f2 + 15) - ((o0000O0O.OooO) ooo00o3.OooOO0o(o000.f6356OooO0o0)).OoooOO0(((Number) o0o00oo2.getValue()).floatValue())) - f4, 2);
                        if (this.Oooo000().getPersonalKaVipModel().getCurrentExperience() >= 0) {
                            string = p522o0o0O0o.o00O0.OooO0O0(String.valueOf(this.Oooo000().getPersonalKaVipModel().getCurrentExperience()));
                        } else {
                            StringBuilder sbOooO00o = o00O0O0O.OooO00o('-');
                            sbOooO00o.append(p522o0o0O0o.o00O0.OooO0O0(String.valueOf(Math.abs(this.Oooo000().getPersonalKaVipModel().getCurrentExperience()))));
                            string = sbOooO00o.toString();
                        }
                        String str = string;
                        o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        o0000O0O.OooOOO0 oooOOO0 = new o0000O0O.OooOOO0(fMax);
                        ooo00o3.OooO0o0(511388516);
                        boolean zOooo0oo = ooo00o3.Oooo0oo(oooOOO0) | ooo00o3.Oooo0oo(oooOO0OOooO0O0);
                        Object objOooO0o5 = ooo00o3.OooO0o();
                        if (zOooo0oo || objOooO0o5 == c0323OooO00o2) {
                            objOooO0o5 = new VipActivity.OooO0OO(oooOO0OOooO0O0, fMax);
                            ooo00o3.Oooo00o(objOooO0o5);
                        }
                        ooo00o3.Oooo0o0();
                        o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(SizeKt.OooOOO0(BackgroundKt.OooO0O0(p442o0OoOo0.Oooo000.OooO00o(constraintLayoutScope2.OooO00o(oooO00o2, oooOO0OOooO00o, (Function1) objOooO0o5), o00O0O.f3431OooO00o), jOooOooO, o000O0Oo.f32099OooO00o), 22, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                        ooo00o3.OooO0o0(1157296644);
                        boolean zOooo0oo2 = ooo00o3.Oooo0oo(o0o00oo2);
                        Object objOooO0o6 = ooo00o3.OooO0o();
                        if (zOooo0oo2 || objOooO0o6 == c0323OooO00o2) {
                            objOooO0o6 = new VipActivity.OooO0o(o0o00oo2);
                            ooo00o3.Oooo00o(objOooO0o6);
                        }
                        ooo00o3.Oooo0o0();
                        o00OOOO0 o00oooo0OooO00o = OnRemeasuredModifierKt.OooO00o(o00oooo0OooO0oO, (Function1) objOooO0o6);
                        o0000O0 o0000o2 = o0000O0.f41691OooO00o;
                        o000O0O0.OooO0OO(str, o00oooo0OooO00o, o0000O0.f41690OooO, o00Oo0.OooO0OO(10), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 1, null, null, ooo00o3, 3456, 3072, 56816);
                        ooo00o3.OooO0o0(1157296644);
                        boolean zOooo0oo3 = ooo00o3.Oooo0oo(oooOO0OOooO0OO);
                        Object objOooO0o7 = ooo00o3.OooO0o();
                        if (zOooo0oo3 || objOooO0o7 == c0323OooO00o2) {
                            objOooO0o7 = new VipActivity.OooO(oooOO0OOooO0OO);
                            ooo00o3.Oooo00o(objOooO0o7);
                        }
                        ooo00o3.Oooo0o0();
                        o00OOOO0 o00oooo0OooO00o2 = constraintLayoutScope2.OooO00o(oooO00o2, oooOO0OOooO0O0, (Function1) objOooO0o7);
                        p145o00Oo0.o00000O0 o00000o1 = new p145o00Oo0.o00000O0(jOooOooO);
                        ooo00o3.OooO0o0(1157296644);
                        boolean zOooo0oo4 = ooo00o3.Oooo0oo(o00000o1);
                        Object objOooO0o8 = ooo00o3.OooO0o();
                        if (zOooo0oo4 || objOooO0o8 == c0323OooO00o2) {
                            objOooO0o8 = new VipActivity.OooOO0(jOooOooO);
                            ooo00o3.Oooo00o(objOooO0o8);
                        }
                        ooo00o3.Oooo0o0();
                        o000oOoO.OooO00o(o00oooo0OooO00o2, (Function1) objOooO0o8, ooo00o3, 0);
                        o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.drawable.user_ka_vip_exp, ooo00o3);
                        o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(oooO00o2, 30);
                        vipActivity$ExperienceProgressBar$lambda19$$inlined$ConstraintLayout$2 = this;
                        o0000O0O.OooOOO0 oooOOO1 = new o0000O0O.OooOOO0(f2);
                        ooo00o3.OooO0o0(1157296644);
                        boolean zOooo0oo5 = ooo00o3.Oooo0oo(oooOOO1);
                        Object objOooO0o9 = ooo00o3.OooO0o();
                        if (zOooo0oo5 || objOooO0o9 == c0323OooO00o2) {
                            objOooO0o9 = new VipActivity.OooOO0O(f2);
                            ooo00o3.Oooo00o(objOooO0o9);
                        }
                        ooo00o3.Oooo0o0();
                        Oooo0.o00.OooO00o(o000oo0oOooO00o, null, constraintLayoutScope2.OooO00o(o00oooo0OooOO0, oooOO0OOooO0OO, (Function1) objOooO0o9), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00o3, 56, 120);
                    }
                    Objects.requireNonNull(constraintLayoutScope);
                }
                return Unit.INSTANCE;
            }
        }), o000000Var, composer, 48, 0);
        composer.Oooo0o0();
        StringBuilder sb = new StringBuilder();
        int kaVIPLv = Oooo000().getPersonalKaVipModel().getKaVIPLv();
        VipLevel vipLevel = VipLevel.Vip5;
        if (kaVIPLv != vipLevel.getValue() || Oooo000().getPersonalKaVipModel().getLeftExperience() > 0) {
            i2 = Oooo000().getPersonalKaVipModel().getKaVIPLv() == vipLevel.getValue() ? R.string.user_ka_vip_level_keep : R.string.user_ka_vip_exp_level_up;
        } else {
            i2 = R.string.user_ka_vip_exp_level_full;
        }
        String strOooO00o = p058o0000OoO.OooO.OooO00o(sb, com.yalla.support.common.util.OooOo.OooO00o(o00000.OooO0OO.OooO00o(i2, composer), p522o0o0O0o.o00O0.OooO0O0(String.valueOf(Oooo000().getPersonalKaVipModel().getLeftExperience()))), " >");
        long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(12);
        long jOooOooo2 = OooOooo(vipModel.getKaVipLv());
        o00OOOO0 o00oooo0OooO2 = PaddingKt.OooO(oooO00o, f3, 132, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 8);
        Intrinsics.checkNotNullParameter(o00oooo0OooO2, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        o000O0O0.OooO0OO(strOooO00o, ClickableKt.OooO0Oo(o00oooo0OooO2.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false)), false, new OooOOO0(), 7), jOooOooo2, jOooO0OO, null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65392);
        oo0ooO oo0oooOooO00o = p032OoooO0.oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new OooOOO(vipModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOo(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1684889696);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        boolean zOooO00o = p516o0o0O000.Oooo000.OooO00o(this, "com.whatsapp");
        o0O0oo0o.OooO0Oo(this.f23576o000oOoO, null, zOooO00o ? p558o0oOOoo.oo0o0O0.OooO00o(ooo00oOooOOo, -456429112, R.string.user_ka_vip_open_whatsapp, ooo00oOooOOo) : p558o0oOOoo.oo0o0O0.OooO00o(ooo00oOooOOo, -456429044, R.string.user_ka_vip_open_market, ooo00oOooOOo), null, false, false, null, null, zOooO00o ? p558o0oOOoo.oo0o0O0.OooO00o(ooo00oOooOOo, -456428945, R.string.OK, ooo00oOooOOo) : p558o0oOOoo.oo0o0O0.OooO00o(ooo00oOooOOo, -456428900, R.string.user_ka_vip_open_market_download, ooo00oOooOOo), false, null, false, new o00oO0o(zOooO00o, this), null, false, null, o0ooOOo.f23620Oooo0o, null, null, ooo00oOooOOo, 0, 1572864, 454394);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o0OOO0o(i));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOo0(@Nullable oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(2049307113);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (Oooo000().getPersonalKaVipModel().getKaVIPState() != VipState.NotVip.getValue()) {
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0Oo = ClickableKt.OooO0Oo(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), 55), false, new OooOo(), 7);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO0O0 = p139o00OOOo0.o0O0O00.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2033OooO0o, oooO0O0, composer, -1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0Oo);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO0O0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            o000OO0O o000oo0oOooO00o = com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.user_ka_vip_contact_yalla, composer);
            o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(oooO00o, 16);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            long j = o0000O0.f41697OooO0oO;
            p031OoooO.o0OOO0o.OooO00o(o000oo0oOooO00o, null, o00oooo0OooOO0, j, composer, 3512, 0);
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, 4), composer, 6);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.user_ka_vip_contact_yalla, composer), null, j, o0000O0O.o00Oo0.OooO0OO(12), null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), o0000O0.OooO.f27247OooO0Oo, null, 0L, 0, false, 0, null, null, composer, 100666752, 0, 65138);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new Oooo000(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOo00(o0oOOo o0oooo2, oOO00O ooo00o, int i) {
        long j;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1266447757);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        String strOooO00o = o00000.OooO0OO.OooO00o(R.string.user_ka_vip_title, ooo00oOooOOo);
        Function0<Unit> function0 = this.f21689Oooo0oo;
        if (o0oooo2.OooO0o0() > 118) {
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            j = o0000O0.f41729Oooo0o0;
        } else {
            o0000O0 o0000o2 = o0000O0.f41691OooO00o;
            j = o0000O0.f41692OooO0O0;
        }
        o00O0OO.OooO00o(strOooO00o, 0L, 0, function0, null, o00O0000.OooO00o(ooo00oOooOOo, 2022260906, new OooOOOO()), j, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, ooo00oOooOOo, 196608, 0, 1942);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOo00(o0oooo2, i));
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOo0O(VipModel vipModel, oOO00O ooo00o, int i) {
        long j;
        oOO00O composer = ooo00o.OooOOo(1343623735);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        int i2 = o0Oo0oo.$EnumSwitchMapping$0[VipLevel.INSTANCE.OooO0O0(vipModel.getKaVipLv()).ordinal()];
        if (i2 == 1) {
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            j = o0000O0.f41734OoooO00;
        } else if (i2 == 2) {
            o0000O0 o0000o2 = o0000O0.f41691OooO00o;
            j = o0000O0.f41735OoooO0O;
        } else if (i2 == 3) {
            o0000O0 o0000o3 = o0000O0.f41691OooO00o;
            j = o0000O0.f41733OoooO0;
        } else if (i2 == 4) {
            o0000O0 o0000o4 = o0000O0.f41691OooO00o;
            j = o0000O0.f41732OoooO;
        } else if (i2 != 5) {
            o0000O0 o0000o5 = o0000O0.f41691OooO00o;
            j = o0000O0.f41734OoooO00;
        } else {
            o0000O0 o0000o6 = o0000O0.f41691OooO00o;
            j = o0000O0.f41794o000oOoO;
        }
        long j2 = j;
        int privilegeCount = vipModel.getPrivilegeCount();
        List<ItemVipModel> privilegeData = vipModel.getPrivilegeData();
        int size = privilegeData != null ? privilegeData.size() : 0;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO0O0 = p139o00OOOo0.o0O0O00.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2033OooO0o, o00OO0O0.OooO00o.f4181OooOO0o, composer, -1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        oO00000o.OooO0O0(composer, o000000VarOooO0O0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        float f = 51;
        float f2 = (float) 12.5d;
        p031OoooO.o0OOO0o.OooO00o(o00000.OooO0O0.OooO00o(p168o00Ooo0.oo000o.OooO0o0() ? R.drawable.user_ka_vip_privilege_right : R.drawable.user_ka_vip_privilege_left, composer), null, SizeKt.OooO0oO(SizeKt.OooOO0o(oooO00o, f), f2), j2, composer, 440, 0);
        float f3 = (float) 7.5d;
        int i3 = size;
        o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.user_ka_vip_privilege_title, composer), PaddingKt.OooO(oooO00o, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10), j2, o0000O0O.o00Oo0.OooO0OO(15), null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, null, 0L, 2, false, 1, null, null, composer, 3120, 3120, 55152);
        p031OoooO.o0OOO0o.OooO00o(o00000.OooO0O0.OooO00o(p168o00Ooo0.oo000o.OooO0o0() ? R.drawable.user_ka_vip_privilege_left : R.drawable.user_ka_vip_privilege_right, composer), null, SizeKt.OooO0oO(SizeKt.OooOO0o(oooO00o, f), f2), j2, composer, 440, 0);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(privilegeCount);
        sb.append('/');
        sb.append(i3);
        sb.append(')');
        o000O0O0.OooO0OO(sb.toString(), SizeKt.OooO0o(PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13)), j2, o0000O0O.o00Oo0.OooO0OO(13), null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 3120, 0, 64880);
        o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, 24), composer, 6);
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new Oooo0(vipModel, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOo0o(@NotNull o00O00o0 o00o00o1, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(o00o00o1, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1545026838);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (((Boolean) this.f23574OoooOO0.getValue()).booleanValue()) {
            o0000OO0.OooO0OO.OooO00o(new o00Oo0(), null, o00O0000.OooO00o(ooo00oOooOOo, -106355044, new o00Ooo(o00o00o1, this)), ooo00oOooOOo, 384, 2);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo000o(o00o00o1, i));
    }

    public final long OooOooO(int i) {
        int i2 = o0Oo0oo.$EnumSwitchMapping$0[VipLevel.INSTANCE.OooO0O0(i).ordinal()];
        if (i2 == 1) {
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            return o0000O0.f41806o0OoOo0;
        }
        if (i2 == 2) {
            o0000O0 o0000o2 = o0000O0.f41691OooO00o;
            return o0000O0.f41812ooOO;
        }
        if (i2 == 3) {
            o0000O0 o0000o3 = o0000O0.f41691OooO00o;
            return o0000O0.f41795o00O0O;
        }
        if (i2 == 4) {
            o0000O0 o0000o4 = o0000O0.f41691OooO00o;
            return o0000O0.f41796o00Oo0;
        }
        if (i2 != 5) {
            o0000O0 o0000o5 = o0000O0.f41691OooO00o;
            return o0000O0.f41806o0OoOo0;
        }
        o0000O0 o0000o6 = o0000O0.f41691OooO00o;
        return o0000O0.f41797o00Ooo;
    }

    public final long OooOooo(int i) {
        int i2 = o0Oo0oo.$EnumSwitchMapping$0[VipLevel.INSTANCE.OooO0O0(i).ordinal()];
        if (i2 == 1) {
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            return o0000O0.f41737OoooOOO;
        }
        if (i2 == 2) {
            o0000O0 o0000o2 = o0000O0.f41691OooO00o;
            return o0000O0.f41738OoooOOo;
        }
        if (i2 == 3) {
            o0000O0 o0000o3 = o0000O0.f41691OooO00o;
            return o0000O0.f41739OoooOo0;
        }
        if (i2 == 4) {
            o0000O0 o0000o4 = o0000O0.f41691OooO00o;
            return o0000O0.f41742Ooooo00;
        }
        if (i2 != 5) {
            o0000O0 o0000o5 = o0000O0.f41691OooO00o;
            return o0000O0.f41737OoooOOO;
        }
        o0000O0 o0000o6 = o0000O0.f41691OooO00o;
        return o0000O0.f41740OoooOoO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VipVM Oooo000() {
        return (VipVM) this.f23572OoooO0.getValue();
    }

    public final void Oooo00O() {
        this.f23573OoooO0O.setValue(ContentState.Loading);
        Oooo000().loadKaVipModel().observe(this, new o0o0000.OooOo(new o0OO00O(), new oo0o0Oo(), null, false, 12));
    }

    @Override // com.yalla.yalla.ui.activity.BaseComposeActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p478o0OooooO.oO0OoOO0.OooO0Oo(window, 0);
        Oooo00O();
        LiveEventBus.get("KA_VIP_SHOW_PREMIUM_FIRST").observe(this, new oO000(this, 0));
        LiveEventBus.get("KA_VIP_INVISIBLE_ISITOR").observe(this, new o0O00o0(this, 3));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        p497o0o00Oo.OooOOO0.OooOO0O().OooOO0o();
        p497o0o00Oo.OooOOO0.OooOO0O().OooOOO0();
        p497o0o00Oo.OooOOO0.OooOO0O().OooOOO();
    }
}
