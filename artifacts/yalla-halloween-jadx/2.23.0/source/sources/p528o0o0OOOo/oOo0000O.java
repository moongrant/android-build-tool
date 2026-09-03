package p528o0o0OOOo;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.model.moment.MomentTypePraise;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54366OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54367OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54368OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f54369OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f54370OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54371OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0000O(MutableState<Boolean> mutableState, MomentReplyModel momentReplyModel, MomentDetailModel momentDetailModel, MomentCommentsVM momentCommentsVM, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState2) {
        super(0);
        this.f54367OooO0Oo = mutableState;
        this.f54369OooO0o0 = momentReplyModel;
        this.f54368OooO0o = momentDetailModel;
        this.f54370OooO0oO = momentCommentsVM;
        this.f54371OooO0oo = lifecycleOwner;
        this.f54366OooO = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Boolean bool = Boolean.TRUE;
        MutableState<Boolean> isInPraise = this.f54367OooO0Oo;
        isInPraise.setValue(bool);
        MomentReplyModel item = this.f54369OooO0o0;
        Intrinsics.checkNotNullParameter(item, "item");
        MomentDetailModel momentDetail = this.f54368OooO0o;
        Intrinsics.checkNotNullParameter(momentDetail, "momentDetail");
        Intrinsics.checkNotNullParameter(isInPraise, "isInPraise");
        MomentCommentsVM vm = this.f54370OooO0oO;
        Intrinsics.checkNotNullParameter(vm, "vm");
        LifecycleOwner lifecycleOwner = this.f54371OooO0oo;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        MutableState<Boolean> showPraiseAnim = this.f54366OooO;
        Intrinsics.checkNotNullParameter(showPraiseAnim, "showPraiseAnim");
        int value = (item.isPraise() ? MomentTypePraise.Cancel : MomentTypePraise.Praise).getValue();
        vm.commentPraise(String.valueOf(item.getId()), value).observe(lifecycleOwner, new o0000OO0(new oO00o00(showPraiseAnim, value, item, momentDetail), null, new oO0OOO00(isInPraise), false));
        return Unit.INSTANCE;
    }
}
