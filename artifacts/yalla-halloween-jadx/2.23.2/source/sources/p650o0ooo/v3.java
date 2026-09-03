package p650o0ooo;

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
import o000O00O.o000000;
import o0OOo000.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.r;
import p492o0o00OO0.o0O0oo00;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nThemePreviewDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemePreviewDialog.kt\ncom/yalla/yalla/ui/dialog/ThemePreviewDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n1#2:283\n1855#3,2:284\n*S KotlinDebug\n*F\n+ 1 ThemePreviewDialog.kt\ncom/yalla/yalla/ui/dialog/ThemePreviewDialog\n*L\n258#1:284,2\n*E\n"})
public final class v3 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Function1<ThemeModel, Unit> f59182OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Function1<ThemeModel, Unit> f59183OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public t3 f59184OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final r f59185OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f59186OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f59187OooOOOo;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f59188OooO0Oo;

        public OooO00o(r3 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f59188OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f59188OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f59188OooO0Oo;
        }

        public final int hashCode() {
            return this.f59188OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59188OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(@NotNull FragmentActivity context, @NotNull RoomThemeStoreFragment.OooOo sendListener, @NotNull RoomThemeStoreFragment.Oooo000 purchaseListener) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendListener, "sendListener");
        Intrinsics.checkNotNullParameter(purchaseListener, "purchaseListener");
        this.f59182OooOO0O = sendListener;
        this.f59183OooOO0o = purchaseListener;
        r rVarInflate = r.inflate(LayoutInflater.from(context), this.f58508OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(rVarInflate, "inflate(...)");
        this.f59185OooOOO0 = rVarInflate;
        this.f59187OooOOOo = new ArrayList();
        Window window = this.f58510OooO0oO;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            window.setAttributes(attributes);
        }
        ConstraintLayout constraintLayout = rVarInflate.f45429OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window2 = this.f58509OooO0o0.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.6f);
        }
        rVarInflate.f45429OooO00o.setOnClickListener(new o0O0oo00(2, this));
        int i = oo0o0Oo.room_item_theme_preview_dialog;
        Context context2 = this.f58507OooO0Oo;
        t3 t3Var = new t3(this, context2, i);
        this.f59184OooOOO = t3Var;
        t3Var.f13179OooO0oo = new o000000(this);
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(context2, 0);
        RecyclerView recyclerView = rVarInflate.f45432OooO0Oo;
        recyclerView.setLayoutManager(fixLinearLayoutManager);
        new androidx.recyclerview.widget.o000000().attachToRecyclerView(recyclerView);
        t3 t3Var2 = this.f59184OooOOO;
        if (t3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            t3Var2 = null;
        }
        recyclerView.setAdapter(t3Var2);
        recyclerView.addOnScrollListener(new u3(this));
        rVarInflate.f45430OooO0O0.setOnClickListener(this);
        rVarInflate.f45431OooO0OO.setOnClickListener(this);
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO0Oo() {
        for (OooO0O0 oooO0O0 : this.f59187OooOOOo) {
            oooO0O0.OooO0O0();
            o0OOo000.OooO00o oooO00o = oooO0O0.f43005OooO00o;
            if (oooO00o != null) {
                oooO00o.release();
            }
            oooO0O0.f43005OooO00o = null;
        }
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        r rVar = this.f59185OooOOO0;
        boolean zAreEqual = Intrinsics.areEqual(view, rVar.f45430OooO0O0);
        RecyclerView recyclerView = rVar.f45432OooO0Oo;
        t3 t3Var = null;
        boolean z = false;
        if (zAreEqual) {
            t3 t3Var2 = this.f59184OooOOO;
            if (t3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                t3Var = t3Var2;
            }
            int size = t3Var.f13189OooOOoo.size();
            int i = this.f59186OooOOOO;
            int i2 = i - 1;
            if (i2 >= 0 && i2 < size) {
                z = true;
            }
            if (z) {
                recyclerView.smoothScrollToPosition(i - 1);
                this.f59186OooOOOO--;
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(view, rVar.f45431OooO0OO)) {
            OooO0O0();
            return;
        }
        t3 t3Var3 = this.f59184OooOOO;
        if (t3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            t3Var = t3Var3;
        }
        int size2 = t3Var.f13189OooOOoo.size();
        int i3 = this.f59186OooOOOO + 1;
        if (i3 >= 0 && i3 < size2) {
            z = true;
        }
        if (z) {
            recyclerView.smoothScrollToPosition(i3);
            this.f59186OooOOOO++;
        }
    }

    public final void OooOO0() {
        r rVar = this.f59185OooOOO0;
        ImageView imageView = rVar.f45430OooO0O0;
        int i = this.f59186OooOOOO;
        Intrinsics.checkNotNull(imageView);
        if (i == 0) {
            o000O.OooO0O0(imageView);
        } else {
            o000O.OooOOOO(imageView);
        }
        int i2 = this.f59186OooOOOO;
        t3 t3Var = this.f59184OooOOO;
        if (t3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            t3Var = null;
        }
        int size = t3Var.f13189OooOOoo.size() - 1;
        ImageView imageView2 = rVar.f45431OooO0OO;
        Intrinsics.checkNotNull(imageView2);
        if (i2 == size) {
            o000O.OooO0O0(imageView2);
        } else {
            o000O.OooOOOO(imageView2);
        }
    }
}
