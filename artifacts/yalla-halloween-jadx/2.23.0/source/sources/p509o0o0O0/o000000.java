package p509o0o0O0;

import android.app.Activity;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f50424OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50425OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f50426OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f50427OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Activity f50428OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f50429OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f50430OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f50431OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f50432OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f50433OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Long f50434OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000000(MomentDetailModel momentDetailModel, boolean z, MomentAdapterTag momentAdapterTag, Activity activity, Long l, boolean z2, String str, ArrayList<String> arrayList, BaseMomentDetailVM baseMomentDetailVM, Long l2, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2) {
        super(0);
        this.f50425OooO0Oo = momentDetailModel;
        this.f50427OooO0o0 = z;
        this.f50426OooO0o = momentAdapterTag;
        this.f50428OooO0oO = activity;
        this.f50429OooO0oo = l;
        this.f50424OooO = z2;
        this.f50430OooOO0 = str;
        this.f50431OooOO0O = arrayList;
        this.f50432OooOO0o = baseMomentDetailVM;
        this.f50434OooOOO0 = l2;
        this.f50433OooOOO = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000OOo onLogin = new o000OOo(this.f50425OooO0Oo, this.f50427OooO0o0, this.f50426OooO0o, this.f50428OooO0oO, this.f50429OooO0oo, this.f50424OooO, this.f50430OooOO0, this.f50431OooOO0O, this.f50432OooOO0o, this.f50434OooOOO0, this.f50433OooOOO);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
        } else {
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
