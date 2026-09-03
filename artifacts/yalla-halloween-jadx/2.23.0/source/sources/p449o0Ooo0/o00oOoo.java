package p449o0Ooo0;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.yalla.yalla.data.db.model.MusicTable;
import p528o0o0OOOo.oOO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f46425OooO0Oo;

    public o00oOoo(o000OO00 o000oo01) {
        this.f46425OooO0Oo = o000oo01;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strOooO0OO;
        boolean z = oOO0.f54098OooO00o;
        MusicTable musicTableOooO0O0 = oOO0.OooO0O0();
        TextView textView = this.f46425OooO0Oo.f46408OooOO0O.f58496OooOOo0;
        if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
            strOooO0OO = o0000.OooO0OO(oO00OOo0.no_more_music);
        }
        textView.setText(strOooO0OO);
    }
}
