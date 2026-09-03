package p254o00ooO0O;

import Oooo000.o0000O00;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o000O000 f34300Oooo0o = new o000O000();

    public o000O000() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        o00OOOO0 o00oooo2 = o00oooo1;
        oOO00O ooo00o2 = ooo00o;
        o0000O00.OooO00o(num, o00oooo2, "$this$composed", ooo00o2, -319825248);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        LayoutDirection layoutDirection = (LayoutDirection) ooo00o2.OooOO0o(o000.f6360OooOO0O);
        ooo00o2.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00o2.Oooo0oo(layoutDirection);
        Object objOooO0o = ooo00o2.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new o000(layoutDirection);
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        o00OOOO0 o00oooo0OooO00o = GraphicsLayerModifierKt.OooO00o(o00oooo2, (Function1) objOooO0o);
        ooo00o2.Oooo0o0();
        return o00oooo0OooO00o;
    }
}
