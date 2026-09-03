package p650o0ooo;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000O;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.g2;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAchievementBadgeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AchievementBadgeDialog.kt\ncom/yalla/yalla/ui/dialog/AchievementBadgeDialog$initViewBiding$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
public final class o00000OO extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f58448OooO00o;

    public o00000OO(o0000Ooo o0000ooo) {
        this.f58448OooO00o = o0000ooo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            RecyclerView.Oooo000 layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            o0000Ooo o0000ooo = this.f58448OooO00o;
            o0000ooo.f58473OooOOOo = iFindFirstCompletelyVisibleItemPosition;
            g2 g2Var = o0000ooo.f58472OooOOOO;
            o00000O o00000o = null;
            if (g2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g2Var = null;
            }
            AppCompatImageView appCompatImageView = g2Var.f43876OooO0OO;
            int i2 = o0000ooo.f58473OooOOOo;
            Intrinsics.checkNotNull(appCompatImageView);
            if (i2 == 0) {
                o000O.OooO0O0(appCompatImageView);
            } else {
                o000O.OooOOOO(appCompatImageView);
            }
            g2 g2Var2 = o0000ooo.f58472OooOOOO;
            if (g2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g2Var2 = null;
            }
            AppCompatImageView appCompatImageView2 = g2Var2.f43877OooO0Oo;
            int i3 = o0000ooo.f58473OooOOOo;
            o00000O o00000o2 = o0000ooo.f58470OooOOO;
            if (o00000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o00000o = o00000o2;
            }
            int size = o00000o.f13189OooOOoo.size() - 1;
            Intrinsics.checkNotNull(appCompatImageView2);
            if (i3 == size) {
                o000O.OooO0O0(appCompatImageView2);
            } else {
                o000O.OooOOOO(appCompatImageView2);
            }
        }
    }
}
