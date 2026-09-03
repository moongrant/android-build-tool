package p144o00Oo;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import java.io.File;
import java.util.List;
import o00OoO.o0OoOo0;
import p154o00Oo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O implements o000O000, OooO0o.OooO00o<Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<o0OoOo0<File, ?>> f37535OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o0OOO0o> f37536OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O000.OooO00o f37537OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O0o<?> f37538OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f37539OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0OOO0o f37540OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f37541OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile o0OoOo0.OooO00o<?> f37542OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public File f37543OooOO0o;

    public o0000O(List<o0OOO0o> list, o000O0o<?> o000o0o2, o000O000.OooO00o oooO00o) {
        this.f37536OooO0Oo = list;
        this.f37538OooO0o0 = o000o0o2;
        this.f37537OooO0o = oooO00o;
    }

    @Override // p144o00Oo.o000O000
    public final boolean OooO0O0() {
        while (true) {
            List<o0OoOo0<File, ?>> list = this.f37535OooO;
            if (list != null) {
                if (this.f37541OooOO0 < list.size()) {
                    this.f37542OooOO0O = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f37541OooOO0 < this.f37535OooO.size())) {
                            break;
                        }
                        List<o0OoOo0<File, ?>> list2 = this.f37535OooO;
                        int i = this.f37541OooOO0;
                        this.f37541OooOO0 = i + 1;
                        o0OoOo0<File, ?> o0oooo1 = list2.get(i);
                        File file = this.f37543OooOO0o;
                        o000O0o<?> o000o0o2 = this.f37538OooO0o0;
                        this.f37542OooOO0O = o0oooo1.OooO0O0(file, o000o0o2.f37640OooO0o0, o000o0o2.f37639OooO0o, o000o0o2.f37634OooO);
                        if (this.f37542OooOO0O != null) {
                            if (this.f37538OooO0o0.OooO0OO(this.f37542OooOO0O.f37914OooO0OO.OooO00o()) != null) {
                                this.f37542OooOO0O.f37914OooO0OO.OooO0Oo(this.f37538OooO0o0.f37648OooOOOO, this);
                                z = true;
                            }
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f37539OooO0oO + 1;
            this.f37539OooO0oO = i2;
            if (i2 >= this.f37536OooO0Oo.size()) {
                return false;
            }
            o0OOO0o o0ooo0o2 = this.f37536OooO0Oo.get(this.f37539OooO0oO);
            o000O0o<?> o000o0o3 = this.f37538OooO0o0;
            File fileOooO0OO = ((o000O0.OooO0OO) o000o0o3.f37642OooO0oo).OooO00o().OooO0OO(new o0000OO0(o0ooo0o2, o000o0o3.f37646OooOOO));
            this.f37543OooOO0o = fileOooO0OO;
            if (fileOooO0OO != null) {
                this.f37540OooO0oo = o0ooo0o2;
                this.f37535OooO = this.f37538OooO0o0.f37637OooO0OO.OooO0O0().OooO0oO(fileOooO0OO);
                this.f37541OooOO0 = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0OO(@NonNull Exception exc) {
        this.f37537OooO0o.OooO0Oo(this.f37540OooO0oo, exc, this.f37542OooOO0O.f37914OooO0OO, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0o0(Object obj) {
        this.f37537OooO0o.OooO00o(this.f37540OooO0oo, obj, this.f37542OooOO0O.f37914OooO0OO, DataSource.DATA_DISK_CACHE, this.f37540OooO0oo);
    }

    @Override // p144o00Oo.o000O000
    public final void cancel() {
        o0OoOo0.OooO00o<?> oooO00o = this.f37542OooOO0O;
        if (oooO00o != null) {
            oooO00o.f37914OooO0OO.cancel();
        }
    }
}
