package p544o0o0OoOO;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.room.RoomReNameActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class y5 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f44349Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RoomReNameActivity f44350Oooo0oO;

    public y5(RoomReNameActivity roomReNameActivity) {
        this.f44350Oooo0oO = roomReNameActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f44349Oooo0o = charSequence.toString() + "";
        this.f44350Oooo0oO.f22961OoooOoo.setText((24 - this.f44349Oooo0o.length()) + "");
        if (charSequence.toString().trim().isEmpty()) {
            this.f44350Oooo0oO.f22962Ooooo00.setVisibility(8);
            this.f44350Oooo0oO.f22963Ooooo0o.setVisibility(8);
        } else {
            this.f44350Oooo0oO.f22962Ooooo00.setVisibility(0);
            this.f44350Oooo0oO.f22963Ooooo0o.setVisibility(0);
        }
    }
}
