package p617o0oo0o;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00OO0O0.o0OOO0o;
import o00OOO00.OooOO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;
import p501o0o00o.o000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f48496OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final GiftPropTypeShow f48497OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Function1<MomentDetailModel, Unit> f48498OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f48499OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public MomentDetailModel f48500OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f48501OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f48503Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentDetailModel momentDetailModel) {
            super(0);
            this.f48503Oooo0oO = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000O000 o000o001 = o000O000.this;
            MomentDetailModel momentDetailModel = this.f48503Oooo0oO;
            o000o001.f48500OooO0o = momentDetailModel;
            if (momentDetailModel == null) {
                return null;
            }
            if (momentDetailModel.getId() > 0 && OooO0OO.OooO0O0(Long.valueOf(momentDetailModel.getUserId())) && OooO0OO.OooO0O0(momentDetailModel.getNickName())) {
                o000 o000Var = (o000) o000o001.f48501OooO0o0.getValue();
                o000Var.f41398OooOO0O = new o0000O(o000Var, o000o001, momentDetailModel);
                o000Var.f41399OooOO0o = new o0000OO0(o000o001);
                o000Var.f41401OooOOO0 = new o000(o000Var);
                RoomUserInfoModel user = new RoomUserInfoModel();
                user.setUserId(momentDetailModel.getUserId());
                user.setUserName(momentDetailModel.getNickName());
                user.setUserHeader(momentDetailModel.getHeadUrl());
                Intrinsics.checkNotNullParameter(user, "user");
                o000Var.OooOooO(user);
                o000Var.OooOOO0();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o000O000(FragmentActivity activity, GiftPropTypeShow giftPropTypeShow) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(giftPropTypeShow, "giftPropTypeShow");
        this.f48496OooO00o = activity;
        this.f48497OooO0O0 = giftPropTypeShow;
        this.f48498OooO0OO = null;
        this.f48499OooO0Oo = LazyKt.lazy(new o000Oo0(this));
        this.f48501OooO0o0 = LazyKt.lazy(new o0000O0O(this));
        OooOO0O oooOO0O = activity instanceof OooOO0O ? (OooOO0O) activity : null;
        if (oooOO0O != null) {
            oooOO0O.showDialog(null, o00O0000.OooO0O0(1977180760, true, new o0000O0(this)));
        }
    }

    public static final MomentVM OooO00o(o000O000 o000o001) {
        return (MomentVM) o000o001.f48499OooO0Oo.getValue();
    }

    public final void OooO0O0(@Nullable MomentDetailModel momentDetailModel) {
        OooO00o onLogin = new OooO00o(momentDetailModel);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }
}
