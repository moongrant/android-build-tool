package p609o0oo0O0o;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.BadgePersonal;
import com.yalla.yalla.model.BadgeRankDataModel;
import com.yalla.yalla.model.BadgeRankModel;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O00 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f48344OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public BadgePersonal f48346OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public BadgePersonal f48347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public BadgePersonal f48348OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public BadgePersonal f48349OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<BadgePersonal> f48345OooO0O0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f48350OooO0oO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f48351OooO0oo = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f48343OooO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f48352OooOO0 = new MutableLiveData<>();

    public static final BadgePersonal OooO0O0(o00O00 o00o01, ApiResult apiResult) {
        Objects.requireNonNull(o00o01);
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
