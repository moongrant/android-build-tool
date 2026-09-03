package p496o0o00o;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000O0 extends Lambda implements Function1<List<UserInfo.TagInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49132OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49132OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo.TagInfo> list) {
        List<UserInfo.TagInfo> it = list;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        int i = UserInfoEditActivity.f27283Oooo0oO;
        this.f49132OooO0Oo.OooOooo(it);
        return Unit.INSTANCE;
    }
}
