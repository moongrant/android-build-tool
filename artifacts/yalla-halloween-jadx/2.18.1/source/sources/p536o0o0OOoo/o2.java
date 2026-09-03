package p536o0o0OOoo;

import android.view.View;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.OooO00o;
import p464o0Ooo0oO.o0000O0O;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o2 extends Lambda implements Function3<o0000O0O<YallaTeamMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43830Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(3);
        this.f43830Oooo0o = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0000O0O<YallaTeamMessage> o0000o0o2, View view, Integer num) {
        num.intValue();
        Intrinsics.checkNotNullParameter(o0000o0o2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, this.f43830Oooo0o, String.valueOf(((Number) OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), false, 12);
        return Unit.INSTANCE;
    }
}
