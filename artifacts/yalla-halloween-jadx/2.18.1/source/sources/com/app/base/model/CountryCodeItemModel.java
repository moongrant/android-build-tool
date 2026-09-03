package com.app.base.model;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/app/base/model/CountryCodeItemModel;", "Ljava/io/Serializable;", "()V", "CountryCode", "", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "Name", "getName", "setName", "id", "getId", "setId", "toString", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CountryCodeItemModel implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private String id = "";

    @NotNull
    private String Name = "";

    @NotNull
    private String CountryCode = "";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/app/base/model/CountryCodeItemModel$Companion;", "", "()V", "createDefault", "Lcom/app/base/model/CountryCodeItemModel;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CountryCodeItemModel createDefault() {
            CountryCodeItemModel countryCodeItemModel = new CountryCodeItemModel();
            countryCodeItemModel.setId("1");
            countryCodeItemModel.setName("KSA");
            countryCodeItemModel.setCountryCode("966");
            return countryCodeItemModel;
        }
    }

    @NotNull
    public final String getCountryCode() {
        return this.CountryCode;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.Name;
    }

    public final void setCountryCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.CountryCode = str;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Name = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CountryCodeItemModel(id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", Name=");
        sbOooO0o0.append(this.Name);
        sbOooO0o0.append(", CountryCode=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.CountryCode, ')');
    }
}
