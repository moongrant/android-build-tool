package p519o0o0O0oO;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000OO00;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.ra;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAchievementBadgeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AchievementBadgeDialog.kt\ncom/yalla/yalla/ui/dialog/AchievementBadgeDialog$initViewBiding$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
public final class o0000OO0 extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000 f52468OooO00o;

    public o0000OO0(o000 o000Var) {
        this.f52468OooO00o = o000Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            RecyclerView.Oooo000 layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            o000 o000Var = this.f52468OooO00o;
            o000Var.f52451OooOOOo = iFindFirstCompletelyVisibleItemPosition;
            ra raVar = o000Var.f52450OooOOOO;
            o0000O o0000o2 = null;
            if (raVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                raVar = null;
            }
            AppCompatImageView onScrollStateChanged$lambda$0 = raVar.f58762OooO0OO;
            int i2 = o000Var.f52451OooOOOo;
            Intrinsics.checkNotNullExpressionValue(onScrollStateChanged$lambda$0, "onScrollStateChanged$lambda$0");
            if (i2 == 0) {
                o000OO00.OooO0O0(onScrollStateChanged$lambda$0);
            } else {
                o000OO00.OooOOOO(onScrollStateChanged$lambda$0);
            }
            ra raVar2 = o000Var.f52450OooOOOO;
            if (raVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                raVar2 = null;
            }
            AppCompatImageView onScrollStateChanged$lambda$1 = raVar2.f58763OooO0Oo;
            int i3 = o000Var.f52451OooOOOo;
            o0000O o0000o3 = o000Var.f52448OooOOO;
            if (o0000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o0000o2 = o0000o3;
            }
            int size = o0000o2.f10111OooOOoo.size() - 1;
            Intrinsics.checkNotNullExpressionValue(onScrollStateChanged$lambda$1, "onScrollStateChanged$lambda$1");
            if (i3 == size) {
                o000OO00.OooO0O0(onScrollStateChanged$lambda$1);
            } else {
                o000OO00.OooOOOO(onScrollStateChanged$lambda$1);
            }
        }
    }
}
