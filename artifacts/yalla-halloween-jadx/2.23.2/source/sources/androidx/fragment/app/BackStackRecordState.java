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
    public final String f5758OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f5759OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int[] f5760OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList<String> f5761OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f5762OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f5763OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f5764OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f5765OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final CharSequence f5766OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final CharSequence f5767OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f5768OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ArrayList<String> f5769OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ArrayList<String> f5770OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f5771OooOOo0;

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
        int size = oooO00o.f6002OooO00o.size();
        this.f5759OooO0Oo = new int[size * 6];
        if (!oooO00o.f6008OooO0oO) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f5761OooO0o0 = new ArrayList<>(size);
        this.f5760OooO0o = new int[size];
        this.f5762OooO0oO = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            o0000oo.OooO00o oooO00o2 = oooO00o.f6002OooO00o.get(i);
            int i3 = i2 + 1;
            this.f5759OooO0Oo[i2] = oooO00o2.f6017OooO00o;
            ArrayList<String> arrayList = this.f5761OooO0o0;
            Fragment fragment = oooO00o2.f6018OooO0O0;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f5759OooO0Oo;
            int i4 = i3 + 1;
            iArr[i3] = oooO00o2.f6019OooO0OO ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = oooO00o2.f6020OooO0Oo;
            int i6 = i5 + 1;
            iArr[i5] = oooO00o2.f6022OooO0o0;
            int i7 = i6 + 1;
            iArr[i6] = oooO00o2.f6021OooO0o;
            iArr[i7] = oooO00o2.f6023OooO0oO;
            this.f5760OooO0o[i] = oooO00o2.f6024OooO0oo.ordinal();
            this.f5762OooO0oO[i] = oooO00o2.f6016OooO.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.f5763OooO0oo = oooO00o.f6006OooO0o;
        this.f5758OooO = oooO00o.f6009OooO0oo;
        this.f5764OooOO0 = oooO00o.f5897OooOOo;
        this.f5765OooOO0O = oooO00o.f6001OooO;
        this.f5766OooOO0o = oooO00o.f6010OooOO0;
        this.f5768OooOOO0 = oooO00o.f6011OooOO0O;
        this.f5767OooOOO = oooO00o.f6012OooOO0o;
        this.f5769OooOOOO = oooO00o.f6014OooOOO0;
        this.f5770OooOOOo = oooO00o.f6013OooOOO;
        this.f5771OooOOo0 = oooO00o.f6015OooOOOO;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f5759OooO0Oo);
        parcel.writeStringList(this.f5761OooO0o0);
        parcel.writeIntArray(this.f5760OooO0o);
        parcel.writeIntArray(this.f5762OooO0oO);
        parcel.writeInt(this.f5763OooO0oo);
        parcel.writeString(this.f5758OooO);
        parcel.writeInt(this.f5764OooOO0);
        parcel.writeInt(this.f5765OooOO0O);
        TextUtils.writeToParcel(this.f5766OooOO0o, parcel, 0);
        parcel.writeInt(this.f5768OooOOO0);
        TextUtils.writeToParcel(this.f5767OooOOO, parcel, 0);
        parcel.writeStringList(this.f5769OooOOOO);
        parcel.writeStringList(this.f5770OooOOOo);
        parcel.writeInt(this.f5771OooOOo0 ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f5759OooO0Oo = parcel.createIntArray();
        this.f5761OooO0o0 = parcel.createStringArrayList();
        this.f5760OooO0o = parcel.createIntArray();
        this.f5762OooO0oO = parcel.createIntArray();
        this.f5763OooO0oo = parcel.readInt();
        this.f5758OooO = parcel.readString();
        this.f5764OooOO0 = parcel.readInt();
        this.f5765OooOO0O = parcel.readInt();
        this.f5766OooOO0o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5768OooOOO0 = parcel.readInt();
        this.f5767OooOOO = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5769OooOOOO = parcel.createStringArrayList();
        this.f5770OooOOOo = parcel.createStringArrayList();
        this.f5771OooOOo0 = parcel.readInt() != 0;
    }
}
