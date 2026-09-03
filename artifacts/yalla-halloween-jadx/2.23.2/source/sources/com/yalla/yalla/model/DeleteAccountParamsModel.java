package com.yalla.yalla.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lcom/yalla/yalla/model/DeleteAccountParamsModel;", "Landroid/os/Parcelable;", "reasonTypeOne", "", "reasonTypeTwo", "inputText", "", "(ILjava/lang/Integer;Ljava/lang/String;)V", "getInputText", "()Ljava/lang/String;", "getReasonTypeOne", "()I", "getReasonTypeTwo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/String;)Lcom/yalla/yalla/model/DeleteAccountParamsModel;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DeleteAccountParamsModel implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<DeleteAccountParamsModel> CREATOR = new Creator();

    @Nullable
    private final String inputText;
    private final int reasonTypeOne;

    @Nullable
    private final Integer reasonTypeTwo;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeleteAccountParamsModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DeleteAccountParamsModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeleteAccountParamsModel(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DeleteAccountParamsModel[] newArray(int i) {
            return new DeleteAccountParamsModel[i];
        }
    }

    public DeleteAccountParamsModel(int i, @Nullable Integer num, @Nullable String str) {
        this.reasonTypeOne = i;
        this.reasonTypeTwo = num;
        this.inputText = str;
    }

    public static /* synthetic */ DeleteAccountParamsModel copy$default(DeleteAccountParamsModel deleteAccountParamsModel, int i, Integer num, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deleteAccountParamsModel.reasonTypeOne;
        }
        if ((i2 & 2) != 0) {
            num = deleteAccountParamsModel.reasonTypeTwo;
        }
        if ((i2 & 4) != 0) {
            str = deleteAccountParamsModel.inputText;
        }
        return deleteAccountParamsModel.copy(i, num, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getReasonTypeOne() {
        return this.reasonTypeOne;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getReasonTypeTwo() {
        return this.reasonTypeTwo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInputText() {
        return this.inputText;
    }

    @NotNull
    public final DeleteAccountParamsModel copy(int reasonTypeOne, @Nullable Integer reasonTypeTwo, @Nullable String inputText) {
        return new DeleteAccountParamsModel(reasonTypeOne, reasonTypeTwo, inputText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountParamsModel)) {
            return false;
        }
        DeleteAccountParamsModel deleteAccountParamsModel = (DeleteAccountParamsModel) other;
        return this.reasonTypeOne == deleteAccountParamsModel.reasonTypeOne && Intrinsics.areEqual(this.reasonTypeTwo, deleteAccountParamsModel.reasonTypeTwo) && Intrinsics.areEqual(this.inputText, deleteAccountParamsModel.inputText);
    }

    @Nullable
    public final String getInputText() {
        return this.inputText;
    }

    public final int getReasonTypeOne() {
        return this.reasonTypeOne;
    }

    @Nullable
    public final Integer getReasonTypeTwo() {
        return this.reasonTypeTwo;
    }

    public int hashCode() {
        int i = this.reasonTypeOne * 31;
        Integer num = this.reasonTypeTwo;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.inputText;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.reasonTypeOne;
        Integer num = this.reasonTypeTwo;
        String str = this.inputText;
        StringBuilder sb = new StringBuilder("DeleteAccountParamsModel(reasonTypeOne=");
        sb.append(i);
        sb.append(", reasonTypeTwo=");
        sb.append(num);
        sb.append(", inputText=");
        return o0oOO.OooO0O0(sb, str, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.reasonTypeOne);
        Integer num = this.reasonTypeTwo;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.inputText);
    }
}
