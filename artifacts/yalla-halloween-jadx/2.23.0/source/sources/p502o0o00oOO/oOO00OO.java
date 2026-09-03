package p502o0o00oOO;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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
import p426o0OoOO.o0OOO0o;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO00OO extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f49649OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final View f49650OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final ImageView f49651OooOoO0;

    public static final class OooO00o extends oo00o {

        /* JADX INFO: renamed from: o0o00oOO.oOO00OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0488OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C0488OooO00o f49652OooO0Oo = new C0488OooO00o();

            public C0488OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Intrinsics.checkNotNullParameter("Turntable_Open", "key");
                Observable observable = LiveEventBus.get("roomTurntable_Open", Object.class);
                Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
                observable.post(Boolean.TRUE);
                return Unit.INSTANCE;
            }
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            C0488OooO00o onLogin = C0488OooO00o.f49652OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00OO(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.tvContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tvContent)");
        this.f49649OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.ivTurntableGame);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.ivTurntableGame)");
        this.f49651OooOoO0 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.chatlineContent)");
        this.f49650OooOoO = viewFindViewById3;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return false;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f49649OooOo;
        o0OOO0.OooO0O0(model, textView);
        int type = model.getType();
        View view = this.f49650OooOoO;
        ImageView imageView = this.f49651OooOoO0;
        if (type != 19) {
            textView.setText(model.getMessage());
            o000.OooO0O0(textView, o0000.OooO00o(oO00O0o.color_ffe024), o0OOO0o.OooO00o(model.getWincoinnum()));
            imageView.setOnClickListener(null);
            view.setOnClickListener(null);
            return;
        }
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.join_lucky_wheel);
        String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.join_lucky_wheel_join_now);
        textView.setText(strOooO0OO);
        o000.OooO0O0(textView, o0000.OooO00o(oO00O0o.color_ffe024), strOooO0OO2);
        OooO00o oooO00o = new OooO00o();
        imageView.setOnClickListener(oooO00o);
        view.setOnClickListener(oooO00o);
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
