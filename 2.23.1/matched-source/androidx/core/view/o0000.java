package androidx.core.view;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f5429OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f5430OooO0o0;

    public /* synthetic */ o0000(KeyEvent.Callback callback, int i) {
        this.f5429OooO0Oo = i;
        this.f5430OooO0o0 = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5429OooO0Oo;
        KeyEvent.Callback callback = this.f5430OooO0o0;
        switch (i) {
            case 0:
                View view = (View) callback;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                TaskActivity this$0 = (TaskActivity) callback;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i2 = TaskActivity.f25084OooOooO;
                this$0.OooOoO();
                break;
        }
    }
}
