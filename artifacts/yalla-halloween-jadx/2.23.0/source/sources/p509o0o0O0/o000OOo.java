package p509o0o0O0;

import android.app.Activity;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p515o0o0O0O0.Oooo000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f50657OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50658OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f50659OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f50660OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Activity f50661OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f50662OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f50663OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f50664OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f50665OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f50666OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Long f50667OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000OOo(MomentDetailModel momentDetailModel, boolean z, MomentAdapterTag momentAdapterTag, Activity activity, Long l, boolean z2, String str, ArrayList<String> arrayList, BaseMomentDetailVM baseMomentDetailVM, Long l2, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2) {
        super(0);
        this.f50658OooO0Oo = momentDetailModel;
        this.f50660OooO0o0 = z;
        this.f50659OooO0o = momentAdapterTag;
        this.f50661OooO0oO = activity;
        this.f50662OooO0oo = l;
        this.f50657OooO = z2;
        this.f50663OooOO0 = str;
        this.f50664OooOO0O = arrayList;
        this.f50665OooOO0o = baseMomentDetailVM;
        this.f50667OooOOO0 = l2;
        this.f50666OooOOO = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (o0OoOo0.OooO00o(Boolean.valueOf(MomentStateKt.isApprovedState(this.f50658OooO0Oo)))) {
            Oooo000.OooO0OO(null, this.f50658OooO0Oo, this.f50660OooO0o0, this.f50659OooO0o, this.f50661OooO0oO, this.f50662OooO0oo, this.f50657OooO, this.f50663OooOO0, this.f50664OooOO0O, this.f50665OooOO0o, this.f50667OooOOO0, false, this.f50666OooOOO);
        } else {
            o000O00O.OooO00o(oO00OOo0.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
