package p144o00Oo;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import o00OoO.o0OoOo0;
import p154o00Oo0oo.o000000;
import p154o00Oo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000 implements o000O000, OooO0o.OooO00o<Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<o0OoOo0<File, ?>> f37704OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O000.OooO00o f37705OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f37706OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O0o<?> f37707OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f37708OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0OOO0o f37709OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f37710OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile o0OoOo0.OooO00o<?> f37711OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public File f37712OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o00O000o f37713OooOOO0;

    public o00O000(o000O0o<?> o000o0o2, o000O000.OooO00o oooO00o) {
        this.f37707OooO0o0 = o000o0o2;
        this.f37705OooO0Oo = oooO00o;
    }

    @Override // p144o00Oo.o000O000
    public final boolean OooO0O0() {
        ArrayList arrayListOooO00o = this.f37707OooO0o0.OooO00o();
        if (arrayListOooO00o.isEmpty()) {
            return false;
        }
        List<Class<?>> listOooO0Oo = this.f37707OooO0o0.OooO0Oo();
        if (listOooO0Oo.isEmpty()) {
            if (File.class.equals(this.f37707OooO0o0.f37644OooOO0O)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f37707OooO0o0.f37638OooO0Oo.getClass() + " to " + this.f37707OooO0o0.f37644OooOO0O);
        }
        while (true) {
            List<o0OoOo0<File, ?>> list = this.f37704OooO;
            if (list != null) {
                if (this.f37710OooOO0 < list.size()) {
                    this.f37711OooOO0O = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f37710OooOO0 < this.f37704OooO.size())) {
                            break;
                        }
                        List<o0OoOo0<File, ?>> list2 = this.f37704OooO;
                        int i = this.f37710OooOO0;
                        this.f37710OooOO0 = i + 1;
                        o0OoOo0<File, ?> o0oooo1 = list2.get(i);
                        File file = this.f37712OooOO0o;
                        o000O0o<?> o000o0o2 = this.f37707OooO0o0;
                        this.f37711OooOO0O = o0oooo1.OooO0O0(file, o000o0o2.f37640OooO0o0, o000o0o2.f37639OooO0o, o000o0o2.f37634OooO);
                        if (this.f37711OooOO0O != null) {
                            if (this.f37707OooO0o0.OooO0OO(this.f37711OooOO0O.f37914OooO0OO.OooO00o()) != null) {
                                this.f37711OooOO0O.f37914OooO0OO.OooO0Oo(this.f37707OooO0o0.f37648OooOOOO, this);
                                z = true;
                            }
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f37708OooO0oO + 1;
            this.f37708OooO0oO = i2;
            if (i2 >= listOooO0Oo.size()) {
                int i3 = this.f37706OooO0o + 1;
                this.f37706OooO0o = i3;
                if (i3 >= arrayListOooO00o.size()) {
                    return false;
                }
                this.f37708OooO0oO = 0;
            }
            o0OOO0o o0ooo0o2 = (o0OOO0o) arrayListOooO00o.get(this.f37706OooO0o);
            Class<?> cls = listOooO0Oo.get(this.f37708OooO0oO);
            o000000<Z> o000000VarOooO0o = this.f37707OooO0o0.OooO0o(cls);
            o000O0o<?> o000o0o3 = this.f37707OooO0o0;
            this.f37713OooOOO0 = new o00O000o(o000o0o3.f37637OooO0OO.f12930OooO00o, o0ooo0o2, o000o0o3.f37646OooOOO, o000o0o3.f37640OooO0o0, o000o0o3.f37639OooO0o, o000000VarOooO0o, cls, o000o0o3.f37634OooO);
            File fileOooO0OO = ((o000O0.OooO0OO) o000o0o3.f37642OooO0oo).OooO00o().OooO0OO(this.f37713OooOOO0);
            this.f37712OooOO0o = fileOooO0OO;
            if (fileOooO0OO != null) {
                this.f37709OooO0oo = o0ooo0o2;
                this.f37704OooO = this.f37707OooO0o0.f37637OooO0OO.OooO0O0().OooO0oO(fileOooO0OO);
                this.f37710OooOO0 = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0OO(@NonNull Exception exc) {
        this.f37705OooO0Oo.OooO0Oo(this.f37713OooOOO0, exc, this.f37711OooOO0O.f37914OooO0OO, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0o0(Object obj) {
        this.f37705OooO0Oo.OooO00o(this.f37709OooO0oo, obj, this.f37711OooOO0O.f37914OooO0OO, DataSource.RESOURCE_DISK_CACHE, this.f37713OooOOO0);
    }

    @Override // p144o00Oo.o000O000
    public final void cancel() {
        o0OoOo0.OooO00o<?> oooO00o = this.f37711OooOO0O;
        if (oooO00o != null) {
            oooO00o.f37914OooO0OO.cancel();
        }
    }
}
