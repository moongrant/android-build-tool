package p534o0o0Oo00;

import android.text.Editable;
import android.text.TextWatcher;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.yalla.yalla.ui.view.rich_edit_text.RichEditText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p426o0OoOO.o0OOO0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f54882OooO0Oo;

    public OooOo00(OooOOOO oooOOOO) {
        this.f54882OooO0Oo = oooOOOO;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@NotNull Editable string) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@NotNull CharSequence string, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@NotNull CharSequence string, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(string, "string");
        OooOOOO oooOOOO = this.f54882OooO0Oo;
        RichEditText richEditText = oooOOOO.f54852OooO0Oo;
        if ((richEditText != null ? richEditText.getEmojiFaceCount() : 0) > oooOOOO.f54851OooO0OO) {
            o000O00O.OooO0O0(StringsKt.OooOoO(o0000.OooO0OO(oO00OOo0.char_room_edit1), "50", String.valueOf(oooOOOO.f54851OooO0OO)));
        } else if (oooOOOO.OooO0Oo() > oooOOOO.f54850OooO0O0) {
            o000O00O.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Input_a_maximum_of_xxx_characters), o0OOO0o.OooO00o(oooOOOO.f54850OooO0O0)));
        }
    }
}
