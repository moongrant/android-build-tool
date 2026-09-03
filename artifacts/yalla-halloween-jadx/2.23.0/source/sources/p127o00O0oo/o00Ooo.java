package p127o00O0oo;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import java.io.File;
import java.util.List;
import o00OO00O.o0OoOo0;
import p126o00O0oOo.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements o0ooOOo, OooO0o.OooO00o<Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<o0OoOo0<File, ?>> f36831OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o000OOo> f36832OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0ooOOo.OooO00o f36833OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OOO0o<?> f36834OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f36835OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o000OOo f36836OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f36837OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile o0OoOo0.OooO00o<?> f36838OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public File f36839OooOO0o;

    public o00Ooo(List<o000OOo> list, o0OOO0o<?> o0ooo0o2, o0ooOOo.OooO00o oooO00o) {
        this.f36832OooO0Oo = list;
        this.f36834OooO0o0 = o0ooo0o2;
        this.f36833OooO0o = oooO00o;
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0OO(@NonNull Exception exc) {
        this.f36833OooO0o.OooO0O0(this.f36836OooO0oo, exc, this.f36838OooOO0O.f37152OooO0OO, DataSource.DATA_DISK_CACHE);
    }

    @Override // p127o00O0oo.o0ooOOo
    public final boolean OooO0Oo() {
        while (true) {
            List<o0OoOo0<File, ?>> list = this.f36831OooO;
            if (list != null) {
                if (this.f36837OooOO0 < list.size()) {
                    this.f36838OooOO0O = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f36837OooOO0 < this.f36831OooO.size())) {
                            break;
                        }
                        List<o0OoOo0<File, ?>> list2 = this.f36831OooO;
                        int i = this.f36837OooOO0;
                        this.f36837OooOO0 = i + 1;
                        o0OoOo0<File, ?> o0oooo0 = list2.get(i);
                        File file = this.f36839OooOO0o;
                        o0OOO0o<?> o0ooo0o2 = this.f36834OooO0o0;
                        this.f36838OooOO0O = o0oooo0.OooO0O0(file, o0ooo0o2.f36880OooO0o0, o0ooo0o2.f36879OooO0o, o0ooo0o2.f36874OooO);
                        if (this.f36838OooOO0O != null) {
                            if (this.f36834OooO0o0.OooO0OO(this.f36838OooOO0O.f37152OooO0OO.OooO00o()) != null) {
                                this.f36838OooOO0O.f37152OooO0OO.OooO0Oo(this.f36834OooO0o0.f36888OooOOOO, this);
                                z = true;
                            }
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f36835OooO0oO + 1;
            this.f36835OooO0oO = i2;
            if (i2 >= this.f36832OooO0Oo.size()) {
                return false;
            }
            o000OOo o000ooo2 = this.f36832OooO0Oo.get(this.f36835OooO0oO);
            o0OOO0o<?> o0ooo0o3 = this.f36834OooO0o0;
            File fileOooO00o = ((o0O0O00.OooO0OO) o0ooo0o3.f36882OooO0oo).OooO00o().OooO00o(new oo000o(o000ooo2, o0ooo0o3.f36886OooOOO));
            this.f36839OooOO0o = fileOooO00o;
            if (fileOooO00o != null) {
                this.f36836OooO0oo = o000ooo2;
                this.f36831OooO = this.f36834OooO0o0.f36877OooO0OO.OooO0O0().OooO0oO(fileOooO00o);
                this.f36837OooOO0 = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0o0(Object obj) {
        this.f36833OooO0o.OooO00o(this.f36836OooO0oo, obj, this.f36838OooOO0O.f37152OooO0OO, DataSource.DATA_DISK_CACHE, this.f36836OooO0oo);
    }

    @Override // p127o00O0oo.o0ooOOo
    public final void cancel() {
        o0OoOo0.OooO00o<?> oooO00o = this.f36838OooOO0O;
        if (oooO00o != null) {
            oooO00o.f37152OooO0OO.cancel();
        }
    }
}
