package p076o000Oo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;
import p028Oooo0oO.o0O00o0;
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooOo00 extends VersionedParcel {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f34903OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseIntArray f34904OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f34905OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Parcel f34906OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f34907OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f34908OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f34909OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f34910OooOO0O;

    public OooOo00(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new OooOO0(), new OooOO0(), new OooOO0());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int OooO() {
        return this.f34906OooO0o0.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final OooOo00 OooO00o() {
        Parcel parcel = this.f34906OooO0o0;
        int iDataPosition = parcel.dataPosition();
        int i = this.f34909OooOO0;
        if (i == this.f34905OooO0o) {
            i = this.f34907OooO0oO;
        }
        return new OooOo00(parcel, iDataPosition, i, o0O00o0.OooO0O0(new StringBuilder(), this.f34908OooO0oo, "  "), this.f8254OooO00o, this.f8255OooO0O0, this.f8256OooO0OO);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] OooO0o() {
        Parcel parcel = this.f34906OooO0o0;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean OooO0o0() {
        return this.f34906OooO0o0.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence OooO0oO() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f34906OooO0o0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean OooO0oo(int i) {
        while (this.f34909OooOO0 < this.f34907OooO0oO) {
            int i2 = this.f34910OooOO0O;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f34909OooOO0;
            Parcel parcel = this.f34906OooO0o0;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f34910OooOO0O = parcel.readInt();
            this.f34909OooOO0 += i4;
        }
        return this.f34910OooOO0O == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T OooOO0O() {
        return (T) this.f34906OooO0o0.readParcelable(OooOo00.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String OooOOO0() {
        return this.f34906OooO0o0.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOOO(int i) {
        OooOo();
        this.f34903OooO = i;
        this.f34904OooO0Oo.put(i, this.f34906OooO0o0.dataPosition());
        OooOOoo(0);
        OooOOoo(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOOo(boolean z) {
        this.f34906OooO0o0.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOo(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f34906OooO0o0, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOo0(byte[] bArr) {
        Parcel parcel = this.f34906OooO0o0;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOoo(int i) {
        this.f34906OooO0o0.writeInt(i);
    }

    public final void OooOo() {
        int i = this.f34903OooO;
        if (i >= 0) {
            int i2 = this.f34904OooO0Oo.get(i);
            Parcel parcel = this.f34906OooO0o0;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOo0(Parcelable parcelable) {
        this.f34906OooO0o0.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOo0O(String str) {
        this.f34906OooO0o0.writeString(str);
    }

    public OooOo00(Parcel parcel, int i, int i2, String str, OooOO0<String, Method> oooOO1, OooOO0<String, Method> oooOO2, OooOO0<String, Class> oooOO3) {
        super(oooOO1, oooOO2, oooOO3);
        this.f34904OooO0Oo = new SparseIntArray();
        this.f34903OooO = -1;
        this.f34910OooOO0O = -1;
        this.f34906OooO0o0 = parcel;
        this.f34905OooO0o = i;
        this.f34907OooO0oO = i2;
        this.f34909OooOO0 = i;
        this.f34908OooO0oo = str;
    }
}
