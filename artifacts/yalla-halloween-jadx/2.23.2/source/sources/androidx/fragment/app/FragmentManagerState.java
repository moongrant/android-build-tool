package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList<String> f5869OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<String> f5870OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public BackStackRecordState[] f5871OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<String> f5872OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f5873OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f5874OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList<BackStackState> f5875OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f5876OooOO0O;

    public class OooO00o implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.f5874OooO0oo = null;
        this.f5869OooO = new ArrayList<>();
        this.f5875OooOO0 = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f5870OooO0Oo);
        parcel.writeStringList(this.f5872OooO0o0);
        parcel.writeTypedArray(this.f5871OooO0o, i);
        parcel.writeInt(this.f5873OooO0oO);
        parcel.writeString(this.f5874OooO0oo);
        parcel.writeStringList(this.f5869OooO);
        parcel.writeTypedList(this.f5875OooOO0);
        parcel.writeTypedList(this.f5876OooOO0O);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f5874OooO0oo = null;
        this.f5869OooO = new ArrayList<>();
        this.f5875OooOO0 = new ArrayList<>();
        this.f5870OooO0Oo = parcel.createStringArrayList();
        this.f5872OooO0o0 = parcel.createStringArrayList();
        this.f5871OooO0o = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f5873OooO0oO = parcel.readInt();
        this.f5874OooO0oo = parcel.readString();
        this.f5869OooO = parcel.createStringArrayList();
        this.f5875OooOO0 = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f5876OooOO0O = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
