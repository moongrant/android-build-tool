package o000O00O;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oo0oOO0 extends OooO00o {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f34157OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f34158OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int[] f34159OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int[] f34160OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Object[] f34161OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final androidx.media3.common.Oooo0[] f34162OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final HashMap<Object, Integer> f34163OooOOoo;

    public oo0oOO0(androidx.media3.common.Oooo0[] oooo0Arr, Object[] objArr, androidx.media3.exoplayer.source.o00Ooo o00ooo2) {
        super(o00ooo2);
        int length = oooo0Arr.length;
        this.f34162OooOOo0 = oooo0Arr;
        this.f34159OooOOOO = new int[length];
        this.f34160OooOOOo = new int[length];
        this.f34161OooOOo = objArr;
        this.f34163OooOOoo = new HashMap<>();
        int length2 = oooo0Arr.length;
        int i = 0;
        int iOooOOoo = 0;
        int iOooOO0o = 0;
        int i2 = 0;
        while (i < length2) {
            androidx.media3.common.Oooo0 oooo0 = oooo0Arr[i];
            this.f34162OooOOo0[i2] = oooo0;
            this.f34160OooOOOo[i2] = iOooOOoo;
            this.f34159OooOOOO[i2] = iOooOO0o;
            iOooOOoo += oooo0.OooOOoo();
            iOooOO0o += this.f34162OooOOo0[i2].OooOO0o();
            this.f34163OooOOoo.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f34158OooOOO0 = iOooOOoo;
        this.f34157OooOOO = iOooOO0o;
    }

    @Override // androidx.media3.common.Oooo0
    public final int OooOO0o() {
        return this.f34157OooOOO;
    }

    @Override // androidx.media3.common.Oooo0
    public final int OooOOoo() {
        return this.f34158OooOOO0;
    }

    @Override // o000O00O.OooO00o
    public final Object OooOo(int i) {
        return this.f34161OooOOo[i];
    }

    @Override // o000O00O.OooO00o
    public final int OooOo0(Object obj) {
        Integer num = this.f34163OooOOoo.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // o000O00O.OooO00o
    public final int OooOo0O(int i) {
        return p080o000OoO.o00.OooO0o0(this.f34159OooOOOO, i + 1, false, false);
    }

    @Override // o000O00O.OooO00o
    public final int OooOo0o(int i) {
        return p080o000OoO.o00.OooO0o0(this.f34160OooOOOo, i + 1, false, false);
    }

    @Override // o000O00O.OooO00o
    public final int OooOoO(int i) {
        return this.f34160OooOOOo[i];
    }

    @Override // o000O00O.OooO00o
    public final int OooOoO0(int i) {
        return this.f34159OooOOOO[i];
    }

    @Override // o000O00O.OooO00o
    public final androidx.media3.common.Oooo0 OooOoo0(int i) {
        return this.f34162OooOOo0[i];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oo0oOO0(List list, androidx.media3.exoplayer.source.o00Ooo o00ooo2) {
        androidx.media3.common.Oooo0[] oooo0Arr = new androidx.media3.common.Oooo0[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            oooo0Arr[i2] = ((oOO00O) it.next()).OooO0O0();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((oOO00O) it2.next()).OooO00o();
            i++;
        }
        this(oooo0Arr, objArr, o00ooo2);
    }
}
