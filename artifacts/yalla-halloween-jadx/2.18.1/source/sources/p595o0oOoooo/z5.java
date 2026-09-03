package p595o0oOoooo;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.vm.report.ReportVm;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class z5 extends Lambda implements Function1<List<? extends UserInfoModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f47624Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ReportVm f47625Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(String str, ReportVm reportVm) {
        super(1);
        this.f47624Oooo0o = str;
        this.f47625Oooo0oO = reportVm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends UserInfoModel> list) {
        List<? extends UserInfoModel> list2 = list;
        if ((list2 == null || list2.isEmpty()) || !Intrinsics.areEqual(list2.get(0).getUserIdx(), this.f47624Oooo0o)) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.report_rule_user_not_exist));
        } else {
            this.f47625Oooo0oO.setSearchUser(list2.get(0));
        }
        return Unit.INSTANCE;
    }
}
