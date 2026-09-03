package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f5863OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f5864OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f5865OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f5866OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f5867OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f5868OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f5869OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f5870OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f5871OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f5872OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f5873OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final String f5874OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f5875OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f5876OooOOo0;

    public class OooO00o implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f5864OooO0Oo = fragment.getClass().getName();
        this.f5866OooO0o0 = fragment.mWho;
        this.f5865OooO0o = fragment.mFromLayout;
        this.f5867OooO0oO = fragment.mFragmentId;
        this.f5868OooO0oo = fragment.mContainerId;
        this.f5863OooO = fragment.mTag;
        this.f5869OooOO0 = fragment.mRetainInstance;
        this.f5870OooOO0O = fragment.mRemoving;
        this.f5871OooOO0o = fragment.mDetached;
        this.f5873OooOOO0 = fragment.mHidden;
        this.f5872OooOOO = fragment.mMaxState.ordinal();
        this.f5874OooOOOO = fragment.mTargetWho;
        this.f5875OooOOOo = fragment.mTargetRequestCode;
        this.f5876OooOOo0 = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f5864OooO0Oo);
        sb.append(" (");
        sb.append(this.f5866OooO0o0);
        sb.append(")}:");
        if (this.f5865OooO0o) {
            sb.append(" fromLayout");
        }
        int i = this.f5868OooO0oo;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f5863OooO;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f5869OooOO0) {
            sb.append(" retainInstance");
        }
        if (this.f5870OooOO0O) {
            sb.append(" removing");
        }
        if (this.f5871OooOO0o) {
            sb.append(" detached");
        }
        if (this.f5873OooOOO0) {
            sb.append(" hidden");
        }
        String str2 = this.f5874OooOOOO;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f5875OooOOOo);
        }
        if (this.f5876OooOOo0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5864OooO0Oo);
        parcel.writeString(this.f5866OooO0o0);
        parcel.writeInt(this.f5865OooO0o ? 1 : 0);
        parcel.writeInt(this.f5867OooO0oO);
        parcel.writeInt(this.f5868OooO0oo);
        parcel.writeString(this.f5863OooO);
        parcel.writeInt(this.f5869OooOO0 ? 1 : 0);
        parcel.writeInt(this.f5870OooOO0O ? 1 : 0);
        parcel.writeInt(this.f5871OooOO0o ? 1 : 0);
        parcel.writeInt(this.f5873OooOOO0 ? 1 : 0);
        parcel.writeInt(this.f5872OooOOO);
        parcel.writeString(this.f5874OooOOOO);
        parcel.writeInt(this.f5875OooOOOo);
        parcel.writeInt(this.f5876OooOOo0 ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f5864OooO0Oo = parcel.readString();
        this.f5866OooO0o0 = parcel.readString();
        this.f5865OooO0o = parcel.readInt() != 0;
        this.f5867OooO0oO = parcel.readInt();
        this.f5868OooO0oo = parcel.readInt();
        this.f5863OooO = parcel.readString();
        this.f5869OooOO0 = parcel.readInt() != 0;
        this.f5870OooOO0O = parcel.readInt() != 0;
        this.f5871OooOO0o = parcel.readInt() != 0;
        this.f5873OooOOO0 = parcel.readInt() != 0;
        this.f5872OooOOO = parcel.readInt();
        this.f5874OooOOOO = parcel.readString();
        this.f5875OooOOOo = parcel.readInt();
        this.f5876OooOOo0 = parcel.readInt() != 0;
    }
}
