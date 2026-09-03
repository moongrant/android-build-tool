package p536o0o0OOoo;

import android.view.View;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p391o0OOooOo.o0O00000;
import p563o0oOo0.o00O0000;
import p606o0oo0O.OooOo;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43796Oooo;

    public h1(ShareToFriendsActivity shareToFriendsActivity) {
        this.f43796Oooo = shareToFriendsActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0O00000.OooO0OO("InRoom_share_friends_MultiSelect");
        o00O0000 o00o0001 = this.f43796Oooo.f22218OoooooO;
        o00O0000 o00o0002 = null;
        if (o00o0001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0001 = null;
        }
        if (o00o0001.f45071OooOOo0) {
            o00O0000 o00o0003 = this.f43796Oooo.f22218OoooooO;
            if (o00o0003 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o00o0002 = o00o0003;
            }
            if (!o00o0002.f45070OooOOo.isEmpty()) {
                this.f43796Oooo.Oooo0(0L, "", "");
            }
        } else {
            HeaderLayout headerLayout = this.f43796Oooo.f11463OoooO;
            if (headerLayout != null) {
                headerLayout.setNavigationIcon(R.drawable.icon_room_share_back);
            }
            o00O0000 o00o0004 = this.f43796Oooo.f22216Oooooo;
            if (o00o0004 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                o00o0004 = null;
            }
            o00o0004.OooO0oo(true);
            o00O0000 o00o0005 = this.f43796Oooo.f22218OoooooO;
            if (o00o0005 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o00o0002 = o00o0005;
            }
            o00o0002.OooO0oo(true);
        }
        ShareToFriendsActivity.OooOooO(this.f43796Oooo);
        OooOo.OooO0O0("102259");
    }
}
