package com.yallatech.support.platform.group.join.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.yallatech.support.platform.base.BaseReq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/yallatech/support/platform/group/join/bean/GroupJoinRequest;", "Lcom/yallatech/support/platform/base/BaseReq;", "Landroid/os/Parcelable;", "", "getType", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "access_token", "Ljava/lang/String;", "getAccess_token", "()Ljava/lang/String;", "setAccess_token", "(Ljava/lang/String;)V", "open_id", "getOpen_id", "setOpen_id", "group_open_id", "getGroup_open_id", "setGroup_open_id", "thirdPartyMark", "getThirdPartyMark", "setThirdPartyMark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class GroupJoinRequest extends BaseReq {

    @NotNull
    public static final Parcelable.Creator<GroupJoinRequest> CREATOR = new OooO00o();

    @Nullable
    private String access_token;

    @Nullable
    private String group_open_id;

    @Nullable
    private String open_id;

    @Nullable
    private String thirdPartyMark;

    public static final class OooO00o implements Parcelable.Creator<GroupJoinRequest> {
        @Override // android.os.Parcelable.Creator
        public final GroupJoinRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupJoinRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupJoinRequest[] newArray(int i) {
            return new GroupJoinRequest[i];
        }
    }

    public GroupJoinRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.access_token = str;
        this.open_id = str2;
        this.group_open_id = str3;
        this.thirdPartyMark = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAccess_token() {
        return this.access_token;
    }

    @Nullable
    public final String getGroup_open_id() {
        return this.group_open_id;
    }

    @Nullable
    public final String getOpen_id() {
        return this.open_id;
    }

    @Nullable
    public final String getThirdPartyMark() {
        return this.thirdPartyMark;
    }

    @Override // com.yallatech.support.platform.base.BaseReq
    public int getType() {
        return 4;
    }

    public final void setAccess_token(@Nullable String str) {
        this.access_token = str;
    }

    public final void setGroup_open_id(@Nullable String str) {
        this.group_open_id = str;
    }

    public final void setOpen_id(@Nullable String str) {
        this.open_id = str;
    }

    public final void setThirdPartyMark(@Nullable String str) {
        this.thirdPartyMark = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.access_token);
        parcel.writeString(this.open_id);
        parcel.writeString(this.group_open_id);
        parcel.writeString(this.thirdPartyMark);
    }

    public /* synthetic */ GroupJoinRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }
}
