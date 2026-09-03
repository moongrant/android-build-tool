package p113o00O00Oo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;
import p028Oooo0oO.o0oOO;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooOo00 extends VersionedParcel {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f36120OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseIntArray f36121OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f36122OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Parcel f36123OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f36124OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f36125OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f36126OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f36127OooOO0O;

    public OooOo00(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new OooO(), new OooO(), new OooO());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int OooO() {
        return this.f36123OooO0o0.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final OooOo00 OooO00o() {
        Parcel parcel = this.f36123OooO0o0;
        int iDataPosition = parcel.dataPosition();
        int i = this.f36126OooOO0;
        if (i == this.f36122OooO0o) {
            i = this.f36124OooO0oO;
        }
        return new OooOo00(parcel, iDataPosition, i, o0oOO.OooO0O0(new StringBuilder(), this.f36125OooO0oo, "  "), this.f11348OooO00o, this.f11349OooO0O0, this.f11350OooO0OO);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] OooO0o() {
        Parcel parcel = this.f36123OooO0o0;
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
        return this.f36123OooO0o0.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence OooO0oO() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f36123OooO0o0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean OooO0oo(int i) {
        while (this.f36126OooOO0 < this.f36124OooO0oO) {
            int i2 = this.f36127OooOO0O;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f36126OooOO0;
            Parcel parcel = this.f36123OooO0o0;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f36127OooOO0O = parcel.readInt();
            this.f36126OooOO0 += i4;
        }
        return this.f36127OooOO0O == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T OooOO0O() {
        return (T) this.f36123OooO0o0.readParcelable(OooOo00.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String OooOOO0() {
        return this.f36123OooO0o0.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOOO(int i) {
        OooOo();
        this.f36120OooO = i;
        this.f36121OooO0Oo.put(i, this.f36123OooO0o0.dataPosition());
        OooOOoo(0);
        OooOOoo(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOOo(boolean z) {
        this.f36123OooO0o0.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOo(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f36123OooO0o0, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOo0(byte[] bArr) {
        Parcel parcel = this.f36123OooO0o0;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOoo(int i) {
        this.f36123OooO0o0.writeInt(i);
    }

    public final void OooOo() {
        int i = this.f36120OooO;
        if (i >= 0) {
            int i2 = this.f36121OooO0Oo.get(i);
            Parcel parcel = this.f36123OooO0o0;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOo0(Parcelable parcelable) {
        this.f36123OooO0o0.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOo0O(String str) {
        this.f36123OooO0o0.writeString(str);
    }

    public OooOo00(Parcel parcel, int i, int i2, String str, OooO<String, Method> oooO, OooO<String, Method> oooO2, OooO<String, Class> oooO3) {
        super(oooO, oooO2, oooO3);
        this.f36121OooO0Oo = new SparseIntArray();
        this.f36120OooO = -1;
        this.f36127OooOO0O = -1;
        this.f36123OooO0o0 = parcel;
        this.f36122OooO0o = i;
        this.f36124OooO0oO = i2;
        this.f36126OooOO0 = i;
        this.f36125OooO0oo = str;
    }
}
