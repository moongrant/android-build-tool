package p580o0oOoOo;

import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0OO;
import p028Oooo0o0.o00O00o0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p259o00ooOo.o0O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o00O extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f46392Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(boolean z) {
        super(3);
        this.f46392Oooo0o = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
        o00O00o0 ContentStatus = o00o00o1;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O0o.OooO00o(OooO0OO.OooO00o(!this.f46392Oooo0o ? R.string.apply_mic_list_empty : R.string.apply_mic_list_empty_owner, ooo00o2), 0, null, null, null, ooo00o2, 0, 30);
        }
        return Unit.INSTANCE;
    }
}
