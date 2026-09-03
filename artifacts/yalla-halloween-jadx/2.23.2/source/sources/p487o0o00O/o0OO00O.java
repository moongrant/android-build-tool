package p487o0o00O;

import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O extends Lambda implements Function1<ApiResult<BlackUserModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48887OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f48888OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(BlackListActivity blackListActivity, boolean z) {
        super(1);
        this.f48887OooO0Oo = blackListActivity;
        this.f48888OooO0o0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<BlackUserModel> apiResult) {
        o000000 o000000Var;
        XRefreshLayout xRefreshLayout;
        ApiResult<BlackUserModel> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        boolean z = this.f48888OooO0o0;
        XRefreshLayout xRefreshLayout2 = null;
        BlackListActivity blackListActivity = this.f48887OooO0Oo;
        if (!zIsSuccess) {
            o000000 o000000Var2 = blackListActivity.f24920OooOo0O;
            if (o000000Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000000Var2 = null;
            }
            o000000Var2.OooOoo();
            XRefreshLayout xRefreshLayout3 = blackListActivity.f24918OooOo0;
            if (xRefreshLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
            } else {
                xRefreshLayout2 = xRefreshLayout3;
            }
            xRefreshLayout2.OooOoo(z);
        } else if (apiResult2.getData() != null) {
            BlackUserModel data = apiResult2.getData();
            Intrinsics.checkNotNull(data);
            if (data.data != null) {
                BlackUserModel data2 = apiResult2.getData();
                Intrinsics.checkNotNull(data2);
                if (data2.data.isEmpty()) {
                    o000000Var = blackListActivity.f24920OooOo0O;
                    if (o000000Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o000000Var = null;
                    }
                    o000000Var.Oooo00o();
                    xRefreshLayout = blackListActivity.f24918OooOo0;
                    if (xRefreshLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
                    } else {
                        xRefreshLayout2 = xRefreshLayout;
                    }
                    xRefreshLayout2.OooOooo(z, true, true);
                    BlackListActivity.OooOo0(blackListActivity);
                } else {
                    if (z) {
                        o000000 o000000Var3 = blackListActivity.f24920OooOo0O;
                        if (o000000Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            o000000Var3 = null;
                        }
                        BlackUserModel data3 = apiResult2.getData();
                        Intrinsics.checkNotNull(data3);
                        o000000Var3.OooOoO0(data3.data);
                    } else {
                        o000000 o000000Var4 = blackListActivity.f24920OooOo0O;
                        if (o000000Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            o000000Var4 = null;
                        }
                        BlackUserModel data4 = apiResult2.getData();
                        Intrinsics.checkNotNull(data4);
                        o000000Var4.OooO0O0(data4.data);
                    }
                    BlackUserModel data5 = apiResult2.getData();
                    Intrinsics.checkNotNull(data5);
                    blackListActivity.f24916OooOOo0 = data5.index + 1;
                    o000000 o000000Var5 = blackListActivity.f24920OooOo0O;
                    if (o000000Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o000000Var5 = null;
                    }
                    o000000Var5.Oooo00o();
                    XRefreshLayout xRefreshLayout4 = blackListActivity.f24918OooOo0;
                    if (xRefreshLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
                    } else {
                        xRefreshLayout2 = xRefreshLayout4;
                    }
                    BlackUserModel data6 = apiResult2.getData();
                    Intrinsics.checkNotNull(data6);
                    xRefreshLayout2.OooOooo(z, true, data6.data.isEmpty());
                    BlackListActivity.OooOo0(blackListActivity);
                }
            } else {
                o000000Var = blackListActivity.f24920OooOo0O;
                if (o000000Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o000000Var = null;
                }
                o000000Var.Oooo00o();
                xRefreshLayout = blackListActivity.f24918OooOo0;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
                } else {
                    xRefreshLayout2 = xRefreshLayout;
                }
                xRefreshLayout2.OooOooo(z, true, true);
                BlackListActivity.OooOo0(blackListActivity);
            }
        } else {
            o000000Var = blackListActivity.f24920OooOo0O;
            if (o000000Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000000Var = null;
            }
            o000000Var.Oooo00o();
            xRefreshLayout = blackListActivity.f24918OooOo0;
            if (xRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
            } else {
                xRefreshLayout2 = xRefreshLayout;
            }
            xRefreshLayout2.OooOooo(z, true, true);
            BlackListActivity.OooOo0(blackListActivity);
        }
        return Unit.INSTANCE;
    }
}
