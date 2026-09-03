package p142o00OOooO;

import android.content.Context;
import android.os.Handler;
import android.widget.EditText;
import com.app.base.fragment.MomentListFeaturedFragment;
import com.app.base.mixedroom.MixedRoomMicView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0O0.o000O0Oo;
import p186o00o00Oo.o0ooOOo;
import p470o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O00O implements BaseQuickAdapter.OooOo, o0ooOOo, XRefreshLayout.OooO0OO, MixedRoomMicView.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f31945OooO0Oo;

    public /* synthetic */ o000O00O(Object obj) {
        this.f31945OooO0Oo = obj;
    }

    @Override // com.app.base.view.pullrefresh.XRefreshLayout.OooO0OO
    public final void OooO0OO() {
        TopicSearchActivity this$0 = (TopicSearchActivity) this.f31945OooO0Oo;
        TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22654OooooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EditText view = this$0.OooOooO().f50444OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.etSearch");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        o00O000.OooO00o(context).hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        MomentListFeaturedFragment.m42initView$lambda9((MomentListFeaturedFragment) this.f31945OooO0Oo);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        PostDetailCommentSonListActivity this$0 = (PostDetailCommentSonListActivity) this.f31945OooO0Oo;
        PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Oooo0o();
    }
}
