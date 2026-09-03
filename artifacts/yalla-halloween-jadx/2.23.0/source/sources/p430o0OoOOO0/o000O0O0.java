package p430o0OoOOO0;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.MutableState;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.yalla.ui.activity.message.Oooo000;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p367o0OOo0o0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Oooo000> f45765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f45766OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f45767OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(MutableState<Oooo000> mutableState, o000OO00 o000oo01, PrivateChatVM privateChatVM) {
        super(0);
        this.f45765OooO0Oo = mutableState;
        this.f45767OooO0o0 = o000oo01;
        this.f45766OooO0o = privateChatVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EmojiEditText view = this.f45765OooO0Oo.getValue().OooO00o();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
        OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        o000OO00.OooO00o(this.f45767OooO0o0, this.f45766OooO0o);
        return Unit.INSTANCE;
    }
}
