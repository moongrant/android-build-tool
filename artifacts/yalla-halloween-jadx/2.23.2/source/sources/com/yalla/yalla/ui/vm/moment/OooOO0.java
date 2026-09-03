package com.yalla.yalla.ui.vm.moment;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.topic.TopicGroupJoinModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;
import p614o0oo0o.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function1<TopicGroupJoinModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicGroupJoinVM f31819OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(TopicGroupJoinVM topicGroupJoinVM) {
        super(1);
        this.f31819OooO0Oo = topicGroupJoinVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupJoinModel topicGroupJoinModel) {
        TopicGroupJoinModel it = topicGroupJoinModel;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicGroupJoinVM topicGroupJoinVM = this.f31819OooO0Oo;
        if (topicGroupJoinVM.getTopicGroupInfoModel().getIsDisbanded()) {
            String strOooO0OO = o0000.OooO0OO(o000000.topic_group_join_dissolved);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            topicGroupJoinVM.isDisbanded().setValue(Boolean.TRUE);
        } else {
            o000oOoO.OooO00o.OooO00o(o000oOoO.f57513OooO0O0, new OooO(topicGroupJoinVM));
        }
        return Unit.INSTANCE;
    }
}
