package p127o00O0oo;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import o00OO00O.o0OoOo0;
import p126o00O0oOo.o00000OO;
import p126o00O0oOo.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 implements o0ooOOo, OooO0o.OooO00o<Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<o0OoOo0<File, ?>> f36755OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0ooOOo.OooO00o f36756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f36757OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OOO0o<?> f36758OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f36759OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o000OOo f36760OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f36761OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile o0OoOo0.OooO00o<?> f36762OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public File f36763OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o0000oo f36764OooOOO0;

    public o0000O00(o0OOO0o<?> o0ooo0o2, o0ooOOo.OooO00o oooO00o) {
        this.f36758OooO0o0 = o0ooo0o2;
        this.f36756OooO0Oo = oooO00o;
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0OO(@NonNull Exception exc) {
        this.f36756OooO0Oo.OooO0O0(this.f36764OooOOO0, exc, this.f36762OooOO0O.f37152OooO0OO, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // p127o00O0oo.o0ooOOo
    public final boolean OooO0Oo() {
        ArrayList arrayListOooO00o = this.f36758OooO0o0.OooO00o();
        if (arrayListOooO00o.isEmpty()) {
            return false;
        }
        List<Class<?>> listOooO0Oo = this.f36758OooO0o0.OooO0Oo();
        if (listOooO0Oo.isEmpty()) {
            if (File.class.equals(this.f36758OooO0o0.f36884OooOO0O)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f36758OooO0o0.f36878OooO0Oo.getClass() + " to " + this.f36758OooO0o0.f36884OooOO0O);
        }
        while (true) {
            List<o0OoOo0<File, ?>> list = this.f36755OooO;
            if (list != null) {
                if (this.f36761OooOO0 < list.size()) {
                    this.f36762OooOO0O = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f36761OooOO0 < this.f36755OooO.size())) {
                            break;
                        }
                        List<o0OoOo0<File, ?>> list2 = this.f36755OooO;
                        int i = this.f36761OooOO0;
                        this.f36761OooOO0 = i + 1;
                        o0OoOo0<File, ?> o0oooo0 = list2.get(i);
                        File file = this.f36763OooOO0o;
                        o0OOO0o<?> o0ooo0o2 = this.f36758OooO0o0;
                        this.f36762OooOO0O = o0oooo0.OooO0O0(file, o0ooo0o2.f36880OooO0o0, o0ooo0o2.f36879OooO0o, o0ooo0o2.f36874OooO);
                        if (this.f36762OooOO0O != null) {
                            if (this.f36758OooO0o0.OooO0OO(this.f36762OooOO0O.f37152OooO0OO.OooO00o()) != null) {
                                this.f36762OooOO0O.f37152OooO0OO.OooO0Oo(this.f36758OooO0o0.f36888OooOOOO, this);
                                z = true;
                            }
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f36759OooO0oO + 1;
            this.f36759OooO0oO = i2;
            if (i2 >= listOooO0Oo.size()) {
                int i3 = this.f36757OooO0o + 1;
                this.f36757OooO0o = i3;
                if (i3 >= arrayListOooO00o.size()) {
                    return false;
                }
                this.f36759OooO0oO = 0;
            }
            o000OOo o000ooo2 = (o000OOo) arrayListOooO00o.get(this.f36757OooO0o);
            Class<?> cls = listOooO0Oo.get(this.f36759OooO0oO);
            o00000OO<Z> o00000ooOooO0o = this.f36758OooO0o0.OooO0o(cls);
            o0OOO0o<?> o0ooo0o3 = this.f36758OooO0o0;
            this.f36764OooOOO0 = new o0000oo(o0ooo0o3.f36877OooO0OO.f9839OooO00o, o000ooo2, o0ooo0o3.f36886OooOOO, o0ooo0o3.f36880OooO0o0, o0ooo0o3.f36879OooO0o, o00000ooOooO0o, cls, o0ooo0o3.f36874OooO);
            File fileOooO00o = ((o0O0O00.OooO0OO) o0ooo0o3.f36882OooO0oo).OooO00o().OooO00o(this.f36764OooOOO0);
            this.f36763OooOO0o = fileOooO00o;
            if (fileOooO00o != null) {
                this.f36760OooO0oo = o000ooo2;
                this.f36755OooO = this.f36758OooO0o0.f36877OooO0OO.OooO0O0().OooO0oO(fileOooO00o);
                this.f36761OooOO0 = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0o0(Object obj) {
        this.f36756OooO0Oo.OooO00o(this.f36760OooO0oo, obj, this.f36762OooOO0O.f37152OooO0OO, DataSource.RESOURCE_DISK_CACHE, this.f36764OooOOO0);
    }

    @Override // p127o00O0oo.o0ooOOo
    public final void cancel() {
        o0OoOo0.OooO00o<?> oooO00o = this.f36762OooOO0O;
        if (oooO00o != null) {
            oooO00o.f37152OooO0OO.cancel();
        }
    }
}
