package p540o0o0OoO0;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OOO f54895OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f54896OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomMemberTaskInfoModel f54897OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Context f54898OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54899OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(o0O00OOO o0o00ooo2, RoomMemberTaskInfoModel roomMemberTaskInfoModel, long j, Context context, int i) {
        super(2);
        this.f54895OooO0Oo = o0o00ooo2;
        this.f54897OooO0o0 = roomMemberTaskInfoModel;
        this.f54896OooO0o = j;
        this.f54898OooO0oO = context;
        this.f54899OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0O00OOO.OooO0o0(this.f54895OooO0Oo, this.f54897OooO0o0, this.f54896OooO0o, this.f54898OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54899OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
