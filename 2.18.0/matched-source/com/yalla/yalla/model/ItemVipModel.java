package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0OOO00;
import p499o0o00Oo.OooOOO0;
import p500o0o00Oo0.OooOOO;
import p501o0o00OoO.o00000;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/yalla/yalla/model/ItemVipModel;", "", "", "privilegeId", "I", "getPrivilegeId", "()I", "setPrivilegeId", "(I)V", "", "privilegeName", "Ljava/lang/String;", "getPrivilegeName", "()Ljava/lang/String;", "setPrivilegeName", "(Ljava/lang/String;)V", "imgUrl", "getImgUrl", "setImgUrl", "", "isHighlight", "Z", "()Z", "setHighlight", "(Z)V", "Lo000oOoO/o0O00O;", "localShowRedDot", "Lo000oOoO/o0O00O;", "getLocalShowRedDot", "()Lo000oOoO/o0O00O;", "setLocalShowRedDot", "(Lo000oOoO/o0O00O;)V", "<init>", "()V", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ItemVipModel {
    private static final int Custom_Room_Theme_Id = 18;
    private static final int Exclusive_Bubble_Id = 19;
    private static final int Incognito_Access_Id = 20;
    private boolean isHighlight;

    @SerializedName("privilegeid")
    private int privilegeId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private String privilegeName = "";

    @NotNull
    private String imgUrl = "";

    @NotNull
    private o0O00O<Boolean> localShowRedDot = o0OOO00.OooO0Oo(Boolean.FALSE);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J \u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/model/ItemVipModel$Companion;", "", "()V", "Custom_Room_Theme_Id", "", "Exclusive_Bubble_Id", "Incognito_Access_Id", "isShowRedDot", "", "id", "setShowRedDot", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setShowRedDot$default(Companion companion, int i, Function0 function0, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                function0 = null;
            }
            companion.setShowRedDot(i, function0);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:14:0x008b A[ORIG_RETURN, RETURN] */
        public final boolean isShowRedDot(int id) {
            switch (id) {
                case 18:
                    OooOOO0 oooOOO0 = OooOOO0.f41199OooO00o;
                    o00000 o00000VarOooOO0O = OooOOO0.OooOO0O();
                    Objects.requireNonNull(o00000VarOooOO0O);
                    if (o00000VarOooOO0O.OooO00o("vipRedDot_CustomRoomTheme_Hide4Fragment" + OooOOO.f41235OooO00o.OooOo().getValue(), false)) {
                        return false;
                    }
                    return true;
                case 19:
                    OooOOO0 oooOOO1 = OooOOO0.f41199OooO00o;
                    o00000 o00000VarOooOO0O2 = OooOOO0.OooOO0O();
                    Objects.requireNonNull(o00000VarOooOO0O2);
                    if (o00000VarOooOO0O2.OooO00o("vipRedDot_ExclusiveBubble_Hide4Fragment" + OooOOO.f41235OooO00o.OooOo().getValue(), false)) {
                        return false;
                    }
                    return true;
                case 20:
                    OooOOO0 oooOOO2 = OooOOO0.f41199OooO00o;
                    o00000 o00000VarOooOO0O3 = OooOOO0.OooOO0O();
                    Objects.requireNonNull(o00000VarOooOO0O3);
                    if (o00000VarOooOO0O3.OooO00o("vipRedDot_IncognitoAccess_Hide4Fragment" + OooOOO.f41235OooO00o.OooOo().getValue(), false)) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }

        public final void setShowRedDot(int id, @Nullable Function0<Unit> listener) {
            switch (id) {
                case 18:
                    OooOOO0 oooOOO0 = OooOOO0.f41199OooO00o;
                    OooOOO0.OooOO0O().OooOO0o();
                    if (listener != null) {
                        listener.invoke();
                    }
                    break;
                case 19:
                    OooOOO0 oooOOO1 = OooOOO0.f41199OooO00o;
                    OooOOO0.OooOO0O().OooOOO0();
                    if (listener != null) {
                        listener.invoke();
                    }
                    break;
                case 20:
                    OooOOO0 oooOOO2 = OooOOO0.f41199OooO00o;
                    OooOOO0.OooOO0O().OooOOO();
                    if (listener != null) {
                        listener.invoke();
                    }
                    break;
            }
        }
    }

    @NotNull
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @NotNull
    public final o0O00O<Boolean> getLocalShowRedDot() {
        return this.localShowRedDot;
    }

    public final int getPrivilegeId() {
        return this.privilegeId;
    }

    @NotNull
    public final String getPrivilegeName() {
        return this.privilegeName;
    }

    /* JADX INFO: renamed from: isHighlight, reason: from getter */
    public final boolean getIsHighlight() {
        return this.isHighlight;
    }

    public final void setHighlight(boolean z) {
        this.isHighlight = z;
    }

    public final void setImgUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imgUrl = str;
    }

    public final void setLocalShowRedDot(@NotNull o0O00O<Boolean> o0o00o2) {
        Intrinsics.checkNotNullParameter(o0o00o2, "<set-?>");
        this.localShowRedDot = o0o00o2;
    }

    public final void setPrivilegeId(int i) {
        this.privilegeId = i;
    }

    public final void setPrivilegeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.privilegeName = str;
    }
}
