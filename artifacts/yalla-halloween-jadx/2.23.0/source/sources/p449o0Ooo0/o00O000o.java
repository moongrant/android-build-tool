package p449o0Ooo0;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;
import p161o00OoOo0.o000OOo;
import p351o0OOOo0O.OooO;
import p351o0OOOo0O.OooOO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000o implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f46420OooO00o;

    public o00O000o(o000OO00 o000oo01) {
        this.f46420OooO00o = o000oo01;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
        TextView textView = this.f46420OooO00o.f46408OooOO0O.f58495OooOOo;
        Lazy lazy = o000OOo.f38508OooO00o;
        textView.setText(o000OOo.OooO0OO(i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
        Job job = this.f46420OooO00o.f46409OooOO0o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        o0OO000.OooO00o("102305");
        OooOO0 oooOO0OooO00o = OooO.OooO0O0().OooO00o();
        o000OO00 o000oo01 = this.f46420OooO00o;
        oooOO0OooO00o.OooOOOo(o000oo01.f46408OooOO0O.f58492OooOOO0.getProgress());
        MutableLiveData<MusicTable> mutableLiveData = MusicState.f22835OooO00o;
        if (MusicState.f22836OooO0O0.getValue() == MusicState.State.Playing) {
            o000oo01.OooOO0();
        }
    }
}
