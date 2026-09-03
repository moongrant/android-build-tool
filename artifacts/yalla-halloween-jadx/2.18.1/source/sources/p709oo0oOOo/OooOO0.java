package p709oo0oOOo;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.OooO00o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOO0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f53373OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<o000oOoO> f53374OooO0O0 = new ArrayList<>(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f53375OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public DataSpec f53376OooO0Oo;

    public OooOO0(boolean z) {
        this.f53373OooO00o = z;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public Map OooO0oo() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooOO0O(o000oOoO o000oooo2) {
        Objects.requireNonNull(o000oooo2);
        if (this.f53374OooO0O0.contains(o000oooo2)) {
            return;
        }
        this.f53374OooO0O0.add(o000oooo2);
        this.f53375OooO0OO++;
    }

    public final void OooOOOO(int i) {
        DataSpec dataSpec = this.f53376OooO0Oo;
        int i2 = o000OOo0.f36740OooO00o;
        for (int i3 = 0; i3 < this.f53375OooO0OO; i3++) {
            this.f53374OooO0O0.get(i3).OooO00o(dataSpec, this.f53373OooO00o, i);
        }
    }

    public final void OooOOOo() {
        DataSpec dataSpec = this.f53376OooO0Oo;
        int i = o000OOo0.f36740OooO00o;
        for (int i2 = 0; i2 < this.f53375OooO0OO; i2++) {
            this.f53374OooO0O0.get(i2).OooO0OO(dataSpec, this.f53373OooO00o);
        }
        this.f53376OooO0Oo = null;
    }

    public final void OooOOo(DataSpec dataSpec) {
        this.f53376OooO0Oo = dataSpec;
        for (int i = 0; i < this.f53375OooO0OO; i++) {
            this.f53374OooO0O0.get(i).OooO0o(dataSpec, this.f53373OooO00o);
        }
    }

    public final void OooOOo0(DataSpec dataSpec) {
        for (int i = 0; i < this.f53375OooO0OO; i++) {
            this.f53374OooO0O0.get(i).OooO0Oo();
        }
    }
}
