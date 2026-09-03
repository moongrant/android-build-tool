package p538o0o0Oo0;

import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0OoOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserPostListActivity f44096Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(UserPostListActivity userPostListActivity) {
        super(0);
        this.f44096Oooo0o = userPostListActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentMessageListActivity.OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
        UserPostListActivity userPostListActivity = this.f44096Oooo0o;
        Objects.requireNonNull(userPostListActivity);
        oooO00o.OooO00o(userPostListActivity);
        return Unit.INSTANCE;
    }
}
