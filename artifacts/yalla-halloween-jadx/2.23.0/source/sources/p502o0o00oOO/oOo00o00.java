package p502o0o00oOO;

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
import p365o0OOo0Oo.OooOo;
import p365o0OOo0Oo.Oooo000;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOo00o00 extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f49685OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f49686OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final View f49687OooOoO0;

    public static final class OooO00o extends oo00o {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f49689OooO0oo;

        /* JADX INFO: renamed from: o0o00oOO.oOo00o00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0489OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ oOo00o00 f49690OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ ChatModel f49691OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0489OooO00o(oOo00o00 ooo00o00, ChatModel chatModel) {
                super(0);
                this.f49690OooO0Oo = ooo00o00;
                this.f49691OooO0o0 = chatModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Function1<? super ChatModel, Unit> function1 = this.f49690OooO0Oo.f49686OooOoO;
                if (function1 != null) {
                    function1.invoke(this.f49691OooO0o0);
                }
                return Unit.INSTANCE;
            }
        }

        public OooO00o(ChatModel chatModel) {
            this.f49689OooO0oo = chatModel;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            C0489OooO00o onLogin = new C0489OooO00o(oOo00o00.this, this.f49689OooO0oo);
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
    public oOo00o00(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.tv_red_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_red_content)");
        this.f49685OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.chatlineContent)");
        this.f49687OooOoO0 = viewFindViewById2;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return false;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f49685OooOo;
        o0OOO0.OooO0O0(model, textView);
        if (Intrinsics.areEqual("", model.getMessage())) {
            textView.setText(o0000.OooO0OO(oO00OOo0.red_best_wishes));
        } else {
            MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
            String message = model.getMessage();
            Intrinsics.checkNotNull(message);
            textView.setText(Oooo000.OooO0Oo(o0000O0.OooO00o(16), message));
        }
        this.f49687OooOoO0.setOnClickListener(new OooO00o(model));
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
