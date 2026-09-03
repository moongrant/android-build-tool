package p546o0o0Ooo0;

import android.text.Editable;
import android.text.TextWatcher;
import com.app.base.mixedroom.room_bottom.RoomAtView;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00OOo0 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO00Oo00 f44428Oooo0o;

    public oO00OOo0(oO00Oo00 oo00oo00) {
        this.f44428Oooo0o = oo00oo00;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        this.f44428Oooo0o.f44439OooOO0O.setValue(Boolean.valueOf(charSequence == null || StringsKt.isBlank(charSequence)));
        RoomAtView roomAtView = (RoomAtView) this.f44428Oooo0o.f44434OooO0o.getValue();
        if (roomAtView != null) {
            roomAtView.OooO0O0();
        }
    }
}
