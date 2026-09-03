package p522o0o0O0oO;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.compose.foundation.layout.oo000o;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00;
import com.yalla.yalla.ui.view.rich_edit_text.RichEditText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000O implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00000o f53079OooO0Oo;

    public oO0000O(oO00000o oo00000o) {
        this.f53079OooO0Oo = oo00000o;
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
        oO00000o oo00000o = this.f53079OooO0Oo;
        RichEditText richEditText = oo00000o.f53077OooO0Oo;
        if ((richEditText != null ? richEditText.getEmojiFaceCount() : 0) > oo00000o.f53076OooO0OO) {
            o000O00.OooO0O0(StringsKt__StringsJVMKt.replace$default(o0000.OooO0OO(o000000.char_room_edit1), "50", String.valueOf(oo00000o.f53076OooO0OO), false, 4, (Object) null));
        } else if (oo00000o.OooO0Oo() > oo00000o.f53075OooO0O0) {
            o000O00.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(o000000.Input_a_maximum_of_xxx_characters), oo000o.OooO00o(oo00000o.f53075OooO0O0)));
        }
    }
}
