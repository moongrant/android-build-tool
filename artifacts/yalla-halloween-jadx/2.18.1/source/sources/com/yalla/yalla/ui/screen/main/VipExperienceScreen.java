package com.yalla.yalla.ui.screen.main;

import Oooo000.OooO0o;
import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.paging.compose.OooOO0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.VipExperienceDetailModel;
import com.yalla.yalla.ui.vm.room.VipVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.Oooo000;
import p027Oooo0o.o000O00O;
import p027Oooo0o.o000OO0O;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0O0OOO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p053o00000oO.o0000O00;
import p074o000O0oo.OooOOO;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o000O0Oo;
import p259o00ooOo.o0O00O;
import p261o00ooOoO.u;
import p507o0o00oOO.o0000O0;
import p522o0o0O0o.o00O0;
import p571o0oOo0o.o00O0OO;
import p584o0oOoo.o0000O;
import p584o0oOoo.o000OO00;
import p593o0oOooo0.o0O000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class VipExperienceScreen extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final VipExperienceScreen f24691OooO00o = new VipExperienceScreen();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/screen/main/VipExperienceScreen$ExperienceType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "RechargeCoin", "BuyMembership", "BuyRoomLock", "CoinReimburse", "AristocracyReimburse", "RoomLockReimburse", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum ExperienceType {
        RechargeCoin(1),
        BuyMembership(2),
        BuyRoomLock(3),
        CoinReimburse(4),
        AristocracyReimburse(5),
        RoomLockReimburse(6);

        private int value;

        ExperienceType(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f24693Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f24694Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f24693Oooo0oO = o00o0o01;
            this.f24694Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            VipExperienceScreen.this.OooO00o(this.f24693Oooo0oO, ooo00o, this.f24694Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O00O f24695Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ androidx.paging.compose.OooO0OO<VipExperienceDetailModel> f24696Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000O00O o000o00o2, androidx.paging.compose.OooO0OO<VipExperienceDetailModel> oooO0OO) {
            super(3);
            this.f24695Oooo0o = o000o00o2;
            this.f24696Oooo0oO = oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 RefreshContentStatus = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                Oooo000.OooO00o(SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), this.f24695Oooo0o, null, false, null, null, null, false, new com.yalla.yalla.ui.screen.main.OooO00o(this.f24696Oooo0oO), ooo00o2, 6, 252);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f24698Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f24698Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            VipExperienceScreen.this.OooO0o0(ooo00o, this.f24698Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v14, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r5v8, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O composer = ooo00o.OooOOo(-1527366625);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Bundle bundleOooO0O0 = o000OO00.OooO0O0((NavBackStackEntry) composer.OooOO0o(o000OO00.f46954OooO00o), composer);
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(bundleOooO0O0);
            Object objOooO0o = composer.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = Integer.valueOf(bundleOooO0O0.getInt("key"));
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            int iIntValue = ((Number) objOooO0o).intValue();
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(oooO00o, u.OooO0O0(composer).OooOo00(), o000O0Oo.f32099OooO00o);
            composer.OooO0o0(733328855);
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<OooO> o0o0o0o0 = o000.f6356OooO0o0;
            OooO oooO = (OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r3);
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r4);
            ?? r5 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r5);
            ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, r17, composer, "composer", composer), composer, 0);
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -2137368960, R.drawable.user_ka_vip_experience_bg, composer), null, SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), 265), o00OO0O0.OooO00o.f4173OooO0OO, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 3512, 112);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO2 = (OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
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
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r3, composer, oooO2, r4, composer, layoutDirection2, r5, composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
            String strOooO00o = OooOOO.OooO00o(composer, 2058660585, -1163856341, R.string.user_ka_vip_experience_title, composer);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o00O0OO.OooO00o(strOooO00o, 0L, 0, null, null, null, o0000O0.f41692OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, composer, 1572864, 0, 1982);
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, 28), composer, 6);
            Integer numValueOf = Integer.valueOf(iIntValue);
            composer.OooO0o0(1157296644);
            boolean zOooo0oo2 = composer.Oooo0oo(numValueOf);
            Object objOooO0o2 = composer.OooO0o();
            if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o2 = o00O0.OooO0O0(String.valueOf(Math.abs(iIntValue)));
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            String str = (String) objOooO0o2;
            if (iIntValue < 0) {
                str = '-' + str;
            }
            long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(38);
            long j = o0000O0.f41693OooO0OO;
            o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, 15, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14);
            o0000O00.OooO00o oooO00o2 = o0000O00.f27125Oooo0oO;
            o000O0O0.OooO0OO(str, o00oooo0OooO, j, jOooO0OO, null, o0000O00.f27131OoooOO0, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 200112, 0, 65488);
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, 26), composer, 6);
            f24691OooO00o.OooO0o0(composer, 6);
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
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(o00o0o01, i));
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        oOO00O composer = ooo00o.OooOOo(1517881408);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            composer.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(VipVM.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            VipVM vipVM = (VipVM) viewModel;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            float f = 14;
            o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooO0o0(p442o0OoOo0.Oooo000.OooO00o(PaddingKt.OooO0oO(oooO00o, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), o00O0O.OooO0o0(f, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12))), u.OooO0O0(composer).OooOO0O(), o000O0Oo.f32099OooO00o);
            composer.OooO0o0(733328855);
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            androidx.paging.compose.OooO0OO oooO0OOOooO00o = OooOO0.OooO00o(vipVM.getExperienceDetailsFlow().f48686OooO0oo, composer);
            o000O00O o000o00oOooO00o = o000OO0O.OooO00o(composer);
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
            o0O000 o0o001 = o0O000.f47424OooO00o;
            o0O00O.OooO00o(oooO0OOOooO00o, o00oooo0OooO0o0, o000o00oOooO00o, null, null, o0O000.f47425OooO0O0, null, o00O0000.OooO00o(composer, -122325505, new OooO0O0(o000o00oOooO00o, oooO0OOOooO00o)), composer, 12779576, 88);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(i));
    }
}
