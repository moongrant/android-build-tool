package p509o0o0O0;

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
import p515o0o0O0O0.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f50435OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50436OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f50437OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f50438OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Activity f50439OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f50440OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f50441OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f50442OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f50443OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f50444OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Long f50445OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000000O(MomentDetailModel momentDetailModel, boolean z, MomentAdapterTag momentAdapterTag, Activity activity, Long l, boolean z2, String str, ArrayList<String> arrayList, BaseMomentDetailVM baseMomentDetailVM, Long l2, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2) {
        super(1);
        this.f50436OooO0Oo = momentDetailModel;
        this.f50438OooO0o0 = z;
        this.f50437OooO0o = momentAdapterTag;
        this.f50439OooO0oO = activity;
        this.f50440OooO0oo = l;
        this.f50435OooO = z2;
        this.f50441OooOO0 = str;
        this.f50442OooOO0O = arrayList;
        this.f50443OooOO0o = baseMomentDetailVM;
        this.f50445OooOOO0 = l2;
        this.f50444OooOOO = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        Oooo000.OooO0OO(it, this.f50436OooO0Oo, this.f50438OooO0o0, this.f50437OooO0o, this.f50439OooO0oO, this.f50440OooO0oo, this.f50435OooO, this.f50441OooOO0, this.f50442OooOO0O, this.f50443OooOO0o, this.f50445OooOOO0, false, this.f50444OooOOO);
        return Unit.INSTANCE;
    }
}
