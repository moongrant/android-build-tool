package p528o0o0OOOo;

import androidx.appcompat.app.AppCompatActivity;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p039OoooOoo.o00OO;
import p515o0o0O0O0.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54389OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54390OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f54391OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentDetailModel, Unit> f54392OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOo0o00(MomentDetailModel momentDetailModel, AppCompatActivity appCompatActivity, MomentVideoVM momentVideoVM, Function1<? super MomentDetailModel, Unit> function1) {
        super(0);
        this.f54389OooO0Oo = momentDetailModel;
        this.f54391OooO0o0 = appCompatActivity;
        this.f54390OooO0o = momentVideoVM;
        this.f54392OooO0oO = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailModel momentDetailModel = this.f54389OooO0Oo;
        if (MomentStateKt.isApprovedState(momentDetailModel)) {
            AppCompatActivity appCompatActivity = this.f54391OooO0o0;
            momentDetailModel.setType(MomentType.Video.getValue());
            Unit unit = Unit.INSTANCE;
            o000OOo.OooO00o(appCompatActivity, momentDetailModel, MomentAdapterTag.VideoFeedList, this.f54390OooO0o, oOOo0000.f54359OooO0Oo, new oOOo0O00(this.f54392OooO0oO, momentDetailModel));
            o0OO000.OooO0O0("106059", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        } else {
            o000O00O.OooO00o(oO00OOo0.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
