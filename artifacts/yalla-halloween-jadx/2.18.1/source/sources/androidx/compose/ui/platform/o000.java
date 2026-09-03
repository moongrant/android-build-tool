package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0O0OO0;
import p100o000oOoO.o0oo0000;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<androidx.compose.ui.platform.OooOOO0> f6351OooO00o = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooO00o.f6368Oooo0o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<p049Ooooooo.o0O00000> f6352OooO0O0 = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooO0O0.f6369Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<p049Ooooooo.o0O000Oo> f6353OooO0OO = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooO0OO.f6370Oooo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o0000O> f6354OooO0Oo = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooO0o.f6371Oooo0o);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o0000O0O.OooO> f6356OooO0o0 = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooO.f6367Oooo0o);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<p710ooOO.o0ooOOo> f6355OooO0o = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooOO0.f6372Oooo0o);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o00000oO.o0O0O00.OooO00o> f6357OooO0oO = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooOOO0.f6375Oooo0o);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o00000oO.o000OOo.OooO0O0> f6358OooO0oo = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooOO0O.f6373Oooo0o);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<p218o00oO0O.oo000o> f6350OooO = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooOOO.f6374Oooo0o);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<p643o0ooOO0.o00O0> f6359OooOO0 = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooOOOO.f6376Oooo0o);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<LayoutDirection> f6360OooOO0O = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooOo00.f6378Oooo0o);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<p054o00000oo.o00OO000> f6361OooOO0o = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(Oooo000.f6380Oooo0o);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o00OO0OO> f6363OooOOO0 = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(Oooo0.f6379Oooo0o);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o00OO> f6362OooOOO = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(o000oOoO.f6381Oooo0o);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o00OOOOo> f6364OooOOOO = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(o0OoOo0.f6387Oooo0o);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<oo00oO> f6365OooOOOo = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(o00O0O.f6382Oooo0o);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<p418o0Oo0oo.o0ooOOo> f6366OooOOo0 = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooOo.f6377Oooo0o);

    public static final class OooO extends Lambda implements Function0<o0000O0O.OooO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f6367Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000O0O.OooO invoke() {
            o000.OooO0O0("LocalDensity");
            throw null;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<androidx.compose.ui.platform.OooOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6368Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ androidx.compose.ui.platform.OooOOO0 invoke() {
            return null;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<p049Ooooooo.o0O00000> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f6369Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ p049Ooooooo.o0O00000 invoke() {
            return null;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<p049Ooooooo.o0O000Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f6370Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p049Ooooooo.o0O000Oo invoke() {
            o000.OooO0O0("LocalAutofillTree");
            throw null;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0000O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f6371Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000O invoke() {
            o000.OooO0O0("LocalClipboardManager");
            throw null;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<p710ooOO.o0ooOOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f6372Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p710ooOO.o0ooOOo invoke() {
            o000.OooO0O0("LocalFocusManager");
            throw null;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<o00000oO.o000OOo.OooO0O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0O f6373Oooo0o = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000oO.o000OOo.OooO0O0 invoke() {
            o000.OooO0O0("LocalFontFamilyResolver");
            throw null;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<p218o00oO0O.oo000o> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO f6374Oooo0o = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p218o00oO0O.oo000o invoke() {
            o000.OooO0O0("LocalHapticFeedback");
            throw null;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<o00000oO.o0O0O00.OooO00o> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f6375Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000oO.o0O0O00.OooO00o invoke() {
            o000.OooO0O0("LocalFontLoader");
            throw null;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<p643o0ooOO0.o00O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOOO f6376Oooo0o = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p643o0ooOO0.o00O0 invoke() {
            o000.OooO0O0("LocalInputManager");
            throw null;
        }
    }

    public static final class OooOo extends Lambda implements Function0<p418o0Oo0oo.o0ooOOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo f6377Oooo0o = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ p418o0Oo0oo.o0ooOOo invoke() {
            return null;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<LayoutDirection> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo00 f6378Oooo0o = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LayoutDirection invoke() {
            o000.OooO0O0("LocalLayoutDirection");
            throw null;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<o00OO0OO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo0 f6379Oooo0o = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00OO0OO invoke() {
            o000.OooO0O0("LocalTextToolbar");
            throw null;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<p054o00000oo.o00OO000> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo000 f6380Oooo0o = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ p054o00000oo.o00OO000 invoke() {
            return null;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<o00OO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o000oOoO f6381Oooo0o = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00OO invoke() {
            o000.OooO0O0("LocalUriHandler");
            throw null;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<oo00oO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00O0O f6382Oooo0o = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oo00oO invoke() {
            o000.OooO0O0("LocalWindowInfo");
            throw null;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f6383Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000000.o00000 f6384Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OO f6385Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<p100o000oOoO.oOO00O, Integer, Unit> f6386Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Oo0(o000000.o00000 o00000Var, o00OO o00oo2, Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f6384Oooo0o = o00000Var;
            this.f6385Oooo0oO = o00oo2;
            this.f6386Oooo0oo = function2;
            this.f6383Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o000.OooO00o(this.f6384Oooo0o, this.f6385Oooo0oO, this.f6386Oooo0oo, ooo00o, this.f6383Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<o00OOOOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0OoOo0 f6387Oooo0o = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00OOOOo invoke() {
            o000.OooO0O0("LocalViewConfiguration");
            throw null;
        }
    }

    @Composable
    @ExperimentalComposeUiApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void OooO00o(@NotNull o000000.o00000 owner, @NotNull o00OO uriHandler, @NotNull Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> content, @Nullable p100o000oOoO.oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(uriHandler, "uriHandler");
        Intrinsics.checkNotNullParameter(content, "content");
        p100o000oOoO.oOO00O ooo00oOooOOo = ooo00o.OooOOo(874662829);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(owner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(uriHandler) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(content) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            p100o000oOoO.o00OO0O0.OooO00o(new o0O0OO0[]{f6351OooO00o.OooO0O0(owner.getAccessibilityManager()), f6352OooO0O0.OooO0O0(owner.getAutofill()), f6353OooO0OO.OooO0O0(owner.getF6211OoooOoO()), f6354OooO0Oo.OooO0O0(owner.getClipboardManager()), f6356OooO0o0.OooO0O0(owner.getDensity()), f6355OooO0o.OooO0O0(owner.getFocusManager()), new o0O0OO0(f6357OooO0oO, owner.getFontLoader(), false), new o0O0OO0(f6358OooO0oo, owner.getFontFamilyResolver(), false), f6350OooO.OooO0O0(owner.getHapticFeedBack()), f6359OooOO0.OooO0O0(owner.getInputModeManager()), f6360OooOO0O.OooO0O0(owner.getLayoutDirection()), f6361OooOO0o.OooO0O0(owner.getF6223o00000()), f6363OooOOO0.OooO0O0(owner.getTextToolbar()), f6362OooOOO.OooO0O0(uriHandler), f6364OooOOOO.OooO0O0(owner.getViewConfiguration()), f6365OooOOOo.OooO0O0(owner.getWindowInfo()), f6366OooOOo0.OooO0O0(owner.getPointerIconService())}, content, ooo00oOooOOo, ((i2 >> 3) & 112) | 8);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00Oo0(owner, uriHandler, content, i));
    }

    public static final Void OooO0O0(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final o0O0O0o0<o0000O0O.OooO> OooO0OO() {
        return f6356OooO0o0;
    }

    @NotNull
    public static final o0O0O0o0<LayoutDirection> OooO0Oo() {
        return f6360OooOO0O;
    }

    @NotNull
    public static final o0O0O0o0<o00OOOOo> OooO0o0() {
        return f6364OooOOOO;
    }
}
