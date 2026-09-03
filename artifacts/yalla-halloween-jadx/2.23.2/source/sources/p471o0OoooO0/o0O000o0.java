package p471o0OoooO0;

import android.widget.SeekBar;
import org.jetbrains.annotations.Nullable;
import p355o0OOOo0o.OooO0o;
import p535o0o0Oo0.oO0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000o0 implements SeekBar.OnSeekBarChangeListener {
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
        if (z) {
            boolean z2 = oO0O00.f53970OooO00o;
            OooO0o.OooO0O0().OooO00o().OooOO0o(i);
            oO0O00.f53975OooO0o0 = i;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
    }
}
