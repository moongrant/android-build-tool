package p214o00oO0;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import java.io.File;
import java.util.List;
import p217o00oO00o.o000000;
import p221o00oOO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0 implements o00O0O0O, OooO0o.OooO00o<Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f33391Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<o000000> f33392Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O0OO0<?> f33393Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o00O0O0O.OooO00o f33394Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public volatile o00000O0.OooO00o<?> f33395OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public List<o00000O0<File, ?>> f33396OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public o000000 f33397OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f33398OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public File f33399OoooOO0;

    public o00O0(o00O0OO0<?> o00o0oo1, o00O0O0O.OooO00o oooO00o) {
        List<o000000> listOooO00o = o00o0oo1.OooO00o();
        this.f33391Oooo = -1;
        this.f33392Oooo0o = listOooO00o;
        this.f33393Oooo0oO = o00o0oo1;
        this.f33394Oooo0oo = oooO00o;
    }

    @Override // p214o00oO0.o00O0O0O
    public final boolean OooO0O0() {
        while (true) {
            List<o00000O0<File, ?>> list = this.f33396OoooO0;
            if (list != null) {
                if (this.f33398OoooO0O < list.size()) {
                    this.f33395OoooO = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f33398OoooO0O < this.f33396OoooO0.size())) {
                            break;
                        }
                        List<o00000O0<File, ?>> list2 = this.f33396OoooO0;
                        int i = this.f33398OoooO0O;
                        this.f33398OoooO0O = i + 1;
                        o00000O0<File, ?> o00000o1 = list2.get(i);
                        File file = this.f33399OoooOO0;
                        o00O0OO0<?> o00o0oo1 = this.f33393Oooo0oO;
                        this.f33395OoooO = o00000o1.OooO0O0(file, o00o0oo1.f33421OooO0o0, o00o0oo1.f33420OooO0o, o00o0oo1.f33415OooO);
                        if (this.f33395OoooO != null && this.f33393Oooo0oO.OooO0oO(this.f33395OoooO.f33698OooO0OO.OooO00o())) {
                            this.f33395OoooO.f33698OooO0OO.OooO0o0(this.f33393Oooo0oO.f33429OooOOOO, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f33391Oooo + 1;
            this.f33391Oooo = i2;
            if (i2 >= this.f33392Oooo0o.size()) {
                return false;
            }
            o000000 o000000Var = this.f33392Oooo0o.get(this.f33391Oooo);
            o00O0OO0<?> o00o0oo2 = this.f33393Oooo0oO;
            File fileOooO0O0 = o00o0oo2.OooO0O0().OooO0O0(new o00O0O00(o000000Var, o00o0oo2.f33427OooOOO));
            this.f33399OoooOO0 = fileOooO0O0;
            if (fileOooO0O0 != null) {
                this.f33397OoooO00 = o000000Var;
                this.f33396OoooO0 = this.f33393Oooo0oO.f33418OooO0OO.f12361OooO0O0.OooO0o(fileOooO0O0);
                this.f33398OoooO0O = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0OO(@NonNull Exception exc) {
        this.f33394Oooo0oo.OooO0Oo(this.f33397OoooO00, exc, this.f33395OoooO.f33698OooO0OO, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0o(Object obj) {
        this.f33394Oooo0oo.OooO00o(this.f33397OoooO00, obj, this.f33395OoooO.f33698OooO0OO, DataSource.DATA_DISK_CACHE, this.f33397OoooO00);
    }

    @Override // p214o00oO0.o00O0O0O
    public final void cancel() {
        o00000O0.OooO00o<?> oooO00o = this.f33395OoooO;
        if (oooO00o != null) {
            oooO00o.f33698OooO0OO.cancel();
        }
    }

    public o00O0(List<o000000> list, o00O0OO0<?> o00o0oo1, o00O0O0O.OooO00o oooO00o) {
        this.f33391Oooo = -1;
        this.f33392Oooo0o = list;
        this.f33393Oooo0oO = o00o0oo1;
        this.f33394Oooo0oo = oooO00o;
    }
}
