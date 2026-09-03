package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<Long> f26848OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MemberListRemoveActivity f26849OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(ArrayList arrayList, MemberListRemoveActivity memberListRemoveActivity) {
        super(1);
        this.f26848OooO0Oo = arrayList;
        this.f26849OooO0o0 = memberListRemoveActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.room_member_remove_success);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        LiveEventBus.get("ROOM_MEMBER_DELETE").post(this.f26848OooO0Oo);
        this.f26849OooO0o0.finish();
        return Unit.INSTANCE;
    }
}
