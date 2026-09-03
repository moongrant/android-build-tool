package p507o0o00oo;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.TopRankHeaderModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p554o0oOOoOo.oO0OOO00;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class Oooo0 extends oO0OOO00<Integer[]> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<TopRankHeaderModel> f50606OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final List<Integer[]> f50607OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(@Nullable Context context, @NotNull List<Integer[]> imageArray, @NotNull MutableState<TopRankHeaderModel> rankModel) {
        super(oo0o0Oo.recommend_top_rank_banner_view, context, imageArray);
        Intrinsics.checkNotNullParameter(imageArray, "imageArray");
        Intrinsics.checkNotNullParameter(rankModel, "rankModel");
        this.f50607OooO0o0 = imageArray;
        this.f50606OooO0o = rankModel;
    }
}
