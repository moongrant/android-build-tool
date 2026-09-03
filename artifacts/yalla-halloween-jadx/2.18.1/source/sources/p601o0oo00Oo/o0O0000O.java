package p601o0oo00Oo;

import android.app.Activity;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentEditBefore;
import com.yalla.yalla.model.MomentSendShareModel;
import com.yalla.yalla.model.MomentSendShareType;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p522o0o0O0o.o00O0;
import p522o0o0O0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0000O extends Lambda implements Function1<MomentEditBefore, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48167Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f48168Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0000O(MomentDetailView momentDetailView, MomentDetailModel momentDetailModel) {
        super(1);
        this.f48167Oooo0o = momentDetailView;
        this.f48168Oooo0oO = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentEditBefore momentEditBefore) {
        MomentEditBefore momentEditBefore2 = momentEditBefore;
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
        Activity context = this.f48167Oooo0o.getActivity();
        MomentDetailModel data = this.f48168Oooo0oO;
        MomentAdapterTag momentAdapterTag = this.f48167Oooo0o.f24938Oooo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        MomentSendShareModel momentSendShareModel = new MomentSendShareModel(data.getType());
        momentSendShareModel.setSharePostType(MomentSendShareType.EditPostLocal);
        momentSendShareModel.setEditMomentDetailModel(data);
        momentSendShareModel.setMomentAdapterTag(momentAdapterTag);
        momentSendShareModel.setEditToken(o00O0.OooO0oO(momentEditBefore2 != null ? momentEditBefore2.getEditToken() : null));
        momentSendShareModel.setEditedNum(Integer.valueOf(oOO00O.OooO0Oo(momentEditBefore2 != null ? Integer.valueOf(momentEditBefore2.getEditedNum()) : null, 0)));
        momentSendShareModel.setEditMaxNum(Integer.valueOf(oOO00O.OooO0Oo(momentEditBefore2 != null ? Integer.valueOf(momentEditBefore2.getEditMaxNum()) : null, 0)));
        oooO00o.OooO0O0(context, momentSendShareModel);
        return Unit.INSTANCE;
    }
}
