package com.yalla.yalla.ui.activity.moment;

import com.yalla.yalla.model.topic.TopicInfoModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAddTopicListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/AddTopicListActivity$loadRecommendList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,556:1\n1864#2,3:557\n*S KotlinDebug\n*F\n+ 1 AddTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/AddTopicListActivity$loadRecommendList$1\n*L\n255#1:557,3\n*E\n"})
public final class OooOO0 extends Lambda implements Function1<List<TopicInfoModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f25775OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(AddTopicListActivity addTopicListActivity) {
        super(1);
        this.f25775OooO0Oo = addTopicListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<TopicInfoModel> list) {
        List<TopicInfoModel> list2 = list;
        if (list2 != null) {
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
                if (i == 0) {
                    topicInfoModel.setTitleLocal(true);
                }
                i = i2;
            }
        }
        ((AddTopicListActivity.OooO00o) this.f25775OooO0Oo.f25567OooOo0O.getValue()).OooOoO0(list2);
        return Unit.INSTANCE;
    }
}
