package o00OO0O0;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00OO extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ImageView f31539OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final TextView f31540OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final View f31541OooOOoo;

    public static final class OooO00o extends p654o0ooo.o00Oo0 {

        /* JADX INFO: renamed from: o00OO0O0.o00OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0342OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final C0342OooO00o f31542Oooo0o = new C0342OooO00o();

            public C0342OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Intrinsics.checkNotNullParameter("Turntable_Open", "key");
                Observable observable = LiveEventBus.get("roomTurntable_Open", Object.class);
                Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
                observable.post(Boolean.TRUE);
                return null;
            }
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            C0342OooO00o onLogin = C0342OooO00o.f31542Oooo0o;
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
    public o00OO(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.tvContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvContent)");
        this.f31540OooOOo0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ivTurntableGame);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.ivTurntableGame)");
        this.f31539OooOOo = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.chatlineContent)");
        this.f31541OooOOoo = viewFindViewById3;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return false;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        OooO0O0(model, this.f31540OooOOo0);
        if (model.type != 19) {
            this.f31540OooOOo0.setText(model.message);
            com.yalla.support.common.util.Oooo0.OooO0O0(this.f31540OooOOo0, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_ffe024), o0O0O00.o0ooOOo.OooO00o(new StringBuilder(), model.wincoinnum, ""));
            this.f31539OooOOo.setOnClickListener(null);
            this.f31541OooOOoo.setOnClickListener(null);
            return;
        }
        String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.join_lucky_wheel);
        String strOooO0OO2 = p254o00ooO0O.o000O0O0.OooO0OO(R.string.join_lucky_wheel_join_now);
        this.f31540OooOOo0.setText(strOooO0OO);
        com.yalla.support.common.util.Oooo0.OooO0O0(this.f31540OooOOo0, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_ffe024), strOooO0OO2);
        OooO00o oooO00o = new OooO00o();
        this.f31539OooOOo.setOnClickListener(oooO00o);
        this.f31541OooOOoo.setOnClickListener(oooO00o);
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
