package com.yalla.yalla.ui.activity.moment;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicInfoModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function1<ApiResult<List<TopicInfoModel>>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f26225OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(AddTopicListActivity addTopicListActivity) {
        super(1);
        this.f26225OooO0Oo = addTopicListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<TopicInfoModel>> apiResult) {
        ApiResult<List<TopicInfoModel>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        AddTopicListActivity addTopicListActivity = this.f26225OooO0Oo;
        if (((AddTopicListActivity.OooO00o) addTopicListActivity.f26014OooOo0O.getValue()).getItemCount() < 1) {
            Lazy lazy = addTopicListActivity.f26012OooOo0;
            ((AddTopicListActivity.OooO00o) lazy.getValue()).f26026Oooo00o = true;
            ((AddTopicListActivity.OooO00o) lazy.getValue()).Oooo0o0(true);
        }
        addTopicListActivity.OooOoO0().f58802OooO0Oo.OooO0Oo();
        return Unit.INSTANCE;
    }
}
