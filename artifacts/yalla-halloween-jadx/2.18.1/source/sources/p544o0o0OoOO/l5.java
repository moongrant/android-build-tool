package p544o0o0OoOO;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.room.MusicActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class l5 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f44268Oooo0o;

    public l5(MusicActivity musicActivity) {
        this.f44268Oooo0o = musicActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MusicActivity musicActivity = this.f44268Oooo0o;
        String string = charSequence.toString();
        int i4 = MusicActivity.f22903Oooooo0;
        musicActivity.OooOoO(string);
    }
}
