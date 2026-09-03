package com.yalla.yalla.ui.screen.event;

import android.content.Context;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.vm.event.EventDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p031OoooO.o0000O;
import p139o00OOOo0.o00000;
import p591o0oOooOo.j4;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f24661Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f24662Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(EventDetailViewModel eventDetailViewModel, CoroutineScope coroutineScope) {
        super(0);
        this.f24661Oooo0o = eventDetailViewModel;
        this.f24662Oooo0oO = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventDetailViewModel vm = this.f24661Oooo0o;
        CoroutineScope scope = this.f24662Oooo0oO;
        Intrinsics.checkNotNullParameter(vm, "vm");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        boolean isCanCopy = vm.getEventModel().getIsCanCopy();
        boolean isCanDelete = vm.getEventModel().getIsCanDelete();
        long creatorUserId = vm.getEventModel().getCreatorUserId();
        Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
        o00000 o00000Var = new o00000(contextOooO0O0, isCanCopy, isCanDelete, value == null || creatorUserId != value.longValue());
        o00000Var.OooOOoo(new j4(vm, scope));
        o00000Var.OooOOO0();
        return Unit.INSTANCE;
    }
}
