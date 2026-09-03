package p580o0oOoOo;

import android.content.Context;
import com.yalla.yalla.model.RoomMemberTaskInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00O0oO extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Context f46536Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO000O0O f46537Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RoomMemberTaskInfoModel f46538Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f46539Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f46540OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(oO000O0O oo000o0o, RoomMemberTaskInfoModel roomMemberTaskInfoModel, long j, Context context, int i) {
        super(2);
        this.f46537Oooo0o = oo000o0o;
        this.f46538Oooo0oO = roomMemberTaskInfoModel;
        this.f46539Oooo0oo = j;
        this.f46536Oooo = context;
        this.f46540OoooO00 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO000O0O.OooO0o(this.f46537Oooo0o, this.f46538Oooo0oO, this.f46539Oooo0oo, this.f46536Oooo, ooo00o, this.f46540OoooO00 | 1);
        return Unit.INSTANCE;
    }
}
