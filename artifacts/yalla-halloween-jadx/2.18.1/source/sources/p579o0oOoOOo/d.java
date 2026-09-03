package p579o0oOoOOo;

import android.widget.SeekBar;
import com.yalla.yalla.data.manager.MusicState;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;
import p445o0OoOo0o.o0O0OOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ b f45941OooO00o;

    public d(b bVar) {
        this.f45941OooO00o = bVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
        b bVar = this.f45941OooO00o;
        bVar.f45905OoooO.f48920OooOOo.setText(bVar.OooOO0O(i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
        Job job = this.f45941OooO00o.f45906OoooOO0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        o0O0OOOo.OooO0O0().OooO00o().OooOO0O(this.f45941OooO00o.f45905OoooO.f48917OooOOO0.getProgress());
        MusicState musicState = MusicState.f21402OooO00o;
        if (MusicState.f21404OooO0OO.getValue() == MusicState.State.Playing) {
            this.f45941OooO00o.OooOO0o();
        }
    }
}
