package com.yalla.yalla.ui.activity.moment;

import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.vm.moment.MomentRecordEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentRecordEditVM f25782OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f25783OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(MomentRecordEditVM momentRecordEditVM, long j) {
        super(0);
        this.f25782OooO0Oo = momentRecordEditVM;
        this.f25783OooO0o0 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f25782OooO0Oo.getContentState().setValue(ContentState.Loading);
        MomentRecordEditVM.loadData$default(this.f25782OooO0Oo, this.f25783OooO0o0, false, 2, null);
        return Unit.INSTANCE;
    }
}
