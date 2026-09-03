package p244o00oo0Oo;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.OooO00o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class o000OO00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f40471OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<o00O0OO0> f40472OooO0O0 = new ArrayList<>(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f40473OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public DataSpec f40474OooO0Oo;

    public o000OO00(boolean z) {
        this.f40471OooO00o = z;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooO0OO(o00O0OO0 o00o0oo1) {
        o00o0oo1.getClass();
        ArrayList<o00O0OO0> arrayList = this.f40472OooO0O0;
        if (arrayList.contains(o00o0oo1)) {
            return;
        }
        arrayList.add(o00o0oo1);
        this.f40473OooO0OO++;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public Map OooO0o0() {
        return Collections.emptyMap();
    }

    public final void OooOO0o(int i) {
        DataSpec dataSpec = this.f40474OooO0Oo;
        int i2 = o0O00.f40595OooO00o;
        for (int i3 = 0; i3 < this.f40473OooO0OO; i3++) {
            this.f40472OooO0O0.get(i3).OooO0oo(dataSpec, this.f40471OooO00o, i);
        }
    }

    public final void OooOOO(DataSpec dataSpec) {
        for (int i = 0; i < this.f40473OooO0OO; i++) {
            this.f40472OooO0O0.get(i).OooO0O0();
        }
    }

    public final void OooOOO0() {
        DataSpec dataSpec = this.f40474OooO0Oo;
        int i = o0O00.f40595OooO00o;
        for (int i2 = 0; i2 < this.f40473OooO0OO; i2++) {
            this.f40472OooO0O0.get(i2).OooO(dataSpec, this.f40471OooO00o);
        }
        this.f40474OooO0Oo = null;
    }

    public final void OooOOOO(DataSpec dataSpec) {
        this.f40474OooO0Oo = dataSpec;
        for (int i = 0; i < this.f40473OooO0OO; i++) {
            this.f40472OooO0O0.get(i).OooO0o(dataSpec, this.f40471OooO00o);
        }
    }
}
