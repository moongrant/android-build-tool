package com.yalla.yalla.ui.activity.message;

import android.os.Looper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f25988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25989OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f25990OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, ShareToFriendsActivity shareToFriendsActivity) {
        super(1);
        this.f25988OooO0Oo = momentDetailModel;
        this.f25990OooO0o0 = momentAdapterTag;
        this.f25989OooO0o = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.has_share_friends);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            MomentDetailModel momentDetailModel = this.f25988OooO0Oo;
            if (momentDetailModel.getType() == MomentType.Video.getValue()) {
                if (this.f25990OooO0o0 == MomentAdapterTag.VideoFeedList) {
                    p587o0oOooo.o0OO000.OooO0OO("106060", MapsKt.mapOf(p039OoooOoo.o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                } else {
                    p587o0oOooo.o0OO000.OooO0OO("106062", MapsKt.mapOf(p039OoooOoo.o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
                }
                LiveEventBus.get("SHARE_VIDEO_POST_SUCCESS").post(Long.valueOf(momentDetailModel.getId()));
            }
        }
        this.f25989OooO0o.finish();
        return Unit.INSTANCE;
    }
}
