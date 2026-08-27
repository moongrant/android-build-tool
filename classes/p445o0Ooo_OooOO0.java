package p445o0Ooo;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.MyOutFitPageTypeChild;
import com.yalla.yalla.model.MyOutFitPageTypeNameId;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.model.vip.VipOfferModel;
import com.yalla.yalla.model.vip.VipPopUpModel;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface OooOO0 {

    public static final class OooO00o {
        public static /* synthetic */ void OooO0O0(OooOO0 oooOO1, MyOutFitPageTypeNameId myOutFitPageTypeNameId, MyOutFitPageTypeChild myOutFitPageTypeChild, int i) {
            if ((i & 1) != 0) {
                myOutFitPageTypeNameId = MyOutFitPageTypeNameId.EntryEffect;
            }
            if ((i & 2) != 0) {
                myOutFitPageTypeChild = null;
            }
            oooOO1.OooOOoo(myOutFitPageTypeNameId, myOutFitPageTypeChild);
        }

        public static /* synthetic */ void OooO0OO(OooOO0 oooOO1, VipLevel vipLevel, int i) {
            if ((i & 1) != 0) {
                vipLevel = VipLevel.Vip0;
            }
            oooOO1.OooOOo0(vipLevel, (i & 2) == 0, (i & 4) != 0 ? null : 1);
        }
    }

    void OooO(@NotNull Context context, @NotNull UserInfoModel userInfoModel);

    void OooO00o(@NotNull AppCompatActivity appCompatActivity);

    @Composable
    void OooO0O0(@NotNull MutableState<Boolean> mutableState, @Nullable Composer composer, int i);

    void OooO0OO();

    void OooO0Oo(long j);

    void OooO0o(@NotNull Context context, @NotNull PremiumLevel premiumLevel);

    void OooO0o0(long j, boolean z);

    void OooO0oO();

    void OooO0oo(@Nullable String str, boolean z, boolean z2);

    @Composable
    void OooOO0(@NotNull VipPopUpModel vipPopUpModel, @Nullable Composer composer, int i);

    @Composable
    void OooOO0O(@NotNull VipOfferModel vipOfferModel, @Nullable Composer composer, int i);

    @Nullable
    Unit OooOO0o(@NotNull String str);

    void OooOOO(@NotNull String str);

    void OooOOO0();

    @Composable
    void OooOOOO(@NotNull MutableState<Boolean> mutableState, @Nullable Composer composer, int i);

    void OooOOOo();

    @Composable
    void OooOOo(@NotNull VipPopUpModel vipPopUpModel, @Nullable Composer composer, int i);

    void OooOOo0(@NotNull VipLevel vipLevel, boolean z, @Nullable Integer num);

    void OooOOoo(@NotNull MyOutFitPageTypeNameId myOutFitPageTypeNameId, @Nullable MyOutFitPageTypeChild myOutFitPageTypeChild);

    void OooOo(int i);

    void OooOo0(@NotNull Activity activity);

    void OooOo00(long j);

    void OooOo0O(@NotNull Context context);

    void OooOo0o();
}
