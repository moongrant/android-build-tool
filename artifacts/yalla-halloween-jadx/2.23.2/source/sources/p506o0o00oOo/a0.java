package p506o0o00oOo;

import android.content.Intent;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50390OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(UserInfoEditActivity userInfoEditActivity) {
        super(0);
        this.f50390OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = UserInfoEditBioActivity.f26846OooOo;
        UserInfoEditActivity context = this.f50390OooO0Oo;
        context.getClass();
        String string = context.OooOoO().f45668OooOOO0.getText().toString();
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) UserInfoEditBioActivity.class);
        intent.putExtra("bio", string);
        context.startActivity(intent);
        return Unit.INSTANCE;
    }
}
