package com.yalla.yalla.ui.screen.moment.media;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentTypePraise;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;
import p528o0o0OOOo.oO00o000;
import p528o0o0OOOo.oOOoOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29419OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29420OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f29421OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f29422OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f29423OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29424OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(MutableState<Boolean> mutableState, MomentCommentDetailModel momentCommentDetailModel, MomentDetailModel momentDetailModel, MomentCommentsVM momentCommentsVM, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState2) {
        super(0);
        this.f29420OooO0Oo = mutableState;
        this.f29422OooO0o0 = momentCommentDetailModel;
        this.f29421OooO0o = momentDetailModel;
        this.f29423OooO0oO = momentCommentsVM;
        this.f29424OooO0oo = lifecycleOwner;
        this.f29419OooO = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Boolean bool = Boolean.TRUE;
        MutableState<Boolean> isInPraise = this.f29420OooO0Oo;
        isInPraise.setValue(bool);
        MomentCommentDetailModel item = this.f29422OooO0o0;
        Intrinsics.checkNotNullParameter(item, "item");
        MomentDetailModel momentDetail = this.f29421OooO0o;
        Intrinsics.checkNotNullParameter(momentDetail, "momentDetail");
        Intrinsics.checkNotNullParameter(isInPraise, "isInPraise");
        MomentCommentsVM vm = this.f29423OooO0oO;
        Intrinsics.checkNotNullParameter(vm, "vm");
        LifecycleOwner lifecycleOwner = this.f29424OooO0oo;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        MutableState<Boolean> showPraiseAnim = this.f29419OooO;
        Intrinsics.checkNotNullParameter(showPraiseAnim, "showPraiseAnim");
        int value = (item.isPraise() ? MomentTypePraise.Cancel : MomentTypePraise.Praise).getValue();
        vm.commentPraise(String.valueOf(item.getId()), value).observe(lifecycleOwner, new o0000OO0(new oOOoOOO0(showPraiseAnim, value, item, momentDetail), null, new oO00o000(isInPraise), false));
        return Unit.INSTANCE;
    }
}
