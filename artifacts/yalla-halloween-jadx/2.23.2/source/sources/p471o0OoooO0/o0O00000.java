package p471o0OoooO0;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p355o0OOOo0o.OooO0o;
import p405o0Oo0OOO.o0O000o0;
import p535o0o0Oo0.oO0O00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O00000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47872OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47873OooO0o0;

    public /* synthetic */ o0O00000(Object obj, int i) {
        this.f47872OooO0Oo = i;
        this.f47873OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strOooO0OO;
        int i = this.f47872OooO0Oo;
        Object obj2 = this.f47873OooO0o0;
        switch (i) {
            case 0:
                o0O000Oo this$0 = (o0O000Oo) obj2;
                MusicTable musicTable = (MusicTable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (musicTable != null) {
                    this$0.f47877OooOO0O.f44429OooOOOo.setText(musicTable.mDisplayName);
                    boolean z = oO0O00.f53970OooO00o;
                    MusicTable musicTableOooO0O0 = oO0O00.OooO0O0();
                    o0O000o0 o0o000o1 = this$0.f47877OooOO0O;
                    TextView textView = o0o000o1.f44431OooOOo0;
                    if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
                        strOooO0OO = o0000.OooO0OO(o000000.no_more_music);
                    }
                    textView.setText(strOooO0OO);
                    int i2 = musicTable.mDuration;
                    SeekBar seekBar = o0o000o1.f44427OooOOO0;
                    seekBar.setMax(i2);
                    seekBar.setProgress(OooO0o.OooO0O0().OooO00o().OooO0O0());
                    Lazy lazy = p208o00o0oOO.o0O000o0.f39631OooO00o;
                    o0o000o1.f44432OooOOoo.setText(p208o00o0oOO.o0O000o0.OooO0OO(musicTable.mDuration));
                    if (MusicState.f22363OooO0O0.getValue() == MusicState.State.Playing) {
                        this$0.OooOO0();
                    }
                }
                break;
            default:
                MainMomentFollowingFragment.InitObservers$lambda$5((MomentFollowingVM) obj2, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
