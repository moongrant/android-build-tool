package p579o0oOoOOo;

import android.widget.SeekBar;
import org.jetbrains.annotations.Nullable;
import p445o0OoOo0o.o0O0OOOo;
import p617o0oo0o.o00;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements SeekBar.OnSeekBarChangeListener {
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
        if (z) {
            o00 o00Var = o00.f48461OooO00o;
            o0O0OOOo.OooO0O0().OooO00o().OooO0o0(i);
            o00.f48465OooO0o = i;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
    }
}
