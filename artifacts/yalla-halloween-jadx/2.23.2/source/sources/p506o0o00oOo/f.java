package p506o0o00oOo;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Lambda implements Function1<List<UserInfo.TagInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50405OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f50405OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo.TagInfo> list) {
        List<UserInfo.TagInfo> list2 = list;
        Intrinsics.checkNotNull(list2);
        int i = UserInfoEditActivity.f26818Oooo0oO;
        this.f50405OooO0Oo.OooOooo(list2);
        return Unit.INSTANCE;
    }
}
