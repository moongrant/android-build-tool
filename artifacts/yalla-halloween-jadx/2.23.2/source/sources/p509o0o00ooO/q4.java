package p509o0o00ooO;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.layout.oo000o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000;
import com.code.android.util.o0000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class q4 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f50785OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final View f50786OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final ImageView f50787OooOoO0;

    public static final class OooO00o extends o0OOOO0o {

        /* JADX INFO: renamed from: o0o00ooO.q4$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0468OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C0468OooO00o f50788OooO0Oo = new C0468OooO00o();

            public C0468OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Intrinsics.checkNotNullParameter("Turntable_Open", "key");
                Observable observable = LiveEventBus.get("roomTurntable_Open", Object.class);
                Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
                observable.post(Boolean.TRUE);
                return Unit.INSTANCE;
            }
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            C0468OooO00o onLogin = C0468OooO00o.f50788OooO0Oo;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.tvContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50785OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.ivTurntableGame);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50787OooOoO0 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50786OooOoO = viewFindViewById3;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return false;
    }

    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f50785OooOo;
        p1.OooO0O0(model, textView);
        int type = model.getType();
        View view = this.f50786OooOoO;
        ImageView imageView = this.f50787OooOoO0;
        if (type != 19) {
            textView.setText(model.getMessage());
            o000.OooO0O0(textView, o0000.OooO00o(o0OOO0o.color_ffe024), oo000o.OooO00o(model.getWincoinnum()));
            imageView.setOnClickListener(null);
            view.setOnClickListener(null);
            return;
        }
        String strOooO0OO = o0000.OooO0OO(o000000.join_lucky_wheel);
        String strOooO0OO2 = o0000.OooO0OO(o000000.join_lucky_wheel_join_now);
        textView.setText(strOooO0OO);
        o000.OooO0O0(textView, o0000.OooO00o(o0OOO0o.color_ffe024), strOooO0OO2);
        OooO00o oooO00o = new OooO00o();
        imageView.setOnClickListener(oooO00o);
        view.setOnClickListener(oooO00o);
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
