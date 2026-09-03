package androidx.compose.foundation;

import android.os.Bundle;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.media3.common.o00Ooo;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements androidx.media3.common.OooO0OO.OooO00o, TextInputLayout.OooOO0 {
    public static ValueElementSequence OooO00o(boolean z, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Boolean.valueOf(z));
        return inspectorInfo.getProperties();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        return new o00Ooo(bundle.getInt(o00Ooo.f6863OooO, 0), bundle.getFloat(o00Ooo.f6867OooOO0o, 1.0f), bundle.getInt(o00Ooo.f6865OooOO0, 0), bundle.getInt(o00Ooo.f6866OooOO0O, 0));
    }
}
