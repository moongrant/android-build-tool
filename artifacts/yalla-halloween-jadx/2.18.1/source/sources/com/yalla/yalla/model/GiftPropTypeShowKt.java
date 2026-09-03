package com.yalla.yalla.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getRegion", "", "Lcom/yalla/yalla/model/GiftPropTypeShow;", "app_YallaRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class GiftPropTypeShowKt {
    public static final int getRegion(@NotNull GiftPropTypeShow giftPropTypeShow) {
        Integer value;
        Intrinsics.checkNotNullParameter(giftPropTypeShow, "<this>");
        Integer num = 0;
        if (giftPropTypeShow != GiftPropTypeShow.InRoom ? (value = OooOOO.f41216OooO00o.OooOOO().getValue()) != null : (value = o00OO00O.f43313OooooOo.OooO00o().f43321OooO0o0.getValue()) != null) {
            num = value;
        }
        return num.intValue();
    }
}
