package p588o0oOooO;

import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o00OO0O.OooOO0O;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.oo00o;
import p029Oooo0oO.o000OO00;
import p031OoooO.o000Oo0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p053o00000oO.o0000O00;
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
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p259o00ooOo.o0O0o;
import p261o00ooOoO.p;
import p261o00ooOoO.u;
import p498o0o00Oo0.OooOOO;
import p507o0o00oOO.o0000O0;
import p571o0oOo0o.o00O0OO;
import p584o0oOoo.o0000O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOo0o00 extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOo0o00 f47154OooO00o = new oOo0o00();

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47156Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47157Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47156Oooo0oO = o00o0o01;
            this.f47157Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oOo0o00.this.OooO00o(this.f47156Oooo0oO, ooo00o, this.f47157Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountReasonChooseVM f47158Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM) {
            super(0);
            this.f47158Oooo0o = deleteAccountReasonChooseVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47158Oooo0o.loadData();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountReasonChooseVM f47159Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM) {
            super(3);
            this.f47159Oooo0o = deleteAccountReasonChooseVM;
        }

        /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        /* JADX WARN: Type inference failed for: r20v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 ContentStatus = o00o00o1;
            oOO00O composer = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
                DeleteAccountReasonChooseVM deleteAccountReasonChooseVM = this.f47159Oooo0o;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                Oooo0o0.o00O000.OooOo00 oooOo00 = p028Oooo0o0.o00O000.f2032OooO0Oo;
                o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4182OooOOO;
                o000000 o000000VarOooO00o = oo00o.OooO00o(oooOo00, oooO00o2, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<OooO> o0o0o0o0 = o000.f6356OooO0o0;
                OooO oooO = (OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o0);
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
                ?? r1 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r1);
                ?? r2 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r2);
                ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r3);
                ?? r20 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r20, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                o00OOOO0 o00oooo0OooO0o = PaddingKt.OooO0o(oooO00o, 20, 29);
                Intrinsics.checkNotNullParameter(o00oooo0OooO0o, "<this>");
                if (!(((double) 1.0f) > 0.0d)) {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                o00OOOO0 o00oooo0OooOOoo = o00oooo0OooO0o.OooOOoo(new o0O000O(true));
                composer.OooO0o0(-483455358);
                o000000 o000000VarOooO00o2 = oo00o.OooO00o(oooOo00, oooO00o2, composer);
                composer.OooO0o0(-1323940314);
                OooO oooO2 = (OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooOOoo);
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
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r1, composer, oooO2, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r20, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                oOo0o00.OooO0o(oOo0o00.f47154OooO00o, deleteAccountReasonChooseVM, composer, 56);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0o2 = SizeKt.OooO0o(oooO00o);
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                o00OOOO0 o00oooo0OooO0o3 = PaddingKt.OooO0o(BackgroundKt.OooO0O0(o00oooo0OooO0o2, o0000O0.f41693OooO0OO, o000O0Oo.f32099OooO00o), 30, 12);
                composer.OooO0o0(733328855);
                o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                OooO oooO3 = (OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Oo0.OooO0O0(o00oooo0OooO0o3);
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
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r1, composer, oooO3, r2, composer, layoutDirection3, r3, composer, o00ooooo4, r20, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                p.OooO0O0(o000O0O0.OooO0OO(R.string.Cancel), 0L, null, false, false, null, null, null, null, null, null, null, SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), 37), O0OO00.f47098Oooo0o, composer, 0, 3456, 4094);
                OooOO0O.OooO00o(composer);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47161Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47162Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47161Oooo0oO = o00o0o01;
            this.f47162Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oOo0o00.this.OooO0o0(this.f47161Oooo0oO, ooo00o, this.f47162Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0o(oOo0o00 ooo0o00, DeleteAccountReasonChooseVM deleteAccountReasonChooseVM, oOO00O ooo00o, int i) {
        Objects.requireNonNull(ooo0o00);
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(462571200);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        String strOooO00o = OooOo.OooO00o(o000O0O0.OooO0OO(R.string.delete_account_cancel_reason_title), OooOOO.f41216OooO00o.OooOoO().getValue());
        long jOooO0o = u.OooO0O0(ooo00oOooOOo).OooO0o();
        long jOooO00o = p617o0oo0o.o00Oo0.OooO00o(17, ooo00oOooOOo);
        o0000O00.OooO00o oooO00o = o0000O00.f27125Oooo0oO;
        p031OoooO.o000O0O0.OooO0OO(strOooO00o, null, jOooO0o, jOooO00o, null, o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00oOooOOo, 196608, 0, 65490);
        String strOooO00o2 = deleteAccountReasonChooseVM.getFriendCount() > 0 ? OooOo.OooO00o(o000O0O0.OooO0OO(R.string.delete_account_cancel_reason_warn_1), String.valueOf(deleteAccountReasonChooseVM.getFriendCount())) : o000O0O0.OooO0OO(R.string.delete_account_cancel_reason_warn_2);
        o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
        p031OoooO.o000O0O0.OooO0OO(strOooO00o2, PaddingKt.OooO(oooO00o2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (float) 7.5d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13), u.OooO0O0(ooo00oOooOOo).OooO0oo(), p617o0oo0o.o00Oo0.OooO00o(15, ooo00oOooOOo), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00oOooOOo, 48, 0, 65520);
        o0000oo.OooO0OO(20, null, ooo00oOooOOo, 6, 2);
        Oooo0oO.o000O0Oo.OooO00o oooO00o3 = new Oooo0oO.o000O0Oo.OooO00o(2);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        float f = 16;
        o000OO00.OooO00o(oooO00o3, SizeKt.OooO0o0(oooO00o2), null, null, false, o00o001.OooO0oo(f), o00o001.OooO0oo(f), null, false, new O0000000(deleteAccountReasonChooseVM), ooo00oOooOOo, 1769520, FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new O0O0(ooo0o00, deleteAccountReasonChooseVM, i));
    }

    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-2070927847);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o00o0o01) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(this) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            String strOooO0OO = o000O0O0.OooO0OO(R.string.delete_account);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o00O0OO.OooO00o(strOooO0OO, u.OooO0O0(ooo00oOooOOo).OooO0o(), 0, null, null, null, o0000O0.f41693OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, ooo00oOooOOo, 1572864, 0, 1980);
            OooO0o0(o00o0o01, ooo00oOooOOo, (i3 & 14) | (i3 & 112));
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(o00o0o01, i));
    }

    @Override // p584o0oOoo.o0000O
    @Composable
    public final long OooO0OO(@Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(1503444094);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        long j = o0000O0.f41781o0000oO0;
        ooo00o.Oooo0o0();
        return j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(o00O0O00 o00o0o01, oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-762979936);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o00o0o01) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(DeleteAccountReasonChooseVM.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            DeleteAccountReasonChooseVM deleteAccountReasonChooseVM = (DeleteAccountReasonChooseVM) viewModel;
            Bundle bundleOooO0O0 = p584o0oOoo.o000OO00.OooO0O0((NavBackStackEntry) ooo00oOooOOo.OooOO0o(p584o0oOoo.o000OO00.f46954OooO00o), ooo00oOooOOo);
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(bundleOooO0O0);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                Object obj = bundleOooO0O0.get("accountInfo");
                deleteAccountReasonChooseVM.setAccountInfo(obj instanceof AccountBindInfo ? (AccountBindInfo) obj : null);
                ooo00oOooOOo.Oooo00o(null);
            }
            ooo00oOooOOo.Oooo0o0();
            o0O0o.OooO0o0(deleteAccountReasonChooseVM.getContentState(), o00o0o01.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, true), null, null, null, new OooO0O0(deleteAccountReasonChooseVM), o00O0000.OooO00o(ooo00oOooOOo, 1311197379, new OooO0OO(deleteAccountReasonChooseVM)), ooo00oOooOOo, 1572864, 28);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(o00o0o01, i));
    }
}
