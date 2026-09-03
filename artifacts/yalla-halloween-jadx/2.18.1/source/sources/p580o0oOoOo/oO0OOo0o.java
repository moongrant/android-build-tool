package p580o0oOoOo;

import android.content.Context;
import com.yalla.yalla.model.RoomMemberTaskInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000oOoO;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OOo0o extends Lambda implements Function4<o000oOoO, RoomMemberTaskInfoModel, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f46638Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Context f46639Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(long j, Context context) {
        super(4);
        this.f46638Oooo0o = j;
        this.f46639Oooo0oO = context;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(o000oOoO o000oooo2, RoomMemberTaskInfoModel roomMemberTaskInfoModel, oOO00O ooo00o, Integer num) {
        o000oOoO items = o000oooo2;
        RoomMemberTaskInfoModel roomMemberTaskInfoModel2 = roomMemberTaskInfoModel;
        oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (roomMemberTaskInfoModel2 != null) {
            oO000O0O.OooO0o(oO000O0O.f46487OooO00o, roomMemberTaskInfoModel2, this.f46638Oooo0o, this.f46639Oooo0oO, ooo00o2, 3592);
        }
        return Unit.INSTANCE;
    }
}
