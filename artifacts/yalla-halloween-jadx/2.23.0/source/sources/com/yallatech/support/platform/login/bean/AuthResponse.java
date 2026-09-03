package com.yallatech.support.platform.login.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.layout.oo000o;
import com.yallatech.support.platform.base.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\r\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0004J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/yallatech/support/platform/login/bean/AuthResponse;", "Lcom/yallatech/support/platform/base/BaseResp;", "", "getType", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "", "component1", "()Ljava/lang/String;", "authCode", "copy", "(Ljava/lang/String;)Lcom/yallatech/support/platform/login/bean/AuthResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAuthCode", "setAuthCode", "(Ljava/lang/String;)V", "<init>", "(Landroid/os/Parcel;)V", "Companion", "OooO0O0", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AuthResponse extends BaseResp {

    @NotNull
    private String authCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    public static Parcelable.Creator<AuthResponse> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.Creator<AuthResponse> {
        @Override // android.os.Parcelable.Creator
        public final AuthResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthResponse[] newArray(int i) {
            return new AuthResponse[i];
        }
    }

    /* JADX INFO: renamed from: com.yallatech.support.platform.login.bean.AuthResponse$OooO0O0, reason: from kotlin metadata */
    public static final class Companion {
        public static AuthResponse OooO00o(Companion companion, String str, int i, String str2, int i2) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            companion.getClass();
            if (str == null) {
                str = "";
            }
            AuthResponse authResponse = new AuthResponse(str);
            authResponse.setCode(i);
            if (str2 == null) {
                str2 = "";
            }
            authResponse.setMsg(str2);
            return authResponse;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthResponse copy$default(AuthResponse authResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authResponse.authCode;
        }
        return authResponse.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    @NotNull
    public final AuthResponse copy(@NotNull String authCode) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        return new AuthResponse(authCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthResponse) && Intrinsics.areEqual(this.authCode, ((AuthResponse) other).authCode);
    }

    @NotNull
    public final String getAuthCode() {
        return this.authCode;
    }

    @Override // com.yallatech.support.platform.base.BaseResp
    public int getType() {
        return 1;
    }

    public int hashCode() {
        return this.authCode.hashCode();
    }

    public final void setAuthCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authCode = str;
    }

    @NotNull
    public String toString() {
        return oo000o.OooO00o(new StringBuilder("AuthResponse(authCode="), this.authCode, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.authCode);
        parcel.writeInt(getCode());
        parcel.writeString(getMsg());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthResponse(@NotNull String authCode) {
        super(0, null, 3, null);
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        this.authCode = authCode;
    }

    public /* synthetic */ AuthResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthResponse(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        this(string == null ? "" : string);
        setCode(parcel.readInt());
        String string2 = parcel.readString();
        setMsg(string2 != null ? string2 : "");
    }
}
