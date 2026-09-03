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
    public final ArrayList<String> f5855OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<String> f5856OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public BackStackRecordState[] f5857OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<String> f5858OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f5859OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f5860OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList<BackStackState> f5861OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f5862OooOO0O;

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
        this.f5860OooO0oo = null;
        this.f5855OooO = new ArrayList<>();
        this.f5861OooOO0 = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f5856OooO0Oo);
        parcel.writeStringList(this.f5858OooO0o0);
        parcel.writeTypedArray(this.f5857OooO0o, i);
        parcel.writeInt(this.f5859OooO0oO);
        parcel.writeString(this.f5860OooO0oo);
        parcel.writeStringList(this.f5855OooO);
        parcel.writeTypedList(this.f5861OooOO0);
        parcel.writeTypedList(this.f5862OooOO0O);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f5860OooO0oo = null;
        this.f5855OooO = new ArrayList<>();
        this.f5861OooOO0 = new ArrayList<>();
        this.f5856OooO0Oo = parcel.createStringArrayList();
        this.f5858OooO0o0 = parcel.createStringArrayList();
        this.f5857OooO0o = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f5859OooO0oO = parcel.readInt();
        this.f5860OooO0oo = parcel.readString();
        this.f5855OooO = parcel.createStringArrayList();
        this.f5861OooOO0 = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f5862OooOO0O = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
