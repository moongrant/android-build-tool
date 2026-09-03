package p558o0oOOoo;

import com.app.base.model.RoomActivityModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00o0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ List<RoomActivityModel.RoomActivitys> f44700Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f44701Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(List<RoomActivityModel.RoomActivitys> list, int i) {
        super(2);
        this.f44700Oooo0o = list;
        this.f44701Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o00O0.OooO0O0(this.f44700Oooo0o, ooo00o, this.f44701Oooo0oO | 1);
        return Unit.INSTANCE;
    }
}
