package p176o00OoooO;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p162o00OoOOo.o0O00o0;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p497o0o00Oo.OooOOO0;
import p649o0ooOOoo.j8;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oO00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final j8 f32851OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ViewGroup f32852OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f32853OooO0OO;

    public oO00Oo0(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        j8 j8VarInflate = j8.inflate(context.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(j8VarInflate, "inflate(context.layoutInflater)");
        this.f32851OooO00o = j8VarInflate;
        View decorView = context.getWindow().getDecorView();
        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f32852OooO0O0 = (ViewGroup) decorView;
        j8VarInflate.f49728OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o00OoooO.oO00OOo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oO00Oo0 this$0 = this.f32850Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO00o();
            }
        });
        j8VarInflate.f49726OooO00o.setOnClickListener(o0O00o0.f32504Oooo0o);
        LinearLayout linearLayout = j8VarInflate.f49729OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llContent");
        oOO00O.OooO0O0(linearLayout);
    }

    public final void OooO00o() {
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        OooOOO0.OooO0o0().OooOOOo(false);
        o0O00000.OooO0OO("Language_got_it");
        FrameLayout frameLayout = this.f32851OooO00o.f49726OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.root");
        oOO00O.OooO0O0(frameLayout);
        this.f32852OooO0O0.removeView(this.f32851OooO00o.f49726OooO00o);
    }
}
