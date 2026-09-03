package com.app.base.fragment;

import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Lambda implements Function1<MomentDetailModel, Long> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooO0O0 f11610Oooo0o = new OooO0O0();

    public OooO0O0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(MomentDetailModel momentDetailModel) {
        long id;
        MomentDetailModel item = momentDetailModel;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getSendPostModel() != null) {
            MomentSendModel sendPostModel = item.getSendPostModel();
            Intrinsics.checkNotNull(sendPostModel);
            id = sendPostModel.getPostId();
        } else {
            id = item.getId();
        }
        return Long.valueOf(id);
    }
}
