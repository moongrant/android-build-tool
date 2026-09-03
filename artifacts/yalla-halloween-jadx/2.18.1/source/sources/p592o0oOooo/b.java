package p592o0oOooo;

import Oooo0.oo00oO;
import Oooo000.OooO0o;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.NavBackStackEntry;
import com.weieyu.yalla.R;
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
import oOO00O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p043OooooO0.o00;
import p045OooooOo.o00O0;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p114o00O00o.OooOOOO;
import p114o00O00o.OooOo00;
import p114o00O00o.Oooo0;
import p114o00O00o.o000oOoO;
import p571o0oOo0o.o00O0OO;
import p584o0oOoo.o0000O;
import p584o0oOoo.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class b extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final b f47417OooO00o = new b();

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47419Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47420Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47419Oooo0oO = o00o0o01;
            this.f47420Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            b.this.OooO00o(this.f47419Oooo0oO, ooo00o, this.f47420Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Bundle f47421Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Bundle bundle) {
            super(0);
            this.f47421Oooo0o = bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f47421Oooo0o.getString("ImageUrl", "");
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Bundle f47422Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Bundle bundle) {
            super(0);
            this.f47422Oooo0o = bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f47422Oooo0o.getString("Title", "");
        }
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O composer = ooo00o.OooOOo(-305495961);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Bundle bundleOooO0O0 = o000OO00.OooO0O0((NavBackStackEntry) composer.OooOO0o(o000OO00.f46954OooO00o), composer);
            String title = (String) o00O0.OooO00o(new Object[]{bundleOooO0O0}, null, new OooO0OO(bundleOooO0O0), composer, 6);
            String str = (String) o00O0.OooO00o(new Object[]{bundleOooO0O0}, null, new OooO0O0(bundleOooO0O0), composer, 6);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
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
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            Intrinsics.checkNotNullExpressionValue(title, "title");
            o00O0OO.OooO00o(title, 0L, 0, null, null, null, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, composer, 0, 0, 2046);
            composer.OooO0o0(604400049);
            OooOO0 oooOO0OooO00o = OooOOOO.OooO00o(o000oOoO.f30327OooO00o, composer);
            composer.OooO0o0(604401387);
            coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0O0O00.f6591OooO0O0));
            c0072OooO00o.f9912OooO0OO = str;
            c0072OooO00o.OooO0Oo(R.drawable.icon_picture_default);
            OooOo00 oooOo00OooO00o = Oooo0.OooO00o(c0072OooO00o.OooO00o(), oooOO0OooO00o, composer);
            composer.Oooo0o0();
            composer.Oooo0o0();
            Oooo0.o00.OooO00o(oooOo00OooO00o, null, oo00oO.OooO0OO(SizeKt.OooO0o0(oooO00o), oo00oO.OooO0O0(composer, 1)), o00OO0O0.OooO00o.f4173OooO0OO, o0O0O00.OooOO0.OooO00o.f35242OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 27696, 96);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(o00o0o01, i));
    }
}
