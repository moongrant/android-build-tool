package p582o0oOoo0O;

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

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oo0o0O0 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f56748OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public BadgePersonal f56750OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public BadgePersonal f56751OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public BadgePersonal f56752OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public BadgePersonal f56753OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<BadgePersonal> f56749OooO0O0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f56754OooO0oO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f56755OooO0oo = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f56747OooO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BadgeRankDataModel>> f56756OooOO0 = new MutableLiveData<>();

    public static final BadgePersonal OooO0O0(oo0o0O0 oo0o0o0, ApiResult apiResult) {
        oo0o0o0.getClass();
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
