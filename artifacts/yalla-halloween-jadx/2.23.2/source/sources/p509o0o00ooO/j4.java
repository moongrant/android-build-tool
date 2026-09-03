package p509o0o00ooO;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p369o0OOo0o.OooOOO;
import p369o0OOo0o.OooOOO0;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class j4 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f50713OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f50714OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final View f50715OooOoO0;

    public static final class OooO00o extends o0OOOO0o {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f50717OooO0oo;

        /* JADX INFO: renamed from: o0o00ooO.j4$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0467OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ j4 f50718OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ ChatModel f50719OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0467OooO00o(j4 j4Var, ChatModel chatModel) {
                super(0);
                this.f50718OooO0Oo = j4Var;
                this.f50719OooO0o0 = chatModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Function1<? super ChatModel, Unit> function1 = this.f50718OooO0Oo.f50714OooOoO;
                if (function1 != null) {
                    function1.invoke(this.f50719OooO0o0);
                }
                return Unit.INSTANCE;
            }
        }

        public OooO00o(ChatModel chatModel) {
            this.f50717OooO0oo = chatModel;
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            C0467OooO00o onLogin = new C0467OooO00o(j4.this, this.f50717OooO0oo);
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
    public j4(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.tv_red_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50713OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50715OooOoO0 = viewFindViewById2;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return false;
    }

    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f50713OooOo;
        p1.OooO0O0(model, textView);
        if (Intrinsics.areEqual("", model.getMessage())) {
            textView.setText(o0000.OooO0OO(o000000.red_best_wishes));
        } else {
            MutableLiveData<List<OooOOO0>> mutableLiveData = OooOOO.f43158OooO00o;
            String message = model.getMessage();
            Intrinsics.checkNotNull(message);
            textView.setText(OooOOO.OooO0Oo(o0000O0.OooO00o(16), message));
        }
        this.f50715OooOoO0.setOnClickListener(new OooO00o(model));
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
