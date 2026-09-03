package p022Oooo00O;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o00OO0O0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final List<o00OO0O0> f607OooO00o;

    public o00O0(@NonNull o00OOO0 o00ooo1, @NonNull ArrayList arrayList) {
        OooOOO0.OooO0O0(o00ooo1.f637OooOO0o == o00OOO0.OooO0o.OPENED, "CaptureSession state must be OPENED. Current state:" + o00ooo1.f637OooOO0o);
        this.f607OooO00o = Collections.unmodifiableList(new ArrayList(arrayList));
    }
}
