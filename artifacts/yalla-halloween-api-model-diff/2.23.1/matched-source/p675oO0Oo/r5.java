package p675oO0Oo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000000;
import com.code.android.util.o000O;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.fragment.room.RoomThemeStoreFragment;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o000000O;
import o0OOo000.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.s;
import p565o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nThemePreviewDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemePreviewDialog.kt\ncom/yalla/yalla/ui/dialog/ThemePreviewDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n1#2:283\n1855#3,2:284\n*S KotlinDebug\n*F\n+ 1 ThemePreviewDialog.kt\ncom/yalla/yalla/ui/dialog/ThemePreviewDialog\n*L\n258#1:284,2\n*E\n"})
public final class r5 extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Function1<ThemeModel, Unit> f59931OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Function1<ThemeModel, Unit> f59932OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public p5 f59933OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final s f59934OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f59935OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f59936OooOOOo;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f59937OooO0Oo;

        public OooO00o(n5 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f59937OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f59937OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f59937OooO0Oo;
        }

        public final int hashCode() {
            return this.f59937OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59937OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(@NotNull FragmentActivity context, @NotNull RoomThemeStoreFragment.OooOo sendListener, @NotNull RoomThemeStoreFragment.Oooo000 purchaseListener) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendListener, "sendListener");
        Intrinsics.checkNotNullParameter(purchaseListener, "purchaseListener");
        this.f59931OooOO0O = sendListener;
        this.f59932OooOO0o = purchaseListener;
        s sVarInflate = s.inflate(LayoutInflater.from(context), this.f59573OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(sVarInflate, "inflate(...)");
        this.f59934OooOOO0 = sVarInflate;
        this.f59936OooOOOo = new ArrayList();
        Window window = this.f59575OooO0oO;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            window.setAttributes(attributes);
        }
        ConstraintLayout constraintLayout = sVarInflate.f45444OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window2 = this.f59574OooO0o0.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.6f);
        }
        sVarInflate.f45444OooO00o.setOnClickListener(new View.OnClickListener() { // from class: oO0Oo.l5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r5 this$0 = this.f59351OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
        int i = o0OO00O.room_item_theme_preview_dialog;
        Context context2 = this.f59572OooO0Oo;
        p5 p5Var = new p5(this, context2, i);
        this.f59933OooOOO = p5Var;
        p5Var.f13190OooO0oo = new o000000O(this);
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(context2, 0);
        RecyclerView recyclerView = sVarInflate.f45447OooO0Oo;
        recyclerView.setLayoutManager(fixLinearLayoutManager);
        new o000000().attachToRecyclerView(recyclerView);
        p5 p5Var2 = this.f59933OooOOO;
        if (p5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            p5Var2 = null;
        }
        recyclerView.setAdapter(p5Var2);
        recyclerView.addOnScrollListener(new q5(this));
        sVarInflate.f45445OooO0O0.setOnClickListener(this);
        sVarInflate.f45446OooO0OO.setOnClickListener(this);
    }

    @Override // p675oO0Oo.o0oO0Ooo
    public final void OooO0Oo() {
        for (OooO0O0 oooO0O0 : this.f59936OooOOOo) {
            oooO0O0.OooO0O0();
            o0OOo000.OooO00o oooO00o = oooO0O0.f43006OooO00o;
            if (oooO00o != null) {
                oooO00o.release();
            }
            oooO0O0.f43006OooO00o = null;
        }
    }

    @Override // p675oO0Oo.o0oO0Ooo
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        s sVar = this.f59934OooOOO0;
        boolean zAreEqual = Intrinsics.areEqual(view, sVar.f45445OooO0O0);
        RecyclerView recyclerView = sVar.f45447OooO0Oo;
        p5 p5Var = null;
        boolean z = false;
        if (zAreEqual) {
            p5 p5Var2 = this.f59933OooOOO;
            if (p5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                p5Var = p5Var2;
            }
            int size = p5Var.f13200OooOOoo.size();
            int i = this.f59935OooOOOO;
            int i2 = i - 1;
            if (i2 >= 0 && i2 < size) {
                z = true;
            }
            if (z) {
                recyclerView.smoothScrollToPosition(i - 1);
                this.f59935OooOOOO--;
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(view, sVar.f45446OooO0OO)) {
            OooO0O0();
            return;
        }
        p5 p5Var3 = this.f59933OooOOO;
        if (p5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            p5Var = p5Var3;
        }
        int size2 = p5Var.f13200OooOOoo.size();
        int i3 = this.f59935OooOOOO + 1;
        if (i3 >= 0 && i3 < size2) {
            z = true;
        }
        if (z) {
            recyclerView.smoothScrollToPosition(i3);
            this.f59935OooOOOO++;
        }
    }

    public final void OooOO0() {
        s sVar = this.f59934OooOOO0;
        ImageView imageView = sVar.f45445OooO0O0;
        int i = this.f59935OooOOOO;
        Intrinsics.checkNotNull(imageView);
        if (i == 0) {
            o000O.OooO0O0(imageView);
        } else {
            o000O.OooOOOO(imageView);
        }
        int i2 = this.f59935OooOOOO;
        p5 p5Var = this.f59933OooOOO;
        if (p5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            p5Var = null;
        }
        int size = p5Var.f13200OooOOoo.size() - 1;
        ImageView imageView2 = sVar.f45446OooO0OO;
        Intrinsics.checkNotNull(imageView2);
        if (i2 == size) {
            o000O.OooO0O0(imageView2);
        } else {
            o000O.OooOOOO(imageView2);
        }
    }
}
