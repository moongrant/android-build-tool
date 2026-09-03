package o00OO0O0;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O0OO extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final TextView f31525OooOOo0;

    public static final class OooO00o extends p654o0ooo.o00Oo0 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f31526Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00O0OO f31527OoooO00;

        /* JADX INFO: renamed from: o00OO0O0.o00O0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0340OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ ChatModel f31528Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o00O0OO f31529Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0340OooO00o(ChatModel chatModel, o00O0OO o00o0oo2) {
                super(0);
                this.f31528Oooo0o = chatModel;
                this.f31529Oooo0oO = o00o0oo2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                if (this.f31528Oooo0o.sendBonusMessage.getBonustype() == 2) {
                    Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
                    long userId = this.f31528Oooo0o.sendBonusMessage.getUser().getUserId();
                    if (value != null && value.longValue() == userId) {
                        LuckyPacketDetailActivity.f22854OooooOo.OooO00o(this.f31529Oooo0oO.f31399OooO00o, this.f31528Oooo0o.sendBonusMessage.getBonusid(), this.f31528Oooo0o.sendBonusMessage.getBonustype());
                        return null;
                    }
                }
                p159o00OoOO.o00O000.OooO().OooOO0(this.f31528Oooo0o.sendBonusMessage.getBonusid(), this.f31528Oooo0o.sendBonusMessage.getBonustype());
                return null;
            }
        }

        public OooO00o(ChatModel chatModel, o00O0OO o00o0oo2) {
            this.f31526Oooo = chatModel;
            this.f31527OoooO00 = o00o0oo2;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0O00000.OooO0OO("InRoom_Messagearea_LuckyBag");
            C0340OooO00o onLogin = new C0340OooO00o(this.f31526Oooo, this.f31527OoooO00);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.tv_red_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_red_content)");
        this.f31525OooOOo0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_mora_lucky);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.iv_mora_lucky)");
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return false;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        OooO0O0(model, this.f31525OooOOo0);
        this.f31525OooOOo0.setText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.I_sent_a_lucky_bag));
        this.f31525OooOOo0.append("\n");
        this.f31525OooOOo0.append(p522o0o0O0o.o00O0.OooO0OO(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Lucky_Bag_Open_Now), "#FFE024", 0));
        this.f31525OooOOo0.setOnClickListener(new OooO00o(model, this));
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
