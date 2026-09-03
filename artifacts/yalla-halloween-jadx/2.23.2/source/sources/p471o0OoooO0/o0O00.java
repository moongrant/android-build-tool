package p471o0OoooO0;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlinx.coroutines.Job;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.Nullable;
import p208o00o0oOO.o0O000o0;
import p355o0OOOo0o.OooO;
import p355o0OOOo0o.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O000Oo f47869OooO00o;

    public o0O00(o0O000Oo o0o000oo2) {
        this.f47869OooO00o = o0o000oo2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
        TextView textView = this.f47869OooO00o.f47877OooOO0O.f44430OooOOo;
        Lazy lazy = o0O000o0.f39631OooO00o;
        textView.setText(o0O000o0.OooO0OO(i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
        Job job = this.f47869OooO00o.f47878OooOO0o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        OooO00o.OooO0O0("102305");
        OooO oooOOooO00o = OooO0o.OooO0O0().OooO00o();
        o0O000Oo o0o000oo2 = this.f47869OooO00o;
        oooOOooO00o.OooOOo0(o0o000oo2.f47877OooOO0O.f44427OooOOO0.getProgress());
        MutableLiveData<MusicTable> mutableLiveData = MusicState.f22362OooO00o;
        if (MusicState.f22363OooO0O0.getValue() == MusicState.State.Playing) {
            o0o000oo2.OooOO0();
        }
    }
}
