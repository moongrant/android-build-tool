package com.yalla.yalla.model.gift;

import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getRegion", "", "Lcom/yalla/yalla/model/gift/GiftPropTypeShow;", "Common_YallaRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GiftPropTypeShowKt {
    /* JADX WARN: Code duplicated, block: B:10:0x002e A[PHI: r2
      0x002e: PHI (r2v6 java.lang.Integer) = (r2v4 java.lang.Integer), (r2v11 java.lang.Integer) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int getRegion(@NotNull GiftPropTypeShow giftPropTypeShow) {
        Integer value;
        Intrinsics.checkNotNullParameter(giftPropTypeShow, "<this>");
        Integer num = 0;
        if (giftPropTypeShow == GiftPropTypeShow.InRoom) {
            value = OooO0O0.f24995OoooOOO.OooO00o().f25003OooO0o0.getValue();
            if (value != null) {
                num = value;
            }
        } else {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            value = (Integer) o000000O.OooOOO0().getValue();
            if (value != null) {
                num = value;
            }
        }
        return num.intValue();
    }
}
