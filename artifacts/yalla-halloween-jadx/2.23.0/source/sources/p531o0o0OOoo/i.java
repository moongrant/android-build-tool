package p531o0o0OOoo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserRecordModel f54508OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f54509OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f54510OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54511OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(RoomUserRecordModel roomUserRecordModel, String str, int i, int i2) {
        super(2);
        this.f54508OooO0Oo = roomUserRecordModel;
        this.f54510OooO0o0 = str;
        this.f54509OooO0o = i;
        this.f54511OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54511OooO0oO | 1);
        String str = this.f54510OooO0o0;
        int i = this.f54509OooO0o;
        z.OooO00o(this.f54508OooO0Oo, str, i, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
