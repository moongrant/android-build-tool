package p486o0o00O00;

import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo extends Lambda implements Function1<ApiResult<BlackUserModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48401OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f48402OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(BlackListActivity blackListActivity, boolean z) {
        super(1);
        this.f48401OooO0Oo = blackListActivity;
        this.f48402OooO0o0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<BlackUserModel> apiResult) {
        oo0o0Oo oo0o0oo;
        XRefreshLayout xRefreshLayout;
        ApiResult<BlackUserModel> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        boolean z = this.f48402OooO0o0;
        XRefreshLayout xRefreshLayout2 = null;
        BlackListActivity blackListActivity = this.f48401OooO0Oo;
        if (!zIsSuccess) {
            oo0o0Oo oo0o0oo2 = blackListActivity.f25374OooOo0O;
            if (oo0o0oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oo0o0oo2 = null;
            }
            oo0o0oo2.OooOoo();
            XRefreshLayout xRefreshLayout3 = blackListActivity.f25372OooOo0;
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
                    oo0o0oo = blackListActivity.f25374OooOo0O;
                    if (oo0o0oo == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oo0o0oo = null;
                    }
                    oo0o0oo.Oooo00o();
                    xRefreshLayout = blackListActivity.f25372OooOo0;
                    if (xRefreshLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
                    } else {
                        xRefreshLayout2 = xRefreshLayout;
                    }
                    xRefreshLayout2.OooOooo(z, true, true);
                    BlackListActivity.OooOo0(blackListActivity);
                } else {
                    if (z) {
                        oo0o0Oo oo0o0oo3 = blackListActivity.f25374OooOo0O;
                        if (oo0o0oo3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oo0o0oo3 = null;
                        }
                        BlackUserModel data3 = apiResult2.getData();
                        Intrinsics.checkNotNull(data3);
                        oo0o0oo3.OooOoO0(data3.data);
                    } else {
                        oo0o0Oo oo0o0oo4 = blackListActivity.f25374OooOo0O;
                        if (oo0o0oo4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oo0o0oo4 = null;
                        }
                        BlackUserModel data4 = apiResult2.getData();
                        Intrinsics.checkNotNull(data4);
                        oo0o0oo4.OooO0O0(data4.data);
                    }
                    BlackUserModel data5 = apiResult2.getData();
                    Intrinsics.checkNotNull(data5);
                    blackListActivity.f25370OooOOo0 = data5.index + 1;
                    oo0o0Oo oo0o0oo5 = blackListActivity.f25374OooOo0O;
                    if (oo0o0oo5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oo0o0oo5 = null;
                    }
                    oo0o0oo5.Oooo00o();
                    XRefreshLayout xRefreshLayout4 = blackListActivity.f25372OooOo0;
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
                oo0o0oo = blackListActivity.f25374OooOo0O;
                if (oo0o0oo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oo0o0oo = null;
                }
                oo0o0oo.Oooo00o();
                xRefreshLayout = blackListActivity.f25372OooOo0;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
                } else {
                    xRefreshLayout2 = xRefreshLayout;
                }
                xRefreshLayout2.OooOooo(z, true, true);
                BlackListActivity.OooOo0(blackListActivity);
            }
        } else {
            oo0o0oo = blackListActivity.f25374OooOo0O;
            if (oo0o0oo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oo0o0oo = null;
            }
            oo0o0oo.Oooo00o();
            xRefreshLayout = blackListActivity.f25372OooOo0;
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
