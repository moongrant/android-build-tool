package o000oo0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;
import p021OooOooo.Oooo0;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO00o extends VersionedParcel {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f29823OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseIntArray f29824OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f29825OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Parcel f29826OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f29827OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f29828OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f29829OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f29830OooOO0O;

    public OooO00o(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new Oooo0(), new Oooo0(), new Oooo0());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean OooO(int i) {
        while (this.f29829OooOO0 < this.f29827OooO0oO) {
            int i2 = this.f29830OooOO0O;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f29826OooO0o0.setDataPosition(this.f29829OooOO0);
            int i3 = this.f29826OooO0o0.readInt();
            this.f29830OooOO0O = this.f29826OooO0o0.readInt();
            this.f29829OooOO0 += i3;
        }
        return this.f29830OooOO0O == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooO00o() {
        int i = this.f29823OooO;
        if (i >= 0) {
            int i2 = this.f29824OooO0Oo.get(i);
            int iDataPosition = this.f29826OooO0o0.dataPosition();
            this.f29826OooO0o0.setDataPosition(i2);
            this.f29826OooO0o0.writeInt(iDataPosition - i2);
            this.f29826OooO0o0.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel OooO0O0() {
        Parcel parcel = this.f29826OooO0o0;
        int iDataPosition = parcel.dataPosition();
        int i = this.f29829OooOO0;
        if (i == this.f29825OooO0o) {
            i = this.f29827OooO0oO;
        }
        return new OooO00o(parcel, iDataPosition, i, OooO.OooO00o(new StringBuilder(), this.f29828OooO0oo, "  "), this.f9606OooO00o, this.f9607OooO0O0, this.f9608OooO0OO);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean OooO0o() {
        return this.f29826OooO0o0.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] OooO0oO() {
        int i = this.f29826OooO0o0.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f29826OooO0o0.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence OooO0oo() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f29826OooO0o0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int OooOO0() {
        return this.f29826OooO0o0.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T OooOO0o() {
        return (T) this.f29826OooO0o0.readParcelable(OooO00o.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String OooOOO() {
        return this.f29826OooO0o0.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOOo(int i) {
        OooO00o();
        this.f29823OooO = i;
        this.f29824OooO0Oo.put(i, this.f29826OooO0o0.dataPosition());
        OooOo00(0);
        OooOo00(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOo(byte[] bArr) {
        if (bArr == null) {
            this.f29826OooO0o0.writeInt(-1);
        } else {
            this.f29826OooO0o0.writeInt(bArr.length);
            this.f29826OooO0o0.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOo0(boolean z) {
        this.f29826OooO0o0.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOOoo(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f29826OooO0o0, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOo(String str) {
        this.f29826OooO0o0.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOo00(int i) {
        this.f29826OooO0o0.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void OooOo0O(Parcelable parcelable) {
        this.f29826OooO0o0.writeParcelable(parcelable, 0);
    }

    public OooO00o(Parcel parcel, int i, int i2, String str, Oooo0<String, Method> oooo0, Oooo0<String, Method> oooo1, Oooo0<String, Class> oooo2) {
        super(oooo0, oooo1, oooo2);
        this.f29824OooO0Oo = new SparseIntArray();
        this.f29823OooO = -1;
        this.f29830OooOO0O = -1;
        this.f29826OooO0o0 = parcel;
        this.f29825OooO0o = i;
        this.f29827OooO0oO = i2;
        this.f29829OooOO0 = i;
        this.f29828OooO0oo = str;
    }
}
