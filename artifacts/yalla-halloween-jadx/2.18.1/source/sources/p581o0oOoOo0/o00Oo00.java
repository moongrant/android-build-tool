package p581o0oOoOo0;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.ui.vm.moment.MomentDetailVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
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
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0O0OOO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000Oo0;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
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
import p145o00Oo0.o00000OO;
import p145o00Oo0.o000O0Oo;
import p254o00ooO0O.o000O0O0;
import p261o00ooOoO.u;
import p263o00ooo.o000OO0O;
import p578o0oOoOOO.oO0O000;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo00 {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46747Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f46747Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f46747Oooo0o;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46748Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(0);
            this.f46748Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f46748Oooo0o;
            if (function0 != null) {
                function0.invoke();
            }
            ToastUtil.f12567OooO00o.OooO0O0("Follow");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46749Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function0<Unit> function0) {
            super(0);
            this.f46749Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f46749Oooo0o;
            if (function0 != null) {
                function0.invoke();
            }
            ToastUtil.f12567OooO00o.OooO0O0("More");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46750Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailVM f46751Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46752Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46753Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f46754OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f46755OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentDetailVM momentDetailVM, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, int i, int i2) {
            super(2);
            this.f46751Oooo0o = momentDetailVM;
            this.f46752Oooo0oO = function0;
            this.f46753Oooo0oo = function1;
            this.f46750Oooo = function2;
            this.f46755OoooO00 = i;
            this.f46754OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo00.OooO00o(this.f46751Oooo0o, this.f46752Oooo0oO, this.f46753Oooo0oo, this.f46750Oooo, ooo00o, this.f46755OoooO00 | 1, this.f46754OoooO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r20v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v8, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull MomentDetailVM vm, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable oOO00O ooo00o, int i, int i2) {
        Function0<o000000.OooO00o> function3;
        int i3;
        Function0<o000000.OooO00o> function4;
        int i4;
        Function0<o000000.OooO00o> function5;
        int i5;
        int i6;
        o00OOOO0.OooO00o oooO00o;
        Function0<Unit> function6;
        int i7;
        Intrinsics.checkNotNullParameter(vm, "vm");
        oOO00O composer = ooo00o.OooOOo(-104125266);
        Function0<Unit> function7 = (i2 & 2) != 0 ? null : function0;
        Function0<Unit> function8 = (i2 & 4) != 0 ? null : function1;
        Function0<Unit> function9 = (i2 & 8) != 0 ? null : function2;
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function10 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooO0o(oooO00o2), o00000OO.OooO0O0(-1), o000O0Oo.f32099OooO00o);
        composer.OooO0o0(1157296644);
        boolean zOooo0oo = composer.Oooo0oo(function7);
        Object objOooO0o = composer.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new OooO00o(function7);
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        o00OOOO0 o00oooo0OooO0Oo = ClickableKt.OooO0Oo(o00oooo0OooO0O0, false, (Function0) objOooO0o, 7);
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        Oooo0o0.o00O000.OooOOOO oooOOOO = p028Oooo0o0.o00O000.f2030OooO0O0;
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4180OooOO0O;
        o000000 o000000VarOooO00o = o0O00o00.OooO00o(oooOOOO, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<OooO> o0o0o0o0 = o000.f6356OooO0o0;
        OooO oooO = (OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function11 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0Oo);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function11);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r9 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO00o, r9);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r3);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r20 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r20, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f5758OooO00o;
        o0oOO o0ooo2 = o0oOO.f46756OooO00o;
        Function0<Unit> function12 = function7;
        Function0<Unit> function13 = function8;
        o0ooo2.OooO0OO(CloudImageUtilKt.imgFormat(vm.getMomentDetailModel().getHeadUrl()), SizeKt.OooOOO0(SizeKt.OooO0oo(oooO00o2, 65, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), 62, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), vm.isShowHot(), vm.isShowTopIn(), vm.isShowRoleOfficial(), composer, 196656);
        float f = 10;
        o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(rowScopeInstance.OooO00o(PaddingKt.OooO(oooO00o2, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), false));
        o00OO0OO.OooO00o oooO00o3 = o00OO0O0.OooO00o.f4182OooOOO;
        Oooo0o0.o00O000.OooOo00 oooOo00 = p028Oooo0o0.o00O000.f2032OooO0Oo;
        composer.OooO0o0(-483455358);
        o000000 o000000VarOooO00o2 = oo00o.OooO00o(oooOo00, oooO00o3, composer);
        composer.OooO0o0(-1323940314);
        OooO oooO2 = (OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function11);
        } else {
            composer.Oooo00O();
        }
        Function0<Unit> function14 = function9;
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r9, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r20, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        o00OOOO0 o00oooo0OooO0o2 = SizeKt.OooO0o(PaddingKt.OooO(oooO00o2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13));
        o00OO0OO.OooO0O0 oooO0O1 = o00OO0O0.OooO00o.f4181OooOO0o;
        o000000 o000000VarOooO00o3 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O1, composer, -1323940314);
        OooO oooO3 = (OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Oo0.OooO0O0(o00oooo0OooO0o2);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            function3 = function11;
            composer.OooOoO0(function3);
        } else {
            function3 = function11;
            composer.Oooo00O();
        }
        Function0<o000000.OooO00o> function15 = function3;
        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r9, composer, oooO3, r3, composer, layoutDirection3, r4, composer, o00ooooo4, r20, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        composer.OooO0o0(-646252461);
        if (vm.isShowIdentity()) {
            i3 = 5;
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.ic_topic_owner, composer), null, SizeKt.OooOO0(PaddingKt.OooO(oooO00o2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), 15), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
        } else {
            i3 = 5;
        }
        composer.Oooo0o0();
        oO0O000 oo0o000 = oO0O000.f45783OooO00o;
        String nickName = vm.getMomentDetailModel().getNickName();
        if (nickName == null) {
            nickName = "";
        }
        float f2 = i3;
        oo0o000.OooO0oO(nickName, 0L, 0L, 0, 0, PaddingKt.OooO(SizeKt.OooOOO(rowScopeInstance.OooO00o(SizeKt.OooOOOo(oooO00o3, 2), false)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), composer, 1572864, 30);
        o0ooo2.OooO0oO(oooO00o2, Integer.valueOf(vm.getMomentDetailModel().getSex()), composer, 390, 0);
        o0ooo2.OooO0O0(oooO00o2, null, o0000O0O.o00Oo0.OooO0OO(10), 0L, 0L, null, composer, 1573254, 58);
        o0O0OO0.OooO00o(composer);
        float f3 = 1;
        o00OOOO0 o00oooo0OooO0o3 = SizeKt.OooO0o(PaddingKt.OooO(oooO00o2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13));
        o000000 o000000VarOooO00o4 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O1, composer, -1323940314);
        OooO oooO4 = (OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection4 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo5 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O3 = o00Oo0.OooO0O0(o00oooo0OooO0o3);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            function4 = function15;
            composer.OooOoO0(function4);
        } else {
            function4 = function15;
            composer.Oooo00O();
        }
        Function0<o000000.OooO00o> function16 = function4;
        ((o00) function3OooO0O3).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o4, r9, composer, oooO4, r3, composer, layoutDirection4, r4, composer, o00ooooo5, r20, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        o0ooo2.OooO0oo(SizeKt.OooOOOo(null, 3), o00O0.f48624OooO00o.OooO0Oo(vm.getMomentDetailModel().getCreateTime(), System.currentTimeMillis()) + " • ", o0000O0O.o00Oo0.OooO0OO(11), u.OooO0O0(composer).OooO(), 0, 0, composer, 1573254, 48);
        composer.OooO0o0(-646250580);
        if (vm.isShowPower()) {
            i4 = 3;
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icon_authority_open, composer), null, SizeKt.OooOO0(SizeKt.OooOOOo(null, 3), 13), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
        } else {
            i4 = 3;
        }
        composer.Oooo0o0();
        composer.OooO0o0(-1846808417);
        if (vm.isShowYallaTeam()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(" • ");
            sbOooO0o0.append(o000O0O0.OooO0OO(R.string.MessageFragment_item_YallaTeam));
            o0ooo2.OooOO0O(SizeKt.OooOOOo(null, i4), sbOooO0o0.toString(), o0000O0O.o00Oo0.OooO0OO(11), u.OooO0O0(composer).OooO(), 0, 0, composer, 1573254, 48);
        }
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        o00OOOO0 o00oooo0OooO0o4 = SizeKt.OooO0o(PaddingKt.OooO(oooO00o2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13));
        o000000 o000000VarOooO00o5 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O1, composer, -1323940314);
        OooO oooO5 = (OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection5 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo6 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O4 = o00Oo0.OooO0O0(o00oooo0OooO0o4);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            function5 = function16;
            composer.OooOoO0(function5);
        } else {
            function5 = function16;
            composer.Oooo00O();
        }
        Function0<o000000.OooO00o> function17 = function5;
        ((o00) function3OooO0O4).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o5, r9, composer, oooO5, r3, composer, layoutDirection5, r4, composer, o00ooooo6, r20, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        composer.OooO0o0(-646249464);
        if (vm.isShowVip()) {
            i5 = 18;
            o0ooo2.OooO(SizeKt.OooOO0(PaddingKt.OooO(oooO00o2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), 18), false, null, Integer.valueOf(vm.getMomentDetailModel().getIsVIP() ? 1 : 0), Integer.valueOf(vm.getMomentDetailModel().getNVipLv()), composer, 196662, 4);
        } else {
            i5 = 18;
        }
        composer.Oooo0o0();
        composer.OooO0o0(-646248991);
        if (vm.isShowKaVip()) {
            i6 = 5;
            o0ooo2.OooO0o0(SizeKt.OooOO0(PaddingKt.OooO(oooO00o2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), i5), true, VipLevel.Vip3, composer, 3510, 0);
        } else {
            i6 = 5;
        }
        composer.Oooo0o0();
        composer.OooO0o0(-38159200);
        if (vm.isShowMedal()) {
            float f4 = i6;
            float f5 = i5;
            o0ooo2.OooO0o(SizeKt.OooOO0(PaddingKt.OooO(oooO00o2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), f5), true, 1, composer, 3510, 0);
            o0ooo2.OooO0o(SizeKt.OooOO0(PaddingKt.OooO(oooO00o2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), f5), true, 3, composer, 3510, 0);
            o0ooo2.OooO0o(SizeKt.OooOO0(PaddingKt.OooO(oooO00o2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), f5), true, 6, composer, 3510, 0);
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
        o00OOOO0 o00oooo0OooO = PaddingKt.OooO(SizeKt.OooOOOo(null, 3), f, 12, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12);
        o000000 o000000VarOooO00o6 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O0, composer, -1323940314);
        OooO oooO6 = (OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection6 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo7 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O5 = o00Oo0.OooO0O0(o00oooo0OooO);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function17);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O5).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o6, r9, composer, oooO6, r3, composer, layoutDirection6, r4, composer, o00ooooo7, r20, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        composer.OooO0o0(-1846805700);
        if (vm.isShowFollow()) {
            oooO00o = oooO00o2;
            o00OOOO0 o00oooo0OooO0oo = SizeKt.OooO0oo(oooO00o, 22, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            i7 = 1157296644;
            composer.OooO0o0(1157296644);
            boolean zOooo0oo2 = composer.Oooo0oo(function13);
            Object objOooO0o2 = composer.OooO0o();
            if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o2 = new OooO0O0(function13);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            function6 = function13;
            o0ooo2.OooO00o(o00oooo0OooO0oo, null, 0L, 0L, 0L, (Function0) objOooO0o2, composer, 1572870, 30);
        } else {
            oooO00o = oooO00o2;
            function6 = function13;
            i7 = 1157296644;
        }
        composer.Oooo0o0();
        o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
        o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.drawable.icon_post_move, composer);
        composer.OooO0o0(i7);
        boolean zOooo0oo3 = composer.Oooo0oo(function14);
        Object objOooO0o3 = composer.OooO0o();
        if (zOooo0oo3 || objOooO0o3 == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o3 = new OooO0OO(function14);
            composer.Oooo00o(objOooO0o3);
        }
        composer.Oooo0o0();
        Oooo0.o00.OooO00o(o000oo0oOooO00o, null, SizeKt.OooOO0(ClickableKt.OooO0Oo(oooO00o, false, (Function0) objOooO0o3, 7), 23), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
        o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
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
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(vm, function12, function6, function14, i, i2));
    }
}
