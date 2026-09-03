package p580o0oOoOo;

import androidx.paging.compose.OooO0OO;
import com.app.base.model.LiveRoomMemberUserRankModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000O00O;
import p028Oooo0o0.o00O00o0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OO00 extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f46630Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f46631Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<LiveRoomMemberUserRankModel.RankDataDTO> f46632Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000O00O f46633Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00(boolean z, OooO0OO<LiveRoomMemberUserRankModel.RankDataDTO> oooO0OO, o000O00O o000o00o2, o0O00OO<Boolean> o0o00oo2) {
        super(3);
        this.f46631Oooo0o = z;
        this.f46632Oooo0oO = oooO0OO;
        this.f46633Oooo0oo = o000o00o2;
        this.f46630Oooo = o0o00oo2;
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
            oO0O00o0.f46571OooO00o.OooO0O0(this.f46631Oooo0o, this.f46632Oooo0oO, this.f46633Oooo0oo, this.f46630Oooo, ooo00o2, 27712);
        }
        return Unit.INSTANCE;
    }
}
