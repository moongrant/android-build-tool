package p528o0o0OOOo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f54124OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54125OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54126OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0000(MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f54124OooO0Oo = momentCommentDetailModel;
        this.f54126OooO0o0 = momentVideoVM;
        this.f54125OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentCommentDetailModel item = this.f54124OooO0Oo;
        item.getLocalSendRewardIsIn().setValue(Boolean.TRUE);
        MutableState<Boolean> isInReward = item.getLocalSendRewardIsIn();
        MutableState<Boolean> showRewardAnim = item.getLocalShowRewardAnim();
        MomentVideoVM videoVM = this.f54126OooO0o0;
        LayoutCoordinates sendRewardDialogCommentLayoutCoordinates = videoVM.getSendRewardDialogCommentLayoutCoordinates();
        oOO00000 ooo00000 = new oOO00000(videoVM);
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(isInReward, "isInReward");
        Intrinsics.checkNotNullParameter(videoVM, "videoVM");
        LifecycleOwner lifecycleOwner = this.f54125OooO0o;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(showRewardAnim, "showRewardAnim");
        videoVM.commentSendProp(String.valueOf(item.getId()), String.valueOf(item.getUserid())).observe(lifecycleOwner, new o0000OO0(new oO0OO00(showRewardAnim, item, videoVM, sendRewardDialogCommentLayoutCoordinates), null, new oO0OO0O(isInReward, ooo00000), false));
        return Unit.INSTANCE;
    }
}
