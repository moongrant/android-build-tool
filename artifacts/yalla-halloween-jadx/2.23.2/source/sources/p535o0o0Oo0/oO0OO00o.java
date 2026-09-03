package p535o0o0Oo0;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f54094OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54095OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54096OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00o(MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f54094OooO0Oo = momentCommentDetailModel;
        this.f54096OooO0o0 = momentVideoVM;
        this.f54095OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentCommentDetailModel item = this.f54094OooO0Oo;
        item.getLocalSendRewardIsIn().setValue(Boolean.TRUE);
        MutableState<Boolean> isInReward = item.getLocalSendRewardIsIn();
        MutableState<Boolean> showRewardAnim = item.getLocalShowRewardAnim();
        MomentVideoVM videoVM = this.f54096OooO0o0;
        LayoutCoordinates sendRewardDialogCommentLayoutCoordinates = videoVM.getSendRewardDialogCommentLayoutCoordinates();
        oOo00ooO ooo00ooo = new oOo00ooO(videoVM);
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(isInReward, "isInReward");
        Intrinsics.checkNotNullParameter(videoVM, "videoVM");
        LifecycleOwner lifecycleOwner = this.f54095OooO0o;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(showRewardAnim, "showRewardAnim");
        videoVM.commentSendProp(String.valueOf(item.getId()), String.valueOf(item.getUserid())).observe(lifecycleOwner, new o000oOoO(new oOOoOOO0(showRewardAnim, item, videoVM, sendRewardDialogCommentLayoutCoordinates), null, new oO00o000(isInReward, ooo00ooo), false));
        return Unit.INSTANCE;
    }
}
