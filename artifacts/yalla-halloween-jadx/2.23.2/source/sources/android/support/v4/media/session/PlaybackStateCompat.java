package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f2120OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f2121OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f2122OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f2123OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f2124OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f2125OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final CharSequence f2126OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f2127OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList f2128OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Bundle f2129OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f2130OooOOO0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Actions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface MediaKeyAction {
    }

    public class OooO00o implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    @RequiresApi(21)
    public static class OooO0O0 {
        @DoNotInline
        public static long OooO(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        @DoNotInline
        public static void OooO00o(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        @DoNotInline
        public static PlaybackState.CustomAction OooO0O0(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        public static PlaybackState OooO0OO(PlaybackState.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        public static PlaybackState.Builder OooO0Oo() {
            return new PlaybackState.Builder();
        }

        @DoNotInline
        public static String OooO0o(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        @DoNotInline
        public static PlaybackState.CustomAction.Builder OooO0o0(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        @DoNotInline
        public static long OooO0oO(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        @DoNotInline
        public static long OooO0oo(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        @DoNotInline
        public static List<PlaybackState.CustomAction> OooOO0(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        @DoNotInline
        public static CharSequence OooOO0O(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        @DoNotInline
        public static Bundle OooOO0o(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        @DoNotInline
        public static long OooOOO(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        @DoNotInline
        public static int OooOOO0(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        @DoNotInline
        public static CharSequence OooOOOO(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        @DoNotInline
        public static float OooOOOo(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        @DoNotInline
        public static int OooOOo(PlaybackState playbackState) {
            return playbackState.getState();
        }

        @DoNotInline
        public static long OooOOo0(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        @DoNotInline
        public static void OooOOoo(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        @DoNotInline
        public static void OooOo(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }

        @DoNotInline
        public static void OooOo0(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        @DoNotInline
        public static void OooOo00(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        @DoNotInline
        public static void OooOo0O(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        @DoNotInline
        public static void OooOo0o(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    @RequiresApi(22)
    public static class OooO0OO {
        @DoNotInline
        public static Bundle OooO00o(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        @DoNotInline
        public static void OooO0O0(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface State {
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.f2121OooO0Oo = i;
        this.f2123OooO0o0 = j;
        this.f2122OooO0o = j2;
        this.f2124OooO0oO = f;
        this.f2125OooO0oo = j3;
        this.f2120OooO = i2;
        this.f2126OooOO0 = charSequence;
        this.f2127OooOO0O = j4;
        this.f2128OooOO0o = new ArrayList(arrayList);
        this.f2130OooOOO0 = j5;
        this.f2129OooOOO = bundle;
    }

    public static PlaybackStateCompat OooO00o(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> listOooOO0 = OooO0O0.OooOO0(playbackState);
        if (listOooOO0 != null) {
            ArrayList arrayList2 = new ArrayList(listOooOO0.size());
            for (PlaybackState.CustomAction customAction2 : listOooOO0) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle bundleOooOO0o = OooO0O0.OooOO0o(customAction3);
                    MediaSessionCompat.OooO00o(bundleOooOO0o);
                    customAction = new CustomAction(OooO0O0.OooO0o(customAction3), OooO0O0.OooOOOO(customAction3), OooO0O0.OooOOO0(customAction3), bundleOooOO0o);
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle bundleOooO00o = OooO0OO.OooO00o(playbackState);
        MediaSessionCompat.OooO00o(bundleOooO00o);
        return new PlaybackStateCompat(OooO0O0.OooOOo(playbackState), OooO0O0.OooOOo0(playbackState), OooO0O0.OooO(playbackState), OooO0O0.OooOOOo(playbackState), OooO0O0.OooO0oO(playbackState), 0, OooO0O0.OooOO0O(playbackState), OooO0O0.OooOOO(playbackState), arrayList, OooO0O0.OooO0oo(playbackState), bundleOooO00o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f2121OooO0Oo);
        sb.append(", position=");
        sb.append(this.f2123OooO0o0);
        sb.append(", buffered position=");
        sb.append(this.f2122OooO0o);
        sb.append(", speed=");
        sb.append(this.f2124OooO0oO);
        sb.append(", updated=");
        sb.append(this.f2127OooOO0O);
        sb.append(", actions=");
        sb.append(this.f2125OooO0oo);
        sb.append(", error code=");
        sb.append(this.f2120OooO);
        sb.append(", error message=");
        sb.append(this.f2126OooOO0);
        sb.append(", custom actions=");
        sb.append(this.f2128OooOO0o);
        sb.append(", active item id=");
        return android.support.v4.media.session.OooO0OO.OooO0O0(sb, this.f2130OooOOO0, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2121OooO0Oo);
        parcel.writeLong(this.f2123OooO0o0);
        parcel.writeFloat(this.f2124OooO0oO);
        parcel.writeLong(this.f2127OooOO0O);
        parcel.writeLong(this.f2122OooO0o);
        parcel.writeLong(this.f2125OooO0oo);
        TextUtils.writeToParcel(this.f2126OooOO0, parcel, i);
        parcel.writeTypedList(this.f2128OooOO0o);
        parcel.writeLong(this.f2130OooOOO0);
        parcel.writeBundle(this.f2129OooOOO);
        parcel.writeInt(this.f2120OooO);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f2131OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f2132OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final CharSequence f2133OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Bundle f2134OooO0oO;

        public class OooO00o implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f2131OooO0Oo = str;
            this.f2133OooO0o0 = charSequence;
            this.f2132OooO0o = i;
            this.f2134OooO0oO = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f2133OooO0o0) + ", mIcon=" + this.f2132OooO0o + ", mExtras=" + this.f2134OooO0oO;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2131OooO0Oo);
            TextUtils.writeToParcel(this.f2133OooO0o0, parcel, i);
            parcel.writeInt(this.f2132OooO0o);
            parcel.writeBundle(this.f2134OooO0oO);
        }

        public CustomAction(Parcel parcel) {
            this.f2131OooO0Oo = parcel.readString();
            this.f2133OooO0o0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2132OooO0o = parcel.readInt();
            this.f2134OooO0oO = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f2121OooO0Oo = parcel.readInt();
        this.f2123OooO0o0 = parcel.readLong();
        this.f2124OooO0oO = parcel.readFloat();
        this.f2127OooOO0O = parcel.readLong();
        this.f2122OooO0o = parcel.readLong();
        this.f2125OooO0oo = parcel.readLong();
        this.f2126OooOO0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2128OooOO0o = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f2130OooOOO0 = parcel.readLong();
        this.f2129OooOOO = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f2120OooO = parcel.readInt();
    }
}
