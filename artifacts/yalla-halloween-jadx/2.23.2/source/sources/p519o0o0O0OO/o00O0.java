package p519o0o0O0OO;

import android.app.Activity;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p521o0o0O0o0.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f51999OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52000OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f52001OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f52002OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Activity f52003OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f52004OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f52005OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f52006OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f52007OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f52008OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Long f52009OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0(MomentDetailModel momentDetailModel, boolean z, MomentAdapterTag momentAdapterTag, Activity activity, Long l, boolean z2, String str, ArrayList<String> arrayList, BaseMomentDetailVM baseMomentDetailVM, Long l2, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2) {
        super(1);
        this.f52000OooO0Oo = momentDetailModel;
        this.f52002OooO0o0 = z;
        this.f52001OooO0o = momentAdapterTag;
        this.f52003OooO0oO = activity;
        this.f52004OooO0oo = l;
        this.f51999OooO = z2;
        this.f52005OooOO0 = str;
        this.f52006OooOO0O = arrayList;
        this.f52007OooOO0o = baseMomentDetailVM;
        this.f52009OooOOO0 = l2;
        this.f52008OooOOO = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        o000000O.OooO0OO(it, this.f52000OooO0Oo, this.f52002OooO0o0, this.f52001OooO0o, this.f52003OooO0oO, this.f52004OooO0oo, this.f51999OooO, this.f52005OooOO0, this.f52006OooOO0O, this.f52007OooOO0o, this.f52009OooOOO0, false, this.f52008OooOOO);
        return Unit.INSTANCE;
    }
}
