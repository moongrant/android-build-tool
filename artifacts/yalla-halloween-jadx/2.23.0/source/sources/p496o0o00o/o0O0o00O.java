package p496o0o00o;

import android.content.Intent;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49083OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49083OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o0OO000.OooO00o("105064");
        int i = UserInfoEditActivity.f27283Oooo0oO;
        UserInfoActivity context = this.f49083OooO0Oo;
        context.getClass();
        UserInfoModel userInfoModel = context.f27246OooOo0o;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) UserInfoEditActivity.class);
        if (userInfoModel != null) {
            intent.putExtra(ViewHierarchyConstants.TAG_KEY, userInfoModel);
        }
        context.startActivity(intent);
        return Unit.INSTANCE;
    }
}
