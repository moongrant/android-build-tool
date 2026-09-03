package p700oO0Oo;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p470o0Oooo0.o00O000;
import p649o0ooOOoo.cc;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ cc f52900Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f52901Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f52902Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(cc ccVar, oo0o0Oo oo0o0oo, PrivateChatVM privateChatVM) {
        super(0);
        this.f52900Oooo0o = ccVar;
        this.f52901Oooo0oO = oo0o0oo;
        this.f52902Oooo0oo = privateChatVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EmojiEditText view = this.f52900Oooo0o.f49097OooO0o0.f49547OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "mBinding.messageLayoutChatControl.etMessage");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
        inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
        oo0o0Oo.OooO00o(this.f52901Oooo0oO, this.f52902Oooo0oo);
        return Unit.INSTANCE;
    }
}
