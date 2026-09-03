package com.yalla.yalla.ui.activity.message;

import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.data.db.table.SystemMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000o0 extends Lambda implements Function1<androidx.paging.o0OOO0o<SystemMessage>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f25932OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(SystemMessageActivity systemMessageActivity) {
        super(1);
        this.f25932OooO0Oo = systemMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(androidx.paging.o0OOO0o<SystemMessage> o0ooo0o2) {
        SystemMessageActivity systemMessageActivity = this.f25932OooO0Oo;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(systemMessageActivity), null, null, new o0O000Oo(systemMessageActivity, o0ooo0o2, null), 3, null);
        return Unit.INSTANCE;
    }
}
