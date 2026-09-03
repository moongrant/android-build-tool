package com.yalla.yalla.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.errorprone.annotations.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006&"}, d2 = {"Lcom/yalla/yalla/model/user/CountryItemData;", "Landroid/os/Parcelable;", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "", "countryName", "icon", "id", "", "isoCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getCountryName", "getIcon", "setIcon", "(Ljava/lang/String;)V", "getId", "()I", "getIsoCode", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CountryItemData implements Parcelable {

    @NotNull
    private final String countryCode;

    @NotNull
    private final String countryName;

    @NotNull
    private String icon;
    private final int id;

    @NotNull
    private final String isoCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CountryItemData> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/model/user/CountryItemData$Companion;", "", "()V", "createDefault", "Lcom/yalla/yalla/model/user/CountryItemData;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CountryItemData createDefault() {
            return new CountryItemData("966", "KSA", "", 1, "SA");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryItemData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CountryItemData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CountryItemData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CountryItemData[] newArray(int i) {
            return new CountryItemData[i];
        }
    }

    public CountryItemData(@NotNull String countryCode, @NotNull String countryName, @NotNull String icon, int i, @NotNull String isoCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(isoCode, "isoCode");
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.icon = icon;
        this.id = i;
        this.isoCode = isoCode;
    }

    public static /* synthetic */ CountryItemData copy$default(CountryItemData countryItemData, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = countryItemData.countryCode;
        }
        if ((i2 & 2) != 0) {
            str2 = countryItemData.countryName;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = countryItemData.icon;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = countryItemData.id;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = countryItemData.isoCode;
        }
        return countryItemData.copy(str, str5, str6, i3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    @NotNull
    public final CountryItemData copy(@NotNull String countryCode, @NotNull String countryName, @NotNull String icon, int id, @NotNull String isoCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(isoCode, "isoCode");
        return new CountryItemData(countryCode, countryName, icon, id, isoCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryItemData)) {
            return false;
        }
        CountryItemData countryItemData = (CountryItemData) other;
        return Intrinsics.areEqual(this.countryCode, countryItemData.countryCode) && Intrinsics.areEqual(this.countryName, countryItemData.countryName) && Intrinsics.areEqual(this.icon, countryItemData.icon) && this.id == countryItemData.id && Intrinsics.areEqual(this.isoCode, countryItemData.isoCode);
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getIsoCode() {
        return this.isoCode;
    }

    public int hashCode() {
        return this.isoCode.hashCode() + ((o0OO00O.OooO00o(this.icon, o0OO00O.OooO00o(this.countryName, this.countryCode.hashCode() * 31, 31), 31) + this.id) * 31);
    }

    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    @NotNull
    public String toString() {
        String str = this.countryCode;
        String str2 = this.countryName;
        String str3 = this.icon;
        int i = this.id;
        String str4 = this.isoCode;
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("CountryItemData(countryCode=", str, ", countryName=", str2, ", icon=");
        sbOooO0OO.append(str3);
        sbOooO0OO.append(", id=");
        sbOooO0OO.append(i);
        sbOooO0OO.append(", isoCode=");
        return o0O00o0.OooO0O0(sbOooO0OO, str4, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.countryCode);
        parcel.writeString(this.countryName);
        parcel.writeString(this.icon);
        parcel.writeInt(this.id);
        parcel.writeString(this.isoCode);
    }
}
