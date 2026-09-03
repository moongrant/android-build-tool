package p588o0oOooOo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.yalla.yalla.model.BadgePersonal;
import com.yalla.yalla.model.BadgeRankDataModel;
import com.yalla.yalla.model.BadgeRankModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class a3 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f57073OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public BadgePersonal f57075OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public BadgePersonal f57076OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public BadgePersonal f57077OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public BadgePersonal f57078OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<BadgePersonal> f57074OooO0O0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f57079OooO0oO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f57080OooO0oo = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f57072OooO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f57081OooOO0 = new MutableLiveData<>();

    public static final BadgePersonal OooO0O0(a3 a3Var, ApiResult apiResult) {
        a3Var.getClass();
        if (apiResult.getData() != null) {
            Object data = apiResult.getData();
            Intrinsics.checkNotNull(data);
            BadgeRankModel badgeRankModel = (BadgeRankModel) data;
            if (badgeRankModel.getData() != null) {
                List<BadgeRankDataModel> data2 = badgeRankModel.getData();
                Intrinsics.checkNotNull(data2);
                if (data2.size() > 0) {
                    return new BadgePersonal(badgeRankModel.getRank(), badgeRankModel.getSumStars(), badgeRankModel.getCopperNum(), badgeRankModel.getSilverNum(), badgeRankModel.getGoldNum(), badgeRankModel.getDiamondNum(), badgeRankModel.isOpenDiamondMedal());
                }
            }
        }
        return null;
    }
}
