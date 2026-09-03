package p536o0o0OOoo;

import android.view.View;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43875Oooo;

    public u(PrivateChatActivity privateChatActivity) {
        this.f43875Oooo = privateChatActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PrivateChatActivity privateChatActivity = this.f43875Oooo;
        PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
        if (privateChatActivity.Oooo0O0().userInfo() != null) {
            UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23452o0ooOO0;
            PrivateChatActivity privateChatActivity2 = this.f43875Oooo;
            Objects.requireNonNull(privateChatActivity2);
            StringBuilder sb = new StringBuilder();
            UserInfo userInfo = this.f43875Oooo.Oooo0O0().userInfo();
            Intrinsics.checkNotNull(userInfo);
            sb.append(userInfo.getUserId());
            sb.append("");
            oooO00o2.OooO0OO(privateChatActivity2, sb.toString(), true, false, true, false);
        }
    }
}
