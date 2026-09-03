package p449o0Ooo0;

import android.widget.SeekBar;
import org.jetbrains.annotations.Nullable;
import p351o0OOOo0O.OooO;
import p528o0o0OOOo.oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 implements SeekBar.OnSeekBarChangeListener {
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
        if (z) {
            boolean z2 = oOO0.f54098OooO00o;
            OooO.OooO0O0().OooO00o().OooOO0O(i);
            oOO0.f54103OooO0o0 = i;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
    }
}
