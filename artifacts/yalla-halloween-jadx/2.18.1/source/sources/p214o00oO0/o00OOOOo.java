package p214o00oO0;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p217o00oO00o.o000000;
import p221o00oOO.o00000O0;
import p221o00oOO.o00000OO;
import p232o00oOoO.o00OO;
import p243o00oo00O.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOOOo implements o00O0O0O, OooO0o.OooO00o<Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f33513Oooo = -1;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00O0O0O.OooO00o f33514Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O0OO0<?> f33515Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f33516Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public volatile o00000O0.OooO00o<?> f33517OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public List<o00000O0<File, ?>> f33518OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public o000000 f33519OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f33520OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public File f33521OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public o00Oo00 f33522o000oOoO;

    public o00OOOOo(o00O0OO0<?> o00o0oo1, o00O0O0O.OooO00o oooO00o) {
        this.f33515Oooo0oO = o00o0oo1;
        this.f33514Oooo0o = oooO00o;
    }

    @Override // p214o00oO0.o00O0O0O
    public final boolean OooO0O0() {
        List<Class<?>> orDefault;
        List<Class<?>> listOooO0o0;
        ArrayList arrayList = (ArrayList) this.f33515Oooo0oO.OooO00o();
        if (arrayList.isEmpty()) {
            return false;
        }
        o00O0OO0<?> o00o0oo1 = this.f33515Oooo0oO;
        Registry registry = o00o0oo1.f33418OooO0OO.f12361OooO0O0;
        Class<?> cls = o00o0oo1.f33419OooO0Oo.getClass();
        Class<?> cls2 = o00o0oo1.f33422OooO0oO;
        Class<?> cls3 = o00o0oo1.f33425OooOO0O;
        o00OO o00oo2 = registry.f12435OooO0oo;
        o0000OO0 andSet = o00oo2.f33943OooO00o.getAndSet(null);
        if (andSet == null) {
            andSet = new o0000OO0(cls, cls2, cls3);
        } else {
            andSet.OooO00o(cls, cls2, cls3);
        }
        synchronized (o00oo2.f33944OooO0O0) {
            orDefault = o00oo2.f33944OooO0O0.getOrDefault(andSet, null);
        }
        o00oo2.f33943OooO00o.set(andSet);
        List list = orDefault;
        if (orDefault == null) {
            ArrayList arrayList2 = new ArrayList();
            o00000OO o00000oo2 = registry.f12428OooO00o;
            synchronized (o00000oo2) {
                listOooO0o0 = o00000oo2.f33699OooO00o.OooO0o0(cls);
            }
            Iterator it = ((ArrayList) listOooO0o0).iterator();
            while (it.hasNext()) {
                for (Class cls4 : (ArrayList) registry.f12430OooO0OO.OooO0O0((Class) it.next(), cls2)) {
                    if (!((ArrayList) registry.f12432OooO0o.OooO00o(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            o00OO o00oo3 = registry.f12435OooO0oo;
            List<Class<?>> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (o00oo3.f33944OooO0O0) {
                o00oo3.f33944OooO0O0.put(new o0000OO0(cls, cls2, cls3), listUnmodifiableList);
            }
            list = arrayList2;
        }
        if (list.isEmpty()) {
            if (File.class.equals(this.f33515Oooo0oO.f33425OooOO0O)) {
                return false;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to find any load path from ");
            sbOooO0o0.append(this.f33515Oooo0oO.f33419OooO0Oo.getClass());
            sbOooO0o0.append(" to ");
            sbOooO0o0.append(this.f33515Oooo0oO.f33425OooOO0O);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        while (true) {
            List<o00000O0<File, ?>> list2 = this.f33518OoooO0;
            if (list2 != null) {
                if (this.f33520OoooO0O < list2.size()) {
                    this.f33517OoooO = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f33520OoooO0O < this.f33518OoooO0.size())) {
                            break;
                        }
                        List<o00000O0<File, ?>> list3 = this.f33518OoooO0;
                        int i = this.f33520OoooO0O;
                        this.f33520OoooO0O = i + 1;
                        o00000O0<File, ?> o00000o1 = list3.get(i);
                        File file = this.f33521OoooOO0;
                        o00O0OO0<?> o00o0oo2 = this.f33515Oooo0oO;
                        this.f33517OoooO = o00000o1.OooO0O0(file, o00o0oo2.f33421OooO0o0, o00o0oo2.f33420OooO0o, o00o0oo2.f33415OooO);
                        if (this.f33517OoooO != null && this.f33515Oooo0oO.OooO0oO(this.f33517OoooO.f33698OooO0OO.OooO00o())) {
                            this.f33517OoooO.f33698OooO0OO.OooO0o0(this.f33515Oooo0oO.f33429OooOOOO, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f33513Oooo + 1;
            this.f33513Oooo = i2;
            if (i2 >= list.size()) {
                int i3 = this.f33516Oooo0oo + 1;
                this.f33516Oooo0oo = i3;
                if (i3 >= arrayList.size()) {
                    return false;
                }
                this.f33513Oooo = 0;
            }
            o000000 o000000Var = (o000000) arrayList.get(this.f33516Oooo0oo);
            Class cls5 = (Class) list.get(this.f33513Oooo);
            p217o00oO00o.o00000OO<Z> o00000ooOooO0o = this.f33515Oooo0oO.OooO0o(cls5);
            o00O0OO0<?> o00o0oo3 = this.f33515Oooo0oO;
            this.f33522o000oOoO = new o00Oo00(o00o0oo3.f33418OooO0OO.f12360OooO00o, o000000Var, o00o0oo3.f33427OooOOO, o00o0oo3.f33421OooO0o0, o00o0oo3.f33420OooO0o, o00000ooOooO0o, cls5, o00o0oo3.f33415OooO);
            File fileOooO0O0 = o00o0oo3.OooO0O0().OooO0O0(this.f33522o000oOoO);
            this.f33521OoooOO0 = fileOooO0O0;
            if (fileOooO0O0 != null) {
                this.f33519OoooO00 = o000000Var;
                this.f33518OoooO0 = this.f33515Oooo0oO.f33418OooO0OO.f12361OooO0O0.OooO0o(fileOooO0O0);
                this.f33520OoooO0O = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0OO(@NonNull Exception exc) {
        this.f33514Oooo0o.OooO0Oo(this.f33522o000oOoO, exc, this.f33517OoooO.f33698OooO0OO, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.data.OooO0o.OooO00o
    public final void OooO0o(Object obj) {
        this.f33514Oooo0o.OooO00o(this.f33519OoooO00, obj, this.f33517OoooO.f33698OooO0OO, DataSource.RESOURCE_DISK_CACHE, this.f33522o000oOoO);
    }

    @Override // p214o00oO0.o00O0O0O
    public final void cancel() {
        o00000O0.OooO00o<?> oooO00o = this.f33517OoooO;
        if (oooO00o != null) {
            oooO00o.f33698OooO0OO.cancel();
        }
    }
}
