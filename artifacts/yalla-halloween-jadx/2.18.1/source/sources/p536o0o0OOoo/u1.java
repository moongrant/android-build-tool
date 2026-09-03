package p536o0o0OOoo;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.db.table.SystemMessage;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class u1<T> implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f43877OooO00o;

    public u1(SystemMessageActivity systemMessageActivity) {
        this.f43877OooO00o = systemMessageActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        if (((SystemMessage) t) != null) {
            TextView textView = this.f43877OooO00o.f22246OooooO0;
            if (textView != null) {
                o00O0O.OooO(textView);
            }
            this.f43877OooO00o.OooOooO().f50368OooO0OO.OooO0Oo();
            return;
        }
        TextView textView2 = this.f43877OooO00o.f22246OooooO0;
        if (textView2 != null) {
            o00O0O.OooO00o(textView2);
        }
        this.f43877OooO00o.OooOooO().f50368OooO0OO.OooO0o0();
    }
}
