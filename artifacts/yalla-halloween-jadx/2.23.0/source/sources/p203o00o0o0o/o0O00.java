package p203o00o0o0o;

import com.google.android.exoplayer2.OooO00o;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.o00Ooo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O00 extends OooO00o {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f39240OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int[] f39241OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f39242OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int[] f39243OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final oo0o0Oo[] f39244OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final HashMap<Object, Integer> f39245OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Object[] f39246OooOOo0;

    public o0O00(oo0o0Oo[] oo0o0ooArr, Object[] objArr, o00Ooo o00ooo2) {
        super(o00ooo2);
        int length = oo0o0ooArr.length;
        this.f39244OooOOOo = oo0o0ooArr;
        this.f39241OooOOO = new int[length];
        this.f39243OooOOOO = new int[length];
        this.f39246OooOOo0 = objArr;
        this.f39245OooOOo = new HashMap<>();
        int length2 = oo0o0ooArr.length;
        int i = 0;
        int iOooOOOo = 0;
        int iOooO = 0;
        int i2 = 0;
        while (i < length2) {
            oo0o0Oo oo0o0oo = oo0o0ooArr[i];
            this.f39244OooOOOo[i2] = oo0o0oo;
            this.f39243OooOOOO[i2] = iOooOOOo;
            this.f39241OooOOO[i2] = iOooO;
            iOooOOOo += oo0o0oo.OooOOOo();
            iOooO += this.f39244OooOOOo[i2].OooO();
            this.f39245OooOOo.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f39240OooOO0o = iOooOOOo;
        this.f39242OooOOO0 = iOooO;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final int OooO() {
        return this.f39242OooOOO0;
    }

    @Override // com.google.android.exoplayer2.oo0o0Oo
    public final int OooOOOo() {
        return this.f39240OooOO0o;
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final int OooOOo(Object obj) {
        Integer num = this.f39245OooOOo.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final int OooOOoo(int i) {
        return p245o00oo0o.o0O00.OooO0o0(this.f39241OooOOO, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final Object OooOo0(int i) {
        return this.f39246OooOOo0[i];
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final int OooOo00(int i) {
        return p245o00oo0o.o0O00.OooO0o0(this.f39243OooOOOO, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final int OooOo0O(int i) {
        return this.f39241OooOOO[i];
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final int OooOo0o(int i) {
        return this.f39243OooOOOO[i];
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final oo0o0Oo OooOoO0(int i) {
        return this.f39244OooOOOo[i];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o0O00(List list, o00Ooo o00ooo2) {
        oo0o0Oo[] oo0o0ooArr = new oo0o0Oo[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            oo0o0ooArr[i2] = ((o0oOO) it.next()).OooO0O0();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((o0oOO) it2.next()).OooO00o();
            i++;
        }
        this(oo0o0ooArr, objArr, o00ooo2);
    }
}
