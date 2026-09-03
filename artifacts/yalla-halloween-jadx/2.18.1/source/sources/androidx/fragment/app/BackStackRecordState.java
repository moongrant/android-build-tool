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

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int[] f8230Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int[] f8231Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ArrayList<String> f8232Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int[] f8233Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final int f8234OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final String f8235OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f8236OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f8237OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final CharSequence f8238OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final CharSequence f8239OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final ArrayList<String> f8240OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final ArrayList<String> f8241OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final boolean f8242OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int f8243o000oOoO;

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
        int size = oooO00o.f8443OooO00o.size();
        this.f8231Oooo0o = new int[size * 6];
        if (!oooO00o.f8449OooO0oO) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f8232Oooo0oO = new ArrayList<>(size);
        this.f8233Oooo0oo = new int[size];
        this.f8230Oooo = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            o00000OO.OooO00o oooO00o2 = oooO00o.f8443OooO00o.get(i);
            int i3 = i2 + 1;
            this.f8231Oooo0o[i2] = oooO00o2.f8458OooO00o;
            ArrayList<String> arrayList = this.f8232Oooo0oO;
            Fragment fragment = oooO00o2.f8459OooO0O0;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f8231Oooo0o;
            int i4 = i3 + 1;
            iArr[i3] = oooO00o2.f8460OooO0OO ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = oooO00o2.f8461OooO0Oo;
            int i6 = i5 + 1;
            iArr[i5] = oooO00o2.f8463OooO0o0;
            int i7 = i6 + 1;
            iArr[i6] = oooO00o2.f8462OooO0o;
            iArr[i7] = oooO00o2.f8464OooO0oO;
            this.f8233Oooo0oo[i] = oooO00o2.f8465OooO0oo.ordinal();
            this.f8230Oooo[i] = oooO00o2.f8457OooO.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.f8236OoooO00 = oooO00o.f8447OooO0o;
        this.f8235OoooO0 = oooO00o.f8450OooO0oo;
        this.f8237OoooO0O = oooO00o.f8370OooOOo;
        this.f8234OoooO = oooO00o.f8442OooO;
        this.f8238OoooOO0 = oooO00o.f8451OooOO0;
        this.f8243o000oOoO = oooO00o.f8452OooOO0O;
        this.f8239OoooOOO = oooO00o.f8453OooOO0o;
        this.f8240OoooOOo = oooO00o.f8455OooOOO0;
        this.f8241OoooOo0 = oooO00o.f8454OooOOO;
        this.f8242OoooOoO = oooO00o.f8456OooOOOO;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f8231Oooo0o);
        parcel.writeStringList(this.f8232Oooo0oO);
        parcel.writeIntArray(this.f8233Oooo0oo);
        parcel.writeIntArray(this.f8230Oooo);
        parcel.writeInt(this.f8236OoooO00);
        parcel.writeString(this.f8235OoooO0);
        parcel.writeInt(this.f8237OoooO0O);
        parcel.writeInt(this.f8234OoooO);
        TextUtils.writeToParcel(this.f8238OoooOO0, parcel, 0);
        parcel.writeInt(this.f8243o000oOoO);
        TextUtils.writeToParcel(this.f8239OoooOOO, parcel, 0);
        parcel.writeStringList(this.f8240OoooOOo);
        parcel.writeStringList(this.f8241OoooOo0);
        parcel.writeInt(this.f8242OoooOoO ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f8231Oooo0o = parcel.createIntArray();
        this.f8232Oooo0oO = parcel.createStringArrayList();
        this.f8233Oooo0oo = parcel.createIntArray();
        this.f8230Oooo = parcel.createIntArray();
        this.f8236OoooO00 = parcel.readInt();
        this.f8235OoooO0 = parcel.readString();
        this.f8237OoooO0O = parcel.readInt();
        this.f8234OoooO = parcel.readInt();
        this.f8238OoooOO0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8243o000oOoO = parcel.readInt();
        this.f8239OoooOOO = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8240OoooOOo = parcel.createStringArrayList();
        this.f8241OoooOo0 = parcel.createStringArrayList();
        this.f8242OoooOoO = parcel.readInt() != 0;
    }
}
