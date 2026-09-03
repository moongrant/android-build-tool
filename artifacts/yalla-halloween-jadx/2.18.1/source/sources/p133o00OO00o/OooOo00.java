package p133o00OO00o;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f31240Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f31241OoooO00;

    public OooOo00(OooOOOO oooOOOO, int i) {
        this.f31240Oooo = oooOOOO;
        this.f31241OoooO00 = i;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        LiveEventBus.get("EXPLORE_TAGS_DATA").post(this.f31240Oooo.f31223OooO00o);
        ExploreTagRoomListActivity.OooO00o oooO00o = ExploreTagRoomListActivity.f22818Ooooooo;
        Context context = this.f31240Oooo.f31224OooO0O0;
        Intrinsics.checkNotNull(context);
        String str = this.f31240Oooo.f31223OooO00o.get(this.f31241OoooO00).id;
        Intrinsics.checkNotNullExpressionValue(str, "data[position].id");
        int iOooO0Oo = OooO.OooO0Oo(str, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) ExploreTagRoomListActivity.class);
        intent.putExtra("TAG_ID", iOooO0Oo);
        context.startActivity(intent);
    }
}
