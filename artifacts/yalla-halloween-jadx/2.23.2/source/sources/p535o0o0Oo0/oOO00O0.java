package p535o0o0Oo0;

import androidx.appcompat.app.AppCompatActivity;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.activity.message.o0oOO;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p521o0o0O0o0.o000O000;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54212OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54213OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f54214OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentDetailModel, Unit> f54215OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOO00O0(MomentDetailModel momentDetailModel, AppCompatActivity appCompatActivity, MomentVideoVM momentVideoVM, Function1<? super MomentDetailModel, Unit> function1) {
        super(0);
        this.f54212OooO0Oo = momentDetailModel;
        this.f54214OooO0o0 = appCompatActivity;
        this.f54213OooO0o = momentVideoVM;
        this.f54215OooO0oO = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailModel momentDetailModel = this.f54212OooO0Oo;
        if (MomentStateKt.isApprovedState(momentDetailModel)) {
            AppCompatActivity appCompatActivity = this.f54214OooO0o0;
            momentDetailModel.setType(MomentType.Video.getValue());
            Unit unit = Unit.INSTANCE;
            o000O000.OooO00o(appCompatActivity, momentDetailModel, MomentAdapterTag.VideoFeedList, this.f54213OooO0o, oOO000o.f54211OooO0Oo, new oOO00(this.f54215OooO0oO, momentDetailModel));
            OooO00o.OooO0OO("106059", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        } else {
            o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
