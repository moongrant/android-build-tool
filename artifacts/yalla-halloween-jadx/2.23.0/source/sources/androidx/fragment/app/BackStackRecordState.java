package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f5744OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f5745OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int[] f5746OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList<String> f5747OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f5748OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f5749OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f5750OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f5751OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final CharSequence f5752OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final CharSequence f5753OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f5754OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ArrayList<String> f5755OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ArrayList<String> f5756OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f5757OooOOo0;

    public class OooO00o implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(androidx.fragment.app.OooO00o oooO00o) {
        int size = oooO00o.f5962OooO00o.size();
        this.f5745OooO0Oo = new int[size * 6];
        if (!oooO00o.f5968OooO0oO) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f5747OooO0o0 = new ArrayList<>(size);
        this.f5746OooO0o = new int[size];
        this.f5748OooO0oO = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            o0000O00.OooO00o oooO00o2 = oooO00o.f5962OooO00o.get(i);
            int i3 = i2 + 1;
            this.f5745OooO0Oo[i2] = oooO00o2.f5977OooO00o;
            ArrayList<String> arrayList = this.f5747OooO0o0;
            Fragment fragment = oooO00o2.f5978OooO0O0;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f5745OooO0Oo;
            int i4 = i3 + 1;
            iArr[i3] = oooO00o2.f5979OooO0OO ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = oooO00o2.f5980OooO0Oo;
            int i6 = i5 + 1;
            iArr[i5] = oooO00o2.f5982OooO0o0;
            int i7 = i6 + 1;
            iArr[i6] = oooO00o2.f5981OooO0o;
            iArr[i7] = oooO00o2.f5983OooO0oO;
            this.f5746OooO0o[i] = oooO00o2.f5984OooO0oo.ordinal();
            this.f5748OooO0oO[i] = oooO00o2.f5976OooO.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.f5749OooO0oo = oooO00o.f5966OooO0o;
        this.f5744OooO = oooO00o.f5969OooO0oo;
        this.f5750OooOO0 = oooO00o.f5884OooOOo;
        this.f5751OooOO0O = oooO00o.f5961OooO;
        this.f5752OooOO0o = oooO00o.f5970OooOO0;
        this.f5754OooOOO0 = oooO00o.f5971OooOO0O;
        this.f5753OooOOO = oooO00o.f5972OooOO0o;
        this.f5755OooOOOO = oooO00o.f5974OooOOO0;
        this.f5756OooOOOo = oooO00o.f5973OooOOO;
        this.f5757OooOOo0 = oooO00o.f5975OooOOOO;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f5745OooO0Oo);
        parcel.writeStringList(this.f5747OooO0o0);
        parcel.writeIntArray(this.f5746OooO0o);
        parcel.writeIntArray(this.f5748OooO0oO);
        parcel.writeInt(this.f5749OooO0oo);
        parcel.writeString(this.f5744OooO);
        parcel.writeInt(this.f5750OooOO0);
        parcel.writeInt(this.f5751OooOO0O);
        TextUtils.writeToParcel(this.f5752OooOO0o, parcel, 0);
        parcel.writeInt(this.f5754OooOOO0);
        TextUtils.writeToParcel(this.f5753OooOOO, parcel, 0);
        parcel.writeStringList(this.f5755OooOOOO);
        parcel.writeStringList(this.f5756OooOOOo);
        parcel.writeInt(this.f5757OooOOo0 ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f5745OooO0Oo = parcel.createIntArray();
        this.f5747OooO0o0 = parcel.createStringArrayList();
        this.f5746OooO0o = parcel.createIntArray();
        this.f5748OooO0oO = parcel.createIntArray();
        this.f5749OooO0oo = parcel.readInt();
        this.f5744OooO = parcel.readString();
        this.f5750OooOO0 = parcel.readInt();
        this.f5751OooOO0O = parcel.readInt();
        this.f5752OooOO0o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5754OooOOO0 = parcel.readInt();
        this.f5753OooOOO = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5755OooOOOO = parcel.createStringArrayList();
        this.f5756OooOOOo = parcel.createStringArrayList();
        this.f5757OooOOo0 = parcel.readInt() != 0;
    }
}
