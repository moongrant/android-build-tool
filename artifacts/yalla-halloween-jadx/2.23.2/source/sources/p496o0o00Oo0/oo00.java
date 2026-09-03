package p496o0o00Oo0;

import android.view.View;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49675OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00(MomentReplyHeaderView momentReplyHeaderView) {
        super(1);
        this.f49675OooO0Oo = momentReplyHeaderView;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        boolean z;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentReplyHeaderView momentReplyHeaderView = this.f49675OooO0Oo;
        MomentCommentDetailModel momentCommentDetailModel = momentReplyHeaderView.f26004OooO0oo;
        if (momentCommentDetailModel != null) {
            z = momentCommentDetailModel.isHide();
        }
        if (!z) {
            MomentReplyActivity activity = momentReplyHeaderView.getActivity();
            if (!activity.OooOoo0().getIsFromPostDetail()) {
                int i = MomentDetailActivity.f25608Oooo0;
                MomentDetailActivity.OooO00o.OooO00o(activity, activity.OooOoO().getCurrentMomentDetail(), (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 4) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 8) != 0 ? 1 : 0, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 16) != 0 ? null : null, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 32) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 64) != 0 ? null : MomentAdapterTag.MomentSonMessageList, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 128) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? "" : null);
            }
        }
        return Unit.INSTANCE;
    }
}
