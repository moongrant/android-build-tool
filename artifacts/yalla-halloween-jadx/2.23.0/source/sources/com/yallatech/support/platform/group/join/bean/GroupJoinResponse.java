package com.yallatech.support.platform.group.join.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.yallatech.support.platform.base.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/yallatech/support/platform/group/join/bean/GroupJoinResponse;", "Lcom/yallatech/support/platform/base/BaseResp;", "", "getType", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "<init>", "()V", "(Landroid/os/Parcel;)V", "Companion", "OooO0O0", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class GroupJoinResponse extends BaseResp {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    public static Parcelable.Creator<GroupJoinResponse> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.Creator<GroupJoinResponse> {
        @Override // android.os.Parcelable.Creator
        public final GroupJoinResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupJoinResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupJoinResponse[] newArray(int i) {
            return new GroupJoinResponse[i];
        }
    }

    /* JADX INFO: renamed from: com.yallatech.support.platform.group.join.bean.GroupJoinResponse$OooO0O0, reason: from kotlin metadata */
    public static final class Companion {
    }

    public GroupJoinResponse() {
        super(0, null, 3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.yallatech.support.platform.base.BaseResp
    public int getType() {
        return 4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(getCode());
        parcel.writeString(getMsg());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupJoinResponse(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        setCode(parcel.readInt());
        String string = parcel.readString();
        setMsg(string == null ? "" : string);
    }
}
