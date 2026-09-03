package p538o0o0Oo0;

import android.content.Intent;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p150o00Oo0Oo.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0O extends Lambda implements Function2<Integer, Intent, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f44105Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
        super(2);
        this.f44105Oooo0o = postDetailCommentSonListActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Intent intent) {
        Intent intent2 = intent;
        this.f44105Oooo0o.f22489o00oO0o = false;
        if (intent2 != null) {
            FriendInfo friendInfo = (FriendInfo) intent2.getSerializableExtra("Data");
            if (friendInfo != null) {
                EditTextSpan editTextSpan = this.f44105Oooo0o.Oooo000().f49456OooO0Oo;
                UserInfo userInfo = friendInfo.getUserInfo();
                Intrinsics.checkNotNull(userInfo);
                String userName = userInfo.getUserName();
                UserInfo userInfo2 = friendInfo.getUserInfo();
                Intrinsics.checkNotNull(userInfo2);
                editTextSpan.OooO00o("@", new OooOo(userName, userInfo2.getUserId()));
            }
            this.f44105Oooo0o.Oooo000().f49456OooO0Oo.postDelayed(new o00OO0OO(this.f44105Oooo0o, 0), 200L);
        }
        return Unit.INSTANCE;
    }
}
