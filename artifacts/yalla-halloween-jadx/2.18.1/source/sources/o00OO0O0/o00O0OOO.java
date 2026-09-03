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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O0OOO extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final View f31532OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final TextView f31533OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f31534OooOOoo;

    public static final class OooO00o extends p654o0ooo.o00Oo0 {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ ChatModel f31536OoooO00;

        /* JADX INFO: renamed from: o00OO0O0.o00O0OOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0341OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o00O0OOO f31537Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ ChatModel f31538Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0341OooO00o(o00O0OOO o00o0ooo2, ChatModel chatModel) {
                super(0);
                this.f31537Oooo0o = o00o0ooo2;
                this.f31538Oooo0oO = chatModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Function1<? super ChatModel, Unit> function1 = this.f31537Oooo0o.f31534OooOOoo;
                if (function1 == null) {
                    return null;
                }
                function1.invoke(this.f31538Oooo0oO);
                return null;
            }
        }

        public OooO00o(ChatModel chatModel) {
            this.f31536OoooO00 = chatModel;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            C0341OooO00o onLogin = new C0341OooO00o(o00O0OOO.this, this.f31536OoooO00);
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
    public o00O0OOO(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.tv_red_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_red_content)");
        this.f31533OooOOo0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.chatlineContent)");
        this.f31532OooOOo = viewFindViewById2;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return false;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        OooO0O0(model, this.f31533OooOOo0);
        if (Intrinsics.areEqual("", model.message)) {
            this.f31533OooOOo0.setText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.red_best_wishes));
        } else {
            p453o0Ooo.OooOO0 oooOO1 = p453o0Ooo.OooOO0.f40347OooO00o;
            String str = model.message;
            Intrinsics.checkNotNullExpressionValue(str, "model.message");
            this.f31533OooOOo0.setText(p453o0Ooo.OooOO0.OooO0Oo(str, com.yalla.support.common.util.OooOo00.OooO00o(16.0f)));
        }
        this.f31532OooOOo.setOnClickListener(new OooO00o(model));
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
