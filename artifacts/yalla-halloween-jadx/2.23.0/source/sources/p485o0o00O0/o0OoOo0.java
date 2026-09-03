package p485o0o00O0;

import android.content.Intent;
import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.model.topic.TopicVerifyState;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function1<TopicVerifyState, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f48005OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f48006OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(AddTopicListActivity addTopicListActivity, TopicInfoModel topicInfoModel) {
        super(1);
        this.f48005OooO0Oo = addTopicListActivity;
        this.f48006OooO0o0 = topicInfoModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicVerifyState topicVerifyState) {
        TopicVerifyState topicVerifyState2 = topicVerifyState;
        Integer numValueOf = topicVerifyState2 != null ? Integer.valueOf(topicVerifyState2.getState()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            Intent intentPutExtra = new Intent().putExtra("Data", this.f48006OooO0o0);
            AddTopicListActivity addTopicListActivity = this.f48005OooO0Oo;
            addTopicListActivity.setResult(-1, intentPutExtra);
            addTopicListActivity.finish();
        } else {
            boolean z = true;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.You_can_not_add_this_topic_to_your_posts_Please_contact_the_topic_host);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Topic_Disband);
                if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
