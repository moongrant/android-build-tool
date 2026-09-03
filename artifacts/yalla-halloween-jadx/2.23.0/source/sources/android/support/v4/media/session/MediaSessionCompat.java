package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import p076o000Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ResultReceiver f2109OooO0Oo;

        public class OooO00o implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f2109OooO0Oo = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.f2109OooO0Oo.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @GuardedBy("mLock")
        public OooO0O0 f2111OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Object f2112OooO0o0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object f2110OooO0Oo = new Object();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @GuardedBy("mLock")
        public OooOo f2113OooO0oO = null;

        public class OooO00o implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Parcelable parcelable, OooO0O0 oooO0O0) {
            this.f2112OooO0o0 = parcelable;
            this.f2111OooO0o = oooO0O0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final OooO0O0 OooO00o() {
            OooO0O0 oooO0O0;
            synchronized (this.f2110OooO0Oo) {
                oooO0O0 = this.f2111OooO0o;
            }
            return oooO0O0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final void OooO0O0(OooO0O0 oooO0O0) {
            synchronized (this.f2110OooO0Oo) {
                this.f2111OooO0o = oooO0O0;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void OooO0OO(OooOo oooOo) {
            synchronized (this.f2110OooO0Oo) {
                this.f2113OooO0oO = oooOo;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f2112OooO0o0;
            if (obj2 == null) {
                return token.f2112OooO0o0 == null;
            }
            Object obj3 = token.f2112OooO0o0;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.f2112OooO0o0;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f2112OooO0o0, i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void OooO00o(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Bundle OooO0O0(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        OooO00o(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final MediaDescriptionCompat f2107OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f2108OooO0o0;

        public class OooO00o implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        @RequiresApi(21)
        public static class OooO0O0 {
            @DoNotInline
            public static MediaSession.QueueItem OooO00o(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            @DoNotInline
            public static MediaDescription OooO0O0(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            @DoNotInline
            public static long OooO0OO(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f2107OooO0Oo = mediaDescriptionCompat;
            this.f2108OooO0o0 = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.f2107OooO0Oo);
            sb.append(", Id=");
            return OooO0o.OooO0O0(sb, this.f2108OooO0o0, " }");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.f2107OooO0Oo.writeToParcel(parcel, i);
            parcel.writeLong(this.f2108OooO0o0);
        }

        public QueueItem(Parcel parcel) {
            this.f2107OooO0Oo = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f2108OooO0o0 = parcel.readLong();
        }
    }
}
