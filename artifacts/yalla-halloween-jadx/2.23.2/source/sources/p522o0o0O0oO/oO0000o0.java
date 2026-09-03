package p522o0o0O0oO;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000o0 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f53108OooO00o;

    public oO0000o0(Function0<Unit> function0) {
        this.f53108OooO00o = function0;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f53108OooO00o.invoke();
        return true;
    }
}
