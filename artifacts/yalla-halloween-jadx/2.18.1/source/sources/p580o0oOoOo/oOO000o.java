package p580o0oOoOo;

import com.app.base.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p029Oooo0oO.oo00o;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO000o extends Lambda implements Function3<oo00o, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f46665Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000o(MixedRoomActivity mixedRoomActivity) {
        super(3);
        this.f46665Oooo0o = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(oo00o oo00oVar, oOO00O ooo00o, Integer num) {
        oo00o item = oo00oVar;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            oOo00o00.OooOO0O(this.f46665Oooo0o, ooo00o2, 8);
        }
        return Unit.INSTANCE;
    }
}
