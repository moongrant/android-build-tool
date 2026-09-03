package o000O0O;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class OooO00o implements androidx.media3.datasource.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f34164OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooOo> f34165OooO0O0 = new ArrayList<>(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34166OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public DataSpec f34167OooO0Oo;

    public OooO00o(boolean z) {
        this.f34164OooO00o = z;
    }

    @Override // androidx.media3.datasource.OooO00o
    public Map OooO0Oo() {
        return Collections.emptyMap();
    }

    @Override // androidx.media3.datasource.OooO00o
    @UnstableApi
    public final void OooO0oO(OooOo oooOo) {
        oooOo.getClass();
        ArrayList<OooOo> arrayList = this.f34165OooO0O0;
        if (arrayList.contains(oooOo)) {
            return;
        }
        arrayList.add(oooOo);
        this.f34166OooO0OO++;
    }

    public final void OooOO0o(int i) {
        DataSpec dataSpec = this.f34167OooO0Oo;
        int i2 = o00.f34910OooO00o;
        for (int i3 = 0; i3 < this.f34166OooO0OO; i3++) {
            this.f34165OooO0O0.get(i3).OooO00o(dataSpec, this.f34164OooO00o, i);
        }
    }

    public final void OooOOO(DataSpec dataSpec) {
        for (int i = 0; i < this.f34166OooO0OO; i++) {
            this.f34165OooO0O0.get(i).OooO0O0();
        }
    }

    public final void OooOOO0() {
        DataSpec dataSpec = this.f34167OooO0Oo;
        int i = o00.f34910OooO00o;
        for (int i2 = 0; i2 < this.f34166OooO0OO; i2++) {
            this.f34165OooO0O0.get(i2).OooO0o(dataSpec, this.f34164OooO00o);
        }
        this.f34167OooO0Oo = null;
    }

    public final void OooOOOO(DataSpec dataSpec) {
        this.f34167OooO0Oo = dataSpec;
        for (int i = 0; i < this.f34166OooO0OO; i++) {
            this.f34165OooO0O0.get(i).OooO0oO(dataSpec, this.f34164OooO00o);
        }
    }
}
