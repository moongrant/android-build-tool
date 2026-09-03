package com.yalla.yalla.ui.vm.moment;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.model.TopicGroupJoinModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p254o00ooO0O.o000O0O0;
import p623o0oo0oO0.o0000O0;
import p623o0oo0oO0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends Lambda implements Function1<TopicGroupJoinModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicGroupJoinVM f25899Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(TopicGroupJoinVM topicGroupJoinVM) {
        super(1);
        this.f25899Oooo0o = topicGroupJoinVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicGroupJoinModel topicGroupJoinModel) {
        TopicGroupJoinModel it = topicGroupJoinModel;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.f25899Oooo0o.getTopicGroupInfoModel().getIsDisbanded()) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.topic_group_join_dissolved));
            this.f25899Oooo0o.isDisbanded().setValue(Boolean.TRUE);
        } else {
            OooO0o action = new OooO0o(this.f25899Oooo0o);
            o0000oo notInstall = o0000oo.f48642Oooo0o;
            Intrinsics.checkNotNullParameter(notInstall, "notInstall");
            Intrinsics.checkNotNullParameter(action, "action");
            if (PackManager.INSTANCE.isInstalledYallaChat()) {
                action.invoke();
            } else {
                notInstall.invoke();
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0.OooO00o.C0419OooO00o(null), 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
