package androidx.appcompat.widget;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.room.RoomDatabase;
import com.app.base.dialog.baseDialog.PasswordSettingDialog;
import com.facebook.bolts.CancellationTokenSource;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0O0.o000O0Oo;
import p470o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f5373Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f5374Oooo0oO;

    public /* synthetic */ o0000O0O(Object obj, int i) {
        this.f5373Oooo0o = i;
        this.f5374Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5373Oooo0o) {
            case 0:
                ((Toolbar) this.f5374Oooo0oO).OooOOOO();
                break;
            case 1:
                RoomDatabase.OooO0o oooO0o = ((androidx.room.OooO0O0) this.f5374Oooo0oO).f9287Oooo0o;
                Collections.emptyList();
                oooO0o.OooO00o();
                break;
            case 2:
                EditText view = ((PasswordSettingDialog) this.f5374Oooo0oO).f11485OoooOoO;
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO00o(view, "view.context"), new Handler()));
                break;
            default:
                CancellationTokenSource.m161cancelAfter$lambda6$lambda5((CancellationTokenSource) this.f5374Oooo0oO);
                break;
        }
    }
}
