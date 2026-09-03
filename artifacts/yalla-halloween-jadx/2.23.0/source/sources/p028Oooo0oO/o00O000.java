package p028Oooo0oO;

import androidx.camera.core.impl.o00000;
import androidx.camera.core.impl.o000000;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o00000> f1140OooO00o;

    public o00O000(List<o00000> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.f1140OooO00o = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // androidx.camera.core.impl.o000000
    public final List<o00000> OooO00o() {
        return this.f1140OooO00o;
    }
}
