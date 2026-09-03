package p506o0o00oOo;

import com.yalla.yalla.model.FollowedModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo0 extends Lambda implements Function1<ApiResult<FollowedModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f50441OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f50442OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo0(FollowerActivity followerActivity, boolean z) {
        super(1);
        this.f50441OooO0Oo = followerActivity;
        this.f50442OooO0o0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<FollowedModel> apiResult) {
        XRefreshLayout xRefreshLayout;
        oO000OOo oo000ooo;
        ApiResult<FollowedModel> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        boolean z = this.f50442OooO0o0;
        oO000OOo oo000ooo2 = null;
        XRefreshLayout xRefreshLayout2 = null;
        oO000OOo oo000ooo3 = null;
        FollowerActivity followerActivity = this.f50441OooO0Oo;
        if (!zIsSuccess) {
            XRefreshLayout xRefreshLayout3 = followerActivity.f26639OooOOo;
            if (xRefreshLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("srlFans");
                xRefreshLayout3 = null;
            }
            xRefreshLayout3.OooOoo(z);
            oO000OOo oo000ooo4 = followerActivity.f26642OooOo0;
            if (oo000ooo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oo000ooo2 = oo000ooo4;
            }
            oo000ooo2.OooOoo();
        } else if (apiResult2.getData() != null) {
            FollowedModel data = apiResult2.getData();
            Intrinsics.checkNotNull(data);
            if (data.data != null) {
                FollowedModel data2 = apiResult2.getData();
                Intrinsics.checkNotNull(data2);
                if (data2.data.isEmpty()) {
                    xRefreshLayout = followerActivity.f26639OooOOo;
                    if (xRefreshLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("srlFans");
                        xRefreshLayout = null;
                    }
                    xRefreshLayout.OooOooo(z, true, true);
                    oo000ooo = followerActivity.f26642OooOo0;
                    if (oo000ooo == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        oo000ooo3 = oo000ooo;
                    }
                    oo000ooo3.Oooo00o();
                } else {
                    FollowedModel data3 = apiResult2.getData();
                    Intrinsics.checkNotNull(data3);
                    String datesort = data3.datesort;
                    Intrinsics.checkNotNullExpressionValue(datesort, "datesort");
                    followerActivity.f26641OooOOoo = datesort;
                    FollowedModel data4 = apiResult2.getData();
                    Intrinsics.checkNotNull(data4);
                    followerActivity.f26643OooOo00 = data4.index + 1;
                    if (z) {
                        oO000OOo oo000ooo5 = followerActivity.f26642OooOo0;
                        if (oo000ooo5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oo000ooo5 = null;
                        }
                        FollowedModel data5 = apiResult2.getData();
                        Intrinsics.checkNotNull(data5);
                        oo000ooo5.OooOoO0(data5.data);
                    } else {
                        oO000OOo oo000ooo6 = followerActivity.f26642OooOo0;
                        if (oo000ooo6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oo000ooo6 = null;
                        }
                        FollowedModel data6 = apiResult2.getData();
                        Intrinsics.checkNotNull(data6);
                        oo000ooo6.OooO0O0(data6.data);
                    }
                    oO000OOo oo000ooo7 = followerActivity.f26642OooOo0;
                    if (oo000ooo7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oo000ooo7 = null;
                    }
                    oo000ooo7.Oooo00o();
                    XRefreshLayout xRefreshLayout4 = followerActivity.f26639OooOOo;
                    if (xRefreshLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("srlFans");
                    } else {
                        xRefreshLayout2 = xRefreshLayout4;
                    }
                    FollowedModel data7 = apiResult2.getData();
                    Intrinsics.checkNotNull(data7);
                    xRefreshLayout2.OooOooo(z, true, data7.data.isEmpty());
                }
            } else {
                xRefreshLayout = followerActivity.f26639OooOOo;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("srlFans");
                    xRefreshLayout = null;
                }
                xRefreshLayout.OooOooo(z, true, true);
                oo000ooo = followerActivity.f26642OooOo0;
                if (oo000ooo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oo000ooo3 = oo000ooo;
                }
                oo000ooo3.Oooo00o();
            }
        } else {
            xRefreshLayout = followerActivity.f26639OooOOo;
            if (xRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("srlFans");
                xRefreshLayout = null;
            }
            xRefreshLayout.OooOooo(z, true, true);
            oo000ooo = followerActivity.f26642OooOo0;
            if (oo000ooo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oo000ooo3 = oo000ooo;
            }
            oo000ooo3.Oooo00o();
        }
        return Unit.INSTANCE;
    }
}
