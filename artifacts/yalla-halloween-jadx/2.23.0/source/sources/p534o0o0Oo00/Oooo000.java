package p534o0o0Oo00;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f54886OooO00o;

    public Oooo000(Function0<Unit> function0) {
        this.f54886OooO00o = function0;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f54886OooO00o.invoke();
        return true;
    }
}
