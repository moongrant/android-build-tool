package p544o0o0OoOO;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.activity.room.RoomReAnnouncementActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class u5 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f44321Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RoomReAnnouncementActivity f44322Oooo0oO;

    public u5(RoomReAnnouncementActivity roomReAnnouncementActivity) {
        this.f44322Oooo0oO = roomReAnnouncementActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f44321Oooo0o = charSequence.toString() + "";
        this.f44322Oooo0oO.f22954OoooOoo.setText((100 - this.f44321Oooo0o.length()) + "/100");
        if (charSequence.toString().isEmpty()) {
            this.f44322Oooo0oO.f22955Ooooo00.setVisibility(8);
            this.f44322Oooo0oO.f22956Ooooo0o.setVisibility(8);
        } else {
            this.f44322Oooo0oO.f22955Ooooo00.setVisibility(0);
            this.f44322Oooo0oO.f22956Ooooo0o.setVisibility(0);
        }
    }
}
