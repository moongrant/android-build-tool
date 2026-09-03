package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u0004R\u001e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentPowerSelectModel;", "Ljava/io/Serializable;", "_power", "", "(I)V", "get_power", "()I", "<set-?>", "", "content", "getContent", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "power", "getPower", "setPower", "resId", "getResId", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentPowerSelectModel implements Serializable {
    public static final int $stable = 8;
    private final int _power;

    @Nullable
    private String content;
    private int power = MomentTypePower.Open.getValue();
    private int resId;
    private boolean select;

    @Nullable
    private String title;

    public MomentPowerSelectModel(int i) {
        this._power = i;
        setPower(i);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final int getPower() {
        return this.power;
    }

    public final int getResId() {
        return this.resId;
    }

    public final boolean getSelect() {
        return this.select;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int get_power() {
        return this._power;
    }

    public final void setPower(int i) {
        if (i == MomentTypePower.Open.getValue()) {
            this.resId = o0O0O00.icon_moment_power_public;
            this.title = o0000.OooO0OO(o000000.Public);
            this.content = o0000.OooO0OO(o000000.All_users);
        } else if (i == MomentTypePower.Friend.getValue()) {
            this.resId = o0O0O00.icon_moment_power_friend;
            this.title = o0000.OooO0OO(o000000.Friends);
            this.content = o0000.OooO0OO(o000000.Friends_in_Yalla);
        } else if (i == MomentTypePower.Self.getValue()) {
            this.resId = o0O0O00.icon_moment_power_private;
            this.title = o0000.OooO0OO(o000000.Private);
            this.content = o0000.OooO0OO(o000000.Only_me);
        }
        this.power = i;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }
}
