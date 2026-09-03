package com.yalla.yalla.module.event.ui.screen;

import com.yalla.yalla.module.event.vm.EventDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f23869OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f23870OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(EventDetailViewModel eventDetailViewModel, CoroutineScope coroutineScope) {
        super(0);
        this.f23869OooO0Oo = eventDetailViewModel;
        this.f23870OooO0o0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventDetailScreen.INSTANCE.toolbarMenuDialog(this.f23869OooO0Oo, this.f23870OooO0o0);
        return Unit.INSTANCE;
    }
}
