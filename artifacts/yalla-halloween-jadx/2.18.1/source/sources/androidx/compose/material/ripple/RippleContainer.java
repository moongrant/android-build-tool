package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p035OoooOO0.o00000OO;
import p048OoooooO.o0oOO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0})
public final class RippleContainer extends ViewGroup {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final o00000OO f5948Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f5949Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final List<RippleHostView> f5950Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final List<RippleHostView> f5951Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f5952OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5949Oooo0o = 5;
        ArrayList arrayList = new ArrayList();
        this.f5950Oooo0oO = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f5951Oooo0oo = arrayList2;
        this.f5948Oooo = new o00000OO();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f5952OoooO00 = 1;
        setTag(o0oOO.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
