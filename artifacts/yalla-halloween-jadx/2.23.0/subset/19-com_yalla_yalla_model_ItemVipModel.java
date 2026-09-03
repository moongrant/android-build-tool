package com.yalla.yalla.model;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O000;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000OO;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/model/ItemVipModel;", "", "()V", "imgUrl", "", "getImgUrl", "()Ljava/lang/String;", "setImgUrl", "(Ljava/lang/String;)V", "isHighlight", "", "()Z", "setHighlight", "(Z)V", "localShowRedDot", "Landroidx/compose/runtime/MutableState;", "getLocalShowRedDot", "()Landroidx/compose/runtime/MutableState;", "setLocalShowRedDot", "(Landroidx/compose/runtime/MutableState;)V", "privilegeId", "", "getPrivilegeId", "()I", "setPrivilegeId", "(I)V", "privilegeName", "getPrivilegeName", "setPrivilegeName", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ItemVipModel {
    private static final int CustomRoomTheme_Id = 18;
    private static final int CustomUserPrettyId_Id = 24;
    private static final int ExclusiveBackpackGift_Id = 21;
    private static final int ExclusiveBubble_Id = 19;
    private static final int ExclusiveGiftRunway_Id = 22;
    private static final int IncognitoAccess_Id = 20;
    private static final int LuckyPacketSend_Id = 23;
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
    private MutableState<Boolean> localShowRedDot = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/ItemVipModel$Companion;", "", "()V", "CustomRoomTheme_Id", "", "CustomUserPrettyId_Id", "ExclusiveBackpackGift_Id", "ExclusiveBubble_Id", "ExclusiveGiftRunway_Id", "IncognitoAccess_Id", "LuckyPacketSend_Id", "isShowRedDot", "", "id", "setShowRedDot", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        /* JADX WARN: Code duplicated, block: B:25:0x0119 A[ORIG_RETURN, RETURN] */
        public final boolean isShowRedDot(int id) {
            switch (id) {
                case 18:
                    o00000OO o00000ooOooOO0O = o00Oo0.OooOO0O();
                    o00000ooOooOO0O.getClass();
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    if (o00000ooOooOO0O.OooO0O0("vipRedDot_CustomRoomTheme_Hide4Fragment" + o000000O.OooOOo0().getValue(), false)) {
                        return false;
                    }
                    return true;
                case 19:
                    o00000OO o00000ooOooOO0O2 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O2.getClass();
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    if (o00000ooOooOO0O2.OooO0O0("vipRedDot_ExclusiveBubble_Hide4Fragment" + o000000O.OooOOo0().getValue(), false)) {
                        return false;
                    }
                    return true;
                case 20:
                    o00000OO o00000ooOooOO0O3 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O3.getClass();
                    o000000O o000000o4 = o000000O.f46674OooO00o;
                    if (o00000ooOooOO0O3.OooO0O0("vipRedDot_IncognitoAccess_Hide4Fragment" + o000000O.OooOOo0().getValue(), false)) {
                        return false;
                    }
                    return true;
                case 21:
                    o00000OO o00000ooOooOO0O4 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O4.getClass();
                    o000000O o000000o5 = o000000O.f46674OooO00o;
                    if (o00000ooOooOO0O4.OooO0O0("vipRedDot_ExclusiveBackpackGift_Hide4Fragment" + o000000O.OooOOo0().getValue(), false)) {
                        return false;
                    }
                    return true;
                case 22:
                    o00000OO o00000ooOooOO0O5 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O5.getClass();
                    o000000O o000000o6 = o000000O.f46674OooO00o;
                    if (o00000ooOooOO0O5.OooO0O0("vipRedDot_ExclusiveGiftRunway_Hide4Fragment" + o000000O.OooOOo0().getValue(), false)) {
                        return false;
                    }
                    return true;
                case 23:
                    o00000OO o00000ooOooOO0O6 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O6.getClass();
                    o000000O o000000o7 = o000000O.f46674OooO00o;
                    if (o00000ooOooOO0O6.OooO0O0("vipRedDot_LuckyPacketSend_Hide4Fragment" + o000000O.OooOOo0().getValue(), false)) {
                        return false;
                    }
                    return true;
                case 24:
                    o00000OO o00000ooOooOO0O7 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O7.getClass();
                    o000000O o000000o8 = o000000O.f46674OooO00o;
                    if (o00000ooOooOO0O7.OooO0O0("vipRedDot_CustomUserPrettyId_Hide4Fragment" + o000000O.OooOOo0().getValue(), false)) {
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
                    o00000OO o00000ooOooOO0O = o00Oo0.OooOO0O();
                    o00000ooOooOO0O.getClass();
                    o00O000.OooO0O0("vipRedDot_CustomRoomTheme_Hide4Fragment", o000000O.OooOOo0().getValue(), o00000ooOooOO0O, true);
                    if (listener != null) {
                        listener.invoke();
                    }
                    break;
                case 19:
                    o00000OO o00000ooOooOO0O2 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O2.getClass();
                    o00O000.OooO0O0("vipRedDot_ExclusiveBubble_Hide4Fragment", o000000O.OooOOo0().getValue(), o00000ooOooOO0O2, true);
                    if (listener != null) {
                        listener.invoke();
                    }
                    break;
                case 20:
                    o00000OO o00000ooOooOO0O3 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O3.getClass();
                    o00O000.OooO0O0("vipRedDot_IncognitoAccess_Hide4Fragment", o000000O.OooOOo0().getValue(), o00000ooOooOO0O3, true);
                    if (listener != null) {
                        listener.invoke();
                    }
                    break;
                case 21:
                    o00000OO o00000ooOooOO0O4 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O4.getClass();
                    o00O000.OooO0O0("vipRedDot_ExclusiveBackpackGift_Hide4Fragment", o000000O.OooOOo0().getValue(), o00000ooOooOO0O4, true);
                    if (listener != null) {
                        listener.invoke();
                    }
                    break;
                case 22:
                    o00000OO o00000ooOooOO0O5 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O5.getClass();
                    o00O000.OooO0O0("vipRedDot_ExclusiveGiftRunway_Hide4Fragment", o000000O.OooOOo0().getValue(), o00000ooOooOO0O5, true);
                    if (listener != null) {
                        listener.invoke();
                    }
                    break;
                case 23:
                    o00000OO o00000ooOooOO0O6 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O6.getClass();
                    o00O000.OooO0O0("vipRedDot_LuckyPacketSend_Hide4Fragment", o000000O.OooOOo0().getValue(), o00000ooOooOO0O6, true);
                    if (listener != null) {
                        listener.invoke();
                    }
                    break;
                case 24:
                    o00000OO o00000ooOooOO0O7 = o00Oo0.OooOO0O();
                    o00000ooOooOO0O7.getClass();
                    o00O000.OooO0O0("vipRedDot_CustomUserPrettyId_Hide4Fragment", o000000O.OooOOo0().getValue(), o00000ooOooOO0O7, true);
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
    public final MutableState<Boolean> getLocalShowRedDot() {
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

    public final void setLocalShowRedDot(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.localShowRedDot = mutableState;
    }

    public final void setPrivilegeId(int i) {
        this.privilegeId = i;
    }

    public final void setPrivilegeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.privilegeName = str;
    }
}
