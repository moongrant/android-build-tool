package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p656o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends o00Oo0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Context f25052OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ AddedTopicHeadView f25053OoooO0O;

    public OooO00o(AddedTopicHeadView addedTopicHeadView, Context context) {
        this.f25053OoooO0O = addedTopicHeadView;
        this.f25052OoooO = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    @Override // p656o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Context context;
        Context context2;
        Context context3;
        Intrinsics.checkNotNullParameter(view, "view");
        switch (view.getId()) {
            case R.id.click_member_0 /* 2131296660 */:
                if (this.f25053OoooO0O.f24782OoooO0.size() > 0 && (context = this.f25052OoooO) != null) {
                    TopicDetailActivity.f22586o00Oo0.OooO00o(context, (TopicInfoModel) this.f25053OoooO0O.f24782OoooO0.get(0));
                    break;
                }
                break;
            case R.id.click_member_1 /* 2131296661 */:
                if (this.f25053OoooO0O.f24782OoooO0.size() > 1 && (context2 = this.f25052OoooO) != null) {
                    TopicDetailActivity.f22586o00Oo0.OooO00o(context2, (TopicInfoModel) this.f25053OoooO0O.f24782OoooO0.get(1));
                    break;
                }
                break;
            case R.id.click_member_2 /* 2131296662 */:
                if (this.f25053OoooO0O.f24782OoooO0.size() > 2 && (context3 = this.f25052OoooO) != null) {
                    TopicDetailActivity.f22586o00Oo0.OooO00o(context3, (TopicInfoModel) this.f25053OoooO0O.f24782OoooO0.get(2));
                    break;
                }
                break;
            case R.id.layout /* 2131298035 */:
            case R.id.more /* 2131298571 */:
            case R.id.title /* 2131299260 */:
                Context context4 = this.f25052OoooO;
                if (context4 != null) {
                    AddedTopicHeadView addedTopicHeadView = this.f25053OoooO0O;
                    JoinTopicListActivity.OooO00o oooO00o = JoinTopicListActivity.f22318Ooooooo;
                    String str = addedTopicHeadView.f24783OoooO00;
                    Intrinsics.checkNotNullParameter(context4, "context");
                    Intent intent = new Intent(context4, (Class<?>) JoinTopicListActivity.class);
                    intent.putExtra("Id", str);
                    context4.startActivity(intent);
                }
                break;
        }
    }
}
