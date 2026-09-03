package p590o0oOooo0;

import android.app.Activity;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.OooO0O0;
import com.code.android.util.OooOo00;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p404o0Oo0OO0.o00O0O;
import p475o0Ooooo0.o0O00oO0;
import p511o0o0O.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f57130OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final GiftPropTypeShow f57131OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final BaseMomentDetailVM f57132OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Function1<MomentDetailModel, Unit> f57133OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f57134OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f57135OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public MomentDetailModel f57136OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f57138OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentDetailModel momentDetailModel) {
            super(0);
            this.f57138OooO0o0 = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            l lVar = l.this;
            MomentDetailModel momentDetailModel = this.f57138OooO0o0;
            lVar.f57136OooO0oO = momentDetailModel;
            if (momentDetailModel != null && momentDetailModel.getId() > 0 && OooOo00.OooO0O0(Long.valueOf(momentDetailModel.getUserId())) && OooOo00.OooO0O0(momentDetailModel.getNickName())) {
                o00000OO o00000oo2 = (o00000OO) lVar.f57134OooO0o.getValue();
                o00000oo2.f50962OooOO0O = new h(o00000oo2, lVar, momentDetailModel);
                o00000oo2.f50963OooOO0o = new i(lVar);
                o00000oo2.f50965OooOOO0 = new j(o00000oo2);
                RoomUserInfoModel user = new RoomUserInfoModel();
                user.getUserId().setValue(Long.valueOf(momentDetailModel.getUserId()));
                user.getUserName().setValue(momentDetailModel.getNickName());
                user.getUserHeader().setValue(momentDetailModel.getHeadUrl());
                Intrinsics.checkNotNullParameter(user, "user");
                o00000oo2.OooOoOO(user);
                o00000oo2.OooOO0(new k(lVar));
                o00000oo2.OooOO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public l() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(FragmentActivity activity, GiftPropTypeShow giftPropTypeShow, BaseMomentDetailVM vm, com.yalla.yalla.ui.vm.moment.OooO00o oooO00o, int i) {
        oooO00o = (i & 16) != 0 ? null : oooO00o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(giftPropTypeShow, "giftPropTypeShow");
        Intrinsics.checkNotNullParameter(vm, "vm");
        this.f57130OooO00o = activity;
        this.f57131OooO0O0 = giftPropTypeShow;
        this.f57132OooO0OO = vm;
        this.f57133OooO0Oo = null;
        this.f57135OooO0o0 = oooO00o;
        this.f57134OooO0o = LazyKt.lazy(new f(this));
        o00O0O o00o0o2 = activity instanceof o00O0O ? (o00O0O) activity : null;
        if (o00o0o2 != null) {
            o00o0o2.showDialog(null, ComposableLambdaKt.composableLambdaInstance(1977180760, true, new e(this)));
        }
    }

    public final void OooO00o(@Nullable MomentDetailModel momentDetailModel) {
        OooO00o onLogin = new OooO00o(momentDetailModel);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}
