package p561o0oOOooo;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.MixedRoomMicView;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.chad.library.adapter.base.OooO00o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o000 extends OooO0OO<RoomLoginInformation.MIC> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f44912OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomMicView.OooO0OO f44913OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o000(List<RoomLoginInformation.MIC> list, oOo000Oo ooo000oo, MixedRoomMicView.OooO0OO oooO0OO, MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, list);
        this.f44912OooO00o = ooo000oo;
        this.f44913OooO0O0 = oooO0OO;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        RoomLoginInformation.MIC mic = (RoomLoginInformation.MIC) obj;
        if (oooO0o == null) {
            return;
        }
        int layoutPosition = oooO0o.getLayoutPosition();
        View view = oooO0o.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.app.base.mixedroom.MixedRoomMicView");
        MixedRoomMicView mixedRoomMicView = (MixedRoomMicView) view;
        MixedRoomMicView.OooO0OO oooO0OO = this.f44913OooO0O0;
        mixedRoomMicView.f11810Oooo0oO = layoutPosition;
        mixedRoomMicView.f11819OoooOo0 = oooO0OO;
        mixedRoomMicView.setMicInformation(mic);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new OooO0o(new MixedRoomMicView(this.f44912OooO00o.f44923OooO0O0));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final OooO00o onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new OooO0o(new MixedRoomMicView(this.f44912OooO00o.f44923OooO0O0));
    }
}
