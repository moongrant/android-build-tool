package p535o0o0OOoO;

import Oooo000.OooO0o;
import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.MediatorLiveData;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.compose.ComposePlaceHolder;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.ui.activity.account.LoginActivity;
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
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import oOO00O.OooOO0;
import p032OoooO0.oo000o;
import p033OoooO00.o00O0O;
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
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p114o00O00o.OooOOOO;
import p114o00O00o.o000oOoO;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0o;
import p442o0OoOo0.Oooo000;
import p487o0o000oO.o0OOO0o;
import p493o0o00O0o.OooOo00;
import p498o0o00Oo0.OooOOO;
import p524o0o0O0oO.o0O0OO0;
import p571o0oOo0o.o00O0O0O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0O0O00 {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f43658Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43658Oooo0o = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!o0OOO0o.OooO0OO()) {
                int i = OooOo00.f41152OooO00o;
                AppCompatActivity context = this.f43658Oooo0o;
                Intrinsics.checkNotNull(context);
                Intrinsics.checkNotNullParameter(context, "context");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ DrawerLayout f43659Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(DrawerLayout drawerLayout) {
            super(0);
            this.f43659Oooo0o = drawerLayout;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOo.OooO0O0("101047");
            oO0O0O0o onLogin = new oO0O0O0o(this.f43659Oooo0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ DrawerLayout f43660Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f43661Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(DrawerLayout drawerLayout, int i) {
            super(2);
            this.f43660Oooo0o = drawerLayout;
            this.f43661Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O0O00.OooO00o(this.f43660Oooo0o, ooo00o, this.f43661Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(DrawerLayout drawerLayout, oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-672266888);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o0O0O0o0<Context> o0o0o0o0 = o0O0O00.f6591OooO0O0;
        Object objOooOO0o = composer.OooOO0o(o0o0o0o0);
        AppCompatActivity appCompatActivity = objOooOO0o instanceof AppCompatActivity ? (AppCompatActivity) objOooOO0o : null;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        float f = 32;
        o00OOOO0 o00oooo0OooOO0O = SizeKt.OooOO0O(PaddingKt.OooO(WindowInsetsPadding_androidKt.OooO0O0(oooO00o), 15, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), f, 48);
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooOO0O);
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
        String strOooO00o = p522o0o0O0o.o00O00O.OooO00o((String) p044OooooOO.o00O00O.OooO0O0(OooOOO.f41216OooO00o.OooO0oo(), composer).getValue());
        composer.OooO0o0(604400049);
        OooOO0 oooOO0OooO00o = OooOOOO.OooO00o(o000oOoO.f30327OooO00o, composer);
        composer.OooO0o0(604401387);
        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0o0o0o0));
        c0072OooO00o.f9912OooO0OO = strOooO00o;
        ComposePlaceHolder.f20570OooO00o.OooO00o(c0072OooO00o, ComposePlaceHolder.PlaceholderType.UserHeader, composer, 440);
        p114o00O00o.OooOo00 oooOo00OooO0O0 = com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o, oooOO0OooO00o, composer);
        o00OOOO0 o00oooo0OooO00o = Oooo000.OooO00o(SizeKt.OooOO0(oooO00o, f), o00O0O.f3431OooO00o);
        o00OO0OO alignment = o00OO0O0.OooO00o.f4175OooO0o;
        Intrinsics.checkNotNullParameter(o00oooo0OooO00o, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        Oooo0.o00.OooO00o(oooOo00OooO0O0, null, o000O0o.OooO0O0(o00oooo0OooO00o.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false)), false, false, new OooO00o(appCompatActivity), new OooO0O0(drawerLayout), 189), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 48, 120);
        MediatorLiveData<Boolean> userDot = SharedMainMessageManager.INSTANCE.getUserDot();
        Intrinsics.checkNotNull(userDot);
        oO0Oo oo0ooOooO00o = p044OooooOO.o00O00O.OooO00o(userDot, Boolean.FALSE, composer);
        o00O0O0O o00o0o0o2 = o00O0O0O.f45564OooO00o;
        Boolean showUserDot = (Boolean) oo0ooOooO00o.getValue();
        Intrinsics.checkNotNullExpressionValue(showUserDot, "showUserDot");
        o00OO0OO alignment2 = o00OO0O0.OooO00o.f4174OooO0Oo;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(alignment2, "alignment");
        p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment2, false);
        Intrinsics.checkNotNullParameter(other, "other");
        o00o0o0o2.OooO00o(showUserDot.booleanValue(), 7, PaddingKt.OooO(other, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13), composer, 3120, 0);
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new OooO0OO(drawerLayout, i));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0O0(DrawerLayout drawerLayout, p524o0o0O0oO.o0O0O0o0 o0o0o0o0, oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-1262026875);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o);
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
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
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5741OooO00o;
        OooO00o(drawerLayout, composer, 8);
        o0O0OO0.OooO00o(boxScopeInstance, o0o0o0o0 != null ? o0o0o0o0.f43046OooO0o : null, composer, 70);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oO0O0(drawerLayout, o0o0o0o0, i));
    }
}
