package p544o0o0OoOO;

import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class k7 extends Lambda implements Function1<List<RoomUserInfoModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f44265Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(VoteGameCreateActivity voteGameCreateActivity) {
        super(1);
        this.f44265Oooo0o = voteGameCreateActivity;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<RoomUserInfoModel> list) {
        List<RoomUserInfoModel> it = list;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f44265Oooo0o.f23076Ooooo0o.clear();
        this.f44265Oooo0o.f23076Ooooo0o.addAll(it);
        this.f44265Oooo0o.OooOooO();
        return Unit.INSTANCE;
    }
}
