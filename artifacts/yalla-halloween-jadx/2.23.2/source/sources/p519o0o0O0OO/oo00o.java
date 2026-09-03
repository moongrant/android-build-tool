package p519o0o0O0OO;

import android.app.Activity;
import com.code.android.util.o000O00;
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
import p521o0o0O0o0.o000000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f52711OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52712OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f52713OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f52714OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Activity f52715OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f52716OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f52717OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f52718OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f52719OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f52720OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Long f52721OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo00o(MomentDetailModel momentDetailModel, boolean z, MomentAdapterTag momentAdapterTag, Activity activity, Long l, boolean z2, String str, ArrayList<String> arrayList, BaseMomentDetailVM baseMomentDetailVM, Long l2, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2) {
        super(0);
        this.f52712OooO0Oo = momentDetailModel;
        this.f52714OooO0o0 = z;
        this.f52713OooO0o = momentAdapterTag;
        this.f52715OooO0oO = activity;
        this.f52716OooO0oo = l;
        this.f52711OooO = z2;
        this.f52717OooOO0 = str;
        this.f52718OooOO0O = arrayList;
        this.f52719OooOO0o = baseMomentDetailVM;
        this.f52721OooOOO0 = l2;
        this.f52720OooOOO = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (o0OoOo0.OooO00o(Boolean.valueOf(MomentStateKt.isApprovedState(this.f52712OooO0Oo)))) {
            o000000O.OooO0OO(null, this.f52712OooO0Oo, this.f52714OooO0o0, this.f52713OooO0o, this.f52715OooO0oO, this.f52716OooO0oo, this.f52711OooO, this.f52717OooOO0, this.f52718OooOO0O, this.f52719OooOO0o, this.f52721OooOOO0, false, this.f52720OooOOO);
        } else {
            o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
