package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f8339Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ArrayList<String> f8340Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ArrayList<String> f8341Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public BackStackRecordState[] f8342Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f8343OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ArrayList<String> f8344OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f8345OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ArrayList<BackStackState> f8346OoooO0O;

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
        this.f8345OoooO00 = null;
        this.f8344OoooO0 = new ArrayList<>();
        this.f8346OoooO0O = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f8340Oooo0o);
        parcel.writeStringList(this.f8341Oooo0oO);
        parcel.writeTypedArray(this.f8342Oooo0oo, i);
        parcel.writeInt(this.f8339Oooo);
        parcel.writeString(this.f8345OoooO00);
        parcel.writeStringList(this.f8344OoooO0);
        parcel.writeTypedList(this.f8346OoooO0O);
        parcel.writeTypedList(this.f8343OoooO);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f8345OoooO00 = null;
        this.f8344OoooO0 = new ArrayList<>();
        this.f8346OoooO0O = new ArrayList<>();
        this.f8340Oooo0o = parcel.createStringArrayList();
        this.f8341Oooo0oO = parcel.createStringArrayList();
        this.f8342Oooo0oo = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f8339Oooo = parcel.readInt();
        this.f8345OoooO00 = parcel.readString();
        this.f8344OoooO0 = parcel.createStringArrayList();
        this.f8346OoooO0O = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f8343OoooO = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
