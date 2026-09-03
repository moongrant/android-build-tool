package o000OOoO;

import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C0301OooO00o f28291OooO00o;

    /* JADX INFO: renamed from: o000OOoO.OooO00o$OooO00o, reason: collision with other inner class name */
    @RequiresApi(19)
    public static class C0301OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EditText f28292OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOO0O f28293OooO0O0;

        public C0301OooO00o(@NonNull EditText editText) {
            this.f28292OooO00o = editText;
            OooOO0O oooOO0O = new OooOO0O(editText);
            this.f28293OooO0O0 = oooOO0O;
            editText.addTextChangedListener(oooOO0O);
            if (o000OOoO.OooO0O0.f28295OooO0O0 == null) {
                synchronized (o000OOoO.OooO0O0.f28294OooO00o) {
                    if (o000OOoO.OooO0O0.f28295OooO0O0 == null) {
                        o000OOoO.OooO0O0.f28295OooO0O0 = new o000OOoO.OooO0O0();
                    }
                }
            }
            editText.setEditableFactory(o000OOoO.OooO0O0.f28295OooO0O0);
        }
    }

    public static class OooO0O0 {
    }

    public OooO00o(@NonNull EditText editText) {
        o000OO0O.OooOOO0.OooO0Oo(editText, "editText cannot be null");
        this.f28291OooO00o = new C0301OooO00o(editText);
    }
}
