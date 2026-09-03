package p496o0o00o;

import com.yalla.yalla.model.FollowedModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends Lambda implements Function1<ApiResult<FollowedModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f49053OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f49054OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(FollowerActivity followerActivity, boolean z) {
        super(1);
        this.f49053OooO0Oo = followerActivity;
        this.f49054OooO0o0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<FollowedModel> apiResult) {
        XRefreshLayout xRefreshLayout;
        o00 o00Var;
        ApiResult<FollowedModel> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        boolean z = this.f49054OooO0o0;
        o00 o00Var2 = null;
        XRefreshLayout xRefreshLayout2 = null;
        o00 o00Var3 = null;
        FollowerActivity followerActivity = this.f49053OooO0Oo;
        if (!zIsSuccess) {
            XRefreshLayout xRefreshLayout3 = followerActivity.f27106OooOOo;
            if (xRefreshLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("srlFans");
                xRefreshLayout3 = null;
            }
            xRefreshLayout3.OooOoo(z);
            o00 o00Var4 = followerActivity.f27109OooOo0;
            if (o00Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o00Var2 = o00Var4;
            }
            o00Var2.OooOoo();
        } else if (apiResult2.getData() != null) {
            FollowedModel data = apiResult2.getData();
            Intrinsics.checkNotNull(data);
            if (data.data != null) {
                FollowedModel data2 = apiResult2.getData();
                Intrinsics.checkNotNull(data2);
                if (data2.data.isEmpty()) {
                    xRefreshLayout = followerActivity.f27106OooOOo;
                    if (xRefreshLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("srlFans");
                        xRefreshLayout = null;
                    }
                    xRefreshLayout.OooOooo(z, true, true);
                    o00Var = followerActivity.f27109OooOo0;
                    if (o00Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        o00Var3 = o00Var;
                    }
                    o00Var3.Oooo00o();
                } else {
                    FollowedModel data3 = apiResult2.getData();
                    Intrinsics.checkNotNull(data3);
                    String str = data3.datesort;
                    Intrinsics.checkNotNullExpressionValue(str, "results.data!!.datesort");
                    followerActivity.f27108OooOOoo = str;
                    FollowedModel data4 = apiResult2.getData();
                    Intrinsics.checkNotNull(data4);
                    followerActivity.f27110OooOo00 = data4.index + 1;
                    if (z) {
                        o00 o00Var5 = followerActivity.f27109OooOo0;
                        if (o00Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            o00Var5 = null;
                        }
                        FollowedModel data5 = apiResult2.getData();
                        Intrinsics.checkNotNull(data5);
                        o00Var5.OooOoO0(data5.data);
                    } else {
                        o00 o00Var6 = followerActivity.f27109OooOo0;
                        if (o00Var6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            o00Var6 = null;
                        }
                        FollowedModel data6 = apiResult2.getData();
                        Intrinsics.checkNotNull(data6);
                        o00Var6.OooO0O0(data6.data);
                    }
                    o00 o00Var7 = followerActivity.f27109OooOo0;
                    if (o00Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o00Var7 = null;
                    }
                    o00Var7.Oooo00o();
                    XRefreshLayout xRefreshLayout4 = followerActivity.f27106OooOOo;
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
                xRefreshLayout = followerActivity.f27106OooOOo;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("srlFans");
                    xRefreshLayout = null;
                }
                xRefreshLayout.OooOooo(z, true, true);
                o00Var = followerActivity.f27109OooOo0;
                if (o00Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    o00Var3 = o00Var;
                }
                o00Var3.Oooo00o();
            }
        } else {
            xRefreshLayout = followerActivity.f27106OooOOo;
            if (xRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("srlFans");
                xRefreshLayout = null;
            }
            xRefreshLayout.OooOooo(z, true, true);
            o00Var = followerActivity.f27109OooOo0;
            if (o00Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o00Var3 = o00Var;
            }
            o00Var3.Oooo00o();
        }
        return Unit.INSTANCE;
    }
}
