package com.yalla.yalla.ui.activity.moment;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.moment.MomentSendShareModel;
import com.yalla.yalla.model.moment.MomentSendShareType;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.model.topic.TopicVerifyState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTopicDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicDetailActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailActivity$topicUserVerify$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,609:1\n1#2:610\n*E\n"})
public final class o0Oo0oo extends Lambda implements Function1<Response<TopicVerifyState>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f25992OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(TopicDetailActivity topicDetailActivity) {
        super(1);
        this.f25992OooO0Oo = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Response<TopicVerifyState> response) {
        TopicInfoModel topicInfoModel;
        Response<TopicVerifyState> response2 = response;
        if (response2.getIsSuccess()) {
            TopicVerifyState data = response2.getData();
            Intrinsics.checkNotNull(data);
            int state = data.getState();
            if (state != 0) {
                boolean z = true;
                if (state == 1) {
                    String strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.You_can_not_add_this_topic_to_your_posts_Please_contact_the_topic_host);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else if (state == 2) {
                    String strOooO0OO2 = o0000.OooO0OO(p562o0oOo000.o000000.Topic_Disband);
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                }
            } else {
                int i = TopicDetailActivity.f25854OooOoOO;
                TopicDetailActivity context = this.f25992OooO0Oo;
                Response response3 = (Response) context.OooOoo0().getTopicDetailLiveData().getValue();
                if (response3 != null && (topicInfoModel = (TopicInfoModel) response3.getData()) != null) {
                    int i2 = MomentSendActivity.f25726Oooo0OO;
                    Intrinsics.checkNotNullParameter(context, "context");
                    MomentSendShareModel momentSendShareModel = new MomentSendShareModel(MomentType.Topic.getValue());
                    momentSendShareModel.setSharePostType(MomentSendShareType.ShareTopic);
                    momentSendShareModel.setTopicInfoModel(topicInfoModel);
                    MomentSendActivity.OooO00o.OooO0O0(context, momentSendShareModel);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
