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
    public final String f5877OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f5878OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f5879OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f5880OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f5881OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f5882OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f5883OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f5884OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f5885OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f5886OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f5887OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final String f5888OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f5889OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f5890OooOOo0;

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
        this.f5878OooO0Oo = fragment.getClass().getName();
        this.f5880OooO0o0 = fragment.mWho;
        this.f5879OooO0o = fragment.mFromLayout;
        this.f5881OooO0oO = fragment.mFragmentId;
        this.f5882OooO0oo = fragment.mContainerId;
        this.f5877OooO = fragment.mTag;
        this.f5883OooOO0 = fragment.mRetainInstance;
        this.f5884OooOO0O = fragment.mRemoving;
        this.f5885OooOO0o = fragment.mDetached;
        this.f5887OooOOO0 = fragment.mHidden;
        this.f5886OooOOO = fragment.mMaxState.ordinal();
        this.f5888OooOOOO = fragment.mTargetWho;
        this.f5889OooOOOo = fragment.mTargetRequestCode;
        this.f5890OooOOo0 = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f5878OooO0Oo);
        sb.append(" (");
        sb.append(this.f5880OooO0o0);
        sb.append(")}:");
        if (this.f5879OooO0o) {
            sb.append(" fromLayout");
        }
        int i = this.f5882OooO0oo;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f5877OooO;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f5883OooOO0) {
            sb.append(" retainInstance");
        }
        if (this.f5884OooOO0O) {
            sb.append(" removing");
        }
        if (this.f5885OooOO0o) {
            sb.append(" detached");
        }
        if (this.f5887OooOOO0) {
            sb.append(" hidden");
        }
        String str2 = this.f5888OooOOOO;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f5889OooOOOo);
        }
        if (this.f5890OooOOo0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5878OooO0Oo);
        parcel.writeString(this.f5880OooO0o0);
        parcel.writeInt(this.f5879OooO0o ? 1 : 0);
        parcel.writeInt(this.f5881OooO0oO);
        parcel.writeInt(this.f5882OooO0oo);
        parcel.writeString(this.f5877OooO);
        parcel.writeInt(this.f5883OooOO0 ? 1 : 0);
        parcel.writeInt(this.f5884OooOO0O ? 1 : 0);
        parcel.writeInt(this.f5885OooOO0o ? 1 : 0);
        parcel.writeInt(this.f5887OooOOO0 ? 1 : 0);
        parcel.writeInt(this.f5886OooOOO);
        parcel.writeString(this.f5888OooOOOO);
        parcel.writeInt(this.f5889OooOOOo);
        parcel.writeInt(this.f5890OooOOo0 ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f5878OooO0Oo = parcel.readString();
        this.f5880OooO0o0 = parcel.readString();
        this.f5879OooO0o = parcel.readInt() != 0;
        this.f5881OooO0oO = parcel.readInt();
        this.f5882OooO0oo = parcel.readInt();
        this.f5877OooO = parcel.readString();
        this.f5883OooOO0 = parcel.readInt() != 0;
        this.f5884OooOO0O = parcel.readInt() != 0;
        this.f5885OooOO0o = parcel.readInt() != 0;
        this.f5887OooOOO0 = parcel.readInt() != 0;
        this.f5886OooOOO = parcel.readInt();
        this.f5888OooOOOO = parcel.readString();
        this.f5889OooOOOo = parcel.readInt();
        this.f5890OooOOo0 = parcel.readInt() != 0;
    }
}
