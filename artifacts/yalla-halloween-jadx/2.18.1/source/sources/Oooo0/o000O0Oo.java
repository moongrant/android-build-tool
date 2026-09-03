package Oooo0;

import androidx.compose.ui.focus.FocusPropertiesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo extends Lambda implements Function3<p048OoooooO.o00OOOO0, p100o000oOoO.oOO00O, Integer, p048OoooooO.o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f579Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ p026Oooo0OO.o000 f580Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(boolean z, p026Oooo0OO.o000 o000Var) {
        super(3);
        this.f579Oooo0o = z;
        this.f580Oooo0oO = o000Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final p048OoooooO.o00OOOO0 invoke(p048OoooooO.o00OOOO0 o00oooo1, p100o000oOoO.oOO00O ooo00o, Integer num) {
        p100o000oOoO.oOO00O ooo00o2 = ooo00o;
        Oooo000.o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, -618949501);
        p048OoooooO.o00OOOO0 o00oooo0OooO00o = FocusPropertiesKt.OooO00o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, new o000O0((p643o0ooOO0.o00O0) ooo00o2.OooOO0o(androidx.compose.ui.platform.o000.f6359OooOO0)));
        boolean z = this.f579Oooo0o;
        p026Oooo0OO.o000 o000Var = this.f580Oooo0oO;
        Intrinsics.checkNotNullParameter(o00oooo0OooO00o, "<this>");
        Function1<androidx.compose.ui.platform.o00O000o, Unit> function1 = androidx.compose.ui.platform.o00oOoo.f6560OooO00o;
        p048OoooooO.o00OOOO0 o00oooo0OooO00o2 = p048OoooooO.o00OOO0O.OooO00o(o00oooo0OooO00o, androidx.compose.ui.platform.o00oOoo.f6560OooO00o, new o000O00O(o000Var, z));
        ooo00o2.Oooo0o0();
        return o00oooo0OooO00o2;
    }
}
