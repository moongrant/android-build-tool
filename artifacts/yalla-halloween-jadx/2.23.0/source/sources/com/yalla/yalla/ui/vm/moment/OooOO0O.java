package com.yalla.yalla.ui.vm.moment;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.topic.TopicGroupJoinModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;
import p602o0oo0O0O.o000OO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O extends Lambda implements Function1<TopicGroupJoinModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicGroupJoinVM f32355OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(TopicGroupJoinVM topicGroupJoinVM) {
        super(1);
        this.f32355OooO0Oo = topicGroupJoinVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupJoinModel topicGroupJoinModel) {
        TopicGroupJoinModel it = topicGroupJoinModel;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicGroupJoinVM topicGroupJoinVM = this.f32355OooO0Oo;
        if (topicGroupJoinVM.getTopicGroupInfoModel().getIsDisbanded()) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.topic_group_join_dissolved);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            topicGroupJoinVM.isDisbanded().setValue(Boolean.TRUE);
        } else {
            o000OO.OooO00o.OooO00o(o000OO.f56890OooO0O0, new OooOO0(topicGroupJoinVM));
        }
        return Unit.INSTANCE;
    }
}
