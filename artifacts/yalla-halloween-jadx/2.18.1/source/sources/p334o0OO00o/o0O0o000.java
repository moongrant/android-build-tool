package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzju;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p244o00oo0O.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o000 extends o0OO000o {
    public o0O0o000(int i) {
        super(i);
    }

    @Override // p334o0OO00o.o0OO000o
    public final void OooO00o() {
        if (!this.f37414Oooo) {
            for (int i = 0; i < OooO0O0(); i++) {
                Map.Entry entryOooO0Oo = OooO0Oo(i);
                if (((zzju) entryOooO0Oo.getKey()).zzc()) {
                    entryOooO0Oo.setValue(Collections.unmodifiableList((List) entryOooO0Oo.getValue()));
                }
            }
            for (Map.Entry entry : this.f37417Oooo0oo.isEmpty() ? o0O0O00.f34187OooO0O0 : this.f37417Oooo0oo.entrySet()) {
                if (((zzju) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.OooO00o();
    }
}
