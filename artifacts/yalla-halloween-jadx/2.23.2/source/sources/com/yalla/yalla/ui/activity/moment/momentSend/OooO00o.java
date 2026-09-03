package com.yalla.yalla.ui.activity.moment.momentSend;

import com.yalla.yalla.model.MomentSelectMedia;
import kotlin.jvm.internal.Intrinsics;
import p180o00o000.OooO0O0;
import p423o0OoO0OO.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends OooO0O0<MomentSelectMedia> {
    @Override // p180o00o000.OooO0O0
    public final int OooO00o(MomentSelectMedia momentSelectMedia) {
        long jLongValue;
        MomentSelectMedia momentSelectMedia2 = momentSelectMedia;
        if (o00O00OO.OooO0o(momentSelectMedia2.getPath())) {
            Long lValueOf = Long.valueOf(momentSelectMedia2.getDuration());
            if (lValueOf == null) {
                jLongValue = 0;
            } else {
                Intrinsics.checkNotNull(lValueOf);
                jLongValue = lValueOf.longValue();
            }
            if (jLongValue > 0) {
                return MomentSendImageAdapter.MomentSendMediaType.Video.getValue();
            }
        }
        return o00O00OO.OooO0o(momentSelectMedia2.getPath()) ? MomentSendImageAdapter.MomentSendMediaType.Image.getValue() : MomentSendImageAdapter.MomentSendMediaType.Add.getValue();
    }
}
