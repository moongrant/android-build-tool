package p600o0oo00OO;

import com.app.base.model.UserHeadFrameModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f48003Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O f48004Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f48005Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ UserHeadFrameModel f48006Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ int f48007OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function3<UserHeadFrameModel, Integer, Boolean, Unit> f48008OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000(o0000O o0000o2, int i, UserHeadFrameModel userHeadFrameModel, boolean z, Function3<? super UserHeadFrameModel, ? super Integer, ? super Boolean, Unit> function3, int i2) {
        super(2);
        this.f48004Oooo0o = o0000o2;
        this.f48005Oooo0oO = i;
        this.f48006Oooo0oo = userHeadFrameModel;
        this.f48003Oooo = z;
        this.f48008OoooO00 = function3;
        this.f48007OoooO0 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o0000O.OooO0oo(this.f48004Oooo0o, this.f48005Oooo0oO, this.f48006Oooo0oo, this.f48003Oooo, this.f48008OoooO00, ooo00o, this.f48007OoooO0 | 1);
        return Unit.INSTANCE;
    }
}
