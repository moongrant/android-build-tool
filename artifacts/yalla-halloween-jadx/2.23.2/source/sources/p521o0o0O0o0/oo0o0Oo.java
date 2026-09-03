package p521o0o0O0o0;

import android.app.Activity;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentEditBefore;
import com.yalla.yalla.model.moment.MomentSendShareModel;
import com.yalla.yalla.model.moment.MomentSendShareType;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends Lambda implements Function1<MomentEditBefore, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f53068OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f53069OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f53070OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(Activity activity, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag) {
        super(1);
        this.f53068OooO0Oo = activity;
        this.f53070OooO0o0 = momentDetailModel;
        this.f53069OooO0o = momentAdapterTag;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentEditBefore momentEditBefore) {
        MomentEditBefore momentEditBefore2 = momentEditBefore;
        int i = MomentSendActivity.f25726Oooo0OO;
        Activity context = this.f53068OooO0Oo;
        Intrinsics.checkNotNullParameter(context, "context");
        MomentDetailModel data = this.f53070OooO0o0;
        Intrinsics.checkNotNullParameter(data, "data");
        MomentSendShareModel momentSendShareModel = new MomentSendShareModel(data.getType());
        momentSendShareModel.setSharePostType(MomentSendShareType.EditPostLocal);
        momentSendShareModel.setEditMomentDetailModel(data);
        momentSendShareModel.setMomentAdapterTag(this.f53069OooO0o);
        momentSendShareModel.setEditToken(o0OoOo0.OooOOO(momentEditBefore2 != null ? momentEditBefore2.getEditToken() : null, ""));
        momentSendShareModel.setEditedNum(Integer.valueOf(o0OoOo0.OooO0o0(0, momentEditBefore2 != null ? Integer.valueOf(momentEditBefore2.getEditedNum()) : null)));
        momentSendShareModel.setEditMaxNum(Integer.valueOf(o0OoOo0.OooO0o0(0, momentEditBefore2 != null ? Integer.valueOf(momentEditBefore2.getEditMaxNum()) : null)));
        MomentSendActivity.OooO00o.OooO0O0(context, momentSendShareModel);
        return Unit.INSTANCE;
    }
}
