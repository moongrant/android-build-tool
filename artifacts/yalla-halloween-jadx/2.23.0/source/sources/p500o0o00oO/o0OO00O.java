package p500o0o00oO;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.TopRankHeaderModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p540o0o0OoOo.s3;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OO00O extends s3<Integer[]> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<TopRankHeaderModel> f49430OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final List<Integer[]> f49431OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(@Nullable Context context, @NotNull List<Integer[]> imageArray, @NotNull MutableState<TopRankHeaderModel> rankModel) {
        super(oO00OO0O.recommend_top_rank_banner_view, context, imageArray);
        Intrinsics.checkNotNullParameter(imageArray, "imageArray");
        Intrinsics.checkNotNullParameter(rankModel, "rankModel");
        this.f49431OooO0o0 = imageArray;
        this.f49430OooO0o = rankModel;
    }
}
