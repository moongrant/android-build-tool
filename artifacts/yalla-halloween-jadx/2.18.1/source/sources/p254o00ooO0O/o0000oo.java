package p254o00ooO0O;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o0O0O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0OOO0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f34281Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f34281Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000oo.OooO00o(ooo00o, this.f34281Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f34282Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f34283Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f34284Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f34285Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(float f, o00OOOO0 o00oooo1, int i, int i2) {
            super(2);
            this.f34283Oooo0o = f;
            this.f34284Oooo0oO = o00oooo1;
            this.f34285Oooo0oo = i;
            this.f34282Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000oo.OooO0O0(this.f34283Oooo0o, this.f34284Oooo0oO, ooo00o, this.f34285Oooo0oo | 1, this.f34282Oooo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f34286Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f34287Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f34288Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f34289Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(float f, o00OOOO0 o00oooo1, int i, int i2) {
            super(2);
            this.f34287Oooo0o = f;
            this.f34288Oooo0oO = o00oooo1;
            this.f34289Oooo0oo = i;
            this.f34286Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000oo.OooO0OO(this.f34287Oooo0o, this.f34288Oooo0oO, ooo00o, this.f34289Oooo0oo | 1, this.f34286Oooo);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-199247870);
        if (i == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O0O0o0<Configuration> o0o0o0o0 = o0O0O00.f6590OooO00o;
            ((Configuration) ooo00oOooOOo.OooOO0o(o0o0o0o0)).screenWidthDp = 360;
            ((Configuration) ooo00oOooOOo.OooOO0o(o0o0o0o0)).screenHeightDp = (int) (((Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0)).getResources().getDisplayMetrics().heightPixels / ((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).getDensity());
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(float f, @Nullable o00OOOO0 o00oooo1, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1327843359);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.OooO0oO(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= ooo00oOooOOo.Oooo0oo(o00oooo1) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            if (i4 != 0) {
                int i5 = o00OOOO0.f4197OooO00o;
                o00oooo1 = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(o00oooo1, f), ooo00oOooOOo, 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(f, o00oooo1, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(float f, @Nullable o00OOOO0 o00oooo1, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-315980621);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.OooO0oO(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= ooo00oOooOOo.Oooo0oo(o00oooo1) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            if (i4 != 0) {
                int i5 = o00OOOO0.f4197OooO00o;
                o00oooo1 = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(o00oooo1, f), ooo00oOooOOo, 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(f, o00oooo1, i, i2));
    }
}
