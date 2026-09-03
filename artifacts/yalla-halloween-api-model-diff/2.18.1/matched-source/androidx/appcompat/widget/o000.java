package androidx.appcompat.widget;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0O0.o000O0Oo;
import p470o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f5308Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f5309Oooo0oO;

    public /* synthetic */ o000(Object obj, int i) {
        this.f5308Oooo0o = i;
        this.f5309Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5308Oooo0o) {
            case 0:
                ((o000O0o) this.f5309Oooo0oO).OooO0OO(false);
                break;
            default:
                TopicCreateNameActivity this$0 = (TopicCreateNameActivity) this.f5309Oooo0oO;
                int i = TopicCreateNameActivity.f22564Ooooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = this$0.OooOoo().f51022OooO0O0;
                Intrinsics.checkNotNullExpressionValue(view, "binding.etName");
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
                break;
        }
    }
}
