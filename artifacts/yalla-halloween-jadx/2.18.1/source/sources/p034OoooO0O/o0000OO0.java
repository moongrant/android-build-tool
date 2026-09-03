package p034OoooO0O;

import Oooo0.o00O0;
import Oooo0.o00O000;
import Oooo0.o00O0O0;
import Oooo0.o00O0O00;
import Oooo0.o00OO0O0;
import Oooo0.o00OO0OO;
import Oooo0.oo0O;
import android.os.Build;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O0.o0Oo0oo;
import o0000O0O.o000oOoO;
import o00O0O.OooO;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 extends Lambda implements Function1<Function0<? extends OooO>, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O0O.OooO f3501Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o000oOoO> f3502Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(o0000O0O.OooO oooO, o0O00OO<o000oOoO> o0o00oo2) {
        super(1);
        this.f3501Oooo0o = oooO;
        this.f3502Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o00OOOO0 invoke(Function0<? extends OooO> function0) {
        o00OOOO0 o00oooo0OooO0O0;
        Function0<? extends OooO> center = function0;
        Intrinsics.checkNotNullParameter(center, "center");
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00O0O0.OooO00o oooO00o2 = o00O0O0.f647OooO0oO;
        o00O0O0 style = o00O0O0.f646OooO;
        o000OO sourceCenter = new o000OO(center);
        o0000O o0000o2 = new o0000O(this.f3501Oooo0o, this.f3502Oooo0oO);
        o0Oo0oo<Function0<OooO>> o0oo0oo2 = o00O0O00.f655OooO00o;
        o00O000 magnifierCenter = o00O000.f616Oooo0o;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        if (!o00O0O00.OooO00o()) {
            o00oooo0OooO0O0 = oooO00o;
        } else {
            if (!o00O0O00.OooO00o()) {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
            o00OO0O0 platformMagnifierFactory = Build.VERSION.SDK_INT == 28 ? o00OO0OO.f686OooO00o : oo0O.f775OooO00o;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
            Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(platformMagnifierFactory, "platformMagnifierFactory");
            o00oooo0OooO0O0 = o00OOO0O.OooO0O0(oooO00o, new o00O0(sourceCenter, magnifierCenter, Float.NaN, o0000o2, platformMagnifierFactory, style));
        }
        return o00oOoo.OooO00o(oooO00o, o00oooo0OooO0O0);
    }
}
