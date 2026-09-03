package p579o0oOoo;

import android.app.Activity;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.OooOo00;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.OooO0O0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p399o0Oo0O0O.o00O0O;
import p464o0Oooo.o000000O;
import p520o0o0O0oo.x6;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oO0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f56573OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final GiftPropTypeShow f56574OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final BaseMomentDetailVM f56575OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Function1<MomentDetailModel, Unit> f56576OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f56577OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f56578OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public MomentDetailModel f56579OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f56581OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentDetailModel momentDetailModel) {
            super(0);
            this.f56581OooO0o0 = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O0O00 oo0o0o00 = oO0O0O00.this;
            MomentDetailModel momentDetailModel = this.f56581OooO0o0;
            oo0o0o00.f56579OooO0oO = momentDetailModel;
            if (momentDetailModel != null && momentDetailModel.getId() > 0 && OooOo00.OooO0O0(Long.valueOf(momentDetailModel.getUserId())) && OooOo00.OooO0O0(momentDetailModel.getNickName())) {
                x6 x6Var = (x6) oo0o0o00.f56577OooO0o.getValue();
                x6Var.f53378OooOO0O = new oO0O00O(x6Var, oo0o0o00, momentDetailModel);
                x6Var.f53379OooOO0o = new oO0O00o0(oo0o0o00);
                x6Var.f53381OooOOO0 = new oO0O00oO(x6Var);
                RoomUserInfoModel user = new RoomUserInfoModel();
                user.getUserId().setValue(Long.valueOf(momentDetailModel.getUserId()));
                user.getUserName().setValue(momentDetailModel.getNickName());
                user.getUserHeader().setValue(momentDetailModel.getHeadUrl());
                Intrinsics.checkNotNullParameter(user, "user");
                x6Var.OooOoOO(user);
                x6Var.OooOO0(new oO0O0(oo0o0o00));
                x6Var.OooOO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public oO0O0O00() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO0O0O00(FragmentActivity activity, GiftPropTypeShow giftPropTypeShow, BaseMomentDetailVM vm, OooO0O0 oooO0O0, int i) {
        oooO0O0 = (i & 16) != 0 ? null : oooO0O0;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(giftPropTypeShow, "giftPropTypeShow");
        Intrinsics.checkNotNullParameter(vm, "vm");
        this.f56573OooO00o = activity;
        this.f56574OooO0O0 = giftPropTypeShow;
        this.f56575OooO0OO = vm;
        this.f56576OooO0Oo = null;
        this.f56578OooO0o0 = oooO0O0;
        this.f56577OooO0o = LazyKt.lazy(new oO0O000o(this));
        o00O0O o00o0o2 = activity instanceof o00O0O ? (o00O0O) activity : null;
        if (o00o0o2 != null) {
            o00o0o2.showDialog(null, ComposableLambdaKt.composableLambdaInstance(1977180760, true, new oO0O000(this)));
        }
    }

    public final void OooO00o(@Nullable MomentDetailModel momentDetailModel) {
        OooO00o onLogin = new OooO00o(momentDetailModel);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}
