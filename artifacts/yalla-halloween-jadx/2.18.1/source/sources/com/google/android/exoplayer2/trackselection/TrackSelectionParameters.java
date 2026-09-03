package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import java.util.Locale;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f14782Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public final String f14783Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final String f14784Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f14785Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f14786OoooO00;

    public class OooO00o implements Parcelable.Creator<TrackSelectionParameters> {
        @Override // android.os.Parcelable.Creator
        public final TrackSelectionParameters createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TrackSelectionParameters[] newArray(int i) {
            return new TrackSelectionParameters[i];
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f14787OooO00o = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f14788OooO0O0 = 0;

        @Deprecated
        public OooO0O0() {
        }

        public OooO0O0 OooO00o(Context context) {
            CaptioningManager captioningManager;
            int i = o000OOo0.f36740OooO00o;
            if (i >= 19 && ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
                this.f14788OooO0O0 = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f14787OooO00o = i >= 21 ? locale.toLanguageTag() : locale.toString();
                }
            }
            return this;
        }
    }

    static {
        new TrackSelectionParameters(null, 0);
        CREATOR = new OooO00o();
    }

    public TrackSelectionParameters(@Nullable String str, int i) {
        this.f14783Oooo0o = o000OOo0.OooOoo0(null);
        this.f14784Oooo0oO = o000OOo0.OooOoo0(str);
        this.f14785Oooo0oo = i;
        this.f14782Oooo = false;
        this.f14786OoooO00 = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return TextUtils.equals(this.f14783Oooo0o, trackSelectionParameters.f14783Oooo0o) && TextUtils.equals(this.f14784Oooo0oO, trackSelectionParameters.f14784Oooo0oO) && this.f14785Oooo0oo == trackSelectionParameters.f14785Oooo0oo && this.f14782Oooo == trackSelectionParameters.f14782Oooo && this.f14786OoooO00 == trackSelectionParameters.f14786OoooO00;
    }

    public int hashCode() {
        String str = this.f14783Oooo0o;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f14784Oooo0oO;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f14785Oooo0oo) * 31) + (this.f14782Oooo ? 1 : 0)) * 31) + this.f14786OoooO00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14783Oooo0o);
        parcel.writeString(this.f14784Oooo0oO);
        parcel.writeInt(this.f14785Oooo0oo);
        boolean z = this.f14782Oooo;
        int i2 = o000OOo0.f36740OooO00o;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f14786OoooO00);
    }

    public TrackSelectionParameters(Parcel parcel) {
        this.f14783Oooo0o = parcel.readString();
        this.f14784Oooo0oO = parcel.readString();
        this.f14785Oooo0oo = parcel.readInt();
        int i = o000OOo0.f36740OooO00o;
        this.f14782Oooo = parcel.readInt() != 0;
        this.f14786OoooO00 = parcel.readInt();
    }
}
