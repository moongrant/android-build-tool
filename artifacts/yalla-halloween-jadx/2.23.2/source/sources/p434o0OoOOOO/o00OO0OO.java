package p434o0OoOOOO;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.MutableState;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.yalla.ui.activity.message.Oooo000;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import kotlin.Unit;
import kotlin.collections.OooO00o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p371o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Oooo000> f46952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f46953OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OO f46954OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(MutableState<Oooo000> mutableState, o00OO o00oo2, PrivateChatVM privateChatVM) {
        super(0);
        this.f46952OooO0Oo = mutableState;
        this.f46954OooO0o0 = o00oo2;
        this.f46953OooO0o = privateChatVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EmojiEditText view = this.f46952OooO0Oo.getValue().OooO00o();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
        OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, view.getWindowToken(), 0);
        o00OO.OooO00o(this.f46954OooO0o0, this.f46953OooO0o);
        return Unit.INSTANCE;
    }
}
