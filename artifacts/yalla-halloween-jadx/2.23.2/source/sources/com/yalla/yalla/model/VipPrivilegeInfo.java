package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o000oOoO;
import p414o0Oo0oO.oOo00OO0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/model/VipPrivilegeInfo;", "", "()V", "identId", "", "getIdentId", "()I", "imgUrl", "", "getImgUrl", "()Ljava/lang/String;", "privilegeName", "getPrivilegeName", "privilegeRemark", "getPrivilegeRemark", "privilegeid", "getPrivilegeid", "shopId", "getShopId", "state", "getState", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VipPrivilegeInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MomentEditId = 30;
    private final int identId;

    @NotNull
    private final String imgUrl = "";

    @NotNull
    private final String privilegeName = "";

    @NotNull
    private final String privilegeRemark = "";
    private final int privilegeid;
    private final int shopId;
    private final int state;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J \u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/VipPrivilegeInfo$Companion;", "", "()V", "MomentEditId", "", "isShowRedDot", "", "id", "setShowRedDot", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public final boolean isShowRedDot(int id) {
            if (id != 30) {
                return false;
            }
            oOo00OO0 ooo00oo0OooOO0O = o00Ooo.OooOO0O();
            ooo00oo0OooOO0O.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Object value = o0O00oO0.OooOOo0().getValue();
            StringBuilder sb = new StringBuilder("premiumRedDot_MomentEdit_Hide4Fragment");
            sb.append(value);
            return !ooo00oo0OooOO0O.OooO0O0(sb.toString(), false);
        }

        public final void setShowRedDot(int id, @Nullable Function0<Unit> listener) {
            if (id == 30) {
                oOo00OO0 ooo00oo0OooOO0O = o00Ooo.OooOO0O();
                ooo00oo0OooOO0O.getClass();
                o000oOoO.OooO0OO("premiumRedDot_MomentEdit_Hide4Fragment", o0O00oO0.OooOOo0().getValue(), ooo00oo0OooOO0O, true);
                if (listener != null) {
                    listener.invoke();
                }
            }
        }
    }

    public final int getIdentId() {
        return this.identId;
    }

    @NotNull
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @NotNull
    public final String getPrivilegeName() {
        return this.privilegeName;
    }

    @NotNull
    public final String getPrivilegeRemark() {
        return this.privilegeRemark;
    }

    public final int getPrivilegeid() {
        return this.privilegeid;
    }

    public final int getShopId() {
        return this.shopId;
    }

    public final int getState() {
        return this.state;
    }
}
