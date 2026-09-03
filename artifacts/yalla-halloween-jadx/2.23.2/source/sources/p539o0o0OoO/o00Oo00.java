package p539o0o0OoO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p188o00o00oO.o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f54589OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000<RoomUserRecordModel> f54590OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f54591OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000<RoomUserRecordModel> f54592OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54593OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(int i, String str, o000<RoomUserRecordModel> o000Var, o000<RoomUserRecordModel> o000Var2, int i2) {
        super(2);
        this.f54589OooO0Oo = i;
        this.f54591OooO0o0 = str;
        this.f54590OooO0o = o000Var;
        this.f54592OooO0oO = o000Var2;
        this.f54593OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0oOO.OooO0OO(this.f54589OooO0Oo, this.f54591OooO0o0, this.f54590OooO0o, this.f54592OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54593OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
