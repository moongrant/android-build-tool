package com.yalla.yalla.ui.activity.moment.momentSend;

import com.yalla.yalla.model.MomentSelectMedia;
import kotlin.jvm.internal.Intrinsics;
import p417o0OoO0.o0000O0O;
import p670oOooo0o.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends o0000Ooo<MomentSelectMedia> {
    @Override // p670oOooo0o.o0000Ooo
    public final int OooO00o(MomentSelectMedia momentSelectMedia) {
        long jLongValue;
        MomentSelectMedia momentSelectMedia2 = momentSelectMedia;
        if (o0000O0O.OooO0o(momentSelectMedia2.getPath())) {
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
        return o0000O0O.OooO0o(momentSelectMedia2.getPath()) ? MomentSendImageAdapter.MomentSendMediaType.Image.getValue() : MomentSendImageAdapter.MomentSendMediaType.Add.getValue();
    }
}
