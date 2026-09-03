package p528o0o0OOOo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f54374OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54375OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54376OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<LayoutCoordinates> f54377OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000o0(MutableState mutableState, LifecycleOwner lifecycleOwner, MomentReplyModel momentReplyModel, MomentVideoVM momentVideoVM) {
        super(0);
        this.f54374OooO0Oo = momentReplyModel;
        this.f54376OooO0o0 = momentVideoVM;
        this.f54375OooO0o = lifecycleOwner;
        this.f54377OooO0oO = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyModel item = this.f54374OooO0Oo;
        item.getLocalSendRewardIsIn().setValue(Boolean.TRUE);
        MutableState<Boolean> isInReward = item.getLocalSendRewardIsIn();
        MutableState<Boolean> showRewardAnim = item.getLocalShowRewardAnim();
        LayoutCoordinates value = this.f54377OooO0oO.getValue();
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(isInReward, "isInReward");
        MomentVideoVM videoVM = this.f54376OooO0o0;
        Intrinsics.checkNotNullParameter(videoVM, "videoVM");
        LifecycleOwner lifecycleOwner = this.f54375OooO0o;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(showRewardAnim, "showRewardAnim");
        videoVM.commentSendProp(String.valueOf(item.getId()), String.valueOf(item.getUserid())).observe(lifecycleOwner, new o0000OO0(new oO0Oo0o0(showRewardAnim, item, videoVM, value), null, new oO0o0000(isInReward, null), false));
        return Unit.INSTANCE;
    }
}
