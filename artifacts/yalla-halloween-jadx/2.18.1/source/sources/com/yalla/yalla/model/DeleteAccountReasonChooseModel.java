package com.yalla.yalla.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eHÆ\u0003J\u0080\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00104J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0013\u00106\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020\u0006HÖ\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0003HÖ\u0001R&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\t\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u000b\u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001c¨\u0006@"}, d2 = {"Lcom/yalla/yalla/model/DeleteAccountReasonChooseModel;", "Landroid/os/Parcelable;", "id", "", "pId", "pic", "", ShareConstants.WEB_DIALOG_PARAM_TITLE, "subTitle", "isNeedInput", "", "isRequired", "inputText", "children", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getInputText", "()Ljava/lang/String;", "setInputText", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setNeedInput", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setRequired", "getPId", "setPId", "getPic", "setPic", "getSubTitle", "setSubTitle", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)Lcom/yalla/yalla/model/DeleteAccountReasonChooseModel;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class DeleteAccountReasonChooseModel implements Parcelable {

    @SerializedName("children")
    @Nullable
    private List<DeleteAccountReasonChooseModel> children;

    @SerializedName("id")
    @Nullable
    private Integer id;

    @SerializedName("inputText")
    @Nullable
    private String inputText;

    @SerializedName("isNeedInput")
    @Nullable
    private Boolean isNeedInput;

    @SerializedName("isRequired")
    @Nullable
    private Boolean isRequired;

    @SerializedName("pId")
    @Nullable
    private Integer pId;

    @SerializedName("pic")
    @Nullable
    private String pic;

    @SerializedName("subTitle")
    @Nullable
    private String subTitle;

    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_TITLE)
    @Nullable
    private String title;

    @NotNull
    public static final Parcelable.Creator<DeleteAccountReasonChooseModel> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeleteAccountReasonChooseModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DeleteAccountReasonChooseModel createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(DeleteAccountReasonChooseModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new DeleteAccountReasonChooseModel(numValueOf, numValueOf2, string, string2, string3, boolValueOf, boolValueOf2, string4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DeleteAccountReasonChooseModel[] newArray(int i) {
            return new DeleteAccountReasonChooseModel[i];
        }
    }

    public DeleteAccountReasonChooseModel() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public DeleteAccountReasonChooseModel(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable List<DeleteAccountReasonChooseModel> list) {
        this.id = num;
        this.pId = num2;
        this.pic = str;
        this.title = str2;
        this.subTitle = str3;
        this.isNeedInput = bool;
        this.isRequired = bool2;
        this.inputText = str4;
        this.children = list;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPId() {
        return this.pId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsNeedInput() {
        return this.isNeedInput;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsRequired() {
        return this.isRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInputText() {
        return this.inputText;
    }

    @Nullable
    public final List<DeleteAccountReasonChooseModel> component9() {
        return this.children;
    }

    @NotNull
    public final DeleteAccountReasonChooseModel copy(@Nullable Integer id, @Nullable Integer pId, @Nullable String pic, @Nullable String title, @Nullable String subTitle, @Nullable Boolean isNeedInput, @Nullable Boolean isRequired, @Nullable String inputText, @Nullable List<DeleteAccountReasonChooseModel> children) {
        return new DeleteAccountReasonChooseModel(id, pId, pic, title, subTitle, isNeedInput, isRequired, inputText, children);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountReasonChooseModel)) {
            return false;
        }
        DeleteAccountReasonChooseModel deleteAccountReasonChooseModel = (DeleteAccountReasonChooseModel) other;
        return Intrinsics.areEqual(this.id, deleteAccountReasonChooseModel.id) && Intrinsics.areEqual(this.pId, deleteAccountReasonChooseModel.pId) && Intrinsics.areEqual(this.pic, deleteAccountReasonChooseModel.pic) && Intrinsics.areEqual(this.title, deleteAccountReasonChooseModel.title) && Intrinsics.areEqual(this.subTitle, deleteAccountReasonChooseModel.subTitle) && Intrinsics.areEqual(this.isNeedInput, deleteAccountReasonChooseModel.isNeedInput) && Intrinsics.areEqual(this.isRequired, deleteAccountReasonChooseModel.isRequired) && Intrinsics.areEqual(this.inputText, deleteAccountReasonChooseModel.inputText) && Intrinsics.areEqual(this.children, deleteAccountReasonChooseModel.children);
    }

    @Nullable
    public final List<DeleteAccountReasonChooseModel> getChildren() {
        return this.children;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getInputText() {
        return this.inputText;
    }

    @Nullable
    public final Integer getPId() {
        return this.pId;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.pic;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subTitle;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isNeedInput;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRequired;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.inputText;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<DeleteAccountReasonChooseModel> list = this.children;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNeedInput() {
        return this.isNeedInput;
    }

    @Nullable
    public final Boolean isRequired() {
        return this.isRequired;
    }

    public final void setChildren(@Nullable List<DeleteAccountReasonChooseModel> list) {
        this.children = list;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setInputText(@Nullable String str) {
        this.inputText = str;
    }

    public final void setNeedInput(@Nullable Boolean bool) {
        this.isNeedInput = bool;
    }

    public final void setPId(@Nullable Integer num) {
        this.pId = num;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setRequired(@Nullable Boolean bool) {
        this.isRequired = bool;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DeleteAccountReasonChooseModel(id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", pId=");
        sbOooO0o0.append(this.pId);
        sbOooO0o0.append(", pic=");
        sbOooO0o0.append(this.pic);
        sbOooO0o0.append(", title=");
        sbOooO0o0.append(this.title);
        sbOooO0o0.append(", subTitle=");
        sbOooO0o0.append(this.subTitle);
        sbOooO0o0.append(", isNeedInput=");
        sbOooO0o0.append(this.isNeedInput);
        sbOooO0o0.append(", isRequired=");
        sbOooO0o0.append(this.isRequired);
        sbOooO0o0.append(", inputText=");
        sbOooO0o0.append(this.inputText);
        sbOooO0o0.append(", children=");
        return o000O0Oo.OooO00o(sbOooO0o0, this.children, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.pId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.pic);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        Boolean bool = this.isNeedInput;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isRequired;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.inputText);
        List<DeleteAccountReasonChooseModel> list = this.children;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DeleteAccountReasonChooseModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ DeleteAccountReasonChooseModel(Integer num, Integer num2, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? list : null);
    }
}
