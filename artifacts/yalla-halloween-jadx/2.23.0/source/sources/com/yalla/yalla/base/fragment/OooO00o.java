package com.yalla.yalla.base.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.squareup.okhttp.OooOo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p399o0Oo0O0O.o00O0O;
import p399o0Oo0O0O.o0OoOo0;
import p418o0OoO000.Oooo000;
import p466o0Oooo0o.oo00o;
import p539o0o0OoOO.z0;
import p629o0ooO0O0.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b1\u00102J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u0013\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001JC\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\rH\u0014J\b\u0010\u001a\u001a\u00020\u0006H\u0014J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\u0016\u0010\u001e\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cH\u0017J\u0016\u0010\u001f\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cH\u0017J\u0010\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\"H\u0016J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\"H\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/yalla/yalla/base/fragment/OooO00o;", "Lcom/yalla/yalla/base/fragment/OooO0OO;", "Landroid/view/View$OnClickListener;", "Lo0OoO000/Oooo000;", "Lo0ooO0O0/o00000OO;", "Lo0Oo0O0O/o00O0O;", "", "clearComposeDialogCache", "Landroid/app/Activity;", "activity", "initDialogProxy", "", ViewHierarchyConstants.TAG_KEY, "", "removeComposeDialog", "Lkotlin/Function1;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/Composable;", "content", "showDialog", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;)Landroidx/compose/runtime/MutableState;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "isTrueVisibleToUser", "onTrueVisibleChanged", "onLazyInit", "onDestroy", "Lo0OoO000/OooOo;", "msg", "onEvent", "onEventMainThread", "", "id", "Landroid/view/View;", "findViewByIdNoClick", "findViewByIdOnClick", "Lo0Oooo0o/oo00o;", "getNoDoubleClickListener", ViewHierarchyConstants.VIEW_KEY, "onClickNotDouble", "v", "onClick", "rootView", "Landroid/view/View;", "isLazyInitialized", "Z", "mNoDoubleClickListener", "Lo0Oooo0o/oo00o;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public class OooO00o extends OooO0OO implements View.OnClickListener, Oooo000, o00000OO, o00O0O {
    public static final int $stable = 8;
    private boolean isLazyInitialized;

    @JvmField
    @Nullable
    public View rootView;
    private final /* synthetic */ o0OoOo0 $$delegate_0 = new o0OoOo0();

    @NotNull
    private final oo00o mNoDoubleClickListener = new C0286OooO00o();

    /* JADX INFO: renamed from: com.yalla.yalla.base.fragment.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0286OooO00o extends oo00o {
        public C0286OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            OooO00o.this.onClickNotDouble(view);
        }
    }

    public void clearComposeDialogCache() {
        this.$$delegate_0.f44425OooO0o0.f44420OooO00o.clear();
    }

    @NotNull
    public View findViewByIdNoClick(int id) {
        View viewOooO00o = z0.OooO00o(this.rootView, id, null);
        Intrinsics.checkNotNullExpressionValue(viewOooO00o, "findViewClick(rootView, id, null)");
        return viewOooO00o;
    }

    @NotNull
    public View findViewByIdOnClick(int id) {
        View viewOooO00o = z0.OooO00o(this.rootView, id, getMNoDoubleClickListener());
        Intrinsics.checkNotNullExpressionValue(viewOooO00o, "findViewClick(rootView, id, noDoubleClickListener)");
        return viewOooO00o;
    }

    @NotNull
    /* JADX INFO: renamed from: getNoDoubleClickListener, reason: from getter */
    public oo00o getMNoDoubleClickListener() {
        return this.mNoDoubleClickListener;
    }

    public void initDialogProxy(@Nullable Activity activity) {
        this.$$delegate_0.f44424OooO0Oo = activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.mNoDoubleClickListener.onClick(v);
    }

    @Override // p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        OooOo.OooO0Oo(this);
        initDialogProxy(getActivity());
        super.onCreate(savedInstanceState);
    }

    @Override // com.yalla.yalla.base.fragment.OooO0OO, androidx.fragment.app.Fragment
    public void onDestroy() {
        OooOo.OooO0o0(this);
        super.onDestroy();
        clearComposeDialogCache();
    }

    @Override // p418o0OoO000.Oooo000
    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(@Nullable p418o0OoO000.OooOo<?> msg) {
    }

    @Override // p418o0OoO000.Oooo000
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(@Nullable p418o0OoO000.OooOo<?> msg) {
    }

    public void onLazyInit() {
    }

    @Override // com.yalla.yalla.base.fragment.OooO0OO
    public void onTrueVisibleChanged(boolean isTrueVisibleToUser) {
        super.onTrueVisibleChanged(isTrueVisibleToUser);
        if (!isTrueVisibleToUser || this.isLazyInitialized) {
            return;
        }
        onLazyInit();
        this.isLazyInitialized = true;
    }

    public boolean removeComposeDialog(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.$$delegate_0.OooO00o(tag);
    }

    @Override // p399o0Oo0O0O.o00O0O
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Nullable
    public MutableState<Boolean> showDialog(@Nullable String tag, @NotNull Function3<? super MutableState<Boolean>, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return this.$$delegate_0.showDialog(tag, content);
    }
}
