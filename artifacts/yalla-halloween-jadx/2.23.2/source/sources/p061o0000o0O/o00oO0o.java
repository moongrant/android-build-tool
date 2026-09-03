package p061o0000o0O;

import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f33753OooO00o;

    @RequiresApi(19)
    public static class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EditText f33754OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O0O00 f33755OooO0O0;

        public OooO00o(@NonNull EditText editText) {
            this.f33754OooO00o = editText;
            o0O0O00 o0o0o00 = new o0O0O00(editText);
            this.f33755OooO0O0 = o0o0o00;
            editText.addTextChangedListener(o0o0o00);
            if (o0ooOOo.f33770OooO0O0 == null) {
                synchronized (o0ooOOo.f33769OooO00o) {
                    if (o0ooOOo.f33770OooO0O0 == null) {
                        o0ooOOo.f33770OooO0O0 = new o0ooOOo();
                    }
                }
            }
            editText.setEditableFactory(o0ooOOo.f33770OooO0O0);
        }
    }

    public static class OooO0O0 {
    }

    public o00oO0o(@NonNull EditText editText) {
        OooOOO0.OooO0o0(editText, "editText cannot be null");
        this.f33753OooO00o = new OooO00o(editText);
    }
}
