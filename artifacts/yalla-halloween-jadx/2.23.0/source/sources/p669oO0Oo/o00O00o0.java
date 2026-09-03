package p669oO0Oo;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f60537OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f60538OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomMemberTaskInfoModel f60539OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Context f60540OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f60541OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(o000O0Oo o000o0oo2, RoomMemberTaskInfoModel roomMemberTaskInfoModel, long j, Context context, int i) {
        super(2);
        this.f60537OooO0Oo = o000o0oo2;
        this.f60539OooO0o0 = roomMemberTaskInfoModel;
        this.f60538OooO0o = j;
        this.f60540OooO0oO = context;
        this.f60541OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o000O0Oo.OooO0o0(this.f60537OooO0Oo, this.f60539OooO0o0, this.f60538OooO0o, this.f60540OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f60541OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
