package p650o0ooo;

import android.content.Context;
import android.view.View;
import androidx.media3.session.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000O;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.view.CrossRecyclerView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.l;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO0O0 extends Lambda implements Function1<List<GifListJson>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO0Oo00 f59072OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO0O0(oOO0Oo00 ooo0oo00) {
        super(1);
        this.f59072OooO0Oo = ooo0oo00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<GifListJson> list) {
        List<GifListJson> list2 = list;
        if (list2 != null && list2.size() > 0) {
            int size = list2.size();
            oOO0Oo00 ooo0oo00 = this.f59072OooO0Oo;
            if (size > 1) {
                CrossRecyclerView rvEmojiPanelContent = ooo0oo00.f58976OooOO0O.f44103OooO0O0;
                Intrinsics.checkNotNullExpressionValue(rvEmojiPanelContent, "rvEmojiPanelContent");
                o000O.OooOOOO(rvEmojiPanelContent);
                l lVar = ooo0oo00.f58976OooOO0O;
                View vSplitLine = lVar.f44105OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(vSplitLine, "vSplitLine");
                o000O.OooOOOO(vSplitLine);
                RecyclerView rvEmojiPanelTable = lVar.f44104OooO0OO;
                Intrinsics.checkNotNullExpressionValue(rvEmojiPanelTable, "rvEmojiPanelTable");
                o000O.OooOOOO(rvEmojiPanelTable);
                oOO0Oo00.OooOO0(ooo0oo00, list2);
                Context context = ooo0oo00.f58507OooO0Oo;
                rvEmojiPanelTable.setLayoutManager(new FixLinearLayoutManager(context, 0));
                oOO0Oo00.OooO0O0 oooO0O0 = new oOO0Oo00.OooO0O0(ooo0oo00, context, list2);
                ooo0oo00.f58979OooOOO0 = oooO0O0;
                rvEmojiPanelTable.setAdapter(oooO0O0);
                oOO0Oo00.OooO0O0 oooO0O1 = ooo0oo00.f58979OooOOO0;
                if (oooO0O1 != null) {
                    oooO0O1.f13176OooO0o = new o00Oo0(ooo0oo00);
                }
            } else if (list2.size() == 1) {
                CrossRecyclerView rvEmojiPanelContent2 = ooo0oo00.f58976OooOO0O.f44103OooO0O0;
                Intrinsics.checkNotNullExpressionValue(rvEmojiPanelContent2, "rvEmojiPanelContent");
                o000O.OooO0O0(rvEmojiPanelContent2);
                l lVar2 = ooo0oo00.f58976OooOO0O;
                View vSplitLine2 = lVar2.f44105OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(vSplitLine2, "vSplitLine");
                o000O.OooO0O0(vSplitLine2);
                RecyclerView rvEmojiPanelTable2 = lVar2.f44104OooO0OO;
                Intrinsics.checkNotNullExpressionValue(rvEmojiPanelTable2, "rvEmojiPanelTable");
                o000O.OooO0O0(rvEmojiPanelTable2);
                oOO0Oo00.OooOO0(ooo0oo00, list2);
            }
        }
        return Unit.INSTANCE;
    }
}
