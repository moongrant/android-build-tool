package p435o0OoOOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class o0O0o {
    public static final int $stable = 8;
    public static final int Account_Has_Deleted = 99909;
    public static final int Account_Suspension = 999004;
    public static final int Coin_Frozen = 999002;
    public static final int Coin_NotEnough = 999005;
    public static final int Coin_NotEnough_QuickRecharge = 9990050;

    @NotNull
    public static final OooO00o Companion = new OooO00o();
    public static final int Create_Room_Tips = 999008;
    public static final int Crystal_Frozen = 999003;
    public static final int Crystal_NotEnough = 999006;
    public static final int Device_Suspension = 999007;
    public static final int Friend_Has_This_Theme = 99911;
    public static final int He_Is_Not_Your_Friend = 99910;
    public static final int Other_Device_Login = 999001;
    private final int code;

    @NotNull
    private String message;

    public static final class OooO00o {
    }

    public o0O0o(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    @NotNull
    public String toString() {
        return "CommonError(code=" + this.code + ", message='" + this.message + "')";
    }

    public /* synthetic */ o0O0o(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str);
    }
}
