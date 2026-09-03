package o0OO0;

import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzx;
import com.google.android.gms.internal.play_billing.zzy;
import java.util.Objects;
import javax.annotation.CheckForNull;
import kotlin.UByte;
import p206o00o0o0o.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends zzx {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final OooO0o f37196OoooO0O = new OooO0o(null, new Object[0], 0);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @CheckForNull
    public final transient Object f37197Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final transient int f37198OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final transient Object[] f37199OoooO00;

    public OooO0o(@CheckForNull Object obj, Object[] objArr, int i) {
        this.f37197Oooo = obj;
        this.f37199OoooO00 = objArr;
        this.f37198OoooO0 = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final zzr OooO00o() {
        return new OooO0OO(this.f37199OoooO00, 1, this.f37198OoooO0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final zzy OooO0O0() {
        return new com.google.android.gms.internal.play_billing.OooO0O0(this, this.f37199OoooO00, this.f37198OoooO0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzx
    public final zzy OooO0OO() {
        return new com.google.android.gms.internal.play_billing.OooO0OO(this, new OooO0OO(this.f37199OoooO00, 0, this.f37198OoooO0));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0038->B:21:0x004e], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0063->B:31:0x007a], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0089->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.play_billing.zzx, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object obj3 = this.f37197Oooo;
        Object[] objArr = this.f37199OoooO00;
        int i = this.f37198OoooO0;
        if (obj == null) {
            obj2 = null;
        } else if (i == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            if (obj4.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        } else if (obj3 == null) {
            obj2 = null;
        } else if (obj3 instanceof byte[]) {
            byte[] bArr = (byte[]) obj3;
            int length = bArr.length - 1;
            int iOooO = o000OO0O.OooO(obj.hashCode());
            while (true) {
                int i2 = iOooO & length;
                int i3 = bArr[i2] & UByte.MAX_VALUE;
                if (i3 == 255) {
                    break;
                }
                if (obj.equals(objArr[i3])) {
                    obj2 = objArr[i3 ^ 1];
                } else {
                    iOooO = i2 + 1;
                }
            }
            obj2 = null;
        } else if (obj3 instanceof short[]) {
            short[] sArr = (short[]) obj3;
            int length2 = sArr.length - 1;
            int iOooO2 = o000OO0O.OooO(obj.hashCode());
            while (true) {
                int i4 = iOooO2 & length2;
                char c = (char) sArr[i4];
                if (c == 65535) {
                    break;
                }
                if (obj.equals(objArr[c])) {
                    obj2 = objArr[c ^ 1];
                } else {
                    iOooO2 = i4 + 1;
                }
            }
            obj2 = null;
        } else {
            int[] iArr = (int[]) obj3;
            int length3 = iArr.length - 1;
            int iOooO3 = o000OO0O.OooO(obj.hashCode());
            while (true) {
                int i5 = iOooO3 & length3;
                int i6 = iArr[i5];
                if (i6 == -1) {
                    break;
                }
                if (obj.equals(objArr[i6])) {
                    obj2 = objArr[i6 ^ 1];
                } else {
                    iOooO3 = i5 + 1;
                }
            }
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f37198OoooO0;
    }
}
