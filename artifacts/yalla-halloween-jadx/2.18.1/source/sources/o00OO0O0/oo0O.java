package o00OO0O0;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oo0O extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final RecyclerView f31617OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ImageView f31618OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f31619OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ImageView f31620OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.rvTreasureBox);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.rvTreasureBox)");
        this.f31617OooO0OO = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ivTreasureBox);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.ivTreasureBox)");
        this.f31618OooO0Oo = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.ivTreasureBoxMore);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.ivTreasureBoxMore)");
        this.f31620OooO0o0 = (ImageView) viewFindViewById3;
    }
}
