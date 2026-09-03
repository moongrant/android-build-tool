package p563o0oOo0;

import android.content.Context;
import android.util.SparseIntArray;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.UserDefaultHeadListModel;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p245o00oo0O0.o0O00;
import p254o00ooO0O.oOO00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O000 extends o0O00<o00O000o, OooO00o> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Context f45068OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f45069OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(@NotNull Context context, @Nullable List<o00O000o> list) {
        super(list);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45068OooO0O0 = context;
        this.f45069OooO0OO = -1;
        if (this.f34188OooO00o == null) {
            this.f34188OooO00o = new SparseIntArray();
        }
        this.f34188OooO00o.put(1, R.layout.user_item_head_default_url_title);
        if (this.f34188OooO00o == null) {
            this.f34188OooO00o = new SparseIntArray();
        }
        this.f34188OooO00o.put(2, R.layout.user_item_head_default_url_content);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o helper, Object obj) {
        UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel;
        o00O000o model = (o00O000o) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        int itemViewType = helper.getItemViewType();
        if (itemViewType == 1) {
            String str = model.f45075OooO0OO;
            if (str != null) {
                ((TextView) helper.OooO0Oo(R.id.title)).setText(str);
                return;
            }
            return;
        }
        if (itemViewType == 2 && (userDefaultHeadItemModel = model.f45074OooO0O0) != null) {
            TextView inUse = (TextView) helper.OooO0Oo(R.id.inUse);
            ImageView selected = (ImageView) helper.OooO0Oo(R.id.selected);
            NetImageView netImageView = (NetImageView) helper.OooO0Oo(R.id.head);
            Intrinsics.checkNotNullExpressionValue(selected, "selected");
            oOO00O.OooO0O0(selected);
            if (helper.getLayoutPosition() == this.f45069OooO0OO) {
                oOO00O.OooO(selected);
            }
            Intrinsics.checkNotNullExpressionValue(inUse, "inUse");
            oOO00O.OooO0O0(inUse);
            if (userDefaultHeadItemModel.getIsCurrent()) {
                oOO00O.OooO(inUse);
            }
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f45068OooO0O0);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.f48429OooO0OO = userDefaultHeadItemModel.getUrl();
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(netImageView);
        }
    }
}
