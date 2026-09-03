package p521o0o0O0OO;

import com.code.android.util.ToastUtil;
import com.facebook.GraphResponse;
import com.yalla.yalla.model.RoomMemberTaskModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO00 extends Lambda implements Function1<List<? extends RoomMemberTaskModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o00OOO00 f42949Oooo0o = new o00OOO00();

    public o00OOO00() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends RoomMemberTaskModel> list) {
        ToastUtil.f12567OooO00o.OooO0O0(GraphResponse.SUCCESS_KEY);
        return Unit.INSTANCE;
    }
}
