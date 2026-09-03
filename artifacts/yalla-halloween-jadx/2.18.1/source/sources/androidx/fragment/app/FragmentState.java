package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f8347Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f8348Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f8349Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f8350Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final boolean f8351OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final String f8352OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f8353OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final boolean f8354OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final boolean f8355OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final boolean f8356OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final int f8357OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public Bundle f8358OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final Bundle f8359o000oOoO;

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
        this.f8348Oooo0o = fragment.getClass().getName();
        this.f8349Oooo0oO = fragment.mWho;
        this.f8350Oooo0oo = fragment.mFromLayout;
        this.f8347Oooo = fragment.mFragmentId;
        this.f8353OoooO00 = fragment.mContainerId;
        this.f8352OoooO0 = fragment.mTag;
        this.f8354OoooO0O = fragment.mRetainInstance;
        this.f8351OoooO = fragment.mRemoving;
        this.f8355OoooOO0 = fragment.mDetached;
        this.f8359o000oOoO = fragment.mArguments;
        this.f8356OoooOOO = fragment.mHidden;
        this.f8357OoooOOo = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f8348Oooo0o);
        sb.append(" (");
        sb.append(this.f8349Oooo0oO);
        sb.append(")}:");
        if (this.f8350Oooo0oo) {
            sb.append(" fromLayout");
        }
        if (this.f8353OoooO00 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f8353OoooO00));
        }
        String str = this.f8352OoooO0;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f8352OoooO0);
        }
        if (this.f8354OoooO0O) {
            sb.append(" retainInstance");
        }
        if (this.f8351OoooO) {
            sb.append(" removing");
        }
        if (this.f8355OoooOO0) {
            sb.append(" detached");
        }
        if (this.f8356OoooOOO) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8348Oooo0o);
        parcel.writeString(this.f8349Oooo0oO);
        parcel.writeInt(this.f8350Oooo0oo ? 1 : 0);
        parcel.writeInt(this.f8347Oooo);
        parcel.writeInt(this.f8353OoooO00);
        parcel.writeString(this.f8352OoooO0);
        parcel.writeInt(this.f8354OoooO0O ? 1 : 0);
        parcel.writeInt(this.f8351OoooO ? 1 : 0);
        parcel.writeInt(this.f8355OoooOO0 ? 1 : 0);
        parcel.writeBundle(this.f8359o000oOoO);
        parcel.writeInt(this.f8356OoooOOO ? 1 : 0);
        parcel.writeBundle(this.f8358OoooOo0);
        parcel.writeInt(this.f8357OoooOOo);
    }

    public FragmentState(Parcel parcel) {
        this.f8348Oooo0o = parcel.readString();
        this.f8349Oooo0oO = parcel.readString();
        this.f8350Oooo0oo = parcel.readInt() != 0;
        this.f8347Oooo = parcel.readInt();
        this.f8353OoooO00 = parcel.readInt();
        this.f8352OoooO0 = parcel.readString();
        this.f8354OoooO0O = parcel.readInt() != 0;
        this.f8351OoooO = parcel.readInt() != 0;
        this.f8355OoooOO0 = parcel.readInt() != 0;
        this.f8359o000oOoO = parcel.readBundle();
        this.f8356OoooOOO = parcel.readInt() != 0;
        this.f8358OoooOo0 = parcel.readBundle();
        this.f8357OoooOOo = parcel.readInt();
    }
}
