package p566o0oOo00O;

import android.view.View;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOo0O0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45347Oooo;

    public o0oOo0O0(UserInfoEditActivity userInfoEditActivity) {
        this.f45347Oooo = userInfoEditActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f45347Oooo.Oooo00o();
        UserInfoEditActivity userInfoEditActivity = this.f45347Oooo;
        Objects.requireNonNull(userInfoEditActivity);
        UserCountrySelectActivity.OooOoO(userInfoEditActivity, true, false);
    }
}
