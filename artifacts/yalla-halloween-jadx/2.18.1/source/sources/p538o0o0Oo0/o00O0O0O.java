package p538o0o0Oo0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p034OoooO0O.o0Oo0oo;
import p160o00OoOO0.o00OO0O0;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0O extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f43956OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f43957OooO0O0;

    public o00O0O0O(boolean z, PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
        this.f43956OooO00o = z;
        this.f43957OooO0O0 = postDetailCommentSonListActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        o00O00.OooO0O0("response = " + response);
        o0Oo0oo.OooO0o0(512, null);
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_DEL");
        if (this.f43956OooO00o) {
            this.f43957OooO0O0.finish();
            return;
        }
        PostDetailCommentSonListActivity postDetailCommentSonListActivity = this.f43957OooO0O0;
        PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
        postDetailCommentSonListActivity.Oooo0o();
    }
}
