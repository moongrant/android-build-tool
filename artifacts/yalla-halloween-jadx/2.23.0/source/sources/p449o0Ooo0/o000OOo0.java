package p449o0Ooo0;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import kotlin.Lazy;
import p161o00OoOo0.o000OOo;
import p351o0OOOo0O.OooO;
import p528o0o0OOOo.oOO0;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.o1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 implements Observer<MusicTable> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f46417OooO0Oo;

    public o000OOo0(o000OO00 o000oo01) {
        this.f46417OooO0Oo = o000oo01;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MusicTable musicTable) {
        String strOooO0OO;
        MusicTable musicTable2 = musicTable;
        if (musicTable2 != null) {
            o000OO00 o000oo01 = this.f46417OooO0Oo;
            o000oo01.f46408OooOO0O.f58494OooOOOo.setText(musicTable2.mDisplayName);
            boolean z = oOO0.f54098OooO00o;
            MusicTable musicTableOooO0O0 = oOO0.OooO0O0();
            o1 o1Var = o000oo01.f46408OooOO0O;
            TextView textView = o1Var.f58496OooOOo0;
            if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.no_more_music);
            }
            textView.setText(strOooO0OO);
            int i = musicTable2.mDuration;
            SeekBar seekBar = o1Var.f58492OooOOO0;
            seekBar.setMax(i);
            seekBar.setProgress(OooO.OooO0O0().OooO00o().OooO0O0());
            Lazy lazy = o000OOo.f38508OooO00o;
            o1Var.f58497OooOOoo.setText(o000OOo.OooO0OO(musicTable2.mDuration));
            if (MusicState.f22836OooO0O0.getValue() == MusicState.State.Playing) {
                o000oo01.OooOO0();
            }
        }
    }
}
