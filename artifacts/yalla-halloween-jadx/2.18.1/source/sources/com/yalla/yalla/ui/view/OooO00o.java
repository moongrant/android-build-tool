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
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ AddedTopicHeadView f25033Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Context f25034OoooO00;

    public OooO00o(AddedTopicHeadView addedTopicHeadView, Context context) {
        this.f25033Oooo = addedTopicHeadView;
        this.f25034OoooO00 = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.TopicInfoModel>] */
    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Context context;
        Context context2;
        Context context3;
        Intrinsics.checkNotNullParameter(view, "view");
        switch (view.getId()) {
            case R.id.click_member_0 /* 2131296660 */:
                if (this.f25033Oooo.f24764Oooo0oo.size() > 0 && (context = this.f25034OoooO00) != null) {
                    TopicDetailActivity.f22567o0OoOo0.OooO00o(context, (TopicInfoModel) this.f25033Oooo.f24764Oooo0oo.get(0));
                    break;
                }
                break;
            case R.id.click_member_1 /* 2131296661 */:
                if (this.f25033Oooo.f24764Oooo0oo.size() > 1 && (context2 = this.f25034OoooO00) != null) {
                    TopicDetailActivity.f22567o0OoOo0.OooO00o(context2, (TopicInfoModel) this.f25033Oooo.f24764Oooo0oo.get(1));
                    break;
                }
                break;
            case R.id.click_member_2 /* 2131296662 */:
                if (this.f25033Oooo.f24764Oooo0oo.size() > 2 && (context3 = this.f25034OoooO00) != null) {
                    TopicDetailActivity.f22567o0OoOo0.OooO00o(context3, (TopicInfoModel) this.f25033Oooo.f24764Oooo0oo.get(2));
                    break;
                }
                break;
            case R.id.layout /* 2131298035 */:
            case R.id.more /* 2131298571 */:
            case R.id.title /* 2131299260 */:
                Context context4 = this.f25034OoooO00;
                if (context4 != null) {
                    AddedTopicHeadView addedTopicHeadView = this.f25033Oooo;
                    JoinTopicListActivity.OooO00o oooO00o = JoinTopicListActivity.f22299Oooooo0;
                    String str = addedTopicHeadView.f24763Oooo0oO;
                    Intrinsics.checkNotNullParameter(context4, "context");
                    Intent intent = new Intent(context4, (Class<?>) JoinTopicListActivity.class);
                    intent.putExtra("Id", str);
                    context4.startActivity(intent);
                }
                break;
        }
    }
}
