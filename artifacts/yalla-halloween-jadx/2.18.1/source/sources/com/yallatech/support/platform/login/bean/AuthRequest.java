package com.yallatech.support.platform.login.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.yallatech.support.platform.base.BaseReq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/yallatech/support/platform/login/bean/AuthRequest;", "Lcom/yallatech/support/platform/base/BaseReq;", "Landroid/os/Parcelable;", "", "getType", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "stateCode", "Ljava/lang/String;", "getStateCode", "()Ljava/lang/String;", "setStateCode", "(Ljava/lang/String;)V", "", "scope", "[Ljava/lang/String;", "getScope", "()[Ljava/lang/String;", "setScope", "([Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class AuthRequest extends BaseReq {

    @NotNull
    public static final Parcelable.Creator<AuthRequest> CREATOR = new OooO00o();

    @Nullable
    private String[] scope;

    @Nullable
    private String stateCode;

    public static final class OooO00o implements Parcelable.Creator<AuthRequest> {
        @Override // android.os.Parcelable.Creator
        public final AuthRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthRequest(parcel.readString(), parcel.createStringArray());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRequest[] newArray(int i) {
            return new AuthRequest[i];
        }
    }

    public AuthRequest(@Nullable String str, @Nullable String[] strArr) {
        this.stateCode = str;
        this.scope = strArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String[] getScope() {
        return this.scope;
    }

    @Nullable
    public final String getStateCode() {
        return this.stateCode;
    }

    @Override // com.yallatech.support.platform.base.BaseReq
    public int getType() {
        return 1;
    }

    public final void setScope(@Nullable String[] strArr) {
        this.scope = strArr;
    }

    public final void setStateCode(@Nullable String str) {
        this.stateCode = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.stateCode);
        parcel.writeStringArray(this.scope);
    }
}
