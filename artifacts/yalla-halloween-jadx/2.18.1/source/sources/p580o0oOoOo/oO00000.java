package p580o0oOoOo;

import androidx.compose.foundation.layout.SizeKt;
import androidx.paging.compose.OooO0OO;
import com.yalla.yalla.model.RoomMemberTaskHostInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.Oooo000;
import p027Oooo0o.o000O00O;
import p028Oooo0o0.o00O00o0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p607o0oo0O0.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00000 extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O00O f46461Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<RoomMemberTaskHostInfoModel> f46462Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f46463Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000(o000O00O o000o00o2, OooO0OO<RoomMemberTaskHostInfoModel> oooO0OO, oo000o oo000oVar) {
        super(3);
        this.f46461Oooo0o = o000o00o2;
        this.f46462Oooo0oO = oooO0OO;
        this.f46463Oooo0oo = oo000oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
        o00O00o0 RefreshContentStatus = o00o00o1;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
        if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Oooo000.OooO00o(SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), this.f46461Oooo0o, null, false, null, null, null, false, new o(this.f46462Oooo0oO, this.f46463Oooo0oo), ooo00o2, 6, 252);
        }
        return Unit.INSTANCE;
    }
}
