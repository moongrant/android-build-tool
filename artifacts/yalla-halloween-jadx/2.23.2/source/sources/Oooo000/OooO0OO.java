package Oooo000;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o00O00;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO0OO extends o00O00<OooO0O0> {
    public OooO0OO(@NonNull OooO0O0... oooO0O0Arr) {
        this.f3707OooO00o.addAll(Arrays.asList(oooO0O0Arr));
    }

    @Override // androidx.camera.core.impl.o00O00
    @NonNull
    /* JADX INFO: renamed from: OooO00o */
    public final OooO0OO clone() {
        OooO0OO oooO0OO = new OooO0OO(new OooO0O0[0]);
        oooO0OO.f3707OooO00o.addAll(Collections.unmodifiableList(new ArrayList(this.f3707OooO00o)));
        return oooO0OO;
    }
}
