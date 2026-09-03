package p045Oooooo;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0000Ooo;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import kotlin.jvm.internal.Intrinsics;
import p110o000ooo0.o000000O;
import p110o000ooo0.o00000O;
import p110o000ooo0.o0O0O00;
import p371o0OOo0oO.o0OOO0o;
import p405o0Oo0OOO.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1953OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1954OooO0o0;

    public /* synthetic */ o000O00(Object obj, int i) {
        this.f1953OooO0Oo = i;
        this.f1954OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        int i = this.f1953OooO0Oo;
        Object obj = this.f1954OooO0o0;
        switch (i) {
            case 0:
                ((o00Oo0) obj).OooO0OO();
                return;
            case 1:
                o00000O this$0 = (o00000O) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    o0O0O00 o0o0o00 = this$0.f35865OooO0o;
                    if (o0o0o00 != null) {
                        this$0.f35864OooO0Oo = o0o0o00.OooO0o(this$0.f35867OooO0oO, this$0.f35861OooO00o);
                        o000000O o000000o2 = this$0.f35862OooO0O0;
                        o000000O.OooO0OO oooO0OO = this$0.f35866OooO0o0;
                        if (oooO0OO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("observer");
                            oooO0OO = null;
                        }
                        o000000o2.OooO00o(oooO0OO);
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
                    return;
                }
            case 2:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj;
                o0000Ooo o0000ooo = FirebaseMessaging.f19758OooOOO0;
                FirebaseMessaging.OooO00o oooO00o = firebaseMessaging.f19767OooO0oO;
                synchronized (oooO00o) {
                    oooO00o.OooO00o();
                    Boolean bool = oooO00o.f19773OooO0OO;
                    zBooleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f19761OooO00o.OooO0oo();
                }
                if (zBooleanValue) {
                    firebaseMessaging.OooO();
                    return;
                }
                return;
            default:
                z dialogBinding = (z) obj;
                int i2 = VoteGameCreateActivity.f26301OooOo;
                Intrinsics.checkNotNullParameter(dialogBinding, "$dialogBinding");
                EditText view = dialogBinding.f45720OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "etVoteSetTitle");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                return;
        }
    }
}
